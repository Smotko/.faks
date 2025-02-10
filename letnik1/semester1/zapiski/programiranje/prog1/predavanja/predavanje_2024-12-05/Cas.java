
public class Cas {
    private int ura;
    private int minuta;

    public Cas(int h, int min) {
        this.ura = h;
        this.minuta = min;
    }

    /*
    @Override
    public String toString() {
        return String.format("%d:%02d", this.ura, this.minuta);
    }
    */

    @Override
    public int hashCode() {
        return 60 * this.ura + this.minuta;
    }

    public boolean jeEnakKot(Cas drugi) {
        return this.ura == drugi.ura && this.minuta == drugi.minuta;
    }

    /*
    @Override
    public boolean equals(Object obj) {
        // return this == obj;  // tako deluje že metoda equals v razredu
        // Object

        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Cas)) {
            return false;
        }

        // obj kaže na objekt tipa Cas, zato lahko dostopamo
        // do atributov ura in minuta
        Cas drugi = (Cas) obj;
        return this.ura == drugi.ura && this.minuta == drugi.minuta;
    }
    */
}
