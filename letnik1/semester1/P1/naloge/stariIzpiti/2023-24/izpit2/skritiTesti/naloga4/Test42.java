
import java.util.*;
import java.util.function.*;

public class Test42 {

    public static void main(String[] args) {
        Supplier<Integer> gen = Cetrta.generator(929, 946);
        for (int i = 0; i < 437; i++) {
            System.out.println(gen.get());
        }
    }
}
