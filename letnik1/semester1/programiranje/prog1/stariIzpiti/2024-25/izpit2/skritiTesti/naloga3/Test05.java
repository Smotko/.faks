
import java.util.*;

public class Test05 {

    public static void main(String[] args) {
        Tretja.Poniz poniz1 = new Tretja.Poniz(new char[]{'V', '1', 'h', 'a', 'M'}, new int[]{19, 16, 9, 8, 7});
        Tretja.Poniz poniz2 = new Tretja.Poniz(new char[]{'z', 'X', '1', 'K', 'g'}, new int[]{1, 10, 13, 16, 14});
        System.out.printf("<%s>%n", poniz1.vNiz());
        System.out.printf("<%s>%n", poniz2.vNiz());
    }
}
