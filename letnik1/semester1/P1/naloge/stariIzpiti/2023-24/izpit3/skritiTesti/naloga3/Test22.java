
import java.util.*;

public class Test22 {

    public static void main(String[] args) {
        Tretja.Program program = new Tretja.Program(new Tretja.Oddaja[]{
            new Tretja.Film("fFbKC", 14),
            new Tretja.Film("opR4SEt", 22),
            new Tretja.Info("sitfI", 7),
            new Tretja.Film("J6qi7n", 22),
            new Tretja.Film("WvksQT", 11),
            new Tretja.Film("F05Bxv3", 34),
            new Tretja.Film("REutj3M", 32),
            new Tretja.Sport("aFu48", 14),
            new Tretja.Sport("kDnmU4t", 14),
            new Tretja.Info("bjlXXA", 23),
            new Tretja.Film("5WVeHI8", 8),
            new Tretja.Sport("2BKMXR7", 11),
            new Tretja.Sport("7ijjUS", 10),
            new Tretja.Film("41CWuP", 19),
            new Tretja.Sport("JrRaPH", 2),
            new Tretja.Film("im1v8oA", 4),
            new Tretja.Film("0GBYR6J", 11),
            new Tretja.Film("aCvbD", 20),
            new Tretja.Film("JQaaxmG", 13),
            new Tretja.Info("WNnM7jX", 9),
            new Tretja.Sport("cW2qG", 31),
            new Tretja.Sport("dEXButg", 31),
            new Tretja.Film("k6tOvJV", 2),
            new Tretja.Info("BOJrYa", 27),
            new Tretja.Sport("PHVpel", 1),
            new Tretja.Film("QC87MKe", 3),
            new Tretja.Info("rb4DaS", 1),
            new Tretja.Film("kG1I4", 28),
            new Tretja.Sport("aeeci", 8),
        });

        Tretja.Film film = program.zadnjiFilm();
        System.out.println(film);
    }
}
