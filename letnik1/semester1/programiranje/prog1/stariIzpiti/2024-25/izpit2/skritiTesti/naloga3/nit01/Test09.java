
import java.util.*;

public class Test09 {

    public static void main(String[] args) {
        Tretja.Poniz poniz1 = new Tretja.Poniz(new char[]{'8', 'h', 'H', 'n', 't', 'H', 'u', 'U', 'j'}, new int[]{1, 16, 15, 14, 3, 13, 6, 13, 20});
        Tretja.Poniz poniz2 = new Tretja.Poniz(new char[]{'M', '1', 'r', 'L', 'd', '3', 'd', '_', 'f'}, new int[]{15, 20, 4, 12, 19, 13, 18, 1, 5});
        System.out.printf("<%s>%n", poniz1.vNiz());
        System.out.printf("<%s>%n", poniz2.vNiz());
    }
}
