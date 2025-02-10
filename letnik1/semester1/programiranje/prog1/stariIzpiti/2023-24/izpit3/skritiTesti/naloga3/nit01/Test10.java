
import java.util.*;

public class Test10 {

    public static void main(String[] args) {
        Tretja.Program program = new Tretja.Program(new Tretja.Oddaja[]{
            new Tretja.Info("Ux8ilc", 12),
            new Tretja.Film("JnbwKf", 14),
            new Tretja.Film("rREL7q", 3),
            new Tretja.Info("uJQp2Bf", 8),
            new Tretja.Film("IklKpc5", 1),
            new Tretja.Info("f82TYSC", 4),
            new Tretja.Sport("mN5Mb", 6),
            new Tretja.Film("jbEwPL", 9),
            new Tretja.Film("tjjLS", 10),
            new Tretja.Sport("Hr2j3", 6),
            new Tretja.Sport("UFijRq", 5),
            new Tretja.Film("cvMVcK", 7),
            new Tretja.Film("X0SMlb3", 4),
            new Tretja.Sport("vMOpVH", 11),
            new Tretja.Sport("va8FE", 21),
            new Tretja.Film("E6v6THj", 15),
            new Tretja.Info("pHWsIV", 10),
            new Tretja.Info("VLWFSW", 20),
            new Tretja.Info("IE5CG7", 7),
            new Tretja.Film("447FQ", 16),
            new Tretja.Sport("60FEX0", 16),
            new Tretja.Info("rk6vH", 7),
            new Tretja.Sport("i1V7g", 18),
            new Tretja.Sport("fdv6tq", 7),
            new Tretja.Film("PVMf5f2", 17),
            new Tretja.Info("Wsl68x", 17),
            new Tretja.Film("dkX43S", 14),
            new Tretja.Sport("fcOJWq", 8),
            new Tretja.Film("OddPVPc", 3),
            new Tretja.Info("F5Au64v", 2),
            new Tretja.Film("VWtjX2d", 1),
            new Tretja.Info("fXe1PYb", 1),
            new Tretja.Film("3ndyCP", 3),
            new Tretja.Info("80soC6", 12),
            new Tretja.Film("qCFcP", 3),
            new Tretja.Sport("nUY2pRy", 7),
            new Tretja.Info("XAOBC", 11),
            new Tretja.Sport("BTPrC", 11),
            new Tretja.Info("tBeQIO4", 16),
            new Tretja.Info("Lr1PO", 8),
            new Tretja.Sport("X3cOys6", 10),
            new Tretja.Sport("cAGg3", 18),
            new Tretja.Sport("5rIAB", 9),
            new Tretja.Sport("NlOe80", 5),
            new Tretja.Sport("XyHxI6Y", 19),
            new Tretja.Film("HMmgi", 15),
        });

        System.out.println(program.konec(new Cas(12, 23)));
        System.out.println(program.konec(new Cas(5, 59)));
        System.out.println(program.konec(new Cas(5, 38)));
        System.out.println(program.konec(new Cas(16, 11)));
        System.out.println(program.konec(new Cas(1, 24)));
    }
}
