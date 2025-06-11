
import java.util.*;

public class Test28 {

    public static void main(String[] args) {
        izpisi(Tretja.Poniz.izNiza("kkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkUUUUUUUUUUUUUUUUUUUFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF"));
        izpisi(Tretja.Poniz.izNiza("11111111111111111111111111111111111111111111112222222222dddddddddddddd"));
    }

    private static void izpisi(Tretja.Poniz poniz) {
        System.out.printf("%s / %s%n",
                Arrays.toString(poniz.vrniZnake()), Arrays.toString(poniz.vrniPonovitve()));
    }
}
