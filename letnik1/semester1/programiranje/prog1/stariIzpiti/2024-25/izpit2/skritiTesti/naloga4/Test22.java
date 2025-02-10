
import java.util.*;

public class Test22 {

    public static void main(String[] args) {
        Map<Integer, String> kolo2postaja = new TreeMap<>();
        kolo2postaja.put(332880737, "PzhdX");
        kolo2postaja.put(564780937, "pNrkn");
        kolo2postaja.put(741440961, "GZkrEZ");
        kolo2postaja.put(961857514, "pNrkn");
        kolo2postaja.put(928885875, "PzhdX");
        kolo2postaja.put(400985729, "aXXck");
        kolo2postaja.put(171733691, "GZkrEZ");
        kolo2postaja.put(757517211, "oJruw");
        kolo2postaja.put(807090490, "PzhdX");
        kolo2postaja.put(15492333, "PMyFgO");
        kolo2postaja.put(884281594, "dEumhJ");
        kolo2postaja.put(164924913, "mOJct");
        kolo2postaja.put(391075260, "aXXck");
        kolo2postaja.put(651430175, "PMyFgO");
        kolo2postaja.put(637435248, "dEumhJ");
        kolo2postaja.put(153286221, "mOJct");
        kolo2postaja.put(249608478, "PzhdX");
        kolo2postaja.put(730454195, "oJruw");
        kolo2postaja.put(361515312, "mOJct");
        kolo2postaja.put(663498357, "mOJct");
        kolo2postaja.put(436866415, "mOJct");
        kolo2postaja.put(393602108, "PzhdX");
        kolo2postaja.put(282426355, "YgPpm");
        kolo2postaja.put(386411542, "YgPpm");
        kolo2postaja.put(769982820, "aXXck");
        kolo2postaja.put(511140892, "mOJct");
        kolo2postaja.put(195023924, "dEumhJ");
        kolo2postaja.put(728048210, "mOJct");
        kolo2postaja.put(141512368, "PMyFgO");
        kolo2postaja.put(192989363, "dEumhJ");
        kolo2postaja.put(996182148, "oJruw");
        kolo2postaja.put(454654954, "InQANy");
        kolo2postaja.put(910189227, "aXXck");
        kolo2postaja.put(524321188, "pNrkn");
        kolo2postaja.put(782453732, "dEumhJ");
        kolo2postaja.put(277990826, "dEumhJ");
        kolo2postaja.put(136004129, "InQANy");
        kolo2postaja.put(653302422, "oJruw");
        kolo2postaja.put(692089078, "mOJct");
        kolo2postaja.put(932382336, "oJruw");
        kolo2postaja.put(818435277, "YgPpm");
        kolo2postaja.put(892330256, "InQANy");
        kolo2postaja.put(395325914, "aXXck");
        kolo2postaja.put(276528900, "InQANy");

        List<String> postaje = new ArrayList<>(new TreeSet<>(kolo2postaja.values()));
        postaje.sort(null);

        Cetrta.Sistem sistem = new Cetrta.Sistem(kolo2postaja);
        sistem.izposoja(511140892);
        sistem.izposoja(653302422);
        sistem.izposoja(171733691);
        sistem.izposoja(663498357);
        sistem.izposoja(249608478);
        sistem.izposoja(996182148);
        sistem.izposoja(136004129);
        sistem.izposoja(961857514);

        for (String postaja: postaje) {
            Set<Integer> kolesa = sistem.kolesaNaPostaji(postaja);
            List<Integer> seznam = new ArrayList<>(kolesa);
            seznam.sort(null);
            System.out.printf("%s -> %s%n", postaja, seznam);
        }
    }
}
