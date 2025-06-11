
/*
Samodejno testiranje:

tj.exe

Javni testni primeri:

01--12: klici metode <izposoja>
07--12: klici metode <vracilo>
01--03, 07--09: klici metode <statusiKoles>
04--06, 10--12: klici metode <kolesaNaPostaji>

01, 04, 07, 10: ro"cno izdelani
02--03, 05--06, 08--09, 11--12: samodejno izdelani
*/

import java.util.*;

public class Cetrta {

    public static class Sistem {

        // po potrebi dopolnite ...

        public Sistem(Map<Integer, String> kolo2postaja) {
            // dopolnite ...
        }

        public void izposoja(int kolo) {
            // dopolnite ...
        }

        public void vracilo(int kolo, String postaja) {
            // dopolnite ...
        }

        public Map<Integer, Boolean> statusiKoles() {
            // popravite / dopolnite ...
            return null;
        }

        public Set<Integer> kolesaNaPostaji(String postaja) {
            // popravite / dopolnite ...
            return null;
        }
    }
}
