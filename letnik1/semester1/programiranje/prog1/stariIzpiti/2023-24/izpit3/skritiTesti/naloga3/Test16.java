
import java.util.*;

public class Test16 {

    public static void main(String[] args) {
        Tretja.Program program = new Tretja.Program(new Tretja.Oddaja[]{
            new Tretja.Info("xiYFTwu", 6),
            new Tretja.Info("GGfuFNb", 3),
            new Tretja.Film("Xgl4Gpr", 21),
            new Tretja.Info("7TRrkj", 4),
            new Tretja.Info("UpKox", 19),
            new Tretja.Sport("1UHUa", 29),
            new Tretja.Info("3ORIKTc", 12),
            new Tretja.Film("irSQbL3", 24),
            new Tretja.Info("CxyiY7", 28),
            new Tretja.Sport("qtwxRiQ", 26),
            new Tretja.Info("gYhN0v", 27),
            new Tretja.Info("otfbd8u", 22),
            new Tretja.Info("MUSDD", 17),
            new Tretja.Info("LuFfOVI", 11),
            new Tretja.Film("hEanlKE", 7),
            new Tretja.Film("Sbmscl", 9),
            new Tretja.Info("BavDva", 1),
            new Tretja.Sport("cvQdHIP", 7),
            new Tretja.Sport("rPUNY", 17),
            new Tretja.Film("Xsiye", 17),
            new Tretja.Info("ka3nN7g", 19),
            new Tretja.Info("3hXy4", 26),
            new Tretja.Sport("SKaB8", 11),
            new Tretja.Info("PYYjy3", 6),
            new Tretja.Info("5rIAB", 1),
            new Tretja.Sport("3HApwD3", 2),
            new Tretja.Sport("REutj3M", 5),
            new Tretja.Sport("Q0nCb05", 24),
            new Tretja.Sport("hei6n1C", 7),
            new Tretja.Info("bjlXXA", 20),
            new Tretja.Info("nVUqPIr", 30),
            new Tretja.Film("FIMKp", 24),
            new Tretja.Film("Ti7HhHR", 25),
        });

        Tretja.Film film = program.zadnjiFilm();
        System.out.println(film);
    }
}
