
import java.util.Scanner;

public class Prastevila5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(2);

        for (int kandidat = 3; kandidat <= n; kandidat += 2) {
            if (jePrastevilo(kandidat)) {
                System.out.println(kandidat);
            }
        }
    }

    //
    // Vrne <true> natanko v primeru, če je podano liho število
    // praštevilo. (Parameter mora biti lih, sicer bo rezultat
    // lahko napačen.)
    //
    public static boolean jePrastevilo(int stevilo) {
        int koren = (int) Math.round(Math.sqrt(stevilo));

        for (int d = 3; d <= koren; d += 2) {
            if (stevilo % d == 0) {
                return false;
            }
        }

        return true;
    }

    /*
    public static boolean jePrastevilo(int stevilo) {
        int koren = (int) Math.round(Math.sqrt(stevilo));
        boolean prastevilo = true;

        for (int d = 3; d <= koren; d += 2) {
            if (stevilo % d == 0) {
                prastevilo = false;
                break;
            }
        }

        return prastevilo;
    }
    */
}
