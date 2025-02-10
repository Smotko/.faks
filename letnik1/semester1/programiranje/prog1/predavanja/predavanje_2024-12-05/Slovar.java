
public class Slovar {

    private static final int PRIVZETA_VELIKOST_TABELE = 97;

    private static class Vozlisce {
        Object kljuc;
        Object vrednost;
        Vozlisce naslednje;

        public Vozlisce(Object kljuc, Object vrednost, Vozlisce naslednje) {
            this.kljuc = kljuc;
            this.vrednost = vrednost;
            this.naslednje = naslednje;
        }
    }

    // tabela[i]: kazalec na prvo vozlišče verige, ki vsebuje vsa
    // vozlišča, pri katerih se ključ preslika v indeks i
    private Vozlisce[] tabela;

    public Slovar() {
        this(PRIVZETA_VELIKOST_TABELE);
    }

    public Slovar(int velikostTabele) {
        this.tabela = new Vozlisce[velikostTabele];
    }

    //
    // Za podani ključ vrne indeks na intervalu od 0 do vključno
    // dolžine tabele minus 1.
    //
    private int indeks(Object kljuc) {
        int n = this.tabela.length;
        return (kljuc.hashCode() % n + n) % n;
    }

    //
    // Vrne kazalec na vozlišče, ki vsebuje podani ključ,
    // oziroma <null>, če takega vozlišča ni.
    //
    private Vozlisce poisci(Object kljuc) {
        int indeks = this.indeks(kljuc);
        Vozlisce vozlisce = this.tabela[indeks];
        while (vozlisce != null && !vozlisce.kljuc.equals(kljuc)) {
            vozlisce = vozlisce.naslednje;
        }
        return vozlisce;
    }

    //
    // Vrne vrednost, ki pripada podanemu ključu, oziroma <null>,
    // če ključa ni v slovarju.
    //
    public Object vrni(Object kljuc) {
        Vozlisce vozlisce = this.poisci(kljuc);
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
    public void shrani(Object kljuc, Object vrednost) {
        Vozlisce vozlisce = this.poisci(kljuc);
        if (vozlisce != null) {
            vozlisce.vrednost = vrednost;
        } else {
            int indeks = this.indeks(kljuc);
            Vozlisce novo = new Vozlisce(kljuc, vrednost, this.tabela[indeks]);
            this.tabela[indeks] = novo;
        }
    }
}
