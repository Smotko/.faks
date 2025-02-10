import java.util.Scanner;
import java.util.Arrays;

public class ZgoscenkeDve {

	/** ce nam Arrays.toString smrdi... */

	private static String vNiz(int[] t) {
		return "";
	}

	/** Vrne indeks najmanjsega elementa v tabeli. */
	
	private static int indeksMinimuma(int[] t) {
		int ixMin = 0;
		for (int i = 1; i < t.length; i++) {
			if (t[i] < t[ixMin])
				ixMin = i;
		}
		return ixMin;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int stZgoscenk = sc.nextInt();
		int kapacitetaZgoscenke = sc.nextInt();
		
		int[] zasedenosti = new int[stZgoscenk];
	
		while (sc.hasNextInt()) {
			int fileSize = sc.nextInt();
			int ixMin = indeksMinimuma(zasedenosti);
			
			if (fileSize + zasedenosti[ixMin] > kapacitetaZgoscenke) {
				// fuj, ampka tudi alternative smrdijo (luka TM)
				break;
			}
			zasedenosti[ixMin] += fileSize;

			System.out.printf("%d EP -> zgoscenka %d %s%n", 
				fileSize, ixMin + 1, Arrays.toString(zasedenosti));
		}
		
	}
}
