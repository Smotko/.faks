
import java.util.*;

public class TestVektor {

    public static void main(String[] args) {
        Vektor<Oseba> osebe = new Vektor<>();
        osebe.dodaj(new Oseba("Janez", "Novak", 'M', 1950));
        osebe.dodaj(new Oseba("Ana", "Novak", 'Z', 1960));
        osebe.dodaj(new Oseba("Milan", "Petek", 'M', 1980));
        osebe.dodaj(new Oseba("Milan", "Novak", 'M', 1990));
        osebe.dodaj(new Oseba("Mojca", "Debeljak", 'Z', 1940));

        Iterator<Oseba> it = osebe.iterator();
        while (it.hasNext()) {
            Oseba oseba = it.next();
            System.out.println(oseba);
        }
        System.out.println();

        for (Oseba oseba: osebe) {
            System.out.println(oseba);
        }
    }
}
