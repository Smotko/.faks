
import java.util.Arrays;

public class Uredi {

    public static void main(String[] args) {
        int[] tabela = {80, 50, 75, 30, 45, 60, 95, 20};
        uredi(tabela);
        System.out.println(Arrays.toString(tabela));
    }

    //
    // Naraščajoče uredi podano tabelo.
    //
    public static void uredi(int[] t) {
        for (int i = 1; i < t.length; i++) {
            // vstavi element t[i] na ustrezno mesto v podtabeli
            // t[0..i-1]
            int element = t[i];
            int j = i - 1;
            while (j >= 0 && t[j] > element) {
                t[j + 1] = t[j];
                j--;
            }
            t[j + 1] = element;
        }
    }
}
