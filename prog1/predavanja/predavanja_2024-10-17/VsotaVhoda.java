
import java.util.Scanner;

public class VsotaVhoda {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int vsota = 0;   // tekoča vsota (vsota doslej vnesenih števil)

        while (sc.hasNextInt()) {
            int stevilo = sc.nextInt();

            // število prištejemo tekoči vsoti
            vsota = vsota + stevilo;
            // krajše: vsota += stevilo;

            // tekočo vsoto izpišemo
            System.out.println(vsota);
        }
    }
}
