
import java.util.*;
import java.util.function.*;

public class Test02 {

    public static void main(String[] args) {
        Supplier<Integer> gen = Cetrta.generator(3, 5);
        for (int i = 0; i < 10; i++) {
            System.out.println(gen.get());
        }
    }
}
