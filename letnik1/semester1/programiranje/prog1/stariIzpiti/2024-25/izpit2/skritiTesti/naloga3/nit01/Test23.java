
import java.util.*;

public class Test23 {

    public static void main(String[] args) {
        Tretja.Poniz poniz1 = new Tretja.Poniz(new char[]{'I', 'y', 'k', 'd', 'V', '_', 'D', 'g', 'I', 'z', 'b', 'F', 'I', 't', 'h', 'o', 'q', 'J', '0', 'L', 'R', 'h', 'O'}, new int[]{14, 10, 17, 5, 9, 18, 9, 20, 3, 17, 4, 18, 11, 18, 9, 11, 2, 6, 5, 20, 14, 20, 2});
        Tretja.Poniz poniz2 = new Tretja.Poniz(new char[]{'i', 'x', 'y', 'c', 'p', 'I', 'S', 'E', 'w', '9', 'R', 'J', 'Q', 'W', '1', 'i', '1', 'G', 's', 'V', 'R', 'b', 'p'}, new int[]{18, 17, 3, 8, 11, 11, 3, 17, 2, 8, 17, 14, 11, 12, 16, 12, 19, 12, 10, 15, 10, 7, 19});
        System.out.printf("<%s>%n", poniz1.vNiz());
        System.out.printf("<%s>%n", poniz2.vNiz());
    }
}
