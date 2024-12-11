/**
 * Razred [Inverz], ki predstavlja inverz zaporedja na intervalu
 */
 
public class Inverz extends Zaporedje {
	
	private Zaporedje zaporedje; 	// x^2
	private Interval interval; 		// [0, 30]

	public Inverz(Zaporedje prvo, Interval interval) {
		this.zaporedje = prvo;
		this.interval = interval;
	}

	/** y = f(x) */
	
	public Integer y(int x) {
		int zacetek = interval.vrniZacetek();
		int konec = interval.vrniKonec();

		for (int i = zacetek; i <= konec; i++) {
			Integer y = zaporedje.y(i); // i^2
	
			// x --> 25 (x^2)   --->   i * i --> y == x
			if (y != null && y == x)
				return i;
		}
		return null;
	}
	
}