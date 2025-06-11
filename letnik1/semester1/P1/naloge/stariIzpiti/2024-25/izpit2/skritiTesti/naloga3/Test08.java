
import java.util.*;

public class Test08 {

    public static void main(String[] args) {
        Tretja.Poniz poniz1 = new Tretja.Poniz(new char[]{'n', 'T', 'o', 'K', 'z', '8', 'd', 'h'}, new int[]{13, 3, 4, 13, 6, 3, 18, 1});
        Tretja.Poniz poniz2 = new Tretja.Poniz(new char[]{'d', 'B', 'n', 'e', '9', 'g', 'l', 'P'}, new int[]{12, 16, 5, 20, 8, 16, 9, 1});
        System.out.printf("<%s>%n", poniz1.vNiz());
        System.out.printf("<%s>%n", poniz2.vNiz());
    }
}
