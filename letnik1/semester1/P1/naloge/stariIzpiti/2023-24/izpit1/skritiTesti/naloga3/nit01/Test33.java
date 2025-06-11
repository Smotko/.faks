
import java.util.*;

public class Test33 {

    public static void main(String[] args) {

        Tretja.Dogodek[] dogodki = {
            new Tretja.Rekreacija(0, new Cas(0, 17), true),
            new Tretja.SluzbenaPot(3, new Cas(0, 27), true),
            new Tretja.Rekreacija(0, new Cas(0, 33), false),
            new Tretja.SluzbenaPot(2, new Cas(0, 40), true),
            new Tretja.Malica(0, new Cas(0, 44), true),
            new Tretja.SluzbenaPot(2, new Cas(0, 49), false),
            new Tretja.Rekreacija(1, new Cas(1, 36), true),
            new Tretja.Rekreacija(2, new Cas(1, 59), true),
            new Tretja.Malica(0, new Cas(2, 12), false),
            new Tretja.Rekreacija(0, new Cas(3, 7), true),
            new Tretja.SluzbenaPot(3, new Cas(3, 32), false),
            new Tretja.SluzbenaPot(3, new Cas(3, 37), true),
            new Tretja.SluzbenaPot(3, new Cas(3, 45), false),
            new Tretja.Rekreacija(3, new Cas(4, 39), true),
            new Tretja.Rekreacija(1, new Cas(5, 17), false),
            new Tretja.SluzbenaPot(1, new Cas(6, 30), true),
            new Tretja.SluzbenaPot(1, new Cas(7, 50), false),
            new Tretja.Rekreacija(3, new Cas(8, 7), false),
            new Tretja.Rekreacija(1, new Cas(8, 13), true),
            new Tretja.SluzbenaPot(3, new Cas(8, 52), true),
            new Tretja.SluzbenaPot(3, new Cas(9, 4), false),
            new Tretja.Rekreacija(3, new Cas(9, 44), true),
            new Tretja.Rekreacija(1, new Cas(10, 13), false),
            new Tretja.SluzbenaPot(1, new Cas(10, 31), true),
            new Tretja.SluzbenaPot(1, new Cas(10, 39), false),
            new Tretja.Rekreacija(1, new Cas(10, 59), true),
            new Tretja.Rekreacija(3, new Cas(11, 31), false),
            new Tretja.Rekreacija(3, new Cas(13, 3), true),
            new Tretja.Rekreacija(0, new Cas(14, 3), false),
            new Tretja.Rekreacija(0, new Cas(14, 28), true),
            new Tretja.Rekreacija(3, new Cas(14, 40), false),
            new Tretja.Rekreacija(0, new Cas(14, 47), false),
            new Tretja.Rekreacija(0, new Cas(15, 13), true),
            new Tretja.Malica(3, new Cas(15, 45), true),
            new Tretja.Rekreacija(1, new Cas(16, 34), false),
            new Tretja.SluzbenaPot(1, new Cas(16, 56), true),
            new Tretja.Rekreacija(2, new Cas(19, 17), false),
            new Tretja.SluzbenaPot(1, new Cas(19, 57), false),
            new Tretja.Rekreacija(1, new Cas(19, 58), true),
            new Tretja.Rekreacija(1, new Cas(20, 14), false),
            new Tretja.SluzbenaPot(2, new Cas(20, 31), true),
            new Tretja.SluzbenaPot(1, new Cas(20, 32), true),
            new Tretja.SluzbenaPot(2, new Cas(20, 42), false),
            new Tretja.SluzbenaPot(1, new Cas(20, 54), false),
            new Tretja.SluzbenaPot(2, new Cas(21, 5), true),
            new Tretja.Rekreacija(1, new Cas(21, 19), true),
            new Tretja.SluzbenaPot(2, new Cas(21, 33), false),
            new Tretja.Malica(2, new Cas(21, 49), true),
            new Tretja.Malica(2, new Cas(21, 51), false),
            new Tretja.Rekreacija(1, new Cas(22, 24), false),
            new Tretja.Rekreacija(1, new Cas(22, 41), true),
            new Tretja.Malica(3, new Cas(23, 2), false),
            new Tretja.Rekreacija(0, new Cas(23, 26), false),
            new Tretja.Rekreacija(1, new Cas(23, 36), false),
        };

        int stZaposlenih = 4;
        Tretja.Dnevnik dnevnik = new Tretja.Dnevnik(stZaposlenih, dogodki);

        for (int i = 0; i < stZaposlenih; i++) {
            System.out.printf("%d -> %d%n", i, dnevnik.kolikoRekreacije(i));
        }
        System.out.println();
    }
}
