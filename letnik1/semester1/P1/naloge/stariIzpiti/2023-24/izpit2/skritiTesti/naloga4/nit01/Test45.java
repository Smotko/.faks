
import java.util.*;
import java.util.function.*;

public class Test45 {

    public static void main(String[] args) {
        Supplier<Integer> gen = Cetrta.generator(501, 40);
        for (int i = 0; i < 212; i++) {
            System.out.println(gen.get());
        }
    }
}
