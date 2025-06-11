
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
        return Nov(a,b);
    }

    private static class Nov<T> implements Iterator<T>{
        Iterator<T> a = a;
        Iterator<T> b = b;

        Nov<T>(Iterator<T> a, Iterator<T> b){
            this.a = a;
            this.b = b;
            nextA = a.hasNext() ? a.next() : null;
            nextB = b.hasNext() ? b.next() : null;
        }
        @Override
        public boolean hasNext(){
            if(a.hasNext() == null && b.hasNext() == null){
                return false;
            }
            return true;
        }

        @Override T next(){
            if (nextA == null) {
                // Only elements from iterator `b` are left
                result = nextB;
                nextB = b.hasNext() ? b.next() : null;
            } else if (nextB == null) {
                // Only elements from iterator `a` are left
                result = nextA;
                nextA = a.hasNext() ? a.next() : null;
            } else if (nextA.compareTo(nextB) <= 0) {
                // Take the smaller element (from `a` in case of ties)
                result = nextA;
                nextA = a.hasNext() ? a.next() : null;
            } else {
                // Take the smaller element (from `b`)
                result = nextB;
                nextB = b.hasNext() ? b.next() : null;
            }
        }
    }

    // pomo"zne metode (po potrebi) ...
}
