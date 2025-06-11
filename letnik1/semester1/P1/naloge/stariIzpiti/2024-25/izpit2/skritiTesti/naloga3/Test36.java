
import java.util.*;

public class Test36 {

    public static void main(String[] args) {
        izpisi(Tretja.Poniz.izNiza("0qqREENfKwwKUJ"));
        izpisi(Tretja.Poniz.izNiza("NN3MnEyESSxxbbHH"));
    }

    private static void izpisi(Tretja.Poniz poniz) {
        System.out.printf("%s / %s%n",
                Arrays.toString(poniz.vrniZnake()), Arrays.toString(poniz.vrniPonovitve()));
    }
}
