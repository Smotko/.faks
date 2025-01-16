
/*
Samodejno testiranje:

tj.exe

Javni testni primeri:

01: primer iz besedila
02--03: prva skupina
04--05: druga skupina
06--07: tretja skupina
08--11: "cetrta skupina

POZOR: uporabljate lahko samo primitivne tipe, tipni parameter T in tip
Iterator<T>.
*/

import java.util.*;

public class Cetrta {

    public static void main(String[] args) {
        // dopolnite za potrebe ro"cnega testiranja
    }

    public static <T extends Comparable<T>> Iterator<T> zlitje(Iterator<T> a, Iterator<T> b) {
        return new Nov(a,b);
    }

    public static class Nov implements Iterator<T>{

        Nov(Iterator<T> a,Iterator<T> b){

        }

        @Override
        public boolean hasNext(){
            return false;   
        }

        @Override
        public int next(){
            return -1;
        }
    }

    // pomo"zne metode (po potrebi) ...
}
