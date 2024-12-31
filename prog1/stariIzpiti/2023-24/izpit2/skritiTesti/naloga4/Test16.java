
import java.util.*;
import java.util.function.*;

public class Test16 {

    public static void main(String[] args) {
        Comparator<String> comp = (a, b) -> b.compareTo(a);

        List<List<String>> seznami = List.of(
            List.of("ricixahl", "amtawi", "niatrfeibz", "ezauaebcigekye", "hflsny", "psdxcjwqhfvhlxeuykm", "dulwpbkjjyl", "ivlyfldfgqclumlav"),
            List.of("swopydaqjfec", "amtawi", "swopydaqjfec", "amtawi", "swopydaqjfec", "amtawi", "swopydaqjfec", "amtawi", "swopydaqjfec", "amtawi", "swopydaqjfec", "dulwpbkjjyl", "swopydaqjfec", "dulwpbkjjyl", "swopydaqjfec", "dulwpbkjjyl", "ricixahl", "dulwpbkjjyl", "ricixahl", "dulwpbkjjyl", "psdxcjwqhfvhlxeuykm", "hflsny", "psdxcjwqhfvhlxeuykm", "ezauaebcigekye", "nrmlqtbenes", "ezauaebcigekye", "nrmlqtbenes", "ezauaebcigekye", "nrmlqtbenes", "ezauaebcigekye", "nrmlqtbenes", "ezauaebcigekye", "nrmlqtbenes", "ezauaebcigekye", "niatrfeibz", "ezauaebcigekye", "niatrfeibz", "ezauaebcigekye", "niatrfeibz", "hflsny", "niatrfeibz", "hflsny", "niatrfeibz", "ivlyfldfgqclumlav", "ivlyfldfgqclumlav", "ivlyfldfgqclumlav", "ivlyfldfgqclumlav", "ivlyfldfgqclumlav", "ivlyfldfgqclumlav", "ivlyfldfgqclumlav", "ivlyfldfgqclumlav", "ivlyfldfgqclumlav", "hflsny", "ivlyfldfgqclumlav", "hflsny", "niatrfeibz", "ezauaebcigekye", "niatrfeibz", "ezauaebcigekye", "niatrfeibz", "ezauaebcigekye", "niatrfeibz", "ezauaebcigekye", "niatrfeibz", "dulwpbkjjyl", "niatrfeibz", "dulwpbkjjyl", "niatrfeibz", "dulwpbkjjyl", "nrmlqtbenes", "dulwpbkjjyl", "nrmlqtbenes", "dulwpbkjjyl", "nrmlqtbenes", "dulwpbkjjyl", "nrmlqtbenes", "dulwpbkjjyl", "nrmlqtbenes", "dulwpbkjjyl", "psdxcjwqhfvhlxeuykm", "amtawi", "psdxcjwqhfvhlxeuykm", "amtawi", "ricixahl", "amtawi", "ricixahl", "amtawi", "ricixahl", "amtawi", "ricixahl", "amtawi", "swopydaqjfec", "amtawi", "swopydaqjfec", "amtawi", "swopydaqjfec"),
            List.of("ricixahl", "dulwpbkjjyl", "nrmlqtbenes", "psdxcjwqhfvhlxeuykm"),
            List.of("nrmlqtbenes", "dulwpbkjjyl", "ezauaebcigekye"),
            List.of("swopydaqjfec", "ezauaebcigekye", "niatrfeibz", "ezauaebcigekye", "niatrfeibz", "psdxcjwqhfvhlxeuykm", "amtawi", "psdxcjwqhfvhlxeuykm", "amtawi", "psdxcjwqhfvhlxeuykm"),
            List.of("ricixahl", "hflsny", "ricixahl", "amtawi", "psdxcjwqhfvhlxeuykm", "dulwpbkjjyl", "psdxcjwqhfvhlxeuykm", "dulwpbkjjyl", "psdxcjwqhfvhlxeuykm", "hflsny", "psdxcjwqhfvhlxeuykm", "hflsny", "psdxcjwqhfvhlxeuykm", "hflsny", "psdxcjwqhfvhlxeuykm", "ivlyfldfgqclumlav", "nrmlqtbenes", "ivlyfldfgqclumlav", "nrmlqtbenes", "niatrfeibz", "nrmlqtbenes", "niatrfeibz", "niatrfeibz", "nrmlqtbenes", "ivlyfldfgqclumlav", "nrmlqtbenes", "ivlyfldfgqclumlav", "nrmlqtbenes", "amtawi", "psdxcjwqhfvhlxeuykm", "ezauaebcigekye", "psdxcjwqhfvhlxeuykm", "ezauaebcigekye", "psdxcjwqhfvhlxeuykm", "dulwpbkjjyl", "ricixahl", "amtawi", "swopydaqjfec"),
            List.of("niatrfeibz", "dulwpbkjjyl", "dulwpbkjjyl", "psdxcjwqhfvhlxeuykm"),
            List.of("psdxcjwqhfvhlxeuykm", "amtawi", "swopydaqjfec", "ezauaebcigekye", "niatrfeibz", "ivlyfldfgqclumlav", "hflsny", "nrmlqtbenes", "dulwpbkjjyl", "ricixahl"),
            List.of("ricixahl", "ezauaebcigekye", "ricixahl", "hflsny", "psdxcjwqhfvhlxeuykm", "niatrfeibz", "dulwpbkjjyl", "ricixahl", "hflsny"),
            List.of("swopydaqjfec", "amtawi", "ezauaebcigekye", "nrmlqtbenes")
        );

        for (List<String> seznam: seznami) {
            System.out.println(Cetrta.alternirajoceMonotono(seznam, comp));
        }
    }
}
