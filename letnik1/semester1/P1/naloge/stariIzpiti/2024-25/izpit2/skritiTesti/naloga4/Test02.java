
import java.util.*;

public class Test02 {

    public static void main(String[] args) {
        Map<Integer, String> kolo2postaja = new TreeMap<>();
        kolo2postaja.put(217852981, "jnJMbG");
        kolo2postaja.put(820878167, "FibQILc");
        kolo2postaja.put(273027765, "aSNlgN");
        kolo2postaja.put(720038154, "cJLiAg");
        kolo2postaja.put(175520519, "VIHaBf");
        kolo2postaja.put(263264417, "sZKxcHC");
        kolo2postaja.put(704092867, "CjowR");
        kolo2postaja.put(42629298, "KKtlZ");
        kolo2postaja.put(665917660, "CfuxH");
        kolo2postaja.put(129415214, "xFZRZt");
        kolo2postaja.put(748636037, "vWlWF");
        kolo2postaja.put(229330865, "SYOTfr");
        kolo2postaja.put(459368110, "MfRsa");
        kolo2postaja.put(313692421, "CjowR");
        kolo2postaja.put(546427212, "SnZlR");
        kolo2postaja.put(609087813, "sSAgMj");
        kolo2postaja.put(298947782, "VIHaBf");
        kolo2postaja.put(516204, "YkULSsc");
        kolo2postaja.put(29736192, "StxzW");
        kolo2postaja.put(546369577, "FRAms");
        kolo2postaja.put(372275853, "UlVNbRl");
        kolo2postaja.put(570493950, "bNpytgs");
        kolo2postaja.put(504054627, "SnZlR");
        kolo2postaja.put(8713178, "jGNSx");
        kolo2postaja.put(645721609, "UIWCU");
        kolo2postaja.put(416061340, "iFkQBvO");
        kolo2postaja.put(764477743, "BtqYW");
        kolo2postaja.put(799821359, "BtqYW");
        kolo2postaja.put(524484500, "bDDoAW");
        kolo2postaja.put(345517378, "jGNSx");
        kolo2postaja.put(962370254, "xWOuQFQ");
        kolo2postaja.put(102460221, "MAfEt");
        kolo2postaja.put(214481257, "FOPtl");
        kolo2postaja.put(795026848, "YdFCmm");
        kolo2postaja.put(383753852, "BXkwq");
        kolo2postaja.put(344365993, "WIFva");
        kolo2postaja.put(460519495, "FibQILc");
        kolo2postaja.put(507297595, "UlVNbRl");
        kolo2postaja.put(781164392, "WIFva");
        kolo2postaja.put(491565166, "BXkwq");
        kolo2postaja.put(976462332, "cSrxB");
        kolo2postaja.put(791833428, "MAfEt");
        kolo2postaja.put(166289767, "hJHnZ");
        kolo2postaja.put(4690024, "rIIKo");
        kolo2postaja.put(555165272, "aSNlgN");
        kolo2postaja.put(543810767, "sZKxcHC");
        kolo2postaja.put(962142105, "AfUZNY");
        kolo2postaja.put(554583432, "UlVNbRl");
        kolo2postaja.put(154708331, "MAfEt");
        kolo2postaja.put(312393395, "pBwwkj");
        kolo2postaja.put(89958394, "AfUZNY");
        kolo2postaja.put(177358040, "hYtBIu");
        kolo2postaja.put(311419366, "BtqYW");
        kolo2postaja.put(657722510, "UIWCU");
        kolo2postaja.put(789329232, "aSNlgN");
        kolo2postaja.put(164995139, "xBsTHMW");
        kolo2postaja.put(918985109, "kQZphg");
        kolo2postaja.put(937284766, "bDDoAW");
        kolo2postaja.put(653432234, "MfRsa");
        kolo2postaja.put(115434762, "VIHaBf");
        kolo2postaja.put(340136332, "klSpZjp");
        kolo2postaja.put(106412040, "jnJMbG");
        kolo2postaja.put(698037004, "OvMVv");
        kolo2postaja.put(285371354, "WAnkelc");
        kolo2postaja.put(95841243, "BeMyfGJ");
        kolo2postaja.put(413852656, "OyTDr");
        kolo2postaja.put(39801164, "uFTkr");
        kolo2postaja.put(106673498, "SnZlR");
        kolo2postaja.put(269360416, "tKLWB");
        kolo2postaja.put(824753427, "AqfHO");
        kolo2postaja.put(974752154, "WAnkelc");
        kolo2postaja.put(591904126, "SnZlR");
        kolo2postaja.put(671361567, "YkULSsc");
        kolo2postaja.put(27903151, "SYOTfr");
        kolo2postaja.put(695295464, "StxzW");
        kolo2postaja.put(142453674, "BtqYW");
        kolo2postaja.put(198369564, "OCfBO");
        kolo2postaja.put(606790475, "WIFva");

        Cetrta.Sistem sistem = new Cetrta.Sistem(kolo2postaja);
        sistem.izposoja(27903151);
        sistem.izposoja(962370254);
        sistem.izposoja(198369564);
        sistem.izposoja(214481257);
        sistem.izposoja(273027765);
        sistem.izposoja(976462332);

        Map<Integer, Boolean> statusi = sistem.statusiKoles();
        List<Integer> kolesa = new ArrayList<>(statusi.keySet());
        kolesa.sort(null);
        for (int kolo: kolesa) {
            System.out.printf("%d -> %b%n", kolo, statusi.get(kolo));
        }
    }
}
