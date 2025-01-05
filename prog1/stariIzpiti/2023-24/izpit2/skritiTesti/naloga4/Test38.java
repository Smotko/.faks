
import java.util.*;
import java.util.function.*;

public class Test38 {

    public static void main(String[] args) {
        Supplier<Integer> gen = Cetrta.generator(-476, 719);
        for (int i = 0; i < 203; i++) {
            System.out.println(gen.get());
        }
    }
}
