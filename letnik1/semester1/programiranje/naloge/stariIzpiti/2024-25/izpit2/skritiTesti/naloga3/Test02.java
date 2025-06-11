
import java.util.*;

public class Test02 {

    public static void main(String[] args) {
        Tretja.Poniz poniz1 = new Tretja.Poniz(new char[]{'x', 'n'}, new int[]{15, 10});
        Tretja.Poniz poniz2 = new Tretja.Poniz(new char[]{'0', 't'}, new int[]{17, 12});
        System.out.printf("<%s>%n", poniz1.vNiz());
        System.out.printf("<%s>%n", poniz2.vNiz());
    }
}
