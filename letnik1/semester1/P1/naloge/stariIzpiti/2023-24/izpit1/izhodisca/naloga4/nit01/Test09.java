
import java.util.*;

public class Test09 {

    public static void main(String[] args) {
        List<String> la = List.of("auu", "ciu", "cxn", "dlx", "dux", "eey", "esa", "ezu", "fgn", "gld", "hcv", "hol", "kmg", "mmx", "niv", "nwh", "qpv", "rha", "sfu", "slj", "uqt", "uqy", "vkz", "wzc", "xcp", "yhj", "yri");
        List<String> lb = List.of("aah", "abj", "acd", "aeo", "afq", "alg", "bam", "bct", "bei", "bgm", "bhu", "bic", "bid", "big", "bpl", "bqy", "brc", "bwp", "cat", "cdi", "chn", "cjl", "cjm", "cnb", "con", "cqq", "cre", "crn", "crr", "cte", "cuz", "cvc", "cvl", "cvz", "cwd", "cxl", "cyi", "czq", "czv", "dce", "dei", "dep", "dev", "dnf", "dos", "dpw", "dqw", "dsp", "dtr", "duw", "dvq", "dxb", "dxw", "eao", "edb", "eea", "efx", "ehq", "ehy", "elc", "enq", "eoz", "epp", "euc", "exk", "fci", "fdr", "fjq", "fmw", "fol", "fph", "fpk", "fud", "fur", "fxj", "gfl", "ggm", "ggu", "gls", "gmp", "goy", "gts", "gzx", "hat", "hef", "hgw", "hpc", "hsw", "hzn", "ibi", "icr", "ieg", "ifh", "iie", "ilm", "inh", "irj", "itd", "iyp", "iza", "izn", "izv", "jbl", "jcc", "jep", "jir", "jjb", "jkk", "jkt", "jlf", "jon", "joo", "jpy", "jqp", "jrg", "jrk", "jve", "kbf", "kbh", "kdc", "kfh", "kma", "kmm", "leu", "lfe", "lfz", "lgv", "lko", "llo", "lnm", "lte", "lys", "mds", "mee", "mhm", "mhz", "mil", "mjz", "mlb", "mnr", "mvx", "mzi", "nbx", "nej", "nfw", "nhg", "nkp", "nmd", "nor", "nrk", "nrs", "nsb", "nxp", "nyc", "nzv", "nzy", "oeg", "oez", "ogh", "ogm", "ogt", "oht", "ohz", "oif", "oil", "oip", "ojj", "okf", "oou", "oxr", "ozu", "pbf", "pdg", "pfd", "piy", "ppr", "ppv", "pwf", "pxh", "pxt", "pyr", "pzl", "qbb", "qgv", "qhs", "qiv", "qlt", "qma", "qpk", "qzi", "rbh", "rfa", "rkt", "rna", "rpl", "rpq", "rrm", "rvi", "rvl", "saq", "seo", "sfd", "skj", "skr", "sse", "ssx", "sxj", "sxr", "syz", "tat", "tic", "tpc", "tpl", "tvu", "txd", "txv", "tzz", "uar", "ubf", "udc", "uef", "uei", "uen", "ufi", "ujd", "uoj", "uqm", "uqy", "utd", "uwe", "vbx", "vci", "vct", "vek", "vel", "viz", "vje", "vnt", "vow", "vpm", "vuv", "vvi", "vvz", "vxg", "vxk", "vyi", "wco", "weu", "whk", "why", "wnx", "wqy", "wsf", "wvb", "wxc", "wyw", "wzm", "xak", "xba", "xbl", "xfa", "xki", "xlu", "xmz", "xnj", "xok", "xpp", "xrp", "xsj", "xur", "xus", "xwc", "xwj", "xyo", "yaa", "yar", "yhf", "ypb", "yqn", "yth", "yve", "ywb", "zcd", "zfp", "zgt", "zhs", "zlo", "zpb", "zpy", "zxs");
        List<String> lc = it2list(Cetrta.zlitje(la.iterator(), lb.iterator()));
        System.out.println(lc);
    }

    private static <T> List<T> it2list(Iterator<T> it) {
        List<T> seznam = new ArrayList<>();
        while (it.hasNext()) {
            T element = it.next();
            seznam.add(element);
        }
        return seznam;
    }
}
