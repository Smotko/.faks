
import java.util.*;

public class Test07 {

    public static void main(String[] args) {
        List<List<String>> seznami = new ArrayList<>();

        seznami.add(List.of("Ana", "Bojan", "Cvetka", "Denis", "Eva"));
        seznami.add(List.of("Bojan", "Cvetka", "Bojan", "Cvetka", "Bojan", "Cvetka"));
        seznami.add(List.of("Bojan", "Ana", "Eva", "Ana", "Franci", "Eva", "Ana"));
        seznami.add(List.of());
        seznami.add(List.of("Maja", "Maja", "Maja", "Maja", "Maja", "Maja"));

        Cetrta.poDolziniBrezDuplikatov(seznami);

        for (List<String> seznam: seznami) {
            System.out.println(seznam);
        }
    }
}
