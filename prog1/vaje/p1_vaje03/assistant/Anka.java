import java.util.*;

/**
 * m - podatek o drugi stevki (je vecja od m)
 * d - podatek o tretji stevki (deljiva z d)
 */

public class Anka {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int m = sc.nextInt();
		int d = sc.nextInt();

		int stKomb = 0;

		for (int st1 = 1; st1 < 10; st1 += 2) {
			for (int st2 = m + 1; st2 < 10; st2++) {
				for (int st3 = 0; st3 < 10; st3 += d) {
					System.out.printf("%d-%d-%d%n", st1, st2, st3);
					stKomb++;
				}
			}
		}

		System.out.println(stKomb);
	}
}