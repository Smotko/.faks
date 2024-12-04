
import java.util.*;

public class Test21 {

    public static void main(String[] args) {
        List<List<String>> seznami = new ArrayList<>();

        seznami.add(List.of("pUd", "4L", "Qac", "4_AB", "7SaurEa", "Gq2Eq2F", "rMd", "BgTN", "kj8u", "pMchSSg", "WBp3h", "h", "cxXQSqt", "t2", "GIl", "piY", "CttvWyu", "lY", "Mn", "ePdAfl", "PgacVw", "ekBhJOS", "W", "5hRal", "UH", "Rcs", "SpUyp", "Q_tr0Y", "VKaJ0"));
        seznami.add(List.of("ePdAfl", "pMchSSg", "nM_VP", "iBHHP6", "VKaJ0", "1wBBQ", "BgTN", "4L", "Q_tr0Y", "UH", "kt", "Mn", "pUd", "4HT5", "Qac", "Gq2Eq2F", "8_", "4_AB", "k2EGG7q", "t2", "Df", "Rcs", "u0"));
        seznami.add(List.of("piY", "Gq2Eq2F", "hv", "P", "pUd", "Mn", "VKaJ0", "4_AB", "UH", "VdNXICj", "Qac", "W", "6VF", "t2", "BgTN", "OE2nG", "4L"));
        seznami.add(List.of("Mn", "t2", "pUd", "XmDie", "SbuEbc", "t", "eIH", "kNSoJr", "VKaJ0", "4_AB", "4L", "qR", "Qac", "BgTN", "Gq2Eq2F", "1wBBQ", "yndPue5", "ys", "GIl", "UH", "3x"));
        seznami.add(List.of("MJ", "Gq2Eq2F", "Mn", "pUd", "BgTN", "__PGVW", "Qac", "4L", "sFXLhq", "O", "UH", "t2", "VKaJ0", "4_AB"));
        seznami.add(List.of("GX", "PgacVw", "igsXG_1", "VKaJ0", "pUd", "Gq2Eq2F", "Mn", "4_AB", "0fWlG6", "44MV2", "Y_X48", "4L", "cxXQSqt", "t2", "BgTN", "xl", "nM_VP", "Qac", "UH", "t"));
        seznami.add(List.of("PVgSP", "T6bD", "3x", "8_", "BgTN", "u0", "Gq2Eq2F", "VKaJ0", "Mn", "UH", "kt", "__PGVW", "pUd", "t2", "JWX1", "Qac", "CttvWyu", "P", "MJ", "DW", "4_AB", "2LM", "4L"));
        seznami.add(List.of("4L", "UH", "Mn", "Qac", "ANMLQ", "BgTN", "ML", "Gq2Eq2F", "pUd", "4_AB", "8_", "t2", "6VF", "Mdq4v", "VKaJ0", "OE2nG"));
        seznami.add(List.of("WBp3h", "sFXLhq", "t", "UH", "4HT5", "yndPue5", "t2", "VKaJ0", "GX", "Qac", "6VF", "PgacVw", "OE2nG", "BgTN", "Gq2Eq2F", "4_AB", "pUd", "fWOo5eP", "4L", "ys", "Mn", "k2EGG7q", "1wBBQ"));
        seznami.add(List.of("n5X", "Qac", "Mn", "h", "t2", "nM_VP", "iBHHP6", "4L", "UH", "4_AB", "SpUyp", "pUd", "Gq2Eq2F", "E7Lc0Hj", "BgTN", "VKaJ0", "u0"));
        seznami.add(List.of("BgTN", "4L", "ANMLQ", "ePdAfl", "fWOo5eP", "t2", "VKaJ0", "yT5E38O", "4QB5Oy0", "SpUyp", "Mn", "Gq2Eq2F", "5hRal", "4_AB", "UH", "Qac", "pUd"));
        seznami.add(List.of("t2", "BgTN", "Y_X48", "Qac", "Mdq4v", "ys", "iqXg", "4_AB", "ekBhJOS", "GX", "Mn", "XpPE", "pMchSSg", "Egp", "pXytJ", "VKaJ0", "Gq2Eq2F", "jqIaRmy", "pUd", "XmDie", "Luw2__", "4L", "xl", "VdNXICj", "__PGVW", "DVOn", "4QB5Oy0", "O", "UH", "5hRal"));
        seznami.add(List.of("t", "VKaJ0", "qoO", "iqXg", "yndPue5", "kNSoJr", "4_AB", "ANMLQ", "Qac", "kj8u", "SbuEbc", "Df", "4L", "JWX1", "pUd", "qR", "Gq2Eq2F", "t2", "Mn", "BgTN", "UH"));
        seznami.add(List.of("BgTN", "4_AB", "yT5E38O", "URY", "bggWawT", "pUd", "t2", "Mn", "O", "Gq2Eq2F", "VjA", "4L", "UH", "Qac", "VKaJ0", "evEWsmA", "jO", "4QB5Oy0", "Df", "PVgSP"));
        seznami.add(List.of("Y_X48", "4_AB", "kj8u", "SpUyp", "hv", "jO", "4HT5", "VdNXICj", "Mdq4v", "VKaJ0", "BgTN", "fWOo5eP", "4QB5Oy0", "iBHHP6", "megQ1", "UH", "pUd", "Gq2Eq2F", "t2", "4L", "1wBBQ", "h", "Df", "evEWsmA", "kt", "Mn", "Qac", "PgacVw"));
        seznami.add(List.of("kNSoJr", "rMd", "pUd", "kxusj", "h", "fiPD", "2LM", "XmDie", "Egp", "Qac", "XpPE", "OE2nG", "oERtsU", "fWOo5eP", "BgTN", "GIl", "sFXLhq", "Gq2Eq2F", "4_AB", "4L", "jO", "Mn", "xBUu", "t2", "qoO", "UH", "VKaJ0", "iqXg"));
        seznami.add(List.of("JWX1", "PVgSP", "pUd", "kNSoJr", "ekBhJOS", "4L", "ANMLQ", "BgTN", "DW", "Mn", "4_AB", "nM_VP", "MJ", "Egp", "VKaJ0", "Qac", "UH", "Gq2Eq2F", "h", "t2", "VjA", "2LM"));

        Set<String> mnozica = Cetrta.skupni(seznami);

        List<String> lstMnozica = new ArrayList<>(mnozica);
        lstMnozica.sort(null);
        System.out.println(lstMnozica);
    }
}
