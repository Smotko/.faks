import java.util.Scanner;

public class VrstaZbor {
	
	/** 
	 * Naredi tabelo, prebere visine vojakov in jo vrne
	 */
	
	private static int[] preberiVisine(int n, Scanner sc) {
		int[] t = new int[n];
		for (int i = 0; i < t.length; i++)
			t[i] = sc.nextInt();
		return t;
	}
	
	private static void izpisi(int[] t) {
		System.out.print("[");
		for (int i = 0; i < t.length; i++) {
			if (i > 0)
				System.out.printf(", ");
			System.out.printf("%d", t[i]);
		}
		System.out.println("]");
	}
	
	/** 
	 * Vrne true natanko v primeru, ce je element tabele 't' na indeksu 'ix' vecji
	 * ali enak kot njegov levi sosed in hkrati manjsi ali enak kot njegov desni sosed.
	 */
	
	private static boolean lokalnoPravilno(int[] t, int ix) {
		return 	(ix == 0 || t[ix - 1] <= t[ix]) && 
				(ix == t.length - 1 || t[ix] <= t[ix + 1]);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int stVojakov = sc.nextInt();
		int[] visine = preberiVisine(stVojakov, sc);

		// izpisi(visine);

		boolean vsajEden = false;
		for (int i = 0; i < visine.length; i++) {
			if (lokalnoPravilno(visine, i)) {
				System.out.println(i);
				vsajEden = true;
			}
		}
		if (!vsajEden)
			System.out.println("NOBEDEN");

	}
}