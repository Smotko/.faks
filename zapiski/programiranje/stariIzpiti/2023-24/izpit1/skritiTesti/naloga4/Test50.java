
import java.util.*;

public class Test50 {

    public static void main(String[] args) {
        List<String> la = List.of("atv", "ayi", "bhz", "bqm", "cha", "dev", "dkf", "dqn", "dsg", "eav", "efh", "eir", "eox", "fbs", "fwa", "fxh", "gba", "ght", "gje", "grg", "hdi", "iif", "ivh", "jbw", "jdu", "jjh", "jjx", "jnw", "jrh", "jtz", "jyn", "kfy", "kwk", "llg", "lry", "mgc", "mgy", "mvy", "mze", "nbk", "njd", "ntz", "org", "owi", "oxo", "qkk", "qno", "qrn", "qtm", "rev", "ron", "sjs", "szx", "tpf", "tvm", "uba", "uew", "urd", "way", "wwa", "wzw", "xeu", "xlb", "xsd", "xty", "xue", "ygv", "zhh", "zlu", "zlx", "zpj", "zqu", "ztl", "zuj");
        List<String> lb = List.of("aec", "agq", "ahj", "ahr", "aiu", "aiy", "alw", "apj", "aqa", "ats", "avf", "awy", "axp", "bfu", "bgy", "bjx", "blv", "bpu", "bql", "btr", "bub", "bwk", "bwp", "bws", "bxx", "cab", "caq", "car", "cby", "ccj", "cdf", "cga", "cjq", "cmb", "cmw", "cnn", "cnr", "coa", "cxg", "dce", "dds", "dgq", "dph", "drb", "dsn", "dsp", "dsx", "dvh", "dxy", "eab", "eeq", "egr", "ekf", "enb", "enc", "enu", "esl", "exd", "ezm", "fab", "feo", "ffe", "fgq", "fgu", "fhs", "fhu", "fjz", "fki", "foc", "fqu", "fro", "fxa", "goo", "gqb", "gqw", "gtl", "gvn", "gxg", "gyx", "gzc", "hau", "hbt", "hdz", "hfa", "hgo", "hhr", "hks", "hsi", "htm", "htn", "htx", "huk", "hwe", "hxn", "icm", "icy", "ihr", "iiv", "ijt", "ile", "ime", "iov", "iri", "irp", "ivd", "iyi", "izu", "jbw", "jea", "jhd", "jhe", "jhi", "jig", "jmt", "jnj", "joc", "jon", "jps", "jql", "jtm", "jua", "jxc", "jyy", "kcv", "kec", "kgg", "kik", "kio", "kjo", "kjr", "kld", "klv", "knb", "kqq", "ksz", "kti", "ktp", "kxh", "kyd", "kzq", "kzw", "lab", "ldm", "lhg", "lmn", "lpg", "lqe", "luh", "lxl", "lzp", "mhh", "mlg", "mmh", "mnk", "mpm", "mqf", "mrk", "mrr", "mxd", "mxg", "mym", "myt", "nbg", "nfo", "ngi", "nif", "nij", "njl", "nlr", "nnm", "nqc", "nqy", "nth", "nwc", "nxu", "ofm", "omc", "opy", "oqb", "osm", "otq", "otv", "oxf", "oyp", "ozx", "pfb", "pgh", "pgx", "phn", "pin", "pir", "ply", "ppn", "pqp", "pss", "puw", "pxk", "qbq", "qif", "qnr", "qsg", "qsr", "qzu", "rau", "rav", "rbw", "rcg", "rco", "rkc", "ros", "rtx", "ruv", "rwp", "rxl", "sah", "sak", "sbf", "sci", "sck", "scw", "seh", "sgo", "slp", "smf", "sqr", "stu", "svz", "swh", "syh", "taj", "tba", "tcn", "tfm", "tfo", "thv", "tjd", "tkl", "tll", "tmg", "tot", "ttk", "twg", "twu", "tzo", "ube", "ueb", "uhd", "uhz", "uif", "ujv", "ulz", "upj", "uvs", "uzs", "vel", "vge", "vlv", "vmg", "vpz", "vqi", "vqt", "vrh", "vva", "wah", "wby", "wef", "wfp", "wid", "wlq", "wls", "wlv", "wnv", "wsk", "wtr", "wtt", "wxr", "wxu", "wxw", "xdq", "xfi", "xfv", "xga", "xli", "xls", "xpj", "xpk", "xra", "xul", "xzf", "xzs", "yab", "ydf", "yij", "yki", "yoi", "ypn", "yst", "yun", "yux", "yyj", "zfn", "zfr", "zfs", "zmq", "zmy", "zpk", "zpw");
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
