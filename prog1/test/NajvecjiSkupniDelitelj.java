import java.util.Scanner;

public class NajvecjiSkupniDelitelj{
    //DS kviz
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long najvecjiSkupniDelitelj = 1;
        System.out.println("NajvecjiSkupniDelitelj od " + a + " in " + b + " je: " + gcd(a, b));
    }
    // Function to calculate GCD using the Euclidean algorithm
    public static long gcd(long a, long b) {
        //y = kx + o
        long x = Math.min(a,b); 
        long y = Math.max(a,b);
        long o;
        long k;
        while (o != 0) {
            k = manjse;
            o = vecje % manjse;  // Compute remainder
            vecje = k;   
        }
        return vecje; 
    }
}

