
import java.util.*;
import java.util.function.*;

public class Test30 {

    public static void main(String[] args) {
        Supplier<Integer> gen = Cetrta.generator(-795, 13);
        for (int i = 0; i < 81; i++) {
            System.out.println(gen.get());
        }
    }
}
