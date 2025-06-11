
public class Kvadrat extends Pravokotnik {

    // Vsak objekt tipa Kvadrat ima dva atributa 
    // že samo zaradi dedovanja. To sta <sirina>
    // in <visina>.

    public Kvadrat(double stranica) {
        super(stranica, stranica);
    }

    // Metod ploscina in obseg ne redefiniramo,
    // ker sta podedovani različici že takšni,
    // kot želimo.

    @Override
    public String vrsta() {
        return "kvadrat";
    }

    @Override
    public String podatki() {
        return String.format("stranica = %.1f",
                this.vrniSirino());
    }
}
