
import java.util.*;

public class Test20 {

    public static void main(String[] args) {
        Tretja.Poniz poniz1 = new Tretja.Poniz(new char[]{'D', 'Y', 'k', 'H', 'F', 'S', 'V', 'v', 'R', 'J', 'b', 'z', 'W', 'b', 'P', 'I', 'E', 'M', 'd', 'a'}, new int[]{14, 8, 12, 3, 11, 16, 10, 3, 5, 1, 20, 2, 5, 6, 3, 1, 5, 19, 3, 3});
        Tretja.Poniz poniz2 = new Tretja.Poniz(new char[]{'q', 'J', 'P', 'J', 'p', 'c', 'C', 'y', 'H', 'O', 'd', 'h', 'z', 'n', 's', '6', 'q', '3', 'G', '5'}, new int[]{14, 13, 10, 15, 7, 20, 8, 17, 19, 15, 7, 11, 10, 10, 8, 7, 14, 9, 13, 4});
        System.out.printf("<%s>%n", poniz1.vNiz());
        System.out.printf("<%s>%n", poniz2.vNiz());
    }
}
