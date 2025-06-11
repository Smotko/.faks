import java.util.*;

/**
 * n - visina piramide
 *
 *    * 
 *   ***
 *  *****
 *
 */
 

public class Piramida {

	private static void narisiPiramido(int stZvezdic, int stPresledkov) {
		if (stPresledkov >= 0) {
			System.out.println(" ".repeat(stPresledkov) + "*".repeat(stZvezdic));
			narisiPiramido(stZvezdic + 2, stPresledkov - 1);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();

		// v.1

		for (int i = 0; i < n; i++) {
			// izpis presledkov
			for (int j = 0; j < n - i - 1; j++)
				System.out.print(' ');
			// izpis zvezdic
			for (int j = 0; j < 2 * i + 1; j++)
				System.out.print('*');
			// skok v NV
			System.out.println();
		}

		// v.2

		int stPresledkov = n - 1;
		int stZvezdic = 1;

		// narisiPiramido(stZvezdic, stPresledkov);
		narisiPiramido(1, n - 1);

		// v.3

		for (int i = 0; i < n; i++) {
			// izpis presledkov
			for (int j = 0; j < stPresledkov; j++)
				System.out.print(' ');
			// izpis zvezdic
			for (int j = 0; j < stZvezdic; j++)
				System.out.print('*');
			// skok v NV
			System.out.println();

			stZvezdic += 2;
			stPresledkov--;
		}
		
	}
}