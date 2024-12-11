
//
// podrazred razreda Student
//
public class IzredniStudent extends Student {

    // Vsi trije atributi se podedujejo.
    // Podedujeta se tudi obe metodi.

    // mesečna šolnina
    private int solnina;

    /*
    // konstruktor se ne deduje ...
    public IzredniStudent(String ip, String vpisna, int stroskiBivanja, int solnina) {
        // prevajalnik na to mesto samodejno vstavi sledeči klic:
        // super();
        this.ip = ip;
        this.vpisna = vpisna;
        this.stroskiBivanja = stroskiBivanja;
        this.solnina = solnina;
    }
    */

    public IzredniStudent(String ip, String vpisna, int stroskiBivanja, int solnina) {
        super(ip, vpisna, stroskiBivanja);
        this.solnina = solnina;
    }

    @Override
    public int stroski() {
        return this.solnina + super.stroski();
    }
}
