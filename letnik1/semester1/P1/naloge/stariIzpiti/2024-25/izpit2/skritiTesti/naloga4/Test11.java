
import java.util.*;

public class Test11 {

    public static void main(String[] args) {
        Map<Integer, String> kolo2postaja = new TreeMap<>();
        kolo2postaja.put(905193179, "ZHUbnc");
        kolo2postaja.put(574942604, "acMbnGq");
        kolo2postaja.put(701260753, "DdkXKMI");
        kolo2postaja.put(102108554, "NulWfSs");
        kolo2postaja.put(163928691, "dvcZm");
        kolo2postaja.put(828375021, "acMbnGq");
        kolo2postaja.put(308808710, "JyqSxf");
        kolo2postaja.put(539684470, "NulWfSs");
        kolo2postaja.put(6157654, "NjgtEb");
        kolo2postaja.put(914797891, "acMbnGq");
        kolo2postaja.put(550772026, "mboOSq");
        kolo2postaja.put(774999162, "ljkbseh");
        kolo2postaja.put(334173642, "mboOSq");
        kolo2postaja.put(790229279, "NjgtEb");
        kolo2postaja.put(388800418, "UwxdAP");
        kolo2postaja.put(561576204, "BKRtTef");
        kolo2postaja.put(567873891, "mboOSq");
        kolo2postaja.put(170233493, "DdkXKMI");
        kolo2postaja.put(714101002, "NzIXnkG");
        kolo2postaja.put(717976527, "NzIXnkG");
        kolo2postaja.put(680970115, "yZHANq");
        kolo2postaja.put(221022525, "SEdpU");
        kolo2postaja.put(86844680, "NzIXnkG");

        Cetrta.Sistem sistem = new Cetrta.Sistem(kolo2postaja);
        sistem.izposoja(905193179);

        Map<Integer, Boolean> statusi = sistem.statusiKoles();
        List<Integer> kolesa = new ArrayList<>(statusi.keySet());
        kolesa.sort(null);
        for (int kolo: kolesa) {
            System.out.printf("%d -> %b%n", kolo, statusi.get(kolo));
        }
    }
}
