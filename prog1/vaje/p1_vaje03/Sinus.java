import java.util.*;

public class Sinus{

	private static void znaki(char znak, int length) {
		for (int i = 0; i < length; i++)
			System.out.print(znak);
	}
	
	private static void narisiSinus(int kotZacetka, int kotKonca, int amplituda) {
		int dKot = 10;
		double radianFactor = Math.PI / 180; // Conversion factor from degrees to radians

        for (int kot = kotZacetka; kot <= kotKonca; kot += dKot) {
            // Calculate the y-value (height) based on the sine function
            double radians = kot * radianFactor;
            int y = (int) (Math.sin(radians) * amplituda);

            // Normalize output: shift right to make room for negative values
            int offset = amplituda;

            // Print spaces up to the calculated position and draw the wave
            znaki(' ', offset + y);
            System.out.println("*");
        }
		
	}
	
	public static void main(String[] args) {
		narisiSinus(0, 360, 20);
	}
	/*
	public static void main(String[] args){
		
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
	*/

}
