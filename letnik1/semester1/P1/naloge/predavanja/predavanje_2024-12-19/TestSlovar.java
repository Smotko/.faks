
import java.util.*;

public class TestSlovar {

    public static void main(String[] args) {
        Slovar<String, Integer> drzava2sosedje = new Slovar<>();
        drzava2sosedje.shrani("Nemčija", 9);
        drzava2sosedje.shrani("Avstrija", 8);
        drzava2sosedje.shrani("Slovenija", 4);
        drzava2sosedje.shrani("Češka", 4);
        drzava2sosedje.shrani("Malta", 0);
        drzava2sosedje.shrani("Italija", 6);
        drzava2sosedje.shrani("Francija", 8);

        Iterator<String> it = drzava2sosedje.iterator();
        while (it.hasNext()) {
            String drzava = it.next();
            System.out.printf("%s -> %s%n", drzava, drzava2sosedje.vrni(drzava));
        }
        System.out.println();

        for (String drzava: drzava2sosedje) {
            System.out.printf("%s -> %s%n", drzava, drzava2sosedje.vrni(drzava));
        }
    }
}
