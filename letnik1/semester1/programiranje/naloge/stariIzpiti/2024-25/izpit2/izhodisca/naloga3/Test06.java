
import java.util.*;

public class Test06 {

    public static void main(String[] args) {
        izpisi(Tretja.Poniz.izNiza("ccccabbbcc"));
        izpisi(Tretja.Poniz.izNiza("AAAAABBBAAAAAAAAAAAAAABBBBBBBBBBBBBBBBBBBBBBBB"));
        izpisi(Tretja.Poniz.izNiza(""));
        izpisi(Tretja.Poniz.izNiza("zzzzzzzzzz"));
        izpisi(Tretja.Poniz.izNiza("x"));
        izpisi(Tretja.Poniz.izNiza("abababab"));
    }

    private static void izpisi(Tretja.Poniz poniz) {
        System.out.printf("%s / %s%n", 
                Arrays.toString(poniz.vrniZnake()), Arrays.toString(poniz.vrniPonovitve()));
    }
}
