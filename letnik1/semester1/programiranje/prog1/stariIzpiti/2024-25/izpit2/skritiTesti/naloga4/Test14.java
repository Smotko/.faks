
import java.util.*;

public class Test14 {

    public static void main(String[] args) {
        Map<Integer, String> kolo2postaja = new TreeMap<>();
        kolo2postaja.put(296434534, "MtsPK");
        kolo2postaja.put(204106400, "AsiIBkW");
        kolo2postaja.put(598437516, "MtsPK");
        kolo2postaja.put(315929881, "jgtQXft");
        kolo2postaja.put(439154401, "MtsPK");
        kolo2postaja.put(479212596, "BjvGQ");
        kolo2postaja.put(727519132, "oWcvNLs");
        kolo2postaja.put(73828452, "PJJUcd");
        kolo2postaja.put(330578261, "nPfUtR");
        kolo2postaja.put(349152370, "IiyqjEC");
        kolo2postaja.put(835785049, "tSDmrdV");
        kolo2postaja.put(251269788, "fXHwLre");
        kolo2postaja.put(463127737, "AsiIBkW");
        kolo2postaja.put(727104132, "fiuhnFj");
        kolo2postaja.put(521292616, "IiyqjEC");
        kolo2postaja.put(543606910, "tSDmrdV");
        kolo2postaja.put(671637246, "tSDmrdV");
        kolo2postaja.put(414840479, "TTUZpZ");
        kolo2postaja.put(656758172, "DqbQs");
        kolo2postaja.put(176614800, "tSDmrdV");
        kolo2postaja.put(556919521, "DqbQs");
        kolo2postaja.put(483544212, "tNlad");
        kolo2postaja.put(766987819, "grKyWK");
        kolo2postaja.put(439024335, "TdsruE");
        kolo2postaja.put(333192968, "IWamD");
        kolo2postaja.put(273022725, "DRYQJj");
        kolo2postaja.put(179422563, "TdsruE");
        kolo2postaja.put(910730402, "tSDmrdV");
        kolo2postaja.put(643820019, "oWcvNLs");
        kolo2postaja.put(190022733, "wGfTdH");
        kolo2postaja.put(528986451, "DRYQJj");
        kolo2postaja.put(672943299, "nAkIfjQ");
        kolo2postaja.put(671142568, "tSDmrdV");
        kolo2postaja.put(422777889, "nPfUtR");
        kolo2postaja.put(231043552, "IWamD");
        kolo2postaja.put(424402598, "IWamD");
        kolo2postaja.put(363612547, "PJVVkT");
        kolo2postaja.put(615443626, "wCuSl");
        kolo2postaja.put(165686558, "grKyWK");
        kolo2postaja.put(495528423, "IWamD");
        kolo2postaja.put(387879879, "WIxWzj");
        kolo2postaja.put(397094898, "mPYNSk");
        kolo2postaja.put(336662799, "nAkIfjQ");
        kolo2postaja.put(194841922, "AsiIBkW");
        kolo2postaja.put(6820017, "mPYNSk");
        kolo2postaja.put(486247482, "NpYMfX");
        kolo2postaja.put(182295482, "WIxWzj");

        List<String> postaje = new ArrayList<>(new TreeSet<>(kolo2postaja.values()));
        postaje.sort(null);

        Cetrta.Sistem sistem = new Cetrta.Sistem(kolo2postaja);
        sistem.izposoja(179422563);
        sistem.izposoja(495528423);
        sistem.izposoja(330578261);
        sistem.izposoja(387879879);
        sistem.izposoja(194841922);
        sistem.izposoja(727519132);
        sistem.izposoja(422777889);
        sistem.izposoja(521292616);
        sistem.izposoja(336662799);
        sistem.izposoja(165686558);
        sistem.izposoja(486247482);
        sistem.izposoja(333192968);
        sistem.izposoja(414840479);
        sistem.izposoja(315929881);
        sistem.izposoja(483544212);
        sistem.izposoja(463127737);
        sistem.izposoja(73828452);
        sistem.izposoja(190022733);
        sistem.izposoja(727104132);
        sistem.izposoja(439024335);
        sistem.izposoja(349152370);
        sistem.izposoja(766987819);
        sistem.izposoja(296434534);

        for (String postaja: postaje) {
            Set<Integer> kolesa = sistem.kolesaNaPostaji(postaja);
            List<Integer> seznam = new ArrayList<>(kolesa);
            seznam.sort(null);
            System.out.printf("%s -> %s%n", postaja, seznam);
        }
    }
}
