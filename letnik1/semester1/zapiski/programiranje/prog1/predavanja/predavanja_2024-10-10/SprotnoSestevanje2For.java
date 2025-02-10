
import java.util.Scanner;

public class SprotnoSestevanje2For {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /*
        int vsota = 0;   // tekoča vsota (vsota doslej vnesenih števil)
        int stVnosov = 0;  // števec vnosov

        while (stVnosov < 5) {
            // preberemo število
            System.out.print("Vnesi število: ");
            int stevilo = sc.nextInt();

            stVnosov = stVnosov + 1;
            // stVnosov++; ali ++stVnosov;

            // število prištejemo tekoči vsoti
            vsota = vsota + stevilo;

            // tekočo vsoto izpišemo
            System.out.println(vsota);
        }
        */

        int vsota = 0;
        for (int stVnosov = 0; stVnosov < 5; stVnosov++) {
            System.out.print("Vnesi število: ");
            int stevilo = sc.nextInt();

            vsota = vsota + stevilo;
            System.out.println(vsota);
        }
    }
}
