
import java.util.*;

public class Test03 {

    public static void main(String[] args) {
        Tretja.Program program = new Tretja.Program(new Tretja.Oddaja[]{
            new Tretja.Film("WOqI4", 10),
            new Tretja.Film("h1eQqc5", 18),
            new Tretja.Film("n7ClKj", 12),
            new Tretja.Sport("3ixux", 20),
            new Tretja.Sport("KJvC0s", 15),
            new Tretja.Sport("NkSg1", 15),
            new Tretja.Sport("EpKdBtD", 3),
            new Tretja.Sport("2Q7hO", 11),
            new Tretja.Sport("hV2M2a0", 7),
            new Tretja.Film("sqk1Cqb", 1),
            new Tretja.Film("4YOHf", 9),
            new Tretja.Sport("RGb5uCE", 1),
            new Tretja.Film("SB45fq", 21),
            new Tretja.Sport("JSJtmq", 14),
            new Tretja.Film("7EFj4xj", 3),
            new Tretja.Sport("yWYrIg5", 19),
            new Tretja.Film("E7kp4E", 4),
            new Tretja.Info("OGYuLSP", 16),
            new Tretja.Sport("dbQpr", 14),
            new Tretja.Sport("JoUcXDv", 3),
            new Tretja.Film("vVtiU", 8),
            new Tretja.Film("LQeRg", 10),
            new Tretja.Film("gwcwi", 15),
            new Tretja.Film("SXtfK", 17),
            new Tretja.Film("E5RxGME", 2),
            new Tretja.Film("Bu4PK", 17),
            new Tretja.Sport("RswxNI", 19),
            new Tretja.Sport("jT1Lfw6", 12),
            new Tretja.Sport("cNgynAw", 19),
            new Tretja.Film("eHaii", 10),
            new Tretja.Sport("FfGmXVG", 20),
            new Tretja.Sport("cDJJLC4", 2),
            new Tretja.Film("Mal2GX", 11),
            new Tretja.Info("3LcnGh", 15),
            new Tretja.Info("uhUCu", 19),
            new Tretja.Film("PeKKM", 5),
            new Tretja.Film("kHQYd", 9),
            new Tretja.Sport("1mDKM77", 13),
            new Tretja.Film("uGwiI", 6),
            new Tretja.Info("dgpTlub", 15),
            new Tretja.Sport("lAiAW", 1),
            new Tretja.Info("oOxTFm", 14),
            new Tretja.Film("MbR1U", 8),
            new Tretja.Info("nbCL8", 6),
            new Tretja.Info("v0txJ", 17),
            new Tretja.Sport("Ne0Fi", 17),
            new Tretja.Film("M7NxBiA", 6),
        });

        System.out.println(program.konec(new Cas(6, 42)));
        System.out.println(program.konec(new Cas(5, 30)));
        System.out.println(program.konec(new Cas(14, 39)));
        System.out.println(program.konec(new Cas(9, 3)));
        System.out.println(program.konec(new Cas(9, 55)));
    }
}
