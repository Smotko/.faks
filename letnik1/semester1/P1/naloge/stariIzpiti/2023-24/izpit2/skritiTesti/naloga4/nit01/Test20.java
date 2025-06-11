
import java.util.*;
import java.util.function.*;

public class Test20 {

    public static void main(String[] args) {
        Comparator<Cas> comp = (a, b) -> b.compareTo(a);

        List<List<Cas>> seznami = List.of(
            List.of(new Cas(23, 25), new Cas(8, 46), new Cas(14, 52), new Cas(6, 57), new Cas(7, 11), new Cas(23, 14)),
            List.of(new Cas(23, 27), new Cas(0, 3), new Cas(23, 9), new Cas(0, 25), new Cas(22, 57), new Cas(0, 34), new Cas(22, 24), new Cas(1, 14), new Cas(22, 12), new Cas(2, 25), new Cas(21, 36), new Cas(3, 0), new Cas(20, 38), new Cas(3, 32), new Cas(20, 24), new Cas(3, 47), new Cas(19, 58), new Cas(4, 46), new Cas(18, 55), new Cas(5, 16), new Cas(18, 2), new Cas(5, 43), new Cas(17, 18), new Cas(6, 13), new Cas(16, 24), new Cas(7, 24), new Cas(15, 48), new Cas(9, 33), new Cas(14, 56), new Cas(9, 57), new Cas(13, 54), new Cas(11, 16), new Cas(13, 33), new Cas(11, 21), new Cas(13, 29), new Cas(11, 31), new Cas(12, 26), new Cas(12, 6), new Cas(12, 8), new Cas(12, 17), new Cas(12, 5), new Cas(12, 36), new Cas(11, 23), new Cas(13, 31), new Cas(11, 20), new Cas(13, 46), new Cas(9, 58), new Cas(14, 4), new Cas(9, 37), new Cas(15, 46), new Cas(9, 28), new Cas(16, 19), new Cas(7, 3), new Cas(17, 10), new Cas(5, 49), new Cas(17, 19), new Cas(5, 19), new Cas(18, 51), new Cas(5, 15), new Cas(19, 47), new Cas(4, 23), new Cas(19, 59), new Cas(3, 46), new Cas(20, 29), new Cas(3, 30), new Cas(20, 50), new Cas(2, 35), new Cas(21, 53), new Cas(1, 24), new Cas(22, 15), new Cas(1, 13), new Cas(22, 47), new Cas(0, 32), new Cas(23, 7), new Cas(0, 10), new Cas(23, 10)),
            List.of(new Cas(21, 36), new Cas(2, 29), new Cas(20, 50), new Cas(2, 57), new Cas(20, 42), new Cas(3, 27), new Cas(20, 10), new Cas(4, 51), new Cas(19, 48), new Cas(5, 12), new Cas(19, 40), new Cas(5, 12), new Cas(19, 19), new Cas(5, 21), new Cas(17, 56), new Cas(8, 7), new Cas(17, 39), new Cas(9, 43), new Cas(17, 36), new Cas(9, 58), new Cas(17, 30), new Cas(10, 11), new Cas(17, 15), new Cas(12, 41), new Cas(17, 13), new Cas(12, 52), new Cas(14, 34), new Cas(13, 17), new Cas(13, 41), new Cas(15, 14), new Cas(12, 26), new Cas(15, 58), new Cas(10, 38), new Cas(23, 23), new Cas(9, 33), new Cas(17, 50), new Cas(9, 14), new Cas(18, 38), new Cas(6, 29), new Cas(18, 39), new Cas(6, 2), new Cas(18, 39), new Cas(4, 26), new Cas(20, 9), new Cas(4, 14), new Cas(20, 29), new Cas(4, 12), new Cas(22, 25), new Cas(3, 25), new Cas(22, 42), new Cas(2, 1), new Cas(22, 47), new Cas(1, 38), new Cas(23, 6), new Cas(1, 13), new Cas(17, 13), new Cas(0, 29), new Cas(23, 25)),
            List.of(new Cas(23, 48), new Cas(1, 50), new Cas(18, 41), new Cas(4, 14), new Cas(17, 2), new Cas(7, 0), new Cas(20, 39), new Cas(12, 52), new Cas(5, 26), new Cas(11, 57)),
            List.of(new Cas(23, 45), new Cas(4, 12), new Cas(23, 30), new Cas(4, 21), new Cas(22, 16), new Cas(4, 26), new Cas(21, 53), new Cas(6, 50), new Cas(21, 8), new Cas(7, 16), new Cas(20, 50), new Cas(7, 47), new Cas(11, 50), new Cas(9, 14), new Cas(16, 19), new Cas(10, 31), new Cas(14, 47), new Cas(11, 19), new Cas(13, 8), new Cas(11, 52), new Cas(12, 2), new Cas(12, 41), new Cas(19, 40), new Cas(14, 21), new Cas(10, 47), new Cas(15, 11), new Cas(10, 26), new Cas(19, 9), new Cas(9, 13), new Cas(20, 1), new Cas(7, 41), new Cas(21, 2), new Cas(7, 15), new Cas(21, 26), new Cas(6, 26), new Cas(22, 15), new Cas(4, 24), new Cas(22, 58), new Cas(4, 15), new Cas(23, 44), new Cas(2, 50)),
            List.of(new Cas(23, 58), new Cas(0, 9), new Cas(21, 56), new Cas(1, 19), new Cas(20, 25), new Cas(1, 55), new Cas(19, 1), new Cas(3, 39), new Cas(18, 31), new Cas(5, 13), new Cas(14, 24), new Cas(6, 39), new Cas(12, 29), new Cas(7, 24), new Cas(11, 35), new Cas(7, 46), new Cas(11, 4), new Cas(9, 31), new Cas(9, 55), new Cas(10, 8), new Cas(7, 47), new Cas(11, 19), new Cas(7, 41), new Cas(11, 57), new Cas(7, 14), new Cas(13, 29), new Cas(5, 45), new Cas(16, 54), new Cas(3, 47), new Cas(18, 39), new Cas(2, 5), new Cas(20, 1), new Cas(1, 27), new Cas(21, 6), new Cas(0, 25), new Cas(23, 6)),
            List.of(new Cas(23, 53), new Cas(0, 0), new Cas(22, 30), new Cas(0, 38), new Cas(20, 7), new Cas(1, 40), new Cas(17, 19), new Cas(7, 46), new Cas(16, 16), new Cas(12, 32), new Cas(13, 37), new Cas(16, 6), new Cas(11, 57), new Cas(16, 18), new Cas(1, 45), new Cas(18, 27), new Cas(0, 44), new Cas(22, 29), new Cas(0, 2), new Cas(23, 4)),
            List.of(new Cas(9, 37), new Cas(8, 56)),
            List.of(new Cas(20, 29), new Cas(13, 1), new Cas(15, 58), new Cas(14, 21), new Cas(13, 54), new Cas(18, 55), new Cas(1, 45)),
            List.of(new Cas(20, 6), new Cas(5, 53), new Cas(19, 1), new Cas(6, 33), new Cas(7, 24), new Cas(13, 14), new Cas(10, 26), new Cas(17, 13))
        );

        for (List<Cas> seznam: seznami) {
            System.out.println(Cetrta.alternirajoceMonotono(seznam, comp));
        }
    }
}
