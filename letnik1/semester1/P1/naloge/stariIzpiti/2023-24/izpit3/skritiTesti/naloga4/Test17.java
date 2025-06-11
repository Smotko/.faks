
import java.util.*;

public class Test17 {

    public static void main(String[] args) {
        List<List<Character>> seznami = new ArrayList<>();

        seznami.add(List.of('Y', '0', 'w', 'S', 'A', 'V', 'M', 'X', 'i', 'Q', 'J', 'H', '2', 'r', 'o', '_', 'W', 'F', 'u'));
        seznami.add(List.of('8', '3', '_', 'f', 'B', '4', 'J', '0', 'q', 'u', 'X', 'O', '2', 'M'));
        seznami.add(List.of('a', 'Q', 'x', 'E', 'n', 'f', '4', 'G', '3', 'v', '5', 'm', 'q', 'u', 'L', 'N'));
        seznami.add(List.of('u', 'T', '8'));
        seznami.add(List.of('0', 'u', 'c', '1', 'k', 'h', '_', 'V', '6', 'C', 'x', 's', 'M', 'l', 'v', 'p', 'Y'));
        seznami.add(List.of('l', 'O', 'J', 'M', 'b', '5', 'g', 'Q', '6', 'a', 'F', '8', 'X', 'D', 'c', 'u', 'm'));
        seznami.add(List.of('D', '6', 'S', 'H', 'l', 'u', 's'));
        seznami.add(List.of('r', 'U', 'M', 'D', 's', '4', 'u', 'l', 'd', 'c', 'j', 'T', 'n'));
        seznami.add(List.of('u', 'S', '8', 'W', '2', 'Y', '7', 'N', '0'));
        seznami.add(List.of('X', 'M', 'k', '6', 'u', 'D', 'B', 'm', 'q', 'L', 'b'));
        seznami.add(List.of('t', 'r', 'u', 'j', 'N', '8', 'p', 'F', 'q', '1', 'H', 'g'));
        seznami.add(List.of('F', 'b', 'k', 'x', 'G', 'X', 'R', '1', 'u'));
        seznami.add(List.of('w', 'y', 'h', 'u', 'C', '1', 'a', 'Q'));
        seznami.add(List.of('C', 'J', 'H', 'x', '3', 'm', '1', 'U', 'O', 'v', 'A', '2', 'D', 'u', 'K', '6', '5', 'R'));
        seznami.add(List.of('s', '5', 't', '7', '4', 'd', 'S', 'r', 'B', 'u'));
        seznami.add(List.of('g', 'L', 't', 'U', 'W', 'I', 'u', 'F', '_', 'O', 'T', '5', 'b', 'd', 'M', 'e', 'E', 'X', 'K', 'm'));
        seznami.add(List.of('u', 'x', 'q', 'A', '1', 'n'));
        seznami.add(List.of('u', 'X', 'U', '_', 'P', 'f'));
        seznami.add(List.of('e', 'u', 'w', 'N', 'B', 'a', '2', 'U', 'Y', '0', '7', 'A', 'q', 'C', 'I', 'g'));
        seznami.add(List.of('W', 'V', 'g', 'a', '5', 'u', 'D', 'o', 'y', 'O', 'P', 'S'));
        seznami.add(List.of('n', 'u', '3', 'h', 'x', '0', 'o', 'm', 'q', 'w', 'U', 'd', '7', 'D', 'P', 'B', 'K', 'V', 'g', 'S'));
        seznami.add(List.of('h', '5', 'W', 'P', 'H', 'g', 'Q', 'u', '1'));
        seznami.add(List.of('Y', 'G', '5', '0', 'S', 'i', 'j', 'R', 'N', '6', '4', 'D', 'M', 'u', 'E', '2', 'C', 'c', 'g', 'f'));
        seznami.add(List.of('D', 'u', 'P', 'c', 'j', 't', 'o', '6', '8', 'g', 'C', 'B', 'X', 'f', 'F', 'V', 'H', '1', 'Y', 'm'));
        seznami.add(List.of('M', 'V', 'n', 'N', 'G', 'u', 'Y', 'F', 'x'));
        seznami.add(List.of('P', 'U', 'X', 'u', 'A', 'V'));
        seznami.add(List.of('k', 'u'));
        seznami.add(List.of('A', 'Q', 'c', 'j', 'B', 'U', 't', 'u', 'e', 'k', '4', 'W'));
        seznami.add(List.of('7', 'N', 'F', '3', 'x', 'a', 'T', 'k', 'H', 'u', 'I'));
        seznami.add(List.of('j', 'u'));
        seznami.add(List.of('W', 'u', 'v', '_', 'b', 'R', 'g', 's', '8'));
        seznami.add(List.of('D', 'u', 'Y', '2', 'o', 'g', 'k', 'G', '7', '8', 'q', 'd', 'j', 'H', '4', 'h', '6', 'U', 'X'));
        seznami.add(List.of('D', 'I', 'X', 'h', 'R', 'q', 'Q', 'E', 'u', 'p', '_', 'H', 'l', 'n', '7', 'c', 'g'));
        seznami.add(List.of('u', 'K', 'F', 'y', 'e', 'w', 'l', '3'));
        seznami.add(List.of('8', 'n', 'y', 'r', 'A', 'u'));
        seznami.add(List.of('w', 'o', 'd', 'r', 'g', 'R', 'N', 't', '5', 'T', 'V', 'c', 'a', 'u', 'M', 'p', '2', '7', 'b', 'k', 'e'));
        seznami.add(List.of('K', 'u'));

        Set<Character> mnozica = Cetrta.skupni(seznami);

        List<Character> lstMnozica = new ArrayList<>(mnozica);
        lstMnozica.sort(null);
        System.out.println(lstMnozica);
    }
}
