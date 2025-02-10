
import java.util.*;

public class Test34 {

    public static void main(String[] args) {
        Tretja.Program program = new Tretja.Program(new Tretja.Oddaja[]{
            new Tretja.Info("oKioc2D", 22),
            new Tretja.Film("cvQdHIP", 11),
            new Tretja.Film("mBqI7", 4),
            new Tretja.Info("fe1PbvA", 18),
            new Tretja.Info("UW7d5t", 27),
            new Tretja.Sport("c3DEXF", 14),
            new Tretja.Info("eSBAKS", 15),
            new Tretja.Info("RcLT1Fh", 1),
            new Tretja.Film("2CliD6", 27),
            new Tretja.Film("8GpfM", 8),
            new Tretja.Sport("2AnGay", 32),
            new Tretja.Film("2dSYP", 6),
            new Tretja.Film("pL2V3m", 29),
            new Tretja.Sport("PBnmfE", 22),
            new Tretja.Info("W7J2ta", 30),
            new Tretja.Info("v6r1F", 7),
            new Tretja.Info("GXqsUSp", 9),
            new Tretja.Sport("UTqwSRG", 13),
            new Tretja.Info("DSltX", 18),
            new Tretja.Sport("Gn1wRD", 33),
            new Tretja.Info("ETgE7e0", 11),
            new Tretja.Sport("l5e1b", 8),
            new Tretja.Info("gVVxUY", 40),
        });

        System.out.println(program.infoDovoljPogosto(0));
        System.out.println(program.infoDovoljPogosto(25));
        System.out.println(program.infoDovoljPogosto(50));
        System.out.println(program.infoDovoljPogosto(75));
        System.out.println(program.infoDovoljPogosto(100));
        System.out.println(program.infoDovoljPogosto(125));
        System.out.println(program.infoDovoljPogosto(150));
        System.out.println(program.infoDovoljPogosto(175));
        System.out.println(program.infoDovoljPogosto(200));
        System.out.println(program.infoDovoljPogosto(225));
        System.out.println(program.infoDovoljPogosto(250));
        System.out.println(program.infoDovoljPogosto(275));
    }
}
