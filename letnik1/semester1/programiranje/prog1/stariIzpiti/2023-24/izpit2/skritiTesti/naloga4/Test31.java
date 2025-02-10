
import java.util.*;
import java.util.function.*;

public class Test31 {

    public static void main(String[] args) {
        Supplier<Integer> gen = Cetrta.generator(177, 94);
        for (int i = 0; i < 184; i++) {
            System.out.println(gen.get());
        }
    }
}
