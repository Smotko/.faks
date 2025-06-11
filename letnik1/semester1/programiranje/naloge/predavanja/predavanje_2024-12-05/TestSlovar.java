
public class TestSlovar {

    public static void main(String[] args) {
        Slovar drzava2sosedje = new Slovar();
        drzava2sosedje.shrani("Nemčija", 9);
        drzava2sosedje.shrani("Avstrija", 8);
        drzava2sosedje.shrani("Slovenija", 4);
        drzava2sosedje.shrani("Češka", 4);

        System.out.println(drzava2sosedje.vrni("Avstrija"));
        System.out.println(drzava2sosedje.vrni("Češka"));

        drzava2sosedje.shrani("Avstrija", 9);
        System.out.println(drzava2sosedje.vrni("Avstrija"));

        Slovar opravki = new Slovar();
        opravki.shrani(new Cas(12, 30), "kosilo");
        opravki.shrani(new Cas(8, 15), "predavanja");
        opravki.shrani(new Cas(22, 0), "spanje");
        opravki.shrani(new Cas(17, 30), "tek");

        System.out.println(opravki.vrni(new Cas(8, 15)));
        System.out.println(opravki.vrni(new Cas(12, 30)));
    }
}
