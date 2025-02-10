
import java.util.*;

public class Test21 {

    public static void main(String[] args) {
        Map<Integer, String> kolo2postaja = new TreeMap<>();
        kolo2postaja.put(619172578, "GqlaTw");
        kolo2postaja.put(268614480, "KJwyJi");
        kolo2postaja.put(586820356, "MytMux");
        kolo2postaja.put(22216035, "bNpytgs");
        kolo2postaja.put(582895333, "myYWgF");
        kolo2postaja.put(927501161, "bqQFW");
        kolo2postaja.put(915180942, "sbGPX");
        kolo2postaja.put(20715314, "hkWMx");
        kolo2postaja.put(936853136, "WMMQn");
        kolo2postaja.put(959363822, "Irosim");
        kolo2postaja.put(315037754, "dLbCs");
        kolo2postaja.put(818657457, "ndfUOqD");
        kolo2postaja.put(752215152, "zOJvEC");
        kolo2postaja.put(915135192, "EGztR");
        kolo2postaja.put(200394812, "BtqYW");
        kolo2postaja.put(184164309, "iuuugZ");
        kolo2postaja.put(319603963, "YPvhn");
        kolo2postaja.put(745236139, "PYFGB");
        kolo2postaja.put(915020760, "EGztR");
        kolo2postaja.put(588564181, "hkWMx");
        kolo2postaja.put(465142109, "NObfzdV");
        kolo2postaja.put(839087313, "ndfUOqD");
        kolo2postaja.put(685383131, "JFwnu");
        kolo2postaja.put(816938172, "tADIZ");
        kolo2postaja.put(237853570, "OJUVRD");
        kolo2postaja.put(716781155, "jeBAV");
        kolo2postaja.put(34071071, "NBdSj");
        kolo2postaja.put(450077323, "Irosim");
        kolo2postaja.put(484431061, "KJwyJi");
        kolo2postaja.put(37991938, "UvWHUO");
        kolo2postaja.put(200520769, "PYFGB");
        kolo2postaja.put(441621827, "sbGPX");
        kolo2postaja.put(154096227, "ybjzy");
        kolo2postaja.put(361148758, "WjcRF");
        kolo2postaja.put(649002175, "iuuugZ");
        kolo2postaja.put(779808273, "OJUVRD");
        kolo2postaja.put(335161730, "iuuugZ");
        kolo2postaja.put(643462932, "bqQFW");
        kolo2postaja.put(38234292, "lGDiV");

        List<String> postaje = new ArrayList<>(new TreeSet<>(kolo2postaja.values()));
        postaje.sort(null);

        Cetrta.Sistem sistem = new Cetrta.Sistem(kolo2postaja);
        sistem.izposoja(685383131);

        for (String postaja: postaje) {
            Set<Integer> kolesa = sistem.kolesaNaPostaji(postaja);
            List<Integer> seznam = new ArrayList<>(kolesa);
            seznam.sort(null);
            System.out.printf("%s -> %s%n", postaja, seznam);
        }
    }
}
