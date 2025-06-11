
import java.util.*;

public class Test39 {

    public static void main(String[] args) {
        Map<Integer, String> kolo2postaja = new TreeMap<>();
        kolo2postaja.put(31495795, "IvreGL");
        kolo2postaja.put(103728923, "IvreGL");
        kolo2postaja.put(239247717, "dpPbQa");
        kolo2postaja.put(585757650, "HGPYcWK");
        kolo2postaja.put(121504125, "IvreGL");
        kolo2postaja.put(835583812, "HGPYcWK");
        kolo2postaja.put(85882089, "OACISlR");
        kolo2postaja.put(217013004, "CUnfuRm");
        kolo2postaja.put(173302639, "bPIxEA");
        kolo2postaja.put(633710537, "ILzmrME");
        kolo2postaja.put(919351008, "HGPYcWK");
        kolo2postaja.put(173029236, "dAnrQ");
        kolo2postaja.put(891968974, "ILzmrME");
        kolo2postaja.put(641892682, "ILzmrME");
        kolo2postaja.put(693778060, "HGPYcWK");
        kolo2postaja.put(55547666, "YjUuBe");
        kolo2postaja.put(435967689, "OACISlR");
        kolo2postaja.put(910174494, "HGPYcWK");
        kolo2postaja.put(114618034, "YjUuBe");
        kolo2postaja.put(210940213, "IvreGL");
        kolo2postaja.put(773226280, "bPIxEA");
        kolo2postaja.put(99960343, "QqGfV");
        kolo2postaja.put(32289360, "HGPYcWK");
        kolo2postaja.put(926847414, "HGPYcWK");
        kolo2postaja.put(493285482, "dAnrQ");
        kolo2postaja.put(716111628, "LbkeDge");
        kolo2postaja.put(954777640, "QqGfV");
        kolo2postaja.put(50387351, "OACISlR");
        kolo2postaja.put(428630097, "bPIxEA");

        List<String> postaje = new ArrayList<>(new TreeSet<>(kolo2postaja.values()));
        postaje.sort(null);

        Cetrta.Sistem sistem = new Cetrta.Sistem(kolo2postaja);
        sistem.izposoja(716111628);
        sistem.izposoja(173302639);
        sistem.izposoja(210940213);
        sistem.izposoja(633710537);
        sistem.izposoja(773226280);
        sistem.izposoja(910174494);
        sistem.vracilo(773226280, "IvreGL");
        sistem.izposoja(55547666);
        sistem.izposoja(773226280);
        sistem.vracilo(773226280, "bPIxEA");
        sistem.izposoja(239247717);
        sistem.izposoja(641892682);
        sistem.vracilo(641892682, "HGPYcWK");
        sistem.izposoja(85882089);
        sistem.izposoja(493285482);
        sistem.izposoja(435967689);
        sistem.izposoja(954777640);
        sistem.vracilo(910174494, "CUnfuRm");
        sistem.izposoja(121504125);
        sistem.izposoja(32289360);
        sistem.izposoja(173029236);
        sistem.vracilo(85882089, "dAnrQ");
        sistem.izposoja(835583812);
        sistem.izposoja(428630097);
        sistem.izposoja(217013004);
        sistem.izposoja(693778060);
        sistem.izposoja(99960343);
        sistem.izposoja(85882089);
        sistem.izposoja(773226280);
        sistem.izposoja(641892682);
        sistem.izposoja(891968974);
        sistem.vracilo(693778060, "dpPbQa");
        sistem.izposoja(114618034);
        sistem.izposoja(919351008);

        for (String postaja: postaje) {
            Set<Integer> kolesa = sistem.kolesaNaPostaji(postaja);
            List<Integer> seznam = new ArrayList<>(kolesa);
            seznam.sort(null);
            System.out.printf("%s -> %s%n", postaja, seznam);
        }
    }
}
