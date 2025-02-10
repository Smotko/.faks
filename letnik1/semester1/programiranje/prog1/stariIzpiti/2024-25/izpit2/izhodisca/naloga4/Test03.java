
import java.util.*;

public class Test03 {

    public static void main(String[] args) {
        Map<Integer, String> kolo2postaja = new TreeMap<>();
        kolo2postaja.put(452798953, "OLeCDj");
        kolo2postaja.put(834479443, "OLeCDj");
        kolo2postaja.put(132825636, "EJIkY");
        kolo2postaja.put(79612226, "EJIkY");
        kolo2postaja.put(193690125, "cZPWfsj");
        kolo2postaja.put(634952834, "swfCL");
        kolo2postaja.put(144055339, "EJIkY");
        kolo2postaja.put(936174396, "cZPWfsj");
        kolo2postaja.put(413230197, "ROBCCLD");
        kolo2postaja.put(202825431, "nvCoWg");
        kolo2postaja.put(419005735, "EJIkY");
        kolo2postaja.put(585158542, "rzKCmUr");
        kolo2postaja.put(364922754, "OLeCDj");
        kolo2postaja.put(670904703, "ochzy");
        kolo2postaja.put(561987983, "cZPWfsj");
        kolo2postaja.put(812959004, "tWtZKJt");
        kolo2postaja.put(88502663, "EJIkY");
        kolo2postaja.put(959106823, "rzKCmUr");
        kolo2postaja.put(167556560, "cZPWfsj");
        kolo2postaja.put(742437174, "nvCoWg");
        kolo2postaja.put(213530128, "OLeCDj");
        kolo2postaja.put(840916301, "nvCoWg");
        kolo2postaja.put(60547468, "EJIkY");
        kolo2postaja.put(134422469, "rzKCmUr");
        kolo2postaja.put(920091241, "yqoqBc");
        kolo2postaja.put(58664770, "cHOXXKd");
        kolo2postaja.put(70297339, "yqoqBc");
        kolo2postaja.put(487250371, "swfCL");
        kolo2postaja.put(201475077, "cZPWfsj");
        kolo2postaja.put(570899510, "EJIkY");
        kolo2postaja.put(881183847, "tWtZKJt");
        kolo2postaja.put(559322848, "EJIkY");
        kolo2postaja.put(581909236, "ochzy");
        kolo2postaja.put(512284862, "swfCL");
        kolo2postaja.put(102349915, "ROBCCLD");
        kolo2postaja.put(777076408, "ROBCCLD");
        kolo2postaja.put(745769188, "tWtZKJt");
        kolo2postaja.put(720599396, "swfCL");
        kolo2postaja.put(881412528, "ROBCCLD");
        kolo2postaja.put(447638320, "OLeCDj");
        kolo2postaja.put(45578727, "cHOXXKd");
        kolo2postaja.put(472432294, "nvCoWg");
        kolo2postaja.put(182487965, "rzKCmUr");
        kolo2postaja.put(620010971, "ochzy");
        kolo2postaja.put(765499730, "cZPWfsj");
        kolo2postaja.put(759715997, "tWtZKJt");
        kolo2postaja.put(671681932, "swfCL");
        kolo2postaja.put(896049313, "yqoqBc");
        kolo2postaja.put(186530573, "rzKCmUr");
        kolo2postaja.put(397570185, "tWtZKJt");
        kolo2postaja.put(378998285, "swfCL");
        kolo2postaja.put(419130665, "cHOXXKd");
        kolo2postaja.put(960145055, "rzKCmUr");
        kolo2postaja.put(358734324, "yqoqBc");
        kolo2postaja.put(971832002, "ROBCCLD");
        kolo2postaja.put(196315208, "swfCL");
        kolo2postaja.put(944140270, "cHOXXKd");
        kolo2postaja.put(249342822, "cZPWfsj");
        kolo2postaja.put(643876021, "tWtZKJt");
        kolo2postaja.put(319299641, "cHOXXKd");
        kolo2postaja.put(113481268, "ochzy");
        kolo2postaja.put(788009807, "EJIkY");
        kolo2postaja.put(508164830, "ochzy");
        kolo2postaja.put(383345727, "tWtZKJt");
        kolo2postaja.put(123285193, "yqoqBc");
        kolo2postaja.put(615854403, "cZPWfsj");

        Cetrta.Sistem sistem = new Cetrta.Sistem(kolo2postaja);
        sistem.izposoja(620010971);
        sistem.izposoja(132825636);
        sistem.izposoja(383345727);
        sistem.izposoja(397570185);
        sistem.izposoja(419005735);
        sistem.izposoja(419130665);
        sistem.izposoja(319299641);
        sistem.izposoja(186530573);
        sistem.izposoja(759715997);
        sistem.izposoja(561987983);
        sistem.izposoja(144055339);
        sistem.izposoja(358734324);
        sistem.izposoja(634952834);
        sistem.izposoja(113481268);
        sistem.izposoja(944140270);
        sistem.izposoja(585158542);
        sistem.izposoja(570899510);
        sistem.izposoja(834479443);
        sistem.izposoja(671681932);
        sistem.izposoja(896049313);
        sistem.izposoja(881412528);
        sistem.izposoja(249342822);
        sistem.izposoja(196315208);

        Map<Integer, Boolean> statusi = sistem.statusiKoles();
        List<Integer> kolesa = new ArrayList<>(statusi.keySet());
        kolesa.sort(null);
        for (int kolo: kolesa) {
            System.out.printf("%d -> %b%n", kolo, statusi.get(kolo));
        }
    }
}
