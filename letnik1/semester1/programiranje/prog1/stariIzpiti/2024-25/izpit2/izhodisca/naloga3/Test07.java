
import java.util.*;

public class Test07 {

    public static void main(String[] args) {
        izpisi(Tretja.Poniz.izNiza("DDaaa999QQQ"));
        izpisi(Tretja.Poniz.izNiza("000YYhhh1"));
    }

    private static void izpisi(Tretja.Poniz poniz) {
        System.out.printf("%s / %s%n",
                Arrays.toString(poniz.vrniZnake()), Arrays.toString(poniz.vrniPonovitve()));
    }
}
