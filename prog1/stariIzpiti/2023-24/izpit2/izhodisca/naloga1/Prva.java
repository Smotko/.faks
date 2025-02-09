
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
        int p = sc.nextInt();
        int q = sc.nextInt();
        int n = sc.nextInt();
        int[] tab = new int[n];
        String[] tab2 = new String[n];

        for(int i = 0; i < n; i++){
            tab[i] = sc.nextInt();
            tab2[i] = "NE";
        }

        for(int i = 0; i < n; i++){
            for(int a = 0; a < Math.ceil(Math.sqrt(tab[i])) +1 ; a++){
                for(int b = 0; b < Math.ceil(Math.sqrt(tab[i]))+1 ; b++){
                    if(Math.pow(p,a) * Math.pow(q,b) == tab[i]){
                        tab2[i] = "DA";
                        break;
                    }else if(Math.pow(p,a) * Math.pow(q,b) > tab[i]){
                        break;
                    }
                        
                }
            }
        }

        for(int i = 0; i < n; i++){
            System.out.println(tab2[i]);
        }
    }

    // pomo"zne metode, notranji razredi (po potrebi) ...
}
