
import java.util.*;

public class Test01 {

    public static void main(String[] args) {
        List<List<Character>> seznami = new ArrayList<>();

        seznami.add(List.of('E', 'G', 'C', 'F'));
        seznami.add(List.of('G', 'A', 'C', 'I'));
        seznami.add(List.of('F', 'C', 'G'));

        Set<Character> mnozica = Cetrta.skupni(seznami);

        List<Character> lstMnozica = new ArrayList<>(mnozica);
        lstMnozica.sort(null);
        System.out.println(lstMnozica);
    }
}
