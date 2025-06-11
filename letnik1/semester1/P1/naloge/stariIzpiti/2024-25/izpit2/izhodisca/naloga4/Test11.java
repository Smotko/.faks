
import java.util.*;

public class Test11 {

    public static void main(String[] args) {
        Map<Integer, String> kolo2postaja = new TreeMap<>();
        kolo2postaja.put(286946421, "IgoOQRn");
        kolo2postaja.put(102931270, "IgoOQRn");
        kolo2postaja.put(717770855, "AfcFBsL");
        kolo2postaja.put(296600787, "NbniUsh");
        kolo2postaja.put(256900306, "GzWZf");
        kolo2postaja.put(882178673, "WsReQlg");
        kolo2postaja.put(17316023, "XMvRzG");
        kolo2postaja.put(982495909, "HFBwMLF");
        kolo2postaja.put(581126058, "UMmRk");
        kolo2postaja.put(959894000, "gJGhh");
        kolo2postaja.put(41091447, "FgOZwpl");
        kolo2postaja.put(921109244, "WsReQlg");
        kolo2postaja.put(719673372, "STQZH");
        kolo2postaja.put(549933096, "AfcFBsL");
        kolo2postaja.put(466601336, "AfcFBsL");
        kolo2postaja.put(636283014, "EaIsli");
        kolo2postaja.put(93857355, "oFmXzD");
        kolo2postaja.put(952223902, "EaIsli");
        kolo2postaja.put(163293970, "XMvRzG");
        kolo2postaja.put(176292742, "HFBwMLF");
        kolo2postaja.put(726570477, "FgOZwpl");
        kolo2postaja.put(946087529, "oFmXzD");
        kolo2postaja.put(908532090, "AfcFBsL");
        kolo2postaja.put(529193142, "STQZH");
        kolo2postaja.put(845367242, "NhgHGa");
        kolo2postaja.put(864082612, "XMvRzG");
        kolo2postaja.put(454419609, "eFtVta");
        kolo2postaja.put(955137809, "STQZH");
        kolo2postaja.put(324083615, "HFBwMLF");
        kolo2postaja.put(557703847, "UMmRk");
        kolo2postaja.put(110338836, "olaZG");
        kolo2postaja.put(478239379, "WsReQlg");
        kolo2postaja.put(585903990, "NbniUsh");
        kolo2postaja.put(924613620, "gJGhh");
        kolo2postaja.put(574279242, "xfHls");
        kolo2postaja.put(957425460, "eFtVta");
        kolo2postaja.put(766251026, "UMmRk");
        kolo2postaja.put(421126262, "GzWZf");
        kolo2postaja.put(301798787, "XMvRzG");
        kolo2postaja.put(120671235, "STQZH");
        kolo2postaja.put(799483954, "fiNmVw");

        List<String> postaje = new ArrayList<>(new TreeSet<>(kolo2postaja.values()));
        postaje.sort(null);

        Cetrta.Sistem sistem = new Cetrta.Sistem(kolo2postaja);
        sistem.izposoja(120671235);
        sistem.izposoja(921109244);
        sistem.izposoja(924613620);
        sistem.izposoja(717770855);
        sistem.izposoja(719673372);
        sistem.izposoja(957425460);
        sistem.izposoja(421126262);
        sistem.izposoja(882178673);
        sistem.vracilo(719673372, "STQZH");
        sistem.izposoja(845367242);
        sistem.vracilo(717770855, "oFmXzD");
        sistem.izposoja(286946421);
        sistem.izposoja(955137809);
        sistem.izposoja(799483954);
        sistem.vracilo(924613620, "STQZH");
        sistem.izposoja(766251026);
        sistem.izposoja(163293970);
        sistem.izposoja(324083615);
        sistem.izposoja(982495909);
        sistem.izposoja(102931270);
        sistem.vracilo(921109244, "fiNmVw");
        sistem.izposoja(864082612);
        sistem.izposoja(726570477);
        sistem.vracilo(286946421, "IgoOQRn");
        sistem.izposoja(466601336);
        sistem.vracilo(163293970, "fiNmVw");
        sistem.izposoja(574279242);
        sistem.izposoja(163293970);
        sistem.izposoja(946087529);
        sistem.izposoja(549933096);
        sistem.vracilo(946087529, "HFBwMLF");
        sistem.izposoja(256900306);
        sistem.izposoja(17316023);
        sistem.izposoja(557703847);
        sistem.vracilo(549933096, "GzWZf");
        sistem.vracilo(163293970, "UMmRk");
        sistem.vracilo(845367242, "gJGhh");
        sistem.izposoja(110338836);
        sistem.izposoja(549933096);
        sistem.izposoja(581126058);
        sistem.izposoja(478239379);
        sistem.izposoja(301798787);
        sistem.vracilo(120671235, "WsReQlg");
        sistem.vracilo(549933096, "NhgHGa");
        sistem.vracilo(557703847, "EaIsli");
        sistem.vracilo(882178673, "HFBwMLF");
        sistem.izposoja(946087529);
        sistem.izposoja(845367242);
        sistem.izposoja(454419609);
        sistem.izposoja(557703847);
        sistem.izposoja(924613620);
        sistem.vracilo(766251026, "AfcFBsL");
        sistem.vracilo(256900306, "gJGhh");
        sistem.izposoja(120671235);
        sistem.vracilo(957425460, "gJGhh");
        sistem.izposoja(93857355);
        sistem.izposoja(286946421);
        sistem.izposoja(959894000);
        sistem.vracilo(301798787, "WsReQlg");

        for (String postaja: postaje) {
            Set<Integer> kolesa = sistem.kolesaNaPostaji(postaja);
            List<Integer> seznam = new ArrayList<>(kolesa);
            seznam.sort(null);
            System.out.printf("%s -> %s%n", postaja, seznam);
        }
    }
}
