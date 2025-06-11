
import java.util.*;

public class Test04 {

    public static void main(String[] args) {
        Map<Integer, String> kolo2postaja = new TreeMap<>();
        kolo2postaja.put(143992822, "SaMgomx");
        kolo2postaja.put(368067914, "WUMVsur");
        kolo2postaja.put(11148418, "Vibyd");
        kolo2postaja.put(136168157, "eqNUQ");
        kolo2postaja.put(212267839, "pTbIbb");
        kolo2postaja.put(941755898, "VmDrO");
        kolo2postaja.put(337740127, "Vibyd");
        kolo2postaja.put(122301303, "CVuodM");
        kolo2postaja.put(7828342, "SaMgomx");
        kolo2postaja.put(300467423, "LSaiu");
        kolo2postaja.put(68926565, "fbpIB");
        kolo2postaja.put(956645728, "SaMgomx");
        kolo2postaja.put(122979699, "VmDrO");
        kolo2postaja.put(871936621, "Vibyd");
        kolo2postaja.put(742970168, "VmDrO");
        kolo2postaja.put(990025057, "rMbtxB");
        kolo2postaja.put(804720530, "EgRCyG");
        kolo2postaja.put(812275336, "SaMgomx");
        kolo2postaja.put(964362137, "VmDrO");
        kolo2postaja.put(971063933, "SaMgomx");
        kolo2postaja.put(364778913, "JPrRt");
        kolo2postaja.put(380113499, "kVifr");
        kolo2postaja.put(523372146, "TANcS");
        kolo2postaja.put(130850715, "CVuodM");
        kolo2postaja.put(398794517, "eqNUQ");
        kolo2postaja.put(878124260, "VmDrO");
        kolo2postaja.put(991219849, "rMbtxB");
        kolo2postaja.put(309728862, "LwTkKQ");
        kolo2postaja.put(902163199, "qowEW");
        kolo2postaja.put(588889014, "LwTkKQ");
        kolo2postaja.put(187232608, "CVuodM");
        kolo2postaja.put(40816055, "eqNUQ");
        kolo2postaja.put(935553247, "pTbIbb");
        kolo2postaja.put(375309296, "kVifr");
        kolo2postaja.put(559187062, "PFkae");
        kolo2postaja.put(411082493, "VmDrO");
        kolo2postaja.put(562223489, "LwTkKQ");
        kolo2postaja.put(310791727, "qUFhzsA");
        kolo2postaja.put(983010541, "kRFPy");
        kolo2postaja.put(271408445, "VzbvXTG");
        kolo2postaja.put(41421418, "TANcS");
        kolo2postaja.put(21108306, "LwTkKQ");
        kolo2postaja.put(939293731, "kVifr");
        kolo2postaja.put(190017739, "rMbtxB");
        kolo2postaja.put(973086807, "SaMgomx");
        kolo2postaja.put(563816229, "kRFPy");
        kolo2postaja.put(664620675, "pTbIbb");
        kolo2postaja.put(233231240, "WUMVsur");
        kolo2postaja.put(675408219, "SaMgomx");
        kolo2postaja.put(36625251, "EgRCyG");
        kolo2postaja.put(479198252, "pTbIbb");
        kolo2postaja.put(659987772, "lsdqc");
        kolo2postaja.put(61726403, "rMbtxB");
        kolo2postaja.put(228461807, "VmDrO");
        kolo2postaja.put(869934050, "fbpIB");
        kolo2postaja.put(167387944, "rMbtxB");
        kolo2postaja.put(750096350, "LwTkKQ");
        kolo2postaja.put(674639256, "EgRCyG");
        kolo2postaja.put(744290022, "LwTkKQ");
        kolo2postaja.put(575353873, "VmDrO");
        kolo2postaja.put(755927880, "CVuodM");

        Cetrta.Sistem sistem = new Cetrta.Sistem(kolo2postaja);
        sistem.izposoja(973086807);
        sistem.izposoja(68926565);
        sistem.izposoja(167387944);
        sistem.izposoja(233231240);
        sistem.izposoja(143992822);
        sistem.izposoja(664620675);
        sistem.izposoja(130850715);
        sistem.izposoja(7828342);
        sistem.izposoja(750096350);
        sistem.izposoja(375309296);
        sistem.izposoja(122301303);
        sistem.izposoja(804720530);
        sistem.izposoja(744290022);
        sistem.izposoja(479198252);
        sistem.izposoja(964362137);
        sistem.izposoja(563816229);
        sistem.izposoja(742970168);
        sistem.izposoja(364778913);
        sistem.izposoja(187232608);

        Map<Integer, Boolean> statusi = sistem.statusiKoles();
        List<Integer> kolesa = new ArrayList<>(statusi.keySet());
        kolesa.sort(null);
        for (int kolo: kolesa) {
            System.out.printf("%d -> %b%n", kolo, statusi.get(kolo));
        }
    }
}
