
import java.util.*;
import java.util.function.*;

public class Test48 {

    public static void main(String[] args) {
        Supplier<Integer> gen = Cetrta.generator(488, 917);
        for (int i = 0; i < 337; i++) {
            System.out.println(gen.get());
        }
    }
}
