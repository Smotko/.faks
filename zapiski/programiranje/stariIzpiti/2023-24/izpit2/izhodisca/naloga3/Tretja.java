
/*
Samodejno testiranje:

tj.exe

Javni testni primeri:

01--06: ro"cno izdelani
07--12: samodejno izdelani

01--02, 07--08: klici metode steviloStanovanj
03--04, 09--10: klici metode koliko
05--06, 11--12: klici metode poslovnaCetrt

01, 03, 05, 07, 09, 11: brez ru"senja
02, 04, 06, 08, 10, 12: z ru"senjem
*/

import java.util.*;

public class Tretja {

    public static void main(String[] args) {
        // dopolnite za potrebe ro"cnega testiranja
    }

    //=========================================================================

    public static abstract class Stavba {
        // po potrebi dopolnite ...
    }

    //=========================================================================

    public static class Stanovanjska extends Stavba {
        private int stStanovanj;   // "stevilo stanovanj

        public Stanovanjska(int stStanovanj) {
            this.stStanovanj = stStanovanj;
        }

        public int steviloStanovanj() {
            return this.stStanovanj;
        }

        // po potrebi dopolnite ...
    }

    //=========================================================================

    public static class Poslovna extends Stavba {
        // po potrebi dopolnite ...
    }

    //=========================================================================

    public static class Mesto {

        // po potrebi dopolnite ...

        public Mesto(int stVrstic, int stStolpcev) {
            // dopolnite ...
        }

        public void postavi(int vrstica, int stolpec, Stavba stavba) {
            // dopolnite ...
        }

        public int steviloStanovanj() {
            // popravite / dopolnite ...
            return -1;
        }

        public int koliko(Stavba stavba) {
            // popravite / dopolnite ...
            return -1;
        }

        //
        // Velja 
        // 0 <= vrZac <= vrKon < this.stVrstic
        // in
        // 0 <= stZac <= stKon < this.stStolpcev.
        //
        public boolean poslovnaCetrt(int vrZac, int stZac, int vrKon, int stKon) {
            // popravite / dopolnite ...
            return false;
        }

        // pomo"zne metode (po potrebi) ...
    }

    //=========================================================================

    // drugi notranji razredi (po potrebi) ...
}
