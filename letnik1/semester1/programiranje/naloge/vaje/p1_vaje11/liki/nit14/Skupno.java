import java.util.*;

public class Skupno {

	/**
	 * Uredi podani vektor po narascajocem vrstnem redu glede na "naravno" 
	 * urejanje elementov (selection sort, stable).
	 * Vsi elementi (T) v vektorju morajo implementirati interface Comparable. 
	 */

	public static <T extends Comparable<T>> void uredi(Vektor<T> vektor) {
		int stElementov = vektor.steviloElementov();
		for (int i = 1; i < stElementov; i++) {
			T element = vektor.vrni(i);
			int j = i - 1;
			while (j >= 0 && vektor.vrni(j).compareTo(element) > 0) {
				vektor.nastavi(j + 1, vektor.vrni(j));
				j--;
			}
			vektor.nastavi(j + 1, element);
		}
	}
	
	/**
	 * Uredi podani vektor po vrstnem redu, ki ga doloca podani primerjalnik. 
	 */
	
	public static <T> void uredi(Vektor<T> vektor, Comparator<T> primerjalnik) {
		int stElementov = vektor.steviloElementov();
		for (int i = 1;  i < stElementov;  i++) {
			T element = vektor.vrni(i);
			int j = i - 1;
			while (j >= 0 && primerjalnik.compare(vektor.vrni(j), element) > 0) {
				vektor.nastavi(j + 1, vektor.vrni(j));
				j--;
			}
			vektor.nastavi(j + 1, element);
		}
	}
	
	
	// 3

	public static <T> Comparator<T> kompozitum(Comparator<T> prim1, Comparator<T> prim2) {
		return new SestavljeniPrimerjalnik<T>(prim1, prim2);
	}	
	
	/**
	 * Primerjalniki (nested static)
	 */

	private static class SestavljeniPrimerjalnik<T> implements Comparator<T>{

		private Comparator<T> prim1;
		private Comparator<T> prim2;

		public SestavljeniPrimerjalnik(Comparator<T> prim1, Comparator<T> prim2){
			this.prim1 = prim1;
			this.prim2 = prim2;
		}

		@Override
		public int compare(T a, T b){
			int rezultat1 = this.prim1.compare(a, b);
			return (rezultat1 == 0) ? this.prim2.compare(a, b) : rezultat1;
		}
	}

	private static class Obrat<T> extends SestavljeniPrimerjalnik<T> implements Comparator<T>{
		
		private Comparator<T> prim1;
		private Comparator<T> prim2;

		public Obrat(Comparator<T> prim1, Comparator<T> prim2){
			super(prim1, prim2);
		}

		@Override
		public int compare(T a, T b){
			int rezultat1 = this.prim1.compare(a, b)*(-1);
			return (rezultat1 == 0) ? this.prim2.compare(a, b)*(-1) : rezultat1;
		}
	}

	public static <T> Comparator<T> obrat(Comparator<T> prim1, Comparator<T> prim2) {
		return new Obrat<T>(prim1, prim2);
	}	
	


	
}