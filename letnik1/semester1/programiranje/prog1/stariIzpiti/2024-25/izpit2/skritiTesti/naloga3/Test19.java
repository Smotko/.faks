
import java.util.*;

public class Test19 {

    public static void main(String[] args) {
        Tretja.Poniz poniz1 = new Tretja.Poniz(new char[]{'G', 'R', 'K', 'i', 'y', 'u', 'l', 'E', 'z', '6', '2', 'W', 'C', 'U', 's', 'i', 'o', 'v', 'Q'}, new int[]{19, 3, 18, 8, 5, 18, 8, 18, 1, 2, 14, 3, 7, 19, 16, 4, 3, 12, 5});
        Tretja.Poniz poniz2 = new Tretja.Poniz(new char[]{'2', 's', 'y', 'R', 'a', 'g', 'w', 'P', '_', 'D', 'I', 'g', 'y', 'B', 'm', 'k', '6', '_', 'f'}, new int[]{7, 18, 8, 9, 3, 11, 13, 4, 15, 3, 18, 13, 10, 9, 19, 1, 5, 13, 11});
        System.out.printf("<%s>%n", poniz1.vNiz());
        System.out.printf("<%s>%n", poniz2.vNiz());
    }
}
