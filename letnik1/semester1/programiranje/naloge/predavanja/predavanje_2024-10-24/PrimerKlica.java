
public class PrimerKlica {

    public static void main(String[] args) {
        int a = 10;
        f(a);
        System.out.println(a); // 10
    }

    public static void f(int a) {
        a++;
        System.out.println(a); // 11
    }
}
