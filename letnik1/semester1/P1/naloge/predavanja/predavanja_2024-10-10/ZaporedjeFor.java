
import java.util.Scanner;

public class ZaporedjeFor {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Vnesi začetno število: ");
        int zacetek = sc.nextInt();
        System.out.print("Vnesi končno število: ");
        int konec = sc.nextInt();

        /*
        int i = zacetek;
        while (i <= konec) {
            System.out.println(i);
            i = i + 1;  // i++;
        }
        */

        for (int i = zacetek; i <= konec; i++) {
            System.out.println(i);
        }
    }
}
