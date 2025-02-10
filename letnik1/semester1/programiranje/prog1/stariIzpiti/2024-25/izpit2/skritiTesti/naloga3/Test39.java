
import java.util.*;

public class Test39 {

    public static void main(String[] args) {
        izpisi(Tretja.Poniz.izNiza("LLLLLLLLLLoootttttttttjjjjjncccIIIIIIIII444444444444444AAAAAAAAA__________Tnnnn"));
        izpisi(Tretja.Poniz.izNiza("NEEEEEEMAAPPPxxxxxxxAAoooffffffffffMMMMM2CCCCCCCCCCCCCCCm"));
    }

    private static void izpisi(Tretja.Poniz poniz) {
        System.out.printf("%s / %s%n",
                Arrays.toString(poniz.vrniZnake()), Arrays.toString(poniz.vrniPonovitve()));
    }
}
