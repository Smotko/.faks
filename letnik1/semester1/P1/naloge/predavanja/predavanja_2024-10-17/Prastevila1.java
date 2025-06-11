
import java.util.Scanner;

public class Prastevila1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int kandidat = 2; kandidat <= n; kandidat++) {
            // preštej delitelje kandidata
            int stDeliteljev = 0;
            for (int d = 1; d <= kandidat; d++) {
                if (kandidat % d == 0) {
                    stDeliteljev++;
                }
            }

            // če je število deliteljev enako 2, je kandidat praštevilo
            if (stDeliteljev == 2) {
                System.out.println(kandidat);
            }
        }

    }
}
