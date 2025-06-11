import java.util.Scanner;
public class Vsota2{
	public static void main(String[] args) {
		Scanner Ana = new Scanner(System.in);
		int a = Ana.nextInt();
		int b = Ana.nextInt();
		int vsota = a+b;
		System.out.printf("%d + %d = %d", a, b, vsota);
	}
} 
