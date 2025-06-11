
public class Glavni {

    public static void main(String[] args) {
        /*
        Lik lik = new Pravokotnik(2.0, 3.0);
        Pravokotnik p = (Pravokotnik) lik;
        System.out.println(p.vrniSirino());

        //Krog kr = (Krog) lik;
        //Kvadrat kv = (Kvadrat) lik;

        Lik lik2 = new Kvadrat(4.0);
        Pravokotnik p2 = (Pravokotnik) lik2;

        Lik kr2 = (Lik) p2;
        */

        /*
        //Kvadrat k = new Kvadrat(5.0);
        Lik k = new Kvadrat(5.0);
        System.out.println(k.toString());
        System.out.println(k.ploscina());
        System.out.println(k.obseg());
        */

        Lik[] liki = {
            new Pravokotnik(3.0, 8.0),
            new Krog(6.0),
            new Kvadrat(7.0),
            new Pravokotnik(4.0, 5.0)
        };

        izpisiPodatke(liki);
        System.out.println();
        System.out.println(likZNajvecjoPloscino(liki));
        System.out.println();

        Pravokotnik najP = pravokotnikZNajvecjoSirino(liki);
        System.out.println(najP.toString());
    }

    //
    // Izpiše podatke o vseh likih v tabeli.
    //
    public static void izpisiPodatke(Lik[] liki) {
        for (Lik lik: liki) {
            System.out.printf("%s | p = %.1f, o = %.1f%n",
                    lik.toString(), lik.ploscina(), lik.obseg());
        }
        System.out.println();
    }

    //
    // Vrne lik z največjo ploščino.
    //
    public static Lik likZNajvecjoPloscino(Lik[] liki) {
        Lik najLik = null;    // lik z doslej največjo ploščino 
        double najPloscina = 0.0;   // doslej največja ploščina

        for (Lik lik: liki) {
            double ploscina = lik.ploscina();
            if (najLik == null || ploscina > najPloscina) {
                najLik = lik;
                najPloscina = ploscina;
            }
        }

        return najLik;
    }

    //
    // Vrne pravokotnik z največjo širino (oz. null, če v tabeli ni nobenega
    // pravokotnika).
    //
    public static Pravokotnik pravokotnikZNajvecjoSirino(Lik[] liki) {
        Pravokotnik naj = null;
        double najSirina = 0.0;

        for (Lik lik: liki) {
            //if (lik.vrsta().equals("pravokotnik")) {
            // ali kazalec <lik> kaže na objekt tipa Pravokotnik ali podtipa
            // tipa Pravokotnik
            if (lik instanceof Pravokotnik) {
                Pravokotnik p = (Pravokotnik) lik;
                double sirina = p.vrniSirino();
                if (naj == null || sirina > najSirina) {
                    //naj = lik;
                    naj = p;
                    najSirina = sirina;
                }
            }
        }
        return naj;
    }
}

