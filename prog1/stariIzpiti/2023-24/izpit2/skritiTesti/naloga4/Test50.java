
import java.util.*;
import java.util.function.*;

public class Test50 {

    public static void main(String[] args) {
        Supplier<Integer> gen = Cetrta.generator(809, 28);
        for (int i = 0; i < 148; i++) {
            System.out.println(gen.get());
        }
    }
}
