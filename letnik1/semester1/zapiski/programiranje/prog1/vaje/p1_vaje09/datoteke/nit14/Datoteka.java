
/** 
 * Objekt tega razreda predstavlja datoteko s podanim imenom. 
 */

public abstract class Datoteka {
	
	private String ime;

	public Datoteka(String ime) {
		this.ime = ime;
	}
	
	public String getIme() {
		return this.ime;
	}

	/**
	 * Vrne velikost datoteke <this> v bajtih.
	 */

	public abstract int velikost();

	public abstract String opis();

	@Override
	public String toString() {
		return String.format("%s [%s]", this.ime, opis());
	}
}
