
import java.util.*;

public class Test03 {

    public static void main(String[] args) {
        Map<Integer, String> kolo2postaja = new TreeMap<>();
        kolo2postaja.put(627536957, "AVtbys");
        kolo2postaja.put(869600035, "HEDpX");
        kolo2postaja.put(353488268, "hahoG");
        kolo2postaja.put(436772346, "qPkZM");
        kolo2postaja.put(402079773, "ObFvzh");
        kolo2postaja.put(423637147, "pXnhcHm");
        kolo2postaja.put(114167367, "JJaDTyj");
        kolo2postaja.put(631704736, "ntKpWe");
        kolo2postaja.put(133777598, "AVtbys");
        kolo2postaja.put(873953498, "hahoG");
        kolo2postaja.put(282951514, "AVtbys");
        kolo2postaja.put(704277336, "hahoG");
        kolo2postaja.put(251126668, "dyiIutb");
        kolo2postaja.put(663871224, "qPkZM");
        kolo2postaja.put(654263263, "WBXnyj");
        kolo2postaja.put(347615978, "zKsOow");
        kolo2postaja.put(136454842, "tAXeu");
        kolo2postaja.put(600805074, "ntKpWe");
        kolo2postaja.put(234275667, "tAXeu");
        kolo2postaja.put(29609799, "qPkZM");
        kolo2postaja.put(864409244, "zKsOow");
        kolo2postaja.put(24302219, "aYoTye");
        kolo2postaja.put(202631360, "HEDpX");
        kolo2postaja.put(180659813, "aYoTye");
        kolo2postaja.put(382446466, "tAXeu");

        Cetrta.Sistem sistem = new Cetrta.Sistem(kolo2postaja);
        sistem.izposoja(136454842);
        sistem.izposoja(402079773);
        sistem.izposoja(704277336);

        Map<Integer, Boolean> statusi = sistem.statusiKoles();
        List<Integer> kolesa = new ArrayList<>(statusi.keySet());
        kolesa.sort(null);
        for (int kolo: kolesa) {
            System.out.printf("%d -> %b%n", kolo, statusi.get(kolo));
        }
    }
}
