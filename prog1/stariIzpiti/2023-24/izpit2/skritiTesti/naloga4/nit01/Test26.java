
import java.util.*;
import java.util.function.*;

public class Test26 {

    public static void main(String[] args) {
        Supplier<Integer> gen = Cetrta.generator(-688, 150);
        for (int i = 0; i < 52; i++) {
            System.out.println(gen.get());
        }
    }
}
