
import java.util.Scanner;

public class Starost {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Vnesi svoje leto rojstva: ");
        int letoRojstva = sc.nextInt();

        int starost = 2024 - letoRojstva;
        System.out.println("Letos praznuješ " + starost + ". rojstni dan.");
    }
}
