import java.io.*;
import java.net.*;
import java.util.*;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import java.util.concurrent.*;
import javax.net.ssl.*;
import java.security.*;
import java.security.cert.X509Certificate;

public class ChatServer {
    protected int serverPort = 8888;
    protected List<Socket> clients = new ArrayList<>();
    public static ConcurrentMap<String, Socket> uporabnikVtic = new ConcurrentHashMap<>();
    public static int index = -1;
    private static final String passphrase = "serverpwd";

    public static void main(String[] args) throws Exception {
        new ChatServer();
    }

    static void decrementindex() {
        index--;
    }

    public static ConcurrentMap<String, Socket> getConcurrentMap() {
        return uporabnikVtic;
    }

    public ChatServer() throws Exception {
        System.setProperty("java.net.preferIPv4Stack", "false");
        System.setProperty("java.net.preferIPv6Addresses", "true");

        KeyStore clientKeyStore = KeyStore.getInstance("JKS");
        clientKeyStore.load(new FileInputStream("client.public"), "public".toCharArray());

        KeyStore serverKeyStore = KeyStore.getInstance("PKCS12");
        serverKeyStore.load(new FileInputStream("server.private"), passphrase.toCharArray());

        TrustManagerFactory tmf = TrustManagerFactory.getInstance("SunX509");
        tmf.init(clientKeyStore);
        KeyManagerFactory kmf = KeyManagerFactory.getInstance("SunX509");
        kmf.init(serverKeyStore, passphrase.toCharArray());

        SSLContext sslContext = SSLContext.getInstance("TLSv1.2");
        sslContext.init(kmf.getKeyManagers(), tmf.getTrustManagers(), new SecureRandom());

        SSLServerSocket serverSocket = (SSLServerSocket) sslContext.getServerSocketFactory()
                .createServerSocket(this.serverPort);
        serverSocket.setNeedClientAuth(true);
        serverSocket.setReuseAddress(true);
        serverSocket.setEnabledCipherSuites(new String[]{
            "TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256"
        });

        System.out.println("[system] posluša ...");
        ExecutorService pool = Executors.newFixedThreadPool(10);

        while (true) {
            try {
                SSLSocket clientSocket = (SSLSocket) serverSocket.accept();
                clientSocket.setSoTimeout(1800000); //Po 30 min nedejavnosti se ti povezava prekine

                X509Certificate cert = (X509Certificate) clientSocket.getSession().getPeerCertificates()[0];
                String commonName = cert.getSubjectX500Principal().getName().split("CN=")[1].split(",")[0];

                synchronized (this) {
                    index++;
                    clients.add(clientSocket);
                }

                pool.execute(new ChatServerConnector(this, clientSocket, commonName));
            } catch (Exception e) {
                System.err.println("[error] Sprejem ni uspel: " + e.getMessage());
            }
        }
    }

    public void sendToAllClients(String tip, String posiljatelj, String cas, String besedilo) throws Exception {
        String msg_send;

        if (tip.equals("Prijava")) {
            msg_send = posiljatelj + " se je prijavil-a!\n";
        } else {
            msg_send = "[" + cas + "] [Javno] " + posiljatelj + "\n" + besedilo.toUpperCase() + "\n";
        }

        synchronized (clients) {
            Iterator<Socket> i = clients.iterator();
            while (i.hasNext()) {
                Socket socket = i.next();
                try {
                    DataOutputStream out = new DataOutputStream(socket.getOutputStream());
                    out.writeUTF(msg_send);
                } catch (Exception e) {
                    System.err.println("[system] ni mogel poslati sporočila odjemalcu");
                    i.remove();
                    removeDisconnectedUsers();
                }
            }
        }
    }

