
import java.util.*;

public class Test36 {

    public static void main(String[] args) {
        List<String> la = List.of("aeu", "agm", "ahg", "aua", "byn", "cru", "cwx", "dhv", "ehz", "ery", "exl", "fer", "fgp", "fgq", "gav", "ger", "ggk", "gla", "gmw", "hmb", "iae", "ikp", "ilp", "iqh", "iue", "ivb", "iwn", "jeq", "jfu", "klo", "ksv", "kzc", "lay", "loi", "lss", "mao", "mcr", "mfo", "mva", "nde", "ndp", "ngj", "nhv", "okf", "opf", "oqn", "ovy", "oyk", "plh", "pof", "pqb", "pqc", "pqu", "ptc", "qiq", "qkp", "qlu", "qug", "qzv", "rbs", "rim", "rin", "rxh", "ryb", "sea", "sfu", "shc", "ski", "slo", "spn", "stc", "tey", "tnu", "tuj", "tvv", "ufa", "uxi", "uzl", "vci", "vgr", "wbh", "wjb", "wop", "wxm", "xfi", "xir", "xwz", "yco", "yhc", "yny", "ywc", "zas", "zbj", "zic", "zkr");
        List<String> lb = List.of("abf", "abi", "acm", "aef", "aic", "aik", "akh", "akr", "any", "aoi", "apw", "aqe", "aqq", "aqv", "arc", "arm", "asd", "auk", "avx", "azd", "bag", "bbd", "bbo", "bdy", "bei", "bej", "bgq", "bgy", "bid", "bif", "bjj", "bkk", "bll", "blu", "boe", "boh", "bqr", "bru", "btn", "btu", "bub", "bup", "bvr", "bvw", "bxe", "bxk", "bxx", "bzx", "ccz", "ckv", "clc", "cov", "cpa", "csr", "dau", "dbo", "del", "dil", "dkn", "dlr", "dmj", "dmm", "dmv", "doj", "dtn", "dul", "duz", "dwl", "dwo", "dyl", "eft", "ehs", "ehz", "ems", "emu", "ena", "enw", "eot", "epi", "epx", "eqi", "esl", "etb", "etl", "evc", "evz", "ewm", "exc", "exu", "ezy", "fam", "fbk", "fbn", "fcw", "fgj", "fhn", "fju", "fkl", "fmx", "fna", "fpu", "frw", "fsq", "ftp", "fvn", "fwc", "fxc", "fxr", "gcr", "gfp", "gga", "ggh", "ggv", "gie", "gjp", "gnq", "goq", "gsd", "guu", "gva", "gve", "gxn", "gyg", "gzi", "hcm", "hdl", "hfn", "hig", "hpb", "hpi", "hrx", "igb", "igi", "igm", "ihv", "iip", "ijt", "ijy", "ish", "isv", "iub", "ivm", "izq", "izx", "jbt", "jca", "jmm", "jna", "jnr", "jqv", "jsl", "jta", "jvp", "jwy", "jxy", "jzk", "kcg", "kdn", "ket", "kgo", "kis", "knm", "knv", "kqs", "ktt", "ktu", "kuo", "kws", "kwu", "kxj", "kxk", "kxu", "kyh", "kyl", "kzz", "lai", "lea", "ljn", "ljz", "lkp", "lks", "lkw", "lmv", "lof", "lqq", "lqs", "lrb", "lsq", "lth", "lyw", "maf", "mav", "mcn", "mcx", "mep", "mgz", "mir", "mkf", "mli", "mlp", "mmu", "mpd", "mpk", "mra", "mrn", "mto", "mvj", "mwl", "mxx", "myv", "nac", "naj", "nct", "ndb", "ndo", "njt", "nnf", "npu", "nqf", "ntn", "nvz", "nwb", "nwq", "nzr", "ocf", "oel", "ofi", "omc", "omx", "opg", "opz", "osb", "otd", "otg", "oua", "ovi", "ovm", "ovo", "oxi", "ozo", "ozy", "pau", "pbz", "pev", "pgl", "phz", "pil", "pkh", "psm", "psq", "puo", "pwt", "pyr", "pzr", "qad", "qba", "qdq", "qei", "qfz", "qhk", "qib", "qim", "qit", "qji", "qjk", "qkk", "qmq", "qnd", "qor", "qpl", "qrc", "qst", "quj", "qvl", "qwi", "qwx", "qyr", "rbe", "rda", "rdg", "rea", "reb", "reg", "rgo", "rku", "rmc", "rna", "rsa", "rsg", "rta", "rtm", "run", "ruo", "ryk", "sbc", "sbe", "sbo", "sdw", "sft", "sgp", "snv", "sso", "sti", "suf", "svc", "sxt", "tak", "tbi", "tei", "thy", "tjc", "tjh", "tnd", "tol", "toq", "tpa", "tsj", "tsq", "tto", "tvl", "txd", "txj", "uaf", "ubh", "udh", "uea", "uev", "ugj", "umg", "uqq", "urg", "uwi", "uwr", "vam", "vei", "vid", "vjk", "vss", "vtn", "vux", "vzz", "wcq", "wcz", "wgg", "wjd", "wmu", "wni", "wpu", "wpy", "wqi", "wvh", "wvk", "wvn", "wwm", "wxf", "xbv", "xck", "xcq", "xdi", "xei", "xfd", "xkj", "xlj", "xni", "xoa", "xra", "xrv", "xsl", "xte", "xty", "xvg", "xvh", "xye", "xym", "xyo", "xzy", "ych", "ydr", "ygw", "yij", "yjt", "ykq", "ykx", "ylj", "ynp", "yod", "ypc", "ypi", "yqr", "yrt", "yte", "yvz", "ywl", "ywy", "yxe", "yxh", "yxs", "yxt", "yzo", "zbp", "zbz", "zdi", "zel", "zhb", "zni", "znv", "zog", "zpj", "zum", "zvf", "zxy", "zye", "zyk");
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
