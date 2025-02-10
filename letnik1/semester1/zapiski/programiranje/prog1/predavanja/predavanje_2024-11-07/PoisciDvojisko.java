
public class PoisciDvojisko {

    public static void main(String[] args) {
        int[] tabela = {7, 10, 15, 21, 27, 30, 31, 34, 37, 39, 42, 50, 58, 61, 75};
        System.out.println(poisci(tabela, 42));
        System.out.println(poisci(tabela, 40));
        System.out.println(poisci(tabela, 7));
        System.out.println(poisci(tabela, 75));
        System.out.println(poisci(tabela, 58));
        System.out.println(poisci(tabela, 21));
        System.out.println(poisci(tabela, 28));
    }

    //
    // Vrne indeks elementa x v naraščajoče urejeni tabeli t oziroma -1,
    // če tabela ne vsebuje takega elementa.
    //
    public static int poisci(int[] t, int x) {
        int lm = 0;
        int dm = t.length - 1;

        while (lm <= dm) {
            // indeks sredinskega elementa v trenutni podtabeli
            int s = (lm + dm) / 2;

            if (t[s] == x) {
                return s;
            }
            if (x < t[s]) {
                dm = s - 1;
            } else {
                lm = s + 1;
            }
        }

        return -1;
    }
}
