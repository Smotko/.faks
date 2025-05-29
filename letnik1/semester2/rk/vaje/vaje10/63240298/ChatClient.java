import java.io.*;
import java.net.*;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.*;
import org.json.simple.JSONObject;

import javax.net.ssl.*;
import java.security.*;
import java.security.cert.X509Certificate;

public class ChatClient {
    protected int serverPort = 8888;
    private String username;
    private SSLSocket socket;
    private DataOutputStream out;

    public static void main(String[] args) {
        if (args.length < 1) {
            System.err.println("Uporaba: java -cp \"json-simple-1.1.1.jar;.\" ChatClient <uporabnisko_ime>");
            System.err.println("Razpoložljivi uporabniki: stane, anze, dezi");
            System.exit(1);
        }
        new ChatClient(args[0]).startClient();
    }

    public ChatClient(String username) {
        this.username = username.toLowerCase();
    }

    public void startClient() {
        if (!Arrays.asList("stane", "anze", "dezi").contains(this.username)) {
            System.err.println("Neveljavno uporabniško ime. Razpoložljivi uporabniki: stane, anze, dezi");
            System.exit(1);
        }

        try {
            initializeConnection();
            startMessageLoop();
        } catch (Exception e) {
            System.err.println("Napaka pri inicializaciji odjemalca: " + e.getMessage());
            e.printStackTrace();
            System.exit(1);
        }
    }

    private void initializeConnection() throws Exception {
        String keystoreFile = this.username + ".private";
        String passphrase = this.username + "pwd";

        KeyStore serverKeyStore = KeyStore.getInstance("JKS");
        try (FileInputStream fis = new FileInputStream("server.public")) {
            serverKeyStore.load(fis, "public".toCharArray());
        }

        KeyStore clientKeyStore = KeyStore.getInstance("PKCS12");
        try (FileInputStream fis = new FileInputStream(keystoreFile)) {
            clientKeyStore.load(fis, passphrase.toCharArray());
        }

        SSLContext sslContext = SSLContext.getInstance("TLSv1.2");
        TrustManagerFactory tmf = TrustManagerFactory.getInstance("SunX509");
        tmf.init(serverKeyStore);
        KeyManagerFactory kmf = KeyManagerFactory.getInstance("SunX509");
        kmf.init(clientKeyStore, passphrase.toCharArray());
        sslContext.init(kmf.getKeyManagers(), tmf.getTrustManagers(), new SecureRandom());

        SSLSocketFactory sf = sslContext.getSocketFactory();
        this.socket = (SSLSocket) sf.createSocket();
        socket.setReuseAddress(true);
        socket.setKeepAlive(true);
        socket.setSoTimeout(1800000); //Po 30 min nedejavnosti se ti povezava prekine
        socket.connect(new InetSocketAddress("localhost", serverPort), 10000);
        socket.setEnabledCipherSuites(new String[]{"TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256"});
        socket.startHandshake();

        X509Certificate cert = (X509Certificate) socket.getSession().getLocalCertificates()[0];
        String commonName = cert.getSubjectX500Principal().getName().split("CN=")[1].split(",")[0];

        if (!commonName.equals(this.username)) {
            throw new SSLException("Certificate CN (" + commonName + ") se ne ujema z uporabniškim imenom (" + this.username + ")");
        }

        this.out = new DataOutputStream(socket.getOutputStream());

        JSONObject json = new JSONObject();
        json.put("Tip Sporocila", "Prijava");
        json.put("Cas Posiljanja", getCurrentTime());
        json.put("Besedilo Sporocila", "");
        sendMessage(json.toJSONString());

        DataInputStream in = new DataInputStream(socket.getInputStream());
        String response = in.readUTF();

        if (response.contains("Uporabnik s takim imenom že obstaja")) {
            System.err.println("[server] " + response);
            closeResources();
            System.exit(1);
        } else {
            System.out.println("[RKchat] " + response);
        }
    }

    private void startMessageLoop() throws IOException {
        BufferedReader std_in = new BufferedReader(new InputStreamReader(System.in));
        DataInputStream in = new DataInputStream(socket.getInputStream());

        System.out.println("Navodila za uporabo:");
        System.out.println("1. Prijavljeni ste kot: " + this.username);
        System.out.println("2. Za javno sporočilo vnesite sporočilo + enter in znak, ki ni '0' + enter");
        System.out.println("3. Za zasebno sporočilo vnesite sporocilo + enter, nato '0' + enter, nazadnje pa ime prejemnika + enter\n");

        new Thread(() -> {
            try {
                while (!socket.isClosed()) {
                    String message = in.readUTF();
                    System.out.println("[RKchat] " + message);
                }
            } catch (Exception e) {
                System.err.println("[system] strežnik je prekinil povezavo ali pa je prišlo do napake");
            } finally {
                closeResources();
                System.exit(0);
            }
        }).start();

        String userInput;
        while ((userInput = std_in.readLine()) != null && !socket.isClosed()) {
            JSONObject json = new JSONObject();

            System.out.println("Za zasebno sporočilo vnesite 0, za javno pa kartkoli drugega:");
            String choice = std_in.readLine();

            if ("0".equals(choice)) {
                json.put("Tip Sporocila", "Zasebno");
                System.out.println("Vnesite ime prejemnika:");
                String recipient = std_in.readLine();
                json.put("Ime Prejemnika", recipient);
            } else {
                json.put("Tip Sporocila", "Javno");
            }

            json.put("Cas Posiljanja", getCurrentTime());
            json.put("Besedilo Sporocila", userInput);
            sendMessage(json.toJSONString());
        }
    }

    private String getCurrentTime() {
        ZoneId timeZone = ZoneId.of("Europe/Ljubljana");
        LocalTime currentTime = LocalTime.now(timeZone);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("H:mm");
        return currentTime.format(formatter);
    }

    private void sendMessage(String message) {
        try {
            if (socket != null && !socket.isClosed() && out != null) {
                out.writeUTF(message);
                out.flush();
            }
        } catch (IOException e) {
            System.err.println("[system] ni mogel poslati sporočila");
            closeResources();
        }
    }

    private void closeResources() {
        try {
            if (out != null) out.close();
            if (socket != null) socket.close();
        } catch (IOException e) {
            System.err.println("Napaka pri zapiranju virov: " + e.getMessage());
        }
    }
}