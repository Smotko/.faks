
import java.util.*;

public class Test04 {

    public static void main(String[] args) {
        List<List<Character>> seznami = new ArrayList<>();

        seznami.add(List.of('a', 'm', '7', 'n', 'N', 'P', 'f', 'G', '5', 'g', 'X', 'Y', 't', 'W', 'K', '3', 'C', 'T', 'J', 'C', 'l'));
        seznami.add(List.of('3', 'N', 'X', 'D', 'g', 'C', 'a', 'm', 'Y', 'G', 'b', '5', 'K', 'P', 'f', 'l', '7', 'W', 'T'));
        seznami.add(List.of('x', '5', 'P', 'N', 'm', 'a', 'T', 'K', 'Y', 'W', 'Y', 'X', 'C', '7', 'g', 'l', '3', 'G', 'f', 'A'));
        seznami.add(List.of('3', 'p', 'f', '7', 'm', 'P', 'g', 'a', 'G', 'k', 'l', 'C', 'T', '5', 'X', 'N', 'W', 'K', 'Y'));
        seznami.add(List.of('g', 'N', 'X', 'f', '3', '5', 'C', 'T', 'l', 'G', 'X', 'P', 'K', 'W', '7', 'm', 'a', 'G', '4', 'G', 'Y', 'e'));
        seznami.add(List.of('C', 'S', '6', 'n', 'f', '6', 'K', 'T', 'm', 'J', 'h', 'X', '3', 'W', '4', 'l', 'P', 'D', '0', 'N', 'G', 'a', 'A', 'g', 'w', '5', 'C', '7', 'Y', 'Y'));
        seznami.add(List.of('Y', 'l', 'L', 'y', 'C', 'g', '5', 't', '7', 'T', 'l', 'U', 'g', 'q', 'm', 'N', 'P', 'W', 'I', '3', 'f', 'D', 'Q', 'X', 'P', 'a', '6', 'm', 'K', 'a', 'W', 'G'));
        seznami.add(List.of('7', 'X', 'p', 'Q', 'w', 'C', 'l', 'f', 'T', 'X', '2', 'K', 'N', 'l', 'B', 'o', 't', 'P', 'a', 'V', '5', 'e', 'v', '3', 'W', 'w', 'm', 'g', 'G', 'Y', 't'));
        seznami.add(List.of('m', 'N', '5', 'C', 'T', 'V', 'g', 'P', '7', '3', 'W', 'f', 'O', 'K', 'l', 'Y', 'X', 'G', 'a'));
        seznami.add(List.of('C', 'Y', 'l', 'G', '3', 'X', 'P', 'g', 'K', 'F', 'a', 'M', 'W', 'f', '5', 'N', 'm', '7', 'T'));
        seznami.add(List.of('7', 'g', 'W', 'X', 'i', 'p', 's', '3', 'Y', 'G', '1', 'w', 'M', 'l', 'C', '8', '5', 'P', 'm', 'a', 'N', 'K', 'f', 'e', 'T'));
        seznami.add(List.of('f', 'G', 'l', 'T', '3', 'Y', 'K', '5', 'g', 'N', 'C', 'X', 'P', 'a', '7', 'W', 'm', 'X'));
        seznami.add(List.of('X', '5', 'W', 'g', 'Y', 'N', 'a', 'T', 'i', '3', 'l', 'b', 'i', 'P', 'C', 'm', 'K', 'f', 'G', '7'));
        seznami.add(List.of('D', 'G', 'F', '4', 'Y', 'l', '4', 'P', 'W', 'G', 'f', 'm', 'T', 'g', '3', 'N', 'u', '5', 'K', 'a', '7', 'X', 'C'));
        seznami.add(List.of('v', 'P', 'G', 'f', 'a', 'W', '3', 'Y', 'K', 'X', 'J', 'I', 'm', '7', '6', 'J', '6', 'g', 'i', '5', 'W', 'R', 'T', 'F', 'C', 'N', 'l', 'h'));
        seznami.add(List.of('T', '7', 'a', 'Y', 'l', '5', 'X', 'W', 'K', '3', 'C', 'm', 'g', 'G', 'l', 'f', 'N', 'P'));
        seznami.add(List.of('g', 'X', 'g', 'Y', 'l', 'G', 'T', '3', 'x', '5', 'P', 'W', 'X', 'Q', 'Q', '7', 'K', 'l', 'F', '6', 'N', 'm', 'l', 'Y', 'p', '7', 'f', '3', 'a', 'C', 'G'));
        seznami.add(List.of('5', 'T', 'o', '7', 'N', 'h', 'e', '8', 'j', 'C', 'm', 'l', '3', '6', 'G', 'Y', 'p', 'f', 'h', 'g', 'G', 'X', 'U', 'a', 'W', 'K', 'P'));
        seznami.add(List.of('a', 'C', 'T', 'Y', 'K', 'm', 'P', 'W', 'g', 'o', 'N', 'm', '3', 'f', 'G', 'e', '5', 'X', 'l', '5', '7', 'A'));
        seznami.add(List.of('a', 'x', '3', 'T', 'o', '5', 'W', 'c', 'G', 'C', 't', 'K', 'f', 'P', 'G', 'l', 'q', '5', 'l', 'E', 'm', 'g', 'j', 'X', '7', 'Y', 'N', 'P', 'D', 'f', 'a'));
        seznami.add(List.of('3', 'Y', 'C', 'K', 'g', 'P', 'h', '7', '5', 'G', 'h', 'N', '_', 'V', 'm', '2', '4', 'f', 'a', '8', 'X', 'W', 'l', 'H', 'T'));
        seznami.add(List.of('8', '1', 'O', 'p', 'P', 'i', 'e', 'u', '0', 'w', 'R', '7', 'Y', 'm', 'e', 'l', '5', 'x', 'T', 'X', '3', 'a', 'G', 'I', 'm', 'N', 'W', 't', 'f', 'K', 'C', 'i', 'N', 'g'));
        seznami.add(List.of('N', '7', 'G', '7', 'u', 'G', 'f', 'X', '5', 'C', 'm', 'l', 'a', 'Q', 'W', 'g', 'T', 'K', '3', 'P', 'Y', '1'));
        seznami.add(List.of('S', 'T', 'l', 'm', 'P', 'X', 'C', 'W', 'g', 'f', 'N', '3', 'Q', '7', 'B', 'K', 'L', '5', 'g', 'q', 'Y', 'a', 'X', 'G', 'n'));
        seznami.add(List.of('K', 'C', 'd', 'J', 'l', 'r', 'Y', 'a', '7', '5', '3', 'G', '3', 'f', 's', 'f', 'f', 'R', 'n', '2', 'W', '5', 'm', 'P', 'X', '1', 'i', 'k', 'N', 'T', 'g', 'X', 'o'));
        seznami.add(List.of('W', 'M', 'Y', 'N', 'P', 'P', 'X', 'a', 'X', '7', 'f', 'm', 'O', 'l', 'h', 'C', '7', 'N', 'd', 'L', 'g', 'e', '_', 'u', 'G', 'W', 'f', '3', 'X', 'T', '5', 'J', 'g', 'K', 's', 'u'));
        seznami.add(List.of('k', 'X', '7', 'X', 'D', 'K', '5', 'l', 'E', 'c', 'W', '7', '3', 'Y', 'm', 'f', 'n', 'S', 'a', 'C', 'T', '7', 'G', 'N', 'f', 'g', 'J', 'P', 'r'));
        seznami.add(List.of('3', 'h', 'K', 'm', 'G', 'W', '5', 'p', 'O', 't', 'g', 'y', 'P', 'E', 'a', '5', 'X', 'O', '3', '8', '7', 'Q', 'Y', 'f', 'o', '8', 'T', 'N', 'l', 'C'));
        seznami.add(List.of('7', 'm', '5', 'C', 'g', 'N', 'Y', 'X', 'm', 'P', 'T', 'a', 'G', 'K', 'W', 'f', 'M', 'l', '3'));
        seznami.add(List.of('K', 'm', 'g', 'k', 'l', 'Y', 'G', 'X', 'F', '7', 'W', 'C', '5', '3', 'b', 'T', 'K', 'k', 'o', 'o', 'l', 'P', 'a', 'N', 'f'));
        seznami.add(List.of('6', 'l', 'w', '5', 'm', 'X', 'P', 'l', 'a', 'K', 'T', '7', 'A', '3', 'C', 'g', 'p', 'f', 'W', 'N', 'Y', 'G'));
        seznami.add(List.of('3', 'l', 'g', 'f', 'a', '7', '0', '5', 'K', 'A', 'G', 'r', 'j', 'C', 'K', 'Y', 'P', 'X', 'J', 'U', 'W', 'T', 'd', 'N', '2', 'm', '5'));
        seznami.add(List.of('l', 't', 'I', 'l', 'f', 'M', 'f', 'N', 'J', 'g', '3', 'm', 'Y', 'W', 'U', 'X', 'G', 'g', 'P', 'T', 'n', 'V', 'c', 'C', 'x', 'G', '7', 'l', '7', 'a', 'h', '5', '0', 'K', '5', 'N', '5'));
        seznami.add(List.of('N', '0', '7', 'W', '5', 'W', 'T', '0', 'm', 'f', 'Y', 'G', 'h', 'g', 'K', 'm', '3', 'l', 'o', 'O', 'P', 'C', 'Y', 'X', 'a'));
        seznami.add(List.of('3', 'y', 'l', 'K', '5', 'M', 'y', 'W', 'a', 'T', 'm', 'C', 'G', 'X', '7', 'N', 'w', 'f', 'a', 'Y', 'g', 'P'));
        seznami.add(List.of('T', 'W', 'm', '7', 'K', 'f', 'l', 'N', '5', 'Y', 'X', 'G', 'Y', 'N', '_', 'I', '3', 'g', 'C', 'W', 'P', 'a'));
        seznami.add(List.of('7', 'U', 'a', 'l', 'K', 'T', 'm', 'g', 'P', 'W', 'N', 'C', '5', 'Y', 'G', '8', '3', 'a', 'f', 'X'));
        seznami.add(List.of('Y', 'a', 'X', 'P', 'O', 'E', 'g', 'W', 'K', 'f', 'G', 'C', 'p', 'M', 'N', 'l', '5', 'a', '7', 'm', 'T', '3', 'N'));
        seznami.add(List.of('X', 'C', 'X', '6', '7', 'm', 'w', 'Y', 'T', 'R', '4', 'H', '3', '1', 's', 't', 'a', 'f', 'J', '8', 'H', '5', 'g', 'g', 'P', 'C', 'W', 'K', 'l', 'G', 'N'));
        seznami.add(List.of('r', 's', 'K', 'P', 'W', 'a', 'g', 'o', 'v', '7', 's', 'W', 's', 'G', 'X', 'W', 'U', 'H', 'B', 'l', 'B', 'g', '4', 'N', '3', '5', 'T', '1', 'm', 'C', 'f', 'Y', '4'));
        seznami.add(List.of('G', '_', 'T', '5', 't', 'a', 'N', '3', 'P', 'f', 'S', 'G', 'X', '3', 'l', 'A', 'Y', 'K', 'y', 'm', 'C', 'W', 'g', '7'));
        seznami.add(List.of('m', 'a', 'C', 'V', 'T', 'T', 'P', 'X', '5', 'Y', 'W', 's', '7', 'l', '3', 'R', 'K', 'B', 'K', 'f', 'N', 'i', 'g', 'G', 'V', '0'));

        Set<Character> mnozica = Cetrta.skupni(seznami);

        List<Character> lstMnozica = new ArrayList<>(mnozica);
        lstMnozica.sort(null);
        System.out.println(lstMnozica);
    }
}
