
import java.util.*;
import java.util.function.*;

public class Test35 {

    public static void main(String[] args) {
        Supplier<Integer> gen = Cetrta.generator(-490, 990);
        for (int i = 0; i < 354; i++) {
            System.out.println(gen.get());
        }
    }
}
