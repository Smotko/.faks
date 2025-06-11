
import java.util.*;
import java.util.function.*;

public class Test33 {

    public static void main(String[] args) {
        Supplier<Integer> gen = Cetrta.generator(734, 687);
        for (int i = 0; i < 391; i++) {
            System.out.println(gen.get());
        }
    }
}
