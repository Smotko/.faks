
import java.util.*;

public class Test07 {

    public static void main(String[] args) {
        Tretja.Program program = new Tretja.Program(new Tretja.Oddaja[]{
            new Tretja.Sport("4JuqP", 1),
            new Tretja.Sport("hm5TfU", 24),
            new Tretja.Film("TfOWd", 16),
            new Tretja.Film("FdaL0tg", 9),
            new Tretja.Info("6ERsWn", 7),
            new Tretja.Sport("rREL7q", 11),
            new Tretja.Sport("13ON2", 5),
            new Tretja.Sport("tPmJG68", 4),
            new Tretja.Film("L3ccU", 1),
            new Tretja.Film("eSXTT", 13),
            new Tretja.Film("OSk1qi", 1),
            new Tretja.Sport("HRqXsjm", 11),
            new Tretja.Sport("dkX43S", 15),
            new Tretja.Sport("R6yuh3F", 10),
            new Tretja.Film("AES5aG3", 11),
            new Tretja.Sport("W7bGsQG", 16),
            new Tretja.Info("XOm6jj5", 15),
            new Tretja.Info("JrRaPH", 22),
            new Tretja.Film("URgrt", 10),
            new Tretja.Film("oScIygS", 17),
            new Tretja.Sport("06fVYD", 10),
            new Tretja.Info("OHsFhcW", 10),
            new Tretja.Film("o2D7L", 25),
            new Tretja.Sport("8toxqdn", 17),
            new Tretja.Sport("vE64ma1", 4),
            new Tretja.Info("3ndyCP", 22),
            new Tretja.Sport("NkmYSXh", 18),
            new Tretja.Sport("JQaaxmG", 12),
            new Tretja.Sport("Af40qj", 21),
            new Tretja.Info("tcAlJW", 7),
            new Tretja.Sport("2NS61", 18),
            new Tretja.Sport("phCKl6", 14),
            new Tretja.Film("e8L0FGR", 5),
            new Tretja.Info("W7J2ta", 9),
            new Tretja.Sport("BXigg", 25),
            new Tretja.Film("2EIE2d5", 14),
            new Tretja.Sport("VGWbp", 4),
            new Tretja.Film("KE524", 22),
            new Tretja.Film("l3EG37t", 8),
        });

        System.out.println(program.konec(new Cas(2, 15)));
        System.out.println(program.konec(new Cas(3, 36)));
        System.out.println(program.konec(new Cas(9, 26)));
        System.out.println(program.konec(new Cas(14, 24)));
        System.out.println(program.konec(new Cas(2, 42)));
    }
}
