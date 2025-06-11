
import java.util.Scanner;

public class KrizMetoda {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // zgornji krak
        navpicniKrak();

        // sredinska vrstica
        for (int i = 1; i <= 9; i++) {
            System.out.print("+");
        }
        System.out.println();

        // spodnji krak
        navpicniKrak();
    }

    //
    // Nariše navpični krak križa.
    //
    public static void navpicniKrak() {
        for (int i = 1; i <= 4; i++) {

            // štirje presledki
            for (int j = 1; j <= 4; j++) {
                System.out.print(" ");
            }

            // plus
            System.out.println("+");
        }
    }

}
