
import java.util.*;

public class Test06 {

    public static void main(String[] args) {
        Map<Integer, String> kolo2postaja = new TreeMap<>();
        kolo2postaja.put(52780665, "HWxtS");
        kolo2postaja.put(918428733, "aodFH");
        kolo2postaja.put(513747567, "QuqYklv");
        kolo2postaja.put(910195585, "JCMWT");
        kolo2postaja.put(209664457, "mXhYjP");
        kolo2postaja.put(529287508, "aodFH");
        kolo2postaja.put(302603414, "RhzRdq");
        kolo2postaja.put(962781349, "aodFH");
        kolo2postaja.put(235669175, "HWxtS");
        kolo2postaja.put(577651800, "uVdvX");
        kolo2postaja.put(332963804, "ozArF");
        kolo2postaja.put(424666569, "uVdvX");
        kolo2postaja.put(482425861, "QuqYklv");
        kolo2postaja.put(21333125, "RhzRdq");
        kolo2postaja.put(999763673, "gaAfb");
        kolo2postaja.put(487111311, "RhzRdq");
        kolo2postaja.put(922872549, "gaAfb");
        kolo2postaja.put(254544721, "RhzRdq");
        kolo2postaja.put(866518344, "JCMWT");
        kolo2postaja.put(856294427, "mXhYjP");
        kolo2postaja.put(667589961, "gaAfb");
        kolo2postaja.put(342969262, "JCMWT");
        kolo2postaja.put(787197736, "aodFH");
        kolo2postaja.put(861945846, "mXhYjP");
        kolo2postaja.put(722602024, "aodFH");
        kolo2postaja.put(138703248, "mXhYjP");
        kolo2postaja.put(936131265, "PmWucWP");

        List<String> postaje = new ArrayList<>(new TreeSet<>(kolo2postaja.values()));
        postaje.sort(null);

        Cetrta.Sistem sistem = new Cetrta.Sistem(kolo2postaja);
        sistem.izposoja(209664457);
        sistem.izposoja(856294427);
        sistem.izposoja(235669175);
        sistem.izposoja(529287508);
        sistem.izposoja(787197736);
        sistem.izposoja(667589961);
        sistem.izposoja(866518344);
        sistem.izposoja(922872549);
        sistem.izposoja(918428733);
        sistem.izposoja(482425861);
        sistem.izposoja(910195585);
        sistem.izposoja(999763673);
        sistem.izposoja(21333125);
        sistem.izposoja(577651800);
        sistem.izposoja(722602024);
        sistem.izposoja(254544721);
        sistem.izposoja(302603414);
        sistem.izposoja(861945846);
        sistem.izposoja(52780665);
        sistem.izposoja(332963804);
        sistem.izposoja(342969262);
        sistem.izposoja(513747567);
        sistem.izposoja(138703248);

        for (String postaja: postaje) {
            Set<Integer> kolesa = sistem.kolesaNaPostaji(postaja);
            List<Integer> seznam = new ArrayList<>(kolesa);
            seznam.sort(null);
            System.out.printf("%s -> %s%n", postaja, seznam);
        }
    }
}
