import java.util.Scanner;
public class Romanje{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int d = sc.nextInt();
		int p = sc.nextInt();
		int z = sc.nextInt();
		
		int dan = 1;
		int n = d;
		
		while(d > 0 && p > 0){
			if(p > d){
				p = d;
			}
			n -= p;
			System.out.printf("%d: %d -> %d%n", dan, d, n);
			d = n;
			p -= z;
			dan++;
		}
	}
}