/**
 * Razred [Zaporedje]
 */

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Color;
 
public abstract class Zaporedje {
	
	/** y = f(x) */
	
	public abstract Integer y(int x);
	
	public String vNiz(Interval interval) {
        StringBuilder sb = new StringBuilder("[");
        int zacetek = interval.vrniZacetek();
        int konec = interval.vrniKonec();
        boolean prvic = true;
		for (int x = zacetek;  x <= konec;  x++) {
            Integer y = this.y(x);
            if (y != null) {
                if (!prvic) {
                    sb.append(", ");
                }
                prvic = false;
                sb.append(String.format("%d -> %d", x, y));
            }
        }
        sb.append("]");
        return sb.toString();	
	}
	
	
	/**
	 * Narise zaporedje na platno.
	 *
	 * @param g 			objekt, ki predstavlja graficni kontekst in omogoca risanje na panel
	 * @param x0 			sredisce koordinatne osi x
	 * @param y0 			sredisce koordinatne osi y
	 * @param enota			koliko pikslov na zaslonu predstavlja ena enota
	 * @param barva			barva za izris zaporedja na Intervalu
	 * @param interaval 	zaprt celostevilski interval 
	 */	
	
	public void narisi(Graphics g, int x0, int y0, double enota, Color color, Interval interval) {
		
	}
	
	/**
	 * Vrne minimalno in maksimalno vrednost f(x) na podanem intervalu. [1 - 3]
	 *
	 * @param interaval 	zaprt celostevilski interval
	 * @return interval 	nov interval z minimalno in maksimalno vrednostjo
	 */
	
	public Interval minMax(Interval interval) {
		int xZacetek = interval.vrniZacetek();
		int xKonec = interval.vrniKonec();

		Integer vMin = null;
		Integer vMax = null;

		for (int x = xZacetek; x <= xKonec; x++) {
			Integer y = this.y(x);
			if (y != null) {
				vMin = (vMin == null) ? y : Math.min(vMin, y);
				vMax = (vMax == null) ? y : Math.max(vMax, y);
			}
		}
		return new Interval(vMin, vMax);
	}
	
	/**
	 * Preveri, ce je zaporedje na danem intervalu strogo narascajoce. [4 - 6]
	 *
	 * @param interaval 	zaprt celostevilski interval
	 * @return boolean 		vrne true natanko takrat, ko je zaporedje na intervalu strogo narascajoce	
	 */	
	
	private boolean jeMonotono(Interval interval, int smer) {
		int xZacetek = interval.vrniZacetek();
		int xKonec = interval.vrniKonec();
		Integer yp = null;

		for (int x = xZacetek; x <= xKonec; x++) {
			Integer y = this.y(x);
			if (y != null) {
				if (yp != null && y * smer <= yp * smer)
					return false;
				yp = y;
			}
		}
		return true;
	}
	
	// Integer y --> (y == x) --> (y.intValue() == x)
	
	public boolean jeMonotono(Interval interval) {
		// strogo narascajoce || strogo padajoce
		return jeMonotono(interval, 1) || jeMonotono(interval, -1); 
	}

	/**
	 * Vrne vsoto zaporedij <this> in other. [7 - 9]
	 *
	 * @param drugo 	zaporedje, ki ga pristejemo zaporedju <this>
	 * @return 			vsota zaporedij
	 */	

	public Zaporedje vsota(Zaporedje drugo) {
		return new Vsota(this, drugo);
	}
	
	/**
	 * Vrne inverz zaporedja <this> na intervalu. [10 - 12]
	 *
	 * @param interval 	interval, na katerem vrnemo inverz zaporedja <this>
	 * @return 			inverz zaporedja <this>
	 */	
	
	public Zaporedje inverz(Interval interval) {
		return jeMonotono(interval) ? new Inverz(this, interval) : null;
	}
}