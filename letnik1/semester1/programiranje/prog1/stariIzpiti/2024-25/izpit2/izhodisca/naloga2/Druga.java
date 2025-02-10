
/*
Samodejno testiranje:

tj.exe Druga.java . .

Javni testni primeri:

01, 06: primera iz besedila
01--05: u = 1
06--10: u = 2
*/

import java.util.*;

public class Druga {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int u = sc.nextInt();
        int[] t = new int[10001];
        int[] z = new int[10001];
        int i = 0;
        int[] r1 = new int[n];

        while(sc.hasNext()){
            t[i] = sc.nextInt();
            z[i] = sc.nextInt();
            i++;
        }


        int k = 0;
        int[] k2 = new int[n];
        int[] r2 = new int[n];
        int[][] tab = new int[n][10001];


        for(int el : t){
            for(int j = 1; j <= n; j++){

                if(z[k] == j){
                    r1[j-1] ++;

                    if(r1[j-1] == 1){
                        r2[j-1] = r1[j-1];
                        tab[j-1][r1[j-1]-1] = t[k];
                        continue;
                    }

                    tab[j-1][r1[j-1]] = t[k] - tab[j-1][r1[j-1]-1];

                    if(tab[j-1][r1[j-1]] > t[k] - tab[j-1][r1[j-1]-1]){
                        r2[j-1] = r1[j-1];
                    }

                }
            }

            k++;
        }

        if(u == 1){
            System.out.println(Arrays.toString(r1));
        }else if(u == 2){
            System.out.println(Arrays.toString(r2));
        }
    }

    // pomo"zne metode, notranji razredi (po potrebi) ...
}
