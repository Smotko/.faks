
import java.util.*;

public class Test02 {

    public static void main(String[] args) {
        Tretja.Program program = new Tretja.Program(new Tretja.Oddaja[]{
            new Tretja.Film("Ae0d2x", 5),
            new Tretja.Film("mKF1y", 13),
            new Tretja.Film("rcXlfy", 25),
            new Tretja.Info("MUSDD", 17),
            new Tretja.Info("He1bL", 11),
            new Tretja.Info("dpcjGbC", 25),
            new Tretja.Info("uqBLv", 25),
            new Tretja.Info("6ERsWn", 4),
            new Tretja.Info("rREL7q", 26),
            new Tretja.Film("gYhN0v", 14),
            new Tretja.Info("3hGWTF8", 19),
            new Tretja.Sport("clM2q2n", 25),
            new Tretja.Sport("6QplfKU", 24),
            new Tretja.Sport("L05ao", 12),
            new Tretja.Info("v6r1F", 23),
            new Tretja.Info("fFbKC", 9),
            new Tretja.Film("GXam3X", 3),
            new Tretja.Info("2CliD6", 7),
            new Tretja.Info("hEanlKE", 2),
            new Tretja.Info("r7SUS", 13),
            new Tretja.Sport("rEvJ2", 5),
            new Tretja.Film("uBtcCa", 8),
            new Tretja.Film("eF1njKM", 5),
            new Tretja.Film("gYNVVt", 2),
            new Tretja.Info("tBeQIO4", 3),
            new Tretja.Info("oLr04GB", 22),
            new Tretja.Film("i2ReD3", 13),
            new Tretja.Film("wW7sQk", 23),
            new Tretja.Info("fk4Wq", 24),
            new Tretja.Info("m6HVx", 2),
            new Tretja.Sport("wHD0W", 15),
            new Tretja.Info("oBvO8Ol", 19),
            new Tretja.Film("hjyEsaG", 22),
            new Tretja.Sport("oPQpP", 18),
            new Tretja.Sport("Y4UkrO", 6),
            new Tretja.Film("UFxC6C3", 22),
            new Tretja.Info("irDEfqj", 21),
            new Tretja.Sport("0WEDU", 7),
        });

        System.out.println(program.konec(new Cas(4, 33)));
        System.out.println(program.konec(new Cas(7, 55)));
        System.out.println(program.konec(new Cas(12, 45)));
        System.out.println(program.konec(new Cas(13, 18)));
        System.out.println(program.konec(new Cas(9, 51)));
    }
}
