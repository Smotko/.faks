
import java.util.*;

public class Test13 {

    public static void main(String[] args) {
        Map<Integer, String> kolo2postaja = new TreeMap<>();
        kolo2postaja.put(236821666, "CXCBnF");
        kolo2postaja.put(46433817, "Bakohr");
        kolo2postaja.put(233477601, "tenneW");
        kolo2postaja.put(357522289, "fzxrJ");
        kolo2postaja.put(703051218, "arzIP");
        kolo2postaja.put(726132431, "VwWwsy");
        kolo2postaja.put(121594949, "wEplhr");
        kolo2postaja.put(13241468, "fzxrJ");
        kolo2postaja.put(710387985, "wxwzgy");
        kolo2postaja.put(393646520, "ECuVE");
        kolo2postaja.put(416572282, "mbFSa");
        kolo2postaja.put(886132550, "GSoPLyl");
        kolo2postaja.put(364071630, "tenneW");
        kolo2postaja.put(773491199, "EhoHJWM");
        kolo2postaja.put(820512060, "fTvgVZH");
        kolo2postaja.put(732020199, "GSoPLyl");
        kolo2postaja.put(134405199, "hghlpu");
        kolo2postaja.put(921653519, "AhVDU");
        kolo2postaja.put(210851460, "ECuVE");
        kolo2postaja.put(638952416, "CdKesI");
        kolo2postaja.put(869115415, "JimfhWE");
        kolo2postaja.put(713410650, "EhoHJWM");
        kolo2postaja.put(239157017, "FPaAtSm");
        kolo2postaja.put(165930464, "ZWMkk");
        kolo2postaja.put(961843735, "AKDvWkL");
        kolo2postaja.put(236273689, "brmwSb");
        kolo2postaja.put(465012342, "brmwSb");
        kolo2postaja.put(165788351, "rDNSA");
        kolo2postaja.put(410653982, "OAetP");
        kolo2postaja.put(285803106, "Tojmd");
        kolo2postaja.put(241575501, "Bkneq");
        kolo2postaja.put(60997427, "brmwSb");
        kolo2postaja.put(580800325, "jOfHgb");
        kolo2postaja.put(605598644, "ECuVE");
        kolo2postaja.put(276579875, "AhVDU");
        kolo2postaja.put(599697102, "arzIP");
        kolo2postaja.put(964958963, "iMvCs");
        kolo2postaja.put(139725454, "FPaAtSm");
        kolo2postaja.put(84620889, "fTvgVZH");
        kolo2postaja.put(99636992, "fstMfk");
        kolo2postaja.put(216706007, "qmPwPL");
        kolo2postaja.put(582878452, "CXCBnF");
        kolo2postaja.put(547981819, "ECuVE");
        kolo2postaja.put(526773810, "fTvgVZH");
        kolo2postaja.put(207154711, "OAetP");
        kolo2postaja.put(755759785, "osGArP");
        kolo2postaja.put(955836099, "gilNos");
        kolo2postaja.put(82653057, "GSoPLyl");
        kolo2postaja.put(618034170, "HSCiLbn");
        kolo2postaja.put(48338971, "rDNSA");
        kolo2postaja.put(711702711, "JimfhWE");
        kolo2postaja.put(206039622, "vRuNUEj");
        kolo2postaja.put(17256876, "qmPwPL");
        kolo2postaja.put(111038523, "AJlHkhE");
        kolo2postaja.put(880633243, "RFbjtA");
        kolo2postaja.put(492961512, "brmwSb");
        kolo2postaja.put(101878333, "wxwzgy");
        kolo2postaja.put(608495163, "pTawhB");
        kolo2postaja.put(440648365, "NJBvrSY");
        kolo2postaja.put(775716479, "JimfhWE");
        kolo2postaja.put(375101941, "iMvCs");
        kolo2postaja.put(721789246, "PDylw");
        kolo2postaja.put(125274368, "GSoPLyl");
        kolo2postaja.put(543469835, "rDNSA");
        kolo2postaja.put(834816939, "AKDvWkL");
        kolo2postaja.put(516388760, "wEplhr");

        List<String> postaje = new ArrayList<>(new TreeSet<>(kolo2postaja.values()));
        postaje.sort(null);

        Cetrta.Sistem sistem = new Cetrta.Sistem(kolo2postaja);
        sistem.izposoja(440648365);
        sistem.izposoja(608495163);
        sistem.izposoja(543469835);
        sistem.izposoja(755759785);
        sistem.izposoja(869115415);
        sistem.izposoja(17256876);
        sistem.izposoja(492961512);
        sistem.izposoja(921653519);
        sistem.izposoja(605598644);
        sistem.izposoja(961843735);
        sistem.izposoja(713410650);

        for (String postaja: postaje) {
            Set<Integer> kolesa = sistem.kolesaNaPostaji(postaja);
            List<Integer> seznam = new ArrayList<>(kolesa);
            seznam.sort(null);
            System.out.printf("%s -> %s%n", postaja, seznam);
        }
    }
}
