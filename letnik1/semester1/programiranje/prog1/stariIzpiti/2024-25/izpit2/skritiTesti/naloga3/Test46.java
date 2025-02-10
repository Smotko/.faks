
import java.util.*;

public class Test46 {

    public static void main(String[] args) {
        izpisi(Tretja.Poniz.izNiza("UUkkUkkkkkkkKKKKKKKKKKdddxxxxzzzzzzMMMMMMMMMMwaaaaaiiiiiiXXXXXXqqzz111111111__ccccc11ttttd"));
        izpisi(Tretja.Poniz.izNiza("____1111111111BBBBBBbbbbbbTTTTTTTTTTwwwFFFFFFFF1111111iiiiiii33333311111llllllllPqqqLLLVVVVVVVCCCCCCCC333EEEEEEEnnnnnnnneeeee"));
    }

    private static void izpisi(Tretja.Poniz poniz) {
        System.out.printf("%s / %s%n",
                Arrays.toString(poniz.vrniZnake()), Arrays.toString(poniz.vrniPonovitve()));
    }
}
