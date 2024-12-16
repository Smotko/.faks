/** 
 * Objekt tega razreda predstavlja besedilno ASCII datoteko s podanim imenom. 
 */

public class BesedilnaDatoteka extends Datoteka {

	private int stZnakov;

	public BesedilnaDatoteka(String ime, int stZnakov) {
		super(ime);
		this.stZnakov = stZnakov;
	}

	/**
	 * Vrne velikost datoteke <this> v bajtih.
	 */

	@Override
	public int velikost() {
		return this.stZnakov;
	}
	
	/** Opis: ime [b n] */

	@Override
	public String opis() {
		return String.format("b %d", this.stZnakov);
	}
}