
import java.util.*;

public class Test13 {

    public static void main(String[] args) {
        Tretja.Poniz poniz1 = new Tretja.Poniz(new char[]{'B', 'c', 'y', '9', 'j', 'G', 'k', 'O', 'l', 'r', 'Z', 'S', 'N'}, new int[]{4, 2, 17, 18, 6, 1, 4, 2, 18, 10, 5, 3, 16});
        Tretja.Poniz poniz2 = new Tretja.Poniz(new char[]{'4', 'e', 'j', '9', 'Q', 'P', '_', '5', 'X', 'Q', '2', 'r', 'P'}, new int[]{14, 17, 16, 2, 4, 4, 5, 18, 2, 1, 15, 7, 3});
        System.out.printf("<%s>%n", poniz1.vNiz());
        System.out.printf("<%s>%n", poniz2.vNiz());
    }
}
