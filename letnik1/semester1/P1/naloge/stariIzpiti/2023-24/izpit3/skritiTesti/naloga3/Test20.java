
import java.util.*;

public class Test20 {

    public static void main(String[] args) {
        Tretja.Program program = new Tretja.Program(new Tretja.Oddaja[]{
            new Tretja.Sport("yveE1", 1),
            new Tretja.Film("8CAyT", 12),
            new Tretja.Film("uLGOxX", 26),
            new Tretja.Info("tsuw5", 5),
            new Tretja.Sport("EuqNY", 25),
            new Tretja.Sport("sPsO4", 2),
            new Tretja.Info("MrYaa", 19),
            new Tretja.Sport("opR4SEt", 19),
            new Tretja.Film("IjCyAD", 16),
            new Tretja.Info("wYGOOnm", 19),
            new Tretja.Film("tgRtO", 17),
            new Tretja.Sport("F5E5hql", 9),
            new Tretja.Info("IFTERw", 17),
            new Tretja.Info("O6b0DN", 25),
            new Tretja.Info("WM0gJX", 13),
            new Tretja.Sport("6LoJP", 3),
            new Tretja.Info("frtj5gu", 21),
            new Tretja.Sport("wW7sQk", 7),
            new Tretja.Film("irSQbL3", 3),
            new Tretja.Sport("wbsuTaf", 3),
            new Tretja.Sport("dDldUIg", 18),
            new Tretja.Sport("BJlcs", 24),
            new Tretja.Film("irDEfqj", 7),
            new Tretja.Info("0240tYI", 20),
            new Tretja.Film("QLVd5o", 17),
            new Tretja.Film("6uf43", 17),
            new Tretja.Info("tIy2Qu0", 12),
            new Tretja.Sport("WGXvc", 24),
            new Tretja.Info("dIESoG", 7),
            new Tretja.Info("EnreiKg", 5),
            new Tretja.Film("NewAK3", 6),
            new Tretja.Film("vrfO0", 2),
            new Tretja.Film("nHwdbM", 12),
            new Tretja.Info("bjlXXA", 24),
            new Tretja.Info("e8L0FGR", 26),
            new Tretja.Info("XYDCT", 11),
        });

        Tretja.Film film = program.zadnjiFilm();
        System.out.println(film);
    }
}
