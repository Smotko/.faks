import java.util.Scanner;
import java.util.Arrays;

public class ZgoscenkeDve {

    /** ce nam Arrays.toString smrdi... */

    private static String vNiz(int[] t) {
        return "";
    }

    /** Vrne indeks najmanjsega elementa v tabeli. */
    
    private static int indeksMinimuma(int[] t) {
        int indeks = 0;
        for (int i = 1; i < t.length; i++){
            if (t[i] < t[indeks]){
                indeks = i;
            }
        }
        return indeks;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int stZgoscenk = sc.nextInt();
        int kapacitetaZgoscenke = sc.nextInt();
        
        int[] zasedenosti = new int[stZgoscenk];

    
        while (sc.hasNextInt()) {
            int fileSize = sc.nextInt();
            int ixMin = indeksMinimuma(zasedenosti);
            // ...
            if(fileSize + zasedenosti[ixMin] > kapacitetaZgoscenke){
                break;
            }
            zasedenosti[ixMin] += fileSize;
            System.out.println(fileSize + " EP -> zgoscenka " + ixMin + " " + Arrays.toString(zasedenosti));
        }
    }
}
