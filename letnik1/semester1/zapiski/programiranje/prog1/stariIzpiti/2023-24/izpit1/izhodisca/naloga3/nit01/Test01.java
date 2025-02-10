
import java.util.*;

public class Test01 {

    public static void main(String[] args) {
        Tretja.Dogodek[] dogodki = {
            new Tretja.Rekreacija(3, new Cas(7, 0), true),
            new Tretja.Rekreacija(6, new Cas(7, 30), true),
            new Tretja.Rekreacija(3, new Cas(8, 0), false),
            new Tretja.Rekreacija(6, new Cas(8, 20), false),
            new Tretja.SluzbenaPot(1, new Cas(8, 20), true),
            new Tretja.SluzbenaPot(2, new Cas(8, 40), true),
            new Tretja.Rekreacija(3, new Cas(11, 20), true),
            new Tretja.Malica(0, new Cas(11, 30), true),
            new Tretja.Malica(4, new Cas(11, 30), true),
            new Tretja.Rekreacija(3, new Cas(11, 40), false),
            new Tretja.SluzbenaPot(2, new Cas(11, 50), false),
            new Tretja.Malica(4, new Cas(12, 0), false),
            new Tretja.Malica(0, new Cas(12, 10), false),
            new Tretja.Rekreacija(6, new Cas(13, 30), true),
            new Tretja.Rekreacija(6, new Cas(13, 50), false),
            new Tretja.Rekreacija(6, new Cas(14, 0), true),
            new Tretja.SluzbenaPot(1, new Cas(14, 10), false),
            new Tretja.Malica(5, new Cas(14, 10), true),
            new Tretja.Malica(5, new Cas(14, 30), false),
            new Tretja.Rekreacija(6, new Cas(14, 50), false),
        };

        int stZaposlenih = 7;
        Tretja.Dnevnik dnevnik = new Tretja.Dnevnik(stZaposlenih, dogodki);

        System.out.println(dnevnik.steviloMalicarjev());
    }
}
