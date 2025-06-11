
/*
Samodejno testiranje:

tj.exe

Javni testni primeri:

01: primer iz besedila
02: vse smeri so 1 ali 2, ostalo enako kot v besedilu
02--06: vse smeri so 1 ali 2
01, 07--10: splo"sni primeri

V vseh testnih primerih (javnih in skritih) so elementi tabele <rel>
"stevila z intervala [-1000, 1000].
*/

public class Druga {

    public static void main(String[] args) {
        // dopolnite za potrebe ro"cnega testiranja
    }

    public static int[][] visine(int[][] rel, int[][] smer) {
        int[][] tab = new int[rel.length][rel[0].length];
        tab[0][0] = 0;

        for(int k = 0; k < tab.length*tab[0].length + 1; k++){

            for(int i = 0; i < tab.length; i++){

                for(int j = 0; j < tab[i].length; j++){

                    if(smer[i][j] == 1){

                        if(tab[i][j-1] == 0 && i != 0 && j != 1 && k < tab.length + tab[0].length)
                            continue;

                        tab[i][j] = tab[i][j-1] + rel[i][j];

                    }else if(smer[i][j] == 2){

                        if(tab[i-1][j] == 0 && i != 1 && j != 0 && k < tab.length + tab[0].length)
                            continue;
                            
                        tab[i][j] = tab[i-1][j] + rel[i][j];

                    }else if(smer[i][j] == 3){
                        
                        if(tab[i][j+1] == 0 && k < tab.length + tab[0].length)
                            continue;

                        tab[i][j] = tab[i][j+1] + rel[i][j];

                    }else if(smer[i][j] == 4){

                        if(tab[i+1][j] == 0 && k < tab.length + tab[0].length)
                            continue;

                        tab[i][j] = tab[i+1][j] + rel[i][j];

                    }

                }
            }
        }

        return tab;
    }

    // pomo"zne metode, notranji razredi (po potrebi) ...
}
