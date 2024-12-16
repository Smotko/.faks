
// K: tip ključa
// V: tip vrednost

public class Slovar<K, V> {

    private static final int PRIVZETA_VELIKOST_TABELE = 97;

    private static class Vozlisce<K, V> {
        K kljuc;
        V vrednost;
        Vozlisce<K, V> naslednje;

        public Vozlisce(K kljuc, V vrednost, Vozlisce<K, V> naslednje) {
            this.kljuc = kljuc;
            this.vrednost = vrednost;
            this.naslednje = naslednje;
        }
    }

    // tabela[i]: kazalec na prvo vozlišče verige, ki vsebuje vsa
    // vozlišča, pri katerih se ključ preslika v indeks i
    private Vozlisce<K, V>[] tabela;

    public Slovar() {
        this(PRIVZETA_VELIKOST_TABELE);
    }

    @SuppressWarnings("unchecked")
    public Slovar(int velikostTabele) {
        this.tabela = (Vozlisce<K, V>[]) new Vozlisce[velikostTabele];
    }

    //
    // Za podani ključ vrne indeks na intervalu od 0 do vključno
    // dolžine tabele minus 1.
    //
    private int indeks(K kljuc) {
        int n = this.tabela.length;
        return (kljuc.hashCode() % n + n) % n;
    }

    //
    // Vrne kazalec na vozlišče, ki vsebuje podani ključ,
    // oziroma <null>, če takega vozlišča ni.
    //
    private Vozlisce<K, V> poisci(K kljuc) {
        int indeks = this.indeks(kljuc);
        Vozlisce<K, V> vozlisce = this.tabela[indeks];
        while (vozlisce != null && !vozlisce.kljuc.equals(kljuc)) {
            vozlisce = vozlisce.naslednje;
        }
        return vozlisce;
    }

    //
    // Vrne vrednost, ki pripada podanemu ključu, oziroma <null>,
    // če ključa ni v slovarju.
    //
    public V vrni(K kljuc) {
        Vozlisce<K, V> vozlisce = this.poisci(kljuc);
        if (vozlisce == null) {
            return null;
        }
        return vozlisce.vrednost;
    }

    //
    // Če podanega ključa še ni v slovarju, ga shrani skupaj s podano
    // vrednostjo, v nasprotnem primeru pa posodobi vrednost, ki pripada
    // obstoječemu ključu.
    //
    public void shrani(K kljuc, V vrednost) {
        Vozlisce<K, V> vozlisce = this.poisci(kljuc);
        if (vozlisce != null) {
            vozlisce.vrednost = vrednost;
        } else {
            int indeks = this.indeks(kljuc);
            Vozlisce<K, V> novo = new Vozlisce<K, V>(kljuc, vrednost, this.tabela[indeks]);
            this.tabela[indeks] = novo;
        }
    }
}
