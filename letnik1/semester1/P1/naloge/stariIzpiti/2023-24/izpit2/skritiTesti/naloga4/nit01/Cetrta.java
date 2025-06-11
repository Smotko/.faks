
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

        boolean ret = true;

        if(zaporedje.size() % 2 == 0){

            for(int i = 0; i < zaporedje.size()-2; i+=2){
                if(prim.compare(zaporedje.get(i), zaporedje.get(i+2)) >= 0){
                    ret = false;
                }
                if(prim.compare(zaporedje.get(i+1), zaporedje.get(i+3)) <= 0){
                    ret = false;
                }
            }

        }else if(zaporedje.size() % 2 == 1){
            for(int i = 0; i < zaporedje.size()-3; i+=2){
                if(prim.compare(zaporedje.get(i), zaporedje.get(i+2)) >= 0){
                    ret = false;
                }
                if(prim.compare(zaporedje.get(i+1), zaporedje.get(i+3)) <= 0){
                    ret = false;
                }
            }
            if(zaporedje.size() > 2){
                if(prim.compare(zaporedje.get(zaporedje.size()-1), zaporedje.get(zaporedje.size()-3)) <= 0){
                    ret = false;
                }
            }
        }


        return ret;
    }

    public static Supplier<Integer> generator(int a, int b) {
        Supplier<Integer> s = new Supplier<Integer>() {
            int ret = a;
            int count = 1;
            @Override
            public Integer get() {
                if(count % 2 != 0){
                    ret = a + count/2*b;
                    count ++;
                }else{
                    ret = a - count/2*b;
                    count ++;
                }
                return ret;
            }
        };
        return s;
    }

    // pomo"zne metode, notranji razredi (po potrebi) ...
}
