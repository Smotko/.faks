import java.util.Scanner;

public class Stevke {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		long stevilo = sc.nextLong();

		while (stevilo > 0L) {
			int stevka = (int) (stevilo % 10L);
			System.out.println(stevka);
			stevilo = stevilo / 10L;
			// stevilo /= 10;
		}

	}
}