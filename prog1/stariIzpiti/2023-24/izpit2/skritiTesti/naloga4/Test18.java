
import java.util.*;
import java.util.function.*;

public class Test18 {

    public static void main(String[] args) {
        Comparator<String> comp = (a, b) -> b.length() - a.length();

        List<List<String>> seznami = List.of(
            List.of("pxfvxsvnqubvgwndmwht", "qq", "ewbnrrtyranesgejmk", "lvrj", "iaxvldatmdlxifj", "enieix", "ecqleatfflueh", "scoxdzdf", "zteturvdfkx", "bkraeteilk", "yqfaxszuh", "ucbzizarecfn", "noyhtox", "kcgeokfrgexibt", "wakte", "dgwayzuefzalvfvsg", "bfy", "plyqvximggbsyzkccbb", "p"),
            List.of("oamzwldvhlirm", "ztlhyusjwo", "coislmcvkc", "pmuqdfahkazc"),
            List.of("pxfvxsvnqubvgwndmwht", "bfy", "rxntootxyyulyfulqm", "zdjnv", "onhkjvssghfpehnq", "erhxodr", "jpjlxodvsiyepb", "lhsfyxecr", "ucbzizarecfn", "hazjjxmuvnv", "bkraeteilk", "oamzwldvhlirm", "scoxdzdf", "rvkskutbpqxixfw", "enieix", "dgwayzuefzalvfvsg", "zoev", "vgagwbapkbtibkcpecj", "qq"),
            List.of("ucbzizarecfn", "na", "pxfvxsvnqubvgwndmwht", "qq", "sqvvlhhhjbuesxxzsasg", "ioqr", "iwvanrwbgeokviflva", "wakte", "ewbnrrtyranesgejmk", "jcwwn", "ewbnrrtyranesgejmk", "ujilin", "mwtabrvgipypmqkyy", "rqdeju", "dgwayzuefzalvfvsg", "rqdeju", "rvkskutbpqxixfw", "mmtito", "iaxvldatmdlxifj", "ujilin", "ytnymugvwzsqusb", "evavfxw", "ytqyzmusayeyjq", "erhxodr", "jpjlxodvsiyepb", "vhnwtmibg", "jpjlxodvsiyepb", "iwbvkqxovdfw", "oamzwldvhlirm", "pxfvxsvnqubvgwndmwht", "ouulzectrxnfo", "rtqhrztdogdt", "oamzwldvhlirm", "fxlpirpvqzrv", "rtqhrztdogdt", "rtqhrztdogdt", "qzvitqevinlp", "ecqleatfflueh", "ucbzizarecfn", "qkpmwjwnzbrpt", "auymgealuvxs", "qkpmwjwnzbrpt", "bebjndwdbiuh", "oamzwldvhlirm", "xhirhmxyj", "rvkskutbpqxixfw", "evavfxw", "ormyfgvsvfouhge", "cytskw", "izogngqwchmiynv", "wakte", "ormyfgvsvfouhge", "wakte", "onhkjvssghfpehnq", "lja", "dgwayzuefzalvfvsg", "qq", "dgwayzuefzalvfvsg", "bc", "nbrthlakeqmzdbcybrw", "p", "vgagwbapkbtibkcpecj"),
            List.of("onhkjvssghfpehnq", "rqdeju", "oamzwldvhlirm", "fxlpirpvqzrv", "bc", "vgagwbapkbtibkcpecj"),
            List.of("ytqyzmusayeyjq", "zoev", "tcflujfyicxycwa", "bkraeteilk", "zid"),
            List.of("jwbaffrnvntzescyxpp", "lvrj"),
            List.of("pxfvxsvnqubvgwndmwht", "jcwwn", "onhkjvssghfpehnq", "jcwwn", "lhsfyxecr", "erhxodr", "kcgeokfrgexibt", "evavfxw", "ecqleatfflueh", "fdpqxiw", "ecqleatfflueh", "wylnkipzu", "bebjndwdbiuh", "xhirhmxyj", "bebjndwdbiuh", "ztlhyusjwo", "ixbkusjeawvcmfr", "vaonjudwhmf", "lhsfyxecr", "fnrpdhytfjvc", "dsrbamg", "auymgealuvxs", "evavfxw", "pmuqdfahkazc", "apppjyd", "qzvitqevinlp", "rqdeju", "oamzwldvhlirm", "vadmfs", "ouulzectrxnfo", "wakte", "ecqleatfflueh", "jcwwn", "luxeqfbedpunfq", "pwnv", "iaxvldatmdlxifj", "pwnv", "ormyfgvsvfouhge", "lvrj", "rnyepvwxiivebpayhp", "ioqr", "plyqvximggbsyzkccbb", "spg", "nbrthlakeqmzdbcybrw", "kqp", "pxfvxsvnqubvgwndmwht"),
            List.of("czdifsjzbiso", "zteturvdfkx", "zteturvdfkx"),
            List.of("vgagwbapkbtibkcpecj", "qq", "kcgeokfrgexibt", "auymgealuvxs", "cwcvfr", "ytnymugvwzsqusb")
        );

        for (List<String> seznam: seznami) {
            System.out.println(Cetrta.alternirajoceMonotono(seznam, comp));
        }
    }
}
