
import java.util.*;
import java.util.function.*;

public class Test09 {

    public static void main(String[] args) {
        Comparator<Cas> comp = (a, b) -> a.compareTo(b);

        List<List<Cas>> seznami = List.of(
            List.of(new Cas(1, 38), new Cas(1, 38), new Cas(9, 56)),
            List.of(new Cas(6, 41), new Cas(13, 6), new Cas(10, 55), new Cas(14, 15), new Cas(9, 56)),
            List.of(new Cas(1, 38), new Cas(22, 36), new Cas(9, 56), new Cas(19, 4), new Cas(12, 34), new Cas(13, 6), new Cas(14, 15), new Cas(10, 55), new Cas(19, 18), new Cas(6, 41)),
            List.of(new Cas(1, 38), new Cas(19, 18), new Cas(12, 34), new Cas(13, 6), new Cas(14, 15), new Cas(10, 55)),
            List.of(new Cas(1, 38), new Cas(10, 55), new Cas(22, 36), new Cas(1, 38), new Cas(22, 36)),
            List.of(new Cas(9, 56), new Cas(9, 56), new Cas(14, 15)),
            List.of(new Cas(6, 41), new Cas(19, 18), new Cas(10, 55), new Cas(19, 4), new Cas(13, 6), new Cas(1, 38)),
            List.of(new Cas(1, 38), new Cas(19, 4), new Cas(9, 56), new Cas(22, 36), new Cas(12, 34), new Cas(13, 6), new Cas(14, 15), new Cas(10, 55), new Cas(19, 18), new Cas(6, 41)),
            List.of(new Cas(1, 38), new Cas(22, 36), new Cas(9, 56), new Cas(19, 4), new Cas(12, 34), new Cas(13, 6), new Cas(14, 15), new Cas(10, 55), new Cas(19, 18), new Cas(6, 41)),
            List.of(new Cas(6, 41), new Cas(9, 56), new Cas(10, 55), new Cas(1, 38))
        );

        for (List<Cas> seznam: seznami) {
            System.out.println(Cetrta.alternirajoceMonotono(seznam, comp));
        }
    }
}
