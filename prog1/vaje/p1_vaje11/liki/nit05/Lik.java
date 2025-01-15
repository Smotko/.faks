import java.util.*;



public abstract class Lik implements Comparable<Lik>{

	public abstract int ploscina();

	public abstract int obseg();
	

	/** 
	 * Vrne vrsto lika <this> (npr. "pravokotnik").
	 */
	
	public abstract String vrsta();

    /**
	 * Vrne niz s podatki o liku <this> (npr. "sirina = 3.0, visina = 4.0").
	 */
	 
	public abstract String podatki();

	
	
	// 5 - dodatno za studente, ki koncajo prej...
	
	public static Lik vrniKrogZMinimalnimObsegom(Vektor<Lik> vektor) {
		return null;
	}	
	
	// 1
	
	/**
	 * interface Comparable<T> 
	 * int compareTo(T o)	 
	 * -- primerjava objekta z drugimi objekti istega tipa
	 * -- doloca "naravni" vrstni red urejanja
	 */

	@Override
	public int compareTo(Lik other){
		return this.ploscina() - other.ploscina();
	}



	/**
	 * Ce zelimo drugacen vrstni red urejanja, kreiramo ustrezen primerjalnik.
	 */

	// 2.1, 2.2

	public static Comparator<Lik> poObsegu() {
		return new PrimerjalnikiPoObsegu();
	}
	
	
	public static Comparator<Lik> poTipu() {
		return new PrimerjalnikPoTipu();
	}
	
	public static void izpisi(Vektor<Lik> vektor) {
		int stElementov = vektor.steviloElementov();
		for (int i = 0; i < stElementov; i++) {
			Lik lik = vektor.vrni(i);
			System.out.printf("%s | p = %d | o = %d%n", lik.toString(), lik.ploscina(), lik.obseg());
		}
	}
	
	@Override
	public String toString() {
		return String.format("%s [%s]", this.vrsta(), this.podatki());
	}	
	
	/**
	 * Primerjalniki (nested static)
	 */
	
	private static class PrimerjalnikiPoObsegu implements Comparator<Lik>{
		@Override
		public int compare(Lik a, Lik b){
			return a.obseg() - b.obseg();
		}
	}

	// abstraktna metoda za urejanje po tipu lika --> dodaj metodo tip() v razred Lik
	private static class PrimerjalnikPoTipu implements Comparator<Lik> {

		@Override
		public int compare(Lik a, Lik b) {
			// pravokotniki (1) < kvadrati (2) < krogi (3)
			return a.tip() - b.tip();
		}
	}

	public abstract int tip();
	
	public static void urediPoTipuInObsegu(Vektor<Lik> vektor) {
		// Comparator<Lik> nasPrimerjalnik = Skupno.<Lik>kompozitum(poTipu(), poObsegu());
		Comparator<Lik> nasPrimerjalnik = Skupno.kompozitum(poTipu(), poObsegu());
		Skupno.uredi(vektor, nasPrimerjalnik);
	}

	public static void urediPoTipuInObseguObratno(Vektor<Lik> vektor) {
		Comparator<Lik> nasObrnjenPrimerjalnik = Skupno.obrat(poTipu(), poObsegu());
		Skupno.uredi(vektor, nasObrnjenPrimerjalnik);
	}
	

}