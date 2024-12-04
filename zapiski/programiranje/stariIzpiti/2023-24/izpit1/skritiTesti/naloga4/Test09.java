
import java.util.*;

public class Test09 {

    public static void main(String[] args) {
        List<Integer> la = List.of(341);
        List<Integer> lb = List.of(648);
        List<Integer> lc = it2list(Cetrta.zlitje(la.iterator(), lb.iterator()));
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
