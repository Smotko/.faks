
import java.util.*;

public class Test27 {

    public static void main(String[] args) {
        izpisi(Tretja.Poniz.izNiza("4444444444444444444444444444444444444444444444444iiiiiiiiiiiiiiii"));
        izpisi(Tretja.Poniz.izNiza("nnnnnnnnnjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjjj"));
    }

    private static void izpisi(Tretja.Poniz poniz) {
        System.out.printf("%s / %s%n",
                Arrays.toString(poniz.vrniZnake()), Arrays.toString(poniz.vrniPonovitve()));
    }
}
