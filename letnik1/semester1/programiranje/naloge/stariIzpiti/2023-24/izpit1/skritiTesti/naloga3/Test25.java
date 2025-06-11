
import java.util.*;

public class Test25 {

    public static void main(String[] args) {

        Tretja.Dogodek[] dogodki = {
            new Tretja.Rekreacija(3, new Cas(2, 57), true),
            new Tretja.SluzbenaPot(2, new Cas(3, 19), true),
            new Tretja.Malica(5, new Cas(3, 52), true),
            new Tretja.Malica(1, new Cas(4, 16), true),
            new Tretja.SluzbenaPot(2, new Cas(5, 29), false),
            new Tretja.Malica(0, new Cas(5, 56), true),
            new Tretja.SluzbenaPot(2, new Cas(6, 16), true),
            new Tretja.SluzbenaPot(4, new Cas(6, 43), true),
            new Tretja.Malica(0, new Cas(8, 58), false),
            new Tretja.Malica(5, new Cas(9, 12), false),
            new Tretja.Rekreacija(0, new Cas(9, 53), true),
            new Tretja.Rekreacija(0, new Cas(10, 36), false),
            new Tretja.Rekreacija(5, new Cas(10, 55), true),
            new Tretja.SluzbenaPot(0, new Cas(11, 21), true),
            new Tretja.SluzbenaPot(2, new Cas(11, 51), false),
            new Tretja.Rekreacija(2, new Cas(12, 56), true),
            new Tretja.Malica(1, new Cas(13, 39), false),
            new Tretja.SluzbenaPot(1, new Cas(14, 3), true),
            new Tretja.SluzbenaPot(4, new Cas(15, 25), false),
            new Tretja.SluzbenaPot(1, new Cas(15, 51), false),
            new Tretja.Rekreacija(4, new Cas(15, 55), true),
            new Tretja.SluzbenaPot(1, new Cas(15, 58), true),
            new Tretja.Rekreacija(5, new Cas(17, 56), false),
            new Tretja.Rekreacija(4, new Cas(19, 37), false),
            new Tretja.Rekreacija(2, new Cas(19, 52), false),
            new Tretja.SluzbenaPot(5, new Cas(20, 10), true),
            new Tretja.SluzbenaPot(1, new Cas(22, 3), false),
            new Tretja.SluzbenaPot(0, new Cas(22, 53), false),
            new Tretja.SluzbenaPot(5, new Cas(23, 28), false),
            new Tretja.Rekreacija(3, new Cas(23, 44), false),
        };

        int stZaposlenih = 6;
        Tretja.Dnevnik dnevnik = new Tretja.Dnevnik(stZaposlenih, dogodki);

        for (int i = 0; i < stZaposlenih; i++) {
            System.out.printf("%d -> %d%n", i, dnevnik.kolikoRekreacije(i));
        }
        System.out.println();
    }
}
