import java.io.*;
import java.net.*;
import java.util.*;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

import javax.net.ssl.*;
import java.security.*;

public class ChatServer {
	protected int serverPort = 8888; //edit (1234)
	protected List<Socket> clients = new ArrayList<Socket>(); // list of clients
	
	//A way to access socket, for private messages
	public static ConcurrentMap<String, Socket> uporabnikVtic = new ConcurrentHashMap<>();

	//A way to access Sockets in Arraylist clients
	public static int index = -1;

	public static void main(String[] args) throws Exception {
		new ChatServer();
	}
	//decrement index, if client disconects, the login would stop working without this function (index issues)
	static void decrementindex(){
		index --;
	}

	public static ConcurrentMap<String, Socket> getConcurrentMap(){
		return uporabnikVtic;
	}

	public ChatServer() throws Exception{
	
		System.setProperty("java.net.preferIPv4Stack", "false");
		System.setProperty("java.net.preferIPv6Addresses", "true");
		ServerSocket serverSocket = null;


		String passphrase = "serverpwd";

		// preberi datoteko z odjemalskimi certifikati
		KeyStore clientKeyStore = KeyStore.getInstance("JKS"); // KeyStore za shranjevanje odjemalčevih javnih ključev (certifikatov)
		clientKeyStore.load(new FileInputStream("clients.public"), "public".toCharArray());

		// preberi datoteko s svojim certifikatom in tajnim ključem
		KeyStore serverKeyStore = KeyStore.getInstance("JKS"); // KeyStore za shranjevanje strežnikovega tajnega in javnega ključa
		serverKeyStore.load(new FileInputStream("server.private"), passphrase.toCharArray());

		// vzpostavi SSL kontekst (komu zaupamo, kakšni so moji tajni ključi in certifikati)
		TrustManagerFactory tmf = TrustManagerFactory.getInstance("SunX509");
		tmf.init(clientKeyStore);
		KeyManagerFactory kmf = KeyManagerFactory.getInstance("SunX509");
		kmf.init(serverKeyStore, passphrase.toCharArray());
		SSLContext sslContext = SSLContext.getInstance("TLS");
		sslContext.init(kmf.getKeyManagers(), tmf.getTrustManagers(), (new SecureRandom()));

		// kreiramo socket
		SSLServerSocketFactory factory = sslContext.getServerSocketFactory();
		ss.setNeedClientAuth(true); // tudi odjemalec se MORA predstaviti s certifikatom
		ss.setEnabledCipherSuites(new String[] {"TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256"});

		
		
		// create socket
		try {
			serverSocket = new ServerSocket(); // create the ServerSocket
			SSLServerSocket ss = (SSLServerSocket) factory.createServerSocket(serverPort);
			//removed (this.serverPort)
			serverSocket.bind(new InetSocketAddress("::0", this.serverPort)); //new
		} catch (Exception e) {
			System.err.println("[system] could not create socket on port " + this.serverPort);
			e.printStackTrace(System.err);
			System.exit(1);
		}

		// start listening for new connections
		System.out.println("[system] listening ...");
		try {
			while (true) {
				Socket newClientSocket = serverSocket.accept(); // wait for a new client connection
				index++;
				synchronized(this) {
					clients.add(newClientSocket); // add client to the list of clients
				}
				ChatServerConnector conn = new ChatServerConnector(this, newClientSocket); // create a new thread for communication with the new client
				conn.start(); // run the new thread
			}
		} catch (Exception e) {
			System.err.println("[error] Accept failed.");
			e.printStackTrace(System.err);
			System.exit(1);
		}

		// close socket
		System.out.println("[system] closing server socket ...");
		try {
			serverSocket.close();
		} catch (IOException e) {
			e.printStackTrace(System.err);
			System.exit(1);
		}
	}

	// send a message to all clients connected to the server
	public void sendToAllClients(String tip, String posiljatelj, String cas, String besedilo) throws Exception {
		Iterator<Socket> i = clients.iterator();
		String msg_send = "";
		if(tip.equals("Prijava")){ // 1. type of message (prijava)
						
			//In case the username already exists
			if(ChatServer.getConcurrentMap().containsKey(posiljatelj)){
				uporabnikVtic.put("u\u200Bse\uFEFFr\u200Fn\u034Fame", clients.get(index));
				this.sendToOneClient("Napaka", "u\u200Bse\uFEFFr\u200Fn\u034Fame", cas, "A user with this username already exists, please choose a different one!", "u\u200Bse\uFEFFr\u200Fn\u034Fame");
				return;
			}

			msg_send = posiljatelj + " se je prijavil-a!\n";
			uporabnikVtic.put(posiljatelj, clients.get(index));
		}else{ // 2. type of message (javno)
			msg_send = "[" + cas + "] [Javno] " + posiljatelj + "\n" + besedilo.toUpperCase() + "\n";
		}

		while (i.hasNext()) { // iterate through the client list
			Socket socket = (Socket) i.next(); // get the socket for communicating with this client
			try {
				DataOutputStream out = new DataOutputStream(socket.getOutputStream()); // create output stream for sending messages to the client
				out.writeUTF(msg_send); // send message to the client
			} catch (Exception e) {
				System.err.println("[system] could not send message to a client");
				e.printStackTrace(System.err);
			}
		}
	}

