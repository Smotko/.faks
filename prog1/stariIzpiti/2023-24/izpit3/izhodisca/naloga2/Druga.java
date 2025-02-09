
/*
Samodejno testiranje:

tj.exe Druga.java . .

Javni testni primeri:

01: primer iz besedila
02--06: vse besede v okviru istega dokumenta so med seboj razli"cne
01, 07--10: splo"sni primeri
*/

import java.util.*;

public class Druga {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int b = sc.nextInt();
        int[] k = new int[n];
        int[] vsa = new int[b];
        boolean[][] preverimo = new boolean[n][b];

        for(int i = 0; i < n; i++){

            k[i] = sc.nextInt();

            int[] stevila = new int[k[i]];
            for(int j = 0; j < k[i]; j++){ 
                stevila[j] = sc.nextInt();

                if(preverimo[i][stevila[j]] == false){
                    vsa[stevila[j]] ++;
                }
                preverimo[i][stevila[j]] = true;

            }

        }

        int max = 0;
        int idx = 0;

        for(int i = 0; i < b; i++){
            if(vsa[i] > max){
                max = vsa[i];
                idx = i;
            }
        }
        System.out.println(idx);

    }

    // pomo"zne metode, notranji razredi (po potrebi) ...
}
