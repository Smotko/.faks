
import java.util.*;

public class Test03 {

    public static void main(String[] args) {
        Tretja.Poniz poniz1 = new Tretja.Poniz(new char[]{'I', 'D', 'r'}, new int[]{14, 5, 14});
        Tretja.Poniz poniz2 = new Tretja.Poniz(new char[]{'9', '1', 'D'}, new int[]{1, 9, 10});
        System.out.printf("<%s>%n", poniz1.vNiz());
        System.out.printf("<%s>%n", poniz2.vNiz());
    }
}
