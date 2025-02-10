
import java.util.*;
import java.util.function.*;

public class Test03 {

    public static void main(String[] args) {
        Comparator<Integer> comp = (a, b) -> a % 5 - b % 5;

        List<List<Integer>> seznami = List.of(
            List.of(2601, 1272, 527, 2601, 9472),
            List.of(380, 7454, 6446, 2989, 6211, 2939, 768, 6313, 5208, 2601),
            List.of(8460, 633, 1329, 5066, 637),
            List.of(1910, 1178, 25, 9472, 8358),
            List.of(4045, 1833, 7177, 3206, 1434),
            List.of(325, 3206, 8113),
            List.of(7215, 303, 5582, 6156, 2939),
            List.of(4765, 1086),
            List.of(4045, 9723, 8802, 8358, 1178, 8358, 3174),
            List.of(6530, 6369, 3023, 9472)
        );

        for (List<Integer> seznam: seznami) {
            System.out.println(Cetrta.alternirajoceMonotono(seznam, comp));
        }
    }
}
