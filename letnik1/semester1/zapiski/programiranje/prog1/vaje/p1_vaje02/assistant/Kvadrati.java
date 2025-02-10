import java.util.Scanner;

public class Kvadrati {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int spMeja = sc.nextInt();
		int zgMeja = sc.nextInt();	
		
		/*
		for (int stevilo = spMeja; stevilo <= zgMeja; stevilo++) {
			int kvadrat = stevilo * stevilo;
			System.out.println(kvadrat);
		}
		*/

		int stevilo = spMeja;
		while (stevilo <= zgMeja) {
			int kvadrat = stevilo * stevilo;
			System.out.println(kvadrat);
			stevilo++;
		}
	}
}

