
import java.util.*;

public class Test07 {

    public static void main(String[] args) {
        List<List<Integer>> seznami = new ArrayList<>();

        seznami.add(List.of(30, 5, 15, 64, 78, 83, 46, 89, 49, 6, 12, 70));
        seznami.add(List.of(52, 8, 64, 42, 46, 97, 79, 10, 78, 4, 53, 70, 69, 72, 55, 92, 44, 62, 20, 26, 6, 28, 36, 30, 49, 40, 89));
        seznami.add(List.of(9, 64, 30, 45, 21, 46, 67, 60, 70, 78, 82, 81, 25, 52, 6, 75, 0, 49, 58, 89));
        seznami.add(List.of(30, 89, 64, 47, 6, 70, 49, 78, 73, 46));
        seznami.add(List.of(44, 50, 12, 66, 89, 10, 49, 8, 46, 79, 35, 41, 78, 30, 88, 70, 64, 6, 14, 27, 73));
        seznami.add(List.of(78, 64, 46, 26, 30, 60, 2, 38, 18, 98, 99, 40, 89, 4, 9, 92, 6, 49, 1, 19, 0, 70, 35));
        seznami.add(List.of(6, 69, 13, 49, 70, 72, 89, 46, 78, 64, 30));
        seznami.add(List.of(49, 60, 78, 70, 73, 20, 89, 99, 64, 6, 0, 30, 46, 63, 96));
        seznami.add(List.of(28, 54, 85, 63, 70, 57, 21, 3, 92, 64, 35, 78, 38, 89, 30, 49, 46, 6));
        seznami.add(List.of(30, 19, 89, 55, 41, 70, 49, 36, 46, 6, 64, 78));
        seznami.add(List.of(3, 78, 70, 30, 96, 46, 6, 88, 49, 64, 31, 89));
        seznami.add(List.of(64, 89, 6, 68, 49, 78, 30, 70, 46));
        seznami.add(List.of(72, 17, 45, 65, 46, 85, 6, 49, 30, 79, 14, 64, 78, 59, 70, 89, 71));
        seznami.add(List.of(95, 55, 73, 46, 89, 9, 44, 6, 66, 47, 56, 54, 64, 82, 30, 16, 22, 49, 40, 24, 78, 91, 18, 70));
        seznami.add(List.of(46, 50, 57, 96, 94, 89, 74, 70, 19, 49, 6, 31, 78, 30, 64));
        seznami.add(List.of(10, 5, 58, 28, 18, 46, 30, 36, 68, 49, 13, 76, 64, 55, 70, 83, 2, 78, 61, 23, 73, 95, 7, 26, 6, 84, 87, 89));
        seznami.add(List.of(46, 79, 95, 30, 41, 64, 6, 49, 7, 89, 71, 70, 78));
        seznami.add(List.of(37, 89, 84, 49, 46, 72, 74, 6, 12, 70, 22, 64, 30, 79, 86, 5, 36, 78, 7, 82));
        seznami.add(List.of(46, 30, 78, 63, 6, 89, 64, 34, 49, 70));
        seznami.add(List.of(5, 12, 84, 30, 91, 97, 70, 85, 37, 6, 89, 78, 87, 54, 64, 73, 24, 20, 81, 58, 0, 49, 25, 46, 94, 14, 67));
        seznami.add(List.of(89, 70, 72, 6, 30, 78, 63, 49, 46, 64));
        seznami.add(List.of(70, 30, 13, 78, 88, 37, 64, 89, 95, 6, 49, 46));
        seznami.add(List.of(27, 40, 2, 93, 22, 70, 45, 7, 49, 34, 67, 46, 64, 16, 12, 72, 89, 23, 78, 6, 30));

        Set<Integer> mnozica = Cetrta.skupni(seznami);

        List<Integer> lstMnozica = new ArrayList<>(mnozica);
        lstMnozica.sort(null);
        System.out.println(lstMnozica);
    }
}
