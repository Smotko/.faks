
import java.util.*;

public class Test43 {

    public static void main(String[] args) {
        izpisi(Tretja.Poniz.izNiza("nnMIIN0093aGnnGG22lRRffQQoy"));
        izpisi(Tretja.Poniz.izNiza("CCZxfrObbrrSSGv9jtt6rrTN"));
    }

    private static void izpisi(Tretja.Poniz poniz) {
        System.out.printf("%s / %s%n",
                Arrays.toString(poniz.vrniZnake()), Arrays.toString(poniz.vrniPonovitve()));
    }
}
