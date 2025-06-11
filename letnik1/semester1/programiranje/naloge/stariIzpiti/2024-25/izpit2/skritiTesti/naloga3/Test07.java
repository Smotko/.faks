
import java.util.*;

public class Test07 {

    public static void main(String[] args) {
        Tretja.Poniz poniz1 = new Tretja.Poniz(new char[]{'R', 'c', 'e', '7', 'g', 'T', 's'}, new int[]{6, 10, 18, 8, 20, 19, 10});
        Tretja.Poniz poniz2 = new Tretja.Poniz(new char[]{'W', '1', 'e', '9', 'j', 'Y', 'h'}, new int[]{4, 4, 7, 18, 10, 3, 1});
        System.out.printf("<%s>%n", poniz1.vNiz());
        System.out.printf("<%s>%n", poniz2.vNiz());
    }
}
