
import java.util.Scanner;

public class Prijatelj {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // edini kandidat za prijatelja števila <n>
        int kandidat = vsotaDeliteljev(n);

        // preverimo, ali je kandidat res prijatelj
        if (kandidat != n && vsotaDeliteljev(kandidat) == n) {
            System.out.println(kandidat);
        } else {
            System.out.println("Nima prijatelja");
        }
    }

    //
    // Vrne vsoto deliteljev podanega števila brez števila samega.
    //
    public static int vsotaDeliteljev(int stevilo) {
        int vsota = 0;
        for (int i = 1; i < stevilo; i++) {
            if (stevilo % i == 0) {
                vsota += i;
            }
        }
        return vsota;
    }

}
