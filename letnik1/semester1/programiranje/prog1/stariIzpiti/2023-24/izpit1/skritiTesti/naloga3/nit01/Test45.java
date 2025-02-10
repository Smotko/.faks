
import java.util.*;

public class Test45 {

    public static void main(String[] args) {

        Tretja.Dogodek[] dogodki = {
            new Tretja.SluzbenaPot(43, new Cas(0, 1), true),
            new Tretja.Rekreacija(31, new Cas(0, 2), true),
            new Tretja.Rekreacija(28, new Cas(0, 17), true),
            new Tretja.SluzbenaPot(6, new Cas(0, 19), true),
            new Tretja.SluzbenaPot(16, new Cas(0, 25), true),
            new Tretja.Rekreacija(32, new Cas(0, 28), true),
            new Tretja.Rekreacija(31, new Cas(0, 36), false),
            new Tretja.Rekreacija(15, new Cas(0, 41), true),
            new Tretja.Malica(2, new Cas(1, 7), true),
            new Tretja.Malica(2, new Cas(1, 26), false),
            new Tretja.SluzbenaPot(23, new Cas(1, 31), true),
            new Tretja.Rekreacija(2, new Cas(1, 46), true),
            new Tretja.Malica(22, new Cas(1, 48), true),
            new Tretja.Malica(34, new Cas(2, 4), true),
            new Tretja.Rekreacija(14, new Cas(2, 20), true),
            new Tretja.SluzbenaPot(17, new Cas(3, 17), true),
            new Tretja.SluzbenaPot(43, new Cas(3, 17), false),
            new Tretja.Rekreacija(9, new Cas(3, 51), true),
            new Tretja.SluzbenaPot(36, new Cas(4, 3), true),
            new Tretja.Malica(35, new Cas(4, 20), true),
            new Tretja.SluzbenaPot(40, new Cas(4, 21), true),
            new Tretja.Malica(5, new Cas(4, 25), true),
            new Tretja.Rekreacija(3, new Cas(4, 45), true),
            new Tretja.Rekreacija(15, new Cas(4, 57), false),
            new Tretja.Rekreacija(41, new Cas(5, 10), true),
            new Tretja.Malica(49, new Cas(5, 12), true),
            new Tretja.Malica(5, new Cas(5, 13), false),
            new Tretja.SluzbenaPot(20, new Cas(5, 25), true),
            new Tretja.Malica(35, new Cas(5, 30), false),
            new Tretja.SluzbenaPot(21, new Cas(5, 37), true),
            new Tretja.Malica(22, new Cas(5, 38), false),
            new Tretja.Rekreacija(1, new Cas(6, 1), true),
            new Tretja.Rekreacija(12, new Cas(6, 10), true),
            new Tretja.Malica(38, new Cas(6, 40), true),
            new Tretja.SluzbenaPot(21, new Cas(6, 54), false),
            new Tretja.Malica(13, new Cas(7, 25), true),
            new Tretja.Rekreacija(1, new Cas(7, 27), false),
            new Tretja.Malica(45, new Cas(7, 57), true),
            new Tretja.Malica(13, new Cas(8, 6), false),
            new Tretja.Malica(46, new Cas(8, 26), true),
            new Tretja.SluzbenaPot(18, new Cas(8, 34), true),
            new Tretja.Rekreacija(12, new Cas(8, 46), false),
            new Tretja.Rekreacija(48, new Cas(8, 56), true),
            new Tretja.Malica(27, new Cas(9, 3), true),
            new Tretja.Rekreacija(29, new Cas(9, 5), true),
            new Tretja.SluzbenaPot(10, new Cas(9, 7), true),
            new Tretja.Rekreacija(31, new Cas(9, 19), true),
            new Tretja.Rekreacija(22, new Cas(9, 22), true),
            new Tretja.SluzbenaPot(4, new Cas(9, 22), true),
            new Tretja.SluzbenaPot(5, new Cas(9, 24), true),
            new Tretja.Rekreacija(29, new Cas(9, 47), false),
            new Tretja.SluzbenaPot(10, new Cas(10, 5), false),
            new Tretja.Rekreacija(7, new Cas(10, 6), true),
            new Tretja.SluzbenaPot(4, new Cas(10, 8), false),
            new Tretja.SluzbenaPot(11, new Cas(10, 9), true),
            new Tretja.Malica(0, new Cas(10, 14), true),
            new Tretja.Malica(12, new Cas(10, 40), true),
            new Tretja.Malica(27, new Cas(10, 42), false),
            new Tretja.SluzbenaPot(11, new Cas(10, 53), false),
            new Tretja.Rekreacija(43, new Cas(11, 5), true),
            new Tretja.SluzbenaPot(6, new Cas(11, 22), false),
            new Tretja.Malica(4, new Cas(11, 24), true),
            new Tretja.Rekreacija(39, new Cas(11, 24), true),
            new Tretja.Rekreacija(37, new Cas(11, 31), true),
            new Tretja.Rekreacija(29, new Cas(11, 34), true),
            new Tretja.Rekreacija(6, new Cas(11, 50), true),
            new Tretja.Malica(24, new Cas(11, 56), true),
            new Tretja.SluzbenaPot(18, new Cas(12, 0), false),
            new Tretja.SluzbenaPot(15, new Cas(12, 9), true),
            new Tretja.SluzbenaPot(40, new Cas(12, 18), false),
            new Tretja.Malica(45, new Cas(12, 25), false),
            new Tretja.Malica(19, new Cas(12, 36), true),
            new Tretja.Rekreacija(13, new Cas(12, 37), true),
            new Tretja.SluzbenaPot(36, new Cas(12, 55), false),
            new Tretja.SluzbenaPot(30, new Cas(12, 59), true),
            new Tretja.Rekreacija(47, new Cas(13, 21), true),
            new Tretja.Malica(24, new Cas(13, 45), false),
            new Tretja.SluzbenaPot(24, new Cas(13, 58), true),
            new Tretja.SluzbenaPot(23, new Cas(14, 4), false),
            new Tretja.SluzbenaPot(5, new Cas(14, 12), false),
            new Tretja.Rekreacija(41, new Cas(14, 17), false),
            new Tretja.Malica(42, new Cas(14, 35), true),
            new Tretja.Rekreacija(39, new Cas(14, 49), false),
            new Tretja.Malica(34, new Cas(15, 4), false),
            new Tretja.Rekreacija(47, new Cas(16, 2), false),
            new Tretja.Rekreacija(33, new Cas(16, 8), true),
            new Tretja.SluzbenaPot(18, new Cas(16, 15), true),
            new Tretja.SluzbenaPot(27, new Cas(16, 20), true),
            new Tretja.Rekreacija(32, new Cas(16, 44), false),
            new Tretja.SluzbenaPot(20, new Cas(16, 46), false),
            new Tretja.SluzbenaPot(30, new Cas(16, 50), false),
            new Tretja.Rekreacija(22, new Cas(16, 57), false),
            new Tretja.Rekreacija(28, new Cas(17, 1), false),
            new Tretja.SluzbenaPot(27, new Cas(17, 2), false),
            new Tretja.Malica(19, new Cas(17, 15), false),
            new Tretja.Rekreacija(32, new Cas(17, 17), true),
            new Tretja.SluzbenaPot(24, new Cas(17, 36), false),
            new Tretja.SluzbenaPot(1, new Cas(17, 39), true),
            new Tretja.Rekreacija(6, new Cas(17, 57), false),
            new Tretja.Rekreacija(26, new Cas(18, 1), true),
            new Tretja.SluzbenaPot(16, new Cas(18, 17), false),
            new Tretja.SluzbenaPot(1, new Cas(18, 32), false),
            new Tretja.Malica(38, new Cas(18, 35), false),
            new Tretja.Rekreacija(3, new Cas(18, 37), false),
            new Tretja.Malica(49, new Cas(18, 42), false),
            new Tretja.SluzbenaPot(15, new Cas(19, 12), false),
            new Tretja.Rekreacija(13, new Cas(19, 22), false),
            new Tretja.Malica(0, new Cas(19, 29), false),
            new Tretja.SluzbenaPot(18, new Cas(19, 30), false),
            new Tretja.SluzbenaPot(25, new Cas(19, 41), true),
            new Tretja.Malica(46, new Cas(19, 55), false),
            new Tretja.Rekreacija(48, new Cas(20, 21), false),
            new Tretja.SluzbenaPot(17, new Cas(20, 35), false),
            new Tretja.Rekreacija(14, new Cas(20, 38), false),
            new Tretja.Rekreacija(33, new Cas(20, 47), false),
            new Tretja.Rekreacija(2, new Cas(21, 0), false),
            new Tretja.Rekreacija(32, new Cas(21, 11), false),
            new Tretja.Rekreacija(7, new Cas(21, 13), false),
            new Tretja.Rekreacija(37, new Cas(21, 31), false),
            new Tretja.Rekreacija(26, new Cas(21, 49), false),
            new Tretja.Rekreacija(9, new Cas(21, 56), false),
            new Tretja.Malica(42, new Cas(22, 10), false),
            new Tretja.SluzbenaPot(25, new Cas(22, 28), false),
            new Tretja.Malica(4, new Cas(23, 28), false),
            new Tretja.Rekreacija(29, new Cas(23, 34), false),
            new Tretja.Malica(12, new Cas(23, 36), false),
            new Tretja.Rekreacija(43, new Cas(23, 54), false),
            new Tretja.Rekreacija(31, new Cas(23, 56), false),
        };

        int stZaposlenih = 50;
        Tretja.Dnevnik dnevnik = new Tretja.Dnevnik(stZaposlenih, dogodki);

        List<Cas> casi = new ArrayList<>();
        casi.add(new Cas(0, 35));
        casi.add(new Cas(0, 58));
        casi.add(new Cas(1, 4));
        casi.add(new Cas(4, 46));
        casi.add(new Cas(5, 15));
        casi.add(new Cas(5, 20));
        casi.add(new Cas(6, 5));
        casi.add(new Cas(6, 54));
        casi.add(new Cas(7, 14));
        casi.add(new Cas(8, 4));
        casi.add(new Cas(10, 22));
        casi.add(new Cas(10, 44));
        casi.add(new Cas(11, 51));
        casi.add(new Cas(12, 54));
        casi.add(new Cas(13, 1));
        casi.add(new Cas(13, 41));
        casi.add(new Cas(13, 46));
        casi.add(new Cas(15, 53));
        casi.add(new Cas(15, 55));
        casi.add(new Cas(17, 2));
        casi.add(new Cas(17, 27));
        casi.add(new Cas(18, 16));
        casi.add(new Cas(19, 4));
        casi.add(new Cas(19, 11));
        casi.add(new Cas(19, 35));
        casi.add(new Cas(21, 52));
        casi.add(new Cas(22, 41));
        casi.add(new Cas(22, 49));
        casi.add(new Cas(22, 54));
        casi.add(new Cas(23, 2));

        for (Cas cas: casi) {
            System.out.printf("%s -> %s%n", cas, Arrays.toString(dnevnik.prisotnost(cas)));
        }
    }
}
