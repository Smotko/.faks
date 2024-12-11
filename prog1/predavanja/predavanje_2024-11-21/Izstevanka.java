
import java.util.Scanner;

public class Izstevanka {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int stOtrok = sc.nextInt();
        int stBesed = sc.nextInt();

        VektorString otroci = new VektorString();
        for (int i = 0; i < stOtrok; i++) {
            otroci.dodaj(sc.next());
        }

        // število krogov izštevanke
        int stKrogov = stOtrok - 1;

        for (int krog = 1; krog <= stKrogov; krog++) {
            // ugotovimo, kdo izpade
            int ixIzpadlega = (stBesed - 1) % stOtrok;

            // izpiši izpadlega
            System.out.println(otroci.vrni(ixIzpadlega));

            // izloči izpadlega
            otroci.odstrani(ixIzpadlega);

            // izpišemo tiste, ki ostanejo
            System.out.println(otroci.toString());

            stOtrok--;
        }

    }
}
