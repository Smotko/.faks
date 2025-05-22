import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.security.KeyStore;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManagerFactory;

public class TLSClient {
    public static void main(String[] args) throws Exception {
        char[] password = "changeit".toCharArray();

        // Load truststore
        KeyStore ts = KeyStore.getInstance("PKCS12");
        try (InputStream is = Files.newInputStream(Paths.get("client_truststore.p12"))) {
            ts.load(is, password);
        }

        // Initialize TrustManagerFactory
        TrustManagerFactory tmf = TrustManagerFactory.getInstance("SunX509");
        tmf.init(ts);

        // Create SSLContext with trust material
        SSLContext sslContext = SSLContext.getInstance("TLS");
        sslContext.init(null, tmf.getTrustManagers(), null);

        // Connect to server
        SSLSocketFactory sf = sslContext.getSocketFactory();
        SSLSocket socket = (SSLSocket) sf.createSocket("localhost", 8443);
        socket.setEnabledCipherSuites(new String[]{"TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256"});

        System.out.println("Connected to server!");
        socket.close();
    }
}