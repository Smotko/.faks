
import java.util.*;

public class Urejanje {

    public static void main(String[] args) {
        Vektor<Cas> casi = new Vektor<>();
        casi.dodaj(new Cas(10, 20));
        casi.dodaj(new Cas(20, 10));
        casi.dodaj(new Cas(5, 30));
        casi.dodaj(new Cas(15, 10));
        uredi(casi);
        System.out.println(casi);

        Vektor<Oseba> osebe = new Vektor<>();
        osebe.dodaj(new Oseba("Janez", "Novak", 'M', 1950));
        osebe.dodaj(new Oseba("Ana", "Novak", 'Z', 1960));
        osebe.dodaj(new Oseba("Milan", "Petek", 'M', 1980));
        osebe.dodaj(new Oseba("Milan", "Novak", 'M', 1990));
        osebe.dodaj(new Oseba("Mojca", "Debeljak", 'Z', 1940));
        uredi(osebe);
        System.out.println(osebe);

        Comparator<Oseba> prim = Oseba.primerjalnikPoSpoluInStarosti();
        uredi(osebe, prim);
        System.out.println(osebe);
    }

    public static <T extends Comparable<T>> void uredi(Vektor<T> vektor) {

        int stElementov = vektor.steviloElementov();
        for (int i = 1; i < stElementov; i++) {
            // vstavimo element t[i] na ustrezno mesto v podtabeli t[0..i-1]
            // (tj. v že urejenem delu tabele)
            T trenutni = vektor.vrni(i);
            int j = i - 1;
            while (j >= 0 && vektor.vrni(j).compareTo(trenutni) > 0) {
                vektor.nastavi(j + 1, vektor.vrni(j));
                j--;
            }
            vektor.nastavi(j + 1, trenutni);
        }
    }

    public static <T> void uredi(Vektor<T> vektor, Comparator<T> prim) {

        int stElementov = vektor.steviloElementov();
        for (int i = 1; i < stElementov; i++) {
            // vstavimo element t[i] na ustrezno mesto v podtabeli t[0..i-1]
            // (tj. v že urejenem delu tabele)
            T trenutni = vektor.vrni(i);
            int j = i - 1;
            while (j >= 0 && prim.compare(vektor.vrni(j), trenutni) > 0) {
                vektor.nastavi(j + 1, vektor.vrni(j));
                j--;
            }
            vektor.nastavi(j + 1, trenutni);
        }
    }
}
