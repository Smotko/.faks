
import java.util.*;

public class Test13 {

    public static void main(String[] args) {
        List<List<Integer>> seznami = new ArrayList<>();

        seznami.add(List.of(20, 28, 73, 56, 34, 31, 42, 54, 95, 60, 4, 8, 68, 0, 67, 22, 69, 6, 21, 86));
        seznami.add(List.of(73, 8, 28, 92, 69, 95, 86, 31, 68, 6, 21, 70, 54, 22, 60, 57, 20, 37, 67, 0));
        seznami.add(List.of(97, 60, 50, 59, 74, 98, 64, 47, 77, 6, 55, 67, 73, 27, 86, 0, 54, 28, 22, 91, 8, 69, 21, 89, 95, 31, 20, 96, 68));
        seznami.add(List.of(96, 95, 69, 28, 10, 22, 80, 5, 24, 73, 6, 54, 41, 0, 68, 60, 13, 31, 67, 35, 8, 34, 98, 20, 86, 37, 33, 19, 21, 74));
        seznami.add(List.of(24, 44, 69, 73, 17, 54, 90, 0, 95, 68, 21, 67, 8, 56, 80, 22, 86, 42, 60, 91, 31, 6, 20, 3, 28, 16));
        seznami.add(List.of(60, 94, 68, 69, 88, 29, 31, 81, 95, 85, 67, 0, 21, 52, 86, 93, 27, 54, 73, 20, 14, 6, 28, 80, 8, 38, 62, 79, 17, 22));
        seznami.add(List.of(53, 72, 29, 0, 6, 66, 54, 33, 9, 22, 31, 92, 8, 21, 28, 47, 51, 60, 86, 78, 91, 69, 46, 73, 99, 20, 95, 67, 68, 11, 77));
        seznami.add(List.of(86, 28, 55, 95, 0, 6, 52, 67, 20, 8, 90, 41, 69, 79, 43, 73, 12, 22, 68, 61, 31, 60, 24, 21, 54, 97));
        seznami.add(List.of(86, 0, 95, 54, 31, 6, 8, 22, 28, 21, 68, 73, 87, 60, 67, 20, 69));
        seznami.add(List.of(17, 60, 20, 26, 21, 64, 95, 82, 70, 68, 81, 86, 16, 54, 59, 38, 67, 22, 36, 97, 90, 8, 0, 91, 13, 31, 73, 48, 28, 96, 6, 69, 94));
        seznami.add(List.of(22, 40, 28, 68, 37, 56, 69, 98, 67, 20, 95, 0, 73, 31, 54, 86, 60, 33, 21, 81, 6, 8));
        seznami.add(List.of(54, 73, 86, 28, 58, 97, 31, 81, 22, 71, 21, 8, 67, 69, 6, 20, 0, 88, 68, 60, 95));
        seznami.add(List.of(67, 19, 63, 62, 60, 23, 95, 92, 66, 85, 31, 28, 20, 72, 69, 81, 21, 46, 68, 64, 22, 96, 78, 84, 14, 73, 18, 53, 0, 93, 54, 71, 8, 6, 86));
        seznami.add(List.of(22, 95, 54, 69, 68, 60, 21, 31, 67, 28, 6, 8, 97, 73, 20, 2, 57, 86, 0));
        seznami.add(List.of(22, 25, 95, 18, 26, 33, 31, 28, 69, 0, 51, 54, 48, 68, 81, 86, 73, 8, 6, 52, 60, 21, 20, 67));
        seznami.add(List.of(94, 12, 95, 83, 8, 54, 69, 66, 67, 23, 53, 52, 86, 68, 0, 21, 22, 60, 31, 73, 74, 28, 6, 20));
        seznami.add(List.of(61, 73, 58, 11, 32, 22, 43, 6, 67, 0, 98, 34, 47, 52, 8, 38, 69, 31, 27, 95, 13, 60, 28, 86, 94, 62, 54, 88, 68, 92, 4, 93, 20, 87, 79, 21));
        seznami.add(List.of(62, 28, 40, 63, 96, 93, 80, 0, 54, 30, 4, 83, 82, 57, 22, 60, 87, 86, 68, 73, 95, 61, 69, 21, 79, 8, 59, 7, 44, 20, 81, 67, 31, 38, 55, 6));
        seznami.add(List.of(28, 0, 22, 21, 60, 20, 6, 66, 73, 68, 54, 69, 31, 58, 86, 30, 5, 95, 8, 67, 3));
        seznami.add(List.of(68, 31, 29, 24, 54, 92, 20, 60, 4, 21, 22, 80, 67, 95, 69, 0, 46, 82, 8, 86, 63, 73, 6, 28));
        seznami.add(List.of(69, 31, 28, 54, 22, 95, 86, 60, 67, 6, 0, 8, 21, 68, 97, 73, 36, 20));
        seznami.add(List.of(54, 22, 95, 14, 74, 73, 0, 6, 42, 52, 28, 8, 51, 1, 86, 77, 20, 21, 67, 38, 31, 68, 93, 69, 76, 60, 88));
        seznami.add(List.of(29, 20, 21, 60, 67, 8, 73, 41, 69, 31, 28, 6, 86, 94, 68, 0, 22, 95, 54));
        seznami.add(List.of(69, 20, 21, 31, 28, 71, 54, 65, 73, 22, 60, 91, 6, 93, 1, 99, 68, 67, 15, 29, 95, 26, 86, 38, 78, 8, 24, 0));
        seznami.add(List.of(11, 54, 28, 92, 69, 67, 85, 60, 31, 68, 65, 20, 9, 86, 95, 21, 70, 22, 7, 73, 8, 0, 6));
        seznami.add(List.of(67, 37, 86, 88, 21, 69, 61, 20, 28, 83, 73, 6, 98, 54, 97, 0, 55, 95, 52, 60, 26, 31, 70, 57, 4, 11, 13, 8, 22, 68, 66));
        seznami.add(List.of(86, 31, 60, 17, 54, 28, 11, 68, 42, 95, 73, 67, 20, 98, 6, 21, 22, 8, 69, 0));

        Set<Integer> mnozica = Cetrta.skupni(seznami);

        List<Integer> lstMnozica = new ArrayList<>(mnozica);
        lstMnozica.sort(null);
        System.out.println(lstMnozica);
    }
}