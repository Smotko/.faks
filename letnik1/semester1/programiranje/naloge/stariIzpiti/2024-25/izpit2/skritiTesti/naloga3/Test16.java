
import java.util.*;

public class Test16 {

    public static void main(String[] args) {
        Tretja.Poniz poniz1 = new Tretja.Poniz(new char[]{'k', 'K', 'G', 'k', '4', 'g', 'H', 'g', 'l', 'm', 'i', 'h', 'b', 'c', 'Y', 'L'}, new int[]{6, 8, 9, 14, 16, 15, 20, 17, 5, 20, 6, 15, 2, 8, 2, 7});
        Tretja.Poniz poniz2 = new Tretja.Poniz(new char[]{'Z', '_', 'M', 'a', 's', 'm', 'l', 'N', 'G', 'n', 'g', 'H', 'Z', 'Q', '0', 'N'}, new int[]{16, 15, 14, 5, 20, 17, 7, 16, 3, 11, 18, 10, 11, 7, 2, 10});
        System.out.printf("<%s>%n", poniz1.vNiz());
        System.out.printf("<%s>%n", poniz2.vNiz());
    }
}
