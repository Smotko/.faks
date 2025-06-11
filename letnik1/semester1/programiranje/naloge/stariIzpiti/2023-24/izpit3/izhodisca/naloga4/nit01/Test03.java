
import java.util.*;

public class Test03 {

    public static void main(String[] args) {
        List<List<String>> seznami = new ArrayList<>();

        seznami.add(List.of("mbPn", "l3", "EOhBtGy", "HxWG", "BXmFaW", "YvJxYqC", "iYd", "H", "Vcw", "bE", "2e", "T7Q4W0", "67dw", "1Qg", "FRoKgr2", "OxtltC5", "jF4hjww", "EOhBtGy", "UwIdy", "kngl", "JgE", "67dw", "HxWG", "CfWTY", "jF4hjww"));
        seznami.add(List.of("bE", "jwr8", "bE", "NEw0rUD", "_", "kngl", "bE", "_W6PoNO", "1Qg", "T7Q4W0", "NEw0rUD", "67dw", "BXmFaW", "fQqFOi", "JgE", "HxWG", "YvJxYqC", "mbPn"));
        seznami.add(List.of("1Qg", "OieM", "FKFtMP", "2jx61f", "fQqFOi", "BXmFaW", "T7Q4W0", "52GR", "HxWG", "OShTHy", "YD", "l3", "mbPn", "kbx", "mbPn", "67dw", "jGjvcG", "67dw", "_", "1Qg", "FRoKgr2", "H", "bE", "JgE", "1Qg", "lH4", "kngl"));
        seznami.add(List.of("bE", "8xF_", "BXmFaW", "JgE", "jwr8", "1Qg", "mbPn", "cpAa2X", "O", "67dw", "T7Q4W0", "HxWG", "3eLo", "8xF_", "lFAS", "mbPn", "kngl", "hU"));
        seznami.add(List.of("HxWG", "kngl", "BXmFaW", "1Qg", "cpAa2X", "T7Q4W0", "JgE", "bE", "fQqFOi", "mEfKUEX", "Mgni", "YvJxYqC", "6F0V", "jmLXP2", "YvJxYqC", "Xi", "mbPn", "Kq", "Ap36", "67dw", "jmLXP2"));
        seznami.add(List.of("BXmFaW", "mbPn", "viI2Gkp", "iYd", "viI2Gkp", "jGjvcG", "JgE", "NEw0rUD", "B", "BE", "NcSDRfK", "B", "HxWG", "67dw", "HxWG", "AhW5ogn", "kngl", "G", "sBDB", "1Qg", "UwIdy", "bE", "T7Q4W0"));
        seznami.add(List.of("FKFtMP", "YeRbU8", "bE", "bE", "1Qg", "JgE", "BE", "mbPn", "8a", "EOhBtGy", "52GR", "B", "PQFWwi", "mEfKUEX", "T7Q4W0", "OieM", "jF4hjww", "BXmFaW", "H", "kngl", "b7DKM", "VSGn0", "3wn", "67dw", "lH4", "HxWG", "T7Q4W0", "cJiU2t"));
        seznami.add(List.of("OxtltC5", "lFAS", "T7Q4W0", "eDR4im", "1Qg", "6VYgS", "mbPn", "C8B", "BXmFaW", "OShTHy", "gm", "H", "cpAa2X", "sBDB", "3eLo", "kbx", "gvQUtd", "OieM", "JgE", "kngl", "sBDB", "67dw", "gm", "bE", "HxWG", "kngl", "67dw", "CfWTY"));
        seznami.add(List.of("Vcw", "lFAS", "T7Q4W0", "l3", "JgE", "kngl", "L", "mbPn", "B", "1Qg", "gbux0Db", "lD3wPia", "38", "CfWTY", "BXmFaW", "OShTHy", "HxWG", "bE", "C8B", "67dw"));
        seznami.add(List.of("Mgni", "vCOjC0", "mbPn", "gm", "Ausp0", "BXmFaW", "kngl", "lH4", "MDWw6D", "Ausp0", "UwIdy", "FRoKgr2", "YkUC6", "JgE", "HxWG", "T7Q4W0", "PQFWwi", "1Qg", "bE", "duh5t0", "67dw", "1Qg", "L", "1f", "lD3wPia", "I8", "kngl"));
        seznami.add(List.of("SG6", "kngl", "BXmFaW", "HxWG", "BE", "lH4", "8xF_", "bE", "l3", "1Qg", "T7Q4W0", "Vcw", "I8", "xYV_dS", "mEfKUEX", "mbPn", "nvuPDg", "Ausp0", "iYd", "NEw0rUD", "Ap36", "JgE", "67dw", "hU", "PQFWwi", "VO", "YvJxYqC", "_", "mbPn"));
        seznami.add(List.of("BXmFaW", "T7Q4W0", "JgE", "mbPn", "1Qg", "bE", "HxWG", "kngl", "OxtltC5", "67dw"));
        seznami.add(List.of("HxWG", "l3", "T7Q4W0", "nrbE3", "iYd", "FKFtMP", "frHU7f", "UyjpCS", "VO", "kq6fqg", "52GR", "MYUGiv", "kngl", "frHU7f", "1Qg", "JgE", "bE", "FKFtMP", "67dw", "BXmFaW", "mbPn", "I8", "NEw0rUD", "H"));
        seznami.add(List.of("SG6", "JgE", "HxWG", "lFAS", "BXmFaW", "mbPn", "T7Q4W0", "B5", "6VYgS", "hU", "bE", "FRoKgr2", "hU", "u", "2jx61f", "jmLXP2", "u", "6F0V", "H", "kngl", "67dw", "OieM", "T7Q4W0", "1Qg", "vCOjC0", "FKFtMP", "lD3wPia"));
        seznami.add(List.of("mbPn", "OieM", "kngl", "L", "sBDB", "2EjLE", "EOhBtGy", "NEw0rUD", "oJty", "T7Q4W0", "JgE", "1Qg", "oJty", "YkUC6", "BE", "lH4", "Fl", "xYV_dS", "6VYgS", "67dw", "BXmFaW", "2EjLE", "HxWG", "mEfKUEX", "bE"));
        seznami.add(List.of("JgE", "B5", "W2", "OieM", "iYd", "mbPn", "kngl", "HxWG", "bE", "HxWG", "T7Q4W0", "52GR", "JgE", "67dw", "BXmFaW", "6F0V", "MYUGiv", "O", "1Qg", "MYUGiv"));
        seznami.add(List.of("G", "JgE", "b7DKM", "kngl", "lH4", "HxWG", "T7Q4W0", "OieM", "bE", "hKfw2iL", "1Qg", "38", "gvQUtd", "iYd", "gm", "bE", "BXmFaW", "3wn", "67dw", "MYUGiv", "kngl", "cpAa2X", "mbPn"));
        seznami.add(List.of("BXmFaW", "UyjpCS", "YkUC6", "mbPn", "JgE", "3wn", "67dw", "CfWTY", "bE", "kngl", "1Qg", "mbPn", "HxWG", "T7Q4W0"));
        seznami.add(List.of("T7Q4W0", "JgE", "jmLXP2", "oJty", "8a", "67dw", "mbPn", "bE", "eDR4im", "kngl", "1Qg", "lH4", "kngl", "BXmFaW", "HxWG", "I8", "duh5t0", "VSGn0"));
        seznami.add(List.of("PQFWwi", "T7Q4W0", "sBDB", "6F0V", "B5", "JgE", "AhW5ogn", "mbPn", "UyjpCS", "1Qg", "C8B", "HxWG", "bE", "gm", "67dw", "T7Q4W0", "7YXCTB3", "mEfKUEX", "eDR4im", "_W6PoNO", "_", "OShTHy", "BXmFaW", "sBDB", "kngl"));
        seznami.add(List.of("u", "H", "BXmFaW", "3eLo", "jwr8", "kngl", "2jx61f", "JgE", "mbPn", "W2", "gbux0Db", "BXmFaW", "6VYgS", "G", "HxWG", "PQFWwi", "gbux0Db", "l3", "67dw", "1Qg", "52GR", "_FS", "38", "gvQUtd", "T7Q4W0", "Ausp0", "bE"));
        seznami.add(List.of("6VYgS", "1f", "1Qg", "JgE", "3wn", "I8", "cpAa2X", "AhW5ogn", "kngl", "lH4", "oJty", "3eLo", "67dw", "T7Q4W0", "6F0V", "CfWTY", "mbPn", "bE", "UyjpCS", "BXmFaW", "Ap36", "HxWG", "u", "8a"));
        seznami.add(List.of("mbPn", "T7Q4W0", "kngl", "HxWG", "bE", "duh5t0", "jwr8", "nvuPDg", "7YXCTB3", "1Qg", "BXmFaW", "JgE", "viI2Gkp", "sBDB", "67dw", "T7Q4W0"));
        seznami.add(List.of("duh5t0", "gm", "JgE", "kngl", "bE", "HxWG", "67dw", "BXmFaW", "W2", "T7Q4W0", "mbPn", "1Qg", "8a", "gvQUtd", "gm"));
        seznami.add(List.of("XhmVwBY", "1Qg", "8xF_", "2jx61f", "kngl", "YvJxYqC", "OieM", "mbPn", "BXmFaW", "HxWG", "C8B", "sBDB", "xYV_dS", "mbPn", "jwr8", "67dw", "T7Q4W0", "JgE", "hU", "bE", "lH4"));
        seznami.add(List.of("OieM", "Mgni", "67dw", "kngl", "1Qg", "1Qg", "FKFtMP", "lFAS", "BXmFaW", "mbPn", "b7DKM", "HxWG", "JgE", "bE", "nvuPDg", "JgE", "Kq", "7YXCTB3", "T7Q4W0"));
        seznami.add(List.of("JgE", "67dw", "l3", "mbPn", "gm", "bE", "xYV_dS", "2e", "svm_S", "HxWG", "bE", "kngl", "lD3wPia", "1Qg", "T7Q4W0", "BXmFaW", "T7Q4W0", "mbPn"));
        seznami.add(List.of("6VYgS", "1Qg", "frHU7f", "svm_S", "eoAY", "T7Q4W0", "_FS", "7YXCTB3", "BXmFaW", "nrbE3", "1f", "JgE", "kngl", "Ap36", "bE", "UwIdy", "eoAY", "1BM", "HxWG", "8xF_", "mbPn", "u", "H", "jmLXP2", "67dw", "eDR4im", "Mgni", "kngl"));
        seznami.add(List.of("1BM", "jmLXP2", "_W6PoNO", "67dw", "jwr8", "BE", "jGjvcG", "UyjpCS", "eDR4im", "bE", "BXmFaW", "HxWG", "52GR", "BXmFaW", "I8", "kngl", "YvJxYqC", "JgE", "bE", "lH4", "mbPn", "kngl", "VO", "jGjvcG", "b7DKM", "T7Q4W0", "1Qg"));
        seznami.add(List.of("1Qg", "8a", "gbux0Db", "jF4hjww", "BXmFaW", "HxWG", "mbPn", "UyjpCS", "gm", "cJiU2t", "MDWw6D", "cJiU2t", "8a", "6F0V", "B", "UwIdy", "JgE", "67dw", "HxWG", "xYV_dS", "W2", "2e", "bE", "cpAa2X", "T7Q4W0", "bE", "kngl"));
        seznami.add(List.of("gvQUtd", "duh5t0", "BXmFaW", "67dw", "SG6", "sBDB", "kq6fqg", "kngl", "hKfw2iL", "jwr8", "L", "YD", "NcSDRfK", "T7Q4W0", "mbPn", "UwIdy", "bE", "JgE", "HxWG", "UyjpCS", "B", "lH4", "gbux0Db", "eoAY", "kbx", "1Qg", "duh5t0", "B5", "jwr8"));
        seznami.add(List.of("bE", "1Qg", "kngl", "lFAS", "HxWG", "2e", "JgE", "BXmFaW", "fQqFOi", "T7Q4W0", "mbPn", "kbx", "67dw"));
        seznami.add(List.of("kngl", "mbPn", "67dw", "BXmFaW", "svm_S", "T7Q4W0", "6VYgS", "JgE", "1Qg", "bE", "B5", "6VYgS", "HxWG"));
        seznami.add(List.of("fQqFOi", "kngl", "bE", "OShTHy", "2e", "67dw", "I8", "T7Q4W0", "mbPn", "gbux0Db", "T7Q4W0", "BXmFaW", "1Qg", "JgE", "HxWG"));
        seznami.add(List.of("3wn", "O", "T7Q4W0", "T7Q4W0", "bE", "6F0V", "BXmFaW", "YD", "l3", "lD3wPia", "kngl", "67dw", "mbPn", "1Qg", "HxWG", "G", "JgE", "AhW5ogn", "EOhBtGy"));
        seznami.add(List.of("3wn", "3eLo", "eDR4im", "NEw0rUD", "mbPn", "BXmFaW", "JgE", "1Qg", "bE", "2jx61f", "HxWG", "1f", "kngl", "L", "67dw", "T7Q4W0"));
        seznami.add(List.of("YvJxYqC", "HxWG", "sBDB", "BXmFaW", "MDWw6D", "JgE", "T7Q4W0", "Mgni", "67dw", "_", "mbPn", "MYUGiv", "I8", "kngl", "iYd", "1Qg", "bE"));
        seznami.add(List.of("Mgni", "kngl", "1Qg", "JgE", "iYd", "hU", "mbPn", "H", "cpAa2X", "duh5t0", "XhmVwBY", "bE", "jwr8", "HxWG", "67dw", "BXmFaW", "CfWTY", "T7Q4W0", "OxtltC5", "b7DKM", "MDWw6D", "OieM", "XhmVwBY"));
        seznami.add(List.of("1Qg", "T7Q4W0", "NEw0rUD", "BXmFaW", "67dw", "6F0V", "B5", "CfWTY", "lFAS", "38", "1BM", "Vcw", "vCOjC0", "jmLXP2", "mbPn", "b7DKM", "HxWG", "frHU7f", "kngl", "bE", "JgE", "YeRbU8", "JgE", "Kq", "frHU7f", "BXmFaW", "L"));

        Set<String> mnozica = Cetrta.skupni(seznami);

        List<String> lstMnozica = new ArrayList<>(mnozica);
        lstMnozica.sort(null);
        System.out.println(lstMnozica);
    }
}
