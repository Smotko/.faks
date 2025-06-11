
import java.util.*;

public class Test45 {

    public static void main(String[] args) {
        izpisi(Tretja.Poniz.izNiza("uuuuuuuujjjjjjjZZZZZZZZZZ226QwwwwwmmmmmmmUUUUUUUqqqqqqqqqGGsssssssssTTTTT88ppppppppFnnnnnnnnn22CCIIIII"));
        izpisi(Tretja.Poniz.izNiza("hhhhhhhhhzzzzzzzzMMMMBBBBBouuuuuuuuUwwwwf777777_______WWZggggggg8888VVVV4444444nnnnnnnnnnooooooooEE"));
    }

    private static void izpisi(Tretja.Poniz poniz) {
        System.out.printf("%s / %s%n",
                Arrays.toString(poniz.vrniZnake()), Arrays.toString(poniz.vrniPonovitve()));
    }
}
