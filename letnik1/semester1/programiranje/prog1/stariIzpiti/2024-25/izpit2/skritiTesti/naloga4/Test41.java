
import java.util.*;

public class Test41 {

    public static void main(String[] args) {
        Map<Integer, String> kolo2postaja = new TreeMap<>();
        kolo2postaja.put(217728509, "bOOSdO");
        kolo2postaja.put(589402200, "QAaDMDN");
        kolo2postaja.put(756712157, "VPijdW");
        kolo2postaja.put(405938197, "kXbjoQO");
        kolo2postaja.put(286508537, "kXbjoQO");
        kolo2postaja.put(829512639, "kXbjoQO");
        kolo2postaja.put(217826298, "BIhRdjT");
        kolo2postaja.put(415492003, "QAaDMDN");
        kolo2postaja.put(391227395, "RWVXth");
        kolo2postaja.put(895095837, "bOOSdO");
        kolo2postaja.put(425421624, "jXXykr");
        kolo2postaja.put(461467023, "ekdooH");
        kolo2postaja.put(531010306, "dVTiq");
        kolo2postaja.put(988566504, "PLoSv");
        kolo2postaja.put(852767003, "BYrTuJR");
        kolo2postaja.put(568362737, "wXMru");
        kolo2postaja.put(940840137, "BIhRdjT");
        kolo2postaja.put(408546109, "HNjtu");
        kolo2postaja.put(752980754, "yAzzHG");
        kolo2postaja.put(262993796, "yAzzHG");
        kolo2postaja.put(417553984, "uONuMV");
        kolo2postaja.put(487598944, "BIhRdjT");
        kolo2postaja.put(439503344, "uONuMV");
        kolo2postaja.put(309694925, "HjCspG");
        kolo2postaja.put(122549969, "QAaDMDN");
        kolo2postaja.put(109989483, "QAaDMDN");
        kolo2postaja.put(669275207, "uONuMV");
        kolo2postaja.put(65193842, "BIhRdjT");
        kolo2postaja.put(87870926, "BIhRdjT");
        kolo2postaja.put(308526177, "HjCspG");
        kolo2postaja.put(881303148, "VPijdW");
        kolo2postaja.put(321108261, "uLABOOM");
        kolo2postaja.put(734273025, "VPijdW");
        kolo2postaja.put(661180229, "uLABOOM");
        kolo2postaja.put(765459382, "wIazs");
        kolo2postaja.put(559203685, "ueFEjZD");
        kolo2postaja.put(408856009, "dVTiq");
        kolo2postaja.put(544824220, "BYrTuJR");
        kolo2postaja.put(714900122, "uONuMV");
        kolo2postaja.put(923240881, "BYrTuJR");
        kolo2postaja.put(289602863, "ueFEjZD");
        kolo2postaja.put(178511788, "nxBfh");
        kolo2postaja.put(634921105, "xXIkh");

        List<String> postaje = new ArrayList<>(new TreeSet<>(kolo2postaja.values()));
        postaje.sort(null);

        Cetrta.Sistem sistem = new Cetrta.Sistem(kolo2postaja);
        sistem.izposoja(122549969);
        sistem.vracilo(122549969, "HNjtu");
        sistem.izposoja(417553984);
        sistem.izposoja(765459382);
        sistem.vracilo(765459382, "nxBfh");
        sistem.izposoja(852767003);
        sistem.izposoja(895095837);
        sistem.izposoja(589402200);
        sistem.vracilo(852767003, "wIazs");
        sistem.vracilo(589402200, "BYrTuJR");
        sistem.izposoja(109989483);
        sistem.vracilo(895095837, "PLoSv");
        sistem.izposoja(391227395);
        sistem.vracilo(417553984, "BIhRdjT");
        sistem.izposoja(425421624);
        sistem.vracilo(109989483, "wXMru");
        sistem.izposoja(217728509);
        sistem.izposoja(734273025);
        sistem.izposoja(940840137);
        sistem.izposoja(544824220);
        sistem.vracilo(391227395, "wXMru");
        sistem.izposoja(531010306);
        sistem.vracilo(544824220, "ekdooH");
        sistem.vracilo(531010306, "jXXykr");
        sistem.izposoja(829512639);
        sistem.vracilo(734273025, "RWVXth");
        sistem.izposoja(661180229);
        sistem.izposoja(262993796);
        sistem.izposoja(895095837);
        sistem.vracilo(895095837, "uLABOOM");
        sistem.izposoja(122549969);
        sistem.izposoja(461467023);
        sistem.vracilo(661180229, "wIazs");
        sistem.izposoja(988566504);
        sistem.izposoja(589402200);
        sistem.vracilo(988566504, "HjCspG");
        sistem.vracilo(589402200, "QAaDMDN");
        sistem.izposoja(65193842);
        sistem.vracilo(122549969, "ekdooH");
        sistem.izposoja(391227395);
        sistem.vracilo(65193842, "RWVXth");
        sistem.izposoja(765459382);
        sistem.izposoja(408546109);
        sistem.izposoja(756712157);
        sistem.izposoja(87870926);
        sistem.izposoja(531010306);
        sistem.vracilo(262993796, "uONuMV");
        sistem.izposoja(895095837);
        sistem.izposoja(178511788);
        sistem.izposoja(122549969);
        sistem.vracilo(87870926, "HNjtu");
        sistem.vracilo(461467023, "RWVXth");
        sistem.izposoja(65193842);
        sistem.izposoja(589402200);
        sistem.izposoja(559203685);
        sistem.izposoja(408856009);
        sistem.izposoja(439503344);
        sistem.izposoja(262993796);

        for (String postaja: postaje) {
            Set<Integer> kolesa = sistem.kolesaNaPostaji(postaja);
            List<Integer> seznam = new ArrayList<>(kolesa);
            seznam.sort(null);
            System.out.printf("%s -> %s%n", postaja, seznam);
        }
    }
}
