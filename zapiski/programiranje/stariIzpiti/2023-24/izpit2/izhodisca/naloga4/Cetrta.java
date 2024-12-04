
/*
Samodejno testiranje:

tj.exe

Javni testni primeri:

01, 02: ro"cno izdelana
03--10: samodejno izdelani

01, 03--06: klici metode alternirajoceMonotono
02, 07--10: klici metode generator
*/

import java.util.*;
import java.util.function.*;

public class Cetrta {

    public static void main(String[] args) {
        // dopolnite za potrebe ro"cnega testiranja
    }

    public static <T> boolean alternirajoceMonotono(List<T> zaporedje, Comparator<T> prim) {
        // popravite / dopolnite ...
        return false;
    }

    public static Supplier<Integer> generator(int a, int b) {
        // popravite / dopolnite ...
        return null;
    }

    // pomo"zne metode, notranji razredi (po potrebi) ...
}
