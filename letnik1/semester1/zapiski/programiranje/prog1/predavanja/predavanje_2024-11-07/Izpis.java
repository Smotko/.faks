
import java.util.Arrays;

public class Izpis {

    public static void main(String[] args) {
        int[][] t = {{10, 20, 5, 6}, {30, 50, 20, 11}, {17, 33, 12, 16}};

        for (int i = 0; i < t.length; i++) {
            for (int j = 0; j < t[i].length; j++) {
                System.out.printf("%3d", t[i][j]);
            }
            System.out.println();
        }
        System.out.println();

        //for (tip_elementa spremenljivka: tabela) {
        for (int[] vrstica: t) {
            for (int element: vrstica) {
                System.out.printf("%3d", element);
            }
            System.out.println();
        }

        int[] vsota = vsotaPoVrsticah(t);
        System.out.println(Arrays.toString(vsota));

        int[] maksimumi = indeksiMaksimumovPoStolpcih(t);
        System.out.println(Arrays.toString(maksimumi));
    }

    //
    // Izdela tabelo, v kateri i-ti element vsebuje vsoto i-te vrstice podane
    // tabele. Vrne kazalec na izdelano tabelo.
    //
    public static int[] vsotaPoVrsticah(int[][] t) {
        int[] vsota = new int[t.length];
        for (int i = 0; i < t.length; i++) {
            int vsotaVrstice = 0;
            for (int j = 0; j < t[i].length; j++) {
                vsotaVrstice += t[i][j];
            }
            vsota[i] = vsotaVrstice;
        }
        return vsota;
    }

    //
    // Izdela tabelo, v kateri i-ti element vsebuje indeks maksimuma v i-tem
    // stolpcu podane tabele. Vrne kazalec na izdelano tabelo.
    //
    public static int[] indeksiMaksimumovPoStolpcih(int[][] t) {
        // predpostavka 1: tabela t ima vsaj eno vrstico
        // predpostavka 2: vse vrstice imajo enako število elementov
        int stStolpcev = t[0].length;
        int[] maksimumi = new int[stStolpcev];

        for (int i = 0; i < stStolpcev; i++) {
            int jMax = 0;
            for (int j = 0; j < t.length; j++) {
                if (t[j][i] > t[jMax][i]) {
                    jMax = j;
                }
            }
            maksimumi[i] = jMax;
        }

        return maksimumi;
    }
}
