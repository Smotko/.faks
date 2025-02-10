
import java.util.*;
import java.util.function.*;

public class Test40 {

    public static void main(String[] args) {
        Supplier<Integer> gen = Cetrta.generator(-576, 660);
        for (int i = 0; i < 453; i++) {
            System.out.println(gen.get());
        }
    }
}
