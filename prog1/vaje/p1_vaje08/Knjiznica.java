/**
 * Razred [Knjiznica]
 */
 
 public class Knjiznica {
        
    /** atributi */

    private int stClanov;
    private int stNaslovov;
    private int stIzvodovKnjige;
    private int[] zaloga;
    private int[] vsehIzposoj;
    private boolean[][] izposoje;
    //private Transakcije;

    // konstruktor
    
    public Knjiznica(int stClanov, int stNaslovov, int stIzvodovNaNaslov) {
        this.stClanov = stClanov;
        this.stNaslovov = stNaslovov;
        this.stIzvodovKnjige = stIzvodovNaNaslov;
        this.zaloga = new int[this.stNaslovov];
        for (int i = 0; i < this.zaloga.length; i++)
            zaloga[i] = this.stIzvodovKnjige;
        // Arrays.fill(zaloga, stIzvodovKnjige);
        this.vsehIzposoj = new int[this.stNaslovov];
        this.izposoje = new boolean[this.stClanov][this.stNaslovov];
    }
    
    /**
     * Knjiznica posodi clanu knjigo naslov
     *
     * @param   clan    clan, ki si izposoja knjigo
     * @param   naslov  knjiga, ki si jo izposoja clan
     * @return  status uspesnosti izposoje
     */

    public boolean posodi(int clan, int naslov) {
        if (this.izposoje[clan][naslov] || this.zaloga[naslov] <= 0)
            return false;
        this.zaloga[naslov]--;
        this.izposoje[clan][naslov] = true;
        this.vsehIzposoj[naslov]++;
        return true;
    }
    
    /**
     * Clan knjiznici vrne vse svoje knjige.
     *
     * @param clan      clan, ki si izposoja knjigo
     */

    public void clanVrne(int clan) {
        for (int iNaslov = 0; iNaslov < this.izposoje[clan].length; iNaslov++) {
            if (this.izposoje[clan][iNaslov]) {
                this.zaloga[iNaslov]++;
                this.izposoje[clan][iNaslov] = false;
            }
        }
    }
    
    /**
     * Vrne trenutno stevilo posojenih izvodov neke knjige (emisija).
     * 
     * @param   naslov  naslov knjige, ki nas zanima
     * @return  stevilo posojenih izvodov
     */

    public int posojeni(int naslov) {
        return this.stIzvodovKnjige - this.zaloga[naslov];
    }
    
    /**
     * Vrne skupno stevilo izvodov, ki jih ima clan izposojene.
     *
     * @param   clan    clan knjiznice
     * @return  stevilo izvodov
     */

    public int priClanu(int clan) {
        int steviloPriClanu = 0;
        for (int i = 0; i < this.izposoje[clan].length; i++){
            if (this.izposoje[clan][i]){
                steviloPriClanu ++;
            }
        }
        return steviloPriClanu;
    }
    
    /**
     * Vrne indeks naslova, ki je bil najveckrat izposojen.
     *
     * @return  indeks naslova
     */

    public int najNaslov() {
        int iNajNaslov = 0;
        for (int iNaslov = 1; iNaslov < this.vsehIzposoj.length; iNaslov++) {
            if (vsehIzposoj[iNaslov] > vsehIzposoj[iNajNaslov])
                iNajNaslov = iNaslov;
        }
        return iNajNaslov;
    }
}
