import java.util.Scanner;

public class StevkeRecursive {

	private static void izpisi(long stevilo) {
		if (stevilo > 0L) {
			int stevka = (int) (stevilo % 10L);
			System.out.println(stevka);
			izpisi(stevilo / 10);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		long stevilo = sc.nextLong();

		/*
		while (stevilo > 0L) {
			int stevka = (int) (stevilo % 10L);
			System.out.println(stevka);
			stevilo = stevilo / 10L;
			// stevilo /= 10;
		}
		*/

		izpisi(stevilo);
	}
}