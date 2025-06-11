
import java.util.*;
import java.util.function.*;

public class Test34 {

    public static void main(String[] args) {
        Supplier<Integer> gen = Cetrta.generator(-916, 115);
        for (int i = 0; i < 415; i++) {
            System.out.println(gen.get());
        }
    }
}
