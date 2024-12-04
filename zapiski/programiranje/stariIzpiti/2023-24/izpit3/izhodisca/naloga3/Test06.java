
import java.util.*;

public class Test06 {

    public static void main(String[] args) {
        Tretja.Program program = new Tretja.Program(new Tretja.Oddaja[]{
            new Tretja.Film("tfSgAtR", 20),
            new Tretja.Film("gRgkU", 17),
            new Tretja.Film("dbQpr", 17),
            new Tretja.Info("syCXJSJ", 8),
            new Tretja.Film("KmaON", 3),
            new Tretja.Info("0XMj7Ra", 34),
            new Tretja.Info("YAlK4Q", 27),
            new Tretja.Film("lvYdJhI", 2),
            new Tretja.Film("pP5e6J", 3),
            new Tretja.Sport("yWsQTk", 1),
            new Tretja.Info("cDJJLC4", 8),
            new Tretja.Info("v5vx2Q4", 20),
            new Tretja.Info("oC0qeF", 16),
            new Tretja.Film("EglvB", 26),
            new Tretja.Info("pOWpq", 14),
            new Tretja.Film("Bu4PK", 25),
            new Tretja.Sport("hL0U0", 19),
            new Tretja.Film("HcVF3a", 3),
            new Tretja.Info("Il7Vbh", 4),
            new Tretja.Info("AOK8b", 14),
            new Tretja.Film("256Mbp", 6),
            new Tretja.Film("4PfWT", 29),
            new Tretja.Sport("iyfr6", 19),
            new Tretja.Film("EcdMv", 8),
            new Tretja.Sport("WlqTD6", 14),
            new Tretja.Film("KEAcYOB", 4),
            new Tretja.Info("wYDgdQ", 5),
            new Tretja.Film("NI6Kubm", 32),
        });

        Tretja.Film film = program.zadnjiFilm();
        System.out.println(film);
    }
}
