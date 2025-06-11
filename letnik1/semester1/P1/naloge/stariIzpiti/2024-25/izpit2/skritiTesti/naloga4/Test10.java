
import java.util.*;

public class Test10 {

    public static void main(String[] args) {
        Map<Integer, String> kolo2postaja = new TreeMap<>();
        kolo2postaja.put(941024620, "TduaQW");
        kolo2postaja.put(361078606, "HNjtu");
        kolo2postaja.put(975657360, "MJZoJC");
        kolo2postaja.put(748257209, "FNajy");
        kolo2postaja.put(622607689, "BibPgav");
        kolo2postaja.put(582862833, "cANhBd");
        kolo2postaja.put(562947812, "OYkCCij");
        kolo2postaja.put(234549810, "XNPdh");
        kolo2postaja.put(319969326, "HNjtu");
        kolo2postaja.put(432424676, "pVSDVD");
        kolo2postaja.put(855094332, "MCkUmJb");
        kolo2postaja.put(806749435, "VGYdl");
        kolo2postaja.put(47082178, "FNajy");
        kolo2postaja.put(806760090, "rwLWeSa");
        kolo2postaja.put(392603257, "uvvnK");
        kolo2postaja.put(288526054, "VGYdl");
        kolo2postaja.put(982498650, "rGHQEKo");
        kolo2postaja.put(209373097, "XNPdh");
        kolo2postaja.put(65413868, "xgJFb");
        kolo2postaja.put(612676371, "VGYdl");
        kolo2postaja.put(881860106, "psWvZpT");
        kolo2postaja.put(379008439, "FNajy");
        kolo2postaja.put(345099584, "orGuJt");
        kolo2postaja.put(209328498, "FNajy");
        kolo2postaja.put(821151650, "VGYdl");
        kolo2postaja.put(192045029, "ATBobWx");
        kolo2postaja.put(88128135, "ATBobWx");
        kolo2postaja.put(250365305, "ATBobWx");
        kolo2postaja.put(910809808, "dRsUz");
        kolo2postaja.put(985346829, "OYkCCij");
        kolo2postaja.put(172285979, "XNPdh");
        kolo2postaja.put(909663888, "OYkCCij");
        kolo2postaja.put(134359356, "xReioJe");
        kolo2postaja.put(920439617, "orGuJt");
        kolo2postaja.put(193784417, "cANhBd");
        kolo2postaja.put(100159375, "OYkCCij");
        kolo2postaja.put(690984357, "OYkCCij");
        kolo2postaja.put(602253307, "FNajy");
        kolo2postaja.put(719111163, "rwLWeSa");
        kolo2postaja.put(549500947, "pVSDVD");
        kolo2postaja.put(626265429, "rwLWeSa");
        kolo2postaja.put(839333949, "MJZoJC");
        kolo2postaja.put(322326167, "CUoeOTQ");
        kolo2postaja.put(252322144, "DApQi");
        kolo2postaja.put(820343096, "SjTJS");
        kolo2postaja.put(256906414, "xgJFb");
        kolo2postaja.put(69024975, "SjTJS");
        kolo2postaja.put(176361665, "dRsUz");
        kolo2postaja.put(741994945, "MCkUmJb");
        kolo2postaja.put(376358892, "xReioJe");
        kolo2postaja.put(143819892, "xgJFb");

        Cetrta.Sistem sistem = new Cetrta.Sistem(kolo2postaja);
        sistem.izposoja(209328498);
        sistem.izposoja(192045029);
        sistem.izposoja(376358892);
        sistem.izposoja(820343096);
        sistem.izposoja(612676371);
        sistem.izposoja(982498650);
        sistem.izposoja(134359356);
        sistem.izposoja(288526054);
        sistem.izposoja(432424676);
        sistem.izposoja(250365305);
        sistem.izposoja(234549810);
        sistem.izposoja(806760090);
        sistem.izposoja(322326167);
        sistem.izposoja(975657360);
        sistem.izposoja(100159375);
        sistem.izposoja(392603257);
        sistem.izposoja(47082178);
        sistem.izposoja(65413868);
        sistem.izposoja(172285979);
        sistem.izposoja(622607689);
        sistem.izposoja(806749435);
        sistem.izposoja(941024620);
        sistem.izposoja(256906414);
        sistem.izposoja(69024975);
        sistem.izposoja(319969326);
        sistem.izposoja(549500947);
        sistem.izposoja(985346829);
        sistem.izposoja(209373097);
        sistem.izposoja(193784417);
        sistem.izposoja(88128135);
        sistem.izposoja(920439617);
        sistem.izposoja(855094332);
        sistem.izposoja(176361665);
        sistem.izposoja(143819892);
        sistem.izposoja(582862833);

        Map<Integer, Boolean> statusi = sistem.statusiKoles();
        List<Integer> kolesa = new ArrayList<>(statusi.keySet());
        kolesa.sort(null);
        for (int kolo: kolesa) {
            System.out.printf("%d -> %b%n", kolo, statusi.get(kolo));
        }
    }
}
