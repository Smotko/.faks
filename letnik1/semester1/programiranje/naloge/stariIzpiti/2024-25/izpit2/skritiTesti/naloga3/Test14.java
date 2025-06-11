
import java.util.*;

public class Test14 {

    public static void main(String[] args) {
        Tretja.Poniz poniz1 = new Tretja.Poniz(new char[]{'M', 'B', 'l', 'g', 'p', 'N', 'G', 'g', 'u', 'r', '3', 'E', 'W', '2'}, new int[]{19, 5, 15, 1, 15, 7, 10, 6, 7, 12, 18, 1, 16, 2});
        Tretja.Poniz poniz2 = new Tretja.Poniz(new char[]{'A', '8', 'z', 'O', 'n', 'v', 'm', '2', 'E', 'U', 'F', 'R', 'G', 'A'}, new int[]{1, 16, 10, 20, 3, 3, 19, 16, 17, 18, 17, 3, 15, 10});
        System.out.printf("<%s>%n", poniz1.vNiz());
        System.out.printf("<%s>%n", poniz2.vNiz());
    }
}
