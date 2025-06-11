
import java.util.*;

public class Test38 {

    public static void main(String[] args) {
        Tretja.Program program = new Tretja.Program(new Tretja.Oddaja[]{
            new Tretja.Sport("KXEHe", 16),
            new Tretja.Sport("MHn5B6K", 29),
            new Tretja.Film("ynNqEcE", 11),
            new Tretja.Info("u4ex3nR", 67),
            new Tretja.Sport("mEMlLD", 43),
            new Tretja.Info("8StxX", 81),
            new Tretja.Sport("1WkHQ", 39),
            new Tretja.Film("RJLvbEP", 28),
            new Tretja.Sport("K3Esj", 79),
            new Tretja.Film("UTqwSRG", 67),
            new Tretja.Info("qCFcP", 89),
        });

        System.out.println(program.infoDovoljPogosto(0));
        System.out.println(program.infoDovoljPogosto(14));
        System.out.println(program.infoDovoljPogosto(28));
        System.out.println(program.infoDovoljPogosto(42));
        System.out.println(program.infoDovoljPogosto(56));
        System.out.println(program.infoDovoljPogosto(70));
        System.out.println(program.infoDovoljPogosto(84));
        System.out.println(program.infoDovoljPogosto(98));
        System.out.println(program.infoDovoljPogosto(112));
        System.out.println(program.infoDovoljPogosto(126));
        System.out.println(program.infoDovoljPogosto(140));
        System.out.println(program.infoDovoljPogosto(154));
        System.out.println(program.infoDovoljPogosto(168));
        System.out.println(program.infoDovoljPogosto(182));
        System.out.println(program.infoDovoljPogosto(196));
        System.out.println(program.infoDovoljPogosto(210));
        System.out.println(program.infoDovoljPogosto(224));
        System.out.println(program.infoDovoljPogosto(238));
        System.out.println(program.infoDovoljPogosto(252));
        System.out.println(program.infoDovoljPogosto(266));
        System.out.println(program.infoDovoljPogosto(280));
        System.out.println(program.infoDovoljPogosto(294));
    }
}
