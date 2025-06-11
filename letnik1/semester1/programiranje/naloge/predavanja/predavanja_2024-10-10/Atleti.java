
import java.util.Scanner;

public class Atleti {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Vnesi število atletov: ");
        int stAtletov = sc.nextInt();

        // doslej največja dolžina (dosedanji rekord)
        int najDolzina = 0;

        // zaporedna številka doslej najboljšega atleta (dosedanji rekorder)
        int najAtlet = 0;

        for (int i = 1; i <= stAtletov; i++) {
            System.out.print("Vnesi dolžino skoka za " + i + ". atleta: ");
            int dolzina = sc.nextInt();

            if (dolzina > najDolzina) {
                // juhuhu, imamo nov rekord!
                najDolzina = dolzina;

                // ... in novega rekorderja!
                najAtlet = i;
            }
        }

        System.out.println("Najboljši je " + najAtlet + ". atlet (" +
                najDolzina + ")");
    }
}
