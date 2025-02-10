
import java.util.Scanner;

public class OpisOcene {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ocena = sc.nextInt();

        switch (ocena) {
            case 5:
                System.out.println("odlično");
                break;

            case 4:
                System.out.println("prav dobro");

            case 3:
                System.out.println("dobro");
                break;

            case 2:
                System.out.println("zadostno");
                break;

            // case 1:
            default:
                System.out.println("nezadostno");
                break;
        }
    }
}
