
import java.util.*;
import java.util.function.*;

public class Test19 {

    public static void main(String[] args) {
        Comparator<Cas> comp = (a, b) -> a.compareTo(b);

        List<List<Cas>> seznami = List.of(
            List.of(new Cas(4, 9), new Cas(22, 43), new Cas(13, 16), new Cas(18, 39), new Cas(15, 56), new Cas(17, 32), new Cas(21, 35), new Cas(11, 21)),
            List.of(new Cas(7, 16), new Cas(20, 59), new Cas(17, 39), new Cas(13, 23)),
            List.of(new Cas(12, 7), new Cas(5, 57), new Cas(12, 10)),
            List.of(new Cas(19, 9)),
            List.of(new Cas(0, 0), new Cas(23, 39), new Cas(2, 40), new Cas(17, 49), new Cas(4, 46), new Cas(17, 3), new Cas(12, 10), new Cas(14, 57), new Cas(15, 31), new Cas(9, 19), new Cas(17, 37), new Cas(4, 31), new Cas(19, 37), new Cas(1, 16)),
            List.of(new Cas(0, 6), new Cas(23, 28), new Cas(2, 10), new Cas(22, 43), new Cas(3, 40), new Cas(21, 35), new Cas(4, 9), new Cas(19, 32), new Cas(4, 46), new Cas(17, 37), new Cas(3, 38), new Cas(16, 49), new Cas(9, 19), new Cas(14, 49), new Cas(9, 56), new Cas(12, 53), new Cas(12, 37), new Cas(12, 7), new Cas(14, 8), new Cas(9, 37), new Cas(15, 58), new Cas(8, 6), new Cas(16, 56), new Cas(4, 56), new Cas(18, 39), new Cas(4, 17), new Cas(21, 25), new Cas(3, 53), new Cas(22, 33), new Cas(7, 0), new Cas(22, 51), new Cas(1, 16)),
            List.of(new Cas(4, 9), new Cas(23, 45), new Cas(4, 31), new Cas(7, 37), new Cas(12, 37), new Cas(7, 7)),
            List.of(new Cas(14, 8), new Cas(15, 10), new Cas(7, 15)),
            List.of(new Cas(1, 59), new Cas(17, 37), new Cas(22, 51), new Cas(2, 55)),
            List.of(new Cas(0, 0), new Cas(23, 45), new Cas(0, 6), new Cas(23, 28), new Cas(0, 6), new Cas(22, 51), new Cas(0, 53), new Cas(22, 50), new Cas(2, 40), new Cas(22, 50), new Cas(2, 55), new Cas(22, 50), new Cas(3, 50), new Cas(21, 10), new Cas(4, 9), new Cas(20, 59), new Cas(4, 25), new Cas(17, 49), new Cas(4, 29), new Cas(17, 39), new Cas(4, 29), new Cas(17, 39), new Cas(4, 31), new Cas(16, 56), new Cas(4, 56), new Cas(16, 56), new Cas(4, 56), new Cas(16, 54), new Cas(7, 15), new Cas(16, 43), new Cas(7, 16), new Cas(16, 43), new Cas(7, 17), new Cas(16, 43), new Cas(7, 55), new Cas(15, 58), new Cas(7, 55), new Cas(15, 56), new Cas(9, 31), new Cas(14, 57), new Cas(9, 56), new Cas(12, 53), new Cas(12, 0), new Cas(11, 21), new Cas(13, 16), new Cas(9, 56), new Cas(14, 8), new Cas(9, 40), new Cas(15, 56), new Cas(7, 55), new Cas(16, 26), new Cas(7, 47), new Cas(16, 43), new Cas(7, 47), new Cas(16, 49), new Cas(7, 37), new Cas(16, 54), new Cas(7, 7), new Cas(17, 37), new Cas(5, 36), new Cas(17, 37), new Cas(4, 46), new Cas(18, 39), new Cas(4, 29), new Cas(19, 23), new Cas(3, 53), new Cas(21, 10), new Cas(3, 53), new Cas(22, 4), new Cas(3, 43), new Cas(22, 50), new Cas(2, 55), new Cas(23, 21), new Cas(1, 16), new Cas(23, 39), new Cas(0, 53))
        );

        for (List<Cas> seznam: seznami) {
            System.out.println(Cetrta.alternirajoceMonotono(seznam, comp));
        }
    }
}
