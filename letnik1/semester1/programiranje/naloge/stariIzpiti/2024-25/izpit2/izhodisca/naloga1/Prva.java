
/*
Samodejno testiranje:

tj.exe Prva.java . .

Javni testni primeri:

01: primer iz besedila
02--06: p = 0
01, 07--10: splo"sni primeri
*/

import java.util.*;

public class Prva {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int p = sc.nextInt();
        for(int i = 0; i < h; i++){
            for(int j = h+i; j > h;j--){
                System.out.print(" ");
            }
            System.out.print("*");
            if(i < h-p){
                for(int j = 0;j < 2*h-2*i-1 ;j++){
                    System.out.print(" ");
                }
            }else{
                for(int j = 0;j < 2*h-2*i-1 ;j++){
                    System.out.print("o");
                }
            }
            System.out.print("*");
            System.out.println("");
        }
        for(int i = 0; i < h; i++){
            for(int j = 0; j <h;j++){
                System.out.print(" ");
            }
            System.out.print("*");
            System.out.println("");
        }
        for(int i = 0; i < 2*h+1;i++){
            System.out.print("*");
        }
    }

    // pomo"zne metode, notranji razredi (po potrebi) ...
}
