
import java.util.*;

public class Test38 {

    public static void main(String[] args) {
        izpisi(Tretja.Poniz.izNiza("jjjjjDDDDDDiiiiVVViiiiiiaaaaaaaBBBBBBBBBFFFFFFFFFFYttttvvOOOOOOW"));
        izpisi(Tretja.Poniz.izNiza("CCCCCCCqqqqqqqmmmmmmmmmm4444JJJJJJJ_________yyyyyyyyyyjjj5558888rrrrrrrr444444444q"));
    }

    private static void izpisi(Tretja.Poniz poniz) {
        System.out.printf("%s / %s%n",
                Arrays.toString(poniz.vrniZnake()), Arrays.toString(poniz.vrniPonovitve()));
    }
}
