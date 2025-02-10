
import java.util.*;

public class Test04 {

    public static void main(String[] args) {
        Map<Integer, String> kolo2postaja = new TreeMap<>();
        kolo2postaja.put(111, "Bavarski dvor");
        kolo2postaja.put(222, "Vilharjeva");
        kolo2postaja.put(333, "Tivoli");
        kolo2postaja.put(444, "Bavarski dvor");
        kolo2postaja.put(555, "Cankarjeva");
        kolo2postaja.put(666, "Vilharjeva");
        kolo2postaja.put(777, "Vilharjeva");
        kolo2postaja.put(888, "Cankarjeva");
        kolo2postaja.put(999, "Tivoli");
        List<String> postaje = new ArrayList<>(new TreeSet<>(kolo2postaja.values()));
        postaje.sort(null);

        Cetrta.Sistem sistem = new Cetrta.Sistem(kolo2postaja);
        sistem.izposoja(333);
        sistem.izposoja(111);
        sistem.izposoja(666);
        sistem.izposoja(222);
        sistem.izposoja(888);

        for (String postaja: postaje) {
            Set<Integer> kolesa = sistem.kolesaNaPostaji(postaja);
            List<Integer> seznam = new ArrayList<>(kolesa);
            seznam.sort(null);
            System.out.printf("%s -> %s%n", postaja, seznam);
        }
    }
}
