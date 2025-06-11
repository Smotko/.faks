
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
        
    }

    

    public static <T extends Comparable<T>> Iterator<T> zlitje(Iterator<T> a, Iterator<T> b) {
        return new Iterator<T>() {
            
            T nextA = a.hasNext() ? a.next() : null;
            T nextB = b.hasNext() ? b.next() : null;
            
            @Override
            public boolean hasNext() {
                return nextA != null || nextB != null;
            }

            @Override
            public T next(){
                T ret = null;
                try{
                    if(nextA != null && nextB != null){
                        if(nextA.compareTo(nextB) < 0){
                            ret = nextA;
                            nextA = a.hasNext() ? a.next() : null;
                        }else{
                            ret = nextB;
                            nextB = b.hasNext() ? b.next() : null;
                        }
                    }else if(nextA != null){
                        ret = nextA;
                        nextA = a.hasNext() ? a.next() : null;
                    }else if(nextB != null){
                        ret = nextB;
                        nextB = b.hasNext() ? b.next() : null;
                    }
                }catch (IndexOutOfBoundsException e) {
                    throw new NoSuchElementException();
                }
                return ret;
            }
        };
    }

    // pomo"zne metode (po potrebi) ...
}
