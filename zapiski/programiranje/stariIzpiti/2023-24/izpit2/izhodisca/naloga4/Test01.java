
import java.util.*;
import java.util.function.*;

public class Test01 {

    public static void main(String[] args) {
        Comparator<Integer> ci = (a, b) -> a - b;
        Comparator<Integer> cir = (a, b) -> b - a;
        Comparator<String> cs = (a, b) -> a.compareTo(b);
        Comparator<String> csr = (a, b) -> b.compareTo(a);
        Comparator<String> csl = (a, b) -> a.length() - b.length();

        System.out.println(Cetrta.alternirajoceMonotono(List.of(10, 9, 11, 8, 12, 7, 13, 6, 14), ci));
        System.out.println(Cetrta.alternirajoceMonotono(List.of(10, 9, 11, 8, 12, 7, 13, 6, 14), cir));
        System.out.println();

        System.out.println(Cetrta.alternirajoceMonotono(List.of(10, 11, 11, 10, 12, 9, 13, 8), ci));
        System.out.println(Cetrta.alternirajoceMonotono(List.of(10, 11, 9, 12, 8, 13, 7, 14), cir));
        System.out.println();

        System.out.println(Cetrta.alternirajoceMonotono(List.of(10, 11), ci));
        System.out.println(Cetrta.alternirajoceMonotono(List.of(10, 11), cir));
        System.out.println(Cetrta.alternirajoceMonotono(List.of(11), ci));
        System.out.println(Cetrta.alternirajoceMonotono(List.of(), ci));
        System.out.println();

        System.out.println(Cetrta.alternirajoceMonotono(List.of("Denis", "Eva", "Cvetka", "Franci"), cs));
        System.out.println(Cetrta.alternirajoceMonotono(List.of("Denis", "Eva", "Cvetka", "Franci"), csr));
        System.out.println(Cetrta.alternirajoceMonotono(List.of("Denis", "Eva", "Denis", "Franci"), cs));
        System.out.println(Cetrta.alternirajoceMonotono(List.of("Denis", "Eva", "Cvetka", "Franci"), csl));
        System.out.println(Cetrta.alternirajoceMonotono(List.of("Denis", "Franci", "Cvetka", "Eva"), csl));
    }
}
