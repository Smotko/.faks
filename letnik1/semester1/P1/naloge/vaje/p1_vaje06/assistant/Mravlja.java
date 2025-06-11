import java.util.Scanner;

public class Mravlja {

    /** 
     * Vrne stevilo poti od zgornjega levega do spodnjega desnega kota za
     * steno s podano visino in sirino.
     */

    private static long stPoti(int visina, int sirina) {
		if (visina <= 1 || sirina <= 1)
			return 1;
		return stPoti(visina - 1, sirina) + stPoti(visina, sirina - 1);
    }

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
		if (memo[sirina][visina] > 0)
			return memo[sirina][visina];

		memo[visina][sirina] = stPotiMemo(visina - 1, sirina, memo) + 
								stPotiMemo(visina, sirina - 1, memo);
		return memo[visina][sirina];
	}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int visina = sc.nextInt();
        int sirina = sc.nextInt();

		// v.1 - osnovna razlicica
        // System.out.println(stPoti(visina, sirina));
		
		// v.2 - razlicica z memoizacijo
		int m = Math.max(visina, sirina) + 1;
		long[][] memo = new long[m][m];
		System.out.println(stPotiMemo(visina, sirina, memo));
    }
}
