
import java.util.*;

public class Test19 {

    public static void main(String[] args) {
        Tretja.Program program = new Tretja.Program(new Tretja.Oddaja[]{
            new Tretja.Sport("p7qmROe", 12),
            new Tretja.Info("g2Irk", 25),
            new Tretja.Info("yHRqR", 2),
            new Tretja.Film("pJQ3Fg", 2),
            new Tretja.Info("621irhk", 12),
            new Tretja.Film("TcjlKV", 23),
            new Tretja.Film("VSrlXy2", 3),
            new Tretja.Sport("GvsOFf", 2),
            new Tretja.Info("U7qgA", 16),
            new Tretja.Sport("1K1J0", 9),
            new Tretja.Info("dpcjGbC", 7),
            new Tretja.Film("wqMaUUJ", 25),
            new Tretja.Film("ICixfI", 14),
            new Tretja.Sport("QFlSvX", 12),
            new Tretja.Sport("nJh4dab", 6),
            new Tretja.Info("aWynNKe", 7),
            new Tretja.Sport("Ygrebu", 12),
            new Tretja.Sport("Myawp", 15),
            new Tretja.Film("OHsFhcW", 6),
            new Tretja.Sport("nIQXCQ", 19),
            new Tretja.Film("IFTERw", 14),
            new Tretja.Film("2sDNQ", 3),
            new Tretja.Film("3hGWTF8", 16),
            new Tretja.Sport("cWnpWj", 10),
            new Tretja.Sport("g5wdc", 2),
            new Tretja.Info("5Jkdn0q", 14),
            new Tretja.Film("tYLoJa", 10),
            new Tretja.Film("132eSTD", 5),
            new Tretja.Info("yA8L3Yd", 2),
            new Tretja.Film("pHrYXop", 16),
            new Tretja.Sport("kqSFV", 20),
            new Tretja.Info("otfbd8u", 4),
            new Tretja.Film("BavDva", 8),
            new Tretja.Film("tgSFae", 4),
            new Tretja.Info("bTmKJ", 26),
            new Tretja.Info("HxFvA", 21),
        });

        Tretja.Film film = program.zadnjiFilm();
        System.out.println(film);
    }
}
