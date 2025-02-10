
import java.util.*;

public class Test06 {

    public static void main(String[] args) {
        Tretja.Poniz poniz1 = new Tretja.Poniz(new char[]{'p', 'Q', 'H', 'a', 'k', 'n'}, new int[]{5, 10, 15, 12, 3, 7});
        Tretja.Poniz poniz2 = new Tretja.Poniz(new char[]{'I', 'o', 'G', 'u', 'R', '0'}, new int[]{12, 7, 3, 1, 14, 12});
        System.out.printf("<%s>%n", poniz1.vNiz());
        System.out.printf("<%s>%n", poniz2.vNiz());
    }
}
