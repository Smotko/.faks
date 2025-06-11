import java.util.Collection;
import java.util.List;

public class Stetjeel{
    public static <T> int prestej(Collection<T> zbirka, Predicate<T> pogoj) {
        int stevec = 0;
        for (T element: zbirka) {
            if (pogoj.test(element)) {
            stevec++;
            }
        }
        return stevec;
    }
    public static void main(String[] args) {
        List<Integer> stevila = List.of(20, 15, 32, 7, 19, 14, 23, 35);
        System.out.println(stevila.getClass());
        int stSodih = prestej(stevila, n -> n % 2 == 0); // 3
        List<String> imena = List.of("Ana", "Branko", "Cvetka", "Denis");
        int stImenDolzine5 = prestej(imena, ime -> ime.length() == 5); // 1
    }

    public interface Predicate<T> {
        public abstract boolean test(T t);
    }
            
}

