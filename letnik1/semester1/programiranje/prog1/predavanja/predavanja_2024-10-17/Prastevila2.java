
import java.util.Scanner;

public class Prastevila2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int kandidat = 2; kandidat <= n; kandidat++) {

            // preveri, ali je <kandidat> deljiv s katerimkoli
            // od števil 2, 3, ..., kandidat-1

            boolean prastevilo = true;

            for (int d = 2; d < kandidat; d++) {
                if (kandidat % d == 0) {
                    // aha, kandidat ni praštevilo!
                    prastevilo = false;
                    break;
                }
            }

            // break nas vrže sem
            // če je <prastevilo> enako true, potem vemo, da se je zanka
            // iztekla po naravni poti (to pomeni, da se break ni izvedel)
            if (prastevilo) {   // okrajšava za if (prastevilo == true)
                System.out.println(kandidat);
            }

        }

    }
}
