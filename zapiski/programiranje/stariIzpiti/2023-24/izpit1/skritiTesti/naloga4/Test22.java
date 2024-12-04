
import java.util.*;

public class Test22 {

    public static void main(String[] args) {
        List<String> la = List.of("acf", "amh", "apn", "awn", "awz", "aya", "bbz", "bgy", "biz", "bra", "bry", "btn", "bud", "byf", "bzs", "cba", "ccm", "chy", "clr", "cnn", "cpx", "cuj", "cxd", "czu", "das", "dfj", "dkb", "dmg", "doj", "dvi", "dxi", "dzv", "ehn", "eqy", "euf", "exo", "fct", "fhg", "fjm", "fnc", "fpx", "ftm", "fur", "fxe", "gdi", "ghy", "gld", "gmv", "gpj", "grl", "gzk", "hhy", "hnp", "hqb", "hru", "hua", "huy", "idc", "ijh", "ilt", "isx", "iwt", "izr", "jfk", "jgq", "jpe", "jqx", "jub", "jvc", "jvn", "jze", "kaf", "kdu", "klh", "kov", "kry", "kya", "lat", "ljs", "lqa", "lrr", "lwd", "lyb", "mea", "min", "mjz", "mom", "msi", "mtv", "mvn", "mxe", "myz", "nde", "nei", "nfe", "noz", "nuc", "nxc", "ogo", "ojg", "olc", "omf", "oos", "oqr", "orm", "oxc", "pco", "pgq", "pji", "poo", "ptt", "pwv", "pyi", "qds", "qhw", "qjy", "qlg", "qqh", "rcm", "rhz", "rlg", "rnb", "rqq", "ruq", "sed", "sie", "sme", "son", "spt", "syz", "tbd", "tfc", "tmg", "tza", "ubg", "ufo", "ulo", "upb", "urt", "uyf", "vae", "vck", "vfr", "vhd", "viu", "vkd", "vnr", "voy", "vqm", "vvs", "vwr", "vyr", "wau", "wbk", "wcr", "whn", "wju", "wlx", "wpa", "wrs", "wty", "wzc", "xet", "xrg", "xtn", "xxd", "yci", "ygp", "yhv", "ynj", "yso", "zcp", "zip", "ziv", "zjv", "zru", "zta", "zxg", "zzp");
        List<String> lb = List.of("ail", "ami", "asq", "awp", "axd", "aza", "bec", "bio", "bmv", "bre", "bsp", "bto", "bvw", "byr", "bzt", "cck", "cee", "cjg", "cne", "coa", "crj", "cwx", "cyu", "czw", "ddy", "din", "dlx", "dnk", "dor", "dwo", "dyp", "edx", "ejd", "erx", "exi", "ezc", "few", "fhi", "fju", "fpo", "ftc", "ftv", "fwl", "gbj", "ghr", "gin", "gmq", "gpb", "gqw", "gsf", "hbw", "hiu", "hpf", "hre", "htp", "huw", "iaj", "ihe", "ikc", "inu", "its", "ixu", "jen", "jfu", "jnw", "jqc", "jrm", "juq", "jvm", "jxg", "jzg", "kbw", "kgq", "knz", "kpv", "kup", "kyh", "lgo", "lnv", "lqq", "lun", "lwy", "lzh", "mgh", "mix", "mlo", "mot", "msy", "mvd", "mvq", "mxi", "ncb", "ndg", "nfa", "nnc", "npb", "nwo", "odb", "ogw", "oko", "oly", "onj", "opg", "oqx", "orn", "oxl", "pep", "piz", "plu", "psk", "pwh", "pyf", "pzn", "qgf", "qjq", "qlf", "qpt", "qsp", "reb", "rkg", "rmx", "rpr", "rsc", "rxm", "sfi", "sje", "sok", "spa", "ssl", "tao", "tbq", "tgn", "typ", "tzx", "uch", "ule", "ult", "uqs", "uxq", "uzm", "vbu", "vea", "vgg", "vhf", "vjb", "vms", "vos", "vqa", "vsn", "vwg", "vxd", "vzd", "wbj", "wby", "wez", "wiu", "wjw", "wnp", "wqk", "wrt", "wyg", "xej", "xlc", "xta", "xwj", "xyw", "yeb", "ygs", "ylv", "yqs", "ytb", "zhz", "zit", "zjj", "zmn", "zrw", "zwv", "zyv", "zzs");
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
