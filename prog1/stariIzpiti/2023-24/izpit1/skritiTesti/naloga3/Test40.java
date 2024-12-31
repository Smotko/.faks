
import java.util.*;

public class Test40 {

    public static void main(String[] args) {

        Tretja.Dogodek[] dogodki = {
            new Tretja.Rekreacija(0, new Cas(1, 28), true),
            new Tretja.Rekreacija(0, new Cas(8, 28), false),
            new Tretja.SluzbenaPot(0, new Cas(11, 26), true),
            new Tretja.SluzbenaPot(0, new Cas(14, 18), false),
            new Tretja.Rekreacija(0, new Cas(14, 54), true),
            new Tretja.Rekreacija(0, new Cas(18, 51), false),
            new Tretja.Malica(0, new Cas(22, 19), true),
            new Tretja.Malica(0, new Cas(23, 56), false),
        };

        int stZaposlenih = 1;
        Tretja.Dnevnik dnevnik = new Tretja.Dnevnik(stZaposlenih, dogodki);

        List<Cas> casi = new ArrayList<>();
        casi.add(new Cas(0, 47));
        casi.add(new Cas(1, 0));
        casi.add(new Cas(1, 34));
        casi.add(new Cas(2, 15));
        casi.add(new Cas(2, 18));
        casi.add(new Cas(2, 39));
        casi.add(new Cas(3, 22));
        casi.add(new Cas(3, 27));
        casi.add(new Cas(6, 0));
        casi.add(new Cas(7, 9));
        casi.add(new Cas(7, 16));
        casi.add(new Cas(8, 43));
        casi.add(new Cas(8, 45));
        casi.add(new Cas(12, 29));
        casi.add(new Cas(14, 9));
        casi.add(new Cas(14, 51));
        casi.add(new Cas(15, 34));
        casi.add(new Cas(15, 36));
        casi.add(new Cas(16, 38));
        casi.add(new Cas(17, 0));
        casi.add(new Cas(17, 8));
        casi.add(new Cas(17, 20));
        casi.add(new Cas(18, 41));
        casi.add(new Cas(19, 16));
        casi.add(new Cas(19, 41));
        casi.add(new Cas(19, 55));
        casi.add(new Cas(20, 11));
        casi.add(new Cas(21, 1));
        casi.add(new Cas(22, 24));
        casi.add(new Cas(23, 12));

        for (Cas cas: casi) {
            System.out.printf("%s -> %s%n", cas, Arrays.toString(dnevnik.prisotnost(cas)));
        }
    }
}
