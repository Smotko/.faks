
import java.util.*;

public class Test01 {

    public static void main(String[] args) {
        Tretja.Poniz poniz1 = new Tretja.Poniz(new char[]{'G'}, new int[]{19});
        Tretja.Poniz poniz2 = new Tretja.Poniz(new char[]{'H'}, new int[]{14});
        System.out.printf("<%s>%n", poniz1.vNiz());
        System.out.printf("<%s>%n", poniz2.vNiz());
    }
}
