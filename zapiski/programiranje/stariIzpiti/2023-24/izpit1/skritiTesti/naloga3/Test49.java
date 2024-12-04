
import java.util.*;

public class Test49 {

    public static void main(String[] args) {

        Tretja.Dogodek[] dogodki = {
            new Tretja.SluzbenaPot(3, new Cas(0, 14), true),
            new Tretja.SluzbenaPot(3, new Cas(2, 19), false),
            new Tretja.Rekreacija(4, new Cas(2, 20), true),
            new Tretja.Rekreacija(5, new Cas(2, 51), true),
            new Tretja.Malica(1, new Cas(4, 4), true),
            new Tretja.Malica(8, new Cas(4, 30), true),
            new Tretja.SluzbenaPot(0, new Cas(6, 35), true),
            new Tretja.Rekreacija(3, new Cas(6, 37), true),
            new Tretja.Rekreacija(2, new Cas(6, 43), true),
            new Tretja.Malica(6, new Cas(7, 6), true),
            new Tretja.Rekreacija(3, new Cas(7, 26), false),
            new Tretja.Malica(7, new Cas(9, 34), true),
            new Tretja.Malica(3, new Cas(12, 47), true),
            new Tretja.SluzbenaPot(0, new Cas(13, 42), false),
            new Tretja.Malica(7, new Cas(13, 49), false),
            new Tretja.Rekreacija(9, new Cas(14, 27), true),
            new Tretja.Rekreacija(0, new Cas(14, 46), true),
            new Tretja.Rekreacija(0, new Cas(14, 54), false),
            new Tretja.Malica(3, new Cas(15, 9), false),
            new Tretja.SluzbenaPot(7, new Cas(15, 32), true),
            new Tretja.Rekreacija(5, new Cas(17, 19), false),
            new Tretja.Malica(8, new Cas(19, 44), false),
            new Tretja.Malica(0, new Cas(19, 55), true),
            new Tretja.Malica(6, new Cas(20, 48), false),
            new Tretja.Malica(1, new Cas(21, 18), false),
            new Tretja.Rekreacija(4, new Cas(21, 29), false),
            new Tretja.Rekreacija(9, new Cas(21, 35), false),
            new Tretja.Rekreacija(2, new Cas(22, 22), false),
            new Tretja.SluzbenaPot(7, new Cas(22, 35), false),
            new Tretja.Malica(0, new Cas(23, 18), false),
        };

        int stZaposlenih = 10;
        Tretja.Dnevnik dnevnik = new Tretja.Dnevnik(stZaposlenih, dogodki);

        List<Cas> casi = new ArrayList<>();
        casi.add(new Cas(1, 1));
        casi.add(new Cas(1, 55));
        casi.add(new Cas(3, 10));
        casi.add(new Cas(3, 29));
        casi.add(new Cas(4, 43));
        casi.add(new Cas(5, 29));
        casi.add(new Cas(7, 1));
        casi.add(new Cas(7, 45));
        casi.add(new Cas(8, 48));
        casi.add(new Cas(9, 59));
        casi.add(new Cas(10, 0));
        casi.add(new Cas(10, 21));
        casi.add(new Cas(10, 54));
        casi.add(new Cas(12, 50));
        casi.add(new Cas(12, 56));
        casi.add(new Cas(14, 8));
        casi.add(new Cas(14, 11));
        casi.add(new Cas(14, 17));
        casi.add(new Cas(14, 34));
        casi.add(new Cas(15, 34));
        casi.add(new Cas(16, 15));
        casi.add(new Cas(16, 39));
        casi.add(new Cas(17, 4));
        casi.add(new Cas(17, 20));
        casi.add(new Cas(19, 45));
        casi.add(new Cas(19, 50));
        casi.add(new Cas(20, 59));
        casi.add(new Cas(21, 16));
        casi.add(new Cas(22, 47));
        casi.add(new Cas(23, 19));

        for (Cas cas: casi) {
            System.out.printf("%s -> %s%n", cas, Arrays.toString(dnevnik.prisotnost(cas)));
        }
    }
}
