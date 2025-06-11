
/*
Samodejno testiranje:

tj.exe

Javni testni primeri:

01--03: klici metode konec
04--06: klici metode zadnjiFilm
07--09: klici metode infoDovoljPogosto
10--12: klici metode sportVesDan

01, 04, 07, 10: ro"cno izdelani

Po potrebi lahko razred Tretja in njegove notranje razrede dopolnite z
lastnimi elementi (atributi, metodami in notranjimi razredi).
*/

import java.util.*;

public class Tretja {

    public static void main(String[] args) {
        // dopolnite, "ce "zelite metode testirati ro"cno
    }

    //=========================================================================

    public static abstract class Oddaja {
        private String naziv;
        private int trajanje;

        protected Oddaja(String naziv, int trajanje) {
            this.naziv = naziv;
            this.trajanje = trajanje;
        }

        public abstract String vrsta();

        public String vrniNaziv() {
            return this.naziv;
        }

        public int vrniTrajanje() {
            return this.trajanje;
        }

        @Override
        public String toString() {
            return String.format("%s | %s | %d", this.vrsta(), this.naziv, this.trajanje);
        }
    }

    //=========================================================================

    public static class Film extends Oddaja {
        public Film(String naziv, int trajanje) {
            super(naziv, trajanje);
        }

        @Override
        public String vrsta() {
            return "Film";
        }
    }

    //=========================================================================

    public static class Info extends Oddaja {
        public Info(String naziv, int trajanje) {
            super(naziv, trajanje);
        }

        @Override
        public String vrsta() {
            return "Info";
        }
    }

    //=========================================================================

    public static class Sport extends Oddaja {
        public Sport(String naziv, int trajanje) {
            super(naziv, trajanje);
        }

        @Override
        public String vrsta() {
            return "Sport";
        }
    }

    //=========================================================================

    public static class Program {
        private Oddaja[] oddaje;

        public Program(Oddaja[] oddaje) {
            this.oddaje = oddaje;
        }

        @Override
        public String toString() {
            return Arrays.toString(this.oddaje);
        }

        public Cas konec(Cas zacetek) {
            int zach = zacetek.vrniUro();
            int zacm = zacetek.vrniMinuto();
            int trajanje = zach*60 + zacm;
            for(Oddaja el : oddaje){
                trajanje += el.vrniTrajanje();
            }
            Cas ret = new Cas(trajanje/60,trajanje%60);
            return ret;
        }

        public Film zadnjiFilm() {
            Film ret = null;
            for(Oddaja el : oddaje){
                if(el instanceof Film){
                    ret = (Film) el;
                }
            }
            return ret;
        }

        public boolean infoDovoljPogosto(int maksRazmak) {
            int[] razmik = new int[oddaje.length];
            int stevec = 0;
            int prva = 0;

            for(int i = 1; i < oddaje.length;i++){
                if(oddaje[i] instanceof Info){
                    stevec ++;
                }else if (stevec > 0){
                    razmik[stevec] += oddaje[i].vrniTrajanje();
                }
            }
            for(int i = 0; i < stevec; i++){
                if(razmik[i] > maksRazmak){
                    return false;
                }
            }
            return true;
        }

        public static Program sportVesDan(String osnova, int trajanje) {
            int stoddaj = 24*60/trajanje;
            Oddaja[] oddaje = new Oddaja[stoddaj];
            for(int i = 0; i < stoddaj ; i++){
                oddaje[i] = new Sport(osnova+"_"+(i+1), trajanje);
            }
            return new Program(oddaje);
        }
    }
}
