
import java.util.*;

public class Test18 {

    public static void main(String[] args) {
        Tretja.Poniz poniz1 = new Tretja.Poniz(new char[]{'E', 'i', 'm', 'U', 'J', 'R', 'J', '8', '3', 'U', '0', '7', 'p', 'N', '8', 'm', 'S', 'p'}, new int[]{18, 1, 5, 18, 10, 1, 5, 19, 16, 19, 3, 15, 19, 18, 4, 12, 6, 20});
        Tretja.Poniz poniz2 = new Tretja.Poniz(new char[]{'a', 'o', 'O', '6', 'G', '6', 'j', '2', '0', 'I', 'b', 'n', '4', 'N', '7', 'U', 'N', 'k'}, new int[]{18, 5, 1, 5, 12, 8, 9, 11, 15, 17, 9, 3, 20, 2, 5, 17, 5, 12});
        System.out.printf("<%s>%n", poniz1.vNiz());
        System.out.printf("<%s>%n", poniz2.vNiz());
    }
}
