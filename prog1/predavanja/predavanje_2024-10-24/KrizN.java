
import java.util.Scanner;

public class KrizN {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // zgornji krak
        for (int i = 1; i <= n; i++) {

            // štirje presledki
            for (int j = 1; j <= n; j++) {
                System.out.print(" ");
            }

            // plus
            System.out.println("+");
        }

        // sredinska vrstica
        for (int i = 1; i <= 2 * n + 1; i++) {
            System.out.print("+");
        }
        System.out.println();

        // spodnji krak
        for (int i = 1; i <= n; i++) {

            // štirje presledki
            for (int j = 1; j <= n; j++) {
                System.out.print(" ");
            }

            // plus
            System.out.println("+");
        }
    }

}
