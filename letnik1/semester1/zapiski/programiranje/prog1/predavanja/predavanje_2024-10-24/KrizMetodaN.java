
import java.util.Scanner;

public class KrizMetodaN {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // zgornji krak
        navpicniKrak(n);

        // sredinska vrstica
        sredinskaVrstica(n);

        // spodnji krak
        navpicniKrak(n);
    }

    //
    // Nariše navpični krak višine <visina>.
    //
    public static void navpicniKrak(int visina) {
        for (int i = 1; i <= visina; i++) {
            zaporedjeZnakov(visina, ' ', false);
            System.out.println("+");
        }
    }

    public static void sredinskaVrstica(int n) {
        zaporedjeZnakov(2 * n + 1, '+', true);
    }

    //
    // Izpiše zaporedje <koliko> znakov <kaj>. Če velja <prelom>, potem
    // na koncu izpiše še prelom vrstice.
    //
    public static void zaporedjeZnakov(int koliko, char kaj, boolean prelom) {
        for (int i = 1; i <= koliko; i++) {
            System.out.print(kaj);
        }
        if (prelom) {
            System.out.println();
        }
    }

}
