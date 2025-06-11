
import java.util.*;

public class Test04 {

    public static void main(String[] args) {
        Tretja.Poniz poniz1 = new Tretja.Poniz(new char[]{'I', 'o', 'G', 'u', 'R', '0', 't', 'K', 'T', 'j', 'O', 'n', 'y', 'l', 'T', 'R', 'c', 'e', '7', 'g', 'T'}, new int[]{14, 12, 6, 17, 5, 10, 15, 12, 3, 7, 9, 4, 14, 19, 20, 12, 7, 3, 1, 14, 12});
        Tretja.Poniz poniz2 = new Tretja.Poniz(new char[]{'T', 'o', 'K', 'z', '8', 'd', 'h', '9', 'X', 'o', 'e', 'J', 'm', 'O', 'f', 'R', '5', 'B', 'd', 'B', 'n'}, new int[]{4, 4, 7, 18, 10, 3, 1, 12, 16, 18, 13, 17, 13, 3, 4, 13, 6, 3, 18, 1, 20});
        System.out.printf("<%s>%n", poniz1.vNiz());
        System.out.printf("<%s>%n", poniz2.vNiz());
    }
}
