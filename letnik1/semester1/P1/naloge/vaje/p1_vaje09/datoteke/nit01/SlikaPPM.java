/** Netpbm - portable pixmap format (PPM) */

/*
https://en.wikipedia.org/wiki/Netpbm

P3
3 2
255
255   0   0
  0 255   0
  0   0 255
255 255   0
255 255 255
  0   0   0

RED|GREEN|BLUE
YELLOW|WHITE|BLACK
*/

public class SlikaPPM extends SlikovnaDatoteka {
	
	int maxColorValue;
	int[][][] raster;

	
	public SlikaPPM(String ime, int sirina, int visina, int maxColorValue, int[][][] raster) {
		super(ime, sirina, visina);
		this.maxColorValue = maxColorValue;
		this.raster = raster;
	}
	
	/**
	 * Vrne velikost datoteke: 3*w*h + 54.
	 */
	 
	@Override
	public int velikost() {
		return -1;
	}	
	
	public String raster() {
		StringBuilder sb = new StringBuilder();
		
		return sb.toString();
	}
	
	public static SlikaPPM preberi(String imeDatoteke) {
		// Scanner
		return null;
	}
	
	@Override
	public String toString() {
		return String.format("%s, %s", super.toString(), "PPM");
	}
}
