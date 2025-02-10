
import java.util.*;

public class Test17 {

    public static void main(String[] args) {
        Tretja.Poniz poniz1 = new Tretja.Poniz(new char[]{'G', '0', '4', 'w', 'n', 'g', 'I', 'b', 'K', '6', 'j', 'f', 'q', 'X', 'v', 'M', 'Q'}, new int[]{16, 1, 7, 2, 11, 18, 14, 15, 2, 14, 11, 3, 6, 11, 17, 18, 19});
        Tretja.Poniz poniz2 = new Tretja.Poniz(new char[]{'F', '6', '9', '0', 'P', 'V', 'Z', 'F', 's', 'S', '4', '_', 'Q', 'W', 'p', 'V', 'i'}, new int[]{15, 2, 6, 4, 13, 19, 8, 10, 8, 10, 10, 9, 2, 4, 2, 12, 19});
        System.out.printf("<%s>%n", poniz1.vNiz());
        System.out.printf("<%s>%n", poniz2.vNiz());
    }
}
