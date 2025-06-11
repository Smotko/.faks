
import java.util.Scanner;

public class Postevanka {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            // izpiši i-to vrstico
            for (int j = 1; j <= n; j++) {
                int zmnozek = i * j;
                System.out.printf("%4d", zmnozek);
            }
            System.out.println(); // skok v naslednjo vrstico
        }
    }
}
