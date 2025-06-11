
import java.util.*;

public class Test11 {

    public static void main(String[] args) {
        List<List<Character>> seznami = new ArrayList<>();

        seznami.add(List.of('P', 'n', 'N', 'j', 'v', 'c', '3', 'b', 'U', 'p', 'L', 'l', 'J', 'r', 'E', 't', '4', 'y', 'M', 'W', 'F', 'G', 'a', 'm', 'D', '0'));
        seznami.add(List.of('P', 'q', 'g', 't', 'B', 'i', 'h', '5', 'D', 'E', 'U', '8', 'X', 'T', 'V', 'G', 'l', 'a', '4', 'r', 's', 'O', 'c', 'F', 'j', 'N', 'A', '0', 'Y', 'm', 'p', 'd', '3', 'W', 'b', 'S', 'L', 'v', 'o'));
        seznami.add(List.of('G', 'W', 'l', '5', 'f', '0', 'M', 'R', 'p', '4', 'U', 'C', 'L', 'q', 'P', 'O', 'x', 'N', 'b', '3', 't', 'v', 'j', 'E', 'T', 'F', 'r', 'm', 'a'));
        seznami.add(List.of('J', '4', 'L', 'R', '2', 'H', 'N', 'm', 'n', 'j', '0', 'D', '7', 'c', 'G', 'l', 'M', 'O', 'U', 't', 'X', 'E', 'u', 'x', '3', 'r', 'b', 'k', 'i', 'P', 'y', 'W', 'h', '6', 'p', 'v', 'F', 'a', '5'));
        seznami.add(List.of('2', 'y', 'G', '3', '0', 'L', 'r', 'A', 'n', 'x', 'j', 'f', 'v', 'I', 'b', 'N', 'P', '4', 'p', 'a', 't', 'l', 'h', 'W', 'F', 'U', 'E', 'm', '6', 'R'));
        seznami.add(List.of('F', 'o', '_', '2', 'c', 'K', 'g', 'H', 'M', 'y', '1', '3', 'W', 'm', 't', 'U', 'G', 'T', 'w', 'h', 's', 'x', 'a', 'p', 'N', '0', 'S', 'L', '7', '4', 'l', 'O', 'r', 'b', 'v', 'P', 'j', 'E', 'D'));
        seznami.add(List.of('P', 'q', 'r', 'L', 'm', 'U', 'H', '4', 'W', 'v', 'T', 'K', 'E', 'a', 'j', '3', 'l', 'n', 't', 'F', 'p', '7', 'G', 'N', 'b', '0'));
        seznami.add(List.of('0', 'J', 'U', 'O', 'S', '6', 'N', 'b', 'w', 'm', 'G', 'c', 'P', 'C', 'W', 'l', 'B', 'k', 'p', '4', 'L', 't', 'h', 'E', 'g', '3', 'v', 'j', 'H', 'F', 'A', 'a', 'r'));
        seznami.add(List.of('v', 'j', 'P', 'L', 'U', '3', 'F', 'r', 'G', 't', 'm', 'p', 'W', 'M', '0', 'a', 'b', 'E', 'N', 'l', '4'));
        seznami.add(List.of('l', 'v', 'F', 'P', 'U', 'a', '4', '3', 'N', 'b', 'E', 'j', 'G', 'r', 'X', 't', 'y', 'f', 'h', 'p', 'm', '0', 'W', 'L'));
        seznami.add(List.of('L', '4', 'F', '0', 'J', 'T', 'm', 'B', 'E', '5', 'a', 't', 'g', 'M', 'P', 'N', 'l', 'G', 'W', 'b', 'y', 'U', 'i', 'p', 'V', '3', 'j', 'I', 'r', 'v', '2'));
        seznami.add(List.of('t', 'C', 'L', 'm', 'P', 'N', 'v', 'p', '_', 'G', 'b', 'y', 'd', 'j', '0', 'B', 'r', 'i', '2', 'I', 'V', 'F', '4', 'l', 'U', 'W', 'a', 'g', 'E', 'u', '5', '6', '3'));
        seznami.add(List.of('E', '_', 'D', 'u', 'j', 'X', 'v', 'a', '0', 'p', 't', 'G', 'L', 'g', 'W', 'f', '2', '4', 'd', 'm', 'x', 'y', '3', '8', 'l', 'N', 'R', 'r', 'F', 'U', 'O', 'b', 'P'));
        seznami.add(List.of('D', '2', 'k', 'G', 't', 'E', 'F', 'p', 'j', 'L', 'm', 'W', 'P', 'd', 'v', 'K', 'r', '_', 'a', '3', '0', 'f', 'U', '4', 'N', 'w', 'b', 'l'));
        seznami.add(List.of('3', '2', 'h', 'm', '_', '1', 'D', 'P', 'U', 'r', 'N', 'o', 'L', 'l', '5', 'A', 'x', 't', 'W', 'G', '0', 'a', 'v', 'F', 'C', 'I', 'p', 'E', 'j', 'b', '4'));
        seznami.add(List.of('0', 'a', 'p', 'b', 't', 'e', 'l', '5', 'S', 'F', 'L', '3', 'G', 'O', 'v', '8', 'R', 'W', 'r', 'u', 'I', 'P', 'm', '4', 'y', 'U', 'j', 'E', 'D', 'A', 'x', 'N', 'H', 'Q', 'B'));
        seznami.add(List.of('b', 'E', 'L', 'M', 'D', '8', 'j', 'y', 'l', 'Y', 'W', 'v', 'x', 'r', 'O', 't', 'o', '3', '0', 'm', 'F', 'R', 'p', 'P', 'c', '2', 'a', 'K', 'N', '_', 'f', 'G', 'U', '4'));
        seznami.add(List.of('c', 'p', 'E', 'b', '0', 'G', 'a', 'P', '4', 'r', 'W', 'L', 'j', 'Q', 'N', 'm', 't', 'd', '8', 'D', 'l', '3', 'U', 'v', 'F'));
        seznami.add(List.of('E', 'W', 'j', 'G', 'l', 't', 'U', '8', 'R', 'b', '1', 'p', 'q', 'D', 'd', 'P', 'r', 'h', 'L', 'I', 'J', '0', '3', 'v', 'N', 'k', 'F', '7', 'x', '2', 'Q', 'i', 'g', 'o', 'm', 'f', '4', 'A', 'a', 'n'));
        seznami.add(List.of('N', '3', '0', 'm', 'T', 'b', 'j', 't', 'v', 'G', 'E', 'L', 'P', 'U', 'F', 'l', '4', 'p', 'a', 'r', 'W'));
        seznami.add(List.of('p', 'E', '0', 'a', 'F', 'H', 'G', 'P', 'b', 'W', 'v', 'x', '4', 'L', 'r', 'U', 'j', '3', 'l', 'V', 't', 'm', 'N', 'o'));

        Set<Character> mnozica = Cetrta.skupni(seznami);

        List<Character> lstMnozica = new ArrayList<>(mnozica);
        lstMnozica.sort(null);
        System.out.println(lstMnozica);
    }
}
