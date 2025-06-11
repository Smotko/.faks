
import java.util.Scanner;

public class StatistikaOcen {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Vnesi število učencev: ");
        int stUcencev = sc.nextInt();

        // element stevci[k] bo hranil število ocen k + 1
        int[] stevci = new int[5];   // {0, 0, 0, 0, 0}

        for (int i = 1; i <= stUcencev; i++) {
            System.out.printf("Vnesi oceno za %d. učenca: ", i);
            int ocena = sc.nextInt();
            stevci[ocena - 1]++;
        }

        for (int ocena = 1; ocena <= 5; ocena++) {
            System.out.printf("Število ocen %d: %d%n", ocena, stevci[ocena - 1]);
        }
    }
}
