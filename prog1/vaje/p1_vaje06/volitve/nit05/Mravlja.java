import java.util.Scanner;

public class Mravlja {

    /** 
     * Razlicica metode stPoti, ki uporablja memoizacijo --- pomnjenje ze
     * izracunanih vrednosti.
     * @param memo memo[v][s]: 0 oziroma ze izracunano stevilo poti za
     *    steno velikosti v x s ali s x v 
     * @return stevilo poti
     */

    public static long stPotiMemo(int visina, int sirina, long[][] memo) {
        if (visina <= 1 || sirina <= 1)
            return 1;

        // ali je pred mano problem resila ze kaka druga mravlja?
        if (memo[visina][sirina] > 0)
            return memo[visina][sirina];

        memo[visina][sirina] = stPotiMemo(visina - 1, sirina, memo) + 
                                stPotiMemo(visina, sirina - 1, memo);
        return memo[visina][sirina];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int visina = sc.nextInt();
        int sirina = sc.nextInt();
        long[][] memo = new long[visina+1][sirina+1];
        // v.2 - razlicica z memoizacijo
        System.out.println(stPotiMemo(visina, sirina, memo));
    }
}
