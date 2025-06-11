import java.util.Scanner;

public class Collatz {
	
	/**
	 * Vrne dolzino Collatzovega zapopredja, ki izhaja iz 
	 * podanega stevila.
	 */
	
	private static int dolzinaZaporedja(int stevilo) {
		int dolzina = 1;
		while (stevilo > 1) {
			if (stevilo % 2 == 0)
				stevilo /= 2;
			else
				stevilo = 3 * stevilo + 1;
			dolzina++;
		}
		return dolzina;
	}

	private static int dolzinaZaporedjaRek(int stevilo) {
		if (stevilo == 1) {
			System.out.println("END");
			return 1;
		}
		if (stevilo % 2 == 0) {
			return 1 + dolzinaZaporedjaRek(stevilo / 2);
		}
		return 1 + dolzinaZaporedjaRek(3 * stevilo + 1);*/
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int spMeja = sc.nextInt();
		int zgMeja = sc.nextInt();

		int najDolzina = 0;
		int najZacetek = 0;

		for (int stevilo = spMeja; stevilo <= zgMeja; stevilo++) {
			int dolzina = dolzinaZaporedja(stevilo);

			if (dolzina > najDolzina) {
				najDolzina = dolzina;
				najZacetek = stevilo;
			}
		}
		System.out.println(najZacetek);
		System.out.println(najDolzina);

	}
}