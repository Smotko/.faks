
import java.util.Scanner;

public class PrvihPetDeliteljevBrezBreak {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int stevec = 0;
        for (int d = 1; d <= n && stevec < 5; d++) {
            if (n % d == 0) {
                System.out.println(d);
                stevec++;
            }
        }
        // break nas vrže na to mesto
    }
}
