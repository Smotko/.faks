
import java.util.*;

public class Test11 {

    public static void main(String[] args) {
        Tretja.Poniz poniz1 = new Tretja.Poniz(new char[]{'E', '0', 'f', 'x', 'K', 'w', '9', 'c', 'E', '1', 'X'}, new int[]{1, 7, 5, 20, 14, 17, 4, 13, 3, 17, 5});
        Tretja.Poniz poniz2 = new Tretja.Poniz(new char[]{'0', '1', 'W', 'i', 'r', 'o', 'D', 'a', '9', 'Q', 't'}, new int[]{7, 18, 1, 11, 3, 13, 18, 20, 9, 6, 8});
        System.out.printf("<%s>%n", poniz1.vNiz());
        System.out.printf("<%s>%n", poniz2.vNiz());
    }
}
