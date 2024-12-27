
import java.util.*;

public class Test46 {

    public static void main(String[] args) {

        Tretja.Dogodek[] dogodki = {
            new Tretja.Rekreacija(8, new Cas(0, 1), true),
            new Tretja.Rekreacija(15, new Cas(0, 13), true),
            new Tretja.Rekreacija(8, new Cas(0, 25), false),
            new Tretja.SluzbenaPot(17, new Cas(0, 33), true),
            new Tretja.Rekreacija(12, new Cas(0, 35), true),
            new Tretja.SluzbenaPot(7, new Cas(0, 42), true),
            new Tretja.Rekreacija(9, new Cas(0, 48), true),
            new Tretja.Rekreacija(4, new Cas(0, 52), true),
            new Tretja.Rekreacija(4, new Cas(1, 19), false),
            new Tretja.Malica(2, new Cas(1, 22), true),
            new Tretja.Rekreacija(16, new Cas(1, 22), true),
            new Tretja.Rekreacija(0, new Cas(1, 24), true),
            new Tretja.Malica(10, new Cas(1, 40), true),
            new Tretja.Malica(13, new Cas(1, 45), true),
            new Tretja.Rekreacija(9, new Cas(1, 46), false),
            new Tretja.SluzbenaPot(1, new Cas(1, 56), true),
            new Tretja.Malica(13, new Cas(2, 10), false),
            new Tretja.SluzbenaPot(13, new Cas(2, 12), true),
            new Tretja.Rekreacija(14, new Cas(2, 24), true),
            new Tretja.SluzbenaPot(9, new Cas(2, 30), true),
            new Tretja.SluzbenaPot(5, new Cas(2, 43), true),
            new Tretja.Rekreacija(11, new Cas(2, 46), true),
            new Tretja.Rekreacija(4, new Cas(2, 46), true),
            new Tretja.SluzbenaPot(13, new Cas(2, 46), false),
            new Tretja.SluzbenaPot(8, new Cas(2, 46), true),
            new Tretja.SluzbenaPot(6, new Cas(2, 51), true),
            new Tretja.Rekreacija(4, new Cas(2, 58), false),
            new Tretja.SluzbenaPot(3, new Cas(3, 21), true),
            new Tretja.Rekreacija(15, new Cas(3, 22), false),
            new Tretja.SluzbenaPot(15, new Cas(3, 30), true),
            new Tretja.SluzbenaPot(4, new Cas(3, 31), true),
            new Tretja.SluzbenaPot(6, new Cas(3, 44), false),
            new Tretja.Malica(2, new Cas(3, 47), false),
            new Tretja.SluzbenaPot(18, new Cas(3, 49), true),
            new Tretja.SluzbenaPot(6, new Cas(3, 54), true),
            new Tretja.SluzbenaPot(13, new Cas(3, 57), true),
            new Tretja.Rekreacija(16, new Cas(3, 59), false),
            new Tretja.SluzbenaPot(6, new Cas(4, 3), false),
            new Tretja.SluzbenaPot(7, new Cas(4, 12), false),
            new Tretja.Malica(16, new Cas(4, 29), true),
            new Tretja.SluzbenaPot(7, new Cas(4, 48), true),
            new Tretja.Rekreacija(6, new Cas(5, 0), true),
            new Tretja.Rekreacija(2, new Cas(5, 3), true),
            new Tretja.SluzbenaPot(8, new Cas(5, 4), false),
            new Tretja.Rekreacija(6, new Cas(5, 13), false),
            new Tretja.SluzbenaPot(9, new Cas(5, 18), false),
            new Tretja.Rekreacija(2, new Cas(5, 22), false),
            new Tretja.SluzbenaPot(8, new Cas(5, 28), true),
            new Tretja.SluzbenaPot(6, new Cas(5, 34), true),
            new Tretja.SluzbenaPot(13, new Cas(5, 34), false),
            new Tretja.Rekreacija(9, new Cas(5, 35), true),
            new Tretja.SluzbenaPot(2, new Cas(5, 42), true),
            new Tretja.SluzbenaPot(2, new Cas(6, 5), false),
            new Tretja.SluzbenaPot(13, new Cas(6, 11), true),
            new Tretja.SluzbenaPot(18, new Cas(6, 12), false),
            new Tretja.SluzbenaPot(17, new Cas(6, 23), false),
            new Tretja.Rekreacija(17, new Cas(6, 32), true),
            new Tretja.Malica(10, new Cas(6, 52), false),
            new Tretja.SluzbenaPot(5, new Cas(6, 54), false),
            new Tretja.SluzbenaPot(2, new Cas(6, 55), true),
            new Tretja.Rekreacija(18, new Cas(7, 24), true),
            new Tretja.Rekreacija(5, new Cas(7, 26), true),
            new Tretja.SluzbenaPot(8, new Cas(7, 27), false),
            new Tretja.SluzbenaPot(2, new Cas(7, 29), false),
            new Tretja.SluzbenaPot(4, new Cas(7, 33), false),
            new Tretja.SluzbenaPot(4, new Cas(7, 43), true),
            new Tretja.SluzbenaPot(4, new Cas(7, 47), false),
            new Tretja.SluzbenaPot(2, new Cas(7, 53), true),
            new Tretja.SluzbenaPot(10, new Cas(7, 53), true),
            new Tretja.SluzbenaPot(6, new Cas(8, 7), false),
            new Tretja.Rekreacija(18, new Cas(8, 19), false),
            new Tretja.SluzbenaPot(8, new Cas(8, 21), true),
            new Tretja.Rekreacija(4, new Cas(8, 33), true),
            new Tretja.Rekreacija(18, new Cas(8, 34), true),
            new Tretja.SluzbenaPot(1, new Cas(8, 35), false),
            new Tretja.SluzbenaPot(1, new Cas(8, 42), true),
            new Tretja.Rekreacija(6, new Cas(8, 43), true),
            new Tretja.Rekreacija(11, new Cas(8, 48), false),
            new Tretja.Rekreacija(6, new Cas(9, 10), false),
            new Tretja.Rekreacija(17, new Cas(9, 12), false),
            new Tretja.Rekreacija(4, new Cas(9, 13), false),
            new Tretja.SluzbenaPot(1, new Cas(9, 14), false),
            new Tretja.Rekreacija(17, new Cas(9, 18), true),
            new Tretja.Rekreacija(1, new Cas(9, 21), true),
            new Tretja.SluzbenaPot(3, new Cas(9, 28), false),
            new Tretja.Rekreacija(18, new Cas(9, 34), false),
            new Tretja.SluzbenaPot(4, new Cas(9, 40), true),
            new Tretja.SluzbenaPot(18, new Cas(9, 42), true),
            new Tretja.SluzbenaPot(13, new Cas(9, 48), false),
            new Tretja.SluzbenaPot(10, new Cas(10, 2), false),
            new Tretja.Rekreacija(14, new Cas(10, 9), false),
            new Tretja.SluzbenaPot(6, new Cas(10, 13), true),
            new Tretja.SluzbenaPot(4, new Cas(10, 24), false),
            new Tretja.SluzbenaPot(11, new Cas(10, 28), true),
            new Tretja.Rekreacija(10, new Cas(10, 32), true),
            new Tretja.SluzbenaPot(13, new Cas(10, 34), true),
            new Tretja.Rekreacija(3, new Cas(10, 47), true),
            new Tretja.SluzbenaPot(18, new Cas(10, 52), false),
            new Tretja.Malica(18, new Cas(11, 8), true),
            new Tretja.Malica(4, new Cas(11, 9), true),
            new Tretja.SluzbenaPot(13, new Cas(11, 15), false),
            new Tretja.SluzbenaPot(6, new Cas(11, 17), false),
            new Tretja.Rekreacija(9, new Cas(11, 25), false),
            new Tretja.Rekreacija(9, new Cas(11, 26), true),
            new Tretja.SluzbenaPot(13, new Cas(11, 43), true),
            new Tretja.SluzbenaPot(13, new Cas(11, 44), false),
            new Tretja.Rekreacija(1, new Cas(11, 54), false),
            new Tretja.SluzbenaPot(14, new Cas(12, 0), true),
            new Tretja.Rekreacija(6, new Cas(12, 6), true),
            new Tretja.Malica(18, new Cas(12, 14), false),
            new Tretja.Rekreacija(1, new Cas(12, 33), true),
            new Tretja.SluzbenaPot(8, new Cas(12, 34), false),
            new Tretja.SluzbenaPot(18, new Cas(12, 52), true),
            new Tretja.SluzbenaPot(7, new Cas(12, 58), false),
            new Tretja.Rekreacija(10, new Cas(13, 0), false),
            new Tretja.Malica(4, new Cas(13, 4), false),
            new Tretja.Rekreacija(10, new Cas(13, 8), true),
            new Tretja.Rekreacija(13, new Cas(13, 14), true),
            new Tretja.Malica(8, new Cas(13, 18), true),
            new Tretja.SluzbenaPot(7, new Cas(13, 42), true),
            new Tretja.SluzbenaPot(18, new Cas(13, 56), false),
            new Tretja.Rekreacija(18, new Cas(14, 6), true),
            new Tretja.SluzbenaPot(4, new Cas(14, 41), true),
            new Tretja.Rekreacija(6, new Cas(14, 45), false),
            new Tretja.SluzbenaPot(6, new Cas(15, 10), true),
            new Tretja.SluzbenaPot(7, new Cas(15, 20), false),
            new Tretja.Rekreacija(9, new Cas(15, 38), false),
            new Tretja.Rekreacija(9, new Cas(15, 39), true),
            new Tretja.SluzbenaPot(7, new Cas(15, 47), true),
            new Tretja.SluzbenaPot(6, new Cas(16, 6), false),
            new Tretja.SluzbenaPot(7, new Cas(16, 18), false),
            new Tretja.Malica(6, new Cas(16, 30), true),
            new Tretja.Rekreacija(9, new Cas(16, 31), false),
            new Tretja.Malica(7, new Cas(16, 31), true),
            new Tretja.Rekreacija(10, new Cas(16, 36), false),
            new Tretja.Rekreacija(5, new Cas(16, 49), false),
            new Tretja.SluzbenaPot(15, new Cas(16, 57), false),
            new Tretja.SluzbenaPot(5, new Cas(17, 1), true),
            new Tretja.Rekreacija(9, new Cas(17, 16), true),
            new Tretja.SluzbenaPot(10, new Cas(17, 34), true),
            new Tretja.Malica(8, new Cas(17, 37), false),
            new Tretja.SluzbenaPot(8, new Cas(17, 50), true),
            new Tretja.SluzbenaPot(15, new Cas(17, 52), true),
            new Tretja.Malica(6, new Cas(18, 0), false),
            new Tretja.SluzbenaPot(6, new Cas(18, 4), true),
            new Tretja.Rekreacija(3, new Cas(18, 12), false),
            new Tretja.Malica(3, new Cas(18, 25), true),
            new Tretja.Malica(7, new Cas(18, 36), false),
            new Tretja.SluzbenaPot(15, new Cas(19, 13), false),
            new Tretja.Malica(3, new Cas(19, 15), false),
            new Tretja.SluzbenaPot(4, new Cas(19, 19), false),
            new Tretja.Rekreacija(3, new Cas(19, 20), true),
            new Tretja.SluzbenaPot(4, new Cas(19, 31), true),
            new Tretja.Rekreacija(9, new Cas(19, 33), false),
            new Tretja.Malica(15, new Cas(19, 34), true),
            new Tretja.Rekreacija(7, new Cas(19, 35), true),
            new Tretja.SluzbenaPot(6, new Cas(19, 44), false),
            new Tretja.Rekreacija(9, new Cas(19, 48), true),
            new Tretja.SluzbenaPot(4, new Cas(20, 6), false),
            new Tretja.Rekreacija(1, new Cas(20, 9), false),
            new Tretja.Rekreacija(9, new Cas(20, 12), false),
            new Tretja.Rekreacija(17, new Cas(20, 15), false),
            new Tretja.SluzbenaPot(10, new Cas(20, 16), false),
            new Tretja.SluzbenaPot(6, new Cas(20, 18), true),
            new Tretja.Rekreacija(4, new Cas(20, 22), true),
            new Tretja.Rekreacija(7, new Cas(20, 26), false),
            new Tretja.SluzbenaPot(7, new Cas(21, 0), true),
            new Tretja.Rekreacija(18, new Cas(21, 2), false),
            new Tretja.SluzbenaPot(6, new Cas(21, 5), false),
            new Tretja.SluzbenaPot(5, new Cas(21, 5), false),
            new Tretja.SluzbenaPot(17, new Cas(21, 7), true),
            new Tretja.Rekreacija(10, new Cas(21, 7), true),
            new Tretja.SluzbenaPot(11, new Cas(21, 19), false),
            new Tretja.Malica(16, new Cas(21, 23), false),
            new Tretja.SluzbenaPot(6, new Cas(21, 25), true),
            new Tretja.SluzbenaPot(5, new Cas(21, 26), true),
            new Tretja.Rekreacija(18, new Cas(21, 32), true),
            new Tretja.Rekreacija(9, new Cas(21, 41), true),
            new Tretja.Rekreacija(0, new Cas(21, 44), false),
            new Tretja.SluzbenaPot(2, new Cas(21, 51), false),
            new Tretja.SluzbenaPot(8, new Cas(21, 57), false),
            new Tretja.Rekreacija(3, new Cas(22, 0), false),
            new Tretja.Rekreacija(10, new Cas(22, 11), false),
            new Tretja.Rekreacija(12, new Cas(22, 27), false),
            new Tretja.SluzbenaPot(2, new Cas(22, 29), true),
            new Tretja.SluzbenaPot(14, new Cas(22, 30), false),
            new Tretja.Malica(1, new Cas(22, 30), true),
            new Tretja.Rekreacija(18, new Cas(22, 32), false),
            new Tretja.Rekreacija(9, new Cas(22, 37), false),
            new Tretja.SluzbenaPot(17, new Cas(22, 38), false),
            new Tretja.Malica(1, new Cas(22, 41), false),
            new Tretja.SluzbenaPot(2, new Cas(22, 41), false),
            new Tretja.Rekreacija(13, new Cas(23, 9), false),
            new Tretja.SluzbenaPot(5, new Cas(23, 14), false),
            new Tretja.Rekreacija(4, new Cas(23, 18), false),
            new Tretja.Malica(15, new Cas(23, 21), false),
            new Tretja.SluzbenaPot(6, new Cas(23, 31), false),
            new Tretja.SluzbenaPot(7, new Cas(23, 36), false),
        };

        int stZaposlenih = 19;
        Tretja.Dnevnik dnevnik = new Tretja.Dnevnik(stZaposlenih, dogodki);

        List<Cas> casi = new ArrayList<>();
        casi.add(new Cas(0, 6));
        casi.add(new Cas(0, 31));
        casi.add(new Cas(2, 45));
        casi.add(new Cas(6, 12));
        casi.add(new Cas(6, 44));
        casi.add(new Cas(7, 59));
        casi.add(new Cas(8, 2));
        casi.add(new Cas(8, 5));
        casi.add(new Cas(8, 51));
        casi.add(new Cas(9, 13));
        casi.add(new Cas(11, 32));
        casi.add(new Cas(11, 35));
        casi.add(new Cas(11, 40));
        casi.add(new Cas(12, 30));
        casi.add(new Cas(13, 21));
        casi.add(new Cas(14, 39));
        casi.add(new Cas(15, 30));
        casi.add(new Cas(15, 50));
        casi.add(new Cas(16, 19));
        casi.add(new Cas(16, 46));
        casi.add(new Cas(17, 27));
        casi.add(new Cas(18, 43));
        casi.add(new Cas(19, 10));
        casi.add(new Cas(19, 50));
        casi.add(new Cas(20, 7));
        casi.add(new Cas(21, 45));
        casi.add(new Cas(21, 51));
        casi.add(new Cas(22, 51));
        casi.add(new Cas(22, 59));
        casi.add(new Cas(23, 57));

        for (Cas cas: casi) {
            System.out.printf("%s -> %s%n", cas, Arrays.toString(dnevnik.prisotnost(cas)));
        }
    }
}
