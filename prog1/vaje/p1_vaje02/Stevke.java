import java.util.Scanner;
public class Stevke{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		long stevilo = sc.nextLong();
		
		while (stevilo > 0){
			int i = (int)(stevilo % 10);
			System.out.println(i);
			stevilo /= 10;
		}	
	}
}