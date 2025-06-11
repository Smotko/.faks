
/*
Samodejno testiranje:

tj.exe Druga.java . .

Javni testni primeri:

01, 02: primera iz besedila
01, 03--06: u = 1
02, 07--10: u = 2
*/

import java.util.*;

public class Druga {

    public static void main(String[] args) {
        // dopolnite ...
        Scanner sc = new Scanner(System.in);
        int nacin = sc.nextInt();
        int stDraziteljev = sc.nextInt();
        int stIzdelkov = sc.nextInt();
        int stPonudb = sc.nextInt();
        int najPonudba[] = new int[stIzdelkov];
        int ponudbNaDrazitelja[] = new int[stDraziteljev];
        int draziteljiSpomin[] = new int[stIzdelkov];

        for(int i = 0; i < draziteljiSpomin.length; i++){
            draziteljiSpomin[i] = -1;
        }

        for(int i = 0; i < stPonudb; i++){
            int drazitelj = sc.nextInt();
            int izdelek = sc.nextInt();
            int ponudba = sc.nextInt();
            
            

            if(najPonudba[izdelek] < ponudba){
                najPonudba[izdelek] = ponudba;
                ponudbNaDrazitelja[drazitelj] ++;

                if(draziteljiSpomin[izdelek] > -1){
                    ponudbNaDrazitelja[draziteljiSpomin[izdelek]] --;
                }

                draziteljiSpomin[izdelek] = drazitelj;
            }
        }
        System.out.println((nacin == 1) ? Arrays.toString(najPonudba) : Arrays.toString(ponudbNaDrazitelja));


    }

    // pomo"zne metode, notranji razredi (po potrebi) ...
}
