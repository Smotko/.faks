
import java.util.*;

public class Test01 {

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

        Cetrta.Sistem sistem = new Cetrta.Sistem(kolo2postaja);
        sistem.izposoja(333);
        sistem.izposoja(111);
        sistem.izposoja(666);
        sistem.izposoja(222);
        sistem.izposoja(888);

        Map<Integer, Boolean> statusi = sistem.statusiKoles();
        List<Integer> kolesa = new ArrayList<>(statusi.keySet());
        kolesa.sort(null);
        for (int kolo: kolesa) {
            System.out.printf("%d -> %b%n", kolo, statusi.get(kolo));
        }
    }
}
