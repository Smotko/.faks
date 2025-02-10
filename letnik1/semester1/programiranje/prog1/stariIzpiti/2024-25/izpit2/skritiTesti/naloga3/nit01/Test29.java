
import java.util.*;

public class Test29 {

    public static void main(String[] args) {
        izpisi(Tretja.Poniz.izNiza("rr5nhh"));
        izpisi(Tretja.Poniz.izNiza("Kc_FF"));
    }

    private static void izpisi(Tretja.Poniz poniz) {
        System.out.printf("%s / %s%n",
                Arrays.toString(poniz.vrniZnake()), Arrays.toString(poniz.vrniPonovitve()));
    }
}
