
import java.util.*;

public class Test15 {

    public static void main(String[] args) {
        Tretja.Poniz poniz1 = new Tretja.Poniz(new char[]{'a', 'r', 'R', 'X', 'L', 'v', 'c', 'j', 'K', '9', 'J', 'h', 'l', 't', '0'}, new int[]{14, 18, 17, 15, 7, 4, 12, 1, 4, 1, 20, 16, 2, 11, 15});
        Tretja.Poniz poniz2 = new Tretja.Poniz(new char[]{'J', 'q', 'c', 't', 'Q', 'a', 'P', 'T', 'd', 'a', 'y', 'k', 'R', '5', 'G'}, new int[]{4, 2, 6, 10, 20, 14, 3, 4, 11, 7, 16, 15, 3, 14, 16});
        System.out.printf("<%s>%n", poniz1.vNiz());
        System.out.printf("<%s>%n", poniz2.vNiz());
    }
}
