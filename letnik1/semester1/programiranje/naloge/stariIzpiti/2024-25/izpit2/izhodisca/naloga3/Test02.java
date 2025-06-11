
import java.util.*;

public class Test02 {

    public static void main(String[] args) {
        Tretja.Poniz poniz1 = new Tretja.Poniz(new char[]{'H', 'd', 'o'}, new int[]{19, 4, 14});
        Tretja.Poniz poniz2 = new Tretja.Poniz(new char[]{'W', '0', 't'}, new int[]{10, 20, 17});
        System.out.printf("<%s>%n", poniz1.vNiz());
        System.out.printf("<%s>%n", poniz2.vNiz());
    }
}
