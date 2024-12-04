
import java.util.*;

public class Test14 {

    public static void main(String[] args) {
        List<String> la = List.of("abb", "afp", "aga", "agp", "agz", "akn", "aly", "aqp", "arf", "atz", "auz", "avg", "awc", "awf", "awm", "axj", "ayc", "ayy", "azg", "azo", "bac", "bbi", "bbm", "beq", "bff", "bfn", "bgq", "bhw", "bim", "bjt", "bjz", "bkk", "bmg", "bnq", "boa", "bot", "bpg", "brw", "bsl", "bvg", "bwk", "bxp", "cai", "cbq", "cca", "ccv", "ccx", "cdd", "cdf", "cey", "cii", "cln", "clq", "cof", "coz", "cpl", "cpt", "crx", "cts", "cuj", "cul", "cvw", "cvy", "cxp", "cxs", "cyg", "czp", "dbk", "dci", "dct", "des", "dgy", "dha", "dhv", "dkf", "dlz", "dqg", "dqp", "drf", "dsz", "dua", "dva", "dwp", "dxb", "dzy", "eaj", "eaq", "edw", "ejm", "eju", "eki", "elb", "emq", "emt", "enj", "eor", "epq", "erd", "erf", "erj", "etg", "euy", "eww", "eyp", "eyu", "ezn", "fbp", "fcv", "few", "fjl", "fmm", "fmr", "fnm", "fnn", "fot", "fpb", "fqa", "ftt", "fun", "fvn", "fxp", "fyq", "gam", "gbc", "gbn", "gcd", "get", "gfu", "ghj", "ghs", "ghv", "giu", "gkq", "gln", "glo", "gnu", "grs", "gse", "gsh", "gyr", "gyu", "gza", "gzy", "haz", "hce", "hda", "hdm", "hej", "hff", "hfp", "hge", "hhb", "hhh", "hhl", "hjk", "hka", "hkd", "hmw", "hok", "hro", "hrs", "hso", "htb", "hua", "hur", "hxa", "hyw", "hzo", "iab", "iai", "ibc", "ibm", "idq", "iec", "iel", "igd", "ijc", "ijo", "ikb", "ikv", "ikw", "ily", "imo", "inf", "inl", "ins", "ipc", "ipv", "irl", "isr", "iul", "ivk", "iwq", "ixp", "jbd", "jbs", "jcg", "jct", "jdi", "jej", "jex", "jhs", "jik", "jip", "jki", "jmb", "jmf", "jny", "jos", "jov", "jpx", "jrk", "jrq", "jse", "jsh", "jsm", "jsp", "jvo", "jwg", "jww", "jxt", "jyd", "jyi", "jzb", "kao", "kat", "key", "kgq", "khu", "kiq", "kji", "kkp", "kkr", "kos", "kpo", "kqk", "krf", "krv", "ksu", "kuu", "kwg", "kwz", "lbi", "lbq", "lij", "ljb", "lls");
        List<String> lb = List.of("lob", "log", "lqd", "lry", "lst", "lth", "lue", "lvx", "lxi", "lyl", "lyt", "lza", "mau", "mbe", "mdh", "mdo", "meu", "mfl", "mge", "mjh", "mme", "mmw", "mpl", "mpt", "msn", "mug", "mul", "mxz", "mzf", "nbe", "ncl", "nex", "nfu", "ngt", "nhy", "nii", "nml", "nui", "nuq", "nuz", "nwl", "nxg", "nxy", "nzq", "oak", "obf", "obr", "odz", "ofw", "ogg", "ojd", "okl", "okq", "omg", "ona", "opp", "oqo", "osm", "otn", "ouu", "oyl", "pdk", "peg", "pep", "pev", "pfg", "phf", "phw", "pni", "pol", "poy", "pqr", "pry", "psg", "puk", "puv", "pux", "pvy", "pwx", "pwy", "pxk", "pza", "qab", "qay", "qbd", "qbw", "qfj", "qgy", "qhs", "qig", "qim", "qmt", "qog", "qoq", "qqu", "qrg", "qub", "qza", "rba", "rjf", "rkr", "rmb", "rnn", "rny", "rqp", "rqx", "rrg", "ruk", "rus", "rws", "rxa", "rxp", "rxt", "sfn", "shc", "sje", "sjn", "sju", "sla", "slq", "slw", "soo", "sop", "sqg", "sqj", "sqk", "ssz", "stv", "suz", "svx", "svy", "szo", "tdg", "tep", "tfm", "tge", "tgf", "tib", "tie", "tlf", "tpt", "tqa", "tqh", "trn", "trr", "tsg", "tsp", "tun", "tvi", "twc", "tyv", "uci", "ucw", "udf", "uhd", "ujp", "ulb", "uln", "uma", "umb", "upt", "uqh", "uqq", "uts", "uwq", "vbj", "vda", "vek", "vfx", "vgg", "vhm", "vhp", "vij", "vkm", "vlw", "vnl", "vus", "vvt", "wau", "wfd", "wgl", "wgs", "wjd", "wjy", "wkz", "wlr", "wqf", "wqp", "wro", "wub", "wuw", "wwq", "wxk", "wyy", "xce", "xec", "xeq", "xgb", "xhe", "xhv", "xjv", "xlu", "xmd", "xnj", "xtd", "xvi", "xxa", "xxb", "xxc", "xzk", "ybn", "ycq", "yct", "ydw", "yhq", "yhz", "yld", "ylo", "yoh", "ypq", "ypr", "ypv", "ypy", "ysy", "ytt", "yvd", "ywn", "yyc", "yze", "zal", "zay", "zbo", "zdb", "zfi", "zgm", "zgr", "zgz", "zis", "zjm", "znc", "zoy", "zsk", "ztw", "zul", "zut", "zwt", "zzb");
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
