
import java.util.*;

public class Test14 {

    public static void main(String[] args) {
        Tretja.Program program = new Tretja.Program(new Tretja.Oddaja[]{
            new Tretja.Info("k6tOvJV", 24),
            new Tretja.Film("xiYFTwu", 26),
            new Tretja.Sport("41CWuP", 1),
            new Tretja.Sport("Ygrebu", 3),
            new Tretja.Info("tAaM7", 10),
            new Tretja.Sport("im1v8oA", 14),
            new Tretja.Info("O6b0DN", 25),
            new Tretja.Sport("b7miuni", 26),
            new Tretja.Info("k2FIAjQ", 22),
            new Tretja.Info("DU6Fh", 17),
            new Tretja.Sport("A1GNr", 22),
            new Tretja.Info("CQQUP8", 17),
            new Tretja.Sport("PHVpel", 15),
            new Tretja.Info("Gm75dOY", 1),
            new Tretja.Film("bjlXXA", 15),
            new Tretja.Info("rb4DaS", 26),
            new Tretja.Sport("AvlheA", 22),
            new Tretja.Film("0GS1Kx", 6),
            new Tretja.Sport("rREL7q", 7),
            new Tretja.Sport("HCV0MpX", 8),
            new Tretja.Film("aeeci", 26),
            new Tretja.Sport("HBRoAi", 22),
            new Tretja.Sport("NkmYSXh", 20),
            new Tretja.Sport("OJiYF4p", 2),
            new Tretja.Info("5A7O0", 8),
            new Tretja.Info("IH4uNC8", 19),
            new Tretja.Info("1GyPH", 22),
            new Tretja.Info("p7qmROe", 1),
            new Tretja.Sport("ty5Jeu", 23),
            new Tretja.Film("SKaB8", 13),
            new Tretja.Film("WBLdSn", 22),
            new Tretja.Sport("51Ogc", 21),
            new Tretja.Sport("mBqI7", 16),
            new Tretja.Info("JrRaPH", 14),
            new Tretja.Info("Mmyqy4g", 13),
            new Tretja.Film("6wKWNER", 1),
            new Tretja.Sport("6uf43", 23),
            new Tretja.Film("hBp5oK", 25),
        });

        Tretja.Film film = program.zadnjiFilm();
        System.out.println(film);
    }
}
