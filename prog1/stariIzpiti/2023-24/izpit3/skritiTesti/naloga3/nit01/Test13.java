
import java.util.*;

public class Test13 {

    public static void main(String[] args) {
        Tretja.Program program = new Tretja.Program(new Tretja.Oddaja[]{
            new Tretja.Film("oRYUsT0", 27),
            new Tretja.Film("57OGX", 11),
            new Tretja.Sport("CQQUP8", 33),
            new Tretja.Film("LkfNGp", 13),
            new Tretja.Info("KpVjIAn", 25),
            new Tretja.Film("xYi6xJ", 4),
            new Tretja.Film("tPmJG68", 30),
            new Tretja.Info("hCMo0SS", 11),
            new Tretja.Film("66IVt", 30),
            new Tretja.Info("iK67PnF", 5),
            new Tretja.Sport("X5DW1T", 32),
            new Tretja.Sport("L4JHspT", 29),
            new Tretja.Info("J8aCvl", 6),
            new Tretja.Info("i7ckc8", 21),
            new Tretja.Info("tqmb0b", 8),
            new Tretja.Sport("uqBLv", 27),
            new Tretja.Info("fdv6tq", 26),
            new Tretja.Info("Y8fSm", 6),
            new Tretja.Info("6d2hV", 29),
            new Tretja.Sport("WBLdSn", 18),
            new Tretja.Info("qlnnRp", 19),
            new Tretja.Sport("xFSyt", 21),
            new Tretja.Info("tsuw5", 1),
            new Tretja.Film("GY4Ti", 13),
            new Tretja.Film("1nW1lTa", 16),
            new Tretja.Info("QptHMA", 12),
            new Tretja.Sport("pK8p6", 3),
            new Tretja.Sport("m7sXWKD", 26),
            new Tretja.Sport("APurSV", 6),
        });

        Tretja.Film film = program.zadnjiFilm();
        System.out.println(film);
    }
}
