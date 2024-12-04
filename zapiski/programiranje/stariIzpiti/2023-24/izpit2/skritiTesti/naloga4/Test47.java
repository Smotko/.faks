
import java.util.*;
import java.util.function.*;

public class Test47 {

    public static void main(String[] args) {
        Supplier<Integer> gen = Cetrta.generator(-473, 961);
        for (int i = 0; i < 392; i++) {
            System.out.println(gen.get());
        }
    }
}
