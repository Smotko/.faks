
import java.util.*;

public class Test34 {

    public static void main(String[] args) {
        izpisi(Tretja.Poniz.izNiza("HHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHHggggggggggggggggggggggggggggggggggggZZZZZZZZZZZZZZZZZaaaaaapppppppppppp666IIIIIIIIIIIIIIIIIIIIuuuuuuuuuuuuuuUU"));
        izpisi(Tretja.Poniz.izNiza("kkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkk2222222222222222222222222222222222222222222VVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVFFFFFFFFFFFFFyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqq4444444444444444444444444444444444444444444YYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYYvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvv"));
    }

    private static void izpisi(Tretja.Poniz poniz) {
        System.out.printf("%s / %s%n",
                Arrays.toString(poniz.vrniZnake()), Arrays.toString(poniz.vrniPonovitve()));
    }
}
