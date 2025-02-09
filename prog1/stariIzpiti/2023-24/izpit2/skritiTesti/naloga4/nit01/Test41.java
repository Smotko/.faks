
import java.util.*;
import java.util.function.*;

public class Test41 {

    public static void main(String[] args) {
        Supplier<Integer> gen = Cetrta.generator(-474, 341);
        for (int i = 0; i < 286; i++) {
            System.out.println(gen.get());
        }
    }
}
