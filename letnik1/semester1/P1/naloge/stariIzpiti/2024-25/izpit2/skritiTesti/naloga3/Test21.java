
import java.util.*;

public class Test21 {

    public static void main(String[] args) {
        Tretja.Poniz poniz1 = new Tretja.Poniz(new char[]{'w', '1', 'u', 'Q', 'A', 'H', '8', 'E', '5', '7', 'o', 'a', 'S', '_', '7', 'I', 'l', 'T', 'B', '2', '_'}, new int[]{12, 9, 4, 13, 8, 13, 14, 6, 15, 1, 2, 19, 6, 2, 18, 19, 19, 12, 6, 12, 10});
        Tretja.Poniz poniz2 = new Tretja.Poniz(new char[]{'_', 'D', 'm', 'y', 'S', 'D', 'Q', 'w', 'm', '1', 'm', 'S', '1', 'q', 'w', 'd', '3', 'Z', 'u', 'h', '7'}, new int[]{10, 12, 7, 6, 5, 14, 14, 7, 11, 5, 20, 7, 8, 9, 15, 17, 1, 15, 18, 8, 5});
        System.out.printf("<%s>%n", poniz1.vNiz());
        System.out.printf("<%s>%n", poniz2.vNiz());
    }
}
