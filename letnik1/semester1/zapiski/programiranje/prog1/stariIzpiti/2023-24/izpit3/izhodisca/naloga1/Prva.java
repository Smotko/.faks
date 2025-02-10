
/*
Samodejno testiranje:

tj.exe Prva.java . .

Javni testni primeri:

01: primer iz besedila
*/

import java.util.*;

public class Prva {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line  = sc.nextLine();
        String[] split = line.split(" 0 ");
        boolean idx = true;
        int st = 0;
        for(String el : split){
            String el2 = el.trim();

            String[] stevila = el2.split(" ");

            for(int i = 0; i < stevila.length-1; i++){

                if(Integer.parseInt(stevila[i]) > Integer.parseInt(stevila[i+1])){

                }else{
                    idx = false;
                }
            }
            if (idx == true){
                st ++;
            }
            idx = true;

        }
        System.out.println(st);
    }

    // pomo"zne metode, notranji razredi (po potrebi) ...
}
