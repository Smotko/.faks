import java.io.*;
import java.net.*;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.*;
import org.json.simple.JSONObject;

public class ChatClient extends Thread
{
	protected int serverPort = 8888; //edit (1234)

	public static void main(String[] args) throws Exception {
		new ChatClient();
	}

	public ChatClient() throws Exception {
		Socket socket = null;
		DataInputStream in = null;
		DataOutputStream out = null;

		/*
		List<String> whitelist  = new ArrayList<>();
		whitelist.addAll(List.of("POLDE", "ANZE"));
		*/

		//copy pasted from below
		BufferedReader std_in = new BufferedReader(new InputStreamReader(System.in));
		//navodila
		System.out.println(
		"\nNavodila za uporabo:\n" +
		"Sledite navodilom izpisanim na komandno vrstico.\n" +
		"V primeru, da navodil ni vnesite sporocilo,\n" +
		"ki ga zelite poslati,\n" +
		"ali pa samo cakajte na sporocila drugih :)\n");
		System.out.println("Prosim vnesite uporabnisko ime:");
		String uporabnskoIme = std_in.readLine();
		
        JSONObject json = new JSONObject();
		json.put("Tip Sporocila", "Prijava");
        json.put("Ime Posiljatelja", uporabnskoIme);

		//implementation of the whitelist
		/*
		if(!whitelist.contains(uporabnskoIme.toUpperCase())){
			System.out.println("Niste whitelistani!");
			System.exit(1);
		}
		*/

		// connect to the chat server
		try {
			System.out.println("[system] connecting to chat server ...");
			socket = new Socket("::1", serverPort); // create socket connection //NAMESTO "localhost"
			in = new DataInputStream(socket.getInputStream()); // create input stream for listening for incoming messages
			out = new DataOutputStream(socket.getOutputStream()); // create output stream for sending messages
			System.out.println("[system] connected");

			//1. type of message (prijava novega uporabnika)
			this.sendMessage(json.toJSONString(), out);

			ChatClientMessageReceiver message_receiver = new ChatClientMessageReceiver(in); // create a separate thread for listening to messages from the chat server
			message_receiver.start(); // run the new thread
		} catch (Exception e) {
			e.printStackTrace(System.err);
			System.exit(1);
		}

		/*
		read from STDIN and send messages to the chat server
		BufferedReader std_in = new BufferedReader(new InputStreamReader(System.in));
		*/
		
		String userInput;
		while ((userInput = std_in.readLine()) != null) { // read a line from the console
			System.out.println("Ce zelite poslati to sporocilo kot zasebno vnesite 0, v nasprotnem primeru vnesite kaksno drugo tipko:");
			
			if(std_in.readLine().equals("0")){
				json.put("Tip Sporocila", "Zasebno");
				System.out.println("Prosim vnesite ime prejemnika, (pazite na VELIKE in male crke!):");
				String naslovPrejemnika = std_in.readLine();
				json.put("Ime Prejemnika", naslovPrejemnika);
			}else{
				//2. type of message (javno)
				json.put("Tip Sporocila", "Javno");
			}

			/* this way is 2h behind 
			long pretekliCas = System.currentTimeMillis() / 1000; //v sekundah
			long ura = (pretekliCas / 3600) % 24;
			long minuta = (pretekliCas / 60) % 60;
			String cas = Long.toString(ura) + "h " + Long.toString(minuta) + "min";
			*/

			//package java.time, to correctly display time
			ZoneId casovniPas = ZoneId.of("Europe/Ljubljana");
			LocalTime trenutniCas = LocalTime.now(casovniPas);
			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("H:mm");
			String cas = trenutniCas.format(formatter);

			json.put("Cas Posiljanja", cas);
			json.put("Besedilo Sporocila", userInput);
			this.sendMessage(json.toJSONString(), out); // send the message to the chat server
		}

		// cleanup
		out.close();
		in.close();
		std_in.close();
		socket.close();
	}

	private void sendMessage(String message, DataOutputStream out) {
		try {
			out.writeUTF(message); // send the message to the chat server
			out.flush(); // ensure the message has been sent
		} catch (IOException e) {
			System.err.println("[system] could not send message");
			e.printStackTrace(System.err);
		}
	}
}

// wait for messages from the chat server and print the out
class ChatClientMessageReceiver extends Thread {
	private DataInputStream in;

	public ChatClientMessageReceiver(DataInputStream in) {
		this.in = in;
	}

	public void run() {
		try {
			String message;
			while ((message = this.in.readUTF()) != null) { // read new message
				System.out.println("[RKchat] " + message); // print the message to the console

				//the message will only be lower case, if a user already exists
				if(message.equals("A user with this username already exists, please choose a different one!")){
					System.exit(1);
				}
			}
		} catch (Exception e) {
			System.err.println("[system] could not read message");
			e.printStackTrace(System.err);
			System.exit(1);
		}
	}
}
