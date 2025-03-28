
import java.util.*;

public class Test18 {

    public static void main(String[] args) {
        int[][] rel = {
            {0, -9, -133, 237, -405, 608, -218, 376, -38, 278, 724, -667, -538, 217, 134, 116, -414, 141, 926, -289, -62, -473, 909, -909, -671, 710, -903, 680, 371, -473, 744, 115, 406, -989, 423, -618, -561, -343, -82, -252, -596, -309, 297},
            {238, -153, 642, -773, 551, -295, 971, 729, -86, 759, -40, -556, 33, 734, 202, 277, -201, -650, -905, 377, -251, -130, 839, 490, -968, 283, 705, 118, -902, 894, 370, 932, 768, 384, -880, 615, -996, 328, -327, 472, 978, -487, -861},
            {838, -336, -200, 969, -417, -502, -135, 682, 905, -353, -505, -482, -745, -455, 102, 606, 629, -707, 748, 62, 96, 600, -745, -407, 823, -532, -742, -703, -998, -726, 701, 354, 982, 451, 321, -14, 141, 362, -584, 309, 591, -240, -472},
            {-879, -174, 117, -969, -568, -177, 304, -559, -645, -214, -112, -113, 571, -86, -543, -835, -23, 613, 174, 585, -120, -840, 379, -451, -616, -267, -5, 708, 27, -740, -213, 975, -213, 537, -908, -42, -660, 898, 171, -73, -298, 454, 164},
            {-354, -118, 472, 944, 784, 98, -248, -215, -296, 16, 272, 924, -164, -875, -809, 94, 538, -38, 660, 472, -538, -971, 853, 262, 478, -651, 499, -337, -71, -882, 612, 355, 501, -200, 910, 672, -501, 634, 316, -246, -476, 540, -271},
            {562, -2, -940, 380, -1, -991, -319, -250, 801, 940, 98, 797, -18, 746, 261, 278, 271, 651, -824, -153, -187, -644, -349, -482, 43, -451, 774, 177, -940, 523, 272, -362, -701, -517, -394, 134, -523, 203, -887, 79, 311, -758, -992},
            {-244, 842, -111, 462, 15, 470, -566, 908, -544, 717, 518, 294, -788, -553, 216, -334, 128, 94, 529, -926, -682, 958, 945, 418, 519, 353, 477, 294, 563, 473, -122, -24, -691, -388, 398, 96, 542, 35, 606, 808, -440, -615, -59},
            {649, -521, 413, 821, -101, 415, -377, 547, 181, -382, -960, -575, -943, -151, 531, 787, 924, 711, -69, -146, 83, 477, 482, -852, -265, -635, -511, 553, 680, 1000, -681, -220, 553, 224, 237, 136, -377, -512, 771, 283, -841, 852, -425},
            {13, 970, -805, 235, 658, 984, -564, 358, 865, 718, -756, 639, 91, 727, -731, -21, -429, -538, -957, -962, 1000, -25, -714, -257, 497, -753, -376, -164, 98, -948, -360, 109, 638, 436, -417, -254, -147, 207, -120, 599, -668, -730, 79},
            {-886, -185, -830, -958, 853, -12, 526, 445, -798, 518, 666, -361, 398, 176, -759, 238, 620, 363, -854, 560, -977, 160, 50, -105, -664, 56, -463, -895, 746, -325, -531, -938, -132, 417, 10, -731, -927, -89, -865, 877, 858, 959, -722},
            {-607, 119, 509, -710, -731, 325, -283, -197, -209, 826, 979, -359, -835, 764, 88, -273, -428, -626, -474, 392, 894, -985, -458, -558, -721, -143, 27, 0, 840, 27, -453, 798, -612, 544, 946, -524, -886, 861, -858, -499, -616, -763, -46},
            {786, -683, -863, -518, -857, -474, 407, -711, 332, -644, -800, 613, -361, -162, 510, 471, -514, -894, 897, 846, 26, -522, 228, 22, 665, -920, 834, 60, 666, 156, 279, -538, 858, 681, 789, -925, -125, 731, 643, 894, -209, 986, -78},
        };
        int[][] smer = {
            {0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
            {2, 2, 2, 1, 2, 2, 2, 2, 1, 1, 2, 1, 2, 1, 2, 2, 2, 1, 2, 1, 2, 1, 1, 2, 2, 1, 2, 2, 1, 1, 2, 2, 2, 1, 1, 1, 2, 1, 2, 2, 1, 2, 2},
            {2, 1, 1, 2, 1, 1, 1, 1, 1, 1, 2, 1, 1, 1, 2, 1, 2, 2, 2, 1, 2, 1, 2, 2, 2, 1, 1, 1, 1, 2, 2, 1, 1, 2, 2, 1, 2, 2, 2, 2, 2, 1, 1},
            {2, 1, 1, 1, 1, 2, 2, 1, 2, 2, 2, 1, 1, 2, 1, 2, 2, 2, 1, 2, 1, 1, 2, 1, 1, 2, 1, 1, 1, 2, 2, 1, 2, 2, 2, 2, 1, 2, 1, 2, 1, 2, 2},
            {2, 1, 2, 1, 1, 1, 1, 1, 1, 2, 1, 2, 1, 2, 2, 2, 2, 2, 1, 1, 1, 2, 1, 1, 1, 1, 2, 1, 2, 2, 2, 2, 2, 1, 1, 2, 2, 1, 2, 1, 1, 2, 1},
            {2, 2, 1, 1, 2, 2, 2, 1, 2, 1, 1, 2, 1, 2, 2, 2, 1, 1, 1, 2, 2, 2, 1, 2, 2, 1, 1, 1, 2, 1, 2, 2, 2, 1, 1, 1, 2, 1, 2, 1, 1, 1, 2},
            {2, 2, 1, 1, 1, 1, 1, 2, 1, 1, 1, 1, 1, 1, 1, 2, 1, 2, 1, 2, 2, 2, 2, 2, 2, 1, 2, 1, 1, 1, 1, 1, 2, 1, 2, 2, 1, 1, 1, 1, 2, 2, 1},
            {2, 2, 1, 1, 1, 1, 2, 2, 2, 1, 1, 2, 2, 1, 1, 1, 2, 1, 1, 2, 1, 1, 1, 1, 2, 1, 2, 1, 2, 2, 2, 2, 2, 2, 1, 2, 1, 2, 2, 2, 2, 2, 1},
            {2, 2, 2, 1, 2, 1, 2, 1, 2, 1, 2, 2, 1, 1, 1, 1, 2, 1, 2, 1, 2, 1, 2, 2, 1, 1, 2, 1, 1, 1, 2, 1, 2, 1, 2, 2, 2, 1, 1, 1, 1, 1, 2},
            {2, 2, 2, 2, 2, 1, 1, 1, 2, 2, 2, 2, 1, 2, 2, 2, 1, 1, 1, 2, 2, 1, 2, 1, 2, 1, 2, 1, 1, 1, 1, 2, 1, 1, 2, 2, 2, 1, 2, 1, 1, 1, 1},
            {2, 2, 2, 1, 2, 1, 2, 2, 1, 2, 1, 2, 2, 1, 1, 2, 2, 2, 1, 2, 2, 1, 1, 2, 1, 2, 1, 1, 2, 2, 2, 2, 2, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2},
            {2, 2, 1, 1, 2, 2, 1, 2, 2, 1, 2, 2, 2, 1, 1, 2, 1, 2, 2, 2, 1, 2, 2, 2, 2, 1, 2, 1, 2, 1, 1, 1, 1, 2, 1, 1, 1, 2, 1, 1, 1, 2, 2},
        };

        int[][] dejanske = Druga.visine(rel, smer);
        System.out.println(Arrays.deepToString(dejanske));
    }
}
