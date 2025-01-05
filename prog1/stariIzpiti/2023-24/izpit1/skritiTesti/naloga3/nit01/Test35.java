
import java.util.*;

public class Test35 {

    public static void main(String[] args) {

        Tretja.Dogodek[] dogodki = {
            new Tretja.Malica(1, new Cas(0, 5), true),
            new Tretja.Malica(4, new Cas(0, 40), true),
            new Tretja.Malica(1, new Cas(2, 28), false),
            new Tretja.Malica(3, new Cas(3, 26), true),
            new Tretja.SluzbenaPot(1, new Cas(4, 32), true),
            new Tretja.SluzbenaPot(2, new Cas(4, 55), true),
            new Tretja.SluzbenaPot(2, new Cas(5, 20), false),
            new Tretja.SluzbenaPot(2, new Cas(7, 50), true),
            new Tretja.Rekreacija(0, new Cas(8, 16), true),
            new Tretja.Rekreacija(0, new Cas(8, 20), false),
            new Tretja.Malica(0, new Cas(10, 49), true),
            new Tretja.SluzbenaPot(2, new Cas(11, 4), false),
            new Tretja.Rekreacija(2, new Cas(14, 34), true),
            new Tretja.Malica(4, new Cas(15, 40), false),
            new Tretja.Rekreacija(2, new Cas(16, 15), false),
            new Tretja.SluzbenaPot(4, new Cas(16, 35), true),
            new Tretja.Malica(2, new Cas(16, 41), true),
            new Tretja.Malica(0, new Cas(17, 49), false),
            new Tretja.Rekreacija(0, new Cas(18, 42), true),
            new Tretja.SluzbenaPot(1, new Cas(18, 46), false),
            new Tretja.SluzbenaPot(4, new Cas(19, 19), false),
            new Tretja.Malica(3, new Cas(19, 37), false),
            new Tretja.Malica(2, new Cas(20, 53), false),
            new Tretja.Rekreacija(4, new Cas(22, 18), true),
            new Tretja.Rekreacija(4, new Cas(22, 55), false),
            new Tretja.Rekreacija(0, new Cas(23, 26), false),
        };

        int stZaposlenih = 5;
        Tretja.Dnevnik dnevnik = new Tretja.Dnevnik(stZaposlenih, dogodki);

        List<Cas> casi = new ArrayList<>();
        casi.add(new Cas(0, 49));
        casi.add(new Cas(1, 44));
        casi.add(new Cas(2, 13));
        casi.add(new Cas(4, 19));
        casi.add(new Cas(4, 40));
        casi.add(new Cas(6, 15));
        casi.add(new Cas(6, 59));
        casi.add(new Cas(7, 0));
        casi.add(new Cas(8, 28));
        casi.add(new Cas(9, 37));
        casi.add(new Cas(10, 15));
        casi.add(new Cas(10, 39));
        casi.add(new Cas(11, 15));
        casi.add(new Cas(11, 30));
        casi.add(new Cas(13, 30));
        casi.add(new Cas(15, 36));
        casi.add(new Cas(16, 2));
        casi.add(new Cas(17, 46));
        casi.add(new Cas(18, 18));
        casi.add(new Cas(18, 19));
        casi.add(new Cas(18, 54));
        casi.add(new Cas(19, 10));
        casi.add(new Cas(19, 52));
        casi.add(new Cas(20, 3));
        casi.add(new Cas(21, 42));
        casi.add(new Cas(22, 17));
        casi.add(new Cas(22, 44));
        casi.add(new Cas(22, 56));
        casi.add(new Cas(23, 8));
        casi.add(new Cas(23, 47));

        for (Cas cas: casi) {
            System.out.printf("%s -> %s%n", cas, Arrays.toString(dnevnik.prisotnost(cas)));
        }
    }
}
