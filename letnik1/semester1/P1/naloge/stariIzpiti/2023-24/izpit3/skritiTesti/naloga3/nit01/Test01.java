
import java.util.*;

public class Test01 {

    public static void main(String[] args) {
        Tretja.Program program = new Tretja.Program(new Tretja.Oddaja[]{
            new Tretja.Sport("wV81a", 20),
            new Tretja.Sport("rY7J1y", 8),
            new Tretja.Film("5Jkdn0q", 15),
            new Tretja.Info("sitfI", 16),
            new Tretja.Film("W7bGsQG", 2),
            new Tretja.Film("hwqDAP", 10),
            new Tretja.Film("0SELKw", 4),
            new Tretja.Info("Nlpquo", 12),
            new Tretja.Sport("rLTkv", 12),
            new Tretja.Sport("XMWvA8", 3),
            new Tretja.Sport("O0RcPv", 18),
            new Tretja.Info("FvKDqnP", 11),
            new Tretja.Film("0xAP5", 14),
            new Tretja.Sport("wWIOoJ", 8),
            new Tretja.Info("Qn1dsUt", 8),
            new Tretja.Info("HBRoAi", 14),
            new Tretja.Film("61rPWp", 6),
            new Tretja.Sport("ICixfI", 19),
            new Tretja.Info("IH4uNC8", 3),
            new Tretja.Film("kE5da", 16),
            new Tretja.Sport("yslLvP", 16),
            new Tretja.Film("Sbmscl", 6),
            new Tretja.Film("JLKEOgk", 6),
            new Tretja.Info("VSrlXy2", 12),
            new Tretja.Sport("hEanlKE", 13),
            new Tretja.Info("jbEwPL", 1),
            new Tretja.Film("yJvts4", 15),
            new Tretja.Sport("c4byHD", 8),
            new Tretja.Sport("Lcu72FA", 4),
            new Tretja.Sport("0Uh0J", 11),
            new Tretja.Film("cWK10M", 12),
            new Tretja.Info("gSuob", 15),
            new Tretja.Film("ujNXNeL", 2),
            new Tretja.Info("ONDLNY", 16),
            new Tretja.Info("OupgMPq", 12),
            new Tretja.Sport("gBR3w", 6),
            new Tretja.Film("APurSV", 8),
            new Tretja.Sport("KMcAg", 2),
            new Tretja.Film("OJiYF4p", 20),
            new Tretja.Film("tjjLS", 18),
            new Tretja.Info("7O3W1", 17),
            new Tretja.Sport("PdmX45O", 7),
            new Tretja.Sport("sMFUV", 6),
            new Tretja.Info("ka3nN7g", 4),
            new Tretja.Film("EqPXyAs", 16),
            new Tretja.Film("OYjMt", 20),
            new Tretja.Film("4mv5m", 10),
            new Tretja.Sport("pL2V3m", 12),
            new Tretja.Sport("OyfpA", 3),
        });

        System.out.println(program.konec(new Cas(4, 6)));
        System.out.println(program.konec(new Cas(8, 39)));
        System.out.println(program.konec(new Cas(13, 13)));
        System.out.println(program.konec(new Cas(5, 44)));
        System.out.println(program.konec(new Cas(7, 20)));
    }
}
