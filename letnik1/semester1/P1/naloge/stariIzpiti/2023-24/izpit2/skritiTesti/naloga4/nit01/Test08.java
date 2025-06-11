
import java.util.*;
import java.util.function.*;

public class Test08 {

    public static void main(String[] args) {
        Comparator<String> comp = (a, b) -> b.length() - a.length();

        List<List<String>> seznami = List.of(
            List.of("trzcpjkdmzdsayrl", "bnctlz", "rsmo", "hsfsiwkrcrjhr", "tcxm", "bxozuubwsgdnaoyrdd"),
            List.of("xuej", "vvuvj", "zfzmesuxuyevj", "bddxpqygdfpupsyoig", "wmhxqagtvofilyhjnfb"),
            List.of("xyhacfvsogdandusgk", "hxxbdb", "iqnmvrpmyzxhmzu", "laloctzrce", "pgrzwustsmcrow", "lcsmgnmwqobsy", "pukeclhkzmtvq", "dujofeklfoqckem", "oqzvmmtbyh", "thlbstbnvpatsjosadt"),
            List.of("fyzewrxohrpxcxfrnpkr", "jt", "oqlrntzmnxteeadthxcb", "jdo", "rwuhisdndxzucsmpsrif", "zvn", "bnbbjwpsrcnlseyytjs", "lqrw", "cfbwmemcornvrqwwins", "tcxm", "bnbbjwpsrcnlseyytjs", "tcxm", "wspvaznoxruvgbolhj", "vvuvj", "yzigetyvptmtdgxjlm", "vvuvj", "prpxvabbsjrbwlqcw", "wfwqg", "blnnsipsauzhbuvnc", "ujilin", "vfzqktvlxowevziiz", "rytveg", "nxjtozfmnkljgbxl", "svburw", "pvmfgjfnrcrsgomv", "gnmtzbf", "pvmfgjfnrcrsgomv", "gnmtzbf", "pvmfgjfnrcrsgomv", "zahxgooi", "dujofeklfoqckem", "zahxgooi", "wqyveeaphwiou", "jqvtkastiu", "tcburipsohyyq", "jqvtkastiu", "onsqqrppvflgl", "oqzvmmtbyh", "ncbrtdshmudda", "oqzvmmtbyh", "wqyveeaphwiou", "jqvtkastiu", "tcburipsohyyq", "oqzvmmtbyh", "onsqqrppvflgl", "bugziapnxxk", "lfgonrcnoqrc", "aozslxffzgkp", "cfbwmemcornvrqwwins", "hambkexafheh", "hambkexafheh", "hsfsiwkrcrjhr", "tlgszddwwlw", "ncbrtdshmudda", "mdwpnbbowjp", "pukeclhkzmtvq", "bugziapnxxk", "ylsdwnmqanlldg", "oqzvmmtbyh", "flxcpckhektnkb", "jqvtkastiu", "wchtmifhmpzrubd", "ynuzrqdxq", "spbzqurlxmhdvjv", "humdvoidh", "dujofeklfoqckem", "zahxgooi", "wchtmifhmpzrubd", "gnmtzbf", "wchtmifhmpzrubd", "thbncxa", "outbkccemgtuecj", "svburw", "quitwiegzpqwoku", "bnctlz", "vtpfgqgdhndzfqay", "rytveg", "prpxvabbsjrbwlqcw", "svburw", "blnnsipsauzhbuvnc", "vvuvj", "rtlnvsqfyekkjjhnfu", "wqdwd", "yztuwvwbyppwvrdikt", "rsmo", "lfgonrcnoqrc", "vihu", "jbzqtfqalbydsvnqjhh", "xvin", "bnbbjwpsrcnlseyytjs", "vihu", "cfbwmemcornvrqwwins", "uhy", "wmhxqagtvofilyhjnfb", "mtt", "yykjxmpjqjcheplqbymn", "nb", "yykjxmpjqjcheplqbymn", "ly", "yykjxmpjqjcheplqbymn"),
            List.of("fyzewrxohrpxcxfrnpkr", "nb", "wspvaznoxruvgbolhj", "jt", "nxjtozfmnkljgbxl", "pk", "pvmfgjfnrcrsgomv", "nb", "pvmfgjfnrcrsgomv", "zvn", "mszsvcktjffqvqyf", "mtt", "trzcpjkdmzdsayrl", "vihu", "pvmfgjfnrcrsgomv", "xvin", "spbzqurlxmhdvjv", "tcxm", "outbkccemgtuecj", "vrpbamb", "guuiyujeffybtto", "thbncxa", "ylsdwnmqanlldg", "bzswgegi", "pgrzwustsmcrow", "zahxgooi", "pgrzwustsmcrow", "ezboelhm", "tcburipsohyyq", "ynuzrqdxq", "wtfmelysvcrtf", "tlgszddwwlw", "lfgonrcnoqrc", "okppghhbfcmo", "vgfiwvwcrax", "onsqqrppvflgl", "mdwpnbbowjp", "wqyveeaphwiou", "jqvtkastiu", "flxcpckhektnkb", "mytvsyehw", "iqnmvrpmyzxhmzu", "gnmtzbf", "guuiyujeffybtto", "svburw", "spbzqurlxmhdvjv", "svburw", "nxjtozfmnkljgbxl", "hxxbdb", "prpxvabbsjrbwlqcw", "vihu", "bxozuubwsgdnaoyrdd", "xvin", "xyhacfvsogdandusgk", "rsmo", "yztuwvwbyppwvrdikt", "rsmo", "bnbbjwpsrcnlseyytjs", "jdo", "wmhxqagtvofilyhjnfb", "nb", "rwuhisdndxzucsmpsrif", "jt", "tkltzlllpuljojyqzhch", "pk", "rwuhisdndxzucsmpsrif", "ly"),
            List.of("wfwqg", "jt", "xyhacfvsogdandusgk", "xvin", "mszsvcktjffqvqyf", "hxxbdb", "oamzwldvhlirm", "zahxgooi", "tlgszddwwlw", "jqvtkastiu", "cxvbndzdi", "aozslxffzgkp", "thbncxa", "dujofeklfoqckem", "rwuhisdndxzucsmpsrif", "blnnsipsauzhbuvnc", "mtt", "bnbbjwpsrcnlseyytjs"),
            List.of("wspvaznoxruvgbolhj", "rsmo", "vtpfgqgdhndzfqay", "tvfa", "ogoqvrcwdjfxhbd", "vrpbamb", "pukeclhkzmtvq", "laloctzrce", "pukeclhkzmtvq", "spbzqurlxmhdvjv", "tcburipsohyyq", "wfwqg", "bnbbjwpsrcnlseyytjs", "yykjxmpjqjcheplqbymn", "hul"),
            List.of("yzigetyvptmtdgxjlm", "prpxvabbsjrbwlqcw", "pk", "zvn", "guuiyujeffybtto", "jdo", "zfzmesuxuyevj", "xuej", "wtfmelysvcrtf", "tcxm", "zfzmesuxuyevj", "vihu", "hambkexafheh", "sxyai", "bugziapnxxk", "uwpus", "vgfiwvwcrax", "uwpus", "vgfiwvwcrax", "mytvsyehw", "thbncxa", "onsqqrppvflgl", "vrpbamb", "wqyveeaphwiou", "vrpbamb", "lcsmgnmwqobsy", "vvuvj", "zfzmesuxuyevj", "tcxm", "quitwiegzpqwoku", "rsmo", "prpxvabbsjrbwlqcw", "jdo", "yztuwvwbyppwvrdikt", "uhy", "wmhxqagtvofilyhjnfb", "ndo"),
            List.of("wspvaznoxruvgbolhj", "rsmo", "mszsvcktjffqvqyf", "tcxm", "vfzqktvlxowevziiz", "bzswgegi", "zfzmesuxuyevj", "pukeclhkzmtvq", "mdwpnbbowjp", "onsqqrppvflgl"),
            List.of("cfbwmemcornvrqwwins", "uwpus", "laloctzrce", "spbzqurlxmhdvjv")
        );

        for (List<String> seznam: seznami) {
            System.out.println(Cetrta.alternirajoceMonotono(seznam, comp));
        }
    }
}
