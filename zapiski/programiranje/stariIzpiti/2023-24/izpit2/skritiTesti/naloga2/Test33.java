
import java.util.*;

public class Test33 {

    public static void main(String[] args) {
        int[][] rel = {
            {0, -943, -100, 475, 239, 689, 330, 739, 483, -417, 901, 835, -896, 527, 127, -767, 361, -519, 449, -622, -640, 123, -238, 696, 147, -96},
            {-288, 0, 908, 798, 18, -890, 941, -124, 933, -396, 452, -272, 37, -520, -464, -535, 823, 321, 623, -984, -16, -833, 141, -509, -840, 966},
            {-272, -726, -655, -686, -585, -113, 843, 176, -250, 442, 84, -217, -266, 835, -378, 161, 177, -299, -205, -748, 774, 382, -14, 71, 824, -304},
            {501, -557, -889, 678, 506, -39, 970, -3, 270, 319, 246, -982, 4, 433, -28, -531, 127, -285, -978, -956, -522, 973, -857, -530, 609, 354},
            {-510, -913, 777, 372, -169, -989, -424, 425, 54, -249, 795, 594, -374, -641, 781, -7, 832, -287, -170, -637, 267, 303, 382, 357, -200, 482},
            {462, -405, -565, -123, -149, -827, 115, 627, 639, 617, -356, 146, 800, 155, -382, -216, 947, 297, 592, -883, 459, -613, -866, -620, 161, -596},
            {-749, 776, 256, 66, -817, 53, 902, -729, -196, 347, 318, -172, 743, -572, 183, -827, 150, 743, 529, -957, 155, 102, -830, 728, -241, 166},
            {-88, -658, 793, 115, -464, -396, -137, 953, 476, -862, 701, -261, -996, -420, 563, 937, -210, -810, -359, -533, -843, -877, -553, -697, -963, 671},
            {-251, 916, -1000, 479, 121, -161, -983, -403, 414, -687, 609, 905, -311, -263, 76, 537, 864, -220, 918, -903, -206, 627, 250, -422, 891, 363},
            {-931, 235, -690, -430, -797, -900, -885, 955, -799, 954, 667, -138, -962, 262, -69, -186, -139, 664, 1000, -205, 107, -414, 191, 854, 982, -973},
            {358, 695, -147, 664, -665, 224, 91, -92, -938, -688, -293, -315, 489, -900, -883, 735, 875, 445, 590, 717, 587, 735, 18, -688, 579, -395},
            {-891, -729, -206, 960, 633, -934, 168, 684, -511, -233, 421, -489, -917, 959, 1, 692, -407, -74, 43, -205, 837, -760, -313, -360, -960, 564},
            {-302, 458, -649, 951, 62, -600, -719, -236, 766, -487, -74, 406, 715, -816, 698, -78, 781, 628, 176, -244, 329, 958, 542, -677, 664, 228},
            {753, -524, -555, -825, 97, -708, 723, -382, 585, 250, 143, 223, -145, 80, 256, 240, -240, -369, -274, 728, -744, -628, 849, 50, -684, -640},
            {147, 519, -466, 57, -953, -222, -729, 42, -18, -411, 703, -456, 599, -872, -144, -715, -963, 623, -608, 575, 34, 998, 647, 787, -238, -832},
            {-503, -724, 991, 808, 261, 164, -454, -776, 448, -193, 665, -725, 909, 533, 211, -37, 462, -205, -979, -692, 880, 98, -373, 142, 770, -353},
            {-555, 715, 737, -12, 532, -859, -61, 628, -107, 461, -208, 137, -143, -132, 76, -269, -226, 377, 750, -550, 699, 892, -181, -570, -206, -663},
            {76, 851, -141, -626, 893, -422, 864, 270, 176, 564, 163, -463, -569, -849, -870, 853, -534, -697, 29, -134, 834, -680, -892, -410, -245, 428},
            {-728, -990, -66, 88, 316, -109, -551, 135, 703, 102, -579, -896, 329, -227, 156, 150, 409, -398, -73, -445, -23, -387, 914, 754, 348, -840},
            {-677, 57, 793, 482, -22, -440, 831, -834, 124, 633, -743, -52, -160, -171, -462, 5, 912, -405, 857, 968, 926, 208, -994, -523, 502, -936},
            {-101, 622, 118, -524, 457, 572, -949, -781, -942, 155, -83, 480, -823, -444, -185, 937, 503, 564, -719, 66, -60, 419, 579, 768, 138, -710},
            {-679, 876, 852, -497, -216, 450, -43, 964, 118, -305, 708, 403, -340, 650, 936, 723, -229, -173, 432, -557, -65, -623, -579, 132, -568, -871},
            {-264, 873, 537, 650, 240, -215, 743, 424, 59, -561, 814, -594, 613, -88, -38, -708, 768, 510, -647, 501, -338, 151, 627, 763, 406, 306},
            {217, 285, 392, 996, 413, -566, 215, 935, 983, -830, -471, -521, -70, -821, 774, -27, -804, 943, 104, 358, 130, -639, -163, 214, 54, 215},
            {-266, -751, 954, -504, -761, 959, 310, 880, -763, -268, 562, -547, -644, 573, 277, 441, 197, -491, -928, -981, -250, 286, -254, 978, -71, 89},
            {-697, -398, -661, 442, -702, 711, 728, 509, 338, 460, -39, -210, -584, 845, 46, 149, -669, -913, -945, -661, -264, -958, 977, -877, 37, 770},
        };
        int[][] smer = {
            {0, 1, 4, 1, 1, 1, 1, 4, 1, 1, 3, 4, 1, 3, 3, 3, 4, 1, 3, 4, 1, 4, 1, 3, 3, 4},
            {3, 2, 3, 3, 4, 3, 2, 3, 4, 2, 2, 4, 2, 1, 1, 2, 4, 2, 1, 1, 2, 1, 2, 2, 4, 1},
            {2, 1, 4, 1, 1, 2, 1, 1, 3, 4, 2, 3, 3, 4, 2, 1, 1, 3, 4, 3, 2, 3, 3, 2, 4, 2},
            {4, 2, 3, 4, 4, 1, 1, 2, 2, 4, 2, 3, 4, 4, 3, 3, 2, 2, 3, 3, 3, 2, 4, 1, 4, 2},
            {4, 2, 4, 1, 4, 2, 3, 2, 2, 3, 2, 2, 4, 3, 4, 3, 4, 2, 1, 1, 1, 1, 3, 4, 4, 2},
            {4, 2, 1, 3, 3, 4, 2, 1, 1, 2, 1, 1, 1, 1, 3, 2, 4, 1, 1, 1, 3, 2, 1, 1, 3, 4},
            {4, 3, 4, 1, 1, 1, 3, 3, 2, 4, 2, 4, 1, 1, 2, 4, 3, 4, 2, 3, 2, 4, 1, 1, 4, 1},
            {3, 2, 3, 3, 4, 2, 2, 3, 3, 3, 2, 4, 3, 2, 2, 1, 4, 3, 3, 2, 1, 4, 4, 2, 1, 2},
            {2, 4, 1, 1, 4, 2, 2, 2, 1, 3, 4, 4, 2, 4, 1, 2, 1, 1, 4, 1, 1, 1, 3, 3, 3, 2},
            {2, 4, 3, 2, 1, 2, 2, 3, 2, 1, 1, 4, 2, 1, 2, 1, 3, 2, 3, 3, 4, 3, 2, 1, 1, 1},
            {2, 3, 3, 4, 3, 2, 2, 2, 1, 4, 1, 1, 3, 3, 4, 2, 4, 1, 2, 4, 1, 3, 3, 4, 4, 2},
            {2, 1, 1, 3, 4, 2, 2, 1, 4, 1, 3, 4, 1, 1, 1, 2, 1, 2, 2, 4, 2, 2, 4, 1, 4, 2},
            {4, 1, 1, 2, 4, 2, 1, 2, 1, 3, 2, 4, 3, 3, 2, 3, 4, 2, 1, 3, 4, 2, 4, 3, 3, 2},
            {4, 4, 2, 2, 3, 4, 3, 4, 3, 4, 1, 1, 2, 4, 1, 1, 1, 4, 2, 2, 4, 2, 4, 2, 1, 4},
            {4, 3, 2, 1, 1, 1, 2, 3, 2, 4, 4, 1, 2, 1, 4, 1, 2, 4, 2, 1, 3, 2, 3, 4, 2, 4},
            {4, 3, 3, 3, 3, 3, 2, 4, 4, 1, 3, 4, 1, 1, 3, 4, 2, 3, 4, 2, 2, 1, 1, 4, 2, 4},
            {4, 2, 3, 3, 3, 4, 1, 4, 3, 3, 4, 3, 3, 3, 2, 4, 2, 1, 4, 2, 1, 1, 1, 1, 2, 4},
            {4, 2, 1, 1, 4, 1, 2, 4, 1, 1, 3, 3, 4, 3, 4, 4, 3, 2, 3, 4, 1, 4, 1, 1, 2, 4},
            {4, 1, 3, 2, 4, 3, 2, 1, 4, 2, 1, 1, 4, 2, 4, 3, 2, 1, 1, 1, 2, 4, 2, 3, 2, 4},
            {3, 4, 2, 1, 3, 3, 4, 4, 3, 2, 4, 1, 3, 2, 3, 4, 3, 3, 4, 4, 2, 4, 2, 2, 3, 4},
            {4, 1, 1, 2, 1, 2, 4, 4, 2, 4, 1, 2, 1, 2, 4, 1, 2, 4, 4, 3, 2, 1, 2, 2, 1, 1},
            {3, 4, 2, 4, 2, 1, 1, 3, 2, 4, 3, 3, 2, 1, 1, 3, 2, 4, 3, 4, 3, 3, 2, 1, 1, 2},
            {2, 4, 2, 1, 3, 3, 3, 2, 4, 3, 3, 4, 3, 3, 2, 2, 1, 1, 1, 4, 3, 3, 3, 4, 3, 2},
            {2, 4, 2, 3, 2, 4, 1, 3, 4, 1, 1, 3, 3, 3, 3, 4, 2, 4, 1, 4, 2, 4, 1, 4, 2, 1},
            {2, 3, 4, 2, 4, 1, 2, 4, 1, 4, 2, 3, 3, 4, 1, 3, 2, 4, 2, 1, 2, 1, 2, 4, 3, 2},
            {2, 1, 3, 2, 1, 3, 2, 1, 3, 3, 2, 1, 1, 1, 2, 1, 1, 3, 3, 3, 3, 3, 2, 3, 2, 1},
        };

        int[][] dejanske = Druga.visine(rel, smer);
        System.out.println(Arrays.deepToString(dejanske));
    }
}