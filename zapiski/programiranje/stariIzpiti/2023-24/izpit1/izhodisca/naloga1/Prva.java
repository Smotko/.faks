
/*
Samodejno testiranje:

tj.exe Prva.java . .

Javni testni primeri:

01: primer iz besedila
02--10: splošni primeri
*/

import java.util.*;

public class Prva {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ploscine;
        boolean b;
        
        for(int i = 0; i < n; i++){
            ploscine = sc.nextInt();
            b = false;
            for(int j = 1; j < Math.sqrt(ploscine) * 2; j ++){
                for(int k = 1; k < Math.sqrt(ploscine) * 2; k ++){
                    if(j*k == ploscine && j > k/2 && k > j/2)
                        b = true;
                }
            }
            System.out.println( b ? "DA" : "NE");
        }
    }

    // pomo"zne metode, notranji razredi (po potrebi) ...
}
