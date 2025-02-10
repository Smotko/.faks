
import java.util.*;

public class Test01 {

    public static void main(String[] args) {
        int[][] rel = {
            { 0,  5, -3, 4},
            {-2,  9, -4, 6},
            {-3, -1,  7, 3},
        };
        int[][] smer = {
            {0, 1, 1, 4},
            {4, 3, 2, 1},
            {3, 2, 3, 2},
        };

        int[][] dejanske = Druga.visine(rel, smer);
        System.out.println(Arrays.deepToString(dejanske));
    }
}
