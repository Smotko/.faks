
import java.util.*;

/**
 * Objekt tega razreda predstavlja slovar s kljuci tipa K in vrednostmi tipa V.
 * Iterator se bo sprehajal samo po kljucih, zato Iterable<K>.
 */

public class Slovar<K, V> implements Iterable<K> {  

    private static final int PRIVZETA_VELIKOST_TABELE = 97;

    // podatki[i]: kazalec na prvo vozlisce povezanega seznama, v katerem se vsi kljuci preslikajo v indeks i
    private Vozlisce<K, V>[] podatki;
    // stevilo parov kljuc-vrednost
    private int stParov;

    /** konstruktorja */
    
    public Slovar() {
        this(Slovar.PRIVZETA_VELIKOST_TABELE);
    }

    @SuppressWarnings("unchecked")
    public Slovar(int velikostTabele) {
        this.podatki = (Vozlisce<K, V>[]) new Vozlisce<?, ?>[velikostTabele];
        this.stParov = 0;
    }

    /** 
     * Vrne vrednost, ki pripada podanemu kljucu, oziroma null, ce kljuca 
     * ni v slovarju.
     */
     
    public V vrni(K kljuc) {
        // poiscemo vozlisce, ki vsebuje podani kljuc
        Vozlisce<K, V> vozlisce = this.poisci(kljuc);
        if (vozlisce == null)
            return null;
        return vozlisce.vrednost;
    }

    /**
     * Ce vozlisce s podanim kljucem se ne obstaja, potem v slovar shranimo nov par 
     * kljuc-vrednost, sicer pa posodobimo vrednost pri tem kljucu.
     */
     
    public void shrani(K kljuc, V vrednost) {
        Vozlisce<K, V> vozlisce = this.poisci(kljuc);
        
        if (vozlisce != null) {
            // 1 - vozlisce ze obstaja, zato posodobimo vrednost
            vozlisce.vrednost = vrednost;
            return;
        }
        // 2 - izdelati moramo novo vozlisce in ga vstaviti v verigo
        int indeks = this.indeks(kljuc);
        Vozlisce<K, V> novo = new Vozlisce<>(kljuc, vrednost, this.podatki[indeks]);
        this.podatki[indeks] = novo;
        this.stParov++;
    }

    /**
     * Vrne kazalec na vozlisce, ki vsebuje podani kljuc, oziroma null
     * ce takega vozlisca ni.
     */

    private Vozlisce<K, V> poisci(K kljuc) {
        // 1.1 - indeks celice, v katero spada kljuc
        int indeks = this.indeks(kljuc);  

        // 1.2 - kazalec na prvo vozlisce v povezanem seznamu
        Vozlisce<K, V> vozlisce = this.podatki[indeks];

        // potujemo po verigi, dokler ne pridemo bodisi do <null> bodisi do vozlisca,
        // v katerem se ključ ujema (equals) s podanim ključem
        while (vozlisce != null && !vozlisce.kljuc.equals(kljuc))
            vozlisce = vozlisce.naslednje;
        return vozlisce;
    }

    /**
     * Vrne indeks, v katerega se preslika podani kljuc.
     */
     
    private int indeks(K kljuc) {
        int n = this.podatki.length;
        return ((kljuc.hashCode() % n) + n) % n;
    }

    @Override
    public Iterator<K> iterator() {
        return new IteratorPoKljucih<K, V>(this);  
        // this je tipa Slovar<K, V>, zato je tudi razred IteratorPoKljucih
        // odvisen od obeh parametričnih tipov (K in V)
    }

    
    
    /** 
     * [Vozlisce]
     * 
     * objekt tega razreda je eno od vozlisc v enem od povezanih seznamov zgoscene tabele
     */
     
    private static class Vozlisce<K, V> {
        K kljuc;
        V vrednost;
        Vozlisce<K, V> naslednje;   // kazalec na naslednje vozlišče v povezanem seznamu

        Vozlisce(K kljuc, V vrednost, Vozlisce<K, V> naslednje) {
            this.kljuc = kljuc;
            this.vrednost = vrednost;
            this.naslednje = naslednje;
        }
    }   
    
    /** 
     * [Iterator] po odprti hash tabeli (slovarju).
     */ 
    
    private static class IteratorPoKljucih<K, V> implements Iterator<K> {

        // slovar, po katerem se bo iterator this sprehajal
        private Slovar<K, V> slovar;  // zaradi tega potrebujem K in V že v glavi razreda

        // indeks trenutne celice v tabeli
        private int indeks;

        // kazalec na trenutno vozlišče v povezanem seznamu, ki pripada celici
        // tabele z indeksom indeks
        private Vozlisce<K, V> vozlisce;  

        // globalni indeks trenutnega vozlišča
        private int stevec;

        public IteratorPoKljucih(Slovar<K, V> slovar) {
            this.slovar = slovar;
            this.indeks = -1;
            this.stevec = 0;
            this.vozlisce = null;
        }

        @Override
        public boolean hasNext() {
            return this.stevec < this.slovar.stParov;
        }

        @Override
        public K next() {
            if (!this.hasNext()) {
                throw new NoSuchElementException();
            }
            if (this.indeks < 0 || this.vozlisce.naslednje == null) {
                // poiščemo naslednji element v tabeli, ki ni enak null
                // (torej naslednji neprazni povezani seznam)
                do {
                    this.indeks++;
                } while (this.indeks < this.slovar.podatki.length &&
                         this.slovar.podatki[this.indeks] == null);
                this.vozlisce = this.slovar.podatki[this.indeks];
            } else {
                // premaknemo se na naslednje vozlišče v trenutnem povezanem seznamu
                this.vozlisce = this.vozlisce.naslednje;
            }
            this.stevec++;
            return this.vozlisce.kljuc;
        }
    }
}
