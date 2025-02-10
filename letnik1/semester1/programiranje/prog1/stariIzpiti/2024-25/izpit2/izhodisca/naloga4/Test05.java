
import java.util.*;

public class Test05 {

    public static void main(String[] args) {
        Map<Integer, String> kolo2postaja = new TreeMap<>();
        kolo2postaja.put(836921370, "NxthwnS");
        kolo2postaja.put(326457372, "NCBANMr");
        kolo2postaja.put(749547002, "ntzQtY");
        kolo2postaja.put(739290156, "wZTkjZ");
        kolo2postaja.put(401298317, "dkbXRU");
        kolo2postaja.put(611312375, "ntzQtY");
        kolo2postaja.put(254948388, "NxthwnS");
        kolo2postaja.put(76473638, "wZTkjZ");
        kolo2postaja.put(245058329, "pfpxHVa");
        kolo2postaja.put(124415788, "eWGXmFG");
        kolo2postaja.put(151032946, "BrhLj");
        kolo2postaja.put(387603445, "DTDeSe");
        kolo2postaja.put(275713266, "DRbeyaD");
        kolo2postaja.put(63468457, "YsTiY");
        kolo2postaja.put(194465942, "NCBANMr");
        kolo2postaja.put(874241103, "uKKHqGk");
        kolo2postaja.put(491394479, "NxthwnS");
        kolo2postaja.put(277426617, "KmGfIil");
        kolo2postaja.put(490898087, "XSLJs");
        kolo2postaja.put(630086210, "BrhLj");
        kolo2postaja.put(453163540, "NxthwnS");
        kolo2postaja.put(340632909, "OXbuEI");
        kolo2postaja.put(107373986, "vwbJtn");
        kolo2postaja.put(959793004, "qPLBG");
        kolo2postaja.put(57333119, "NCBANMr");
        kolo2postaja.put(732698254, "bHpzv");
        kolo2postaja.put(687645921, "BrhLj");
        kolo2postaja.put(229627088, "XSLJs");
        kolo2postaja.put(736526436, "YTWssL");
        kolo2postaja.put(899202974, "weudI");
        kolo2postaja.put(965417030, "PWwVifr");
        kolo2postaja.put(240857460, "ZJaIeBz");
        kolo2postaja.put(175083941, "rZCOlSZ");
        kolo2postaja.put(949169326, "QAUYFnX");
        kolo2postaja.put(634130100, "wobRk");
        kolo2postaja.put(454632577, "vAhCtS");
        kolo2postaja.put(604189392, "OXbuEI");
        kolo2postaja.put(390649831, "NxthwnS");
        kolo2postaja.put(124459855, "NCBANMr");
        kolo2postaja.put(547492763, "DTDeSe");
        kolo2postaja.put(855622108, "TGZdffj");
        kolo2postaja.put(191446806, "dkbXRU");
        kolo2postaja.put(375744132, "iYJaW");
        kolo2postaja.put(86592528, "GjYraQg");
        kolo2postaja.put(70805214, "bHpzv");
        kolo2postaja.put(854750311, "dREuIFI");
        kolo2postaja.put(35179783, "OXbuEI");
        kolo2postaja.put(515802565, "xruLF");
        kolo2postaja.put(241339972, "NCBANMr");
        kolo2postaja.put(262081834, "wZTkjZ");
        kolo2postaja.put(864285422, "OYTmFmf");
        kolo2postaja.put(241486692, "OXbuEI");
        kolo2postaja.put(658959161, "OXbuEI");
        kolo2postaja.put(337134515, "dREuIFI");
        kolo2postaja.put(379655636, "YTWssL");
        kolo2postaja.put(457656318, "xruLF");

        List<String> postaje = new ArrayList<>(new TreeSet<>(kolo2postaja.values()));
        postaje.sort(null);

        Cetrta.Sistem sistem = new Cetrta.Sistem(kolo2postaja);
        sistem.izposoja(124459855);
        sistem.izposoja(687645921);
        sistem.izposoja(70805214);
        sistem.izposoja(57333119);
        sistem.izposoja(899202974);
        sistem.izposoja(749547002);
        sistem.izposoja(194465942);
        sistem.izposoja(491394479);
        sistem.izposoja(874241103);
        sistem.izposoja(175083941);
        sistem.izposoja(245058329);
        sistem.izposoja(337134515);
        sistem.izposoja(949169326);

        for (String postaja: postaje) {
            Set<Integer> kolesa = sistem.kolesaNaPostaji(postaja);
            List<Integer> seznam = new ArrayList<>(kolesa);
            seznam.sort(null);
            System.out.printf("%s -> %s%n", postaja, seznam);
        }
    }
}
