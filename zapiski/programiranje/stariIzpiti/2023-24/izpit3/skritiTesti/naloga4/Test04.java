
import java.util.*;

public class Test04 {

    public static void main(String[] args) {
        List<List<Integer>> seznami = new ArrayList<>();

        seznami.add(List.of(70, 3, 70, 43, 55, 75, 36, 87, 16, 59, 70, 74, 37, 85, 58, 14, 2, 43));
        seznami.add(List.of(14, 36, 95, 10));
        seznami.add(List.of(35, 57, 1, 3, 14, 36));
        seznami.add(List.of(51, 14, 15, 47, 29, 55, 74, 4, 14, 86, 64, 36, 5, 73, 95, 32, 70, 83));
        seznami.add(List.of(97, 14, 11, 36, 42, 34, 98, 81, 8, 55, 14));
        seznami.add(List.of(40, 36, 80, 71, 24, 35, 38, 20, 14));
        seznami.add(List.of(14, 65, 15, 36, 20));
        seznami.add(List.of(36, 89, 64, 21, 16, 32, 32, 87, 77, 27, 14, 46, 92, 13, 10));
        seznami.add(List.of(27, 14, 84, 51, 69, 5, 84, 36));
        seznami.add(List.of(17, 75, 41, 25, 75, 36, 34, 83, 13, 72, 14, 20, 48, 87, 18, 81, 30, 54, 33));
        seznami.add(List.of(22, 15, 83, 33, 14, 36, 62, 14, 81, 25, 49, 44, 41, 21, 77, 31, 0));
        seznami.add(List.of(32, 82, 1, 49, 14, 36, 88, 97));
        seznami.add(List.of(9, 14, 32, 96, 89, 36));
        seznami.add(List.of(14, 44, 36));
        seznami.add(List.of(96, 98, 84, 95, 83, 76, 41, 83, 29, 2, 24, 36, 9, 20, 43, 22, 55, 14, 71));
        seznami.add(List.of(43, 80, 49, 70, 14, 43, 42, 75, 86, 36, 87, 46, 48, 36, 66, 28, 97, 59, 65, 99));
        seznami.add(List.of(49, 10, 93, 69, 15, 82, 85, 95, 29, 75, 49, 40, 90, 38, 14, 86, 36, 21, 95, 69, 46));
        seznami.add(List.of(47, 26, 64, 11, 36, 42, 86, 40, 70, 57, 69, 91, 11, 5, 47, 77, 14));
        seznami.add(List.of(67, 78, 19, 35, 31, 59, 34, 14, 60, 47, 36, 36));
        seznami.add(List.of(14, 36, 86, 44, 94, 16, 68, 56));
        seznami.add(List.of(0, 81, 14, 91, 98, 57, 32, 65, 89, 36));
        seznami.add(List.of(14, 93, 40, 60, 84, 23, 18, 36, 31, 18, 93, 5, 8, 3, 15));
        seznami.add(List.of(64, 36, 78, 41, 36, 60, 10, 0, 48, 74, 84, 52, 0, 26, 31, 8, 14, 99));
        seznami.add(List.of(68, 43, 33, 46, 4, 21, 17, 37, 62, 91, 36, 71, 6, 53, 14));
        seznami.add(List.of(9, 35, 20, 52, 36, 14, 36, 71));
        seznami.add(List.of(4, 99, 36, 9, 41, 14));
        seznami.add(List.of(2, 44, 65, 14, 63, 92, 0, 99, 36, 24, 24, 24));
        seznami.add(List.of(68, 18, 59, 30, 23, 44, 53, 32, 41, 75, 14, 18, 5, 14, 36, 32, 13, 87));
        seznami.add(List.of(69, 30, 27, 69, 82, 35, 36, 58, 50, 67, 3, 5, 38, 8, 62, 75, 29, 14, 52, 8, 37, 15));
        seznami.add(List.of(36, 69, 41, 71, 54, 14));
        seznami.add(List.of(54, 81, 36, 45, 43, 14, 98, 88, 21, 40, 84, 40));
        seznami.add(List.of(80, 14, 19, 86, 91, 47, 36));
        seznami.add(List.of(59, 52, 41, 14, 96, 88, 84, 97, 92, 84, 48, 33, 22, 36, 29, 36, 30, 83, 3, 10, 69, 90));
        seznami.add(List.of(36, 53, 95, 3, 27, 14, 87, 87, 66));
        seznami.add(List.of(3, 1, 75, 14, 64, 42, 64, 1, 15, 99, 43, 36));
        seznami.add(List.of(87, 78, 1, 31, 36, 99, 14, 91, 62, 89));
        seznami.add(List.of(74, 42, 81, 27, 14, 36, 37, 0, 50, 29, 23, 63, 91));
        seznami.add(List.of(55, 0, 33, 47, 1, 14, 2, 38, 65, 36));
        seznami.add(List.of(35, 78, 56, 14, 65, 82, 82, 53, 23, 76, 38, 13, 99, 36, 76, 74, 35, 56, 79));
        seznami.add(List.of(13, 48, 36, 3, 48, 5, 24, 41, 81, 14, 17, 82, 62));
        seznami.add(List.of(50, 14, 36));
        seznami.add(List.of(14, 57, 36, 56));
        seznami.add(List.of(13, 36, 64, 14));
        seznami.add(List.of(50, 14, 91, 66, 58, 23, 36, 30, 56, 35, 49, 69, 94, 62, 33, 65));

        Set<Integer> mnozica = Cetrta.skupni(seznami);

        List<Integer> lstMnozica = new ArrayList<>(mnozica);
        lstMnozica.sort(null);
        System.out.println(lstMnozica);
    }
}
