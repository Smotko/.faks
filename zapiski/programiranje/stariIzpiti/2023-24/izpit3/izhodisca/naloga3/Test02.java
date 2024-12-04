
import java.util.*;

public class Test02 {

    public static void main(String[] args) {
        Tretja.Program program = new Tretja.Program(new Tretja.Oddaja[]{
            new Tretja.Info("xTsdC8", 19),
            new Tretja.Sport("xMtns", 22),
            new Tretja.Info("65Jh74", 12),
            new Tretja.Sport("0wdf6iV", 18),
            new Tretja.Info("8objet", 11),
            new Tretja.Info("Tnphn", 35),
            new Tretja.Info("NkuvlK", 24),
            new Tretja.Info("7lxHX", 41),
            new Tretja.Film("kRsX2", 23),
            new Tretja.Film("h1eQqc5", 33),
            new Tretja.Sport("aJ5msYA", 30),
            new Tretja.Film("wXgwDb", 8),
            new Tretja.Info("LwyJShF", 34),
            new Tretja.Film("epy4ySV", 22),
            new Tretja.Info("Vgqel", 10),
            new Tretja.Sport("eHaii", 27),
            new Tretja.Sport("BBqb66", 11),
            new Tretja.Info("6aq8SQ", 25),
            new Tretja.Film("keqLh", 35),
            new Tretja.Sport("Fby47", 33),
            new Tretja.Film("mCRdsiG", 27),
            new Tretja.Info("C6dlPW", 23),
            new Tretja.Film("a3XDu", 26),
            new Tretja.Info("pLuwP", 18),
        });

        System.out.println(program.konec(new Cas(12, 25)));
        System.out.println(program.konec(new Cas(1, 45)));
        System.out.println(program.konec(new Cas(9, 27)));
        System.out.println(program.konec(new Cas(3, 2)));
        System.out.println(program.konec(new Cas(3, 22)));
    }
}
