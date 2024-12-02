import java.util.Scanner;
public class Zgoscenke{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int k = sc.nextInt();
		int zasedenost = 0;
		int st = 1;

		while(sc.hasNextInt() && st < n){
			int fileSize = sc.nextInt();
			if (fileSize - zasedenost > k) {
				st++;
			}else{
				zasedenost = fileSize;
			}
			
			System.out.println(fileSize + " EP  -> zgoscenka " + st + " ("+ fileSize +" EP)");
		}
	}		
}
