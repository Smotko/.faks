
import java.util.Scanner;

public class Dvainstirideset {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int stevilo;
        do {
            System.out.print("Vnesi število: ");
            stevilo = sc.nextInt();
        } while (stevilo != 42);

        /*
        do {
            System.out.print("Vnesi število: ");
        } while (sc.nextInt() != 42);
        */

        /*
        System.out.print("Vnesi število: ");
        int stevilo = sc.nextInt();
        while (stevilo != 42) {
            System.out.print("Vnesi število: ");
            stevilo = sc.nextInt();
        }
        */
    }
}
