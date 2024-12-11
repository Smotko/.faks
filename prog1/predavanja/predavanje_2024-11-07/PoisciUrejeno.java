
public class PoisciUrejeno {

    public static void main(String[] args) {
        int[] tabela = {7, 10, 15, 21, 27, 30, 31, 34, 37, 39, 42, 50, 58, 61, 75};
        System.out.println(poisci(tabela, 42));
        System.out.println(poisci(tabela, 40));
    }

    //
    // Vrne indeks elementa x v naraščajoče urejeni tabeli t oziroma -1,
    // če tabela ne vsebuje takega elementa.
    //
    public static int poisci(int[] t, int x) {
        for (int i = 0; i < t.length; i++) {
            if (t[i] == x) {
                return i;
            }
            if (t[i] > x) {
                return -1;
            }
        }
        // na to točko pridemo samo v primeru,
        // če elementa x ni v tabeli
        // (če bi bil, bi return znotraj zanke 
        // takoj zaključil izvajanje metode)
        return -1;
    }
}
