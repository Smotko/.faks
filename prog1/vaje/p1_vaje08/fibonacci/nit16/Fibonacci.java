

/**
 * Razred za generiranje posplosenega Fibonaccijevega zaporedja.
 */

 public class Fibonacci {
    private int a;
    private int b;
    private int c;

    public Fibonacci(int a, int b){
        this.a = a;
        this.b = b;
    }

    public Fibonacci(){
        this(0, 1);
    }

    public int naslednji(){
        c = a + b;
        a = b;
        b = c;
        return c;
    }
    
    
 }
