
import java.util.*;

public class Test02 {

    public static void main(String[] args) {
        Map<Integer, String> kolo2postaja = new TreeMap<>();
        kolo2postaja.put(587328301, "sfQWvW");
        kolo2postaja.put(268654606, "AzoIOAl");
        kolo2postaja.put(268517952, "sfQWvW");
        kolo2postaja.put(653250795, "AzoIOAl");
        kolo2postaja.put(438231123, "eFtVta");
        kolo2postaja.put(214268927, "pJAvZVM");
        kolo2postaja.put(818660750, "aXLHJI");
        kolo2postaja.put(798123303, "bmyLJ");
        kolo2postaja.put(563844748, "pVzlMWF");
        kolo2postaja.put(890694717, "XQoIBXQ");
        kolo2postaja.put(900972898, "eFtVta");
        kolo2postaja.put(459344254, "XQoIBXQ");
        kolo2postaja.put(460886555, "sfQWvW");
        kolo2postaja.put(267704638, "GvbYKLF");
        kolo2postaja.put(342373526, "LEVZjH");
        kolo2postaja.put(944085779, "GvbYKLF");
        kolo2postaja.put(70301682, "AzoIOAl");
        kolo2postaja.put(476898400, "pVzlMWF");
        kolo2postaja.put(285942944, "QiMlgXP");
        kolo2postaja.put(353023925, "fEhgdk");
        kolo2postaja.put(554972642, "AIxFrM");
        kolo2postaja.put(439351875, "pJAvZVM");
        kolo2postaja.put(947816923, "BNSPx");
        kolo2postaja.put(734433756, "ilyuQ");
        kolo2postaja.put(305118051, "aXLHJI");
        kolo2postaja.put(969053709, "XQoIBXQ");
        kolo2postaja.put(728730090, "XQoIBXQ");
        kolo2postaja.put(475973432, "GvbYKLF");
        kolo2postaja.put(135587452, "BNSPx");
        kolo2postaja.put(229737621, "AIxFrM");
        kolo2postaja.put(295243469, "OpUsuNm");
        kolo2postaja.put(613634951, "OpUsuNm");
        kolo2postaja.put(746311364, "pJAvZVM");
        kolo2postaja.put(964896656, "GvbYKLF");
        kolo2postaja.put(512687374, "VnjqjFR");
        kolo2postaja.put(668676267, "VnjqjFR");
        kolo2postaja.put(680084762, "aXLHJI");
        kolo2postaja.put(207765167, "HINtDL");
        kolo2postaja.put(417765872, "pVzlMWF");
        kolo2postaja.put(122958409, "eFtVta");
        kolo2postaja.put(860594056, "BPzKO");
        kolo2postaja.put(66587148, "iGJzxM");
        kolo2postaja.put(33782958, "BtPal");
        kolo2postaja.put(980502530, "VnjqjFR");
        kolo2postaja.put(358252787, "fEhgdk");
        kolo2postaja.put(689133884, "VnjqjFR");
        kolo2postaja.put(241275183, "BNSPx");
        kolo2postaja.put(539146746, "GvbYKLF");

        Cetrta.Sistem sistem = new Cetrta.Sistem(kolo2postaja);
        sistem.izposoja(417765872);
        sistem.izposoja(668676267);
        sistem.izposoja(135587452);
        sistem.izposoja(734433756);
        sistem.izposoja(818660750);
        sistem.izposoja(295243469);
        sistem.izposoja(653250795);
        sistem.izposoja(70301682);
        sistem.izposoja(33782958);
        sistem.izposoja(964896656);

        Map<Integer, Boolean> statusi = sistem.statusiKoles();
        List<Integer> kolesa = new ArrayList<>(statusi.keySet());
        kolesa.sort(null);
        for (int kolo: kolesa) {
            System.out.printf("%d -> %b%n", kolo, statusi.get(kolo));
        }
    }
}
