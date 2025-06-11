
import java.util.*;
import java.util.function.*;

public class Test46 {

    public static void main(String[] args) {
        Supplier<Integer> gen = Cetrta.generator(816, 369);
        for (int i = 0; i < 105; i++) {
            System.out.println(gen.get());
        }
    }
}
