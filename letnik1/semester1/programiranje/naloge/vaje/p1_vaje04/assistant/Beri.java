import java.util.Scanner;

public class Beri {
	
	private static String preberiPriimekIme(Scanner sc) {
		// Scanner sc = new Scanner(System.in);
		String ime = sc.next();
		String priimek = sc.next();
		return String.format("%s, %s", priimek, ime);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int davcna = sc.nextInt();
		int letoRojstva = sc.nextInt();
		
		String priimek = preberiPriimekIme(sc);
		System.out.printf("%s; (%d) %d%n", priimek, davcna, letoRojstva);
		
	}
}