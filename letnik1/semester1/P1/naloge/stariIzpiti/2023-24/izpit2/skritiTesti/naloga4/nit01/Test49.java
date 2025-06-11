
import java.util.*;
import java.util.function.*;

public class Test49 {

    public static void main(String[] args) {
        Supplier<Integer> gen = Cetrta.generator(803, 179);
        for (int i = 0; i < 338; i++) {
            System.out.println(gen.get());
        }
    }
}
