
import java.util.*;

public class Test16 {

    public static void main(String[] args) {
        int[][] rel = {
            {0, -767, 362, 807, -892, -918, -498, 874, 594, -870, 992, -506, 889, -502, -178, -213, -250, 671, -968, 148},
            {-579, -86, -910, -184, -568, -789, -848, -675, -610, 40, 838, -453, -457, -293, 847, -406, 321, -479, 272, 458},
            {-33, -827, 338, -126, 857, -652, 833, -699, -336, 777, 752, 978, 355, 286, 670, -696, 322, 645, -884, -159},
            {-990, 302, -534, 475, 227, 556, -993, 772, 149, 979, 381, -710, 611, 416, -489, -362, 299, -727, 36, 209},
            {464, -97, 670, -297, 987, -934, -385, -481, -107, 391, -133, -413, -211, -473, -490, -148, 851, 421, 34, -766},
            {954, -908, -959, -584, -330, -437, -395, -134, 305, 169, 907, -200, -841, -73, 617, -987, -340, 347, -181, 964},
            {884, 794, -127, 298, 196, 138, 150, 884, -856, 770, -788, 680, -926, -924, -405, -231, -853, 343, -279, -890},
            {890, -452, 844, 656, -446, 809, 31, 478, 250, -572, 250, -235, 672, -66, 235, -511, 868, 487, -265, 731},
            {-846, -485, 146, 567, 599, 247, 537, -652, -364, -169, -908, 722, 250, 410, -792, 348, 384, 299, -74, -21},
            {-933, -515, 157, 966, 691, 531, -109, 149, -548, 40, -50, -385, 589, -531, 295, -644, -95, -417, 213, -423},
        };
        int[][] smer = {
            {0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
            {2, 2, 2, 1, 2, 1, 2, 1, 1, 2, 1, 2, 1, 1, 2, 2, 1, 2, 2, 1},
            {2, 1, 1, 1, 1, 1, 2, 1, 1, 2, 1, 1, 1, 2, 2, 1, 2, 1, 1, 1},
            {2, 2, 2, 1, 1, 2, 2, 2, 2, 2, 1, 1, 1, 2, 1, 1, 2, 2, 2, 1},
            {2, 2, 2, 2, 2, 1, 2, 1, 2, 2, 2, 2, 2, 2, 2, 1, 2, 1, 2, 1},
            {2, 1, 1, 2, 2, 1, 1, 1, 1, 1, 1, 1, 2, 2, 1, 1, 1, 2, 2, 2},
            {2, 1, 2, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 2},
            {2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 2, 1, 1, 1, 1, 1, 1, 2, 1, 1},
            {2, 2, 1, 1, 2, 2, 2, 1, 1, 1, 2, 2, 2, 1, 1, 2, 2, 1, 1, 1},
            {2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 2, 1, 1, 2, 1, 1, 1, 2, 2, 2},
        };

        int[][] dejanske = Druga.visine(rel, smer);
        System.out.println(Arrays.deepToString(dejanske));
    }
}