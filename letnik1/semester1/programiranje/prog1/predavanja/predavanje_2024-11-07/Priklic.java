
import java.util.Scanner;

public class Priklic {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Vnesi število števil: ");
        int n = sc.nextInt();

        int[] tabela = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.printf("Vnesi %d. število: ", i + 1);
            tabela[i] = sc.nextInt();
        }

        for (int stevilo: tabela) {
            System.out.println(stevilo);
        }
    }
}
