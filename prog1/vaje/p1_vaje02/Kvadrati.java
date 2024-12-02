import java.util.Scanner;
public class Kvadrati{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		/*
		int stevilo = Math.min(a,b);
		while (stevilo<=Math.max(a,b))
		*/
		for (int i = Math.min(a,b) ; i < Math.max(a,b)+1 ; i++){
			System.out.println((int)Math.pow(i, 2));
		}
		
		
	}
}