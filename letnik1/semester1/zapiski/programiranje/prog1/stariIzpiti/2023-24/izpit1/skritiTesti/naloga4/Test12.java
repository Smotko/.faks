
import java.util.*;

public class Test12 {

    public static void main(String[] args) {
        List<String> la = List.of("aco", "aen", "aew", "ahj", "ahr", "aiw", "ajj", "ama", "amf", "aqf", "arp", "aru", "asm", "avi", "avn", "avv", "awd", "axg", "azb", "azi", "bbi", "bcv", "bez", "bfp", "bgl", "bjv", "bke", "bkt", "blp", "bpr", "byc", "caq", "cdv", "cej", "cek", "cel", "cif", "cji", "coh", "crm", "csb", "cuc", "cug", "cxl", "dag", "daq", "dgg", "dgl", "dgq", "dgr", "dhr", "djx", "dlq", "dnv", "dom", "dqm", "drb", "dsu", "dwg", "dxa", "ecf", "ect", "een", "egl", "egy", "ejb", "emi", "eof", "eou", "eqx", "esv", "esy", "evn", "ewo", "exd", "exe", "ezd", "ezl", "fas", "fcs", "fde", "fdf", "fdx", "fez", "fft", "fgd", "flt", "fmj", "fqh", "frp", "fxs", "fze", "fzz", "gbu", "gcm", "gfs", "gix", "gnk", "gpu", "gvr", "gvu", "gzv", "hbp", "hct", "hie", "hkg", "hna", "hpt", "hqo", "hrl", "hsk", "hxn", "ian", "iij", "iik", "inq", "ins", "iqe", "itx", "iwo", "ixj", "izu", "jbo", "jdc", "jdu", "jex", "jez", "jgp", "jhn", "jhp", "jhq", "jiw", "jlt", "jnt", "joa", "jrb", "juy", "jvq", "jwb", "kbu", "kbw", "kcp", "kcv", "kdf", "kdl", "kks", "klm", "klo", "klz", "knb", "kob", "koe", "kpw", "ktg", "kui", "kwo", "kxd", "kzj", "laq", "lbn", "lbt", "ldx", "ldy", "lei", "lho", "lhv", "lmg", "lmh", "lmk", "lnc", "lpa", "lpl", "lqv", "lub", "lxs", "maf", "mbd");
        List<String> lb = List.of("mcr", "mfk", "miq", "mrl", "mvz", "mzb", "nai", "nar", "ndo", "nhf", "nni", "noq", "npp", "nqh", "nrk", "nru", "nvj", "nvv", "nyd", "nyv", "oag", "obz", "ohk", "oht", "okt", "ond", "oou", "oqn", "otz", "ovk", "owh", "ozw", "pfl", "pgj", "phh", "plv", "prs", "prw", "prz", "pww", "pyi", "pym", "qav", "qba", "qbf", "qci", "qen", "qfx", "qiq", "qlh", "qop", "qoz", "qpw", "qtv", "qvi", "qwh", "qwl", "qxa", "qxw", "qyb", "qyf", "ray", "rbp", "rbr", "rgh", "rhf", "rkp", "rnn", "rqi", "ruz", "rvy", "ryl", "san", "saq", "sdh", "sdm", "sft", "shq", "shx", "sii", "sne", "sqy", "stq", "swd", "swr", "swz", "sxq", "szo", "tah", "tam", "tdc", "tde", "tku", "tob", "tqh", "trm", "tta", "tux", "txv", "udt", "ujo", "umb", "uok", "uol", "uqa", "uqe", "uqs", "ury", "uul", "uwt", "uwz", "uxb", "uxf", "uyc", "uyy", "vav", "vdd", "vgb", "vka", "vnm", "vqt", "vsa", "vse", "vuq", "vzp", "wav", "wcr", "wfc", "wfw", "whn", "wjb", "wks", "wlw", "wpq", "wpt", "wqz", "wun", "wve", "wyr", "xbd", "xet", "xgq", "xiu", "xkj", "xlq", "xqu", "xsj", "xwu", "xxe", "xyg", "ybf", "yem", "yeq", "ygt", "yhy", "yim", "yjp", "yqn", "ysm", "yvv", "ywv", "yxv", "yzj", "zah", "zax", "zgl", "ziz", "zkf", "zma", "znq", "zns", "znu", "znv", "zqk", "zvz", "zxi", "zyy");
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
