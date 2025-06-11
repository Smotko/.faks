
import java.util.*;

public class Test01 {

    public static void main(String[] args) {
        Tretja.Poniz poniz1 = new Tretja.Poniz(new char[]{'c', 'a', 'b', 'c'}, new int[]{4, 1, 3, 2});
        Tretja.Poniz poniz2 = new Tretja.Poniz(new char[]{'A', 'B', 'A', 'B'}, new int[]{5, 3, 14, 24});
        Tretja.Poniz poniz3 = new Tretja.Poniz(new char[0], new int[0]);
        Tretja.Poniz poniz4 = new Tretja.Poniz(new char[]{'z'}, new int[]{10});
        Tretja.Poniz poniz5 = new Tretja.Poniz(new char[]{'x'}, new int[]{1});
        Tretja.Poniz poniz6 = new Tretja.Poniz(new char[]{'a', 'b', 'a', 'b', 'a', 'b'}, new int[]{1, 1, 1, 1, 1, 1, 1, 1});
        System.out.printf("<%s>%n", poniz1.vNiz());
        System.out.printf("<%s>%n", poniz2.vNiz());
        System.out.printf("<%s>%n", poniz3.vNiz());
        System.out.printf("<%s>%n", poniz4.vNiz());
        System.out.printf("<%s>%n", poniz5.vNiz());
        System.out.printf("<%s>%n", poniz6.vNiz());
    }
}
