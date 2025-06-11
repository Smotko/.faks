
import java.util.*;

public class Test04 {

    public static void main(String[] args) {
        Tretja.Poniz poniz1 = new Tretja.Poniz(new char[]{'W', 'E', 'f', 'Z'}, new int[]{9, 9, 16, 10});
        Tretja.Poniz poniz2 = new Tretja.Poniz(new char[]{'H', 't', 'b', '8'}, new int[]{13, 3, 10, 5});
        System.out.printf("<%s>%n", poniz1.vNiz());
        System.out.printf("<%s>%n", poniz2.vNiz());
    }
}
