
import java.util.*;

public class Test12 {

    public static void main(String[] args) {
        Map<Integer, String> kolo2postaja = new TreeMap<>();
        kolo2postaja.put(191377606, "KoJZGl");
        kolo2postaja.put(143875822, "KoJZGl");
        kolo2postaja.put(927529805, "lGDiV");
        kolo2postaja.put(881474043, "hacpi");
        kolo2postaja.put(762147056, "EOTrArk");
        kolo2postaja.put(60796522, "KoJZGl");
        kolo2postaja.put(199926508, "KoJZGl");
        kolo2postaja.put(628783349, "EOTrArk");
        kolo2postaja.put(216326722, "NAJlxC");
        kolo2postaja.put(829446603, "lGDiV");
        kolo2postaja.put(956305927, "RCcfe");
        kolo2postaja.put(576336049, "EOTrArk");
        kolo2postaja.put(419579945, "UHfUPrg");
        kolo2postaja.put(410286066, "GZzilDS");
        kolo2postaja.put(145955352, "JDQPcKG");
        kolo2postaja.put(431465161, "UHfUPrg");
        kolo2postaja.put(748503401, "KoJZGl");
        kolo2postaja.put(207304170, "KhkedP");
        kolo2postaja.put(471608348, "lGDiV");
        kolo2postaja.put(313886359, "ckHHPd");
        kolo2postaja.put(123823950, "KoJZGl");
        kolo2postaja.put(585898121, "xVyuYHR");
        kolo2postaja.put(453088474, "kbexpO");
        kolo2postaja.put(143961025, "rclQv");
        kolo2postaja.put(716723741, "EOTrArk");
        kolo2postaja.put(454887675, "KhkedP");
        kolo2postaja.put(535077233, "NAJlxC");
        kolo2postaja.put(745308278, "KoJZGl");
        kolo2postaja.put(406305037, "RCcfe");
        kolo2postaja.put(27067542, "EOTrArk");
        kolo2postaja.put(108305386, "KhkedP");
        kolo2postaja.put(315066514, "GZzilDS");
        kolo2postaja.put(745316157, "NdTDSL");
        kolo2postaja.put(538421366, "kbexpO");
        kolo2postaja.put(820962054, "rclQv");
        kolo2postaja.put(642161500, "KhkedP");
        kolo2postaja.put(468276505, "kbexpO");
        kolo2postaja.put(905213056, "epLWA");
        kolo2postaja.put(78638062, "NAJlxC");
        kolo2postaja.put(876770826, "kbexpO");
        kolo2postaja.put(742191332, "JDQPcKG");
        kolo2postaja.put(426692315, "YgIWDl");
        kolo2postaja.put(512617643, "KhkedP");
        kolo2postaja.put(797636300, "epLWA");
        kolo2postaja.put(309835831, "epLWA");
        kolo2postaja.put(567011562, "lGDiV");
        kolo2postaja.put(656900486, "JDQPcKG");
        kolo2postaja.put(874586968, "EOTrArk");
        kolo2postaja.put(587559969, "hacpi");

        Cetrta.Sistem sistem = new Cetrta.Sistem(kolo2postaja);
        sistem.izposoja(207304170);
        sistem.izposoja(567011562);
        sistem.izposoja(123823950);

        Map<Integer, Boolean> statusi = sistem.statusiKoles();
        List<Integer> kolesa = new ArrayList<>(statusi.keySet());
        kolesa.sort(null);
        for (int kolo: kolesa) {
            System.out.printf("%d -> %b%n", kolo, statusi.get(kolo));
        }
    }
}
