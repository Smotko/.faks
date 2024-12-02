import java.util.*;

public class DN01_63240298{
	public static void main(String[] args){
		/*
		
		*/
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int izhod = 0;
		
		for (int i = 1; a >= i && b >= i;i++){
			izhod +=  (a-i)*(b-i);
		}
		System.out.println(izhod);
		
	}
}
