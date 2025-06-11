
import java.util.*;

public class Test06 {

    public static void main(String[] args) {
        List<Integer> la = List.of(39, 116, 211, 240, 408, 466, 595, 623, 691, 783, 901);
        List<Integer> lb = List.of(91, 128, 228, 352, 417, 522, 600, 638, 747, 801, 979);
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
