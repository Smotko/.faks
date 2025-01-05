
import java.util.*;

public class Test19 {

    public static void main(String[] args) {
        List<List<Integer>> seznami = new ArrayList<>();

        seznami.add(List.of(6, 81, 10, 92, 22, 24, 98, 91));
        seznami.add(List.of(90, 89, 95, 10, 27, 18, 6, 91, 73, 22, 83, 98, 93, 40, 4, 15, 54));
        seznami.add(List.of(47, 55, 37, 94, 13, 6, 3, 40, 10, 49, 72, 70, 91, 79, 60, 22, 16, 54, 71, 63, 98));
        seznami.add(List.of(91, 70, 22, 41, 25, 50, 42, 10, 6, 98, 76, 23));
        seznami.add(List.of(98, 10, 54, 49, 22, 81, 38, 94, 33, 91, 79, 37, 6, 56));
        seznami.add(List.of(10, 91, 98, 22, 5, 6));
        seznami.add(List.of(84, 71, 41, 44, 98, 76, 61, 74, 22, 6, 54, 80, 10, 21, 38, 58, 91));
        seznami.add(List.of(57, 30, 63, 91, 70, 44, 4, 10, 16, 22, 98, 6));
        seznami.add(List.of(42, 18, 72, 44, 6, 88, 30, 91, 23, 98, 31, 85, 76, 80, 27, 10, 22, 7));

        Set<Integer> mnozica = Cetrta.skupni(seznami);

        List<Integer> lstMnozica = new ArrayList<>(mnozica);
        lstMnozica.sort(null);
        System.out.println(lstMnozica);
    }
}
