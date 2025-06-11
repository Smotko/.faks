import java.util.Scanner;
public class Zgoscenke{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt(); //st zgoscenk
		int k = sc.nextInt(); //enote
		int i = 1;
		int nezasedeno = 0;

		while(sc.hasNextInt()){
			int x = sc.nextInt();
			if(nezasedeno + x <= k){
				nezasedeno += x;
			}else{
				nezasedeno = 0;
				if(i < n){
					i++;
					nezasedeno += x;
				}else{
					break;
				}
			}
			System.out.printf("%d EP -> zgoscenka %d (%d EP)%n", x, i, nezasedeno);
		}
	}		
}
