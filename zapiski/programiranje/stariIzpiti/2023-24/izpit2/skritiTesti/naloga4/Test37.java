
import java.util.*;
import java.util.function.*;

public class Test37 {

    public static void main(String[] args) {
        Supplier<Integer> gen = Cetrta.generator(-726, 135);
        for (int i = 0; i < 64; i++) {
            System.out.println(gen.get());
        }
    }
}
