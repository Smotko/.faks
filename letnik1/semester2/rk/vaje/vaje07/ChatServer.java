import java.io.*;
import java.net.*;
import java.util.*;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class ChatServer {
	protected int serverPort = 8888; //Popravek (1234)
	//protected List<Socket> clients = new ArrayList<Socket>(); // list of clients
	

	public static void main(String[] args) throws Exception {
		new ChatServer();
	}

	public ChatServer() {
		
	System.setProperty("java.net.preferIPv4Stack", "false");
	System.setProperty("java.net.preferIPv6Addresses", "true");
		ServerSocket serverSocket = null;

		// create socket
		try {
			serverSocket = new ServerSocket(); // create the ServerSocket 
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
	public void sendToAllClients(String message) throws Exception {
		Iterator<Socket> i = clients.iterator();
		while (i.hasNext()) { // iterate through the client list
			Socket socket = (Socket) i.next(); // get the socket for communicating with this client
			try {
				DataOutputStream out = new DataOutputStream(socket.getOutputStream()); // create output stream for sending messages to the client
				out.writeUTF(message); // send message to the client
			} catch (Exception e) {
				System.err.println("[system] could not send message to a client");
				e.printStackTrace(System.err);
			}
		}
	}

	// send a message to a specific client connected to the server
	public void sendToOneClient(String message) throws Exception {
		Iterator<Socket> i = clients.iterator();
		while (i.hasNext()) { // iterate through the client list
			Socket socket = (Socket) i.next(); // get the socket for communicating with this client
			try {
				DataOutputStream out = new DataOutputStream(socket.getOutputStream()); // create output stream for sending messages to the client
				out.writeUTF(message); // send message to the client
			} catch (Exception e) {
				System.err.println("[system] could not send message to a client");
				e.printStackTrace(System.err);
			}
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

			try {
				msg_received = in.readUTF(); // read the message from the client
				JSONParser parser = new JSONParser();
				try {
					JSONObject parsedObj = (JSONObject) parser.parse(msg_received); //parse
					
					tip = (String) parsedObj.get("Tip Sporocila");
					posiljatelj = (String) parsedObj.get("Ime Posiljatelja");
					cas = (String) parsedObj.get("Cas Posiljanja");
					besedilo = (String) parsedObj.get("Besedilo Sporocila");
					prejemnik = (String) parsedObj.get("Ime Prejemnika");

					System.out.println("Tip Sporocila: " + tip);
					System.out.println("Ime Posiljatelja: " + posiljatelj);  
					System.out.println("Cas posiljanja: " + cas);  
					System.out.println("Besedilo Sporocila: " + besedilo);  
					System.out.println("Ime Prejemnika: " + prejemnik);

				} catch (ParseException e) {
					e.printStackTrace();
				}

			} catch (Exception e) {
				System.err.println("[system] there was a problem while reading message client on port " + this.socket.getPort() + ", removing client");
				e.printStackTrace(System.err);
				this.server.removeClient(this.socket);
				return;
			}

			if (msg_received.length() == 0) // invalid message
				continue;

			System.out.println("[RKchat] [" + this.socket.getPort() + "] : " + msg_received); // print the incoming message in the console

			String msg_send = "";
			if(tip.equals("Prijava")){
				msg_send = posiljatelj + " se je prijavil!\n";
			}else{
				msg_send = "[" + cas + "] " + posiljatelj + "\n" + besedilo.toUpperCase() + "\n";
			}

			if(tip.equals("Zasebno")){
				try {
					this.server.sendToOneClient(msg_send); // send message to one client
				} catch (Exception e) {
					System.err.println("[system] there was a problem while sending the message to client on port");
					e.printStackTrace(System.err);
					continue;
				}
			}else{
				try {
					this.server.sendToAllClients(msg_send); // send message to all clients
				} catch (Exception e) {
					System.err.println("[system] there was a problem while sending the message to all clients");
					e.printStackTrace(System.err);
					continue;
				}
			}
		}
	}
}
