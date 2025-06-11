
import java.util.*;

public class Test25 {

    public static void main(String[] args) {
        Tretja.Poniz poniz1 = new Tretja.Poniz(new char[]{'O', '9', '_', 'E', '6', 'r', 'w', 'j', 'w', 'z', 'l', 'a', 'J', 'e', 'G', 'X', 'h', 'M', '7', 'N', 'r', 'e', '1', 't', 'e'}, new int[]{13, 6, 17, 18, 19, 9, 9, 19, 10, 7, 11, 2, 14, 1, 12, 3, 1, 13, 9, 6, 11, 7, 1, 6, 4});
        Tretja.Poniz poniz2 = new Tretja.Poniz(new char[]{'E', 'H', 'Q', 'i', '7', 'Z', 'V', 'u', 'Q', 'R', 'j', 'p', 'v', '6', '3', 'k', '4', 'a', 'C', '9', 'P', 'Y', '2', 'O', 'P'}, new int[]{3, 11, 5, 5, 19, 12, 9, 3, 5, 14, 17, 1, 8, 7, 7, 18, 6, 15, 4, 20, 16, 3, 5, 5, 20});
        System.out.printf("<%s>%n", poniz1.vNiz());
        System.out.printf("<%s>%n", poniz2.vNiz());
    }
}
