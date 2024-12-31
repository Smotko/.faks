
import java.util.*;

public class Test43 {

    public static void main(String[] args) {

        Tretja.Dogodek[] dogodki = {
            new Tretja.Rekreacija(0, new Cas(5, 16), true),
            new Tretja.Rekreacija(0, new Cas(6, 7), false),
            new Tretja.Malica(0, new Cas(8, 57), true),
            new Tretja.Malica(0, new Cas(23, 31), false),
        };

        int stZaposlenih = 1;
        Tretja.Dnevnik dnevnik = new Tretja.Dnevnik(stZaposlenih, dogodki);

        List<Cas> casi = new ArrayList<>();
        casi.add(new Cas(0, 2));
        casi.add(new Cas(1, 6));
        casi.add(new Cas(1, 23));
        casi.add(new Cas(3, 38));
        casi.add(new Cas(3, 59));
        casi.add(new Cas(4, 36));
        casi.add(new Cas(5, 31));
        casi.add(new Cas(10, 0));
        casi.add(new Cas(10, 29));
        casi.add(new Cas(10, 31));
        casi.add(new Cas(10, 55));
        casi.add(new Cas(12, 16));
        casi.add(new Cas(12, 22));
        casi.add(new Cas(13, 26));
        casi.add(new Cas(15, 12));
        casi.add(new Cas(15, 52));
        casi.add(new Cas(15, 56));
        casi.add(new Cas(16, 11));
        casi.add(new Cas(16, 27));
        casi.add(new Cas(16, 32));
        casi.add(new Cas(19, 5));
        casi.add(new Cas(20, 0));
        casi.add(new Cas(20, 17));
        casi.add(new Cas(20, 22));
        casi.add(new Cas(20, 45));
        casi.add(new Cas(21, 30));
        casi.add(new Cas(21, 48));
        casi.add(new Cas(21, 54));
        casi.add(new Cas(22, 58));
        casi.add(new Cas(23, 19));

        for (Cas cas: casi) {
            System.out.printf("%s -> %s%n", cas, Arrays.toString(dnevnik.prisotnost(cas)));
        }
    }
}
