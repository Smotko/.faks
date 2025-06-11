
import java.util.*;

public class Test31 {

    public static void main(String[] args) {
        izpisi(Tretja.Poniz.izNiza("ubbbbbsss444444443cccccccc"));
        izpisi(Tretja.Poniz.izNiza("8888888KKKKKKKKKrrrroooooooooo333333qq"));
    }

    private static void izpisi(Tretja.Poniz poniz) {
        System.out.printf("%s / %s%n",
                Arrays.toString(poniz.vrniZnake()), Arrays.toString(poniz.vrniPonovitve()));
    }
}
