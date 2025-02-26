import java.util.*;
class Gravitacija{
    public static void main(String[] args){
        final double c = 6.674 * Math.pow(10,-11);
        final double m = 5.972 * Math.pow(10,24);
        final double r = 6.371 * Math.pow(10,6);
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        double output = c*m/Math.pow(r+input,2);
        System.out.println(output);
    }
}