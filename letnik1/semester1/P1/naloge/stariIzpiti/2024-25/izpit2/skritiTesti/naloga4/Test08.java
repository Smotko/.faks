
import java.util.*;

public class Test08 {

    public static void main(String[] args) {
        Map<Integer, String> kolo2postaja = new TreeMap<>();
        kolo2postaja.put(514475948, "GkKexNV");
        kolo2postaja.put(524839772, "wkGXqQ");
        kolo2postaja.put(894970087, "kilHGOW");
        kolo2postaja.put(220304421, "wkGXqQ");
        kolo2postaja.put(420136483, "SqSxC");
        kolo2postaja.put(808748076, "VXCAB");
        kolo2postaja.put(620372329, "ZqdOBoi");
        kolo2postaja.put(594376220, "iGjdAG");
        kolo2postaja.put(537058177, "kilHGOW");
        kolo2postaja.put(913300747, "iGjdAG");
        kolo2postaja.put(479365561, "JANQe");
        kolo2postaja.put(391135810, "LmQjGef");
        kolo2postaja.put(444450461, "wkGXqQ");
        kolo2postaja.put(85116571, "VXCAB");
        kolo2postaja.put(68880350, "exaag");
        kolo2postaja.put(28032086, "kilHGOW");
        kolo2postaja.put(370405296, "kKkGSZ");
        kolo2postaja.put(613540735, "GkKexNV");
        kolo2postaja.put(850895917, "JANQe");
        kolo2postaja.put(986937294, "wkGXqQ");
        kolo2postaja.put(12859062, "iGjdAG");
        kolo2postaja.put(679197662, "kilHGOW");
        kolo2postaja.put(908165790, "kilHGOW");
        kolo2postaja.put(502803190, "ZDcXxB");
        kolo2postaja.put(340353577, "exaag");
        kolo2postaja.put(487588608, "iGjdAG");
        kolo2postaja.put(575964499, "GkKexNV");
        kolo2postaja.put(236600450, "GkKexNV");
        kolo2postaja.put(441688858, "kilHGOW");
        kolo2postaja.put(482549398, "LmQjGef");
        kolo2postaja.put(624203987, "exaag");
        kolo2postaja.put(770806211, "iGjdAG");
        kolo2postaja.put(335756338, "ZqdOBoi");
        kolo2postaja.put(258404708, "bicfXRD");
        kolo2postaja.put(21886829, "JANQe");
        kolo2postaja.put(767146642, "SqSxC");
        kolo2postaja.put(582448337, "ZDcXxB");
        kolo2postaja.put(163134589, "itJfFdf");
        kolo2postaja.put(527982362, "kKkGSZ");
        kolo2postaja.put(331354809, "ZDcXxB");
        kolo2postaja.put(442534493, "wkGXqQ");
        kolo2postaja.put(265487855, "kKkGSZ");
        kolo2postaja.put(499431845, "VXCAB");
        kolo2postaja.put(784966492, "itJfFdf");
        kolo2postaja.put(674808387, "itJfFdf");
        kolo2postaja.put(883105591, "exaag");
        kolo2postaja.put(178092281, "ZqdOBoi");
        kolo2postaja.put(995255255, "kKkGSZ");
        kolo2postaja.put(981209456, "LmQjGef");
        kolo2postaja.put(496929273, "exaag");
        kolo2postaja.put(294138697, "SqSxC");
        kolo2postaja.put(225683061, "kilHGOW");
        kolo2postaja.put(861851238, "ZqdOBoi");
        kolo2postaja.put(391200471, "ZDcXxB");
        kolo2postaja.put(890727710, "VXCAB");
        kolo2postaja.put(965142599, "iGjdAG");
        kolo2postaja.put(470148490, "JANQe");
        kolo2postaja.put(75452582, "ZqdOBoi");
        kolo2postaja.put(858827560, "wkGXqQ");
        kolo2postaja.put(146712346, "sFJQvWy");
        kolo2postaja.put(639586571, "sFJQvWy");
        kolo2postaja.put(292769718, "itJfFdf");
        kolo2postaja.put(526560692, "VXCAB");
        kolo2postaja.put(857101445, "bicfXRD");
        kolo2postaja.put(842003468, "SqSxC");
        kolo2postaja.put(600109348, "itJfFdf");
        kolo2postaja.put(42837560, "GkKexNV");

        Cetrta.Sistem sistem = new Cetrta.Sistem(kolo2postaja);
        sistem.izposoja(370405296);
        sistem.izposoja(163134589);
        sistem.izposoja(965142599);
        sistem.izposoja(442534493);
        sistem.izposoja(639586571);
        sistem.izposoja(420136483);
        sistem.izposoja(784966492);
        sistem.izposoja(514475948);
        sistem.izposoja(487588608);
        sistem.izposoja(524839772);
        sistem.izposoja(808748076);
        sistem.izposoja(613540735);
        sistem.izposoja(624203987);
        sistem.izposoja(236600450);
        sistem.izposoja(21886829);
        sistem.izposoja(575964499);
        sistem.izposoja(858827560);
        sistem.izposoja(470148490);
        sistem.izposoja(594376220);
        sistem.izposoja(537058177);
        sistem.izposoja(908165790);
        sistem.izposoja(620372329);
        sistem.izposoja(679197662);
        sistem.izposoja(85116571);
        sistem.izposoja(582448337);
        sistem.izposoja(225683061);
        sistem.izposoja(770806211);
        sistem.izposoja(482549398);
        sistem.izposoja(850895917);

        Map<Integer, Boolean> statusi = sistem.statusiKoles();
        List<Integer> kolesa = new ArrayList<>(statusi.keySet());
        kolesa.sort(null);
        for (int kolo: kolesa) {
            System.out.printf("%d -> %b%n", kolo, statusi.get(kolo));
        }
    }
}
