
import java.util.*;

public class Test03 {

    public static void main(String[] args) {
        Tretja.Poniz poniz1 = new Tretja.Poniz(new char[]{'q', 'S', 'W', 'E', 'f', 'Z', 'v', '0', 'z', '2', '6', '5'}, new int[]{14, 5, 14, 5, 2, 1, 9, 10, 2, 9, 9, 16});
        Tretja.Poniz poniz2 = new Tretja.Poniz(new char[]{'1', 'h', 'a', 'M', 'B', '6', 'T', 'o', '3', 'Y', '9', 'e'}, new int[]{13, 3, 10, 5, 4, 14, 19, 16, 9, 8, 7, 11});
        System.out.printf("<%s>%n", poniz1.vNiz());
        System.out.printf("<%s>%n", poniz2.vNiz());
    }
}
