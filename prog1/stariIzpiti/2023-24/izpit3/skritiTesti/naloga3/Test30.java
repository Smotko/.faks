
import java.util.*;

public class Test30 {

    public static void main(String[] args) {
        Tretja.Program program = new Tretja.Program(new Tretja.Oddaja[]{
            new Tretja.Info("WuNFQ0N", 26),
            new Tretja.Info("0GBYR6J", 11),
            new Tretja.Sport("711mEv4", 21),
            new Tretja.Sport("qoWjS", 12),
            new Tretja.Sport("oiIPrYT", 15),
            new Tretja.Film("o2D7L", 20),
            new Tretja.Info("6bK8Q", 29),
            new Tretja.Info("vE64ma1", 6),
            new Tretja.Sport("befKqy", 24),
            new Tretja.Info("WhMnwcY", 24),
            new Tretja.Info("SUoIMao", 13),
            new Tretja.Film("1fvqP", 8),
            new Tretja.Info("UTqwSRG", 15),
            new Tretja.Info("OyfpA", 21),
            new Tretja.Info("c3T7NiH", 28),
            new Tretja.Sport("Yol3hdU", 24),
            new Tretja.Film("IAtf8P8", 22),
            new Tretja.Info("tiVQD", 22),
            new Tretja.Film("KMcAg", 1),
            new Tretja.Info("va8FE", 21),
            new Tretja.Film("WXHei", 5),
            new Tretja.Info("rxUIqiS", 10),
            new Tretja.Sport("FIMKp", 5),
            new Tretja.Sport("c6duSr", 8),
            new Tretja.Info("WKK6MVP", 15),
            new Tretja.Sport("goSqP", 22),
            new Tretja.Info("gSuob", 14),
            new Tretja.Info("xb7DA", 6),
            new Tretja.Info("GXqsUSp", 18),
            new Tretja.Info("jgGGL", 20),
            new Tretja.Sport("urxlw", 6),
            new Tretja.Film("YXx7T", 11),
        });

        System.out.println(program.infoDovoljPogosto(0));
        System.out.println(program.infoDovoljPogosto(21));
        System.out.println(program.infoDovoljPogosto(42));
        System.out.println(program.infoDovoljPogosto(63));
        System.out.println(program.infoDovoljPogosto(84));
        System.out.println(program.infoDovoljPogosto(105));
        System.out.println(program.infoDovoljPogosto(126));
        System.out.println(program.infoDovoljPogosto(147));
        System.out.println(program.infoDovoljPogosto(168));
        System.out.println(program.infoDovoljPogosto(189));
        System.out.println(program.infoDovoljPogosto(210));
        System.out.println(program.infoDovoljPogosto(231));
        System.out.println(program.infoDovoljPogosto(252));
        System.out.println(program.infoDovoljPogosto(273));
        System.out.println(program.infoDovoljPogosto(294));
    }
}
