
import java.util.*;

public class Test07 {

    public static void main(String[] args) {
        List<String> la = List.of("aaf", "aav", "adp", "ake", "ano", "apg", "avd", "awn", "ayt", "bbw", "beb", "bsv", "bxn", "cml", "cun", "cwd", "czb", "dci", "deg", "dgu", "dld", "dmg", "dse", "dvc", "dwz", "dzu", "ecr", "eif", "eqv", "euk", "fal", "fff", "fgz", "fkh", "fnq", "fpy", "fvq", "gbz", "gel", "gmi", "grm", "gww", "haw", "hcb", "hen", "hft", "hki", "hnd", "hsy", "hvv", "hyi", "ifn", "iij", "iky", "ilo", "inq", "ivf", "jfg", "jkb", "jpv", "kbh", "kdy", "kjv", "kly", "kus", "kvm", "kzd", "lgu", "llp", "log", "lyf", "mdb", "mft", "mnb", "moz", "mus", "myi", "ncg", "nhn", "nqn", "nxo", "nyy", "ocz", "olf", "oxd", "pfc", "phi", "pma", "pnw", "pra", "ptc", "pxq", "qba", "qcq", "qkb", "qkj", "qoq", "qpp", "qut", "rcw", "rde", "rft", "roz", "rpj", "rta", "rvp", "rwz", "sdt", "skq", "suw", "syv", "tcp", "tek", "ths", "tmi", "tnl", "tqh", "tvd", "uat", "udj", "ufl", "ujg", "umc", "uob", "uwm", "uxg", "uza", "vez", "viw", "vmi", "vpl", "vtg", "vuj", "vyp", "vzs", "wjc", "wmm", "wog", "wtp", "wvk", "wzp", "xfq", "xjd", "xmc", "xrj", "xvh", "ycc", "yfo", "yhb", "yoa", "ysx", "yxj", "yzs", "zkn", "zle", "ztn");
        List<String> lb = List.of("aaj", "ace", "aje", "amc", "apd", "arv", "avs", "axi", "bav", "bcn", "bon", "bvm", "cfr", "csm", "cvd", "cxa", "dcc", "dcy", "dfw", "dhl", "dll", "dnf", "dtv", "dwn", "dyi", "eay", "ehy", "enb", "erm", "fag", "fby", "ffz", "fhn", "fkp", "fpd", "frh", "gab", "gdd", "gep", "gpb", "guu", "ham", "hbr", "hed", "hfj", "hhu", "hko", "hqq", "hth", "hxh", "icy", "ihf", "ijs", "ilh", "imc", "irk", "jfa", "jhe", "jms", "jxk", "kbz", "kga", "kjz", "kmq", "kvk", "kxu", "lbh", "ljo", "llt", "los", "mad", "meo", "mmz", "mnc", "mpe", "myb", "nab", "ndc", "nly", "nts", "nxq", "ocy", "oek", "ooj", "pbf", "pgt", "plb", "pmk", "pqv", "psu", "pwa", "pxy", "qcd", "qhz", "qkd", "qkp", "qoz", "quc", "qwh", "rcx", "rfl", "rjx", "rpa", "rqp", "rtb", "rvz", "sba", "sft", "sny", "sxv", "szp", "tdc", "tgv", "tmd", "tmo", "top", "tuf", "uan", "ubc", "uei", "ufu", "ukv", "ume", "urw", "uwq", "uxq", "uzv", "vhz", "vkj", "vos", "vsk", "vtr", "vwu", "vzj", "wdt", "wjg", "wnr", "wpw", "wtr", "wvw", "xaa", "xgh", "xjh", "xnd", "xtn", "xxa", "yci", "ygd", "yiq", "ypx", "yvo", "yye", "zjq", "zkq", "zqo", "zzy");
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
