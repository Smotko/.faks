
import java.util.*;

public class Test05 {

    public static void main(String[] args) {
        Tretja.Poniz poniz1 = new Tretja.Poniz(new char[]{'d', '3', 'd', '_', 'f', 'T', 'o', '6', '9', 'W', 'Q', 'W', 'C', 'N', 'u', 'a', 'j', 'G', '0', 'D', '1', 'P', 'w', 'F', 'G', 'I', 'V', 'X', '5', '9'}, new int[]{16, 17, 19, 8, 1, 16, 15, 14, 3, 13, 6, 13, 20, 17, 4, 20, 4, 11, 18, 15, 20, 4, 12, 19, 13, 18, 1, 5, 7, 6});
        Tretja.Poniz poniz2 = new Tretja.Poniz(new char[]{'x', 'K', 'w', '9', 'c', 'E', '1', 'X', 'u', '2', 'M', 'j', '4', 'B', 'V', 's', 'E', 'Y', 'y', '6', 'j', '2', 'n', 'Q', 'L', 'o', 'x', 'P', '0', '1'}, new int[]{16, 7, 6, 5, 17, 7, 12, 19, 6, 17, 2, 10, 6, 14, 4, 5, 1, 1, 7, 5, 20, 14, 17, 4, 13, 3, 17, 5, 3, 16});
        System.out.printf("<%s>%n", poniz1.vNiz());
        System.out.printf("<%s>%n", poniz2.vNiz());
    }
}
