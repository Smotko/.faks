
public class Poisci {

    public static void main(String[] args) {
        int[] tabela = {20, 15, 32, 18, 40, 60, 22, 50};
        System.out.println(poisci(tabela, 32));
        System.out.println(poisci(tabela, 50));
        System.out.println(poisci(tabela, 20));
        System.out.println(poisci(tabela, 42));
    }

    //
    // Vrne indeks elementa x v tabeli t oziroma -1,
    // če tabela ne vsebuje takega elementa.
    //
    public static int poisci(int[] t, int x) {
        for (int i = 0; i < t.length; i++) {
            if (t[i] == x) {
                return i;
            }
        }
        // na to točko pridemo samo v primeru,
        // če elementa x ni v tabeli
        // (če bi bil, bi return znotraj zanke 
        // takoj zaključil izvajanje metode)
        return -1;
    }
}
