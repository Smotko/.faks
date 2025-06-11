
import java.util.*;

public class Test12 {

    public static void main(String[] args) {
        Map<Integer, String> kolo2postaja = new TreeMap<>();
        kolo2postaja.put(387366217, "rOCwe");
        kolo2postaja.put(778785310, "efazD");
        kolo2postaja.put(396117281, "rPsoQQ");
        kolo2postaja.put(21245216, "wdxAxW");
        kolo2postaja.put(728885704, "HLBoinC");
        kolo2postaja.put(987380603, "GZHKD");
        kolo2postaja.put(843229919, "DaEWet");
        kolo2postaja.put(328418917, "fhiyB");
        kolo2postaja.put(929105245, "oeNTAzm");
        kolo2postaja.put(635216829, "DaEWet");
        kolo2postaja.put(48713197, "NgYhIlF");
        kolo2postaja.put(26294557, "HLBoinC");
        kolo2postaja.put(864642355, "ZDGohyA");
        kolo2postaja.put(666775229, "uwOkZ");
        kolo2postaja.put(392805503, "wIlMEy");
        kolo2postaja.put(632312301, "ixALTcW");
        kolo2postaja.put(31779243, "xoCvr");
        kolo2postaja.put(699537660, "JJXQMSq");
        kolo2postaja.put(536316408, "RvlWnnf");
        kolo2postaja.put(873938497, "zIUxQ");
        kolo2postaja.put(48999725, "DzwwT");
        kolo2postaja.put(383128466, "fhiyB");
        kolo2postaja.put(391373598, "NgYhIlF");
        kolo2postaja.put(207855726, "VkeZlGn");
        kolo2postaja.put(831406988, "FxLNSx");
        kolo2postaja.put(379215621, "wdxAxW");
        kolo2postaja.put(144077913, "uwOkZ");
        kolo2postaja.put(664166781, "GZHKD");
        kolo2postaja.put(327616896, "zIUxQ");
        kolo2postaja.put(358700422, "oeNTAzm");
        kolo2postaja.put(929291897, "ajPgW");
        kolo2postaja.put(678389918, "DaEWet");
        kolo2postaja.put(866030472, "eMVYIb");
        kolo2postaja.put(837686097, "ixALTcW");
        kolo2postaja.put(939000621, "CZJKz");
        kolo2postaja.put(34257514, "igiDSY");
        kolo2postaja.put(705481956, "DzwwT");
        kolo2postaja.put(852415907, "JJXQMSq");
        kolo2postaja.put(438171911, "iwDaOn");
        kolo2postaja.put(526072440, "DaEWet");
        kolo2postaja.put(313298918, "SYSlVc");
        kolo2postaja.put(169591400, "GZHKD");

        List<String> postaje = new ArrayList<>(new TreeSet<>(kolo2postaja.values()));
        postaje.sort(null);

        Cetrta.Sistem sistem = new Cetrta.Sistem(kolo2postaja);
        sistem.izposoja(635216829);
        sistem.izposoja(536316408);
        sistem.izposoja(843229919);
        sistem.izposoja(313298918);
        sistem.izposoja(383128466);
        sistem.izposoja(778785310);
        sistem.izposoja(438171911);
        sistem.izposoja(852415907);
        sistem.izposoja(939000621);
        sistem.vracilo(383128466, "eMVYIb");
        sistem.izposoja(392805503);
        sistem.izposoja(632312301);
        sistem.izposoja(144077913);
        sistem.izposoja(328418917);
        sistem.izposoja(21245216);
        sistem.izposoja(31779243);
        sistem.vracilo(31779243, "JJXQMSq");
        sistem.izposoja(664166781);
        sistem.izposoja(873938497);
        sistem.izposoja(929291897);
        sistem.izposoja(526072440);
        sistem.izposoja(728885704);
        sistem.izposoja(864642355);
        sistem.izposoja(327616896);
        sistem.izposoja(379215621);
        sistem.izposoja(837686097);
        sistem.izposoja(666775229);
        sistem.vracilo(379215621, "SYSlVc");
        sistem.izposoja(866030472);
        sistem.vracilo(929291897, "wdxAxW");
        sistem.vracilo(392805503, "SYSlVc");
        sistem.vracilo(526072440, "VkeZlGn");
        sistem.izposoja(169591400);
        sistem.vracilo(864642355, "DzwwT");
        sistem.vracilo(328418917, "DzwwT");
        sistem.izposoja(526072440);
        sistem.izposoja(207855726);
        sistem.izposoja(387366217);
        sistem.izposoja(678389918);
        sistem.izposoja(379215621);
        sistem.izposoja(358700422);
        sistem.izposoja(383128466);
        sistem.izposoja(831406988);
        sistem.vracilo(664166781, "DaEWet");
        sistem.izposoja(48713197);
        sistem.izposoja(31779243);
        sistem.vracilo(536316408, "DzwwT");
        sistem.izposoja(328418917);
        sistem.izposoja(34257514);
        sistem.izposoja(392805503);
        sistem.izposoja(536316408);
        sistem.izposoja(26294557);
        sistem.izposoja(929105245);
        sistem.izposoja(699537660);
        sistem.vracilo(831406988, "HLBoinC");
        sistem.izposoja(48999725);
        sistem.izposoja(864642355);
        sistem.izposoja(705481956);
        sistem.izposoja(929291897);
        sistem.vracilo(843229919, "ajPgW");
        sistem.izposoja(396117281);
        sistem.izposoja(664166781);
        sistem.izposoja(843229919);
        sistem.vracilo(778785310, "zIUxQ");

        for (String postaja: postaje) {
            Set<Integer> kolesa = sistem.kolesaNaPostaji(postaja);
            List<Integer> seznam = new ArrayList<>(kolesa);
            seznam.sort(null);
            System.out.printf("%s -> %s%n", postaja, seznam);
        }
    }
}
