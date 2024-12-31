
import java.util.*;

public class Test01 {

    public static void main(String[] args) {
        List<String> la = List.of("Ana", "Cvetka", "Franci");
        List<String> lb = List.of("Bojan", "Denis", "Eva");
        List<String> lc = it2list(Cetrta.zlitje(la.iterator(), lb.iterator()));
        System.out.println(lc);
    }

    private static <T> List<T> it2list(Iterator<T> it) {
        List<T> seznam = new ArrayList<>();
        while (it.hasNext()) {
            T element = it.next();
            seznam.add(element);
        }
        return seznam;
    }
}
