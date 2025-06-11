
import java.util.*;
import java.util.function.*;

public class Test28 {

    public static void main(String[] args) {
        Supplier<Integer> gen = Cetrta.generator(67, 741);
        for (int i = 0; i < 364; i++) {
            System.out.println(gen.get());
        }
    }
}
