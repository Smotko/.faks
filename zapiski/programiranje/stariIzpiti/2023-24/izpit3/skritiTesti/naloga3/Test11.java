
import java.util.*;

public class Test11 {

    public static void main(String[] args) {
        Tretja.Program program = new Tretja.Program(new Tretja.Oddaja[]{
            new Tretja.Film("8FGLKKF", 1),
            new Tretja.Info("wKcyv88", 10),
            new Tretja.Sport("E8IsxF", 37),
            new Tretja.Film("aqg58", 30),
            new Tretja.Film("ogjoL42", 10),
            new Tretja.Info("dWiJw6l", 20),
            new Tretja.Info("KDH2yS", 14),
            new Tretja.Sport("rJUW8", 36),
            new Tretja.Film("g1MVL", 9),
            new Tretja.Film("mN5Mb", 32),
            new Tretja.Film("eofdJ", 14),
            new Tretja.Film("otfbd8u", 10),
            new Tretja.Info("DwgMj", 19),
            new Tretja.Info("bXF6kAO", 29),
            new Tretja.Film("uLGOxX", 31),
            new Tretja.Sport("cDRs0I8", 9),
            new Tretja.Film("HRqXsjm", 16),
            new Tretja.Sport("561ab5C", 6),
            new Tretja.Film("0lIum", 16),
            new Tretja.Film("0SELKw", 13),
            new Tretja.Info("qBaFh", 28),
            new Tretja.Film("JnbwKf", 20),
            new Tretja.Film("oRYUsT0", 27),
            new Tretja.Film("Y8joC", 20),
            new Tretja.Film("1GyPH", 7),
        });

        System.out.println(program.konec(new Cas(5, 37)));
        System.out.println(program.konec(new Cas(14, 34)));
        System.out.println(program.konec(new Cas(13, 18)));
        System.out.println(program.konec(new Cas(9, 48)));
        System.out.println(program.konec(new Cas(13, 8)));
    }
}
