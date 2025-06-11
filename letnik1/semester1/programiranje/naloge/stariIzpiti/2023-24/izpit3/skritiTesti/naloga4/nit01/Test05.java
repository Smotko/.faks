
import java.util.*;

public class Test05 {

    public static void main(String[] args) {
        List<List<Character>> seznami = new ArrayList<>();

        seznami.add(List.of('2', 'U', 'W', 'r', 'J', 'A', 'K', 'N', 'h', '6', 'y', 'H', 's', 'T', 'g', 'R', 'j', 'G', '_', 'O', 'B', 'u', 'Y', '4'));
        seznami.add(List.of('j', 'G', 'R', '2', 'Y', 'A', 'u', 'K', '4', 'C', 'U', 'W', 'J', '6', 'N', 'y', 'O', '7'));
        seznami.add(List.of('u', 'O', 'H', '4', 'w', 'N', 'R', 'j', 'J', 't', 'K', 'A', '6', 'd', 'Y', 'U', 'G', 'W'));
        seznami.add(List.of('R', 'U', 'A', 'L', 'g', 'B', 'O', 'S', 'I', 'p', 'W', 'x', 'X', 'm', 'H', 'b', '_', 'j', 'C', 'v', 'M', 'h', 'G', '4', 'F', 'E', 'J', 'u', 'N', 'K', '5', 'k', 'Y', '6'));
        seznami.add(List.of('Y', '_', '8', '4', 'F', 'N', 'M', 'J', '6', 'U', 'Q', '3', 'O', 'W', 'R', 'g', 'j', 'S', 'E', 'u', 'k', 'L', 'b', 'n', 'y', 'G', 'h', 'V', 'A', 'K', 'C'));
        seznami.add(List.of('2', 'O', 'u', 'v', 'k', '5', 's', 'A', '_', '8', 'N', 'K', 'j', '1', 'Y', '6', 'F', '4', 'U', 'p', 'V', 'E', 'o', 'i', 'h', 'J', 'w', 'G', 'R', 'W', 'q', 'T', '3', 'c'));
        seznami.add(List.of('K', 'W', 'P', 'N', 'U', 'J', 'A', 'O', 'Y', '4', '6', 'G', 'X', 'u', 'g', 'R', 'j', 'i', 'E', 'a', 'B', 'v', 'q'));
        seznami.add(List.of('B', '4', 'u', 'K', 'I', 'W', 'J', 'G', 'R', 'Y', 'j', 'O', '6', 'A', 'U', 'N'));
        seznami.add(List.of('6', 'u', 'U', 'K', 'j', '4', 'X', 'O', 'J', 'A', 'W', 'Y', 'G', 'R', 'N'));
        seznami.add(List.of('6', 'U', 's', 'J', 'v', 'C', 'e', 'u', 'N', '1', '3', '_', 'O', 'c', 'A', 'G', 'j', 'R', 'K', '4', 'W', 'Y', 'H'));
        seznami.add(List.of('N', 'G', '6', 'K', 'U', '7', 'W', 'Y', 'A', 'O', 'u', 'R', 'j', '4', 'J'));
        seznami.add(List.of('U', 'N', 'j', '6', 'E', 'R', 'u', 'G', 'F', 'J', 'K', '4', 'Y', 'O', 'A', 'W'));
        seznami.add(List.of('G', 'W', 'O', 'j', '6', 'A', 'P', 'Y', 'N', '5', 's', 'U', 'u', 'K', '4', 'R', 'J'));
        seznami.add(List.of('i', 'u', 'K', 'a', 'E', '2', 'P', 'c', 'O', 'R', 'U', 'W', 'Q', 'g', 'G', 'N', '6', 'j', 'Y', '4', 'A', 'S', 'J', 'H'));
        seznami.add(List.of('F', 'R', 'W', 'U', '4', 'N', 'j', 'A', 'h', 'B', 'K', 'Y', 'J', 'G', '6', 'O', 'u'));
        seznami.add(List.of('Y', 'J', 'A', 'O', 'C', 'U', 'K', '6', 'G', 'R', 'W', 'j', '4', 'u', 'N'));
        seznami.add(List.of('W', 'j', 'G', 'b', 'A', 'u', '_', 'Y', '5', '6', 'J', 'x', '4', '2', 'Q', 'c', '1', 't', 'w', 'R', 'P', 'U', 'H', 'K', 'N', 'E', 'y', 'O', 'D'));
        seznami.add(List.of('U', 'N', 'Y', 'I', 'G', 'O', 'j', '6', '4', 'J', 'W', 'u', 'K', '7', 'R', 'A'));
        seznami.add(List.of('K', '4', 'G', '5', 'o', 'A', 'r', 'u', '0', 'e', 'j', 'N', 'k', 'W', 'Y', 'F', '6', 'g', 'U', 'R', 'J', 'M', '_', 'O', 'P'));
        seznami.add(List.of('W', 'v', 'j', 'R', '5', 'M', 'Y', 'e', 'p', '4', 'J', '2', 'U', 'k', 'O', '6', 'u', 'D', 'S', 'B', 'N', 't', 'm', 'K', 'G', 'A', 'y', 'a'));
        seznami.add(List.of('5', 'O', 'W', 'N', 'K', '6', 'Y', 'G', 'X', 'A', 'g', 'M', 'R', 'U', 'j', 'u', 'J', '4', '_'));
        seznami.add(List.of('f', 'i', 'N', 'w', 'K', 'u', '6', 'J', 'A', 'e', '4', 'G', 'P', 'H', 'j', 'O', '2', 'U', 'W', 'L', 'R', 'Y'));
        seznami.add(List.of('6', 'G', 'Y', '4', 'j', 'O', 'U', 'u', 'W', 'N', 'S', 'A', 'J', 'e', '1', 'K', 'R', 'f'));
        seznami.add(List.of('b', 'Y', 'A', 'R', 'X', '6', 'H', 'u', '5', 'M', 'j', 's', 'q', 'm', 'x', 'L', 'G', 'f', '4', 'w', '0', 'J', 'i', 'T', 'O', 'Q', 'U', 'y', 'N', 'W', 'K'));
        seznami.add(List.of('J', 'A', 's', 'w', '6', 'E', 'G', 'N', '4', 'a', 'V', 'H', 'O', 'W', 'Y', 'U', '0', 'R', 'p', 'u', 'j', 'K', 'Q', 'M', 'y'));
        seznami.add(List.of('e', 'O', 'X', 'j', 't', '8', 'Y', 'u', 'M', 'U', '5', '3', 'R', '6', 'J', 'k', 'I', 'v', 'N', '4', 'W', 'B', '_', 'A', 'K', 'L', 'w', 'G'));
        seznami.add(List.of('G', 'R', 'W', 'w', 'L', 'J', '6', 'N', 'K', 'V', 'j', 'u', '4', 'A', 'Y', 'U', 'O'));
        seznami.add(List.of('6', 'G', 'y', 'j', '4', 'e', 'N', 'u', 'R', 'i', '3', 'Y', 'b', '5', 'O', 'A', 'K', 'T', 'f', 'W', 'C', 'J', 'U'));
        seznami.add(List.of('2', 'u', 'Y', 'F', 'J', 'O', 'A', 'R', 'E', '4', 'W', '6', 'K', 'm', 'j', 'N', '0', 'U', 'G', 'a', 'o'));

        Set<Character> mnozica = Cetrta.skupni(seznami);

        List<Character> lstMnozica = new ArrayList<>(mnozica);
        lstMnozica.sort(null);
        System.out.println(lstMnozica);
    }
}
