
import java.util.*;

public class Test09 {

    public static void main(String[] args) {
        Tretja.Program program = new Tretja.Program(new Tretja.Oddaja[]{
            new Tretja.Sport("KDH2yS", 9),
            new Tretja.Info("16VkU", 79),
            new Tretja.Sport("FdaL0tg", 30),
            new Tretja.Sport("CIOgiW", 20),
            new Tretja.Film("ME47f", 41),
            new Tretja.Info("ccAgwL", 66),
            new Tretja.Info("L05ao", 76),
            new Tretja.Info("ynbO4", 42),
            new Tretja.Film("vWwBw1", 39),
            new Tretja.Film("etKrT", 79),
            new Tretja.Film("tWOC5cu", 28),
        });

        System.out.println(program.konec(new Cas(11, 8)));
        System.out.println(program.konec(new Cas(7, 34)));
        System.out.println(program.konec(new Cas(1, 1)));
        System.out.println(program.konec(new Cas(10, 52)));
        System.out.println(program.konec(new Cas(1, 10)));
    }
}
