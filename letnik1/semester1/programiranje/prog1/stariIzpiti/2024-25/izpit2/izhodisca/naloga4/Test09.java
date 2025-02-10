
import java.util.*;

public class Test09 {

    public static void main(String[] args) {
        Map<Integer, String> kolo2postaja = new TreeMap<>();
        kolo2postaja.put(154990790, "yROglwG");
        kolo2postaja.put(537568019, "iluII");
        kolo2postaja.put(987313184, "rpimz");
        kolo2postaja.put(648796354, "oHnDj");
        kolo2postaja.put(620015951, "oHnDj");
        kolo2postaja.put(18424466, "NfGQe");
        kolo2postaja.put(749963603, "NfGQe");
        kolo2postaja.put(285712068, "jFUiCwj");
        kolo2postaja.put(199217829, "ChYbNQ");
        kolo2postaja.put(579566166, "YZhyr");
        kolo2postaja.put(544712997, "YZhyr");
        kolo2postaja.put(222282725, "ChYbNQ");
        kolo2postaja.put(624741038, "EVIDu");
        kolo2postaja.put(308139322, "yROglwG");
        kolo2postaja.put(614056623, "Xsgsovg");
        kolo2postaja.put(818071365, "FIdQx");
        kolo2postaja.put(747040785, "ChYbNQ");
        kolo2postaja.put(958918825, "yROglwG");
        kolo2postaja.put(628563748, "EVIDu");
        kolo2postaja.put(931157306, "wjwoWs");
        kolo2postaja.put(711029618, "Xsgsovg");
        kolo2postaja.put(797796060, "beWRrUp");
        kolo2postaja.put(304617353, "GirLEEq");
        kolo2postaja.put(478614839, "WCUHalS");
        kolo2postaja.put(518830238, "oOeae");
        kolo2postaja.put(238623835, "ZBbEHtA");
        kolo2postaja.put(763698710, "yROglwG");
        kolo2postaja.put(39853525, "NfGQe");
        kolo2postaja.put(297737718, "RRtmVw");
        kolo2postaja.put(420640796, "GirLEEq");
        kolo2postaja.put(839340335, "beWRrUp");
        kolo2postaja.put(48760109, "HSXDZr");
        kolo2postaja.put(520658915, "aDLrLR");
        kolo2postaja.put(532788856, "tjHcwu");
        kolo2postaja.put(855020157, "tjHcwu");
        kolo2postaja.put(853174056, "ChYbNQ");
        kolo2postaja.put(421670667, "NfGQe");
        kolo2postaja.put(889782968, "XexPHZ");
        kolo2postaja.put(897059151, "YZhyr");
        kolo2postaja.put(455534957, "wjwoWs");
        kolo2postaja.put(823553473, "oHnDj");

        Cetrta.Sistem sistem = new Cetrta.Sistem(kolo2postaja);
        sistem.izposoja(222282725);
        sistem.izposoja(308139322);
        sistem.izposoja(711029618);
        sistem.vracilo(308139322, "yROglwG");
        sistem.izposoja(520658915);
        sistem.izposoja(987313184);
        sistem.vracilo(711029618, "ChYbNQ");
        sistem.vracilo(520658915, "iluII");
        sistem.vracilo(987313184, "FIdQx");
        sistem.izposoja(797796060);
        sistem.izposoja(544712997);
        sistem.izposoja(18424466);
        sistem.izposoja(304617353);
        sistem.izposoja(614056623);
        sistem.izposoja(579566166);
        sistem.izposoja(39853525);
        sistem.izposoja(537568019);
        sistem.izposoja(285712068);
        sistem.vracilo(614056623, "RRtmVw");
        sistem.izposoja(238623835);
        sistem.izposoja(624741038);
        sistem.izposoja(308139322);
        sistem.izposoja(48760109);
        sistem.vracilo(624741038, "ChYbNQ");
        sistem.izposoja(897059151);
        sistem.izposoja(931157306);
        sistem.izposoja(958918825);
        sistem.izposoja(532788856);
        sistem.vracilo(304617353, "oOeae");
        sistem.izposoja(763698710);
        sistem.izposoja(478614839);
        sistem.vracilo(763698710, "yROglwG");
        sistem.izposoja(853174056);
        sistem.izposoja(420640796);
        sistem.izposoja(297737718);
        sistem.izposoja(839340335);
        sistem.vracilo(958918825, "yROglwG");
        sistem.vracilo(931157306, "Xsgsovg");
        sistem.vracilo(537568019, "wjwoWs");
        sistem.izposoja(304617353);
        sistem.vracilo(853174056, "beWRrUp");
        sistem.izposoja(455534957);
        sistem.izposoja(518830238);
        sistem.vracilo(544712997, "iluII");

        Map<Integer, Boolean> statusi = sistem.statusiKoles();
        List<Integer> kolesa = new ArrayList<>(statusi.keySet());
        kolesa.sort(null);
        for (int kolo: kolesa) {
            System.out.printf("%d -> %b%n", kolo, statusi.get(kolo));
        }
    }
}
