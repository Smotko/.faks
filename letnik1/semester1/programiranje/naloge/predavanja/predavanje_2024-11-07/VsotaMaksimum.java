
public class VsotaMaksimum {

    public static void main(String[] args) {
        int[] t = {50, 60, 20, 10, 70, 30};
        System.out.println(vsota(t));
        System.out.println(indeksMaksimuma(t));
    }

    public static int vsota(int[] t) {
        int rezultat = 0;
        for (int element: t) {
            rezultat += element;
        }
        return rezultat;
    }

    public static int indeksMaksimuma(int[] t) {
        int iNaj = 0;
        for (int i = 1; i < t.length; i++) {
            if (t[i] > t[iNaj]) {
                iNaj = i;
            }
        }
        return iNaj;
    }
}
