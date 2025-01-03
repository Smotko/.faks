
import java.util.*;

public class Test34 {

    public static void main(String[] args) {
        int[][] rel = {
            {0, -254, -100, -348, 704, -684, 84, -110, -617, 777, 323, -2, 900, 886, -281, -601, -131, 142, 465, 543, 205, 96, 156, 479, 201, -486, -78, -625, 660, -677, 401, -488, 669, 846, -255, 832, -691, -913, -87, -556, -465, 505, 964, -190, -527, -360, 962, 301, -291, 788},
            {-417, 731, -629, -398, 993, -977, -404, 420, -605, 371, -892, -584, -559, -193, 280, 773, -411, -694, 414, -825, 72, 824, -867, -684, -60, 718, -729, 484, 493, 921, 309, -491, 244, 75, -631, -569, 905, -635, 676, -848, -94, 267, 446, -590, 192, -22, -865, 884, 707, 919},
            {307, -229, 46, -314, 677, -444, 4, -475, 404, -725, 752, 483, -197, -39, -874, -307, 87, -408, 978, -957, 311, -251, -773, -820, 314, 141, -92, -691, 272, -591, 91, -129, 408, 377, -529, 986, -985, 127, -576, 691, 252, 736, 959, -145, 550, -70, -945, 660, 21, -558},
            {11, -971, 988, -192, -988, 309, -89, 893, -502, -573, -928, -634, 914, -502, 559, -755, -37, -357, -883, 577, 107, 417, 705, -856, -974, 837, 166, -730, -534, 610, 306, 950, 226, 574, 481, 270, 731, 394, -702, -483, -805, -620, 799, -801, 678, -782, 128, 554, 696, 967},
            {374, 917, 97, -22, -699, 699, 852, -390, -690, -361, -657, 399, 360, -694, 650, 802, -797, 407, -210, -829, 657, 834, -483, -928, -832, -945, 55, 221, -630, -519, 926, -674, 558, 105, 276, 134, 934, -234, 601, 13, -749, 307, 772, -543, -232, -180, 84, 351, 749, 94},
            {845, 543, -170, 808, 582, 440, -952, -182, -663, 43, -635, 991, -670, 612, -736, 953, -16, 756, -360, -571, 746, -975, -828, -817, -320, 644, 37, -848, -553, 213, -319, -94, -682, -49, -700, -549, -636, 989, -910, 539, -722, -880, -614, 439, -644, 960, -590, 81, -811, 409},
            {865, 489, 897, 490, -636, -376, -920, 571, -33, 606, 132, -208, 151, -523, 136, 669, 805, 909, 578, -592, 712, -590, 271, -988, 826, 317, 666, -282, -972, 216, -207, 586, -967, 908, -143, -707, -784, -493, -828, -446, -184, 481, -416, 575, -116, 997, -640, 703, -284, -911},
            {-293, -332, -43, -143, 807, 639, 849, 95, 260, 228, 602, -586, 519, -265, 367, 455, 728, -553, 707, 620, 26, 264, 735, -118, -793, -973, 125, 837, -594, 505, 771, 496, -108, -563, -223, -264, 638, -618, 610, 28, -808, -888, -999, 801, -191, 357, 645, 831, 978, 495},
            {-107, -306, -786, 390, 502, 44, 706, -530, 827, 229, 628, 155, -415, 461, 304, 577, 824, -10, -96, 648, -830, 558, -831, -776, 327, 663, -251, -366, -700, -677, -901, -131, 550, -28, 624, 13, 496, -931, 39, 386, 561, 619, -905, -312, -176, -183, -376, -511, 734, -572},
            {-354, 160, -83, -819, 728, -668, 633, -367, 705, -358, -6, 319, 994, -124, -357, 135, 167, 733, 330, 640, 44, 276, -992, -295, -563, 627, 879, -366, 232, 263, -356, -18, -271, -364, -572, 174, 404, -872, -258, -362, 625, 793, -667, 460, 639, 116, 451, 464, 920, 621},
            {605, 703, -466, 336, 851, -153, 671, 576, 885, 440, -183, -5, -132, -388, 966, 817, 888, -392, -512, 86, -96, 79, -264, 593, 253, -522, -822, -127, -789, -679, 574, -840, -187, 423, -582, -259, -338, -389, -59, -23, 964, -969, 903, -502, -765, -589, -171, 15, -315, 870},
            {-812, 49, 434, 709, 635, 721, 654, 931, 474, -290, -138, -468, 777, 357, 304, -49, -15, -705, 777, -962, 229, -339, 643, 816, 400, 807, -252, -989, -647, -870, 658, 425, 496, 645, 248, 93, 23, 670, -967, -129, -742, -300, 662, -46, 14, 243, -390, -409, 487, 529},
            {-257, 996, 761, 480, -311, -378, 518, 790, 896, -466, 732, 956, -492, 998, -95, 955, 819, -469, 76, -189, 559, 190, -558, -838, -690, -156, -622, 556, 64, 737, 70, -72, -486, -443, 587, 465, -153, 259, -464, -60, 645, 685, 375, 569, 386, -350, -417, -56, 805, -12},
            {-424, 375, -294, 850, 177, 686, -899, -34, 39, -938, 602, -438, 675, 1, -788, -786, -550, -953, -822, -665, -882, -640, -154, -18, 349, -814, -745, -973, -477, 326, -784, 713, 918, -735, -519, -545, -4, -708, -297, -310, 564, -243, 504, 753, -331, -495, 953, 853, -230, 295},
            {-450, 25, -267, -87, 818, 1000, -323, 753, -911, -136, 48, 798, -310, 940, -58, -945, 37, -459, -923, 539, -379, -646, 653, -51, 148, 204, -553, -357, 535, 109, -96, -346, 558, -679, -819, 828, 722, -274, 880, 222, 415, 158, -242, -642, -819, -219, 402, -115, 938, -689},
            {-426, 127, 669, 318, 45, -7, 844, 340, -31, 779, -910, -50, 755, -452, -897, 360, -885, 781, -671, 301, -302, 451, -404, -563, 380, -953, -474, 571, 701, 351, -843, 810, 962, -138, 10, 623, -41, -869, -611, 28, 743, -517, -413, 423, 825, 218, -978, 759, -889, 58},
            {118, 367, 558, 305, 342, 332, 155, -116, 921, -274, 742, 897, -831, -173, 295, -406, 416, -769, -175, -720, -110, -999, 158, 528, 467, 124, 99, 644, -506, 784, 328, 296, 104, -623, 451, 994, 366, 512, 726, -373, 259, 758, -55, 954, -852, 740, 87, 563, 862, 73},
            {713, -49, -235, -672, -339, 71, -443, 952, 64, 513, -218, 418, -538, -359, 994, -585, -793, -128, 704, 687, 567, 687, -414, 628, -513, -320, 779, -115, 350, 726, -727, 324, -792, 607, 971, 251, 816, 240, 801, 361, -429, -888, -576, -304, -9, 604, 513, 660, 565, 897},
            {-911, 433, 128, -736, -155, -788, 589, -956, 665, 129, -657, 214, 696, 268, -881, 624, -450, 638, -929, 962, -779, 543, -948, 981, 704, 579, -623, 596, 735, -19, 284, 346, -702, 610, 819, -555, 36, -734, -960, 908, -727, -775, 326, -587, -354, -198, 858, -122, -739, -900},
            {-22, 150, -74, -163, -59, 209, 666, -85, 701, 828, 334, 95, 857, -566, 707, -372, 465, 13, 985, -550, 846, 185, -525, 861, -197, -729, -957, 753, 149, -551, 197, -805, -732, 950, 55, -644, -431, 404, -763, 981, -47, 276, 490, -161, 58, 277, 370, 8, 648, 744},
            {598, 782, 593, -600, 351, 903, 543, 332, 605, -929, -426, -217, -487, 197, -630, 622, -365, 252, 829, 92, 482, -806, -875, -213, -445, -19, -173, 438, -385, -679, 328, 684, 142, -514, -8, -259, 476, 102, -851, 624, 188, 16, 349, -195, 237, -643, -271, 358, 568, 486},
            {773, -985, -800, 183, -503, 734, 213, 49, 516, -905, -479, 460, -28, 59, 780, 259, 245, -170, 364, 160, -92, 110, 823, 244, -375, 694, 319, 743, 421, -391, 465, -340, -538, 684, 208, -132, 263, -26, -323, 315, 815, -572, -49, -689, -185, 444, 888, 981, -53, -335},
        };
        int[][] smer = {
            {0, 4, 1, 3, 3, 3, 3, 3, 4, 1, 1, 1, 1, 3, 3, 3, 4, 1, 3, 4, 1, 1, 4, 1, 3, 4, 1, 3, 4, 1, 4, 3, 4, 3, 4, 1, 1, 1, 4, 1, 4, 1, 1, 1, 1, 1, 3, 3, 4, 1},
            {2, 1, 2, 1, 2, 4, 1, 1, 1, 3, 4, 3, 2, 2, 1, 4, 3, 3, 2, 4, 3, 2, 4, 2, 2, 4, 2, 1, 1, 2, 3, 2, 4, 2, 3, 4, 4, 2, 4, 2, 1, 4, 3, 3, 4, 2, 1, 2, 3, 4},
            {3, 4, 1, 2, 1, 1, 3, 4, 1, 2, 4, 2, 3, 3, 2, 1, 4, 1, 1, 1, 2, 1, 1, 2, 1, 1, 4, 1, 1, 2, 2, 1, 4, 2, 4, 4, 4, 2, 1, 4, 3, 3, 2, 4, 1, 3, 2, 4, 1, 1},
            {2, 4, 2, 3, 3, 3, 2, 4, 2, 2, 4, 2, 1, 4, 1, 1, 4, 3, 4, 3, 3, 3, 4, 1, 1, 1, 4, 3, 2, 2, 1, 4, 1, 2, 4, 4, 4, 1, 1, 1, 2, 4, 1, 3, 4, 2, 1, 3, 4, 2},
            {4, 1, 2, 1, 1, 1, 1, 1, 2, 1, 1, 3, 2, 4, 3, 2, 3, 2, 4, 2, 1, 4, 1, 3, 3, 2, 1, 2, 1, 4, 2, 3, 3, 2, 4, 4, 3, 3, 3, 4, 2, 4, 2, 4, 1, 1, 2, 2, 3, 4},
            {3, 4, 3, 3, 2, 3, 3, 4, 3, 3, 2, 2, 1, 1, 2, 1, 4, 1, 4, 3, 2, 4, 3, 2, 3, 4, 3, 3, 2, 4, 2, 2, 1, 4, 1, 4, 2, 1, 4, 3, 2, 3, 4, 4, 3, 2, 2, 1, 2, 4},
            {2, 4, 3, 3, 3, 2, 4, 4, 2, 1, 4, 1, 1, 3, 4, 2, 1, 2, 3, 3, 4, 3, 3, 3, 2, 3, 4, 2, 1, 1, 2, 3, 2, 4, 4, 1, 4, 2, 1, 3, 4, 1, 4, 3, 4, 3, 4, 2, 4, 1},
            {2, 4, 2, 1, 4, 3, 4, 4, 3, 2, 1, 3, 2, 1, 1, 1, 1, 2, 1, 4, 1, 4, 1, 1, 1, 1, 4, 3, 4, 2, 2, 2, 1, 4, 3, 4, 3, 4, 2, 2, 4, 2, 1, 1, 3, 2, 4, 2, 4, 2},
            {4, 1, 4, 2, 3, 2, 4, 3, 3, 3, 4, 2, 3, 4, 3, 3, 2, 4, 2, 1, 3, 4, 3, 3, 3, 2, 3, 2, 3, 4, 2, 3, 2, 1, 1, 4, 2, 4, 2, 1, 1, 3, 3, 2, 1, 4, 1, 2, 4, 2},
            {4, 2, 1, 2, 1, 1, 3, 3, 4, 1, 3, 3, 2, 3, 4, 2, 3, 4, 1, 1, 1, 1, 2, 3, 3, 3, 4, 1, 1, 4, 2, 2, 4, 1, 1, 3, 4, 3, 3, 3, 3, 2, 3, 3, 4, 3, 3, 2, 3, 4},
            {3, 3, 4, 1, 3, 2, 2, 1, 3, 3, 4, 1, 1, 4, 1, 2, 1, 3, 4, 3, 3, 3, 2, 4, 1, 2, 3, 4, 2, 4, 2, 1, 3, 4, 2, 2, 3, 3, 4, 3, 4, 2, 2, 4, 3, 4, 2, 1, 1, 1},
            {2, 1, 4, 2, 2, 4, 1, 1, 1, 1, 1, 3, 2, 3, 3, 4, 2, 2, 3, 4, 2, 1, 1, 1, 2, 1, 4, 1, 2, 1, 1, 2, 1, 1, 2, 2, 1, 4, 1, 2, 3, 4, 2, 4, 1, 4, 3, 3, 3, 2},
            {2, 4, 1, 3, 2, 4, 3, 3, 4, 3, 3, 2, 4, 1, 1, 1, 2, 2, 4, 1, 3, 4, 3, 3, 3, 2, 1, 3, 4, 3, 3, 3, 4, 3, 2, 3, 2, 3, 3, 2, 1, 4, 2, 1, 2, 3, 4, 2, 1, 1},
            {2, 3, 3, 2, 3, 3, 4, 2, 4, 2, 4, 1, 3, 3, 4, 4, 2, 1, 1, 4, 2, 3, 2, 4, 1, 3, 3, 2, 4, 2, 1, 4, 4, 2, 4, 1, 1, 4, 1, 1, 1, 4, 1, 1, 2, 1, 3, 3, 3, 4},
            {2, 3, 3, 3, 2, 4, 4, 2, 3, 2, 1, 2, 4, 1, 1, 3, 3, 4, 1, 1, 2, 1, 4, 1, 2, 2, 4, 1, 3, 3, 2, 4, 3, 2, 4, 4, 2, 3, 4, 3, 2, 3, 3, 4, 1, 2, 4, 1, 1, 4},
            {2, 1, 1, 2, 1, 4, 3, 3, 3, 4, 3, 2, 4, 4, 1, 2, 4, 3, 3, 4, 3, 2, 4, 3, 2, 2, 1, 2, 1, 1, 3, 3, 4, 1, 4, 4, 2, 2, 4, 2, 1, 1, 1, 4, 3, 2, 1, 3, 2, 4},
            {4, 1, 2, 4, 2, 4, 1, 4, 1, 1, 4, 1, 4, 4, 2, 2, 4, 1, 4, 1, 2, 1, 1, 3, 4, 1, 3, 3, 4, 2, 2, 1, 4, 2, 1, 4, 2, 1, 3, 4, 3, 4, 2, 3, 2, 4, 1, 1, 1, 4},
            {3, 4, 2, 3, 2, 4, 4, 1, 2, 4, 1, 2, 4, 3, 3, 2, 3, 4, 4, 3, 3, 2, 3, 2, 4, 2, 1, 1, 1, 2, 1, 1, 1, 4, 1, 3, 4, 2, 1, 1, 2, 3, 2, 4, 1, 1, 3, 3, 2, 4},
            {2, 4, 2, 1, 2, 4, 4, 3, 4, 4, 3, 2, 4, 2, 1, 1, 1, 1, 3, 2, 3, 4, 2, 4, 3, 4, 4, 1, 2, 3, 4, 1, 1, 3, 3, 2, 3, 4, 3, 3, 2, 4, 1, 3, 3, 3, 3, 4, 2, 1},
            {4, 1, 1, 2, 2, 1, 3, 2, 4, 3, 4, 2, 1, 3, 4, 3, 4, 2, 1, 3, 2, 4, 2, 3, 4, 4, 3, 3, 2, 1, 1, 3, 2, 2, 1, 1, 4, 3, 2, 4, 1, 3, 3, 2, 1, 1, 1, 4, 4, 2},
            {3, 3, 4, 2, 2, 4, 1, 2, 4, 1, 3, 3, 4, 2, 4, 2, 3, 3, 2, 2, 1, 4, 2, 2, 4, 4, 2, 1, 3, 3, 4, 3, 4, 3, 4, 2, 1, 4, 1, 4, 2, 1, 1, 1, 2, 4, 1, 4, 3, 2},
            {2, 1, 3, 2, 1, 1, 2, 1, 1, 2, 1, 1, 3, 2, 3, 3, 3, 3, 3, 3, 2, 3, 2, 1, 1, 3, 3, 3, 2, 1, 3, 2, 3, 2, 3, 3, 2, 1, 2, 1, 3, 3, 3, 2, 1, 1, 2, 1, 2, 1},
        };

        int[][] dejanske = Druga.visine(rel, smer);
        System.out.println(Arrays.deepToString(dejanske));
    }
}
