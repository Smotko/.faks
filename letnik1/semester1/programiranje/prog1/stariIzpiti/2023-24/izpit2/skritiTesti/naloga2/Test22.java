
import java.util.*;

public class Test22 {

    public static void main(String[] args) {
        int[][] rel = {
            {0, -705, -406, -105, 246, 57, -109, -784, 903, -194, 433, -773, 113, -249, -438, 562, -999, 216, -969, 750, -840, 631, 285, -567, -761, 24, -738, -487, -337, 191, 857, 879, -439, -712, 361, 103, -739, -866, -80, 876, -683, 485, 844, 806, -303, 5},
            {704, -655, -46, 532, 710, -919, 260, -665, 178, -877, 82, 418, -450, -996, 703, 559, 150, -525, -952, 458, -757, -365, -833, 942, -747, -119, 543, -65, 726, -850, -75, 745, 729, 919, -650, -291, -150, 419, -639, -909, 34, -726, 881, -671, 841, -227},
            {-344, -369, -496, -797, 204, -404, -434, -791, -480, 340, 215, -275, -765, -837, -410, 522, -269, 654, -614, -819, -286, -495, 358, 713, 940, -231, -840, 29, -960, -481, 100, 380, 106, -624, -888, -297, 457, -752, 941, -673, -496, 754, -62, -266, -206, -449},
            {902, -767, -510, 403, 708, -324, -701, 362, 492, -691, -146, 302, 595, 358, -127, -366, -462, 177, 864, -95, 614, -441, 742, 849, 256, 910, 809, 706, -56, -732, -444, 799, 547, 149, -518, -925, -138, -820, -489, 629, 778, 659, -226, -871, -703, 695},
            {-464, 432, 612, 476, 557, -17, 320, 126, 597, 138, 242, 834, -420, -706, -94, -688, 633, -15, -93, 830, -171, -168, 881, -316, 105, -73, 827, 667, -55, -978, 305, -91, 467, 550, 965, 446, 122, -4, -937, -713, -611, -558, -326, 428, 264, 855},
            {253, 605, -291, -10, -312, 175, 265, 686, -596, 842, -63, -802, -380, -608, -532, 769, 683, 943, 389, 587, -59, 89, 265, -730, 386, 495, -56, 998, -406, 935, -2, 296, 481, -853, -382, -767, -955, -547, 115, -230, -168, 189, 768, -112, 31, -146},
            {-827, 831, -171, 653, -714, 359, 979, 505, 172, 12, -631, -750, -332, -259, -724, 682, -257, -557, -695, -974, -774, 188, 318, 77, 314, -466, -543, -936, 215, -56, 817, -62, 287, -749, -31, -700, 486, 811, -822, -723, -238, -257, -402, 268, -325, 938},
            {-318, 96, -961, -735, -455, -914, 982, 570, 324, -219, -154, -106, 638, 591, -878, -486, -384, 975, -105, -661, -902, 384, 682, 288, 562, 19, -233, 189, 86, 353, 177, -936, -404, -930, -567, 698, -360, -826, -733, -809, -208, 881, 86, -563, 375, -872},
            {596, -972, 934, -900, 579, 171, -822, 367, 448, -42, -898, -479, -509, 366, -653, -933, 127, 587, 871, 253, 460, 847, -856, -643, 514, -915, 48, 600, 999, -52, 741, 852, -190, -391, 606, -614, 400, -579, 913, -281, -296, -495, 69, 342, 898, 665},
            {143, 977, 748, 228, -390, 699, 908, 746, -890, 187, -302, -879, -184, -117, 671, 607, 499, 750, 6, 4, 254, -310, 817, 949, -358, 626, -228, 355, -154, 612, -764, 318, 564, 546, 580, -12, -592, -102, -472, -833, 321, 873, 367, -60, 932, -176},
            {-349, -910, -197, 88, -911, 263, 167, -148, -624, 750, 880, 63, 722, 323, 413, 685, -182, -640, -140, 590, -543, 309, -468, 805, 703, -73, -33, -445, 155, -92, -318, -816, 698, -451, -19, -652, -246, -14, 822, 635, -19, -83, -976, -175, -738, -883},
            {-213, 25, -79, -890, -152, 350, 84, 544, -596, -262, 538, 489, 702, -681, -105, 558, 141, 356, 613, -374, -641, 960, -489, 446, 987, 259, 200, 274, 601, -465, -748, -675, -396, 894, 830, -145, -926, -206, 213, -722, 302, -711, -294, 997, -747, -685},
            {992, 621, -557, 577, -843, -1, 311, -418, 784, 846, 787, -330, -44, 730, 196, 409, -989, 770, 319, -698, 107, 419, -213, 959, -785, 899, -152, 944, -425, 42, -462, -540, -816, 983, -647, -567, 42, -982, -925, -67, 933, 684, 42, 829, -325, 179},
        };
        int[][] smer = {
            {0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
            {2, 2, 2, 2, 2, 1, 1, 2, 2, 2, 1, 2, 1, 1, 2, 1, 2, 1, 1, 1, 2, 1, 1, 2, 2, 2, 1, 2, 2, 1, 2, 1, 1, 2, 1, 1, 2, 1, 2, 2, 1, 2, 2, 1, 2, 2},
            {2, 1, 2, 1, 1, 2, 2, 2, 2, 2, 1, 2, 1, 2, 1, 2, 1, 2, 2, 2, 2, 1, 1, 2, 2, 2, 2, 1, 2, 2, 2, 1, 2, 2, 1, 2, 1, 2, 2, 1, 2, 2, 1, 1, 2, 1},
            {2, 2, 2, 1, 1, 2, 1, 2, 2, 2, 2, 1, 2, 2, 1, 1, 1, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 1, 1, 2, 1, 1, 1, 2, 1, 1, 2, 2, 1, 2, 2, 2, 1},
            {2, 2, 1, 1, 2, 1, 1, 1, 2, 1, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 2, 1, 2, 2, 1, 2, 2, 1, 2, 2, 2, 1, 1, 2, 2, 1, 2, 2, 2, 1, 1},
            {2, 1, 2, 2, 1, 2, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 1, 1, 2, 1, 2, 2, 2, 1, 1, 1, 1, 1, 2, 2, 2, 1, 1, 2, 2, 1, 2, 2, 2, 1, 2, 1, 2, 2, 1, 2},
            {2, 2, 2, 2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 1, 1, 2, 1, 1, 2, 2, 2, 2, 2, 1, 1, 2, 2, 2, 2, 2, 1, 1, 1, 2, 2, 1, 1, 2, 1, 2, 1, 2, 1, 2, 1, 1},
            {2, 2, 2, 2, 1, 2, 2, 1, 1, 2, 1, 2, 1, 1, 1, 2, 2, 1, 2, 1, 2, 1, 1, 1, 1, 2, 2, 2, 1, 2, 1, 1, 2, 2, 1, 1, 1, 2, 1, 2, 1, 1, 2, 1, 1, 1},
            {2, 2, 2, 1, 2, 2, 2, 1, 2, 2, 1, 1, 1, 2, 1, 2, 1, 2, 2, 2, 1, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 2, 1, 1, 1, 1, 1, 1, 2, 1, 2, 1, 1, 2, 1},
            {2, 2, 1, 1, 2, 1, 2, 2, 1, 2, 2, 1, 1, 1, 1, 2, 1, 1, 2, 2, 1, 2, 1, 2, 1, 2, 2, 1, 2, 1, 1, 2, 2, 1, 1, 1, 1, 1, 2, 1, 1, 2, 2, 1, 1, 1},
            {2, 1, 2, 2, 2, 2, 2, 2, 1, 1, 1, 2, 2, 1, 1, 2, 1, 2, 2, 1, 1, 1, 2, 1, 1, 1, 2, 1, 1, 1, 2, 2, 2, 2, 2, 1, 1, 2, 2, 2, 1, 2, 1, 2, 1, 1},
            {2, 1, 1, 2, 1, 1, 1, 1, 2, 1, 2, 2, 2, 1, 1, 1, 1, 1, 2, 1, 2, 1, 2, 1, 1, 1, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 1, 2, 2, 1, 2},
            {2, 1, 1, 1, 1, 1, 1, 2, 2, 2, 1, 2, 2, 1, 1, 1, 2, 2, 2, 1, 2, 1, 2, 1, 2, 1, 1, 2, 2, 2, 2, 1, 1, 2, 1, 2, 2, 2, 1, 2, 2, 2, 1, 1, 2, 1},
        };

        int[][] dejanske = Druga.visine(rel, smer);
        System.out.println(Arrays.deepToString(dejanske));
    }
}
