
public class UrediOsebe {

    public static void main(String[] args) {
        Vektor<Oseba> vektor = new Vektor<>();
        vektor.dodaj(new Oseba("Janez", "Novak", 'M', 1970));
        vektor.dodaj(new Oseba("Maja", "Karlin", 'Z', 1975));
        vektor.dodaj(new Oseba("Peter", "Potočnik", 'M', 1982));
        vektor.dodaj(new Oseba("Peter", "Mihevc", 'M', 1960));
        vektor.dodaj(new Oseba("Miha", "Novak", 'M', 1950));
        vektor.dodaj(new Oseba("Eva", "Potočnik", 'Z', 1977));
        uredi(vektor);
        System.out.println(vektor);
    }

    //
    // Naraščajoče uredi podani vektor.
    //
    public static void uredi(Vektor<Oseba> vektor) {
        int stElementov = vektor.steviloElementov();
        for (int i = 1; i < stElementov; i++) {
            // vstavi element vektor[i] na ustrezno mesto v podtabeli
            // vektor[0..i-1]
            Oseba element = vektor.vrni(i);
            int j = i - 1;
            while (j >= 0 && jePrvaVecja(vektor.vrni(j), element)) {
                vektor.nastavi(j + 1, vektor.vrni(j));
                j--;
            }
            vektor.nastavi(j + 1, element);
        }
    }

    //
    // Vrne true natanko v primeru, če oseba a po urejenosti sodi za osebo b.
    //
    private static boolean jePrvaVecja(Oseba a, Oseba b) {
        if (a.vrniPriimek().compareTo(b.vrniPriimek()) > 0) {
            return true;
        }
        return a.vrniPriimek().equals(b.vrniPriimek()) &&
            a.vrniIme().compareTo(b.vrniIme()) > 0;
    }
}
