
import java.util.*;

public class Test26 {

    public static void main(String[] args) {
        List<String> la = List.of("afq", "arw", "awx", "bci", "blt", "brx", "byt", "clm", "crh", "det", "dlx", "dnq", "dsg", "dwo", "ebw", "ejo", "eqs", "ete", "fia", "fke", "fnw", "fqg", "fvd", "gco", "gve", "gzx", "hfn", "hht", "hsy", "ica", "ikg", "iqy", "isp", "jag", "joa", "jwd", "jys", "khc", "klt", "knp", "kzc", "lhz", "lqa", "lvn", "lxz", "mhx", "mld", "mod", "mwo", "ndp", "noy", "obi", "ojh", "ojs", "oqg", "pmk", "prd", "pyb", "qor", "qtl", "qzw", "rho", "rqb", "rrj", "rxx", "sbb", "ses", "sih", "sxr", "tly", "tpy", "txj", "umr", "uxi", "vcu", "vhb", "vpx", "vwk", "waq", "whe", "wnc", "wsi", "wxt", "xee", "xsl", "xtz", "yij", "yjm", "ymm", "ztg", "zxp");
        List<String> lb = List.of("aiy", "aun", "bak", "bls", "boy", "bsz", "ccl", "cnz", "cvh", "djy", "dlz", "drd", "dsk", "dzr", "eel", "epx", "esj", "ewi", "fim", "flk", "fpe", "frg", "fvf", "gtk", "gyy", "hdw", "hft", "hsf", "hxi", "ife", "ikh", "irr", "ixy", "jce", "jvs", "jye", "kdi", "klj", "kmg", "kqy", "lgc", "lir", "lqm", "lxt", "lyk", "mid", "mnw", "muq", "mwz", "nee", "nyd", "obj", "ojl", "oof", "ovz", "pnd", "pxm", "pzk", "qss", "qzg", "rhh", "rma", "rqd", "rvn", "sba", "scp", "sfe", "spz", "tkw", "tmg", "twg", "tzl", "uwq", "uya", "ved", "vpl", "vwd", "vzc", "wbs", "wig", "wny", "wvc", "xbm", "xql", "xtm", "xwg", "yjg", "yka", "yux", "zvr", "zyl");
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
