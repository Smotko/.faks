
import java.util.*;
import java.util.function.*;

public class Test27 {

    public static void main(String[] args) {
        Supplier<Integer> gen = Cetrta.generator(-255, 413);
        for (int i = 0; i < 379; i++) {
            System.out.println(gen.get());
        }
    }
}
