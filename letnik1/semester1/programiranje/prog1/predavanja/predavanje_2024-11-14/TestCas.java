
public class TestCas {

    public static void main(String[] args) {
        /*
        Cas kosilo = new Cas();
        kosilo.ura = 12;
        kosilo.minuta = 30;
        */

        Cas kosilo = new Cas(12, 30);
        Cas malica = new Cas(16, 0);
        //Cas.izpisiStatic(kosilo);
        kosilo.izpisi();
        //Cas.izpisiStatic(malica);
        malica.izpisi();

        Cas.pristejStatic(kosilo, 1, 10);
        kosilo.izpisi();

        kosilo.pristej(1, 10);
        kosilo.izpisi();
        System.out.println(kosilo.toString());

        Cas vecerja = new Cas(18, 50);
        System.out.printf("ura = %d, minuta = %d%n",
                vecerja.vrniUro(), vecerja.vrniMinuto());

        //int uraVecerje = vecerja.vrniUro();

        vecerja.nastaviUro(19);
        System.out.println(vecerja.toString());

        Cas a = new Cas(10, 30);
        Cas b = a;
        a.nastaviUro(11);
        System.out.println(a.toString());
        System.out.println(b.toString());

        Cas predavanja = new Cas(8, 15);
        Cas vaje = predavanja.plus(2, 45);
        System.out.println();
        System.out.println(predavanja.toString());
        System.out.println(vaje.toString());

        Cas p = new Cas(15, 10);
        Cas q = p;
        Cas r = new Cas(15, 10);
        System.out.println(p.jeEnakKot(q));
        System.out.println(p.jeEnakKot(r));

        System.out.println();
        Cas zajtrk = new Cas(6, 35);
        Cas kopalnica = new Cas(7, 10);
        System.out.println(kopalnica.razlika(zajtrk));
        System.out.println(kopalnica.jeManjsiAliEnakKot(zajtrk));
        System.out.println(zajtrk.jeManjsiAliEnakKot(kopalnica));
    }
}
