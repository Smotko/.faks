
import java.util.*;

public class Test08 {

    public static void main(String[] args) {

        Tretja.Dogodek[] dogodki = {
            new Tretja.Rekreacija(12, new Cas(0, 7), true),
            new Tretja.Malica(1, new Cas(0, 17), true),
            new Tretja.SluzbenaPot(10, new Cas(0, 18), true),
            new Tretja.Malica(3, new Cas(0, 27), true),
            new Tretja.Rekreacija(4, new Cas(1, 6), true),
            new Tretja.SluzbenaPot(5, new Cas(1, 21), true),
            new Tretja.Rekreacija(13, new Cas(1, 25), true),
            new Tretja.Rekreacija(0, new Cas(1, 29), true),
            new Tretja.Malica(2, new Cas(1, 53), true),
            new Tretja.SluzbenaPot(10, new Cas(1, 54), false),
            new Tretja.Rekreacija(12, new Cas(2, 1), false),
            new Tretja.Rekreacija(7, new Cas(2, 5), true),
            new Tretja.Rekreacija(4, new Cas(2, 16), false),
            new Tretja.Rekreacija(12, new Cas(2, 18), true),
            new Tretja.Rekreacija(11, new Cas(2, 34), true),
            new Tretja.SluzbenaPot(8, new Cas(2, 42), true),
            new Tretja.SluzbenaPot(9, new Cas(3, 20), true),
            new Tretja.Rekreacija(4, new Cas(3, 29), true),
            new Tretja.Rekreacija(7, new Cas(3, 46), false),
            new Tretja.SluzbenaPot(7, new Cas(3, 50), true),
            new Tretja.SluzbenaPot(5, new Cas(3, 53), false),
            new Tretja.Rekreacija(4, new Cas(3, 57), false),
            new Tretja.Malica(3, new Cas(4, 7), false),
            new Tretja.Malica(1, new Cas(4, 32), false),
            new Tretja.Rekreacija(12, new Cas(4, 32), false),
            new Tretja.Rekreacija(12, new Cas(4, 35), true),
            new Tretja.Rekreacija(3, new Cas(4, 39), true),
            new Tretja.Rekreacija(4, new Cas(4, 40), true),
            new Tretja.SluzbenaPot(10, new Cas(4, 42), true),
            new Tretja.SluzbenaPot(6, new Cas(4, 56), true),
            new Tretja.Rekreacija(4, new Cas(5, 2), false),
            new Tretja.SluzbenaPot(4, new Cas(5, 6), true),
            new Tretja.Rekreacija(0, new Cas(5, 15), false),
            new Tretja.SluzbenaPot(9, new Cas(5, 16), false),
            new Tretja.Rekreacija(13, new Cas(5, 18), false),
            new Tretja.SluzbenaPot(0, new Cas(5, 58), true),
            new Tretja.SluzbenaPot(5, new Cas(5, 59), true),
            new Tretja.Rekreacija(9, new Cas(6, 4), true),
            new Tretja.SluzbenaPot(6, new Cas(6, 29), false),
            new Tretja.SluzbenaPot(1, new Cas(6, 45), true),
            new Tretja.SluzbenaPot(1, new Cas(6, 48), false),
            new Tretja.Rekreacija(12, new Cas(7, 6), false),
            new Tretja.Malica(6, new Cas(7, 20), true),
            new Tretja.SluzbenaPot(13, new Cas(7, 23), true),
            new Tretja.SluzbenaPot(12, new Cas(7, 25), true),
            new Tretja.SluzbenaPot(12, new Cas(7, 33), false),
            new Tretja.SluzbenaPot(1, new Cas(7, 44), true),
            new Tretja.Rekreacija(9, new Cas(7, 50), false),
            new Tretja.SluzbenaPot(12, new Cas(8, 2), true),
            new Tretja.SluzbenaPot(0, new Cas(8, 27), false),
            new Tretja.SluzbenaPot(13, new Cas(9, 14), false),
            new Tretja.SluzbenaPot(13, new Cas(9, 17), true),
            new Tretja.Malica(0, new Cas(9, 27), true),
            new Tretja.Rekreacija(3, new Cas(9, 31), false),
            new Tretja.SluzbenaPot(9, new Cas(9, 58), true),
            new Tretja.Rekreacija(3, new Cas(10, 3), true),
            new Tretja.SluzbenaPot(7, new Cas(10, 14), false),
            new Tretja.SluzbenaPot(7, new Cas(10, 32), true),
            new Tretja.SluzbenaPot(7, new Cas(10, 40), false),
            new Tretja.Rekreacija(7, new Cas(10, 56), true),
            new Tretja.SluzbenaPot(5, new Cas(10, 58), false),
            new Tretja.SluzbenaPot(12, new Cas(11, 0), false),
            new Tretja.SluzbenaPot(10, new Cas(11, 9), false),
            new Tretja.SluzbenaPot(1, new Cas(11, 11), false),
            new Tretja.SluzbenaPot(12, new Cas(11, 12), true),
            new Tretja.Rekreacija(3, new Cas(11, 22), false),
            new Tretja.Rekreacija(3, new Cas(11, 45), true),
            new Tretja.SluzbenaPot(10, new Cas(11, 50), true),
            new Tretja.Malica(6, new Cas(11, 57), false),
            new Tretja.Rekreacija(6, new Cas(11, 58), true),
            new Tretja.SluzbenaPot(5, new Cas(12, 14), true),
            new Tretja.Rekreacija(1, new Cas(12, 22), true),
            new Tretja.SluzbenaPot(12, new Cas(12, 37), false),
            new Tretja.Rekreacija(6, new Cas(12, 59), false),
            new Tretja.SluzbenaPot(10, new Cas(13, 0), false),
            new Tretja.Rekreacija(6, new Cas(13, 18), true),
            new Tretja.SluzbenaPot(5, new Cas(13, 19), false),
            new Tretja.SluzbenaPot(12, new Cas(13, 32), true),
            new Tretja.SluzbenaPot(10, new Cas(13, 49), true),
            new Tretja.SluzbenaPot(5, new Cas(13, 52), true),
            new Tretja.SluzbenaPot(10, new Cas(13, 52), false),
            new Tretja.SluzbenaPot(4, new Cas(13, 55), false),
            new Tretja.Malica(4, new Cas(14, 2), true),
            new Tretja.Malica(0, new Cas(14, 19), false),
            new Tretja.Malica(10, new Cas(14, 20), true),
            new Tretja.Rekreacija(0, new Cas(14, 31), true),
            new Tretja.Rekreacija(7, new Cas(14, 32), false),
            new Tretja.Malica(10, new Cas(14, 40), false),
            new Tretja.SluzbenaPot(8, new Cas(14, 46), false),
            new Tretja.Rekreacija(0, new Cas(14, 54), false),
            new Tretja.Malica(2, new Cas(14, 59), false),
            new Tretja.SluzbenaPot(0, new Cas(15, 22), true),
            new Tretja.SluzbenaPot(7, new Cas(15, 28), true),
            new Tretja.SluzbenaPot(2, new Cas(15, 40), true),
            new Tretja.SluzbenaPot(8, new Cas(16, 18), true),
            new Tretja.Rekreacija(10, new Cas(16, 24), true),
            new Tretja.SluzbenaPot(12, new Cas(16, 25), false),
            new Tretja.SluzbenaPot(2, new Cas(16, 31), false),
            new Tretja.Rekreacija(6, new Cas(17, 4), false),
            new Tretja.Rekreacija(11, new Cas(17, 32), false),
            new Tretja.Rekreacija(11, new Cas(17, 43), true),
            new Tretja.SluzbenaPot(2, new Cas(17, 49), true),
            new Tretja.SluzbenaPot(13, new Cas(17, 51), false),
            new Tretja.SluzbenaPot(12, new Cas(17, 56), true),
            new Tretja.SluzbenaPot(7, new Cas(18, 14), false),
            new Tretja.SluzbenaPot(9, new Cas(18, 45), false),
            new Tretja.SluzbenaPot(8, new Cas(18, 46), false),
            new Tretja.SluzbenaPot(12, new Cas(18, 46), false),
            new Tretja.SluzbenaPot(0, new Cas(18, 47), false),
            new Tretja.Rekreacija(0, new Cas(18, 50), true),
            new Tretja.Malica(12, new Cas(18, 52), true),
            new Tretja.SluzbenaPot(13, new Cas(19, 5), true),
            new Tretja.SluzbenaPot(6, new Cas(19, 8), true),
            new Tretja.SluzbenaPot(5, new Cas(19, 12), false),
            new Tretja.Rekreacija(0, new Cas(19, 28), false),
            new Tretja.Rekreacija(10, new Cas(19, 29), false),
            new Tretja.SluzbenaPot(6, new Cas(19, 36), false),
            new Tretja.Rekreacija(1, new Cas(19, 44), false),
            new Tretja.SluzbenaPot(10, new Cas(19, 58), true),
            new Tretja.Rekreacija(6, new Cas(20, 12), true),
            new Tretja.SluzbenaPot(0, new Cas(20, 29), true),
            new Tretja.SluzbenaPot(13, new Cas(20, 34), false),
            new Tretja.Rekreacija(1, new Cas(21, 22), true),
            new Tretja.Rekreacija(6, new Cas(21, 25), false),
            new Tretja.SluzbenaPot(10, new Cas(21, 42), false),
            new Tretja.SluzbenaPot(0, new Cas(21, 42), false),
            new Tretja.Malica(9, new Cas(21, 58), true),
            new Tretja.Rekreacija(3, new Cas(22, 2), false),
            new Tretja.SluzbenaPot(2, new Cas(22, 6), false),
            new Tretja.Rekreacija(2, new Cas(22, 24), true),
            new Tretja.Rekreacija(11, new Cas(22, 33), false),
            new Tretja.Malica(12, new Cas(22, 33), false),
            new Tretja.Malica(9, new Cas(22, 36), false),
            new Tretja.Rekreacija(1, new Cas(23, 17), false),
            new Tretja.Rekreacija(2, new Cas(23, 24), false),
            new Tretja.Malica(4, new Cas(23, 48), false),
        };

        int stZaposlenih = 14;
        Tretja.Dnevnik dnevnik = new Tretja.Dnevnik(stZaposlenih, dogodki);

        List<Cas> casi = new ArrayList<>();
        casi.add(new Cas(0, 11));
        casi.add(new Cas(0, 40));
        casi.add(new Cas(1, 2));
        casi.add(new Cas(2, 39));
        casi.add(new Cas(3, 46));
        casi.add(new Cas(4, 53));
        casi.add(new Cas(5, 50));
        casi.add(new Cas(5, 54));
        casi.add(new Cas(6, 2));
        casi.add(new Cas(6, 39));
        casi.add(new Cas(10, 48));
        casi.add(new Cas(11, 27));
        casi.add(new Cas(12, 34));
        casi.add(new Cas(13, 12));
        casi.add(new Cas(13, 23));
        casi.add(new Cas(13, 28));
        casi.add(new Cas(14, 30));
        casi.add(new Cas(15, 20));
        casi.add(new Cas(15, 21));
        casi.add(new Cas(15, 53));
        casi.add(new Cas(16, 20));
        casi.add(new Cas(16, 24));
        casi.add(new Cas(17, 25));
        casi.add(new Cas(19, 21));
        casi.add(new Cas(19, 32));
        casi.add(new Cas(21, 7));
        casi.add(new Cas(21, 9));
        casi.add(new Cas(21, 40));
        casi.add(new Cas(22, 2));
        casi.add(new Cas(23, 50));

        for (Cas cas: casi) {
            System.out.printf("%s -> %s%n", cas, Arrays.toString(dnevnik.prisotnost(cas)));
        }
    }
}
