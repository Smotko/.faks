
/*
Samodejno testiranje:

tj.exe Prva.java . .

Javni testni primeri:

01: primer iz besedila
02--06: k = n
01, 07--10: splo"sni primeri
*/

import java.util.*;

public class Prva {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int k = sc.nextInt();
        int stevec = 1;
        int znesek = 0;
        int[] cheat = new int[10001];
        int min = 0;

        while(sc.hasNext()){

            cheat[stevec] = sc.nextInt();

            znesek += cheat[stevec];

            if(stevec % k == 0){
                for(int i = 0; i < k; i++){
                    if(i == 0){
                        min = cheat[stevec];
                    }
                    if(cheat[stevec-i] < min){
                        min = cheat[stevec-i];
                    }
                }

                znesek -= min;
                min = 0;
            }
            stevec ++;
        }
        System.out.print(znesek);
    }

    // pomo"zne metode, notranji razredi (po potrebi) ...
}
