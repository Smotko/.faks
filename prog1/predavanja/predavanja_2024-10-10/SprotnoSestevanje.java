
import java.util.Scanner;

public class SprotnoSestevanje {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int vsota = 0;

        while (vsota <= 42) {
            // preberemo število
            System.out.print("Vnesi število: ");
            int stevilo = sc.nextInt();

            // število prištejemo tekoči vsoti
            vsota = vsota + stevilo;

            // tekočo vsoto izpišemo
            System.out.println(vsota);
        }
    }
}
