
import java.util.*;

public class Test32 {

    public static void main(String[] args) {
        izpisi(Tretja.Poniz.izNiza("ffffEEEEEEEECChhhoooooooooo3333FFFFFFFF"));
        izpisi(Tretja.Poniz.izNiza("KKKWWWWWWyyyyyyyyyyii8888888888FFFFFFFNNNNNNNN"));
    }

    private static void izpisi(Tretja.Poniz poniz) {
        System.out.printf("%s / %s%n",
                Arrays.toString(poniz.vrniZnake()), Arrays.toString(poniz.vrniPonovitve()));
    }
}
