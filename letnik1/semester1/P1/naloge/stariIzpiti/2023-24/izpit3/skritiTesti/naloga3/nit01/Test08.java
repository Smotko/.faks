
import java.util.*;

public class Test08 {

    public static void main(String[] args) {
        Tretja.Program program = new Tretja.Program(new Tretja.Oddaja[]{
            new Tretja.Film("JLKEOgk", 12),
            new Tretja.Sport("NG4HTWm", 16),
            new Tretja.Film("ctk1H", 13),
            new Tretja.Sport("Ao850yq", 24),
            new Tretja.Film("0Uh0J", 7),
            new Tretja.Film("dIxwVR", 21),
            new Tretja.Film("mQsA4pf", 20),
            new Tretja.Sport("xFSyt", 14),
            new Tretja.Info("oLr04GB", 24),
            new Tretja.Film("aaXQuU", 26),
            new Tretja.Film("7O3W1", 25),
            new Tretja.Info("0GS1Kx", 13),
            new Tretja.Film("BnP3Kl6", 6),
            new Tretja.Info("cvMVcK", 24),
            new Tretja.Info("aqg58", 25),
            new Tretja.Info("jbEwPL", 13),
            new Tretja.Film("vVKFq", 17),
            new Tretja.Film("NkmYSXh", 1),
            new Tretja.Info("h1SCCx", 16),
            new Tretja.Film("crJYg", 14),
            new Tretja.Sport("vWwBw1", 1),
            new Tretja.Info("ukBvSA", 25),
            new Tretja.Info("JWveLsJ", 6),
            new Tretja.Info("41CWuP", 15),
            new Tretja.Info("IIOJnY", 4),
            new Tretja.Sport("6wKWNER", 20),
            new Tretja.Info("Nlpquo", 12),
            new Tretja.Info("6JTBfIr", 9),
            new Tretja.Sport("o2D7L", 12),
            new Tretja.Film("nIQXCQ", 9),
            new Tretja.Info("fFbKC", 1),
            new Tretja.Info("Uhwxa", 19),
            new Tretja.Sport("OvO4Y", 21),
            new Tretja.Film("5A7O0", 2),
            new Tretja.Info("xl7heAW", 1),
            new Tretja.Info("AoblcE", 10),
            new Tretja.Info("2W0CV", 26),
            new Tretja.Info("nQdSeP", 9),
        });

        System.out.println(program.konec(new Cas(13, 7)));
        System.out.println(program.konec(new Cas(11, 15)));
        System.out.println(program.konec(new Cas(10, 1)));
        System.out.println(program.konec(new Cas(12, 9)));
        System.out.println(program.konec(new Cas(7, 17)));
    }
}
