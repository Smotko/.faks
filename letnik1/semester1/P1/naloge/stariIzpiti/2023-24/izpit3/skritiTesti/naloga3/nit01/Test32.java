
import java.util.*;

public class Test32 {

    public static void main(String[] args) {
        Tretja.Program program = new Tretja.Program(new Tretja.Oddaja[]{
            new Tretja.Info("bWA8x", 32),
            new Tretja.Info("wJrUnO0", 13),
            new Tretja.Sport("F5Au64v", 44),
            new Tretja.Film("yveE1", 37),
            new Tretja.Sport("HCV0MpX", 12),
            new Tretja.Info("oKioc2D", 26),
            new Tretja.Film("UTqwSRG", 20),
            new Tretja.Film("lyhA7", 11),
            new Tretja.Info("IvvqCK", 13),
            new Tretja.Film("Y8joC", 39),
            new Tretja.Film("iWYoxL", 1),
            new Tretja.Film("wbsuTaf", 13),
            new Tretja.Info("IIOJnY", 17),
            new Tretja.Info("WuNFQ0N", 16),
            new Tretja.Info("XYDCT", 8),
            new Tretja.Info("XpJdIy", 42),
            new Tretja.Sport("m43kx3", 42),
            new Tretja.Info("oCmV1Ti", 39),
            new Tretja.Info("SfrQEI", 45),
            new Tretja.Info("4SP2mwu", 26),
            new Tretja.Info("W7bGsQG", 36),
            new Tretja.Film("8toxqdn", 32),
        });

        System.out.println(program.infoDovoljPogosto(0));
        System.out.println(program.infoDovoljPogosto(23));
        System.out.println(program.infoDovoljPogosto(46));
        System.out.println(program.infoDovoljPogosto(69));
        System.out.println(program.infoDovoljPogosto(92));
        System.out.println(program.infoDovoljPogosto(115));
        System.out.println(program.infoDovoljPogosto(138));
        System.out.println(program.infoDovoljPogosto(161));
        System.out.println(program.infoDovoljPogosto(184));
        System.out.println(program.infoDovoljPogosto(207));
        System.out.println(program.infoDovoljPogosto(230));
        System.out.println(program.infoDovoljPogosto(253));
        System.out.println(program.infoDovoljPogosto(276));
        System.out.println(program.infoDovoljPogosto(299));
    }
}
