package p1_vaje07;
    /**
 * Razred [Oseba]
 */

public class Oseba {

    private String ime;
    private String priimek;
    private char spol;
    private int lr;
    private Oseba oce;
    private Oseba mati;


    /**
     * Ustvari osebo s podanim imenom, priimekom, spolom, letom rojstva,
     * ocetom in materjo.
     */

    //private
    public Oseba(String ime, String priimek, char spol, int lr, Oseba oce, Oseba mati) { 
        //super();
        this.ime = ime;
        this.priimek = priimek;
        this.spol = spol;
        this.lr = lr;
        this.oce = oce;
        this.mati = mati;
    }

    //private
    public Oseba(String ime, String priimek, char spol, int lr) {
        this(ime, priimek, spol, lr, null, null);
    }

    public static Oseba createOseba(String ime, String priimek, char spol, int lr, Oseba oce, Oseba mati) {//factory metoda
        if(ime.length()<2 || "MZ".indexOf(spol) == -1)return null; return new Oseba(ime,priimek,spol,lr,oce,mati);   
    }

    /**
     * Vrne ime osebe 'this'. getIme()
     */

    public String vrniIme() {
        return this.ime;
    }
    
    public void nastaviIme(String novoIme) {
        if(novoIme == null || novoIme.length() < 2){
            return;
        }
        this.ime = novoIme;
    }
    
    /**
     * Vrne predstavitev osebe 'this' v obliki niza.
     */
    
    @Override
    public String toString() {
        return String.format("%d%d%d%d", 
                this.ime, this.priimek, this.spol, this.lr);
    }
 
    /**
     * Vrne starost osebe v podanem letu.
     */
     
     public int starost(int leto) {
        return leto - this.lr;
     }
     
    /**
     * Vrne <true> v primeru, ce je dana oseba 'this' starejsa od
     * osebe 'os'.
     */
    
    public boolean jeStarejsaOd(Oseba os) {
        return this.lr < os.lr;
    }
    
    public static Oseba starejsa(Oseba a, Oseba b) {
        if(a.jeSestraOd(b)){
            return a;
        }else if (b.jeSestraOd(a)){
            return b;
        }else{
            return null;
        }
    }
    
    /**
     * Vrne ime oceta osebe 'this' oz. 'null', ce oce ni znan.
     */
     
    public String imeOceta() {
        if (this.oce == null)
            return null;
        return this.oce.ime;
        // return (this.oce == null) ? null : this.oce.ime;
    }
    
    /**
     * Vrne <true> v primeru, ce je oseba 'this' brat ali sestra
     * osebe 'os'.
     */
    
    public boolean jeBratAliSestraOd(Oseba os) {
        if(this != os && this.oce != null && this.mati != null && this.oce == os.oce && this.mati == os.mati){
            return true;
        }
        return false;
    }
    
    /**
     * Vrne <true> v primeru, ce je oseba 'this' sestra osebe 'os'.
     */
    
    public boolean jeSestraOd(Oseba os) {
        if(this.spol == 'Z'){
            jeBratAliSestraOd(os);
        }
        return false;
    }
    
    /**
     * Vrne <true> v primeru, ce je oseba 'this' teta osebe 'os'.
     */
    
     public boolean jeTetaOd(Oseba os) {
        return (os.oce != null && jeSestraOd(os.oce)) ||
                (os.mati != null && jeSestraOd(os.mati));
    }
    
    /**
     * Vrne <true> v primeru, ce je oseba 'this' ocetovsi prednik
     * osebe 'os'.
     */

    public boolean jeOcetovskiPrednikOd(Oseba os) {
        Oseba p = os.oce;
        while(p != this && p != null){
            p = p.oce;
            if(p.oce == os){
                return true;
            }
        }
        return false;
    }
    
    /**
     * Vrne <true> v primeru, ce je oseba 'this' prednik osebe 'os'.
     */
     
    // dodatne metode...
    
    
    public boolean jePrednikOd(Oseba os) {

        return false;
    }
    
    public boolean staVSorodu(Oseba os) {
        return false;
    }
    
    public String druzinskaImena() {
        return "";
    }
}




