
import java.util.Scanner;
import java.util.Random;

public class Ugibanje {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Vnesi zgornjo mejo: ");
        int meja = sc.nextInt();

        Random random = new Random();
        int izbrano = random.nextInt(meja) + 1;

        int vnos = 0;
        int stPoskusov = 0;
        do {
            // preberi število
            System.out.print("Tvoj poskus: ");
            vnos = sc.nextInt(); 
            stPoskusov++;

            // primerjaj vnos z računalnikovo izbiro
            if (izbrano > vnos) {
                System.out.println("Izbrano število je večje od vnesenega.");
            } else if (izbrano < vnos) {
                System.out.println("Izbrano število je manjše od vnesenega.");
            }
        } while (vnos != izbrano);

        System.out.println("Čestitke! Uganil si v " + stPoskusov + " poskusih.");
    }
}
