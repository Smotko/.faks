
import java.util.*;

public class Test29 {

    public static void main(String[] args) {
        int[][] rel = {
            {0, -425, 410, 830, -253, 920, -97, 631, 14, 925, -515, 92, -484, 715, 732, 611, 719, -872, -685, 920, -188, -645, -103, -278, 929},
            {684, -319, 391, 520, 518, -663, 185, 20, -750, -662, -696, 167, 940, 370, 743, 78, 535, -51, 875, -701, 350, 546, 427, 737, -202},
            {574, -606, -482, 881, 505, -326, -311, -926, -264, 384, -813, 891, 785, 376, -539, -10, 754, 375, -835, -25, 655, -442, -808, 823, -834},
            {786, -575, -176, -406, 577, 508, -21, -382, -244, 35, 306, 459, -517, -386, -317, 328, 727, -515, -732, 784, -510, 581, 402, 181, -214},
            {25, 653, -955, -45, -830, -910, -322, -305, -36, -33, -594, 771, -273, 176, 98, 98, -287, 954, -483, 410, 353, 71, -262, 610, -870},
            {703, 713, 114, -649, 890, 209, 379, -215, 639, 353, -451, 792, -46, 221, 129, -45, 319, -252, -421, 571, 39, -162, -158, -475, -851},
            {-18, -75, -984, 448, 687, -169, 221, -44, 893, -254, 593, -443, 337, -246, 964, -79, 264, -25, -793, 3, -383, -346, -40, -147, -845},
            {-992, 627, 324, 606, -101, -891, -931, -82, 350, -96, -318, 664, 382, -672, -900, 914, 640, -95, 750, -761, -877, -996, 688, -571, -979},
            {116, -676, -933, 847, -798, -412, 154, 990, 272, 52, 63, 384, 717, -146, -972, -839, -608, 211, 767, 643, -621, 178, -794, 231, -575},
            {-763, 25, 928, 757, -655, -657, -900, 431, 484, 345, -953, -535, -118, 980, -29, -202, -989, -388, -844, 534, -227, 876, 624, -196, -957},
            {959, -378, -249, -31, 388, 928, 490, -973, 905, 72, -888, 650, -62, -409, -866, -436, -249, -216, 328, 700, 756, -402, -86, -151, -711},
            {-182, 440, 886, 582, -882, -500, 963, -177, -857, -145, 25, -307, -300, -771, -645, -468, 605, -74, -559, -882, -220, -413, 133, -947, 569},
            {69, 910, -896, -479, -826, -669, -145, -165, 968, -139, 603, 927, -246, -435, 861, 532, -769, -97, 433, 273, 708, 516, 462, 706, -973},
            {191, -485, -576, -798, 873, 798, -496, -784, 29, -947, 204, 79, -439, 140, -126, -498, 225, -675, 110, 800, 710, -357, -746, 701, -929},
            {95, 169, -648, -312, 897, 457, -341, 414, 471, 42, -17, -403, -958, -769, -295, 136, -818, 142, 401, -764, -222, -590, 522, -937, 724},
            {-225, 868, 824, 510, 956, 59, -285, 888, -120, 894, -128, -624, -817, -852, -948, -936, -177, 233, 200, -510, -996, -615, 557, 390, 166},
            {-536, -423, 740, 643, 246, 379, 249, 810, 413, 439, 468, 349, 593, 778, 315, 253, 135, 388, 548, -263, 835, -570, -603, 91, 670},
            {456, 152, 344, 929, 837, -655, -658, 976, 875, -208, 398, 337, 198, 509, -109, 611, -345, -358, 551, -258, 418, -495, -156, 75, 254},
            {623, 836, -652, -840, 105, -83, -649, -259, -352, 188, 591, -393, -708, -793, 438, 357, 615, -290, 413, 812, 517, -657, 639, 459, 542},
            {-681, -171, -765, 519, 138, -990, -216, -450, -366, 942, 349, 808, 311, 709, -288, 1, 638, 852, -297, 104, -233, 698, -576, -490, -932},
            {262, 552, 442, 646, -430, 660, -258, -90, 845, 228, 224, 723, 363, 282, 842, -882, -632, -32, -279, -240, -472, 96, -800, -875, 696},
        };
        int[][] smer = {
            {0, 1, 1, 3, 3, 4, 1, 3, 3, 4, 1, 1, 1, 3, 4, 1, 1, 1, 3, 3, 4, 3, 4, 3, 4},
            {4, 1, 2, 2, 1, 3, 3, 2, 1, 4, 3, 4, 2, 4, 1, 3, 3, 2, 4, 1, 1, 2, 3, 2, 4},
            {3, 3, 2, 2, 4, 1, 1, 1, 1, 1, 4, 1, 2, 1, 3, 2, 4, 1, 1, 3, 3, 2, 4, 1, 4},
            {2, 1, 3, 2, 4, 3, 3, 4, 3, 4, 3, 3, 3, 4, 2, 3, 3, 3, 4, 2, 1, 1, 1, 4, 1},
            {4, 2, 1, 2, 3, 2, 1, 3, 4, 3, 2, 1, 1, 4, 2, 1, 1, 4, 1, 1, 2, 4, 1, 1, 2},
            {4, 1, 2, 1, 1, 1, 1, 1, 3, 3, 3, 4, 2, 3, 4, 3, 2, 3, 3, 3, 2, 3, 3, 3, 4},
            {3, 3, 3, 4, 1, 1, 3, 2, 2, 4, 1, 3, 4, 4, 1, 2, 1, 1, 1, 2, 1, 1, 1, 4, 4},
            {2, 3, 4, 4, 2, 3, 2, 3, 2, 1, 2, 4, 1, 4, 2, 3, 3, 4, 2, 3, 3, 3, 2, 1, 4},
            {2, 2, 4, 3, 4, 2, 1, 1, 1, 1, 4, 1, 3, 3, 3, 2, 4, 1, 2, 4, 1, 2, 1, 4, 1},
            {2, 2, 4, 4, 1, 3, 4, 3, 3, 2, 3, 3, 3, 3, 3, 4, 4, 3, 2, 4, 2, 1, 1, 1, 2},
            {2, 1, 4, 4, 2, 2, 4, 2, 3, 4, 1, 4, 1, 4, 1, 1, 4, 2, 1, 3, 4, 4, 1, 1, 2},
            {4, 2, 1, 4, 3, 2, 4, 2, 4, 1, 2, 1, 2, 1, 4, 1, 3, 4, 2, 2, 4, 4, 3, 3, 2},
            {3, 3, 2, 3, 2, 4, 3, 2, 4, 3, 4, 3, 4, 3, 4, 2, 1, 1, 2, 1, 1, 3, 2, 4, 1},
            {2, 3, 3, 3, 4, 1, 3, 4, 1, 2, 4, 2, 3, 2, 3, 3, 3, 3, 3, 4, 1, 2, 4, 3, 4},
            {2, 1, 2, 4, 1, 2, 2, 3, 3, 2, 4, 2, 3, 3, 4, 1, 1, 1, 1, 3, 3, 2, 3, 2, 4},
            {4, 2, 1, 3, 4, 2, 1, 1, 1, 4, 1, 2, 4, 1, 1, 4, 3, 4, 2, 3, 4, 3, 2, 1, 4},
            {3, 4, 2, 1, 1, 4, 1, 1, 2, 1, 4, 2, 1, 3, 3, 3, 2, 3, 2, 2, 3, 2, 4, 1, 4},
            {2, 4, 3, 4, 3, 4, 3, 3, 4, 1, 1, 1, 1, 2, 1, 1, 1, 1, 4, 1, 2, 4, 1, 2, 4},
            {4, 1, 2, 3, 2, 3, 2, 4, 3, 4, 3, 3, 3, 3, 4, 3, 3, 2, 4, 2, 4, 1, 4, 2, 1},
            {4, 3, 2, 4, 1, 1, 1, 1, 1, 4, 2, 1, 4, 1, 1, 2, 4, 1, 4, 2, 4, 3, 4, 1, 2},
            {3, 2, 1, 1, 3, 3, 3, 3, 2, 3, 3, 2, 3, 3, 3, 2, 1, 2, 1, 2, 1, 2, 3, 3, 2},
        };

        int[][] dejanske = Druga.visine(rel, smer);
        System.out.println(Arrays.deepToString(dejanske));
    }
}