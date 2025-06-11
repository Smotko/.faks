
import java.util.*;
import java.util.function.*;

public class Test44 {

    public static void main(String[] args) {
        Supplier<Integer> gen = Cetrta.generator(-2, 583);
        for (int i = 0; i < 346; i++) {
            System.out.println(gen.get());
        }
    }
}
