
import java.util.*;
import java.util.function.*;

public class Test29 {

    public static void main(String[] args) {
        Supplier<Integer> gen = Cetrta.generator(913, 832);
        for (int i = 0; i < 74; i++) {
            System.out.println(gen.get());
        }
    }
}
