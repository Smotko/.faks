
/*
Samodejno testiranje:

tj.exe

Javni testni primeri:

01, 02, 03: ro"cno izdelani (in manj"si)
04--10: samodejno izdelani (in ve"cji)

Primeri 01, 02 in 03 vsebujejo isti dnevnik, razlikujejo se le po klicih metod.

01, 04--05: steviloMalicarjev
02, 06--07: kolikoRekreacije
03, 08--10: prisotnost
*/

import java.util.*;

public class Tretja {

    public static void main(String[] args) {
    }

    public abstract static class Dogodek {
        private int oseba;
        private Cas cas;
        private boolean odhod;

        protected Dogodek(int oseba, Cas cas, boolean odhod) {
            this.oseba = oseba;
            this.cas = cas;
            this.odhod = odhod;
        }

        public int vrniOsebo() {
            return this.oseba;
        }

        public Cas vrniCas() {
            return this.cas;
        }

        public boolean jeOdhod() {
            return this.odhod;
        }
    }

    public static class Malica extends Dogodek {
        public Malica(int oseba, Cas cas, boolean odhod) {
            super(oseba, cas, odhod);
        }
    }

    public static class Rekreacija extends Dogodek {
        public Rekreacija(int oseba, Cas cas, boolean odhod) {
            super(oseba, cas, odhod);
        }
    }

    public static class SluzbenaPot extends Dogodek {
        public SluzbenaPot(int oseba, Cas cas, boolean odhod) {
            super(oseba, cas, odhod);
        }
    }

    public static class Dnevnik {
        private int stZaposlenih;
        private Dogodek[] dogodki;

        public Dnevnik(int stZaposlenih, Dogodek[] dogodki) {
            this.stZaposlenih = stZaposlenih;
            this.dogodki = dogodki;
        }

        public int steviloMalicarjev() {
            int st = 0;
            for(int i = 0; i < dogodki.length; i++){
                if(dogodki[i] instanceof Malica && dogodki[i].jeOdhod() == true)
                    st++;
            }
            return st;
        }

        public int kolikoRekreacije(int oseba) {

            int[] sestevek = new int[stZaposlenih];
            Cas[] zacetni = new Cas[stZaposlenih];

            for(int i = 0; i < dogodki.length; i++){
                if(dogodki[i] instanceof Rekreacija && dogodki[i].jeOdhod() == true && (dogodki[i].vrniOsebo() == oseba) == true){
                    zacetni[oseba] = dogodki[i].vrniCas(); 
                }
                if(dogodki[i] instanceof Rekreacija && dogodki[i].jeOdhod() == false && (dogodki[i].vrniOsebo() == oseba) == true){
                    sestevek[oseba] += dogodki[i].vrniCas().razlikaVMin(zacetni[oseba]);
                }

            }
            return sestevek[oseba];
        }

        public boolean[] prisotnost(Cas cas) {
            boolean[] je = new boolean[stZaposlenih];
            for(int i = 0; i < stZaposlenih; i++){
               je[i] = true;
            }

            for(int i = 0; i < dogodki.length; i++){
                if(dogodki[i].vrniCas().razlikaVMin(cas) > 0)
                    break;

                if(dogodki[i].jeOdhod() == true){
                    je[dogodki[i].vrniOsebo()] = false;
                }
                
                if(dogodki[i].jeOdhod() == false){
                    je[dogodki[i].vrniOsebo()] = true;
                }
            }
            return je;
        }
    }
}
