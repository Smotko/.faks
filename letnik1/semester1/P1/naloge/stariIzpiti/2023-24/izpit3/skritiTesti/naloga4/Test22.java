
import java.util.*;

public class Test22 {

    public static void main(String[] args) {
        List<List<Integer>> seznami = new ArrayList<>();

        seznami.add(List.of(76, 19, 45, 23, 50, 35, 4, 89, 32, 5, 37, 69, 10));
        seznami.add(List.of(69, 50, 6, 74, 59, 48, 76, 23, 59, 88, 20, 48, 37, 19, 28, 38));
        seznami.add(List.of(64, 69, 0, 65, 41, 32, 59, 92, 4, 59, 45, 19, 79, 74, 50, 30, 76, 9, 78));
        seznami.add(List.of(32, 66, 69, 30, 46, 86, 89, 76, 36, 50, 91, 10, 19, 72, 78, 84, 82, 57, 79, 39, 79, 63, 50, 54));
        seznami.add(List.of(47, 86, 66, 86, 76, 29, 0, 44, 34, 76, 19, 50, 45, 3, 35, 69));
        seznami.add(List.of(50, 90, 19, 42, 47, 93, 11, 76, 29, 49, 69, 71, 9, 5));
        seznami.add(List.of(15, 98, 82, 3, 89, 47, 71, 19, 89, 32, 50, 76, 65, 69, 36));
        seznami.add(List.of(50, 19, 11, 76, 78, 56, 69, 82, 9, 49, 58));
        seznami.add(List.of(50, 38, 65, 38, 3, 76, 69, 39, 12, 70, 67, 93, 76, 63, 19, 55));
        seznami.add(List.of(49, 69, 89, 9, 0, 34, 97, 45, 0, 38, 13, 9, 76, 63, 75, 1, 19, 84, 45, 50));

        Set<Integer> mnozica = Cetrta.skupni(seznami);

        List<Integer> lstMnozica = new ArrayList<>(mnozica);
        lstMnozica.sort(null);
        System.out.println(lstMnozica);
    }
}
