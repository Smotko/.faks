
/*
Pomo"zni razred za predstavitev "casovnih trenutkov (na"s stari znanec s predavanj).

POZOR: tega razreda ne spreminjajte in ne oddajajte!
*/

import java.util.*;

public class Cas implements Comparable<Cas> {
    private int ura;
    private int minuta;

    public Cas(int h, int min) {
        this.ura = h;
        this.minuta = min;
    }

    public int vrniUro() {
        return this.ura;
    }

    public int vrniMinuto() {
        return this.minuta;
    }

    @Override
    public String toString() {
        return String.format("%d:%02d", this.ura, this.minuta);
    }

    @Override
    public boolean equals(Object drugi) {
        if (this == drugi) {
            return true;
        }
        if (!(drugi instanceof Cas)) {
            return false;   
        }
        Cas drugiCas = (Cas) drugi;
        return this.ura == drugiCas.ura && this.minuta == drugiCas.minuta;
    }

    @Override
    public int hashCode() {
        return 17 * Integer.hashCode(this.ura) + 
               31 * Integer.hashCode(this.minuta);
    }

    @Override
    public int compareTo(Cas cas) {
        return this.razlikaVMin(cas);
    }

    //
    // Vrne NOV objekt, ki predstavlja trenutek, ki je za h ur in min minut
    // premaknjen glede na objekt, na katerega kaže this.
    //
    public Cas plus(int h, int min) {
        int t = 60 * (this.ura + h) + (this.minuta + min);
        t = (t % 1440 + 1440) % 1440;
        return new Cas(t / 60, t % 60);
    }

    //
    // Vrne razliko med trenutkoma <this> in <drugi> v minutah.
    //
    public int razlikaVMin(Cas drugi) {
        return (this.ura - drugi.ura) * 60 + (this.minuta - drugi.minuta);
    }
}
