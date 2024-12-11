
import java.util.Scanner;

public class Kriz {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // zgornji krak
        for (int i = 1; i <= 4; i++) {

            // štirje presledki
            for (int j = 1; j <= 4; j++) {
                System.out.print(" ");
            }

            // plus
            System.out.println("+");
        }

        // sredinska vrstica
        for (int i = 1; i <= 9; i++) {
            System.out.print("+");
        }
        System.out.println();

        // spodnji krak
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
