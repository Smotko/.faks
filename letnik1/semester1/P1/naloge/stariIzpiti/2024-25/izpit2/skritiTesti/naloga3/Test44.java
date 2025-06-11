
import java.util.*;

public class Test44 {

    public static void main(String[] args) {
        izpisi(Tretja.Poniz.izNiza("ZZZqqqqq333ZZrrrrhhhhQQQQQcc3CCCCCtttNNNNBBByEGVVVeooo"));
        izpisi(Tretja.Poniz.izNiza("B00000UUUUUQQQQQzzzzwZZZOOOWWWWDDDppphh55555XXXXXIIIIddddFFFFJJJJJOOOOO"));
    }

    private static void izpisi(Tretja.Poniz poniz) {
        System.out.printf("%s / %s%n",
                Arrays.toString(poniz.vrniZnake()), Arrays.toString(poniz.vrniPonovitve()));
    }
}
