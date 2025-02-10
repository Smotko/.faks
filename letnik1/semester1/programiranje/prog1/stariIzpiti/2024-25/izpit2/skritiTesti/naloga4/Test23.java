
import java.util.*;

public class Test23 {

    public static void main(String[] args) {
        Map<Integer, String> kolo2postaja = new TreeMap<>();
        kolo2postaja.put(742627909, "qlKzfWJ");
        kolo2postaja.put(912109860, "vuwLXl");
        kolo2postaja.put(112491502, "bgxbnpq");
        kolo2postaja.put(860320054, "PVCdxJ");
        kolo2postaja.put(335300336, "gWsjf");
        kolo2postaja.put(294737844, "lDNRP");
        kolo2postaja.put(448480427, "aVKRG");
        kolo2postaja.put(154195326, "AyDlOP");
        kolo2postaja.put(257081022, "AyDlOP");
        kolo2postaja.put(580194857, "Ppaxk");
        kolo2postaja.put(185625840, "Ppaxk");
        kolo2postaja.put(685532306, "qlKzfWJ");
        kolo2postaja.put(357756045, "AyDlOP");
        kolo2postaja.put(156501857, "lDNRP");
        kolo2postaja.put(398183923, "YpOhk");
        kolo2postaja.put(775697999, "OgHKJ");
        kolo2postaja.put(170834063, "gWsjf");
        kolo2postaja.put(476780223, "AyDlOP");
        kolo2postaja.put(721210794, "vuwLXl");
        kolo2postaja.put(11701349, "gWsjf");
        kolo2postaja.put(970095921, "vuwLXl");
        kolo2postaja.put(121687357, "HolAO");
        kolo2postaja.put(736577463, "aVKRG");
        kolo2postaja.put(491228323, "NuFwe");
        kolo2postaja.put(194286737, "NuFwe");

        List<String> postaje = new ArrayList<>(new TreeSet<>(kolo2postaja.values()));
        postaje.sort(null);

        Cetrta.Sistem sistem = new Cetrta.Sistem(kolo2postaja);
        sistem.izposoja(721210794);
        sistem.izposoja(257081022);
        sistem.izposoja(398183923);
        sistem.izposoja(742627909);
        sistem.izposoja(11701349);
        sistem.izposoja(185625840);
        sistem.izposoja(912109860);
        sistem.izposoja(580194857);
        sistem.izposoja(335300336);
        sistem.izposoja(970095921);
        sistem.izposoja(154195326);
        sistem.izposoja(448480427);
        sistem.izposoja(685532306);
        sistem.izposoja(121687357);
        sistem.izposoja(294737844);
        sistem.izposoja(194286737);

        for (String postaja: postaje) {
            Set<Integer> kolesa = sistem.kolesaNaPostaji(postaja);
            List<Integer> seznam = new ArrayList<>(kolesa);
            seznam.sort(null);
            System.out.printf("%s -> %s%n", postaja, seznam);
        }
    }
}
