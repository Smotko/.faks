
import java.util.*;

public class Test20 {

    public static void main(String[] args) {
        Map<Integer, String> kolo2postaja = new TreeMap<>();
        kolo2postaja.put(405211470, "BMvIF");
        kolo2postaja.put(727432095, "gTAyV");
        kolo2postaja.put(453656767, "WPoldHO");
        kolo2postaja.put(297093267, "gTAyV");
        kolo2postaja.put(273832355, "vgtNdam");
        kolo2postaja.put(467263682, "TUvaf");
        kolo2postaja.put(24706721, "wwfDQ");
        kolo2postaja.put(691763774, "qGlLgxq");
        kolo2postaja.put(526128223, "PPMucJE");
        kolo2postaja.put(832705761, "vgtNdam");
        kolo2postaja.put(74827145, "NgjucU");
        kolo2postaja.put(916088906, "BMvIF");
        kolo2postaja.put(442029808, "cePwIuR");
        kolo2postaja.put(5786704, "JhaYNX");
        kolo2postaja.put(753648543, "qGlLgxq");
        kolo2postaja.put(879756438, "ASKnSez");
        kolo2postaja.put(232145909, "PPMucJE");
        kolo2postaja.put(515849303, "IEbkZ");
        kolo2postaja.put(775621153, "Tuhczq");
        kolo2postaja.put(700512422, "xVyuYHR");
        kolo2postaja.put(44025350, "PPMucJE");
        kolo2postaja.put(135892573, "Tuhczq");
        kolo2postaja.put(33286779, "JhaYNX");
        kolo2postaja.put(504166143, "ljOAdp");
        kolo2postaja.put(377979242, "xVyuYHR");
        kolo2postaja.put(580965203, "cePwIuR");
        kolo2postaja.put(746393814, "wwfDQ");
        kolo2postaja.put(237983440, "WPoldHO");
        kolo2postaja.put(618648251, "qlAkYjm");
        kolo2postaja.put(436212220, "dpyMdc");
        kolo2postaja.put(269738850, "qyJKVHw");
        kolo2postaja.put(606490209, "IEbkZ");
        kolo2postaja.put(984450044, "ASKnSez");
        kolo2postaja.put(371358810, "TUvaf");
        kolo2postaja.put(915541279, "cePwIuR");

        List<String> postaje = new ArrayList<>(new TreeSet<>(kolo2postaja.values()));
        postaje.sort(null);

        Cetrta.Sistem sistem = new Cetrta.Sistem(kolo2postaja);
        sistem.izposoja(33286779);
        sistem.izposoja(691763774);
        sistem.izposoja(727432095);
        sistem.izposoja(504166143);
        sistem.izposoja(915541279);
        sistem.izposoja(74827145);
        sistem.izposoja(753648543);
        sistem.izposoja(832705761);
        sistem.izposoja(377979242);

        for (String postaja: postaje) {
            Set<Integer> kolesa = sistem.kolesaNaPostaji(postaja);
            List<Integer> seznam = new ArrayList<>(kolesa);
            seznam.sort(null);
            System.out.printf("%s -> %s%n", postaja, seznam);
        }
    }
}
