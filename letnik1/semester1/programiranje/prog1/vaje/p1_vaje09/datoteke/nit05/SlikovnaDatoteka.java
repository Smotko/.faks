/** 
 * Objekt tega razreda predstavlja slikovno datoteko s podanim imenom, sirino 
 * in visino.
 */

public class SlikovnaDatoteka extends Datoteka {

	// ppm image: P6 10 20 raster
	private static final int METADATA = 54;

	private int sirina;
	private int visina;

	public SlikovnaDatoteka(String ime, int sirina, int visina) {
		super(ime);
		this.sirina = sirina;
		this.visina = visina;
	}

	/**
	 * Vrne velikost datoteke: 3 * w * h + HEADER
	 */

	@Override
	public int velikost() {
		return 3 * this.visina * this.sirina + SlikovnaDatoteka.METADATA;
	}
	
	/** Opis: ime [s w x h] */

	@Override
	public String opis() {
		return String.format("s %d x %d", this.sirina, this.visina);
	}
	
	/**
	 * Velikost obeh dimenzij vsaj <size>
	 */
	
	public boolean jeVelikaVsaj(int size) {
		return (this.sirina >= size && this.visina >= size);
	}
} 