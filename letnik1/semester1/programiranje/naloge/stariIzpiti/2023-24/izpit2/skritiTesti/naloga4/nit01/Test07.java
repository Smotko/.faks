
import java.util.*;
import java.util.function.*;

public class Test07 {

    public static void main(String[] args) {
        Comparator<String> comp = (a, b) -> a.length() - b.length();

        List<List<String>> seznami = List.of(
            List.of("lbgka", "fdjwgx", "gqdpltfgncrqbyfyqojn"),
            List.of("ia", "torpgbkcubwahmengdux", "ky", "ucydadcsvvzurxircgcu", "oir", "wnullvxcmtnptbkmcroj", "avsf", "mzapngsibxwkdiiutbrl", "qmya", "focxreucrjvsruuvrlg", "lcjez", "svcrhishipywxxffsg", "yclkc", "lusooflilsshwykwmr", "dcasww", "mcohuskplivsbflla", "nfyyexj", "sbtounwvoabdpmvu", "rubrlniq", "lvcvrribxbjadfhk", "oopmherwp", "isvwlbrdtfkffdy", "vyphbsrqlf", "kdwcsogpykmamae", "mbjhobneis", "awjtthzvumlbye", "xmzkarzrzmv", "tvxbblfkpjmiy", "zpzredvmblgq", "jrxxfnfxhbjzm", "ndkpiifcvmbmlr", "ufinvjssiponb", "dpnnvwjshkxqspo", "trhvclrueyb", "dxgthyqfvhwzpjd", "kupwsbslrhz", "iynkuqbinvwdjbme", "hnfomplaumh", "ybiofxenrqypyoeq", "hmlnhnijcen", "godxdetmtgbocpnp", "yeyrhzxr", "krtptucduinwqptkm", "dbkamyuu", "uibhmihebuzpouurf", "qofnann", "dcuiynceiqqxanmmm", "tsby", "bdtvixqrmwogmurxt", "hspp", "egzhdhppfemhktczl", "vffb", "ihqfhascumqnbtepp", "lc", "bsrivyunfhnxgrelxvl", "bo", "jdjammllweqtustsoha", "il", "gcngiwaecdmuxveubrmy", "bo"),
            List.of("bjq", "ugsnadmecofizxwsr", "rbavx", "svwwyjmejud", "dpijjrqrdobntrn", "rkzy", "pbqzxjknzzrrgqogazt"),
            List.of("lc", "rejookrnyugyqbzonj", "fq", "glhvaxzkbwwyyjyyw", "len", "uymrodazdglenbhiy", "xnhd", "zdkboodqyblztubxz", "wzszx", "ykoooeoyisaduojrf", "jcswl", "vtpfgqgdhndzfqay", "glepc", "uhfiyrtsvkzipzrc", "fwhpnr", "fbqbucikyrgtrce", "vyqtko", "wbqizlvgyxdbsa", "aymigo", "daosllhrwyglir", "jivaipx", "gyeccoquvyjnjm", "upvaigrj", "gwpmxdensvlzn", "vifykytbp", "qadozaprmtuza", "mxacfioeb", "zlutprluhvpfj", "rclryepwc", "tzvpxtotkcmj", "jmlkrbxpj", "wgambcpcyvr", "tgzldeabtda", "svwwyjmejud", "jwsoxbmcijm", "fndioudlrkf", "vosxqzvenck", "nxhtylypiku", "unrpczflnmk", "atnlrqmsjpk", "ibkmxolyrdtq", "ioihtukjef", "dhbmaywjteivh", "glqocxnqyr", "xojiielpefpohq", "wdbczuyzfc", "pitdxjobgkestb", "wvyyfawjn", "dpijjrqrdobntrn", "mxacfioeb", "cerwmtzspihbvpd", "txoizuac", "qobeborjliqdxvc", "fmffhuvl", "lttsksprmltzfemq", "uydbxc", "ptlmvkmnddenrbia", "domwqd", "oquogewyoscaxkto", "meghjo", "qsjkzwkifdulagamu", "ics", "mcohuskplivsbflla", "nxf", "gbigcltfutxllnucr", "haf", "lusooflilsshwykwmr", "vxx", "jdjammllweqtustsoha", "ih", "zgmxsgludcotqboppttn", "ky", "gqdpltfgncrqbyfyqojn", "md", "yykjxmpjqjcheplqbymn"),
            List.of("dxgthyqfvhwzpjd"),
            List.of("lvcvrribxbjadfhk", "lkkm", "xysccsjurkrjxhrd", "lkkm", "dtsrrjjvtjvgroounvy"),
            List.of("gkjmaygj", "vyqtko", "pxfvxsvnqubvgwndmwht"),
            List.of("egdkyle", "wgambcpcyvr", "aouukiozu", "dpwaxaln", "wqrcgbdiifp"),
            List.of("vzydliab", "yvacxvsdxojbfmwsn", "lntytnlkcilbapxhiow", "otwtdfyqnbhh", "ihqfhascumqnbtepp", "zorvptig"),
            List.of("tsby", "egzhdhppfemhktczl", "uvpyb", "excqzfifrkahnvv", "umwzdzgo", "wqrcgbdiifp", "fizrjsrkgh", "quxkc", "hvktycqhjc")
        );

        for (List<String> seznam: seznami) {
            System.out.println(Cetrta.alternirajoceMonotono(seznam, comp));
        }
    }
}
