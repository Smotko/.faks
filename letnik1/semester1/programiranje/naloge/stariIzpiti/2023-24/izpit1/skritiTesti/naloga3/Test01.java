
import java.util.*;

public class Test01 {

    public static void main(String[] args) {

        Tretja.Dogodek[] dogodki = {
            new Tretja.Rekreacija(1, new Cas(0, 53), true),
            new Tretja.SluzbenaPot(3, new Cas(1, 16), true),
            new Tretja.SluzbenaPot(3, new Cas(1, 35), false),
            new Tretja.Malica(2, new Cas(2, 41), true),
            new Tretja.Rekreacija(1, new Cas(3, 43), false),
            new Tretja.Malica(3, new Cas(5, 24), true),
            new Tretja.Malica(1, new Cas(5, 27), true),
            new Tretja.SluzbenaPot(0, new Cas(6, 1), true),
            new Tretja.Malica(2, new Cas(8, 10), false),
            new Tretja.SluzbenaPot(2, new Cas(9, 56), true),
            new Tretja.SluzbenaPot(0, new Cas(10, 11), false),
            new Tretja.Malica(3, new Cas(10, 57), false),
            new Tretja.Rekreacija(3, new Cas(11, 4), true),
            new Tretja.Malica(1, new Cas(11, 57), false),
            new Tretja.Rekreacija(1, new Cas(12, 21), true),
            new Tretja.Malica(0, new Cas(12, 51), true),
            new Tretja.Malica(0, new Cas(15, 37), false),
            new Tretja.Rekreacija(3, new Cas(18, 40), false),
            new Tretja.Rekreacija(1, new Cas(19, 32), false),
            new Tretja.SluzbenaPot(2, new Cas(20, 18), false),
        };

        int stZaposlenih = 4;
        Tretja.Dnevnik dnevnik = new Tretja.Dnevnik(stZaposlenih, dogodki);

        System.out.println(dnevnik.steviloMalicarjev());
        System.out.println();
    }
}
