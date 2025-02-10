
import java.util.*;

public class Test25 {

    public static void main(String[] args) {
        List<List<Integer>> seznami = new ArrayList<>();

        seznami.add(List.of(6, 40, 53, 84, 63, 16, 92, 79, 29, 23, 58, 31, 73, 70, 97));
        seznami.add(List.of(73, 36, 84, 39, 16, 26, 77, 70, 86, 23, 68));
        seznami.add(List.of(79, 59, 71, 84, 16, 7, 23, 31, 73, 4, 49, 70));
        seznami.add(List.of(73, 52, 70, 25, 84, 45, 1, 42, 23, 16));
        seznami.add(List.of(73, 93, 84, 3, 26, 16, 65, 38, 83, 5, 70, 23));
        seznami.add(List.of(16, 94, 25, 73, 70, 51, 7, 23, 63, 19, 92, 48, 97, 84, 22, 4, 9, 61));
        seznami.add(List.of(73, 12, 86, 89, 82, 23, 46, 17, 70, 26, 36, 52, 25, 27, 59, 3, 84, 38, 53, 16, 29, 94, 85, 51, 66));
        seznami.add(List.of(56, 11, 46, 69, 70, 40, 32, 59, 4, 20, 57, 1, 38, 27, 48, 16, 44, 73, 10, 55, 84, 23, 29));
        seznami.add(List.of(70, 84, 16, 23, 7, 93, 72, 73, 15));
        seznami.add(List.of(8, 65, 16, 23, 74, 54, 32, 84, 36, 29, 70, 73, 30));
        seznami.add(List.of(23, 80, 70, 6, 41, 98, 84, 16, 43, 22, 19, 69, 40, 73, 97));

        Set<Integer> mnozica = Cetrta.skupni(seznami);

        List<Integer> lstMnozica = new ArrayList<>(mnozica);
        lstMnozica.sort(null);
        System.out.println(lstMnozica);
    }
}
