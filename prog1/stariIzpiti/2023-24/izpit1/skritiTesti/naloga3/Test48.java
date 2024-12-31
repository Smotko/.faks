
import java.util.*;

public class Test48 {

    public static void main(String[] args) {

        Tretja.Dogodek[] dogodki = {
            new Tretja.SluzbenaPot(0, new Cas(0, 17), true),
            new Tretja.SluzbenaPot(3, new Cas(1, 7), true),
            new Tretja.Rekreacija(1, new Cas(2, 12), true),
            new Tretja.SluzbenaPot(2, new Cas(2, 27), true),
            new Tretja.SluzbenaPot(0, new Cas(4, 21), false),
            new Tretja.Malica(0, new Cas(4, 41), true),
            new Tretja.SluzbenaPot(2, new Cas(5, 23), false),
            new Tretja.Rekreacija(1, new Cas(5, 45), false),
            new Tretja.SluzbenaPot(2, new Cas(5, 55), true),
            new Tretja.Malica(1, new Cas(6, 8), true),
            new Tretja.SluzbenaPot(3, new Cas(6, 47), false),
            new Tretja.SluzbenaPot(2, new Cas(7, 4), false),
            new Tretja.Malica(2, new Cas(7, 15), true),
            new Tretja.SluzbenaPot(3, new Cas(7, 49), true),
            new Tretja.Malica(0, new Cas(12, 43), false),
            new Tretja.SluzbenaPot(0, new Cas(14, 2), true),
            new Tretja.Malica(2, new Cas(15, 4), false),
            new Tretja.Malica(1, new Cas(15, 42), false),
            new Tretja.SluzbenaPot(2, new Cas(16, 24), true),
            new Tretja.SluzbenaPot(1, new Cas(16, 58), true),
            new Tretja.SluzbenaPot(0, new Cas(17, 47), false),
            new Tretja.SluzbenaPot(2, new Cas(18, 10), false),
            new Tretja.Rekreacija(2, new Cas(18, 37), true),
            new Tretja.SluzbenaPot(3, new Cas(19, 12), false),
            new Tretja.Rekreacija(0, new Cas(19, 34), true),
            new Tretja.SluzbenaPot(3, new Cas(19, 51), true),
            new Tretja.Rekreacija(0, new Cas(20, 53), false),
            new Tretja.Rekreacija(2, new Cas(20, 54), false),
            new Tretja.SluzbenaPot(3, new Cas(21, 38), false),
            new Tretja.SluzbenaPot(1, new Cas(23, 25), false),
        };

        int stZaposlenih = 4;
        Tretja.Dnevnik dnevnik = new Tretja.Dnevnik(stZaposlenih, dogodki);

        List<Cas> casi = new ArrayList<>();
        casi.add(new Cas(0, 16));
        casi.add(new Cas(1, 43));
        casi.add(new Cas(2, 4));
        casi.add(new Cas(2, 8));
        casi.add(new Cas(2, 43));
        casi.add(new Cas(3, 25));
        casi.add(new Cas(5, 15));
        casi.add(new Cas(5, 18));
        casi.add(new Cas(6, 37));
        casi.add(new Cas(7, 40));
        casi.add(new Cas(8, 8));
        casi.add(new Cas(8, 23));
        casi.add(new Cas(8, 27));
        casi.add(new Cas(9, 54));
        casi.add(new Cas(10, 35));
        casi.add(new Cas(11, 58));
        casi.add(new Cas(12, 4));
        casi.add(new Cas(12, 10));
        casi.add(new Cas(13, 17));
        casi.add(new Cas(13, 21));
        casi.add(new Cas(13, 47));
        casi.add(new Cas(15, 0));
        casi.add(new Cas(15, 3));
        casi.add(new Cas(15, 13));
        casi.add(new Cas(16, 10));
        casi.add(new Cas(17, 13));
        casi.add(new Cas(17, 16));
        casi.add(new Cas(17, 34));
        casi.add(new Cas(19, 12));
        casi.add(new Cas(19, 56));

        for (Cas cas: casi) {
            System.out.printf("%s -> %s%n", cas, Arrays.toString(dnevnik.prisotnost(cas)));
        }
    }
}
