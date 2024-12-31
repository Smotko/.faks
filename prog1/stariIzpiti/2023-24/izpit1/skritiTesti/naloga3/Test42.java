
import java.util.*;

public class Test42 {

    public static void main(String[] args) {

        Tretja.Dogodek[] dogodki = {
            new Tretja.Rekreacija(0, new Cas(1, 29), true),
            new Tretja.Rekreacija(0, new Cas(1, 33), false),
            new Tretja.SluzbenaPot(0, new Cas(6, 41), true),
            new Tretja.Rekreacija(1, new Cas(7, 14), true),
            new Tretja.Rekreacija(1, new Cas(10, 45), false),
            new Tretja.SluzbenaPot(0, new Cas(11, 32), false),
            new Tretja.SluzbenaPot(0, new Cas(15, 39), true),
            new Tretja.Rekreacija(1, new Cas(17, 32), true),
            new Tretja.SluzbenaPot(0, new Cas(17, 46), false),
            new Tretja.Rekreacija(1, new Cas(21, 7), false),
        };

        int stZaposlenih = 2;
        Tretja.Dnevnik dnevnik = new Tretja.Dnevnik(stZaposlenih, dogodki);

        List<Cas> casi = new ArrayList<>();
        casi.add(new Cas(0, 43));
        casi.add(new Cas(1, 18));
        casi.add(new Cas(1, 26));
        casi.add(new Cas(2, 35));
        casi.add(new Cas(4, 55));
        casi.add(new Cas(5, 4));
        casi.add(new Cas(5, 30));
        casi.add(new Cas(6, 36));
        casi.add(new Cas(8, 52));
        casi.add(new Cas(9, 9));
        casi.add(new Cas(9, 11));
        casi.add(new Cas(9, 13));
        casi.add(new Cas(12, 13));
        casi.add(new Cas(12, 37));
        casi.add(new Cas(13, 14));
        casi.add(new Cas(13, 16));
        casi.add(new Cas(13, 19));
        casi.add(new Cas(13, 43));
        casi.add(new Cas(14, 16));
        casi.add(new Cas(14, 46));
        casi.add(new Cas(15, 6));
        casi.add(new Cas(15, 36));
        casi.add(new Cas(17, 36));
        casi.add(new Cas(18, 44));
        casi.add(new Cas(19, 40));
        casi.add(new Cas(22, 21));
        casi.add(new Cas(22, 49));
        casi.add(new Cas(23, 37));
        casi.add(new Cas(23, 45));
        casi.add(new Cas(23, 57));

        for (Cas cas: casi) {
            System.out.printf("%s -> %s%n", cas, Arrays.toString(dnevnik.prisotnost(cas)));
        }
    }
}
