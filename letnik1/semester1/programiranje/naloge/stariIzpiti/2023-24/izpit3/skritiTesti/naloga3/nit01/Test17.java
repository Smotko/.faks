
import java.util.*;

public class Test17 {

    public static void main(String[] args) {
        Tretja.Program program = new Tretja.Program(new Tretja.Oddaja[]{
            new Tretja.Film("6U1hTf", 19),
            new Tretja.Film("d0KJdHm", 10),
            new Tretja.Sport("oRYUsT0", 13),
            new Tretja.Film("tOdCC", 3),
            new Tretja.Film("0WEDU", 13),
            new Tretja.Sport("u8O8Psp", 1),
            new Tretja.Sport("3HApwD3", 13),
            new Tretja.Info("amqSJP", 22),
            new Tretja.Info("fk4Wq", 16),
            new Tretja.Film("wxgrJ", 8),
            new Tretja.Info("2U2147j", 13),
            new Tretja.Film("wx8DH6D", 12),
            new Tretja.Film("DSltX", 16),
            new Tretja.Info("ktWsDO", 11),
            new Tretja.Info("vQ07A4", 16),
            new Tretja.Film("GqOO4", 8),
            new Tretja.Sport("He1bL", 7),
            new Tretja.Film("PBnmfE", 19),
            new Tretja.Sport("6neub", 22),
            new Tretja.Info("VtjJxGD", 8),
            new Tretja.Info("Fwh7rm", 8),
            new Tretja.Film("6NMyQM", 8),
            new Tretja.Film("XOm6jj5", 14),
            new Tretja.Sport("CQQUP8", 12),
            new Tretja.Sport("oLr04GB", 8),
            new Tretja.Film("8lm8nbs", 6),
            new Tretja.Info("o3NTw", 4),
            new Tretja.Film("fmupF", 7),
            new Tretja.Film("UxRxfm", 10),
            new Tretja.Info("tJYiUl", 2),
            new Tretja.Info("KdiX0", 15),
            new Tretja.Film("yKReLO", 4),
            new Tretja.Sport("wHJtXG", 15),
            new Tretja.Film("CmKMiX", 13),
            new Tretja.Sport("33HYDVm", 16),
            new Tretja.Info("WRfut0h", 7),
            new Tretja.Film("i1V7g", 14),
            new Tretja.Film("4Xbop0", 18),
            new Tretja.Sport("vB8qgr", 24),
            new Tretja.Sport("WrA27", 18),
            new Tretja.Info("OYbxf", 4),
        });

        Tretja.Film film = program.zadnjiFilm();
        System.out.println(film);
    }
}
