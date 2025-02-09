
import java.util.*;
import java.util.function.*;

public class Test43 {

    public static void main(String[] args) {
        Supplier<Integer> gen = Cetrta.generator(-831, 327);
        for (int i = 0; i < 449; i++) {
            System.out.println(gen.get());
        }
    }
}
