
import java.util.*;

public class Test50 {

    public static void main(String[] args) {
        Map<Integer, String> kolo2postaja = new TreeMap<>();
        kolo2postaja.put(226880596, "blOaLD");
        kolo2postaja.put(684556736, "fScaq");
        kolo2postaja.put(602858871, "OCgCuKd");
        kolo2postaja.put(305180153, "blOaLD");
        kolo2postaja.put(181473010, "eoZixU");
        kolo2postaja.put(960446057, "XlEzE");
        kolo2postaja.put(303422183, "furvsX");
        kolo2postaja.put(109931022, "OMTdBpR");
        kolo2postaja.put(841672190, "fTqUO");
        kolo2postaja.put(778262260, "gEZAuBZ");
        kolo2postaja.put(5478900, "xNLXs");
        kolo2postaja.put(125522713, "fScaq");
        kolo2postaja.put(731790001, "GIgdWpj");
        kolo2postaja.put(716139394, "detHXc");
        kolo2postaja.put(774417418, "PRmQfC");
        kolo2postaja.put(742358230, "oBvwq");
        kolo2postaja.put(803866598, "EkVxUtW");
        kolo2postaja.put(163173910, "WSaLN");
        kolo2postaja.put(190578476, "detHXc");
        kolo2postaja.put(2203928, "Rdaxez");
        kolo2postaja.put(830355942, "XlEzE");
        kolo2postaja.put(770690211, "fScaq");
        kolo2postaja.put(896276877, "oBvwq");
        kolo2postaja.put(188752492, "WSaLN");
        kolo2postaja.put(236835794, "oBvwq");
        kolo2postaja.put(636672007, "XlEzE");
        kolo2postaja.put(413071331, "XlEzE");
        kolo2postaja.put(472502178, "PRmQfC");
        kolo2postaja.put(56456317, "eoZixU");
        kolo2postaja.put(84485551, "kpzCbcM");
        kolo2postaja.put(728957282, "detHXc");
        kolo2postaja.put(195696207, "blOaLD");
        kolo2postaja.put(47579473, "kNqwJoC");
        kolo2postaja.put(716281169, "blOaLD");
        kolo2postaja.put(605853121, "kNqwJoC");
        kolo2postaja.put(391006371, "kIZzSM");
        kolo2postaja.put(862499451, "eoZixU");
        kolo2postaja.put(583719194, "Rdaxez");
        kolo2postaja.put(554010529, "kIZzSM");
        kolo2postaja.put(298354875, "EkVxUtW");
        kolo2postaja.put(581233710, "gEZAuBZ");
        kolo2postaja.put(525212816, "fTqUO");
        kolo2postaja.put(436500127, "XlEzE");
        kolo2postaja.put(732383065, "xNLXs");

        List<String> postaje = new ArrayList<>(new TreeSet<>(kolo2postaja.values()));
        postaje.sort(null);

        Cetrta.Sistem sistem = new Cetrta.Sistem(kolo2postaja);
        sistem.izposoja(803866598);
        sistem.izposoja(716139394);
        sistem.vracilo(803866598, "oBvwq");
        sistem.vracilo(716139394, "detHXc");
        sistem.izposoja(862499451);
        sistem.vracilo(862499451, "detHXc");
        sistem.izposoja(226880596);
        sistem.izposoja(195696207);
        sistem.izposoja(605853121);
        sistem.vracilo(195696207, "kpzCbcM");
        sistem.vracilo(226880596, "oBvwq");
        sistem.vracilo(605853121, "kIZzSM");
        sistem.izposoja(830355942);
        sistem.izposoja(195696207);
        sistem.izposoja(778262260);
        sistem.izposoja(2203928);
        sistem.izposoja(554010529);
        sistem.vracilo(830355942, "blOaLD");
        sistem.izposoja(605853121);
        sistem.izposoja(303422183);
        sistem.vracilo(195696207, "kIZzSM");
        sistem.izposoja(636672007);
        sistem.vracilo(303422183, "kIZzSM");
        sistem.izposoja(181473010);
        sistem.izposoja(226880596);
        sistem.izposoja(960446057);
        sistem.izposoja(305180153);
        sistem.izposoja(716139394);
        sistem.vracilo(716139394, "gEZAuBZ");
        sistem.izposoja(602858871);
        sistem.izposoja(163173910);
        sistem.vracilo(636672007, "blOaLD");
        sistem.izposoja(47579473);
        sistem.izposoja(728957282);
        sistem.vracilo(181473010, "eoZixU");
        sistem.vracilo(554010529, "GIgdWpj");
        sistem.izposoja(236835794);
        sistem.izposoja(583719194);
        sistem.izposoja(716281169);
        sistem.izposoja(391006371);
        sistem.vracilo(583719194, "furvsX");
        sistem.izposoja(862499451);
        sistem.vracilo(960446057, "blOaLD");
        sistem.izposoja(841672190);
        sistem.izposoja(774417418);
        sistem.vracilo(236835794, "gEZAuBZ");
        sistem.vracilo(163173910, "kIZzSM");
        sistem.izposoja(5478900);
        sistem.vracilo(841672190, "Rdaxez");
        sistem.izposoja(472502178);
        sistem.izposoja(525212816);
        sistem.izposoja(583719194);
        sistem.vracilo(472502178, "kIZzSM");
        sistem.izposoja(770690211);
        sistem.izposoja(684556736);
        sistem.vracilo(862499451, "WSaLN");
        sistem.izposoja(716139394);
        sistem.vracilo(716281169, "oBvwq");
        sistem.izposoja(188752492);
        sistem.izposoja(413071331);
        sistem.izposoja(716281169);
        sistem.izposoja(636672007);
        sistem.izposoja(731790001);
        sistem.vracilo(774417418, "xNLXs");

        for (String postaja: postaje) {
            Set<Integer> kolesa = sistem.kolesaNaPostaji(postaja);
            List<Integer> seznam = new ArrayList<>(kolesa);
            seznam.sort(null);
            System.out.printf("%s -> %s%n", postaja, seznam);
        }
    }
}
