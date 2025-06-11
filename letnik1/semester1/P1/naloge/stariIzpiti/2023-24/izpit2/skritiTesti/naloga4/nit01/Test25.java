
import java.util.*;
import java.util.function.*;

public class Test25 {

    public static void main(String[] args) {
        Comparator<String> comp = (a, b) -> a.compareTo(b);

        List<List<String>> seznami = List.of(
            List.of("dbilqhyhlvfuobvf", "wl", "dmyhdlusyhh", "kqzbxix", "ecedshfugtutjfrgayvm", "ghrcvvvc", "khxaejccthje", "emnab", "cdaogyx", "wl"),
            List.of("aasltagp", "zdynhwrcrttyzoggui", "arwvitdrgcmxd", "wl", "ecswdjtedy", "sivmhb", "ffmyseapgck", "rgmbgwxaxvvucdcvxasu", "gmb", "ajckznzpciipu", "ioirqwrbumby", "olqgqmoycmrtdg", "mevfueici", "naqwxxkq", "nxhtylypiku", "khxaejccthje", "ozldkxodjyclcrnjoje", "imxqqtchylrupduo", "prrluwlluqxkhasotjp", "ghrcvvvc", "rkbosvozji", "efhd", "vkizabhli", "ecedshfugtutjfrgayvm", "xmtfoxoa", "ppntltmtw"),
            List.of("mevfueici", "wgkk", "zdetjbg", "dp", "zdetjbg"),
            List.of("aasltagp", "zdynhwrcrttyzoggui", "arwvitdrgcmxd", "yakuvwepmbeqhnayzemh", "bsyfujcxiowaydxz", "xjpnyubpujkyzczec", "byiwpmzlxajo", "wgkk", "cpuyndfdgbmwwwnpkjj", "vvdxw", "ecswdjtedy", "sivmhb", "ezxhgyjatpcyxh", "rvtbvorhli", "fojyhimwhyuswj", "rngynfkjvyiplp", "gjilpoik", "rgmbgwxaxvvucdcvxasu", "grkhhlqdqgj", "ozldkxodjyclcrnjoje", "hflsny", "oviamqgbmgjrzwpuem", "hoiyitz", "ojnidq", "hqzxayrmrpu", "od", "imxqqtchylrupduo", "nmirtmyxkkgmsks", "ipcbnohqjk", "ljcvxudid", "jmczcdltrxxudhfeimhj", "kqzbxix", "kubroklrbhuld", "jkiayugxdvzqxsgn", "mevfueici", "ioirqwrbumby", "nqazzgwxmb", "hwepmqobtrgdwksts", "ohyrolpndsutz", "hpodj", "olp", "hlizaoxtnlomljnkr", "oyagtmctfvamesrz", "hbq", "prrluwlluqxkhasotjp", "gqkcufranboak", "rkbosvozji", "ghrcvvvc", "rnyepvwxiivebpayhp", "ffmyseapgck", "sdbrxgjukxsguzz", "emnab", "snikkgmhovrvq", "dp", "wfsl", "cdaogyx", "wndyfptj", "bwid", "xmtfoxoa", "bamiuytqkogdwessfde", "zdetjbg", "ajnhsyprw", "zpicff"),
            List.of("dp", "ezxhgyjatpcyxh"),
            List.of("jfxpo", "nmirtmyxkkgmsks"),
            List.of("arwvitdrgcmxd", "zdynhwrcrttyzoggui", "arwvitdrgcmxd", "ypmtutmzgqqog", "bsyfujcxiowaydxz", "xstlmnancuvcrqs", "bwid", "wndyfptj", "bwid", "wgkk", "cdaogyx", "wgkk", "cdaogyx", "thgerpvkefdsdpnyod", "dbilqhyhlvfuobvf", "thbrhfllyzhl", "jmczcdltrxxudhfeimhj", "thbrhfllyzhl", "ecswdjtedy", "rgmbgwxaxvvucdcvxasu", "ecswdjtedy", "ppntltmtw", "ffmyseapgck", "ppntltmtw", "fojyhimwhyuswj", "omm", "fojyhimwhyuswj", "olp", "ghrcvvvc", "olmasajudmagluayy", "gmb", "ojnidq", "hbq", "nxhtylypiku", "hoiyitz", "nmirtmyxkkgmsks", "hoiyitz", "mevfueici", "hpodj", "kjehbjwsm", "hwepmqobtrgdwksts", "kjehbjwsm", "jkiayugxdvzqxsgn", "kjehbjwsm", "jmczcdltrxxudhfeimhj", "khxaejccthje", "jmczcdltrxxudhfeimhj", "khxaejccthje", "khxaejccthje", "jmczcdltrxxudhfeimhj", "kjehbjwsm", "dpnfgwknrfcyp", "kqzbxix", "jiovowanbtkgdpdrfiae", "mnxoayqjgaexatlhz", "ioirqwrbumby", "mnxoayqjgaexatlhz", "hpodj", "nqazzgwxmb", "hoiyitz", "ohyrolpndsutz", "hflsny", "olmasajudmagluayy", "hbq", "qg", "gqkcufranboak", "sivmhb", "gjilpoik", "vkizabhli", "ghrcvvvc", "vvdxw", "dp", "vvdxw", "dmyhdlusyhh", "wl", "dmyhdlusyhh", "wndyfptj", "bamiuytqkogdwessfde", "xzptwfazrvbtoiszxnpk", "bamiuytqkogdwessfde", "xzptwfazrvbtoiszxnpk", "aasltagp", "zdynhwrcrttyzoggui", "aasltagp", "zm"),
            List.of("vkizabhli"),
            List.of("dp", "zpicff", "dp", "zdetjbg", "jiovowanbtkgdpdrfiae", "qg", "jmczcdltrxxudhfeimhj", "hwepmqobtrgdwksts", "kjehbjwsm", "gpxliwq", "nxhtylypiku", "ghrcvvvc"),
            List.of("nmirtmyxkkgmsks", "wndyfptj", "ljcvxudid", "wfsl", "hbq", "oviamqgbmgjrzwpuem", "qg", "ncnzjrdtehvdpojbz", "thbrhfllyzhl", "ipcbnohqjk")
        );

        for (List<String> seznam: seznami) {
            System.out.println(Cetrta.alternirajoceMonotono(seznam, comp));
        }
    }
}
