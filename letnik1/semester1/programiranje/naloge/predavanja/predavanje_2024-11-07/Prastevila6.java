
import java.util.Scanner;

public class Prastevila6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // sestavljeno[i] == true pomeni, da smo ugotovili,
        // da je število i sestavljeno število
        boolean[] sestavljeno = new boolean[n + 1];

        int koren = (int) Math.round(Math.sqrt(n));

        int p = 2;
        while (p <= koren) {
            // elemente na indeksih, ki so večkratniki števila p,
            // nastavimo na true (ta števila so gotovo sestavljena)
            //for (int i = 2 * p; i <= n; i += p) {
            for (int i = p * p; i <= n; i += p) {
                sestavljeno[i] = true;
            }

            do {
                p++;
            } while (p <= koren && sestavljeno[p]);
        }

        // izpis praštevil (vsi indeksi, pri katerih je element enak false)
        System.out.println(2);
        for (int i = 3; i <= n; i += 2) {
            if (!sestavljeno[i]) {
                System.out.println(i);
            }
        }
    }
}
