
import java.util.*;

public class Test42 {

    public static void main(String[] args) {
        int[][] rel = {
            {0, 391, -795, 329, 609, 440, 153, -886, -958, 873, 541, -234, 171, 420, 292, -80, 583, 241},
            {959, 299, -640, 606, -320, -763, 667, -378, -820, -11, -327, 877, 509, -780, 818, 556, -141, 522},
            {829, -872, 128, 631, 333, 402, -813, -368, -633, 391, -687, -41, 365, 973, 298, -404, -562, 182},
            {514, -749, -217, 578, -681, 60, -878, -17, -202, -298, -131, -630, 907, -243, -874, -613, 689, -799},
            {-916, 167, -110, 167, -800, -712, 856, -863, 373, 71, 789, 114, 849, -674, -230, 82, -595, -728},
            {-110, -436, -450, 279, 149, -685, 640, 952, -578, 10, 891, -653, -164, 126, -886, 676, -748, 159},
            {885, -286, 848, -671, 833, -744, 597, -213, 914, -560, -834, -503, 899, 568, -395, 608, -345, 39},
            {-752, 662, 421, -184, -607, 584, 754, -899, -78, 930, -396, -322, -265, -84, 326, 799, 128, -471},
            {-226, 303, -547, -440, -957, 448, 58, 204, 287, 487, -138, 626, -502, 188, -132, -684, -944, 609},
            {-263, -7, 78, 338, 149, 162, 240, -230, 306, -806, 809, -526, 9, -546, -855, -14, -66, 92},
            {-932, 597, 507, -953, -340, 278, 732, 406, 866, 586, 146, -902, -499, -869, -573, 731, 547, -979},
            {-554, -139, 489, 33, 730, 822, -475, 965, 881, 967, -987, 410, -979, 555, -376, -26, 991, -226},
            {583, 399, -444, 926, -717, -883, -309, -13, 729, 738, 582, 639, 434, -890, 729, 177, -471, -394},
            {-66, 459, 898, 422, 922, -687, 584, -384, -628, 632, 182, 296, -713, -417, -806, -626, 359, -548},
            {-646, 938, 542, 533, -508, 874, 978, -531, -272, -201, -451, -178, -431, 135, -555, -3, -564, 994},
            {264, 395, 396, 110, -334, -995, -310, -415, -92, -442, -821, 754, -78, -444, -43, -903, -745, 56},
            {593, -516, -243, -277, 161, 745, 974, 609, 798, 619, -439, 549, -155, -700, 622, 189, 546, -776},
            {-753, -887, 674, -553, 254, 144, 621, -290, 900, -652, -730, 438, 835, 634, -506, -640, -886, 946},
            {130, -21, 650, 874, -16, -66, -713, -938, -632, -278, 271, -416, -909, -814, -467, 147, -472, 951},
            {-845, 465, 151, -772, -344, 3, -174, -678, -181, 583, -110, -514, -205, -239, 367, -763, 812, 297},
            {-315, 823, 982, -11, 959, 447, 292, -740, 456, 114, -472, -851, 688, 997, -431, -301, 778, 196},
            {-231, -657, -146, -724, -144, -968, -712, -371, 816, -982, -515, -83, -533, 110, 62, -879, 778, 358},
            {525, -232, -636, 622, -211, -472, 789, -462, -367, -680, -748, -609, 487, -416, 163, 497, 623, 800},
            {676, -604, 380, -221, 488, -744, -801, 603, 274, -539, -892, 250, 155, 8, -860, -535, 930, -551},
            {635, 190, -564, 432, 785, -192, 514, 410, -217, 302, -3, 998, -449, -923, 115, 152, 880, 565},
            {-171, -299, -998, 642, 760, 980, -952, 758, -446, 448, -681, 744, -692, -301, -267, -260, -932, 800},
            {-521, 691, 628, -636, 486, 654, 380, 444, -663, 238, 485, -775, -855, 195, 854, -506, 418, 857},
            {-149, 28, 814, -852, 690, -234, -15, -435, -130, -7, 429, -453, -98, 110, 450, -222, -607, 275},
            {-715, -896, -598, 617, -219, -7, -92, -260, 579, 881, -253, -307, 806, 618, -37, -196, 618, 491},
            {274, 276, 229, 304, -61, 703, -958, 928, 885, -146, -801, -334, 382, -70, 70, 485, 437, -230},
            {-312, -648, -863, -356, 308, 88, 302, 545, -9, 286, -674, -124, 289, 575, 559, -249, -268, -19},
            {-37, 950, -95, 319, -237, 623, 90, 106, -807, 215, 514, 140, 418, 51, -337, 20, -235, 1000},
            {277, -931, -480, 806, -809, 234, 694, -172, 668, -90, -510, 652, -628, 759, 34, 846, 720, -39},
            {280, 237, -45, -762, -371, 572, 857, -382, -683, 830, 136, -894, 483, 541, 377, -17, -464, -418},
            {472, 281, 844, 71, -505, 641, 54, 262, -381, -483, -440, -25, -933, 663, 713, 921, -856, 140},
            {-471, 826, -41, -125, 949, -838, -563, 886, 655, 756, -372, 349, -750, -159, 500, -662, -689, 684},
            {-454, 333, -491, -177, -570, -861, -313, 830, -650, -791, 121, 229, -268, -198, -621, -451, 720, -632},
            {-503, -913, 482, 497, 18, 166, 34, 80, -261, -115, 302, 747, 941, 665, 382, -846, -417, 314},
            {957, 481, -487, 771, 12, -763, 869, -681, -85, -565, -655, 74, -391, -137, 723, 618, 554, -328},
            {-481, 259, -669, 692, 219, 220, -771, 681, 216, 578, 889, 261, -226, -193, -804, -270, 664, -101},
            {-698, -811, 241, -476, -716, -896, 372, -214, -212, -382, 96, 182, 139, 618, -235, -907, -871, -610},
            {425, -732, 255, -946, 27, 459, -848, -599, 407, -8, 886, 678, 210, -883, -24, 48, -846, -869},
        };
        int[][] smer = {
            {0, 3, 3, 3, 3, 3, 3, 4, 1, 4, 1, 1, 1, 1, 1, 1, 1, 1},
            {2, 2, 1, 1, 4, 1, 1, 1, 2, 1, 4, 1, 1, 1, 1, 1, 1, 2},
            {2, 1, 2, 4, 1, 3, 2, 3, 3, 4, 4, 3, 4, 3, 3, 3, 3, 2},
            {4, 2, 2, 3, 3, 3, 4, 2, 4, 4, 3, 2, 3, 2, 3, 4, 1, 1},
            {3, 2, 2, 1, 1, 4, 4, 2, 1, 4, 2, 1, 3, 4, 1, 3, 4, 2},
            {2, 1, 3, 3, 2, 1, 3, 2, 4, 1, 4, 2, 1, 1, 2, 1, 3, 4},
            {3, 2, 2, 1, 4, 1, 1, 1, 1, 3, 3, 4, 3, 4, 3, 2, 2, 4},
            {2, 1, 1, 1, 3, 4, 4, 1, 3, 4, 1, 1, 2, 3, 2, 3, 2, 4},
            {3, 4, 1, 2, 1, 4, 3, 3, 2, 3, 3, 3, 2, 3, 3, 4, 1, 4},
            {4, 1, 2, 1, 2, 3, 3, 4, 2, 4, 1, 1, 1, 1, 1, 1, 2, 4},
            {4, 3, 3, 2, 2, 4, 1, 1, 2, 4, 3, 3, 4, 1, 1, 3, 2, 4},
            {4, 2, 1, 1, 2, 4, 3, 4, 2, 3, 4, 4, 1, 4, 2, 2, 3, 4},
            {4, 3, 3, 3, 2, 3, 4, 4, 2, 4, 1, 4, 3, 3, 2, 2, 2, 4},
            {4, 2, 3, 4, 1, 2, 4, 4, 2, 1, 4, 1, 2, 4, 3, 2, 2, 4},
            {4, 2, 1, 1, 2, 1, 1, 4, 1, 1, 1, 3, 2, 1, 2, 4, 1, 4},
            {4, 1, 1, 1, 1, 4, 1, 1, 3, 2, 3, 3, 3, 3, 2, 4, 2, 4},
            {3, 3, 4, 4, 2, 3, 4, 3, 2, 4, 2, 1, 1, 1, 1, 4, 2, 1},
            {2, 1, 4, 3, 2, 4, 1, 2, 1, 1, 1, 1, 4, 1, 2, 4, 3, 4},
            {4, 1, 3, 4, 2, 1, 4, 3, 3, 3, 4, 2, 1, 3, 2, 3, 2, 4},
            {4, 2, 1, 1, 4, 1, 1, 2, 4, 1, 3, 2, 3, 2, 4, 1, 1, 1},
            {3, 4, 3, 3, 3, 3, 3, 2, 1, 2, 3, 4, 2, 4, 3, 3, 4, 2},
            {2, 4, 2, 1, 1, 3, 3, 3, 4, 2, 2, 4, 2, 3, 2, 1, 4, 2},
            {2, 4, 3, 3, 2, 2, 4, 1, 4, 3, 2, 4, 2, 1, 1, 1, 3, 4},
            {4, 1, 3, 3, 4, 2, 4, 2, 3, 2, 4, 3, 4, 1, 1, 2, 1, 1},
            {4, 2, 2, 1, 4, 2, 3, 4, 1, 1, 1, 1, 3, 3, 4, 1, 1, 2},
            {4, 3, 4, 2, 3, 2, 2, 4, 3, 3, 2, 3, 4, 1, 4, 3, 3, 2},
            {3, 2, 4, 2, 3, 4, 1, 1, 2, 4, 3, 2, 3, 4, 3, 2, 3, 4},
            {4, 1, 1, 2, 1, 4, 3, 4, 2, 1, 2, 4, 1, 4, 1, 1, 1, 1},
            {4, 3, 2, 1, 2, 3, 2, 3, 3, 3, 2, 4, 2, 4, 3, 3, 3, 2},
            {3, 4, 2, 3, 2, 2, 1, 3, 3, 4, 3, 4, 2, 3, 4, 2, 1, 1},
            {2, 3, 3, 2, 3, 4, 2, 1, 2, 4, 2, 4, 4, 1, 1, 3, 3, 2},
            {2, 1, 3, 4, 1, 3, 3, 2, 1, 3, 2, 4, 4, 3, 2, 3, 3, 4},
            {4, 2, 1, 1, 2, 1, 1, 4, 2, 4, 1, 4, 4, 3, 3, 2, 4, 1},
            {4, 1, 1, 1, 3, 4, 2, 3, 2, 1, 2, 1, 3, 2, 1, 4, 1, 2},
            {3, 4, 2, 3, 2, 4, 2, 1, 3, 3, 4, 2, 1, 4, 1, 1, 4, 2},
            {4, 1, 3, 2, 4, 1, 1, 2, 1, 2, 4, 3, 2, 3, 4, 4, 3, 2},
            {3, 3, 2, 1, 3, 4, 2, 1, 2, 1, 3, 2, 1, 1, 4, 3, 2, 1},
            {2, 1, 4, 1, 1, 3, 4, 2, 3, 2, 2, 4, 1, 1, 1, 3, 4, 2},
            {2, 4, 1, 3, 2, 1, 1, 2, 2, 1, 1, 4, 3, 3, 2, 2, 4, 2},
            {2, 3, 4, 3, 4, 3, 3, 2, 3, 4, 2, 3, 3, 3, 3, 2, 4, 2},
            {4, 1, 1, 2, 3, 3, 4, 2, 2, 4, 2, 4, 1, 2, 4, 1, 1, 2},
            {3, 3, 3, 2, 1, 1, 3, 3, 2, 3, 2, 1, 2, 1, 1, 3, 3, 2},
        };

        int[][] dejanske = Druga.visine(rel, smer);
        System.out.println(Arrays.deepToString(dejanske));
    }
}