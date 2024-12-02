import java.util.Scanner;
public class Anka{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int m = sc.nextInt();
		int d = sc.nextInt();
		int st= 0;

		for (int a = 0; a < 10; a++){
			if (a % 2 == 1){
				for(int b = 0; b < 10; b++){
					if (b > m){
						for(int c = 0; c < 10; c++){
							if (c % d == 0){
							System.out.println(a+"-"+b+"-"+c);
							st ++;
							}
						}
					} 
				}
		}
		}
		System.out.println(st);
	}		
}