
import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(fib(n));
    }

    public static int fib(int n) {
        if (n <= 1) {
            return n;
        }
        int pp = fib(n - 2);
        int p = fib(n - 1);
        return pp + p;
        
        // krajše: return fib(n - 2) + fib(n - 1);
    }
}
