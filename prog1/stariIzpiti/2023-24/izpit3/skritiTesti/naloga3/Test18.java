
import java.util.*;

public class Test18 {

    public static void main(String[] args) {
        Tretja.Program program = new Tretja.Program(new Tretja.Oddaja[]{
            new Tretja.Sport("IAtf8P8", 10),
            new Tretja.Info("mN5Mb", 25),
            new Tretja.Info("IE5CG7", 16),
            new Tretja.Sport("R6yuh3F", 23),
            new Tretja.Film("UpKox", 21),
            new Tretja.Sport("cjVOy8A", 18),
            new Tretja.Sport("4frTM", 15),
            new Tretja.Film("GASQ6", 27),
            new Tretja.Info("Ygrebu", 18),
            new Tretja.Sport("KJAS1", 12),
            new Tretja.Film("h6YnGV", 1),
            new Tretja.Sport("vQ07A4", 23),
            new Tretja.Sport("va8FE", 5),
            new Tretja.Sport("rKim2e", 7),
            new Tretja.Film("ajN7cF", 21),
            new Tretja.Info("12cS3", 26),
            new Tretja.Film("4aTWb", 11),
            new Tretja.Sport("E0R17", 24),
            new Tretja.Film("vrDI7", 26),
            new Tretja.Sport("XYDCT", 16),
            new Tretja.Film("BOJrYa", 26),
            new Tretja.Info("oEgxS", 27),
            new Tretja.Info("BTPrC", 11),
            new Tretja.Info("IIOJnY", 27),
            new Tretja.Film("FBJcDX", 17),
            new Tretja.Sport("BvIqh3", 8),
            new Tretja.Film("W7bGsQG", 24),
            new Tretja.Info("jtm6Re", 23),
            new Tretja.Info("RDlSi", 17),
            new Tretja.Info("TSegOK", 21),
            new Tretja.Film("J8aCvl", 18),
        });

        Tretja.Film film = program.zadnjiFilm();
        System.out.println(film);
    }
}
