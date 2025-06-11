
import java.util.*;

public class Test06 {

    public static void main(String[] args) {
        List<List<String>> seznami = new ArrayList<>();

        seznami.add(List.of("evEWsmA", "oERtsU", "6VF", "jqIaRmy", "hv", "pXytJ", "CttvWyu", "ML", "t", "eIH", "t2", "JWX1", "LN", "ekBhJOS", "bggWawT", "ANMLQ", "Rcs", "kxusj", "t2", "SpUyp", "3x", "igsXG_1", "WBp3h", "Mn", "0fWlG6"));
        seznami.add(List.of("JWX1", "GIl", "hv", "6VF", "URY", "WBp3h", "CttvWyu", "Mn", "ANMLQ", "ys", "kxusj", "yT5E38O", "ys", "pXytJ", "evEWsmA", "igsXG_1", "0fWlG6", "xl", "ML", "t2", "OE2nG", "OE2nG", "eIH"));
        seznami.add(List.of("3R7h", "CttvWyu", "hv", "pXytJ", "Mn", "kxusj", "rMd", "4_AB", "URY", "WBp3h", "CttvWyu", "ANMLQ", "1wBBQ", "t2", "JWX1", "0fWlG6", "evEWsmA", "eIH", "ML", "igsXG_1", "qoO", "4L"));
        seznami.add(List.of("ANMLQ", "LN", "kxusj", "igsXG_1", "pMchSSg", "Mn", "UH", "44MV2", "0fWlG6", "fWOo5eP", "VjA", "JWX1", "CttvWyu", "hv", "megQ1", "evEWsmA", "nM_VP", "cxXQSqt", "qoO", "jO", "t2", "ML", "iBHHP6", "eIH", "Q_tr0Y", "kj8u", "pXytJ", "Y_X48", "n5X", "SbuEbc", "WBp3h", "kxusj"));
        seznami.add(List.of("ANMLQ", "Mn", "t2", "evEWsmA", "Gq2Eq2F", "VKaJ0", "pXytJ", "ML", "eIH", "kxusj", "igsXG_1", "hv", "ML", "WBp3h", "0fWlG6", "t", "JWX1", "WBp3h", "T6bD", "XmDie", "JWX1", "CttvWyu"));
        seznami.add(List.of("WBp3h", "t2", "hv", "igsXG_1", "pXytJ", "3x", "ML", "eIH", "evEWsmA", "Y_X48", "kxusj", "ANMLQ", "SbuEbc", "Mn", "JWX1", "VKaJ0", "hv", "0fWlG6", "yndPue5", "CttvWyu"));

        Set<String> mnozica = Cetrta.skupni(seznami);

        List<String> lstMnozica = new ArrayList<>(mnozica);
        lstMnozica.sort(null);
        System.out.println(lstMnozica);
    }
}
