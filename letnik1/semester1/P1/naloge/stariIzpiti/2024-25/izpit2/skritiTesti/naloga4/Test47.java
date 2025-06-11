
import java.util.*;

public class Test47 {

    public static void main(String[] args) {
        Map<Integer, String> kolo2postaja = new TreeMap<>();
        kolo2postaja.put(937312185, "IIGbZ");
        kolo2postaja.put(961642868, "JJakAz");
        kolo2postaja.put(365455243, "sXjEDYu");
        kolo2postaja.put(773143391, "bRgEHT");
        kolo2postaja.put(925175327, "NDAPJ");
        kolo2postaja.put(437853551, "sXjEDYu");
        kolo2postaja.put(770878473, "JQREny");
        kolo2postaja.put(5181119, "NDAPJ");
        kolo2postaja.put(143412613, "IIGbZ");
        kolo2postaja.put(736419729, "JJakAz");
        kolo2postaja.put(370487811, "NDAPJ");
        kolo2postaja.put(83730436, "WXRgE");
        kolo2postaja.put(148363870, "TqAOL");
        kolo2postaja.put(371681411, "bRgEHT");
        kolo2postaja.put(355574162, "JJakAz");
        kolo2postaja.put(807810567, "bRgEHT");
        kolo2postaja.put(148573031, "TqAOL");
        kolo2postaja.put(311144408, "TqAOL");
        kolo2postaja.put(487932075, "sXjEDYu");
        kolo2postaja.put(451410322, "sXjEDYu");
        kolo2postaja.put(241770036, "JQREny");
        kolo2postaja.put(489773233, "bRgEHT");
        kolo2postaja.put(266188262, "juSkJl");
        kolo2postaja.put(354851307, "JQREny");

        List<String> postaje = new ArrayList<>(new TreeSet<>(kolo2postaja.values()));
        postaje.sort(null);

        Cetrta.Sistem sistem = new Cetrta.Sistem(kolo2postaja);
        sistem.izposoja(451410322);
        sistem.vracilo(451410322, "sXjEDYu");
        sistem.izposoja(5181119);
        sistem.izposoja(770878473);
        sistem.vracilo(770878473, "JJakAz");
        sistem.izposoja(961642868);
        sistem.izposoja(355574162);
        sistem.izposoja(736419729);
        sistem.izposoja(370487811);
        sistem.izposoja(937312185);
        sistem.izposoja(83730436);
        sistem.izposoja(773143391);
        sistem.izposoja(241770036);
        sistem.izposoja(371681411);
        sistem.vracilo(937312185, "JQREny");
        sistem.izposoja(807810567);
        sistem.izposoja(925175327);
        sistem.izposoja(770878473);
        sistem.izposoja(354851307);
        sistem.izposoja(148573031);
        sistem.izposoja(437853551);
        sistem.izposoja(487932075);
        sistem.vracilo(770878473, "NDAPJ");
        sistem.izposoja(311144408);
        sistem.izposoja(365455243);
        sistem.vracilo(925175327, "sXjEDYu");
        sistem.vracilo(83730436, "WXRgE");
        sistem.izposoja(148363870);
        sistem.izposoja(489773233);
        sistem.izposoja(83730436);
        sistem.izposoja(266188262);
        sistem.izposoja(143412613);
        sistem.izposoja(937312185);
        sistem.izposoja(770878473);
        sistem.izposoja(451410322);
        sistem.vracilo(370487811, "sXjEDYu");
        sistem.izposoja(370487811);
        sistem.vracilo(5181119, "bRgEHT");

        for (String postaja: postaje) {
            Set<Integer> kolesa = sistem.kolesaNaPostaji(postaja);
            List<Integer> seznam = new ArrayList<>(kolesa);
            seznam.sort(null);
            System.out.printf("%s -> %s%n", postaja, seznam);
        }
    }
}
