public class Tekma {

	private String domaci;
	private String gostje;
	private int goliDomacih;
	private int goliGostov;

	public Tekma(String domaci, String gostje, int goliDomacih, int goliGostov) {
		this.domaci = domaci;
		this.gostje = gostje;
		this.goliDomacih = goliDomacih;
		this.goliGostov = goliGostov;
	}

	/** [Z:3, R:1, P:0] */
	
	public int steviloTock(String klub) {
		// klub -> domaci
		if (klub.equals(this.domaci) && this.goliDomacih >= this.goliGostov)
			return (this.goliDomacih > this.goliGostov) ? 3 : 1;
		// klub -> gostujoci
		if (klub.equals(this.gostje) && this.goliGostov >= this.goliDomacih)
			return (this.goliGostov > this.goliDomacih) ? 3 : 1;
		return 0;
	}
	
	/** absolutna vrednost razlike v golih na tekmi <this> */
	
	public int golRazlika() {
		return Math.abs(this.goliGostov - this.goliDomacih);
	}	
	
	@Override
	public String toString() {
		return String.format("%s %d : %d %s", domaci, goliDomacih, goliGostov, gostje);
	}
}