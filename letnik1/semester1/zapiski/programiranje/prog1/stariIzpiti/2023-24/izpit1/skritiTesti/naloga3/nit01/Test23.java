
import java.util.*;

public class Test23 {

    public static void main(String[] args) {

        Tretja.Dogodek[] dogodki = {
            new Tretja.SluzbenaPot(17, new Cas(0, 29), true),
            new Tretja.Malica(12, new Cas(2, 6), true),
            new Tretja.Malica(24, new Cas(2, 35), true),
            new Tretja.Rekreacija(5, new Cas(2, 39), true),
            new Tretja.Rekreacija(10, new Cas(3, 1), true),
            new Tretja.SluzbenaPot(4, new Cas(3, 3), true),
            new Tretja.Malica(21, new Cas(3, 7), true),
            new Tretja.Rekreacija(22, new Cas(3, 15), true),
            new Tretja.Malica(14, new Cas(3, 48), true),
            new Tretja.SluzbenaPot(17, new Cas(3, 56), false),
            new Tretja.SluzbenaPot(18, new Cas(4, 4), true),
            new Tretja.Rekreacija(17, new Cas(4, 14), true),
            new Tretja.Malica(23, new Cas(4, 26), true),
            new Tretja.Malica(0, new Cas(4, 36), true),
            new Tretja.SluzbenaPot(11, new Cas(4, 44), true),
            new Tretja.SluzbenaPot(7, new Cas(5, 1), true),
            new Tretja.SluzbenaPot(7, new Cas(5, 2), false),
            new Tretja.Malica(2, new Cas(5, 59), true),
            new Tretja.Malica(7, new Cas(6, 16), true),
            new Tretja.Rekreacija(9, new Cas(6, 17), true),
            new Tretja.Rekreacija(1, new Cas(6, 25), true),
            new Tretja.SluzbenaPot(4, new Cas(6, 40), false),
            new Tretja.SluzbenaPot(6, new Cas(6, 47), true),
            new Tretja.Malica(20, new Cas(6, 55), true),
            new Tretja.Malica(3, new Cas(6, 57), true),
            new Tretja.Malica(24, new Cas(6, 58), false),
            new Tretja.Malica(16, new Cas(7, 35), true),
            new Tretja.SluzbenaPot(13, new Cas(7, 58), true),
            new Tretja.SluzbenaPot(25, new Cas(8, 2), true),
            new Tretja.SluzbenaPot(19, new Cas(9, 0), true),
            new Tretja.SluzbenaPot(19, new Cas(9, 6), false),
            new Tretja.SluzbenaPot(8, new Cas(9, 30), true),
            new Tretja.Malica(23, new Cas(9, 31), false),
            new Tretja.SluzbenaPot(24, new Cas(9, 34), true),
            new Tretja.Malica(12, new Cas(9, 48), false),
            new Tretja.Malica(3, new Cas(9, 57), false),
            new Tretja.Rekreacija(1, new Cas(10, 14), false),
            new Tretja.Malica(14, new Cas(10, 30), false),
            new Tretja.Malica(20, new Cas(10, 33), false),
            new Tretja.Malica(19, new Cas(10, 37), true),
            new Tretja.SluzbenaPot(8, new Cas(10, 40), false),
            new Tretja.SluzbenaPot(20, new Cas(11, 31), true),
            new Tretja.Malica(8, new Cas(11, 53), true),
            new Tretja.Rekreacija(4, new Cas(12, 29), true),
            new Tretja.Rekreacija(5, new Cas(12, 50), false),
            new Tretja.Rekreacija(4, new Cas(13, 38), false),
            new Tretja.SluzbenaPot(6, new Cas(14, 19), false),
            new Tretja.SluzbenaPot(18, new Cas(15, 16), false),
            new Tretja.SluzbenaPot(20, new Cas(15, 21), false),
            new Tretja.Rekreacija(9, new Cas(16, 14), false),
            new Tretja.Malica(16, new Cas(16, 26), false),
            new Tretja.Malica(19, new Cas(16, 53), false),
            new Tretja.Rekreacija(23, new Cas(17, 2), true),
            new Tretja.Rekreacija(10, new Cas(17, 7), false),
            new Tretja.SluzbenaPot(15, new Cas(17, 10), true),
            new Tretja.SluzbenaPot(25, new Cas(17, 20), false),
            new Tretja.Rekreacija(19, new Cas(17, 29), true),
            new Tretja.Malica(21, new Cas(17, 39), false),
            new Tretja.SluzbenaPot(11, new Cas(18, 4), false),
            new Tretja.Rekreacija(17, new Cas(18, 17), false),
            new Tretja.SluzbenaPot(1, new Cas(18, 40), true),
            new Tretja.Rekreacija(23, new Cas(18, 49), false),
            new Tretja.Malica(2, new Cas(19, 7), false),
            new Tretja.Rekreacija(19, new Cas(19, 13), false),
            new Tretja.SluzbenaPot(24, new Cas(19, 31), false),
            new Tretja.Malica(7, new Cas(19, 45), false),
            new Tretja.Rekreacija(22, new Cas(19, 50), false),
            new Tretja.Rekreacija(19, new Cas(20, 20), true),
            new Tretja.SluzbenaPot(15, new Cas(20, 25), false),
            new Tretja.Rekreacija(19, new Cas(20, 25), false),
            new Tretja.SluzbenaPot(1, new Cas(20, 44), false),
            new Tretja.Malica(8, new Cas(21, 13), false),
            new Tretja.Rekreacija(20, new Cas(21, 15), true),
            new Tretja.Malica(0, new Cas(21, 32), false),
            new Tretja.Rekreacija(20, new Cas(22, 23), false),
            new Tretja.SluzbenaPot(13, new Cas(23, 13), false),
        };

        int stZaposlenih = 26;
        Tretja.Dnevnik dnevnik = new Tretja.Dnevnik(stZaposlenih, dogodki);

        for (int i = 0; i < stZaposlenih; i++) {
            System.out.printf("%d -> %d%n", i, dnevnik.kolikoRekreacije(i));
        }
        System.out.println();
    }
}
