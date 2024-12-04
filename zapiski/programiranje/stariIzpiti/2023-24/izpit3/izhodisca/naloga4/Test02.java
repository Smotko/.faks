
import java.util.*;

public class Test02 {

    public static void main(String[] args) {
        List<List<Integer>> seznami = new ArrayList<>();

        seznami.add(List.of(1, 2, 3, 1, 2, 3, 4, 5));
        seznami.add(List.of(5, 5, 1, 1, 3, 2, 2, 6));
        seznami.add(List.of(2, 2, 6, 5, 5, 5, 6, 4, 1, 1, 1, 3, 3, 3));
        seznami.add(List.of(1, 1, 4, 4, 4, 6, 6, 6, 5, 3, 5, 3, 5));

        Set<Integer> mnozica = Cetrta.skupni(seznami);

        List<Integer> lstMnozica = new ArrayList<>(mnozica);
        lstMnozica.sort(null);
        System.out.println(lstMnozica);
    }
}
