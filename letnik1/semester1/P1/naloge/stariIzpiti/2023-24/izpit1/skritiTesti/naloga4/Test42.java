
import java.util.*;

public class Test42 {

    public static void main(String[] args) {
        List<String> la = List.of("anq", "anu", "awu", "bcq", "bdi", "bdz", "beu", "bgv", "bhj", "bie", "bjr", "bmn", "bmr", "bsc", "btj", "cci", "chr", "ckl", "cqt", "csg", "cta", "cuf", "cxk", "dln", "dmy", "dtc", "dyn", "dzp", "ebt", "eja", "ezh", "fae", "fai", "fui", "fzl", "fzu", "gaq", "ghz", "gkv", "gsz", "gym", "gza", "gzi", "hgw", "hib", "hju", "hqq", "iov", "ira", "izb", "jdq", "jhq", "jml", "jra", "jrh", "kbz", "kiy", "kld", "koa", "ktq", "kwl", "lel", "lss", "ltw", "luw", "lvo", "mit", "mkn", "mqe", "mqw", "msb", "msn", "nkp", "nsc", "nwy", "oez", "okq", "pim", "pnk", "poj", "pqp", "pyj", "qep", "qff", "qiv", "qpv", "qwn", "qzj", "rcf", "rcl", "rgn", "rla", "rtq", "rtw", "rza", "scc", "shf", "sli", "spb", "swj", "tao", "tjd", "tli", "tts", "uah", "ucd", "ueh", "uex", "uoe", "vcg", "vfo", "vfp", "vuf", "wai", "wka", "wll", "wrj", "wrp", "xfj", "xgq", "xhl", "xkb", "xmh", "xqk", "xui", "xxf", "yif", "ylu", "yop", "yvd", "yxh", "zgc", "ziu", "zmt", "zud");
        List<String> lb = List.of("afg", "ajw", "amh", "aov", "apx", "azt", "bhv", "big", "bko", "bnq", "bpq", "bsr", "cmb", "crj", "ddr", "djq", "dqj", "dxi", "ehx", "ent", "eqj", "fcu", "fhj", "fhp", "fib", "fmb", "fvb", "gmb", "gpt", "hci", "hid", "hlc", "hvn", "hzv", "ibg", "icp", "ihi", "ihx", "iio", "itb", "itq", "iuw", "jbd", "jpp", "khd", "khv", "kkh", "kmj", "kmp", "knu", "kxv", "ldi", "llg", "llz", "lmd", "lnt", "min", "mup", "mus", "mxn", "ncq", "nxd", "oao", "oeu", "ogt", "onj", "ooh", "oqb", "osh", "pfa", "pnq", "psv", "pzu", "qdw", "qem", "qlu", "quj", "qxh", "rbm", "rci", "rfw", "rly", "rpd", "rqp", "rsp", "rsq", "spz", "ssq", "stx", "syg", "tgr", "tux", "ufm", "urk", "uzr", "vbw", "vft", "vhe", "vjm", "voc", "vtt", "vvs", "wau", "wnj", "wpi", "www", "xcj", "xdd", "xjw", "xsg", "ybf", "yhc", "ykm", "ymk", "yux", "zha", "zqf", "zrk", "zue");
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
