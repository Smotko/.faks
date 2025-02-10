
import java.util.*;
import java.util.function.*;

public class Test36 {

    public static void main(String[] args) {
        Supplier<Integer> gen = Cetrta.generator(-677, 785);
        for (int i = 0; i < 432; i++) {
            System.out.println(gen.get());
        }
    }
}
