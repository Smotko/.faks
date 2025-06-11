
public class Obseg {

    public static void main(String[] args) {
        int ob = obseg(3, 4);
        System.out.println(ob);

        if (ob > 10) {
            System.out.println("Pravokotnik ima dovolj velik obseg.");
        }

        if (ob > obseg(1, 5)) {
            System.out.println("...");
        }
    }

    //
    // Vrne obseg pravokotnika s stranicama <a> in <b>.
    //
    public static int obseg(int a, int b) {
        // System.out.println(2 * (a + b));
        return 2 * (a + b);
    }
}
