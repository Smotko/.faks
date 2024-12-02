import java.util.Scanner;
public class Romanje{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int d = sc.nextInt();
		int p = sc.nextInt();
		int z = sc.nextInt();
		
		int Dan = 1;
		
		while (d > 0){
			if (d < p){
				p = d;
				System.out.println(Dan + ": " + d + " -> " + (d - p));
				d = d + z;
				Dan++;
			}
		}	
	}
}