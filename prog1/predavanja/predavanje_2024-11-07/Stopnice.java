
import java.util.Arrays;

public class Stopnice {

    public static void main(String[] args) {
        int[][] t = new int[3][];

        int element = 1;
        for (int i = 0; i < t.length; i++) {
            t[i] = new int[i + 1];
            for (int j = 0; j <= i; j++) {
                t[i][j] = element++;
            }
        }

        System.out.println(Arrays.deepToString(t));
    }
}
