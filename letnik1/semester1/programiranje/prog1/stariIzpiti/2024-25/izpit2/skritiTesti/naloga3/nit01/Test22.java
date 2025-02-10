
import java.util.*;

public class Test22 {

    public static void main(String[] args) {
        Tretja.Poniz poniz1 = new Tretja.Poniz(new char[]{'X', 'c', 'R', 'S', 'j', '1', 'M', 'L', 'g', 'J', 'D', 'N', 'm', '3', 'U', 'd', 'W', 'U', '0', 'B', 's', '9'}, new int[]{16, 19, 15, 17, 15, 6, 2, 17, 20, 8, 17, 5, 1, 17, 8, 9, 14, 17, 17, 12, 20, 12});
        Tretja.Poniz poniz2 = new Tretja.Poniz(new char[]{'u', 'w', 'R', 't', '3', 'z', 'B', 'e', 'h', 'q', 'F', 'N', 'P', 'b', 's', 'd', 'Q', 'W', 'l', 'z', 'F', '7'}, new int[]{4, 16, 8, 3, 13, 7, 11, 14, 13, 19, 7, 11, 9, 12, 18, 18, 8, 1, 8, 6, 17, 7});
        System.out.printf("<%s>%n", poniz1.vNiz());
        System.out.printf("<%s>%n", poniz2.vNiz());
    }
}
