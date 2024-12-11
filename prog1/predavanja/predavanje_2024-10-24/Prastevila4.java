
import java.util.Scanner;

public class Prastevila4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(2);

        for (int kandidat = 3; kandidat <= n; kandidat += 2) {

            // preveri, ali je <kandidat> deljiv s katerimkoli
            // od števil 2, 3, ..., kandidat-1

            boolean prastevilo = true;

            int korenKandidata = (int) Math.round(Math.sqrt(kandidat));

            for (int d = 3; d <= korenKandidata; d += 2) {
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
