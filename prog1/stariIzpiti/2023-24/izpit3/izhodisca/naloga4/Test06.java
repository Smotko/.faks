
import java.util.*;

public class Test06 {

    public static void main(String[] args) {
        List<List<Character>> seznami = new ArrayList<>();

        seznami.add(List.of('D', 'B', 'C'));
        seznami.add(List.of('E', 'F', 'E', 'F', 'F'));
        seznami.add(List.of('E', 'C', 'E', 'F', 'D'));

        Cetrta.poDolziniBrezDuplikatov(seznami);

        for (List<Character> seznam: seznami) {
            System.out.println(seznam);
        }
    }
}
