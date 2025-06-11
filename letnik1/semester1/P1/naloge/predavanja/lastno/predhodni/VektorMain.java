import java.util.Scanner;

public class VektorMain{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Vektor test = new Vektor(sc.nextInt());
        test.izpisiDolzinoTabele();
    }
}
