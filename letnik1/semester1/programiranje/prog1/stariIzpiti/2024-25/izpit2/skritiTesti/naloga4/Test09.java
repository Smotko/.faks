
import java.util.*;

public class Test09 {

    public static void main(String[] args) {
        Map<Integer, String> kolo2postaja = new TreeMap<>();
        kolo2postaja.put(571542438, "ZyWTp");
        kolo2postaja.put(619985376, "eZRHr");
        kolo2postaja.put(429664803, "UQdAwy");
        kolo2postaja.put(737784292, "azJxaw");
        kolo2postaja.put(587659535, "dByOUK");
        kolo2postaja.put(832218414, "dByOUK");
        kolo2postaja.put(357819811, "nWxTUNm");
        kolo2postaja.put(691236450, "QzVDe");
        kolo2postaja.put(175322562, "cbZDVy");
        kolo2postaja.put(152409387, "FibQILc");
        kolo2postaja.put(983829771, "WMXdJ");
        kolo2postaja.put(35393053, "YsBOKmj");
        kolo2postaja.put(309761123, "ZdZfMiK");
        kolo2postaja.put(392935049, "YsBOKmj");
        kolo2postaja.put(720718410, "xfaPa");
        kolo2postaja.put(463435819, "nWxTUNm");
        kolo2postaja.put(852465680, "MAoHRa");
        kolo2postaja.put(668861324, "zAhjj");
        kolo2postaja.put(632821827, "IcbOZHo");
        kolo2postaja.put(94482590, "IcbOZHo");
        kolo2postaja.put(464057200, "IcbOZHo");
        kolo2postaja.put(548254270, "ptEVD");
        kolo2postaja.put(926417213, "gkyRG");
        kolo2postaja.put(597821722, "IcbOZHo");
        kolo2postaja.put(168984795, "YsBOKmj");
        kolo2postaja.put(890459017, "YsBOKmj");
        kolo2postaja.put(524173680, "gkyRG");
        kolo2postaja.put(255899082, "ZdZfMiK");
        kolo2postaja.put(640914450, "uFqOgb");
        kolo2postaja.put(70869669, "nkYXg");

        Cetrta.Sistem sistem = new Cetrta.Sistem(kolo2postaja);
        sistem.izposoja(571542438);
        sistem.izposoja(632821827);
        sistem.izposoja(640914450);
        sistem.izposoja(691236450);
        sistem.izposoja(255899082);
        sistem.izposoja(168984795);
        sistem.izposoja(548254270);
        sistem.izposoja(464057200);

        Map<Integer, Boolean> statusi = sistem.statusiKoles();
        List<Integer> kolesa = new ArrayList<>(statusi.keySet());
        kolesa.sort(null);
        for (int kolo: kolesa) {
            System.out.printf("%d -> %b%n", kolo, statusi.get(kolo));
        }
    }
}
