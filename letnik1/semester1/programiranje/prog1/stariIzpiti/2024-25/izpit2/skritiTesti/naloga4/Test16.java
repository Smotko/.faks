
import java.util.*;

public class Test16 {

    public static void main(String[] args) {
        Map<Integer, String> kolo2postaja = new TreeMap<>();
        kolo2postaja.put(524037535, "kSZoZ");
        kolo2postaja.put(989380462, "Kazhx");
        kolo2postaja.put(283087317, "PtLCd");
        kolo2postaja.put(397635257, "lZafKms");
        kolo2postaja.put(427352608, "MxBbCbW");
        kolo2postaja.put(622692128, "NcuUug");
        kolo2postaja.put(245713529, "lDhFtI");
        kolo2postaja.put(707622117, "kSZoZ");
        kolo2postaja.put(217176538, "jVWTU");
        kolo2postaja.put(898138999, "tqleT");
        kolo2postaja.put(299009792, "uMPYWfc");
        kolo2postaja.put(496173245, "rcLtLT");
        kolo2postaja.put(234876555, "NrgEz");
        kolo2postaja.put(45998289, "XptnnQ");
        kolo2postaja.put(669296231, "PmIkXgn");
        kolo2postaja.put(420678599, "jVWTU");
        kolo2postaja.put(369319408, "NcuUug");
        kolo2postaja.put(525834425, "zgvrEjg");
        kolo2postaja.put(801944339, "ndFMk");
        kolo2postaja.put(487906469, "JjVhWmc");
        kolo2postaja.put(371251660, "eSniw");
        kolo2postaja.put(598081268, "uxBqL");
        kolo2postaja.put(203633053, "mRUoF");
        kolo2postaja.put(83098193, "XptnnQ");
        kolo2postaja.put(438411155, "PtLCd");
        kolo2postaja.put(294039706, "haHXeNb");
        kolo2postaja.put(576246495, "zpdGn");
        kolo2postaja.put(289833681, "uMPYWfc");
        kolo2postaja.put(455872848, "olMXRtq");
        kolo2postaja.put(312543540, "CqAXB");
        kolo2postaja.put(561934833, "HMavU");
        kolo2postaja.put(84982082, "uMPYWfc");
        kolo2postaja.put(795320383, "KerYXz");
        kolo2postaja.put(956713232, "Fugzgiv");
        kolo2postaja.put(788262657, "CqAXB");
        kolo2postaja.put(136457706, "YVwfcbE");
        kolo2postaja.put(542477515, "oyAMSME");
        kolo2postaja.put(802605489, "uMPYWfc");
        kolo2postaja.put(825843937, "dHCWS");
        kolo2postaja.put(919800847, "jVWTU");
        kolo2postaja.put(312916752, "uxBqL");
        kolo2postaja.put(712737194, "enefO");
        kolo2postaja.put(624719670, "PPFReE");
        kolo2postaja.put(877667105, "XptnnQ");
        kolo2postaja.put(281395848, "PtLCd");
        kolo2postaja.put(702764761, "cTPLYu");
        kolo2postaja.put(179350055, "NcuUug");
        kolo2postaja.put(345067575, "FASvSpQ");
        kolo2postaja.put(212277207, "uMPYWfc");
        kolo2postaja.put(928064954, "cLPqln");
        kolo2postaja.put(390624307, "cLPqln");
        kolo2postaja.put(604648163, "cEIzi");
        kolo2postaja.put(531100559, "PtLCd");
        kolo2postaja.put(344774191, "ZMRsRI");
        kolo2postaja.put(882651012, "PmIkXgn");
        kolo2postaja.put(312683580, "dHCWS");
        kolo2postaja.put(162734030, "lZafKms");
        kolo2postaja.put(661140057, "PmIkXgn");
        kolo2postaja.put(314984465, "haHXeNb");
        kolo2postaja.put(232446917, "Fugzgiv");
        kolo2postaja.put(959305725, "ZMRsRI");
        kolo2postaja.put(896195185, "ZMRsRI");
        kolo2postaja.put(505083340, "lDhFtI");
        kolo2postaja.put(785924441, "CqAXB");
        kolo2postaja.put(768560440, "YkJybup");
        kolo2postaja.put(715333269, "eszGO");
        kolo2postaja.put(577996660, "PtLCd");
        kolo2postaja.put(82799492, "xWWfboO");
        kolo2postaja.put(49773038, "xWWfboO");
        kolo2postaja.put(534087220, "zpdGn");
        kolo2postaja.put(86378087, "XptnnQ");
        kolo2postaja.put(497714511, "jVWTU");
        kolo2postaja.put(819094926, "ndFMk");
        kolo2postaja.put(390683039, "pUMjw");
        kolo2postaja.put(382491403, "NcuUug");
        kolo2postaja.put(496833168, "VKghbI");
        kolo2postaja.put(676391743, "kVcWvM");
        kolo2postaja.put(434120870, "oUrUKWv");
        kolo2postaja.put(465664992, "ndFMk");
        kolo2postaja.put(483224690, "KerYXz");
        kolo2postaja.put(862851496, "HMavU");

        List<String> postaje = new ArrayList<>(new TreeSet<>(kolo2postaja.values()));
        postaje.sort(null);

        Cetrta.Sistem sistem = new Cetrta.Sistem(kolo2postaja);
        sistem.izposoja(768560440);
        sistem.izposoja(715333269);
        sistem.izposoja(84982082);
        sistem.izposoja(390683039);
        sistem.izposoja(427352608);
        sistem.izposoja(989380462);
        sistem.izposoja(525834425);
        sistem.izposoja(702764761);
        sistem.izposoja(82799492);
        sistem.izposoja(234876555);
        sistem.izposoja(795320383);
        sistem.izposoja(179350055);
        sistem.izposoja(531100559);
        sistem.izposoja(898138999);
        sistem.izposoja(882651012);
        sistem.izposoja(369319408);
        sistem.izposoja(314984465);
        sistem.izposoja(785924441);
        sistem.izposoja(524037535);
        sistem.izposoja(438411155);
        sistem.izposoja(896195185);
        sistem.izposoja(299009792);
        sistem.izposoja(598081268);
        sistem.izposoja(676391743);
        sistem.izposoja(312916752);
        sistem.izposoja(212277207);
        sistem.izposoja(281395848);
        sistem.izposoja(707622117);
        sistem.izposoja(622692128);
        sistem.izposoja(669296231);
        sistem.izposoja(382491403);
        sistem.izposoja(624719670);
        sistem.izposoja(232446917);
        sistem.izposoja(956713232);
        sistem.izposoja(534087220);
        sistem.izposoja(928064954);
        sistem.izposoja(877667105);
        sistem.izposoja(604648163);
        sistem.izposoja(86378087);
        sistem.izposoja(397635257);
        sistem.izposoja(496173245);
        sistem.izposoja(434120870);
        sistem.izposoja(420678599);
        sistem.izposoja(45998289);
        sistem.izposoja(661140057);
        sistem.izposoja(825843937);
        sistem.izposoja(283087317);
        sistem.izposoja(577996660);
        sistem.izposoja(465664992);
        sistem.izposoja(294039706);
        sistem.izposoja(203633053);
        sistem.izposoja(505083340);
        sistem.izposoja(455872848);
        sistem.izposoja(371251660);
        sistem.izposoja(959305725);
        sistem.izposoja(487906469);
        sistem.izposoja(483224690);

        for (String postaja: postaje) {
            Set<Integer> kolesa = sistem.kolesaNaPostaji(postaja);
            List<Integer> seznam = new ArrayList<>(kolesa);
            seznam.sort(null);
            System.out.printf("%s -> %s%n", postaja, seznam);
        }
    }
}
