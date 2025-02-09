
import java.util.*;

public class Test02 {

    public static void main(String[] args) {
        List<List<Character>> seznami = new ArrayList<>();

        seznami.add(List.of('D', 'P', 'd', '6', '5', 'F', 'T', 'b', 'H', 'r', 'k', 'm', 'a', 'U', 'l', 'a', 'f', '6', 'u', '8', 'h', 'l', 'j', '2', '6', 't', 's', '3', 'H', 'B'));
        seznami.add(List.of('5', 'l', 'k', 'P', 'U', '8', 't', 'r', 'f', '6', 'm', 'a', 'D', 'h', 'j', 's', 'F', '2', '8', 'B', '3', 'u'));
        seznami.add(List.of('B', '2', 'm', '8', 'f', 'y', 'p', 'I', '3', 'j', 'a', 'l', 'H', 'o', 'o', 'n', '6', 'L', 'y', '4', '2', 'U', 'F', 'k', 'P', 'h', '5', 'l', 'd', 'r', 'E', '8', 'D', '1', 't', 'j', 'R', 'u', '5'));
        seznami.add(List.of('w', 'B', 'K', '6', 'a', 'C', 'J', 'l', 'q', '2', 'F', 'h', 'f', 'T', 'k', 'p', 's', 'j', '8', 'm', '5', 'V', 'D', '3', 'r', 'u', 't', 'h', 'U', 'P'));
        seznami.add(List.of('V', 'm', '6', '3', 'a', 'l', 'x', 'B', 'k', 'P', 'r', 'A', 'J', 'r', '2', 'L', 'f', 't', 'H', 'F', 'y', '5', 'j', 'j', 'D', 'n', 'h', 'u', 'U', 'X', '8'));
        seznami.add(List.of('X', 'q', 'n', 'D', 'I', '8', 'w', '2', 'U', 'k', 't', 'B', 'O', 'l', 'F', 'u', '2', 'S', 'K', 'q', 'v', '3', 'l', 'm', 'r', 't', 'R', 'P', '5', 'm', 'Y', 'c', 'a', 'f', 'j', '6', 'h', 'D'));
        seznami.add(List.of('f', 'j', 'F', 'h', 'R', 'v', 'w', 'a', '7', 'u', 'K', '2', 'B', 'P', '_', '3', '5', 'n', 'k', 'U', 'U', 'r', 'm', '6', 'C', 'r', 't', 'l', 'D', '8'));
        seznami.add(List.of('u', 'u', 't', 'm', '5', 'Y', '6', 'w', 'h', 'B', '8', 'e', 'r', 'P', 'I', 'D', 'D', 'k', 'i', '5', 'l', 'f', '2', 'j', 'a', 'q', 'U', 'F', 'f', 'H', 'u', 'p', '3'));
        seznami.add(List.of('l', '3', '6', 'a', 'U', 'h', 'j', 's', '2', 'k', 'B', '8', 'D', 'X', 'm', 'r', 'f', 't', 'F', 'h', 'u', 'P', '5', 's', '7'));
        seznami.add(List.of('U', 'F', 'O', 'u', 'r', '8', 'Y', 'I', 'h', 'm', 'm', '5', 'j', 'O', 'B', 'f', 'k', 'g', 't', 'D', '3', '6', '2', '2', 'l', 'P', 'a'));
        seznami.add(List.of('l', '3', '6', 'Q', 'D', 'B', 'Y', 'P', 'd', '2', 't', 'm', '2', 'S', '2', 'F', '5', 'f', 'y', 'k', 'g', 'P', 'U', 'l', 'j', 'h', 'Y', '8', 'N', 'P', 'A', 'a', 'u', 'r'));
        seznami.add(List.of('l', 'y', 'J', '8', 'x', 'D', '3', 'J', 'C', '6', 'k', 'j', 'h', 'm', 'X', 'r', 'O', 'A', '5', 'U', 'u', 'F', 'P', 't', 'f', '_', 'A', 'B', 'w', 'h', 'L', 'a', 'u', '2'));
        seznami.add(List.of('2', 'f', 'F', '3', 'j', 't', '2', 'B', 'u', 'P', 'D', '6', 'I', 'k', '5', 'r', 'm', 'h', '8', 't', 'l', 'x', 'U', 'a', 'I', 't', '1', '6', 'd', 'X', 'U', 'V', '2', 'l', 'M'));
        seznami.add(List.of('3', '5', '8', 'U', 'f', 'c', '2', 'j', 'F', 'q', 'j', 'q', 'P', 'a', '3', 'W', 'k', '3', 'P', 't', '5', 'r', 'h', 'u', 'l', 'B', 'g', 'Y', '8', '6', 'm', 'I', 'D', 'y'));
        seznami.add(List.of('8', '3', 'D', 'B', '2', '6', 'm', 'h', 'I', 't', 'j', 'X', 'k', 'F', 'y', 'a', 'f', '5', '4', 'U', 'u', 'r', '_', 'P', 'l'));
        seznami.add(List.of('j', 'B', 'F', '8', 'u', 'h', 'l', '3', 'h', 'a', 'f', '_', 'F', 'f', 'L', '6', '6', 'P', 'U', 'm', 'U', 'k', 'r', 't', '2', '5', 'D'));

        Set<Character> mnozica = Cetrta.skupni(seznami);

        List<Character> lstMnozica = new ArrayList<>(mnozica);
        lstMnozica.sort(null);
        System.out.println(lstMnozica);
    }
}
