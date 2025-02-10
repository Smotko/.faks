
import java.util.*;

public class Test10 {

    public static void main(String[] args) {
        Tretja.Poniz poniz1 = new Tretja.Poniz(new char[]{'1', 'P', 'w', 'F', 'G', 'I', 'V', 'X', '5', '9'}, new int[]{10, 12, 9, 12, 2, 7, 14, 18, 4, 2});
        Tretja.Poniz poniz2 = new Tretja.Poniz(new char[]{'D', 'z', 'T', 'L', 'a', 'H', 'J', 'A', 'w', '0'}, new int[]{16, 7, 6, 5, 17, 7, 12, 19, 6, 17});
        System.out.printf("<%s>%n", poniz1.vNiz());
        System.out.printf("<%s>%n", poniz2.vNiz());
    }
}
