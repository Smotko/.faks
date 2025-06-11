
import java.util.*;

public class Test32 {

    public static void main(String[] args) {
        Map<Integer, String> kolo2postaja = new TreeMap<>();
        kolo2postaja.put(167816758, "OhOCP");
        kolo2postaja.put(418639350, "xHkYogU");
        kolo2postaja.put(767748928, "rcsJI");
        kolo2postaja.put(292951823, "AdIGUFp");
        kolo2postaja.put(432601596, "BfpIY");
        kolo2postaja.put(267450569, "BrhXbj");
        kolo2postaja.put(488540029, "AdIGUFp");
        kolo2postaja.put(392024982, "rcsJI");
        kolo2postaja.put(951054125, "BrhXbj");
        kolo2postaja.put(183128401, "IoKjxW");
        kolo2postaja.put(544743170, "DXxljTV");
        kolo2postaja.put(379150536, "rcsJI");
        kolo2postaja.put(316874485, "lRKUWs");
        kolo2postaja.put(45031357, "IoKjxW");
        kolo2postaja.put(64996986, "lRKUWs");
        kolo2postaja.put(901009060, "rcsJI");
        kolo2postaja.put(463890800, "DXxljTV");
        kolo2postaja.put(813309780, "Hvclgit");
        kolo2postaja.put(28322897, "yYzWoL");
        kolo2postaja.put(35055869, "spVFHDP");
        kolo2postaja.put(513136843, "spVFHDP");
        kolo2postaja.put(2641910, "AdIGUFp");
        kolo2postaja.put(239934876, "DXxljTV");
        kolo2postaja.put(37885170, "BfpIY");
        kolo2postaja.put(714287627, "yYzWoL");

        Cetrta.Sistem sistem = new Cetrta.Sistem(kolo2postaja);
        sistem.izposoja(951054125);
        sistem.izposoja(45031357);
        sistem.izposoja(183128401);
        sistem.vracilo(183128401, "DXxljTV");
        sistem.izposoja(513136843);
        sistem.vracilo(951054125, "DXxljTV");
        sistem.izposoja(901009060);
        sistem.izposoja(316874485);
        sistem.izposoja(167816758);
        sistem.vracilo(316874485, "AdIGUFp");
        sistem.izposoja(35055869);
        sistem.izposoja(767748928);
        sistem.vracilo(767748928, "IoKjxW");
        sistem.vracilo(513136843, "IoKjxW");
        sistem.izposoja(316874485);
        sistem.izposoja(183128401);
        sistem.izposoja(37885170);
        sistem.izposoja(432601596);
        sistem.vracilo(183128401, "yYzWoL");
        sistem.izposoja(488540029);
        sistem.izposoja(463890800);
        sistem.vracilo(488540029, "IoKjxW");
        sistem.vracilo(35055869, "IoKjxW");
        sistem.izposoja(35055869);
        sistem.izposoja(951054125);
        sistem.izposoja(392024982);

        Map<Integer, Boolean> statusi = sistem.statusiKoles();
        List<Integer> kolesa = new ArrayList<>(statusi.keySet());
        kolesa.sort(null);
        for (int kolo: kolesa) {
            System.out.printf("%d -> %b%n", kolo, statusi.get(kolo));
        }
    }
}
