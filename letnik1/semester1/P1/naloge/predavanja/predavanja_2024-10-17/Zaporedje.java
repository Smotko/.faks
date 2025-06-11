
import java.util.Scanner;

public class Zaporedje {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Vnesi začetno število: ");
        int zacetek = sc.nextInt();
        System.out.print("Vnesi končno število: ");
        int konec = sc.nextInt();

        int i = zacetek;

        while (i <= konec) {
            System.out.println(i);
            i = i + 1;
        }
    }
}
