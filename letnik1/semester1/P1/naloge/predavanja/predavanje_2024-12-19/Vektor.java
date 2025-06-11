
import java.util.*;

public class Vektor<T> implements Iterable<T> {

    private static final int ZACETNA_KAPACITETA = 10;

    // kazalec na tabelo, ki hrani elemente
    private T[] elementi;

    // dejansko število elementov v tabeli
    // (stElementov <= elementi.length)
    private int stElementov;

    public Vektor() {
        // pokliče konstruktor Vektor(int kapaciteta) z argumentom ZACETNA_KAPACITETA
        this(ZACETNA_KAPACITETA);

        // this(...) (če obstaja) mora biti prvi stavek v konstruktorju
    }

    @SuppressWarnings("unchecked")
    public Vektor(int kapaciteta) {
        this.elementi = (T[]) new Object[kapaciteta];
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
    public T vrni(int indeks) {
        if (indeks >= 0 && indeks < this.stElementov) {
            return this.elementi[indeks];
        }
        // v primeru neveljavnega indeksa sprožimo izjemo
        throw new RuntimeException("Neveljaven indeks!");
    }

    //
    // Element na podanem indeksu nastavi na podano vrednost.
    //
    public void nastavi(int indeks, T vrednost) {
        this.elementi[indeks] = vrednost;
    }

    //
    // Doda podani element na konec vektorja.
    //
    public void dodaj(T vrednost) {
        this.poPotrebiPovecaj();
        this.elementi[this.stElementov] = vrednost;
        this.stElementov++;
    }

    //
    // Če je tabela zapolnjena, ustvari novo, večjo tabelo in vanjo skopira
    // elemente.
    //
    @SuppressWarnings("unchecked")
    private void poPotrebiPovecaj() {
        if (this.stElementov == this.elementi.length) {
            System.out.println("tabela je polna");
            T[] stariElementi = this.elementi;
            this.elementi = (T[]) new Object[2 * stariElementi.length];
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
    public void vstavi(int indeks, T vrednost) {
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

    //
    // Vrne iterator po vektorju <this>.
    //
    @Override
    public Iterator<T> iterator() {
        return new IteratorCezVektor<T>(this);
    }

    private static class IteratorCezVektor<T> implements Iterator<T> {
        private Vektor<T> vektor;   // vektor, po katerem se sprehajamo
        private int indeks;         // indeks naslednjega elementa, ki ga vrne metoda next

        public IteratorCezVektor(Vektor<T> vektor) {
            this.vektor = vektor;
            this.indeks = 0;
        }

        @Override
        public boolean hasNext() {
            return this.indeks < this.vektor.steviloElementov();
        }

        @Override
        public T next() {
            if (!this.hasNext()) {
                throw new NoSuchElementException();
            }
            return this.vektor.vrni(this.indeks++);
        }
    }
}
