import java.util.Scanner;

public class Mravlja {

    /** 
     * Vrne stevilo poti od zgornjega levega do spodnjega desnega kota za
     * steno s podano visino in sirino.
     */

    private static long stPoti(int visina, int sirina) {
        int[]
        return stPoti(visina, sirina);
    }

    /** 
     * Razlicica metode stPoti, ki uporablja memoizacijo --- pomnjenje ze
     * izracunanih vrednosti.
     * @param memo memo[v][s]: 0 oziroma ze izracunano stevilo poti za
     *    steno velikosti v x s ali s x v 
     * @return stevilo poti
     */

    public static long stPotiMemo(int visina, int sirina, long[][] memo) {
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int visina = sc.nextInt();
        int sirina = sc.nextInt();

        // v.1 - osnovna razlicica
        System.out.println(stPoti(visina, sirina));
        
        // v.2 - razlicica z memoizacijo
        // System.out.println(stPotiMemo(visina, sirina, memo));
    }
}