    private synchronized void removeDisconnectedUsers() {
        Iterator<Map.Entry<String, Socket>> it = uporabnikVtic.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<String, Socket> entry = it.next();
            if (entry.getValue().isClosed()) {
                it.remove();
            }
        }
    }

    public void sendToOneClient(String tip, String posiljatelj, String cas, String besedilo, String prejemnik) {
        Socket socket = uporabnikVtic.get(prejemnik);

        if (socket == null) {
        System.err.println("[system] prejemnik '" + prejemnik + "' ni bil najden");
        
        Socket senderSocket = uporabnikVtic.get(posiljatelj);
        if (senderSocket != null && !senderSocket.isClosed()) {
            try {
                DataOutputStream out = new DataOutputStream(senderSocket.getOutputStream());
                out.writeUTF("[Napaka] Uporabnik s takim imenom ne obstaja: " + prejemnik);
            } catch (IOException e) {
                System.err.println("[system] ni mogel obvestiti pošiljatelja o neznanem prejemniku");
            }
    }

    return;
}

        if (socket.isClosed()) {
            System.err.println("[system] vtic zaprt za: " + prejemnik);
            return;
        }

        String msg_send = tip.equals("Napaka") ? besedilo :
                "[" + cas + "] [Zasebno] " + posiljatelj + "\n" + besedilo.toUpperCase() + "\n";

        try {
            DataOutputStream out = new DataOutputStream(socket.getOutputStream());
            out.writeUTF(msg_send);
        } catch (Exception e) {
            System.err.println("[system] ni mogel poslati sporočila odjemalcu: " + prejemnik);
            e.printStackTrace();
            clients.remove(socket);
            uporabnikVtic.remove(prejemnik);
            try {
                socket.close();
            } catch (IOException ex) {
            }
        }
    }

    public void removeClient(Socket socket) {
        synchronized (this) {
            clients.remove(socket);
        }
    }
}

class ChatServerConnector extends Thread {
    private ChatServer server;
    private Socket socket;
    private String username;

    public ChatServerConnector(ChatServer server, Socket socket, String username) {
        this.server = server;
        this.socket = socket;
        this.username = username;
    }

    public void run() {
        try (DataInputStream in = new DataInputStream(this.socket.getInputStream())) {
            while (true) {
                String msg_received;
                String tip = "";
                String cas = "";
                String besedilo = "";
                String prejemnik = "";

                try {
                    msg_received = in.readUTF();
                    if (msg_received.length() == 0)
                        continue;

                    JSONParser parser = new JSONParser();
                    JSONObject parsedObj = (JSONObject) parser.parse(msg_received);
                    tip = (String) parsedObj.get("Tip Sporocila");
                    cas = (String) parsedObj.get("Cas Posiljanja");
                    besedilo = (String) parsedObj.get("Besedilo Sporocila");
                    prejemnik = (String) parsedObj.get("Ime Prejemnika");
                } catch (Exception e) {
                    System.err.println("[system] odjemalec prekinjen oz. napaka sporočila");
                    ChatServer.decrementindex();
                    this.server.removeClient(this.socket);
                    return;
                }

                System.out.println("[RKchat] [" + this.socket.getPort() + "] : " + msg_received);

                try {
                    if (tip.equals("Prijava")) {
                        synchronized (ChatServer.getConcurrentMap()) {
                            if (ChatServer.getConcurrentMap().containsKey(username)) {
                                try {
                                    DataOutputStream out = new DataOutputStream(socket.getOutputStream());
                                    out.writeUTF("Uporabnik s takim imenom ze obstaja!");
                                } catch (IOException ex) {
                                    System.err.println("[system] ni mogel poslati opozorila o podvojeni prijavi");
                                }
                                try {
                                    socket.close();
                                } catch (IOException ex) {
                                    ex.printStackTrace();
                                }
                                server.removeClient(socket);
                                return;
                            }
                            ChatServer.getConcurrentMap().put(username, socket);
                        }

                        this.server.sendToAllClients("Prijava", username, cas, "");
                    } else if (tip.equals("Zasebno")) {
                        this.server.sendToOneClient(tip, username, cas, besedilo, prejemnik);
                    } else {
                        this.server.sendToAllClients(tip, username, cas, besedilo);
                    }
                } catch (Exception e) {
                    System.err.println("[system] sporočilo o odpravljanju napak");
                    e.printStackTrace();
                }
            }
        } catch (IOException e) {
            System.err.println("[system] napaka vhodnega toka");
            this.server.removeClient(socket);
        }
    }

}