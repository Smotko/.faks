
import java.util.*;

public class Test08 {

    public static void main(String[] args) {
        int[][] rel = {
            {0, 836, -253, 44, 18, -911, -513, 402, 702, -944, -260},
            {-247, -749, -878, -475, 395, -738, 952, -402, 293, 686, -904},
            {-374, 655, -828, -812, 685, 685, 428, -131, -102, 219, 815},
            {-597, 927, 283, 314, -72, -914, -671, -956, 838, -655, -407},
            {318, -766, 37, -313, 415, 876, -495, 542, -496, 156, 681},
            {-330, -122, 570, 931, 142, 912, 693, -916, -421, -971, 825},
            {258, 618, 645, -475, 169, 139, 74, 44, -360, -431, 922},
            {980, -465, -839, 841, -312, -16, 81, 974, -917, 329, -214},
            {479, -851, -837, -938, -71, -357, 40, -923, -115, -395, -944},
            {490, 719, -74, -799, 637, 398, -500, 481, 318, -18, 889},
            {-660, 662, -277, 642, 460, -931, 771, 827, -907, 920, 369},
            {-228, -95, -196, 696, 119, -239, 433, -903, 215, 420, -402},
            {22, 288, -349, -673, -4, 816, 147, -346, 366, 700, -7},
        };
        int[][] smer = {
            {0, 1, 3, 3, 4, 3, 3, 4, 1, 1, 1},
            {4, 2, 4, 1, 3, 2, 4, 3, 3, 3, 4},
            {4, 2, 1, 2, 2, 1, 4, 4, 1, 1, 4},
            {3, 3, 4, 2, 1, 2, 1, 3, 4, 2, 1},
            {4, 1, 1, 4, 2, 4, 1, 1, 3, 4, 2},
            {4, 3, 2, 1, 2, 1, 4, 2, 4, 1, 2},
            {3, 4, 3, 4, 1, 3, 3, 2, 4, 3, 4},
            {2, 3, 2, 3, 4, 2, 3, 3, 3, 2, 4},
            {2, 1, 1, 1, 3, 2, 2, 3, 4, 1, 4},
            {4, 1, 1, 2, 1, 4, 2, 4, 1, 4, 1},
            {4, 3, 2, 1, 2, 3, 2, 1, 4, 1, 2},
            {3, 3, 4, 3, 2, 2, 4, 1, 1, 4, 2},
            {2, 1, 3, 2, 1, 1, 1, 3, 3, 3, 2},
        };

        int[][] dejanske = Druga.visine(rel, smer);
        System.out.println(Arrays.deepToString(dejanske));
    }
}