	// send a message to a specific client connected to the server, with the name prejemnik
	public void sendToOneClient(String tip, String posiljatelj, String cas, String besedilo, String prejemnik) {
		Socket socket = uporabnikVtic.get(prejemnik);

		if (socket == null) { // 4. type of message (sporocilo o napaki) 
			System.err.println("[system] recipient " + prejemnik + " not found: ");
			sendToOneClient("Napaka", "u\\u200Bse\\uFEFFr\\u200Fn\\u034Fame", cas, "A user with this username doesn't exist!", posiljatelj);
			return;
		}
		if (socket.isClosed()) {
			System.err.println("[system] socket closed for: " + prejemnik);
			return;
		}
		// 3. type of message (privatno)
		String msg_send = "[" + cas + "] [Zasebno] " + posiljatelj + "\n" + besedilo.toUpperCase() + "\n";

		if(tip.equals("Napaka")){
			msg_send = besedilo;
		}
		
		try {
			DataOutputStream out = new DataOutputStream(socket.getOutputStream());
			out.writeUTF(msg_send);
		} catch (Exception e) {
			System.err.println("[system] could not send message to client: " + prejemnik);
			e.printStackTrace(System.err);
			
			clients.remove(socket);
			uporabnikVtic.remove(prejemnik);
			try { socket.close(); } catch (IOException ex) {}
		}
	}

	public void removeClient(Socket socket) {
		synchronized(this) {
			clients.remove(socket);
		}
	}
}

class ChatServerConnector extends Thread {
	private ChatServer server;
	private Socket socket;

	public ChatServerConnector(ChatServer server, Socket socket) {
		this.server = server;
		this.socket = socket;
	}

	public void run() {
		System.out.println("[system] connected with " + this.socket.getInetAddress().getHostName() + ":" + this.socket.getPort());

		DataInputStream in;
		try {
			in = new DataInputStream(this.socket.getInputStream()); // create input stream for listening for incoming messages
		} catch (IOException e) {
			System.err.println("[system] could not open input stream!");
			e.printStackTrace(System.err);
			this.server.removeClient(socket);
			return;
		}

		while (true) { // infinite loop in which this thread waits for incoming messages and processes them
			String msg_received;
			String tip = "";
			String posiljatelj = "";
			String cas = " ";
			String besedilo = " ";
			String prejemnik = "";
			//JSONObject json = new JSONObject();

			try {
				msg_received = in.readUTF(); // read the message from the client
				JSONParser parser = new JSONParser();
				try {
					JSONObject parsedObj = (JSONObject) parser.parse(msg_received); //parse
					
					//structured messages from server to client seemed unnecessary to me
					//only the location where the message (to be displayed on the client) is composed  changes

					tip = (String) parsedObj.get("Tip Sporocila");
					//json.put("Tip Sporocila", tip);
					posiljatelj = (String) parsedObj.get("Ime Posiljatelja");
					//json.put("Ime Posiljatelja", posiljatelj);
					cas = (String) parsedObj.get("Cas Posiljanja");
					//json.put("Cas Posiljanja", cas);
					besedilo = (String) parsedObj.get("Besedilo Sporocila");
					//json.put("Besedilo Sporocila", besedilo);
					prejemnik = (String) parsedObj.get("Ime Prejemnika");
					//json.put("Ime Prejemnika", prejemnik);

					//print for verifying, if the message sent from client to server arrived correctly
					/* 
					System.out.println("Tip Sporocila: " + tip);
					System.out.println("Ime Posiljatelja: " + posiljatelj);  
					System.out.println("Cas posiljanja: " + cas);  
					System.out.println("Besedilo Sporocila: " + besedilo);  
					System.out.println("Ime Prejemnika: " + prejemnik);
					*/

				} catch (ParseException e) {
					e.printStackTrace();
				}

			} catch (Exception e) {
				System.err.println("[system] there was a problem while reading message client on port " + this.socket.getPort() + ", removing client");
				e.printStackTrace(System.err);
				ChatServer.decrementindex();
				this.server.removeClient(this.socket);
				return;
			}

			if (msg_received.length() == 0) // invalid message
				continue;

			System.out.println("[RKchat] [" + this.socket.getPort() + "] : " + msg_received); // print the incoming message in the console

			if(tip.equals("Zasebno")){
				try {
					this.server.sendToOneClient(tip, posiljatelj, cas, besedilo, prejemnik); // send message to one client
				} catch (Exception e) {
					System.err.println("[system] there was a problem while sending the message to the client " + prejemnik);
					e.printStackTrace(System.err);
					continue;
				}
			}else{
				try {
					this.server.sendToAllClients(tip, posiljatelj, cas, besedilo); // send message to all clients
				} catch (Exception e) {
					System.err.println("[system] there was a problem while sending the message to all clients");
					e.printStackTrace(System.err);
					continue;
				}
			}
		}
	}
}
