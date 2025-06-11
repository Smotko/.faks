
import java.util.*;

public class Test19 {

    public static void main(String[] args) {
        Map<Integer, String> kolo2postaja = new TreeMap<>();
        kolo2postaja.put(388135481, "cBccbz");
        kolo2postaja.put(346207945, "eZHwZ");
        kolo2postaja.put(883759939, "BvXEM");
        kolo2postaja.put(60864873, "AhVDU");
        kolo2postaja.put(822540706, "rOECZ");
        kolo2postaja.put(565036953, "WjDxHPS");
        kolo2postaja.put(990733770, "eZHwZ");
        kolo2postaja.put(438580025, "LBQUot");
        kolo2postaja.put(751650923, "zTWELG");
        kolo2postaja.put(155702681, "TTMiO");
        kolo2postaja.put(321211104, "hyJJngl");
        kolo2postaja.put(181690669, "VJAUATj");
        kolo2postaja.put(530898095, "MCkUmJb");
        kolo2postaja.put(407559313, "eZHwZ");
        kolo2postaja.put(816747998, "dttoivz");
        kolo2postaja.put(536934469, "wmGxPD");
        kolo2postaja.put(504982309, "jHWSnJs");
        kolo2postaja.put(334980326, "AhVDU");
        kolo2postaja.put(486157523, "edWJAPb");
        kolo2postaja.put(558122636, "wmGxPD");
        kolo2postaja.put(252705138, "uvdoUg");
        kolo2postaja.put(510962510, "BvXEM");
        kolo2postaja.put(862338628, "LTYPQiG");
        kolo2postaja.put(152775079, "KFrYiwh");
        kolo2postaja.put(874761875, "aNmBNk");
        kolo2postaja.put(725838649, "LhuWNq");
        kolo2postaja.put(550281552, "BvXEM");
        kolo2postaja.put(136850229, "edWJAPb");
        kolo2postaja.put(291814582, "eZHwZ");
        kolo2postaja.put(10276512, "MCkUmJb");
        kolo2postaja.put(670028041, "TMOgvWV");
        kolo2postaja.put(366380693, "zzWBi");
        kolo2postaja.put(244021516, "hNKYFV");
        kolo2postaja.put(369773360, "VJAUATj");
        kolo2postaja.put(848272214, "BvXEM");
        kolo2postaja.put(596827066, "TTMiO");
        kolo2postaja.put(696807040, "rPGxhx");
        kolo2postaja.put(897978658, "KFrYiwh");
        kolo2postaja.put(52837671, "qqdLkIF");
        kolo2postaja.put(844807756, "ckGDYtu");
        kolo2postaja.put(265830643, "nyhsK");
        kolo2postaja.put(477273166, "zzWBi");
        kolo2postaja.put(555538443, "BvXEM");
        kolo2postaja.put(265073391, "TTMiO");

        List<String> postaje = new ArrayList<>(new TreeSet<>(kolo2postaja.values()));
        postaje.sort(null);

        Cetrta.Sistem sistem = new Cetrta.Sistem(kolo2postaja);
        sistem.izposoja(438580025);
        sistem.izposoja(265073391);
        sistem.izposoja(181690669);
        sistem.izposoja(366380693);
        sistem.izposoja(334980326);
        sistem.izposoja(136850229);
        sistem.izposoja(822540706);
        sistem.izposoja(844807756);
        sistem.izposoja(990733770);
        sistem.izposoja(536934469);
        sistem.izposoja(52837671);
        sistem.izposoja(369773360);
        sistem.izposoja(10276512);
        sistem.izposoja(60864873);
        sistem.izposoja(291814582);

        for (String postaja: postaje) {
            Set<Integer> kolesa = sistem.kolesaNaPostaji(postaja);
            List<Integer> seznam = new ArrayList<>(kolesa);
            seznam.sort(null);
            System.out.printf("%s -> %s%n", postaja, seznam);
        }
    }
}
