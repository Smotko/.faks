
import java.util.*;

public class Test08 {

    public static void main(String[] args) {
        izpisi(Tretja.Poniz.izNiza("NNNNSSSS88BBBrrrrr1111JFFccdddaaa"));
        izpisi(Tretja.Poniz.izNiza("GGGGGGAAAAccccffaaaaaaqqqqqOOLLqqqWWWWWWDDDDD"));
    }

    private static void izpisi(Tretja.Poniz poniz) {
        System.out.printf("%s / %s%n",
                Arrays.toString(poniz.vrniZnake()), Arrays.toString(poniz.vrniPonovitve()));
    }
}
