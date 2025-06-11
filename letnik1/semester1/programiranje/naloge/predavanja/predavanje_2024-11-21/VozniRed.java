
import java.util.Scanner;

public class VozniRed {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int uraZac = sc.nextInt();
        int minutaZac = sc.nextInt();
        int uraKon = sc.nextInt();
        int minutaKon = sc.nextInt();
        int interval = sc.nextInt();  // v minutah

        Cas cas = new Cas(uraZac, minutaZac);    // prvi odhod
        Cas casKon = new Cas(uraKon, minutaKon); // najkasnejši možni zadnji odhod

        while (cas.jeManjsiAliEnakKot(casKon)) {
            System.out.println(cas.toString());
            cas = cas.plus(0, interval);
        }
    }
}
