
import java.util.*;
import java.util.function.*;

public class Test10 {

    public static void main(String[] args) {
        Supplier<Integer> gen = Cetrta.generator(-407, 294);
        for (int i = 0; i < 204; i++) {
            System.out.println(gen.get());
        }
    }
}
