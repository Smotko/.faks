
import java.util.*;
import java.util.function.*;

public class Test08 {

    public static void main(String[] args) {
        Supplier<Integer> gen = Cetrta.generator(988, 442);
        for (int i = 0; i < 228; i++) {
            System.out.println(gen.get());
        }
    }
}
