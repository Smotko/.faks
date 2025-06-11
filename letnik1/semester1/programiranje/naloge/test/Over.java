import java.util.Scanner;

public class Over {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        for(int i = a; i < b; i++){
            for(int j = i; j < b; j++){
                System.out.printf("j: %d ", j);
            }
            System.out.printf("i: %d \n", i);
        }
    }    
}
