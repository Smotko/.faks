
public class TestVektorInt {

    public static void main(String[] args) {
        VektorInt vektor = new VektorInt();
        vektor.dodaj(20);
        vektor.dodaj(55);
        vektor.dodaj(11);
        vektor.dodaj(10);
        vektor.dodaj(22);
        vektor.dodaj(43);
        vektor.dodaj(41);

        System.out.println(vektor.vrni(3));
        System.out.println(vektor.vrni(6));

        vektor.nastavi(4, 25);
        System.out.println(vektor.vrni(4));

        System.out.println(vektor.toString());

        vektor.vstavi(3, 60);
        System.out.println(vektor.toString());
        vektor.odstrani(4);
        System.out.println(vektor.toString());

        VektorInt v2 = new VektorInt(1000);
    }
}
