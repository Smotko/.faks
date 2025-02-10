
import java.util.*;

public class Test37 {

    public static void main(String[] args) {
        izpisi(Tretja.Poniz.izNiza("CCCCooxxxxxXXA8rrppppfTTTxgggg"));
        izpisi(Tretja.Poniz.izNiza("xxxxx55555XXX777ooo33344444TyyOOYYYYY"));
    }

    private static void izpisi(Tretja.Poniz poniz) {
        System.out.printf("%s / %s%n",
                Arrays.toString(poniz.vrniZnake()), Arrays.toString(poniz.vrniPonovitve()));
    }
}
