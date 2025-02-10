
import java.util.*;

public class Test30 {

    public static void main(String[] args) {
        izpisi(Tretja.Poniz.izNiza("uuuuuEEAArrrrrLLLL"));
        izpisi(Tretja.Poniz.izNiza("999PPPO88BBB"));
    }

    private static void izpisi(Tretja.Poniz poniz) {
        System.out.printf("%s / %s%n",
                Arrays.toString(poniz.vrniZnake()), Arrays.toString(poniz.vrniPonovitve()));
    }
}
