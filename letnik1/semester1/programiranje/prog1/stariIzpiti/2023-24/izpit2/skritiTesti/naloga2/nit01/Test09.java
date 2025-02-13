
import java.util.*;

public class Test09 {

    public static void main(String[] args) {
        int[][] rel = {
            {0, -20, -51, 580, -604, 923, -764, 981, 770, 313, -340, -462, -800, 765, -415, 67, 724, 508, 7, 399, -631, 127, -715, 418, 229, 17, 972, -273, -483, 270, -199, 87, 993, 820, -654, -726},
            {428, 457, -26, -438, 973, 758, -205, 859, -943, -579, -285, 310, 875, -94, 701, -44, 727, -124, 1, 273, 798, 108, 302, -174, -5, 897, -769, 110, 239, -748, 130, -948, -421, 832, 131, 176},
            {-347, 843, 113, -638, -832, -169, -143, 372, 108, -812, -318, -271, -20, 651, -10, -252, 502, 925, -605, -300, -469, 514, 212, 8, 966, 139, 910, 637, 245, 730, -557, 3, -125, 571, 625, -766},
            {743, 666, -508, -242, 118, -163, -129, 561, 796, -2, 46, 508, 278, -403, 562, -425, 492, -181, -958, 15, -553, 645, 899, -52, -140, -787, 708, 990, -605, 820, -849, 752, 654, 899, 225, -750},
            {-871, -820, -471, 866, -906, -564, -874, -118, -785, -152, -599, -962, -110, 68, -393, 161, 419, 425, 159, -836, -33, -965, -227, -84, -132, -98, 234, 353, 511, 357, 542, -173, -928, 29, 538, 846},
            {-539, 420, -540, 225, -169, -801, 671, 925, -225, -402, -140, -718, -977, -836, -899, -942, -367, 797, 581, -848, -178, 172, -320, -570, -977, 443, 316, -486, 701, 614, -783, -609, 520, -788, -329, 920},
            {-831, 346, -484, -705, 425, 510, -759, 231, 894, 282, 246, -515, -994, -606, 910, 621, 314, 866, -566, -771, -664, 224, -445, 138, -916, 157, 69, -224, -227, 572, -805, 965, -455, -632, -626, 209},
            {547, -647, 328, 130, -995, -168, 370, 593, 779, 574, 455, 711, 511, -546, 539, -697, 174, 651, 356, -914, 727, -933, -192, 543, -301, 729, 920, 562, -71, -803, -208, 487, 280, 23, -620, -49},
            {-67, -665, -431, -741, 66, 909, -85, 21, 20, -314, -117, -865, 657, -649, 650, 98, -578, 174, -619, 600, -4, 11, 956, 219, 167, -129, -507, 792, -389, -68, 710, -419, -439, 701, -486, -341},
            {619, -260, 798, -731, -564, -705, 872, 882, 750, -513, -470, -225, 475, -422, -960, -318, 673, -688, -765, 222, 946, -878, 540, -83, 863, -959, 92, 439, -571, -778, -63, -206, -100, -397, -582, -204},
            {-906, 14, -432, 682, 488, -816, 76, -275, 887, -317, -194, -778, -637, 605, -640, 200, 628, -864, -448, -233, -572, -709, 361, -371, 535, 422, 431, 626, 850, 749, 422, 157, -164, -166, -755, -765},
            {-960, -758, 126, -242, -331, -839, 838, 890, -856, -694, -31, 513, 114, -123, 278, 661, -851, -357, -306, -296, 1, -904, 189, 740, -480, 673, 239, -640, 820, -468, -743, 782, 745, 609, 757, 264},
            {896, 9, -966, 936, -770, 938, -102, -202, 902, 432, 846, -777, -103, -418, 959, 345, -660, 898, -787, 748, -95, -556, -674, 642, -864, -534, -461, 361, -90, 554, -453, -259, -110, 897, 671, 197},
            {591, 140, -863, 531, -719, 686, -742, -11, -422, -757, -767, -370, -383, -395, 279, -305, 899, 472, 129, 383, -376, -768, 467, -723, 155, -942, -91, 471, -551, -182, 914, 30, 808, 403, -79, -760},
        };
        int[][] smer = {
            {0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
            {2, 2, 2, 1, 2, 2, 2, 2, 2, 1, 1, 1, 2, 2, 2, 2, 1, 2, 1, 1, 1, 2, 1, 2, 2, 1, 1, 2, 1, 2, 2, 2, 2, 1, 2, 2},
            {2, 1, 2, 2, 1, 2, 1, 2, 1, 1, 2, 1, 1, 1, 1, 2, 2, 1, 2, 2, 2, 2, 1, 2, 2, 2, 1, 1, 1, 2, 1, 2, 1, 1, 2, 2},
            {2, 2, 1, 1, 1, 1, 2, 1, 1, 2, 2, 1, 2, 1, 1, 2, 2, 1, 2, 1, 1, 2, 2, 1, 1, 2, 2, 2, 2, 1, 2, 2, 1, 2, 1, 1},
            {2, 2, 1, 1, 2, 2, 2, 2, 1, 2, 2, 1, 1, 1, 2, 1, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 2, 2, 1, 1, 1, 1, 1, 2, 1},
            {2, 2, 1, 2, 1, 1, 1, 1, 2, 2, 2, 1, 2, 1, 2, 2, 2, 2, 1, 2, 1, 1, 1, 1, 2, 2, 1, 1, 1, 2, 2, 1, 2, 2, 2, 2},
            {2, 2, 1, 2, 2, 2, 2, 2, 1, 2, 2, 2, 1, 1, 1, 1, 2, 1, 1, 2, 2, 2, 2, 2, 1, 2, 2, 2, 2, 1, 2, 1, 1, 2, 1, 2},
            {2, 1, 1, 1, 2, 2, 1, 1, 2, 1, 2, 1, 1, 2, 2, 1, 2, 1, 1, 1, 2, 1, 2, 2, 2, 1, 2, 2, 2, 2, 2, 2, 1, 1, 2, 1},
            {2, 2, 2, 1, 2, 2, 2, 1, 2, 1, 1, 1, 2, 2, 1, 2, 1, 1, 1, 1, 2, 1, 2, 2, 2, 1, 1, 1, 1, 2, 1, 2, 1, 2, 1, 1},
            {2, 1, 1, 2, 1, 2, 2, 2, 1, 1, 2, 2, 1, 2, 2, 2, 1, 1, 2, 2, 2, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 1, 2, 1},
            {2, 1, 2, 1, 1, 2, 2, 2, 1, 1, 2, 1, 1, 1, 1, 2, 2, 1, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 2, 2, 2, 1, 1, 2, 1, 2},
            {2, 1, 2, 2, 2, 1, 1, 2, 2, 1, 2, 2, 2, 2, 1, 1, 2, 1, 2, 2, 2, 2, 1, 1, 1, 2, 1, 1, 1, 1, 2, 2, 2, 1, 1, 1},
            {2, 2, 1, 2, 2, 2, 1, 2, 2, 2, 1, 1, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 2, 1, 1, 2, 1, 2, 1, 1, 2, 2, 1, 2, 1, 2},
            {2, 2, 2, 2, 1, 1, 2, 1, 2, 2, 2, 1, 1, 2, 2, 1, 1, 1, 1, 1, 2, 1, 2, 2, 1, 1, 1, 2, 2, 1, 2, 2, 1, 1, 2, 2},
        };

        int[][] dejanske = Druga.visine(rel, smer);
        System.out.println(Arrays.deepToString(dejanske));
    }
}
