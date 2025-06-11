import java.util.*;

public class NajvecjiSkupniDelitelj {
    
    /**
     * Vrne najvecji skupni delitelj stevil.
     * @param a prvo stevilo
     * @param b drugo stevilo
     */
    
    private static int gcd(int a, int b) {
        if (b == 0)
            return a;
        return gcd(b, a % b);
    }
    
    /*private static int gcd(int a, int b) {
        while (b > 0) {
            int t = a;
            a = b;
            b = t % b;
        }
        return a;
    }*/
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int ciljniGCD = sc.nextInt();
        
        for(int i = ciljniGCD; i <= n; i += ciljniGCD){
            for (int j = ciljniGCD; j <= n ; j += ciljniGCD){
                if (i <= j)
                    if(gcd(i,j) == ciljniGCD)
                        System.out.println("(" + i  + ", " + j + ")");
            }
        }
    }
}