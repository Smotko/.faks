
import java.util.*;

public class Test23 {

    public static void main(String[] args) {
        List<List<Character>> seznami = new ArrayList<>();

        seznami.add(List.of('J', '_', 'Y', 'E', '0', 'W', 'C', 'i', 's', 'X', 'l', 'j', 'o', 'B', 'U', 'c', '2', 'F', '4', 'D', 'n', 'r', 't'));
        seznami.add(List.of('B', 'U', 'E', 'r', 'j', 'd', 's', 'Y', 'W', 'D', 'K', '4', 'l', '_', 'm'));
        seznami.add(List.of('E', 'U', 's', '_', 'B', 'Y', 'N', 'j', '4', 'l', 'e', 'D', 'R', 'P', 'W', 'V'));
        seznami.add(List.of('E', 'B', 'Y', 'A', 'l', '4', '_', 'W', 'D', 's', 'e', 'j', 'U'));
        seznami.add(List.of('q', 'E', 'W', '_', '3', 'n', 'Y', 's', 'T', 'U', '4', 'w', 'M', 'l', 'D', 'i', 'B', 'j'));
        seznami.add(List.of('1', 'x', 'k', 'T', 'D', 'i', 'B', 'S', 'J', '4', 'W', 'j', 'y', 'w', 'Y', 's', 'n', 'l', 'Q', 'o', 'q', 'U', '_', 'C', 'E', 'b'));
        seznami.add(List.of('E', '_', 'u', 'W', 'o', 's', 'B', 'x', 'n', 'j', 'Y', 'U', 'h', '4', 'y', 'D', 'l'));
        seznami.add(List.of('4', 'v', 'j', 'W', 'D', 'U', 'E', 's', 'Y', 'h', '_', 'N', 'B', 'K', 'I', '2', 'l', '6', '8'));
        seznami.add(List.of('W', 'D', 'U', 'j', 'B', 's', 'l', 'y', 'd', '_', 'Y', '4', 'E'));
        seznami.add(List.of('U', 'W', 'Y', 'j', 'D', 'I', '4', 'E', 's', 'B', '_', 'l'));
        seznami.add(List.of('3', 'r', '_', 'g', 'l', 'O', 's', 'U', 'Y', 'W', 'j', 'B', 'E', 'C', 'F', 'y', '6', 'A', '4', 'D'));
        seznami.add(List.of('H', 's', 'Y', 'X', 'j', '0', 'P', 'W', 'D', 'C', 'E', 'M', '4', 'B', 'K', 'N', 'U', 'l', '_'));
        seznami.add(List.of('j', '4', 'B', 'U', 'l', 'Q', 'Y', '_', 'E', 'W', 's', '6', 'D'));
        seznami.add(List.of('5', 's', 'B', 'l', 'F', 'E', '4', 'x', 'U', 'n', 'r', '_', 'd', 'w', 'D', 'W', '3', 'j', 'm', 'Q', 'y', 'Y', 'c'));
        seznami.add(List.of('B', 'q', 'a', 'j', 'D', 'l', '2', 'Y', '3', 'K', '4', 'W', 'F', 'b', 'E', 'U', 's', '_'));

        Set<Character> mnozica = Cetrta.skupni(seznami);

        List<Character> lstMnozica = new ArrayList<>(mnozica);
        lstMnozica.sort(null);
        System.out.println(lstMnozica);
    }
}
