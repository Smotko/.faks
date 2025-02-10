
import java.util.*;

public class Test24 {

    public static void main(String[] args) {
        Tretja.Poniz poniz1 = new Tretja.Poniz(new char[]{'B', '1', 'y', '8', 'B', 'L', 'd', 'L', 'D', 'V', 'G', 'q', 'D', 'p', 'W', 'X', 'e', 'o', 'z', '3', 'n', 'd', 'D', 'W'}, new int[]{2, 16, 19, 8, 9, 20, 2, 1, 12, 3, 16, 11, 12, 5, 5, 5, 8, 11, 7, 16, 11, 11, 13, 4});
        Tretja.Poniz poniz2 = new Tretja.Poniz(new char[]{'A', 'u', 'v', 'U', 'g', 'K', 'R', '3', '_', 'W', 'A', 'K', 'H', 'A', 'b', '3', 'L', 'D', 'k', 'W', 'G', 'F', '8', 'i'}, new int[]{2, 2, 11, 4, 15, 10, 18, 14, 9, 19, 13, 3, 4, 5, 20, 14, 10, 7, 5, 19, 6, 6, 16, 1});
        System.out.printf("<%s>%n", poniz1.vNiz());
        System.out.printf("<%s>%n", poniz2.vNiz());
    }
}
