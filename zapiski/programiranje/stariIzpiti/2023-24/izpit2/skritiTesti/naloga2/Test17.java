
import java.util.*;

public class Test17 {

    public static void main(String[] args) {
        int[][] rel = {
            {0, -379, 93, 297, 731, -665, 466, -918, 354, -188, -772, -226, -880, -658, -52, 345, 860, 33, -175, 822, 529, -168, -736, -70, -618, 744, -936, 129, -174, -82, 515, 24, -987, -498, -736, 373, -608, -835},
            {934, 808, 405, 904, 154, -37, -68, 333, 496, -136, 768, 581, -857, 921, 118, -821, 492, 63, 444, -435, 134, 656, -469, -75, -374, 61, 229, 545, -116, 400, -703, 970, 556, -447, -364, -405, 1000, 866},
            {635, -375, 316, 768, 656, -919, -145, 888, -965, 932, -256, 149, 843, 82, -948, -935, 919, -560, -27, -278, -142, 124, -198, -278, 863, -165, -732, 609, -881, -662, 129, 788, 987, 632, 940, 297, 665, 581},
            {404, 36, 435, -529, 847, -386, -86, -960, -917, -711, -346, 63, -366, 923, 174, 510, 716, 434, 867, -646, 667, 475, 678, -509, 271, 142, -913, 817, 571, 536, 116, 947, -476, 225, -824, -389, 958, 190},
            {308, -184, 52, 483, -661, 250, -437, 869, 904, 46, -557, -494, 72, 441, 391, -410, -866, 184, 339, 12, 899, 499, 806, 727, -52, -45, -839, -535, 120, -560, -624, -477, -35, 172, -826, -929, 863, -512},
            {-880, -695, -688, 693, -26, -562, -916, -774, 301, -364, -513, 828, -932, -990, -626, -845, -592, 51, 40, 302, 891, -309, 275, -314, -368, 274, 218, 331, -94, -204, 597, -786, 291, -445, 779, -86, -475, -428},
            {-248, -504, 989, 509, 775, 593, 852, 131, 160, -390, -56, -955, 111, 498, 859, -997, -906, -764, -903, 910, 259, -846, 85, 212, -994, 382, -590, 532, -106, -803, 640, 109, 314, -31, 364, -882, -207, -850},
            {-605, -547, -327, -421, 497, -775, 650, 981, 630, -654, -483, -359, -464, -880, 254, -821, 514, 525, 536, 909, 765, 792, -720, -916, 75, -931, -769, -593, -927, -712, 648, -84, 966, 219, -959, 461, 982, 279},
            {-470, -889, 658, -125, 258, 272, -976, -751, -998, -75, -241, -421, 131, -760, -626, -812, 35, -782, 377, 309, 372, 1, 602, 924, -545, -497, -559, -548, 141, -941, -834, 308, 322, 720, -293, 15, 320, -906},
            {965, -399, -644, -241, 66, 561, 309, 497, 633, 134, 813, 93, 624, 187, 554, 965, 613, -812, 1, 202, -740, -946, -429, -343, -3, 482, 47, -157, -357, -245, 752, -630, -743, 361, 162, -221, -1000, 743},
        };
        int[][] smer = {
            {0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
            {2, 2, 1, 2, 1, 2, 2, 1, 1, 2, 2, 1, 1, 2, 1, 2, 1, 2, 2, 2, 2, 1, 2, 2, 2, 2, 1, 1, 2, 2, 2, 2, 2, 2, 1, 2, 2, 1},
            {2, 2, 1, 1, 2, 1, 1, 1, 2, 1, 1, 2, 2, 2, 2, 2, 2, 1, 2, 2, 2, 2, 2, 2, 1, 2, 1, 2, 1, 1, 2, 1, 2, 2, 2, 2, 2, 1},
            {2, 2, 2, 1, 2, 1, 2, 1, 1, 2, 1, 1, 2, 1, 2, 2, 2, 2, 1, 2, 1, 1, 1, 1, 1, 2, 1, 1, 1, 2, 2, 2, 1, 2, 2, 1, 1, 1},
            {2, 1, 1, 2, 2, 2, 2, 2, 1, 1, 2, 2, 1, 1, 1, 1, 1, 2, 1, 2, 2, 2, 1, 1, 2, 1, 1, 1, 2, 2, 2, 1, 1, 1, 2, 1, 1, 1},
            {2, 2, 1, 1, 1, 1, 1, 1, 2, 1, 1, 1, 1, 2, 2, 2, 1, 2, 2, 2, 1, 1, 1, 2, 1, 1, 2, 1, 2, 2, 1, 1, 2, 2, 2, 1, 2, 1},
            {2, 1, 2, 1, 1, 2, 2, 1, 2, 2, 1, 1, 2, 2, 2, 1, 2, 2, 2, 1, 1, 1, 1, 2, 1, 2, 1, 1, 1, 2, 2, 1, 1, 1, 1, 1, 2, 2},
            {2, 2, 1, 2, 2, 2, 2, 1, 2, 1, 1, 1, 1, 2, 1, 2, 1, 2, 2, 2, 2, 1, 1, 1, 2, 2, 1, 2, 1, 1, 2, 1, 2, 2, 2, 1, 2, 2},
            {2, 1, 1, 2, 1, 1, 2, 1, 2, 2, 1, 2, 2, 1, 2, 2, 1, 1, 1, 2, 1, 2, 1, 1, 1, 1, 1, 2, 1, 1, 1, 2, 1, 1, 1, 2, 1, 1},
            {2, 2, 2, 1, 1, 2, 1, 2, 1, 1, 1, 1, 2, 2, 2, 2, 1, 2, 1, 2, 2, 1, 1, 1, 1, 2, 2, 1, 1, 2, 1, 2, 2, 2, 2, 2, 1, 1},
        };

        int[][] dejanske = Druga.visine(rel, smer);
        System.out.println(Arrays.deepToString(dejanske));
    }
}