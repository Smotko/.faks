
import java.util.*;

public class Oseba implements Comparable<Oseba> {

    private String ime;
    private String priimek;
    private char spol;
    private int letoRojstva;

    private static class PrimerjalnikPoSpoluInStarosti implements Comparator<Oseba> {
        @Override
        public int compare(Oseba prva, Oseba druga) {
            if (prva.spol == druga.spol) {
                return prva.letoRojstva - druga.letoRojstva;
            }
            return druga.spol - prva.spol;
        }
    }

    public Oseba(String ime, String priimek, char spol, int letoRojstva) {
        this.ime = ime;
        this.priimek = priimek;
        this.spol = spol;
        this.letoRojstva = letoRojstva;
    }

    @Override
    public int compareTo(Oseba druga) {
        if (this.priimek.equals(druga.priimek)) {
            return this.ime.compareTo(druga.ime);
        }
        return this.priimek.compareTo(druga.priimek);
    }

    public static Comparator<Oseba> primerjalnikPoSpoluInStarosti() {
        return new PrimerjalnikPoSpoluInStarosti();
    }

    @Override
    public String toString() {
        return String.format("%s %s (%c) / %d", 
                this.ime, this.priimek, this.spol, this.letoRojstva);
    }
}
