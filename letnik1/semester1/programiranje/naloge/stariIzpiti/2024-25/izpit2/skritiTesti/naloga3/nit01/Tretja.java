
/*
Samodejno testiranje:

tj.exe

Javni testni primeri:

01--05: klici metode <vNiz>
06--10: klici metode <izNiza>

01, 06: ro"cno izdelana
02--05, 07--10: samodejno izdelani
*/

import java.util.*;

public class Tretja {

    public static class Poniz {

        char[] znaki;
        int[] ponovitve;

        public Poniz(char[] znaki, int[] ponovitve) {
            this.znaki = znaki;
            this.ponovitve = ponovitve;
        }

        public char[] vrniZnake() {
            return this.znaki;
        }

        public int[] vrniPonovitve() {
            return this.ponovitve;
        }

        public String vNiz() {
            String niz = "";
            int i = 0;
            for(char el : znaki){
                for(int j = 0; j < ponovitve[i]; j++){

                    niz += znaki[i];
                }
                i++;
            }
            return niz;
        }

        public static Poniz izNiza(String niz) {
            // popravite / dopolnite ...
            return null;
        }
    }
}
