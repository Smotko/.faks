
import java.util.*;

public class Test26 {

    public static void main(String[] args) {
        Tretja.Program program = new Tretja.Program(new Tretja.Oddaja[]{
            new Tretja.Info("447FQ", 12),
            new Tretja.Sport("LkfNGp", 13),
            new Tretja.Film("HRqXsjm", 23),
            new Tretja.Sport("F5Au64v", 2),
            new Tretja.Film("75SgR", 25),
            new Tretja.Info("rKim2e", 3),
            new Tretja.Info("nJh4dab", 6),
            new Tretja.Sport("ckqfW", 13),
            new Tretja.Film("O1Isdfv", 26),
            new Tretja.Film("r5DnIwb", 2),
            new Tretja.Info("kn0GLQ", 21),
            new Tretja.Film("EqPXyAs", 2),
            new Tretja.Film("rY7J1y", 17),
            new Tretja.Sport("tWOC5cu", 9),
            new Tretja.Film("QLVd5o", 2),
            new Tretja.Sport("SXspE3I", 11),
            new Tretja.Info("gYhN0v", 4),
            new Tretja.Film("41biLkV", 12),
            new Tretja.Info("CmEeQq8", 25),
            new Tretja.Info("LMRjJf", 10),
            new Tretja.Info("AvlheA", 27),
            new Tretja.Info("ClG2m", 14),
            new Tretja.Sport("VxVeeF", 8),
            new Tretja.Info("IvvqCK", 14),
            new Tretja.Info("rOjJtW", 20),
            new Tretja.Sport("nJo7i2", 28),
            new Tretja.Sport("P6yHwG4", 17),
            new Tretja.Film("tEungcS", 2),
            new Tretja.Sport("8GpfM", 23),
            new Tretja.Film("BRHwX3y", 6),
            new Tretja.Sport("4B8iu", 3),
            new Tretja.Info("W2AFc", 27),
            new Tretja.Info("FdaL0tg", 22),
            new Tretja.Info("fdv6tq", 27),
            new Tretja.Info("A0tYWN", 20),
        });

        System.out.println(program.infoDovoljPogosto(0));
        System.out.println(program.infoDovoljPogosto(24));
        System.out.println(program.infoDovoljPogosto(48));
        System.out.println(program.infoDovoljPogosto(72));
        System.out.println(program.infoDovoljPogosto(96));
        System.out.println(program.infoDovoljPogosto(120));
        System.out.println(program.infoDovoljPogosto(144));
        System.out.println(program.infoDovoljPogosto(168));
        System.out.println(program.infoDovoljPogosto(192));
        System.out.println(program.infoDovoljPogosto(216));
        System.out.println(program.infoDovoljPogosto(240));
        System.out.println(program.infoDovoljPogosto(264));
        System.out.println(program.infoDovoljPogosto(288));
    }
}
