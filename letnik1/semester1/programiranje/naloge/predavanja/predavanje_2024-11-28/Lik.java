
public abstract class Lik {

    public String toString() {
        return String.format("%s [%s]",
                this.vrsta(), this.podatki());
    }

    public abstract double ploscina();

    public abstract double obseg();

    public abstract String vrsta();

    public abstract String podatki();

}
