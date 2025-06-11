
import java.util.*;

public class Test26 {

    public static void main(String[] args) {
        izpisi(Tretja.Poniz.izNiza("BBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBBB"));
        izpisi(Tretja.Poniz.izNiza("VVVVVVVVVV"));
    }

    private static void izpisi(Tretja.Poniz poniz) {
        System.out.printf("%s / %s%n",
                Arrays.toString(poniz.vrniZnake()), Arrays.toString(poniz.vrniPonovitve()));
    }
}
