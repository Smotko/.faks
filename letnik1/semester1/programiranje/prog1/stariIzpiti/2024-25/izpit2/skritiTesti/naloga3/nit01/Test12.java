
import java.util.*;

public class Test12 {

    public static void main(String[] args) {
        Tretja.Poniz poniz1 = new Tretja.Poniz(new char[]{'M', 'W', 'U', 'N', 'S', '8', 'B', 'r', '1', 'J', 'F', 'c'}, new int[]{10, 3, 13, 17, 13, 16, 8, 12, 18, 15, 2, 5});
        Tretja.Poniz poniz2 = new Tretja.Poniz(new char[]{'c', 'f', 'a', 'q', 'O', 'L', 'q', 'W', 'D', 'Q', 'h', 'A'}, new int[]{15, 14, 15, 16, 6, 19, 5, 6, 12, 19, 4, 1});
        System.out.printf("<%s>%n", poniz1.vNiz());
        System.out.printf("<%s>%n", poniz2.vNiz());
    }
}
