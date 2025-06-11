
public class Vektor {

    private static final int ZACETNA_KAPACITETA = 10;

    // kazalec na tabelo, ki hrani elemente
    private Object[] elementi;

    // dejansko število elementov v tabeli
    // (stElementov <= elementi.length)
    private int stElementov;

    public Vektor() {
        // pokliče konstruktor Vektor(int kapaciteta) z argumentom ZACETNA_KAPACITETA
        this(ZACETNA_KAPACITETA);

        // this(...) (če obstaja) mora biti prvi stavek v konstruktorju
    }

    public Vektor(int kapaciteta) {
        this.elementi = new Object[kapaciteta];
        this.stElementov = 0;
    }

    //
    // Vrne dejansko število elementov vektorja this.
    //
    public int steviloElementov() {
        return this.stElementov;
    }

    //
    // Vrne element na podanem indeksu.
    //
    public Object vrni(int indeks) {
        if (indeks >= 0 && indeks < this.stElementov) {
            return this.elementi[indeks];
        }
        // v primeru neveljavnega indeksa sprožimo izjemo
        throw new RuntimeException("Neveljaven indeks!");
    }

    //
    // Element na podanem indeksu nastavi na podano vrednost.
    //
    public void nastavi(int indeks, Object vrednost) {
        this.elementi[indeks] = vrednost;
    }

    //
    // Doda podani element na konec vektorja.
    //
    public void dodaj(Object vrednost) {
        this.poPotrebiPovecaj();
        this.elementi[this.stElementov] = vrednost;
        this.stElementov++;
    }

    //
    // Če je tabela zapolnjena, ustvari novo, večjo tabelo in vanjo skopira
    // elemente.
    //
    private void poPotrebiPovecaj() {
        if (this.stElementov == this.elementi.length) {
            System.out.println("tabela je polna");
            Object[] stariElementi = this.elementi;
            this.elementi = new Object[2 * stariElementi.length];
            for (int i = 0; i < this.stElementov; i++) {
                this.elementi[i] = stariElementi[i];
            }
        }
    }

    //
    // Vrne niz z vsebino vektorja <this>.
    //
    /*
    public String toString() {
        String rezultat = "[";
        for (int i = 0; i < this.stElementov; i++) {
            if (i > 0) {
                rezultat += ", ";
            }
            rezultat += this.elementi[i];
        }
        rezultat += "]";
        return rezultat;
    }
    */
    public String toString() {
        StringBuilder rezultat = new StringBuilder("[");
        for (int i = 0; i < this.stElementov; i++) {
            if (i > 0) {
                rezultat.append(", ");
            }
            rezultat.append(this.elementi[i]);
        }
        rezultat.append("]");
        return rezultat.toString();
    }

    //
    // Pred element z indeksom <indeks> vstavi element z vrednostjo
    // <vrednost>.
    //
    public void vstavi(int indeks, Object vrednost) {
        this.poPotrebiPovecaj();
        for (int i = this.stElementov - 1; i >= indeks; i--) {
            this.elementi[i + 1] = this.elementi[i];
        }
        this.elementi[indeks] = vrednost;
        this.stElementov++;
    }

    //
    // Odstrani element na podanem indeksu
    //
    public void odstrani(int indeks) {
        for (int i = indeks; i < this.stElementov - 1; i++) {
            this.elementi[i] = this.elementi[i + 1];
        }
        this.stElementov--;
    }

}
