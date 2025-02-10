
import java.util.Arrays;

public class Uredi {

    public static void main(String[] args) {
        Vektor<Integer> vektor = new Vektor<>();
        vektor.dodaj(80);
        vektor.dodaj(50);
        vektor.dodaj(75);
        vektor.dodaj(30);
        vektor.dodaj(45);
        vektor.dodaj(60);
        vektor.dodaj(95);
        vektor.dodaj(20);
        uredi(vektor);
        System.out.println(vektor);
    }

    //
    // Naraščajoče uredi podani vektor.
    //
    public static void uredi(Vektor<Integer> vektor) {
        int stElementov = vektor.steviloElementov();
        for (int i = 1; i < stElementov; i++) {
            // vstavi element vektor[i] na ustrezno mesto v podtabeli
            // vektor[0..i-1]
            int element = vektor.vrni(i);
            int j = i - 1;
            while (j >= 0 && vektor.vrni(j) > element) {
                vektor.nastavi(j + 1, vektor.vrni(j));
                j--;
            }
            vektor.nastavi(j + 1, element);
        }
    }
}
