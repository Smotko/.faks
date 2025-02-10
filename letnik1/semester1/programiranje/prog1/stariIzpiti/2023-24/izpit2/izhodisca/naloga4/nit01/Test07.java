
import java.util.*;
import java.util.function.*;

public class Test07 {

    public static void main(String[] args) {
        Supplier<Integer> gen = Cetrta.generator(-190, 541);
        for (int i = 0; i < 372; i++) {
            System.out.println(gen.get());
        }
    }
}
