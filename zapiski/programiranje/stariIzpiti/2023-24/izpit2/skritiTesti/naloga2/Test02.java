
import java.util.*;

public class Test02 {

    public static void main(String[] args) {
        int[][] rel = {
            {0, -817, -432, -350, -653, 509, 938, -440, 441, 559, 3, -119, -892, -286, -169, -908, -810, 562, -97, -760, 35, -471, -119, 202, 615, 727, 498, 87, -530, 64, -842},
            {129, 685, 734, -756, 972, 118, -412, -935, 845, -876, -423, 724, 398, -488, 739, 630, 931, 614, 436, 76, 129, -940, -961, 660, -382, 915, -674, -250, 753, -356, -583},
            {-295, 39, 325, -375, 163, -917, 657, 887, 929, 462, 41, 478, -442, 330, -291, -458, -783, -292, -941, 199, -228, 735, -865, -227, -143, 90, -787, -582, 192, 488, 991},
            {-294, 960, -376, -11, 890, 984, 569, -497, 725, 815, 924, 992, 495, 477, -506, 4, -189, 331, -137, 174, -114, -239, 628, -68, -959, -751, -355, -307, 243, 298, 870},
            {631, -148, -97, -282, 221, -252, 196, 355, -968, -793, -956, -998, -16, 940, 6, -273, 719, 241, 867, 976, 754, -162, 279, 446, 605, 131, 225, -960, 47, -537, 926},
            {915, -526, 699, 113, -59, 129, -136, -188, 996, 147, 668, -103, -77, -206, 533, 687, 221, 287, -853, 945, -751, 288, 495, -520, -898, 747, -662, -839, -15, -322, -4},
            {562, 945, 253, -325, -146, 927, 974, -610, 89, -474, 819, 280, -583, -48, 231, 997, 534, -785, -586, 18, -80, -336, -490, -751, -947, 32, 981, -85, -140, -812, -794},
            {-138, 631, -58, 540, -47, 676, 596, 407, -954, -411, -959, 325, 106, -297, -106, -785, 294, -337, -820, 256, 808, 496, -772, 566, -340, 966, 914, -554, 546, -321, 281},
            {458, 807, -409, -206, -226, -398, 828, -701, 424, -738, 274, 767, 484, -961, 144, 348, 755, 881, 323, 823, -227, -472, 791, -427, 262, 397, 637, 745, 159, 47, -325},
            {-970, -732, 53, -858, 548, -38, -735, -47, -455, 26, 173, -315, 808, 195, 633, 549, -617, 185, 105, -786, 956, 69, 166, -518, -774, 642, -124, -132, 488, -49, 943},
            {374, -830, 533, 152, 516, -408, -718, 605, -392, 929, 589, -80, -400, -524, -607, -45, 353, -505, -183, -820, -761, 361, 626, 853, 230, -661, -38, -964, 336, 1000, -633},
            {112, -641, -986, 742, -916, -430, -694, 631, 472, 859, 609, 142, 595, -7, 889, 765, 68, -155, -590, 634, -294, -880, 766, 54, -901, 813, 43, -708, -748, -270, 141},
            {-502, -96, 934, 9, 804, -449, -547, 767, 403, -960, 351, -190, -620, -142, -722, 982, -898, -913, 93, 842, -358, -575, 229, -606, 378, 346, 674, -265, -22, 303, -10},
            {891, -791, 178, -663, -392, 589, -746, 333, 775, -497, -724, 463, -915, 797, -429, 140, -89, -991, 183, -484, 932, 42, -689, -388, 442, 542, -7, 686, -561, -891, 29},
            {-354, 30, 711, -65, 829, -588, -629, 737, -943, -423, -266, 743, -672, 776, -932, -634, -407, -439, 26, -495, -283, -491, -963, -558, 717, 355, 603, -898, 457, 377, -427},
            {168, 545, -542, -25, 895, 588, 634, 273, 908, 498, -72, -205, 910, -730, -3, 540, 146, -757, 609, -707, -323, -132, -18, 513, -461, 436, 785, 803, -18, -318, -363},
            {-342, -265, 861, -452, -916, 274, -957, -52, -184, 562, 41, 236, -711, 117, -962, 199, -36, 740, -545, -299, -991, 788, 462, -635, -595, -957, 580, -956, -426, 548, 340},
            {-922, -876, 719, -541, 791, 677, 4, 764, 5, 411, 242, 251, -926, -425, -352, 249, 481, -494, 923, 481, 311, -428, -229, -817, -899, 43, 774, 426, 203, 94, -761},
            {337, -712, -198, -909, -452, 659, 222, -488, 69, -583, 456, -34, 121, 865, 86, -876, 453, -409, 517, -121, 56, 703, -491, -639, 667, 315, -595, 656, 97, -76, 567},
            {515, 34, -63, -767, -220, -538, 512, -789, -653, 872, 678, -673, -872, 315, -204, 485, -586, 442, 659, -67, -464, -667, 11, -54, 774, -622, -393, 971, 679, -340, 227},
            {-733, 777, -91, 628, 928, 104, 740, -837, 675, 859, 387, -302, 751, 18, 264, -775, 809, -544, -42, -859, -293, -540, -824, -918, 90, 517, 751, -823, 178, -981, -387},
            {657, -956, -469, 746, 842, -452, 113, -690, 407, -252, -839, 718, -780, -107, -348, -204, -33, 856, 678, -226, 66, -489, -782, -764, -134, 269, 46, 362, 260, -677, -632},
            {861, -506, -882, 115, 516, -194, -422, -713, 801, -569, -111, -891, 356, -396, -751, 892, 717, -159, -637, -549, 371, -810, 571, 715, -667, -287, -144, -521, 712, -176, 892},
            {-312, 549, 816, -124, 693, -397, -747, 521, -845, 969, -829, -790, 314, -498, 769, 430, 44, 600, -725, -128, -751, 741, -169, 782, -440, -442, -51, 561, -682, -35, 368},
            {98, -309, -29, 416, -743, 853, 650, -117, -360, 439, 9, -439, -240, -542, -253, -488, -506, 588, -634, -998, 761, 747, -80, 417, -276, 982, -845, 185, 404, -570, -283},
            {536, -66, 144, 973, 491, -180, 590, 512, 864, 347, -565, -583, -972, -145, -627, 781, -662, 352, 527, 897, -149, 625, -432, 452, -59, 801, 695, -176, 267, 4, 287},
            {550, -306, -72, 869, 295, -610, -479, -673, -774, -170, -514, -883, 130, 983, -456, 656, -758, -827, 305, -917, 358, -464, 182, -2, 390, 693, -211, 104, 268, 141, -156},
            {-33, -852, 643, 238, -714, -985, 823, 136, 660, 358, -759, 456, 518, -592, 576, 441, -894, 625, -489, 761, 722, 127, 305, 249, -456, 781, 629, -475, -520, 708, -575},
            {822, 954, -858, -871, -304, -984, 537, -347, -855, 250, -371, 895, 612, -858, -818, -810, 468, -170, 203, 271, 956, 976, -377, 26, -264, -354, -642, 568, 157, 302, -310},
        };
        int[][] smer = {
            {0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
            {2, 2, 2, 2, 2, 1, 2, 1, 1, 2, 2, 1, 2, 2, 2, 1, 1, 2, 1, 1, 1, 1, 2, 2, 2, 1, 2, 2, 2, 1, 2},
            {2, 2, 2, 1, 1, 2, 2, 1, 1, 1, 2, 2, 1, 1, 1, 1, 1, 1, 2, 2, 1, 2, 2, 1, 2, 1, 1, 1, 2, 2, 1},
            {2, 1, 2, 2, 2, 1, 1, 1, 2, 2, 1, 2, 1, 1, 1, 1, 1, 2, 1, 2, 1, 2, 2, 1, 2, 2, 1, 1, 2, 1, 2},
            {2, 2, 2, 1, 2, 2, 2, 2, 2, 1, 1, 2, 2, 2, 1, 1, 1, 2, 2, 2, 2, 1, 1, 2, 2, 1, 2, 1, 1, 1, 1},
            {2, 2, 1, 2, 2, 2, 1, 2, 2, 1, 2, 2, 2, 1, 2, 2, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1},
            {2, 1, 2, 2, 2, 2, 2, 2, 1, 1, 2, 1, 1, 2, 1, 2, 2, 1, 1, 2, 1, 1, 2, 1, 2, 2, 1, 2, 1, 1, 2},
            {2, 2, 1, 2, 1, 2, 2, 1, 2, 2, 2, 1, 1, 1, 1, 1, 2, 2, 1, 1, 2, 2, 2, 2, 1, 1, 2, 1, 1, 2, 1},
            {2, 2, 1, 1, 2, 1, 2, 2, 2, 1, 2, 1, 2, 1, 2, 2, 1, 1, 2, 1, 2, 2, 1, 2, 2, 2, 1, 2, 2, 1, 1},
            {2, 2, 2, 1, 2, 2, 1, 1, 1, 2, 1, 2, 2, 2, 2, 2, 2, 2, 1, 2, 1, 2, 1, 2, 2, 2, 2, 1, 2, 1, 1},
            {2, 1, 2, 2, 1, 2, 2, 2, 1, 2, 1, 1, 2, 1, 1, 2, 1, 2, 1, 1, 1, 2, 2, 1, 1, 2, 1, 1, 1, 2, 2},
            {2, 1, 2, 1, 2, 1, 2, 2, 1, 1, 2, 2, 1, 2, 1, 1, 1, 2, 2, 1, 2, 2, 1, 1, 1, 2, 2, 2, 1, 1, 2},
            {2, 2, 2, 2, 1, 2, 1, 2, 2, 2, 1, 2, 1, 2, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 2, 2, 1},
            {2, 2, 1, 1, 2, 2, 2, 1, 1, 1, 1, 2, 1, 1, 1, 1, 1, 1, 2, 2, 1, 2, 1, 1, 2, 1, 2, 2, 2, 1, 1},
            {2, 2, 1, 2, 1, 1, 1, 2, 2, 2, 1, 1, 2, 1, 1, 1, 1, 1, 2, 2, 1, 2, 1, 1, 2, 2, 2, 1, 2, 2, 1},
            {2, 2, 2, 2, 1, 1, 1, 1, 1, 2, 1, 1, 2, 2, 1, 1, 1, 1, 2, 1, 2, 2, 1, 1, 1, 1, 2, 2, 2, 2, 2},
            {2, 1, 2, 2, 1, 2, 2, 1, 1, 1, 2, 1, 1, 1, 2, 1, 1, 2, 1, 2, 1, 1, 2, 2, 1, 1, 1, 2, 1, 2, 1},
            {2, 1, 2, 1, 2, 1, 2, 1, 1, 1, 2, 2, 1, 2, 2, 2, 2, 2, 2, 1, 2, 1, 2, 1, 1, 1, 2, 2, 2, 1, 2},
            {2, 2, 1, 1, 1, 1, 2, 2, 2, 2, 1, 2, 2, 2, 1, 2, 1, 1, 2, 1, 2, 1, 1, 2, 2, 2, 1, 1, 1, 1, 1},
            {2, 2, 2, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 2, 2, 2, 1, 2, 1, 1, 1, 1, 1, 1, 2, 2},
            {2, 2, 1, 2, 2, 2, 2, 2, 2, 1, 1, 1, 2, 1, 1, 2, 2, 2, 2, 2, 2, 1, 1, 2, 2, 1, 2, 2, 2, 2, 2},
            {2, 2, 2, 2, 2, 1, 1, 2, 2, 1, 2, 1, 2, 1, 1, 2, 2, 2, 1, 1, 2, 2, 2, 2, 1, 1, 2, 1, 2, 2, 1},
            {2, 1, 2, 1, 2, 1, 2, 1, 2, 1, 2, 2, 2, 2, 1, 1, 2, 1, 2, 1, 1, 1, 2, 1, 2, 2, 1, 1, 1, 1, 2},
            {2, 2, 1, 1, 1, 1, 1, 2, 2, 1, 2, 1, 1, 1, 1, 1, 2, 1, 1, 1, 1, 2, 2, 2, 1, 2, 2, 1, 1, 1, 2},
            {2, 2, 2, 1, 2, 2, 2, 1, 1, 2, 1, 1, 2, 1, 2, 1, 2, 2, 2, 1, 2, 2, 1, 1, 2, 2, 2, 2, 1, 2, 2},
            {2, 1, 1, 1, 1, 2, 2, 2, 2, 1, 1, 2, 2, 2, 1, 1, 2, 1, 1, 1, 1, 2, 2, 2, 2, 1, 1, 1, 2, 2, 2},
            {2, 2, 1, 2, 2, 1, 1, 2, 2, 1, 1, 1, 2, 1, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 2, 1, 2, 2, 2, 1},
            {2, 2, 1, 1, 1, 2, 1, 1, 2, 2, 1, 2, 2, 1, 1, 2, 2, 1, 1, 2, 2, 1, 2, 2, 1, 2, 2, 1, 2, 1, 2},
            {2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 1, 2, 1, 1, 2, 2, 2, 2, 2, 2, 2, 1, 1, 2, 1, 1, 2, 1, 2},
        };

        int[][] dejanske = Druga.visine(rel, smer);
        System.out.println(Arrays.deepToString(dejanske));
    }
}