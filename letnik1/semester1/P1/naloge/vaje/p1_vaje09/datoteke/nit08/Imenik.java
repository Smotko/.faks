/**
 * Objekt tega razreda predstavlja imenik s podanim imenom in datotekami.
 */


public class Imenik extends Datoteka {

	public static final int METADATA = 256;
	private Datoteka[] datoteke;

	public Imenik(String ime, Datoteka[] datoteke) {
		super(ime);
		this.datoteke = datoteke;
	}
	String a = "D";
	
	/**
	 * Sestejemo velikosti posameznih datotek (in podimenikov)
	 * v imeniku, nato pa se pristeje se 256.
	 */

	@Override
	public int velikost() {
		int sumSize = Imenik.METADATA;
		for (Datoteka file : this.datoteke)
			sumSize += file.velikost();
		return sumSize;
	}
	
	/** Opis: ime [i n] */
	
	@Override
	public String opis() {
		return String.format("i %d", this.datoteke.length);
	}
	
	/** 
	 * Vrne stevilo slikovnih datotek, neposredno vsebovanih v imeniku 
	 * this, kjer je sirina in visina enaka najmanj <prag>.
	 */

	public int steviloVecjihSlik(int prag) {
		int stSlik = 0;
		for (Datoteka file : this.datoteke) {
			if (file instanceof SlikovnaDatoteka) {
				SlikovnaDatoteka image = (SlikovnaDatoteka) file;
				if (image.jeVelikaVsaj(prag))
					stSlik++;
			}
		}
		return stSlik;
	}

	/**
	 * Poisce datoteko z imenom <ime> in vrne relativno pot
	 * oz. null, ce datoteka ne obstaja. 
	 *
	 * Oblika poti: ./imenik/ime.jpg
	 */
	
	private String poisci(String pot, String ime) {
		for (Datoteka file : this.datoteke) {
			// 1 - poisci v trenutnem imeniku (this)
			String fileName = file.getIme();
			String candidatePath = String.format("%s/%s", pot, fileName);

			// ./stariCasi

			if (fileName.equals(ime))
				return candidatePath;

			// 2 - poisci v podimenikih
			if (file instanceof Imenik) {
				Imenik imenik = (Imenik) file;
				String path = imenik.poisci(candidatePath, ime);
				// ./stariCasi/sosolci.bmp   ;    null
				if (path != null)
					return path;
			}
		}
		return null;
	}

	public String poisci(String ime) {
		return poisci(".", ime);
	}

	
	/**
	 * Pomozne metode za izpis hierarhije imenika.
	 */

	private static final int ODMIK = 5;

	private void izpisi(int odmik, Imenik imenik) {
		System.out.printf("%s%n", imenik.getIme());

		for (int i = 0; i < imenik.datoteke.length; i++) {
			Datoteka item = imenik.datoteke[i];

			for (int j = 0; j < odmik * Imenik.ODMIK; j++)
				System.out.printf("%c", (j % ODMIK == 0) ? '|' : ' ');
			System.out.printf("%c-- ", (i == imenik.datoteke.length - 1) ? '\\' : '|');

			if (item instanceof Imenik) {
				izpisi(odmik + 1, (Imenik) item);
			} else {
				System.out.printf("%s%n", item.toString());
			}
		}
	}

	public void izpisi() {
		izpisi(0, this);
	}

	/* 
	private void debugIzpis(int odmik, char[] delims, Imenik imenik) {
		
	}

	public void debugIzpis() {
		izpisi(0, new char[] {'|'}, this);
	}*/
}