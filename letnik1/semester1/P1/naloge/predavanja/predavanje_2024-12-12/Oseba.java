
public class Oseba {

    private String ime;
    private String priimek;
    private char spol;
    private int letoRojstva;

    public Oseba(String ime, String priimek, char spol, int letoRojstva) {
        this.ime = ime;
        this.priimek = priimek;
        this.spol = spol;
        this.letoRojstva = letoRojstva;
    }

    public String vrniIme() {
        return this.ime;
    }

    public String vrniPriimek() {
        return this.priimek;
    }

    @Override
    public String toString() {
        return String.format("%s %s (%c) / %d",
                this.ime, this.priimek,
                this.spol, this.letoRojstva);
    }

}
