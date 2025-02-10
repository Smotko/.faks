/**
 * 2 - Razred [Vsota], ki predstavlja vsoto dveh zaporedij.
 */

public class Vsota extends Zaporedje {
	
	private Zaporedje prvo;
	private Zaporedje drugo;

	public Vsota(Zaporedje prvo, Zaporedje drugo) {
		this.prvo = prvo;
		this.drugo = drugo;
	}

	/** y = f(x) */
	
	public Integer y(int x) {
		if (prvo.y(x) == null || drugo.y(x) == null)
			return null;
		return prvo.y(x) + drugo.y(x);
	}
}


	