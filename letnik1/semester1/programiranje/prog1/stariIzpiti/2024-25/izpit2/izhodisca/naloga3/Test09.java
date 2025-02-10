
import java.util.*;

public class Test09 {

    public static void main(String[] args) {
        izpisi(Tretja.Poniz.izNiza("yyyyyyyyy99999999999999999jGGGGkkOOOOOOOOOOOOOOOOOllllllllllllllllllrrrrrrZSSSSNNbbbbbbbbbbbbbbbbbbhhhhhhhhhhfffffqqqDDDDDDDDDDDDDDDDHGGGGGGGGGGGGGGG"));
        izpisi(Tretja.Poniz.izNiza("_____111111111111111111wwNTTTTTTTTTTTTTTTuuuuuuuLLLMMMMMMMMMMMMMMMMXXXXXXXXXXXXXXXXXXiiiiiiiiiBBBBBBBBffffffffffff666666666DDDDDDDDMMMMMBBBBBBBBBBBBBBBlggggggggggggggg"));
    }

    private static void izpisi(Tretja.Poniz poniz) {
        System.out.printf("%s / %s%n",
                Arrays.toString(poniz.vrniZnake()), Arrays.toString(poniz.vrniPonovitve()));
    }
}
