
public class Sprehod {

    public static void main(String[] args) {
        int[] t = {10, 20, 50, 7, 17, 28};
        for (int i = 0; i < t.length; i++) {
            System.out.printf("Element na indeksu %d ima vrednost %d.%n", i, t[i]);
        }

        for (int element: t) {
            System.out.println(element);
        }

        String[] dnevi = {"po", "to", "sr", "če", "pe", "so", "ne"};
        for (String dan: dnevi) {
            System.out.println(dan);
        }

        System.out.println();

        for (int element: t) {
            element *= 2;
        }
        for (int element: t) {
            System.out.println(element);
        }

        for (int i = 0; i < t.length; i++) {
            t[i] *= 2;
        }
        for (int element: t) {
            System.out.println(element);
        }
    }
}
