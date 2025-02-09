
import java.util.*;

public class Test08 {

    public static void main(String[] args) {
        List<List<Character>> seznami = new ArrayList<>();

        seznami.add(List.of('X', '6', 'f', '7', 'c', 'h', 'h', 'F', 'l', 'v', '3', 'h', 'n', 'R', 'G', 'e', 'i', 'I', 'D', 'w', 'G'));
        seznami.add(List.of('t', 'u', 'a', 'e', 'N', 'U', '_', 'h', 'b', '7', 'X', 'W', 'k', 'y', 'X', 'P', 'w', 'c', '0'));
        seznami.add(List.of('T', '5', '0', 'f', 'h', 'e', '2', 'q'));
        seznami.add(List.of('o', 'h', 'I', 'B', 'P', 'm', 'n', 'L', 'b', 'O', 'Y', 'e', 'L', 'h'));
        seznami.add(List.of('o', '_', 'h', '7', 'H', 'M', 'u', 's', '4', 'g', '1', 'r', 's', 'i', '4'));
        seznami.add(List.of('h', 'S'));
        seznami.add(List.of('h', 'P', 'A', 'u', 'Y', '7', 'j'));

        Set<Character> mnozica = Cetrta.skupni(seznami);

        List<Character> lstMnozica = new ArrayList<>(mnozica);
        lstMnozica.sort(null);
        System.out.println(lstMnozica);
    }
}
