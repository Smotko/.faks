
import java.util.*;

public class Test33 {

    public static void main(String[] args) {
        Map<Integer, String> kolo2postaja = new TreeMap<>();
        kolo2postaja.put(301297551, "imFabtN");
        kolo2postaja.put(757634746, "ZeTqXc");
        kolo2postaja.put(710845177, "WPaIFEh");
        kolo2postaja.put(706243437, "wmrzI");
        kolo2postaja.put(939098386, "ysePP");
        kolo2postaja.put(572317206, "iXjAKUo");
        kolo2postaja.put(663566724, "ysePP");
        kolo2postaja.put(87938487, "iXjAKUo");
        kolo2postaja.put(100668040, "muRil");
        kolo2postaja.put(63107153, "aaFlY");
        kolo2postaja.put(646942189, "WPaIFEh");
        kolo2postaja.put(454633513, "wmrzI");
        kolo2postaja.put(137454951, "muRil");
        kolo2postaja.put(754236099, "wmrzI");
        kolo2postaja.put(593761885, "ECuVE");
        kolo2postaja.put(160692671, "XfEEHs");
        kolo2postaja.put(766759116, "WBpfEC");
        kolo2postaja.put(919269127, "XfEEHs");
        kolo2postaja.put(451479862, "sZKxcHC");
        kolo2postaja.put(851655002, "dOsXAjH");
        kolo2postaja.put(189251252, "ysePP");
        kolo2postaja.put(315297154, "imFabtN");
        kolo2postaja.put(105550230, "ajfrmwh");
        kolo2postaja.put(573273350, "jKdHR");
        kolo2postaja.put(770918648, "ECuVE");
        kolo2postaja.put(242778538, "GpOpuU");
        kolo2postaja.put(345677038, "yGQcHHx");
        kolo2postaja.put(171449304, "dOsXAjH");
        kolo2postaja.put(771438273, "muRil");
        kolo2postaja.put(249944240, "ECuVE");
        kolo2postaja.put(971893039, "TUqiB");
        kolo2postaja.put(197829673, "ajfrmwh");
        kolo2postaja.put(632058361, "FLwdRNH");
        kolo2postaja.put(30501671, "HKbVWI");
        kolo2postaja.put(749233555, "sZKxcHC");
        kolo2postaja.put(57879977, "jKdHR");

        Cetrta.Sistem sistem = new Cetrta.Sistem(kolo2postaja);
        sistem.izposoja(573273350);
        sistem.izposoja(646942189);
        sistem.izposoja(454633513);
        sistem.izposoja(171449304);
        sistem.vracilo(646942189, "TUqiB");
        sistem.izposoja(100668040);
        sistem.vracilo(573273350, "jKdHR");
        sistem.izposoja(919269127);
        sistem.vracilo(100668040, "WBpfEC");
        sistem.izposoja(137454951);
        sistem.izposoja(771438273);
        sistem.izposoja(249944240);
        sistem.vracilo(454633513, "ECuVE");
        sistem.vracilo(137454951, "jKdHR");
        sistem.izposoja(30501671);
        sistem.izposoja(345677038);
        sistem.izposoja(105550230);
        sistem.izposoja(646942189);
        sistem.vracilo(171449304, "GpOpuU");
        sistem.izposoja(171449304);
        sistem.izposoja(706243437);
        sistem.izposoja(757634746);
        sistem.vracilo(646942189, "ZeTqXc");
        sistem.vracilo(345677038, "jKdHR");
        sistem.izposoja(939098386);
        sistem.vracilo(105550230, "WBpfEC");
        sistem.izposoja(100668040);
        sistem.izposoja(593761885);
        sistem.vracilo(919269127, "HKbVWI");
        sistem.vracilo(771438273, "XfEEHs");
        sistem.vracilo(939098386, "iXjAKUo");
        sistem.vracilo(757634746, "HKbVWI");
        sistem.izposoja(242778538);
        sistem.vracilo(30501671, "WBpfEC");
        sistem.vracilo(249944240, "sZKxcHC");
        sistem.izposoja(573273350);
        sistem.izposoja(315297154);
        sistem.izposoja(105550230);
        sistem.izposoja(663566724);
        sistem.izposoja(189251252);
        sistem.izposoja(87938487);
        sistem.vracilo(105550230, "imFabtN");
        sistem.izposoja(572317206);
        sistem.vracilo(242778538, "muRil");
        sistem.izposoja(63107153);
        sistem.vracilo(593761885, "wmrzI");
        sistem.izposoja(710845177);
        sistem.izposoja(160692671);
        sistem.izposoja(632058361);
        sistem.vracilo(87938487, "jKdHR");
        sistem.izposoja(242778538);
        sistem.izposoja(345677038);
        sistem.izposoja(87938487);

        Map<Integer, Boolean> statusi = sistem.statusiKoles();
        List<Integer> kolesa = new ArrayList<>(statusi.keySet());
        kolesa.sort(null);
        for (int kolo: kolesa) {
            System.out.printf("%d -> %b%n", kolo, statusi.get(kolo));
        }
    }
}
