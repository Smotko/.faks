
/*
Samodejno testiranje:

tj.exe Druga.java . .

Javni testni primeri:

01: primer iz besedila
02--06: k = 1
01, 07--10: splošni primeri
*/

import java.util.*;

public class Druga {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();
        int tv = sc.nextInt();
        int th = sc.nextInt();
        int cas = 0;
        int[] vrste = new int[n];
        int[][] ok = new int[m][k];
        boolean obstaja = true;
        for (int i = 0; i < n; i++){
            vrste[i] = sc.nextInt();
        }

        for(int i = 0; i < n; i++){

            for(int j = 0; j < k; j++){

                if(ok[vrste[i]][j] == 0){
                    obstaja = true;
                    ok[vrste[i]][j] = th;
                    break;
                }else{
                    obstaja = false;
                    ok[vrste[i]][j] -= 1;
                }
            }

            if(obstaja == false){
                System.out.println(i);
                cas += 1;
                i--;
                continue;
            }
                

            cas += tv;
        }
        System.out.println(cas);
    }

    // pomo"zne metode, notranji razredi (po potrebi) ...
}
