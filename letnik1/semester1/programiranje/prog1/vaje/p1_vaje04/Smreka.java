import java.util.Scanner;

public class Smreka {
    
    /**
     * Izpise <stevilo> znakov znaka <znak>.
     */
    
    private static void znaki(int stevilo, char znak) {
        for (int i = 0; i < stevilo; i++){
            System.out.print(znak);
        }
    }
    
    /**
     * Izpise piramido, zamaknjeno za odmik od leve.
     *
     * @param stevilo   visina piramide
     * @param zamik     odmik od levega roba
     */

    private static void piramida(int n, int zamik) {
        for (int i = 0; i < n; i++){
            znaki(zamik, '.');
            znaki(n-i-1, ' ');
            znaki(2*i+1, '*');
            System.out.println();
        }
    }

    /**
     * Izrise smreko, ki ima 'stPiramid' vej.
     *
     * @param stPiramid     stevilo piramid
     */ 
    
    private static void smreka(int stPiramid) {
        for (int i = 0; i < stPiramid ; i++){
            piramida(i + 1, stPiramid - i - 1);
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int visina = sc.nextInt();
        smreka(visina);
    }
}