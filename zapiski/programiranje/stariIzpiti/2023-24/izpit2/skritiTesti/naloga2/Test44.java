
import java.util.*;

public class Test44 {

    public static void main(String[] args) {
        int[][] rel = {
            {0, -524, -776, -596, -721, 755, 845, 536, -254, -824, -908, -140, -369, 12, 280, -449, -186, -929, 272, -140, 296, 868, 109, 556, 6, 9, 251, 222, 564, 352},
            {312, 182, -816, -621, 968, 242, -592, -849, -41, 694, -781, -892, -476, -47, 186, -650, -365, 789, 150, -64, -576, -917, -29, -827, 192, -568, -612, 828, 217, 37},
            {304, 965, -601, 845, 600, -601, 4, -591, -334, -683, -488, -321, -903, 518, 726, 207, 472, 903, -856, 933, -860, -234, 234, 342, -229, 534, 866, 892, -697, -407},
            {884, -941, 733, 844, -758, 849, 770, 100, 12, -773, 582, 457, -853, -61, 668, 378, 5, 614, -715, -651, 209, -92, -224, 406, 990, -681, -209, -152, 430, 373},
            {972, -927, -521, 60, 464, 198, 482, -939, 426, 328, -210, -627, 527, 307, 443, -528, -749, -804, 70, -771, -885, 29, 959, 213, 285, -629, -696, 467, 227, -483},
            {121, -512, 889, -196, -611, -899, -155, 988, 115, -147, -68, -611, -428, 979, 849, 921, 526, -580, -212, -98, 818, 724, 1, 262, -298, 922, -40, -369, 896, -765},
            {59, -170, -8, 859, 241, -478, 114, 775, 752, -421, 596, 708, 441, 684, -234, 127, 401, 538, -427, 726, -481, -838, -738, -627, -647, -513, -164, 161, 762, 698},
            {-841, 767, 296, -382, 369, -531, -435, 470, -301, -782, 595, 296, -434, -434, -301, -596, -236, 738, 695, -545, -100, 915, -913, -591, 385, -294, -541, -959, -39, 113},
            {-662, 580, 692, 153, -705, -639, 706, -903, 932, 107, -159, -805, -701, -406, 79, -549, -779, 511, 839, 338, -648, 290, -998, 680, 895, -435, 208, -527, -324, 32},
            {453, 221, 472, -949, 926, 706, 769, 326, 184, 369, -856, 998, 65, -563, -976, 876, -849, 314, -412, 585, 164, -890, -752, -452, 979, 869, 23, -28, 719, 598},
            {186, -436, 805, -167, 866, 290, -489, -561, -867, 610, 183, -636, 991, 220, 758, 487, 188, -139, -406, 348, -559, 607, 580, -36, 628, 786, -275, -705, 426, 984},
            {222, -586, -374, -556, 358, -658, -925, -446, 202, -575, -877, 420, 899, -288, 439, -310, 839, 196, 954, -365, 440, 758, 668, -822, -44, -940, 633, -488, -946, -171},
            {-460, -315, -924, -441, 153, 993, 829, -56, 678, 185, 665, -837, 500, -388, -156, 155, 382, 699, -306, 415, 464, -784, -855, -299, -319, 627, -792, 546, 613, 340},
            {745, 627, -268, -684, 723, 602, 813, 247, -602, -359, 127, -817, 896, 537, -748, -794, -374, -207, -592, 691, -253, 711, -87, -29, 490, -623, -674, 812, 343, -811},
            {274, -835, 75, 789, 98, 972, -719, -253, -574, 934, -406, 963, -633, 905, 540, -237, -557, 352, -81, -906, 136, 361, -627, -353, 313, -512, 303, 233, -409, 25},
            {314, 690, -874, 577, -652, 328, -477, 431, 950, 361, -768, -672, -538, 732, -805, 643, 652, 118, -263, 40, 908, 437, 790, 464, -124, 521, -550, -238, 662, 985},
            {-975, -198, 248, 555, 965, -529, 981, -93, -873, -423, -670, 264, -964, 152, 519, 648, 2, -163, 92, 118, 809, -644, -217, 537, 79, 825, -579, 313, -234, 750},
            {-481, 968, -684, -221, -654, 825, -790, 863, 372, -973, -979, 850, -656, 489, 826, -789, -189, 272, 227, -604, 103, -568, -766, -615, -365, 78, 787, 279, 860, -882},
            {987, -325, -561, -823, 964, 388, -985, 663, 55, 343, 407, -502, 447, -611, 623, 184, -423, 689, -768, -472, -285, 652, 552, 932, 767, -915, -357, 1000, 519, -672},
            {363, 779, 858, 683, -887, -826, -772, -469, 140, -311, -271, -663, -947, -591, 918, 533, 657, 767, 287, -545, 995, -206, -443, 717, 487, 799, 177, -539, -509, -840},
            {5, 853, 794, -298, 932, 881, -262, -922, -623, -500, -909, 225, -853, 717, 393, -467, -829, 123, -352, -903, 635, -693, -854, -92, -12, -391, -315, -370, 190, 623},
            {-104, 385, -464, 331, 481, -110, -753, -586, -258, 884, 574, -403, -487, -794, 275, -721, -551, -522, -736, 110, 639, -153, 645, -842, -326, 382, 77, -278, -938, 756},
            {-601, 368, -875, 966, 185, -739, 527, -106, -483, 834, -665, 438, 563, -715, -911, -937, 445, -351, -770, 435, -984, 989, -23, -170, 527, 104, -421, -580, 274, 322},
            {-573, -149, 656, 334, -921, -791, -512, -263, -188, -195, -289, 594, -299, -798, -903, 677, -783, 820, 389, 800, 575, -726, -526, -70, 265, 361, -981, 816, -108, -500},
            {642, -869, 656, -145, -353, -875, 829, 276, -973, 251, 136, -879, 148, -615, 835, -800, 781, -729, -881, -830, -912, 302, -139, -469, 906, -401, 129, 152, -253, -846},
            {184, -497, -386, 920, 899, -843, -525, -618, -280, -448, 402, -808, -481, 948, -622, -455, -324, -148, 813, -108, -399, -100, -616, -110, 506, 163, -333, -692, -353, -465},
            {-18, -753, -570, -415, -538, 324, 409, -998, 278, -876, -101, -376, 257, 866, -963, -717, 100, 410, 487, 280, -98, 543, 298, -591, 117, 91, -385, 327, 720, -248},
            {951, 917, -474, 346, 764, 271, -594, 975, 84, 153, 203, -105, -853, 580, 1, -644, -151, -812, -384, 682, -793, 204, 512, 266, -808, 865, -220, 145, -226, 749},
        };
        int[][] smer = {
            {0, 3, 3, 3, 3, 3, 4, 3, 3, 4, 1, 1, 1, 1, 4, 3, 4, 1, 1, 4, 1, 1, 1, 1, 4, 1, 1, 1, 1, 4},
            {2, 4, 1, 2, 1, 1, 3, 2, 1, 4, 4, 1, 3, 2, 3, 2, 3, 4, 2, 4, 3, 4, 3, 2, 1, 3, 4, 3, 2, 4},
            {2, 1, 2, 2, 4, 1, 2, 4, 1, 1, 4, 2, 2, 4, 1, 2, 4, 1, 2, 3, 2, 4, 2, 1, 3, 2, 3, 4, 2, 1},
            {4, 1, 2, 4, 1, 2, 2, 4, 3, 4, 3, 3, 2, 1, 2, 4, 1, 3, 2, 2, 1, 4, 3, 4, 2, 1, 1, 3, 4, 2},
            {3, 4, 2, 3, 4, 2, 1, 4, 2, 3, 3, 3, 4, 4, 2, 1, 3, 2, 3, 4, 2, 3, 2, 3, 3, 4, 2, 1, 3, 4},
            {2, 4, 2, 4, 1, 4, 2, 3, 2, 1, 4, 1, 1, 4, 1, 1, 2, 3, 2, 3, 2, 1, 1, 1, 1, 3, 2, 4, 1, 4},
            {2, 3, 2, 4, 4, 1, 2, 1, 1, 2, 3, 4, 3, 4, 4, 2, 2, 1, 1, 1, 1, 4, 3, 3, 2, 4, 1, 4, 2, 1},
            {2, 3, 3, 4, 3, 4, 3, 3, 2, 4, 1, 4, 2, 4, 3, 2, 3, 3, 3, 4, 2, 3, 2, 1, 1, 4, 2, 1, 3, 2},
            {2, 1, 2, 3, 4, 3, 2, 1, 1, 1, 2, 1, 2, 3, 3, 3, 2, 1, 4, 1, 2, 1, 1, 4, 1, 4, 3, 4, 2, 1},
            {3, 2, 4, 1, 3, 3, 4, 3, 3, 4, 2, 3, 4, 2, 1, 3, 4, 2, 3, 4, 1, 1, 2, 1, 2, 4, 2, 3, 3, 2},
            {2, 1, 1, 2, 2, 1, 4, 2, 1, 3, 3, 2, 4, 3, 2, 2, 3, 4, 2, 3, 3, 3, 3, 4, 2, 1, 2, 1, 1, 1},
            {3, 4, 1, 2, 2, 4, 1, 1, 2, 1, 3, 4, 3, 3, 3, 2, 4, 1, 2, 1, 1, 3, 4, 3, 4, 1, 1, 4, 1, 2},
            {2, 4, 2, 2, 4, 1, 3, 2, 1, 2, 1, 1, 3, 4, 1, 4, 1, 4, 1, 1, 2, 2, 4, 4, 1, 4, 2, 4, 3, 2},
            {2, 3, 3, 2, 4, 3, 4, 2, 3, 3, 4, 2, 2, 4, 2, 4, 3, 4, 3, 2, 2, 1, 1, 4, 4, 3, 2, 1, 2, 4},
            {2, 1, 1, 1, 4, 2, 3, 4, 2, 4, 3, 2, 1, 1, 2, 4, 2, 3, 3, 3, 2, 4, 1, 4, 4, 2, 3, 3, 2, 4},
            {4, 3, 3, 2, 3, 2, 4, 4, 2, 1, 1, 4, 1, 2, 4, 1, 2, 1, 4, 1, 1, 1, 2, 4, 3, 2, 2, 1, 1, 4},
            {4, 2, 1, 1, 1, 2, 1, 3, 2, 4, 1, 4, 2, 1, 4, 3, 3, 2, 4, 3, 3, 3, 2, 1, 3, 3, 3, 4, 2, 4},
            {4, 1, 3, 3, 2, 4, 2, 1, 4, 1, 2, 1, 3, 2, 1, 2, 1, 1, 4, 2, 3, 3, 4, 2, 2, 4, 4, 1, 2, 4},
            {3, 4, 2, 1, 3, 3, 3, 2, 3, 3, 3, 4, 3, 4, 3, 3, 4, 2, 4, 3, 2, 4, 4, 3, 2, 4, 3, 3, 2, 4},
            {2, 3, 3, 2, 2, 3, 3, 4, 1, 1, 1, 4, 2, 4, 2, 4, 1, 2, 3, 2, 3, 4, 3, 2, 3, 4, 1, 4, 1, 1},
            {2, 4, 1, 3, 2, 1, 1, 4, 3, 4, 2, 3, 2, 3, 2, 4, 4, 2, 3, 3, 2, 4, 1, 1, 1, 1, 2, 3, 4, 2},
            {2, 4, 2, 1, 1, 3, 2, 1, 2, 3, 2, 4, 1, 4, 1, 1, 4, 2, 1, 2, 4, 1, 3, 4, 3, 3, 2, 2, 3, 4},
            {2, 1, 3, 3, 2, 2, 1, 4, 1, 2, 1, 1, 4, 1, 4, 1, 3, 3, 2, 2, 4, 3, 2, 4, 2, 1, 3, 2, 1, 4},
            {4, 3, 2, 3, 3, 2, 4, 1, 2, 1, 4, 1, 1, 3, 4, 2, 2, 4, 1, 2, 3, 4, 2, 3, 4, 2, 1, 1, 1, 1},
            {4, 2, 3, 4, 1, 2, 3, 4, 3, 2, 4, 3, 3, 4, 1, 2, 2, 4, 2, 1, 1, 3, 3, 4, 3, 4, 1, 1, 3, 2},
            {4, 2, 1, 1, 2, 2, 4, 1, 2, 3, 3, 3, 4, 4, 3, 3, 2, 4, 4, 1, 2, 1, 2, 4, 2, 4, 3, 3, 2, 4},
            {4, 1, 3, 4, 2, 2, 4, 4, 2, 2, 1, 1, 4, 4, 2, 3, 4, 1, 3, 3, 4, 2, 1, 1, 2, 4, 2, 1, 4, 1},
            {3, 3, 2, 3, 2, 1, 1, 3, 2, 1, 1, 1, 1, 3, 2, 1, 1, 3, 2, 1, 3, 3, 3, 3, 2, 3, 3, 2, 1, 2},
        };

        int[][] dejanske = Druga.visine(rel, smer);
        System.out.println(Arrays.deepToString(dejanske));
    }
}