
import java.util.*;

public class Test34 {

    public static void main(String[] args) {
        List<String> la = List.of("acf", "afr", "ahk", "ald", "alg", "ari", "aul", "avl", "avq", "beb", "bff", "bla", "bln", "bnn", "brz", "bym", "ces", "cgv", "chk", "chs", "chu", "cic", "cjk", "cmg", "csa", "css", "czh", "dgf", "dgm", "dke", "dkp", "dne", "dri", "dsb", "dti", "dvz", "dxs", "dzw", "ecb", "eme", "epw", "eta", "ewe", "exi", "eyq", "ezr", "fbv", "fey", "fhu", "fly", "fmr", "fnk", "fnw", "fof", "fsc", "ftg", "fto", "fwb", "fwn", "gbd", "gef", "gei", "gfr", "gge", "ggz", "ghj", "ghq", "ghr", "gig", "gis", "gke", "gln", "gmy", "gpd", "gra", "guk", "gwa", "gxc", "gxd", "hec", "hiw", "hiz", "hjh", "hkx", "hli", "hnj", "hnw", "hol", "hqt", "hra", "hsc", "icg", "ihv", "iik", "ilk", "ine", "isl", "itf", "itq", "itt", "ivv", "iwg", "iwl", "iya", "iyx", "jeu", "jgt", "jic", "jmi", "jmw", "jng", "jqf", "jrs", "jru", "jzd", "jzv", "kcw", "kop", "kqi", "kyf", "laj", "lbl", "lhh", "lhp", "lil", "liv", "ljs", "lns", "lrr", "maa", "maw", "mdr", "mdw", "mgn", "mhb", "mhi", "mjy", "mkv", "mlc", "mwg", "mxv", "nan", "neg", "nfm", "nfs", "nkm", "nlo", "nnv", "noa", "npb", "nsi", "nvx", "nvy", "nzw", "off", "oia", "oli", "opf", "org", "osv", "ovn", "owb", "oxv", "pcj", "pdn", "pfk", "pkk", "pkz", "plx", "pmm", "pmp", "pol", "ppa", "ppi", "ppv", "psx", "pti", "pwh", "pzn", "qaj", "qfg", "qhk", "qla", "qoe", "qpk", "qtd", "qtn", "qvi", "qzg", "qzl", "rdn", "rku", "rml", "rmz", "rur", "rwu", "rwv", "rwz", "rxt", "ryz", "scv", "sfs", "shd", "smb", "spc", "sqf", "sws", "sxl", "tcu", "tef", "tfl", "tph", "tvo", "tvs", "twa", "twh", "tzo", "ufc", "ufw", "ukd", "upc", "upl", "uqg", "uxb", "vaj", "vcv", "ved", "vgo", "vgv", "vud", "vwm", "vzt", "wcd", "wfc", "wgw", "wng", "wrj", "wsf", "wug", "wwm", "wxt", "wyd", "xce", "xfd", "xfu", "xhm", "xil", "xmf", "xuh", "xye", "xze", "xzm", "yee", "yeg", "yly", "ynm", "ywd", "yyh", "zbj", "zff", "zgz", "zha", "zkt", "zny", "zrp", "zwl", "zxn", "zyb");
        List<String> lb = List.of("adw", "ahe", "ahp", "ahy", "aiu", "aja", "akm", "aky", "and", "arh", "arw", "ast", "atf", "aty", "aun", "aut", "avj", "avt", "bbj", "bbs", "bcq", "bcx", "bdj", "bdp", "bfw", "bhn", "biu", "bjh", "bjn", "bkj", "bqj", "bru", "bvc", "bwe", "bwg", "bws", "cbl", "cbs", "cbw", "ccg", "cch", "cdd", "cew", "ciz", "ckp", "clv", "clz", "coa", "cui", "cuj", "cve", "cvl", "cws", "czc", "daf", "dbv", "dct", "ddc", "dde", "ddn", "dio", "dip", "dkm", "dow", "dqi", "dqn", "dsu", "duu", "dvn", "dww", "dzr", "eaq", "ebh", "ebk", "edz", "eek", "efz", "ehm", "ejn", "eka", "ele", "ema", "enu", "epx", "eqj", "ett", "ewe", "ewf", "fds", "fel", "fev", "fgb", "fhh", "fhk", "fid", "fim", "fkd", "fkk", "fmo", "fof", "for", "fqm", "frm", "fuq", "fvx", "fxg", "fxu", "fxz", "fyh", "fzh", "gdw", "gfb", "ggr", "giq", "gjm", "gkv", "gpg", "gra", "grk", "gsi", "gta", "gvj", "gvk", "gvt", "gxn", "gxr", "gzl", "hbj", "hcx", "hdb", "hdj", "hfj", "hgb", "hke", "hkr", "hmk", "hog", "hor", "hpg", "hpj", "hqa", "hqu", "hsc", "hse", "hsh", "hsx", "hti", "hut", "hya", "iaj", "ids", "ieb", "igf", "igl", "igo", "ihc", "iht", "iia", "iim", "iks", "ilk", "ilp", "ilr", "ioh", "ior", "isa", "isi", "isk", "iss", "ivt", "iyh", "jeq", "jfa", "jhh", "jhj", "jip", "jjb", "jjm", "jkk", "jkw", "jnx", "jpl", "jpv", "jqn", "jvc", "jxm", "jze", "jzi", "jzj", "kac", "kck", "kde", "kfv", "kgw", "kjc", "klk", "klr", "kov", "kpu", "kql", "kqo", "kso", "kvw", "kwo", "kyb", "lao", "lbc", "lbw", "lco", "lcu", "ldg", "ldq", "lhi", "lhj", "lhm", "lix", "ljo", "ljt", "lnq", "lod", "ltf", "lun", "lvt", "mca", "mdg", "mdt", "mea", "mek", "mgm", "mhm", "mil", "miq", "miu", "mjf", "mly", "mna", "mne", "mni", "mns", "mnw", "mps", "mqq", "mvf", "mvo", "mwr", "mwz", "mxh", "mxy", "mzt", "nap", "nba", "nbm", "ncz", "ngz", "nhv", "nih", "nim", "nin", "nje", "njj", "nme", "nox", "nsf", "ntz", "nww", "nye", "nyt", "nzx", "oaz", "ock", "ocy", "ofv", "ogt", "oks", "omb", "omi", "omo", "omr", "ony", "opc", "ote", "oty", "ouh", "ouj", "oxo", "oyq", "paq", "pbk", "pcg", "pgv", "pkm", "pls", "pqp", "prh", "ptx", "pxe", "pxj", "pza", "pzq", "qbs", "qdj", "qew", "qex", "qga", "qgg", "qmr", "qon", "qqm", "qqx", "qru", "qto", "qvd", "qwf", "qxl", "qxx", "qym", "qzd", "qzx", "rad", "rcc", "rcy", "rer", "rot", "rov", "roz", "rre", "rtg", "rug", "rul", "rvb", "rvj", "rvy", "rwc", "ryl", "sah", "sbb", "sfq", "sfs", "smr", "spo", "sry", "suv", "svr", "swa", "swj", "sxt", "syr", "szl", "tai", "tfd", "tfz", "tje", "tki", "tkm", "tmu", "tmw", "toy", "tpd", "trd", "trj", "tta", "tug", "tvq", "txs", "tyu", "uci", "uco", "udu", "ufi", "ufx", "ugm", "uii", "ujd", "uqc", "urm", "usb", "utn", "utq", "uzd", "uzr", "vew", "vfi", "vfx", "vhg", "vks", "vmf", "vom", "vop", "vpm", "vqc", "vqp", "vro", "vtr", "vtx", "vuk", "vvh", "vvw", "vwe", "vxb", "vxt", "vyj", "vzc", "waf", "wbc", "wbi", "wbu", "wcn", "wex", "wfh", "wfz", "whb", "wim", "wiw", "wix", "wlq", "wno", "wtd", "wvk", "wwi", "wyv", "xbb", "xdv", "xeg", "xfj", "xgt", "xhg", "xly", "xnf", "xos", "xot", "xuc", "xuw", "xwb", "xwq", "xyp", "ybu", "ycv", "ydq", "yef", "yff", "yhx", "yid", "yik", "yja", "yka", "yly", "yma", "yns", "ypo", "yql", "yrd", "yrv", "ysu", "ytv", "ywx", "yyg", "yyk", "zbm", "zbp", "zcp", "zdu", "zgs", "zgu", "zlj", "zlv", "zml", "zmn", "zuq", "zva", "zvk", "zwh", "zwm", "zwr", "zxj", "zzm", "zzr");
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