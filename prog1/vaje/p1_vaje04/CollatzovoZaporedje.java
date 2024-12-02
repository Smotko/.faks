import java.util.Scanner;
public class CollatzovoZaporedje{
		
		/**
     * Vrne dolzino Collatzovega zapopredja, ki izhaja iz 
     * podanega stevila.
     */
    
	 private static int dolzinaZaporedja(int stevilo) {
		int dolzina = 1;
        while (stevilo != 1) {
			if (stevilo % 2 == 0){
				stevilo = stevilo / 2;
			}else{
				stevilo = stevilo * 3 + 1;
			}
			dolzina ++;
		}
		return dolzina;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int spMeja = sc.nextInt();
        int zgMeja = sc.nextInt();

		int dolzina = dolzinaZaporedja(spMeja);
		int stevilo = spMeja;
		int najdolzina = dolzina;

		for (int i = spMeja; i <= zgMeja; i++) {
			if(dolzina < najdolzina){
				najdolzina = dolzina;
				dolzina = dolzinaZaporedja(i);
				stevilo = i;
			}
		}
		System.out.println(stevilo);
		System.out.println(dolzina);
    }
}