import java.util.*;

public class Sinus{
	public static void main(String[] args){
		/*
		
		*/
		Scanner sc = new Scanner(System.in);
		
		int amplituda = sc.nextInt();
		int stKrakov = sc.nextInt();
		System.out.println(Math.round(Math.sin(amplituda/2)*amplituda));
		
		for (int i = 0; i < stKrakov; i++){
			krak(amplituda);
		}
		
	}
	
	public static void krak(int amplituda){
		for (int i = 0; i < amplituda; i++){
			blokPresledkov(amplituda);
			plusi(i);
			System.out.println();
		}
		for (int i = 0; i < amplituda; i++){
			blokPresledkov(amplituda);
			plusi(amplituda-i);
			if(i==amplituda-1)
				break;
			System.out.println();
		}
		for (int i = 0; i < amplituda; i++){
			presledki(amplituda-i);
			plusi(i);
			System.out.println();
		}
		for (int i = 0; i < amplituda; i++){
			presledki(i);
			plusi(amplituda-i);
			if(i==amplituda-1)
				break;
			System.out.println();
		}
	}
	
	public static void plusi(int stPlusov){
		for (int i = 0; i < stPlusov; i++){
			System.out.print("+");
		}
	}
	
	public static void presledki(int stPlusov){
		for (int i = 0; i < stPlusov; i++){
			System.out.print(" ");
		}
	}
	public static void blokPresledkov(int stPlusov){
		for (int i = 0; i < stPlusov; i++){
			System.out.print(" ");
		}
	}
}
