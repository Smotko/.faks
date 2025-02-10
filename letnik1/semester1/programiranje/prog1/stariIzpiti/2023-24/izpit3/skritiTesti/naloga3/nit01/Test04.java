
import java.util.*;

public class Test04 {

    public static void main(String[] args) {
        Tretja.Program program = new Tretja.Program(new Tretja.Oddaja[]{
            new Tretja.Film("HxFvA", 12),
            new Tretja.Sport("jgGGL", 20),
            new Tretja.Sport("CIOgiW", 25),
            new Tretja.Film("SVCU1", 4),
            new Tretja.Sport("OYbxf", 6),
            new Tretja.Film("k7OX1", 18),
            new Tretja.Info("XtW3e", 18),
            new Tretja.Info("6U1hTf", 24),
            new Tretja.Sport("xFSyt", 21),
            new Tretja.Sport("dKoX1M", 2),
            new Tretja.Sport("IkGFl", 22),
            new Tretja.Sport("58QeCYd", 23),
            new Tretja.Sport("WyqUsY", 16),
            new Tretja.Info("GWHRtm", 11),
            new Tretja.Sport("IH4uNC8", 16),
            new Tretja.Sport("YnIBX", 1),
            new Tretja.Sport("8lm8nbs", 9),
            new Tretja.Film("xJksWx", 13),
            new Tretja.Info("vJTud", 23),
            new Tretja.Film("8FGLKKF", 4),
            new Tretja.Film("81ADRPj", 3),
            new Tretja.Sport("0JvPaMo", 25),
            new Tretja.Info("wN4qeGT", 23),
            new Tretja.Info("6LoJP", 19),
            new Tretja.Info("iOkhB5", 9),
            new Tretja.Info("hei6n1C", 29),
            new Tretja.Info("hm5TfU", 3),
            new Tretja.Sport("frtj5gu", 5),
            new Tretja.Film("O1RUgwx", 14),
            new Tretja.Sport("X7uYm2", 26),
            new Tretja.Sport("GGfuFNb", 19),
            new Tretja.Info("tK4GCS", 5),
            new Tretja.Info("Af40qj", 14),
            new Tretja.Film("BVowWv", 26),
        });

        System.out.println(program.konec(new Cas(14, 53)));
        System.out.println(program.konec(new Cas(12, 10)));
        System.out.println(program.konec(new Cas(15, 6)));
        System.out.println(program.konec(new Cas(11, 44)));
        System.out.println(program.konec(new Cas(9, 8)));
    }
}
