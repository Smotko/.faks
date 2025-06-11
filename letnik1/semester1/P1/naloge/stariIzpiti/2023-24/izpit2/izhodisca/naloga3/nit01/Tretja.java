


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

        private int stVrstic, stStolpcev;
        private Stavba[][] tab;

        public Mesto(int stVrstic, int stStolpcev) {
            this.stVrstic = stVrstic;
            this.stStolpcev = stStolpcev;
            tab = new Stavba[stVrstic][stStolpcev];
        }

        public void postavi(int vrstica, int stolpec, Stavba stavba) {
            tab[vrstica][stolpec] = stavba;
        }

        public int steviloStanovanj() {
            int ret = 0;
            Stanovanjska zac = new Stanovanjska(ret);

            for (int i = 0; i < tab.length; i++){
                for (int j = 0; j < tab[i].length; j++){
                    if(tab[i][j] != null){
                        if(tab[i][j] instanceof Stanovanjska){
                            zac = (Stanovanjska) tab[i][j];
                            ret += zac.steviloStanovanj();
                        }
                    }
                }
            }

            return ret;
        }

        public int koliko(Stavba stavba) {
            int ret = 0;
            for (int i = 0; i < tab.length; i++){
                for (int j = 0; j < tab[i].length; j++){
                    if(tab[i][j] != null){
                        if(tab[i][j] instanceof Stanovanjska && stavba instanceof Stanovanjska){
                            ret ++;
                        }else if(tab[i][j] instanceof Poslovna && stavba instanceof Poslovna){
                            ret ++;
                        }
                    }
                }
            }
            return ret;
        }

        //
        // Velja 
        // 0 <= vrZac <= vrKon < this.stVrstic
        // in
        // 0 <= stZac <= stKon < this.stStolpcev.
        //
        public boolean poslovnaCetrt(int vrZac, int stZac, int vrKon, int stKon) {
            int vr = vrKon - vrZac + 1;
            int st = stKon - stZac + 1;
            boolean ret = true;
            for (int i = vrZac; i < vrKon +1; i++){
                for (int j = stZac; j < stKon +1; j++){
                        if(tab[i][j] instanceof Poslovna){

                        }else{
                            ret = false; 
                        }
                }
            }
            return ret;
        }

        // pomo"zne metode (po potrebi) ...
    }

    //=========================================================================

    // drugi notranji razredi (po potrebi) ...
}
