
import java.util.*;

public class Test50 {

    public static void main(String[] args) {
        izpisi(Tretja.Poniz.izNiza("Wk__mOOHHHHSSYOOrN99UUDD00WWCCOO4EEGGPPiaa"));
        izpisi(Tretja.Poniz.izNiza("lFFYoFsePQQ55hhX33cRRVO8HHh3QQaJ3"));
    }

    private static void izpisi(Tretja.Poniz poniz) {
        System.out.printf("%s / %s%n",
                Arrays.toString(poniz.vrniZnake()), Arrays.toString(poniz.vrniPonovitve()));
    }
}
