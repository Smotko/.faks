
/*
 * Testiranje:
 *
 * tj.exe
 */

import java.util.*;

public class Tretja {

    public static void main(String[] args) {
        // koda za ro"cno testiranje (po "zelji)
    }

    //=========================================================================
    public static abstract class Ukaz {
        private Ukaz[] ukazi;

        public Ukaz() {

        }

        public Ukaz(Ukaz[] ukazi) {
            this.ukazi = ukazi;
        }

        public static int bilanca(Ukaz[] ukazi) {
            int st = 0;
            for(Ukaz ukaz: ukazi) {
                st += ukaz.stej();
            }
            return st;
        }

        public abstract int stej();

        @Override
        public abstract String toString();

        public abstract void izvedi(int[] stolpi);

        public Ukaz zaporedje(Ukaz drugi) {
            return new Ukaz(new Ukaz[]{this, drugi}) {
                @Override
                public String toString() {
                    StringBuilder sb = new StringBuilder();
                    sb.append("[");
                    boolean prvic = true;
                    for(Ukaz ukaz: this.vrniUkaze()) {
                        if(!prvic)
                            sb.append(", ");
                        sb.append(ukaz.toString());
                        prvic = false;
                    } 
                    sb.append("]");
                    return sb.toString();
                }

                @Override
                public void izvedi(int[] stolpi) {
                    for(Ukaz ukaz: this.vrniUkaze()) {
                        ukaz.izvedi(stolpi);
                    }
                }

                @Override
                public int stej() {
                    int st = 0;
                    for(Ukaz ukaz: this.vrniUkaze()) {
                        st += ukaz.stej();
                    }
                    return st;
                }
            };
        }

        public Ukaz[] vrniUkaze() {
            return this.ukazi;
        }
        // po potrebi dopolnite ...
    }

    //=========================================================================
    public static class Postavi extends Ukaz {
        private int kam;

        // V vseh testnih primerih velja:
        // kam >= 0

        public Postavi(int kam) {
            this.kam = kam;
        }

        @Override
        public int stej() {
            return 1;
        }

        @Override
        public String toString() {
            return String.format("+%d", this.kam);
        }

        public void izvedi(int[] stolpi) {
            if(this.kam >= 0 && this.kam < stolpi.length) {
                stolpi[this.kam]++;
            }
        }
        // po potrebi dopolnite ...
    }

    //=========================================================================
    public static class Odvzemi extends Ukaz {
        private int odkod;

        // V vseh testnih primerih velja:
        // odkod >= 0

        public Odvzemi(int odkod) {
            this.odkod = odkod;
        }

        @Override
        public int stej() {
            return -1;
        }

        @Override
        public String toString() {
            return String.format("-%d", this.odkod);
        }

        public void izvedi(int[] stolpi) {
            if(this.odkod >= 0 && this.odkod < stolpi.length) {
                if(stolpi[this.odkod] > 0)
                    stolpi[this.odkod]--;
            }
        }
        // po potrebi dopolnite ...
    }

    //=========================================================================
    // po potrebi dopolnite ...
}
