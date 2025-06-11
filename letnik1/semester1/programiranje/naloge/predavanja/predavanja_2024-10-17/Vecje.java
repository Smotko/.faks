
import java.util.Scanner;

public class Vecje {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Vnesi prvo število: ");
        int prvo = sc.nextInt();

        System.out.print("Vnesi drugo število: ");
        int drugo = sc.nextInt();

        if (prvo > drugo) {
            System.out.println("Prvo je večje");
        } else if (prvo == drugo) {
            System.out.println("Števili sta enaki");
        } else {
            System.out.println("Drugo je večje");
        }
        
    }
}
