
import java.util.*;
import java.util.function.*;

public class Test39 {

    public static void main(String[] args) {
        Supplier<Integer> gen = Cetrta.generator(-72, 697);
        for (int i = 0; i < 15; i++) {
            System.out.println(gen.get());
        }
    }
}
