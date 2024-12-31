
import java.util.*;
import java.util.function.*;

public class Test32 {

    public static void main(String[] args) {
        Supplier<Integer> gen = Cetrta.generator(-890, 677);
        for (int i = 0; i < 167; i++) {
            System.out.println(gen.get());
        }
    }
}
