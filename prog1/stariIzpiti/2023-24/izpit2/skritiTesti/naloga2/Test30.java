
import java.util.*;

public class Test30 {

    public static void main(String[] args) {
        int[][] rel = {
            {0, 492, -141, -788, 132, -947, -667, -321, -622, 249, -448, 641, -226, 33, -537, -208, 57, -805, -281, 956, -808, 717, 126, 116, -886, 36, -667, 722, 588, -870, -98, -938, -406, 489, 533, 243, -388, -968, -911, 972, 916, 660, 159, -571},
            {785, -140, -161, 417, -183, -202, -293, -285, -302, 903, 813, -290, -662, 43, -227, -209, 83, -718, -964, -739, -413, -836, -671, -434, 804, 676, -70, 739, 665, 530, -448, 621, -541, 227, 498, -337, 107, -98, -236, -140, -796, -504, 925, -664},
            {-736, -792, -527, 146, -729, -306, -911, 26, 293, -123, -867, -649, 474, -101, 210, 597, -576, 25, -593, 638, 850, 914, -812, 102, 723, 174, -536, 357, -475, 710, -744, -839, 299, -444, -688, 965, -418, -235, -133, -169, -531, 233, 728, 973},
            {291, -461, -301, 539, 461, 443, 275, -776, 123, 923, 771, 855, 595, 456, 997, 822, 147, 499, -771, -94, 407, 883, 114, 740, -536, -687, 309, -235, -357, -368, -197, 140, -352, 695, 642, -856, 384, 204, 272, -279, 339, -457, -973, 421},
            {-752, -805, -62, -738, -992, 264, 281, 628, -41, -622, -170, -97, -45, -57, 451, 749, -95, -561, -304, -448, -628, 131, 779, -276, 767, -577, 483, 76, 635, -4, 335, -39, -904, 585, -37, -572, 727, -370, 185, -882, 361, -588, 210, -465},
            {719, 973, 402, 904, -997, -66, 750, -778, 966, 642, -112, -88, -230, 178, 280, -446, -730, 301, -270, 182, 133, -294, -26, -944, 396, -5, 239, 521, 491, -818, -943, 456, 494, 58, -647, 467, -704, 934, -778, -717, -147, -678, 741, -927},
            {179, 488, -228, 198, -431, -634, -478, -725, 752, -670, -336, -112, 394, 478, 208, 263, -79, -17, -519, 218, 671, -987, 479, 145, -547, 228, 89, -769, 610, 521, -875, 615, 407, 760, 54, 578, -927, -384, -322, -962, -390, 403, -904, 181},
            {-57, 375, 26, 481, -730, -979, -624, 85, 179, 595, 560, 641, 101, -703, -245, 818, -655, 136, -619, 449, -164, 58, 493, -974, -1000, 813, -984, -709, 646, -386, 706, -38, 260, -306, 785, 950, 378, -180, 848, -888, 39, 720, -729, 781},
            {-965, 990, -441, 779, 873, -670, 900, 57, 842, 546, -326, -251, -606, 377, -872, 819, 957, 741, -954, 838, 452, 919, -430, -327, 367, 473, -671, 139, -440, 95, -666, -819, -241, 852, 302, -817, -119, -40, -564, -488, -405, -421, 992, -489},
            {-505, 408, -107, 203, -984, 214, 414, -763, 423, 938, 795, 76, -223, -791, 188, -241, 745, -663, -362, -790, 852, -967, 876, 354, -513, 690, 986, -655, -824, 14, -696, -945, 271, -438, -199, -35, 955, 159, -496, 83, -675, -440, 185, -459},
            {-844, 80, -240, -494, 63, 15, -185, 840, 316, -996, 529, 371, -226, -514, -916, 811, 51, 352, 570, 199, 334, 621, -920, -776, -623, 997, -113, -766, 290, 982, 736, -727, -609, -320, 588, 826, 738, -432, -683, -992, -417, 469, -808, 26},
            {-981, 197, 149, 208, 766, 374, 226, 292, 923, 338, 697, -865, -488, -974, -62, -792, -664, 799, 406, 291, 38, 300, 13, -893, 478, 403, 662, 11, -387, -954, 702, -246, -939, 457, -587, -683, 256, 646, 433, 419, -40, -552, 989, -58},
            {90, -593, 692, -499, 74, 320, -614, 688, 323, -771, -220, -812, 807, -692, 148, 291, -589, -445, -708, 495, -391, -165, -824, 691, 289, -523, 729, -153, -411, -26, -492, 241, 999, 674, -467, 901, 727, 493, -213, 523, -56, -106, 576, -714},
            {399, 518, 331, -668, 711, -217, -385, -929, 655, -209, 861, -221, 786, 597, -177, -150, 139, -132, -985, -954, -310, 333, 437, -967, 761, -322, -451, 83, 940, -465, -7, -115, 446, -651, 682, 728, 751, -367, 156, 723, -125, 840, 801, -804},
            {-253, -948, 241, -720, -122, -724, 730, 355, 708, -277, -890, 354, 1, 308, -166, 583, -484, 184, -111, 125, -229, 122, -960, 654, 427, 364, 185, -25, -142, -244, -985, 238, 118, -152, -450, -747, -295, 828, 783, -343, -975, 56, 217, 326},
            {-961, 247, 462, -307, 291, -577, 334, -756, -317, 306, 76, -263, 430, 639, -184, -941, 379, -458, 309, 148, -15, 283, 630, -362, 272, 796, 847, 31, 804, -783, 374, 990, -226, 183, 761, 809, 595, 390, 992, -975, -582, 692, 47, -134},
            {230, 104, 9, -433, 936, 322, -444, -184, 240, 542, 432, 47, -40, -454, -484, -754, 214, -837, -644, 796, -442, -949, -467, -203, -788, -653, 374, 278, -651, -885, 453, -134, 986, 608, 14, 478, 14, 947, -367, 889, -173, 566, 253, 98},
            {-921, 803, 610, 164, -591, 999, 524, -53, 221, 696, 834, 353, -45, -264, -990, -900, 519, -185, 51, -113, -738, -119, 556, 942, -532, -144, 510, -606, 922, -394, 179, 576, -194, 533, -935, 605, -822, 273, -392, 565, -53, 163, -731, -74},
            {-847, 42, -279, -533, -526, 223, 155, -811, 829, 1, -919, 340, 818, -692, 635, -532, -505, 834, 994, -203, -139, 199, -623, -257, -968, -949, 386, -683, 353, 904, 669, -768, -479, -513, 757, -618, 931, -149, -673, -25, 654, 426, 347, -918},
            {987, 939, 494, -471, 716, -919, -616, -480, 801, 510, -716, 187, -814, -484, 797, -963, -521, 650, 305, -20, 861, 709, 557, 267, -671, 277, 275, 657, -559, 236, -608, -1, -607, -641, 606, 759, -195, -68, 155, 927, -151, 206, -954, -256},
            {757, 416, 591, -620, -535, 571, 145, -163, 22, 829, -282, 352, 583, 620, 471, -942, 245, -976, -333, -858, -249, -709, -293, -482, -999, 493, 113, 897, 43, 968, 703, -285, 654, 531, -758, 403, -868, -338, 477, 274, 744, 167, -691, -992},
            {560, 503, 708, -911, 421, -205, 949, -81, 603, -231, 884, -572, -383, -172, -643, -691, -778, -248, -254, -360, 371, 283, -355, -990, 673, 27, -242, -450, -53, 360, -669, -633, 746, 123, -503, 86, -826, -102, -997, 4, -48, -836, -865, -436},
            {-438, 932, 161, -736, 465, 857, -538, -228, -189, -449, 880, 305, 671, -444, -310, 813, -511, 970, -143, 419, 475, 608, -351, -59, 425, -570, -226, -23, 551, 105, -684, 36, 774, 220, -31, -670, 143, 933, -176, 166, 367, 409, -381, -973},
            {272, 896, -555, 203, 1, -447, -76, -385, 684, -352, -209, 806, 752, 820, -905, -51, 444, -450, 313, -769, -398, -834, 373, 299, 847, -505, 549, 791, 989, 965, 767, 160, 880, -638, 490, -953, -359, -609, 866, -321, 766, -283, -956, 430},
            {-600, -183, 763, -562, -909, -256, 292, 934, -356, 116, -482, -905, 402, 690, -288, -263, -59, 297, 953, 712, -695, -60, -82, -662, 535, -569, 860, -80, 968, 612, -754, -864, 117, -953, 441, 155, 654, 454, 551, 671, 1, 851, -340, 381},
            {621, -986, -107, 416, 233, -539, 260, 285, 291, -976, -631, -366, 749, -86, -577, 750, 985, 748, -731, -670, 102, 461, -194, -502, 174, 615, -323, -104, -399, 552, -643, 570, -844, 668, -952, -974, 806, 764, 775, -198, -581, -121, 8, -968},
            {714, 791, 221, 984, 474, -172, -454, -588, -318, 927, -684, -345, 223, -40, -183, 504, 319, 647, 562, 319, 3, 455, -350, -193, 966, -596, 167, -18, -463, -558, -384, -415, 427, -564, -940, 883, 206, 510, -959, 41, 105, -213, -691, -190},
            {-234, -776, -388, 678, 405, 305, -469, -84, 130, -541, 50, -483, -853, -684, -201, -688, 959, -981, -470, -446, 236, -721, -401, -194, 140, 758, 342, 368, -136, -805, -718, 459, -984, 978, -497, 889, -130, 142, 42, 487, 120, 658, 711, 949},
            {653, -820, 458, 573, -713, -562, -630, 75, -199, -63, 718, 112, -369, -347, -756, -930, -926, -845, 408, 247, -836, 158, 301, 730, -344, -501, -909, -511, -499, 600, 928, 382, -913, -989, 813, 82, 375, -666, -598, 218, -813, 858, -207, -356},
            {447, 130, -923, -994, -388, 261, -321, 929, 604, -617, -90, -223, 100, 562, 446, 550, -339, -719, 360, 750, -660, -814, 818, 598, -110, -903, -649, -857, 793, 983, -866, -269, -462, -337, -551, 873, -446, -589, -448, 198, 583, -59, -23, -779},
            {-185, -685, -820, 924, -150, 636, 576, -859, 226, -731, -126, 394, -216, -472, 367, 597, 763, 149, -390, -313, 149, 15, -83, 195, 142, -389, -155, 416, 8, -540, 423, -450, -428, 291, -467, 371, -814, -903, 710, 598, -155, 987, -20, -958},
            {123, -688, 699, -64, 566, 382, -787, -173, -203, 25, 666, -143, 418, -707, -455, 123, 756, 325, -802, -859, -565, 599, 916, -899, -547, -571, -343, -146, 170, -132, -443, -806, -868, -386, 381, -953, 701, 672, -193, 52, 115, -358, 974, 624},
            {770, -100, 898, -842, 10, -650, 558, 228, -902, 503, -20, 103, 393, 167, 760, 753, -635, 785, -176, -188, 987, 290, -392, -150, 204, 864, 939, -572, 653, -677, 118, -543, -192, -105, -473, 50, 338, 105, -401, -135, 393, -959, -885, -886},
            {824, 884, -263, -471, -212, 500, 940, 371, -744, 560, 262, -466, 631, -756, 746, -12, 858, 886, 560, -292, -753, -412, -133, -172, 196, 321, -453, 349, 938, 268, 156, 193, -953, 967, -231, -690, -559, 358, 968, -950, -471, -420, -395, -862},
            {850, -608, -244, 199, 736, -452, 59, 808, -820, -527, -993, 83, 147, -250, -885, -369, -447, 101, 999, 67, -607, -922, 124, -161, 174, 40, 301, -502, -921, 748, 10, -141, -957, 639, 769, 743, 346, 206, 502, 33, 456, 54, -887, -595},
            {-796, -846, 908, -716, -886, -329, 1, 375, -644, -820, -844, -988, 81, 119, 921, -128, -843, -550, -856, 313, -199, 357, 633, -254, 474, 764, 957, 427, -319, -264, -943, 59, 699, -240, 604, 610, 811, 625, 732, 600, -55, 160, -757, 666},
            {120, 531, 417, -402, 825, 22, -633, -227, 838, 89, 596, 345, 362, 263, 58, 422, -363, 877, 378, -193, 115, 341, -802, 858, -257, 193, -167, -788, -13, -490, -422, 817, -503, 357, -640, -171, -723, -274, -381, -184, 81, -866, -425, -869},
            {-354, -815, 405, -540, -489, 34, -565, -129, 157, -831, -328, -601, 330, 691, -36, -581, 888, -652, 498, 916, -83, 794, -902, 498, 699, -160, 258, 706, 24, 859, -234, -647, 881, -60, -156, -370, -709, 28, 712, 249, -607, -523, 682, 501},
            {-762, 710, -941, 703, 879, -505, -488, 587, -944, 791, -9, -836, 138, 56, 119, -538, -107, 38, -983, -681, -489, 139, 409, -828, -650, 649, 121, -55, 978, -720, 803, 488, -337, -762, -539, 18, 56, 767, 27, 409, -685, 867, -465, 684},
            {-511, -440, -823, 827, -339, -14, -193, -143, -528, -540, 314, 361, -567, 482, 864, -995, 412, -724, 641, -773, -744, -746, -83, -783, -152, 611, -777, 925, -896, 724, -610, -496, -934, 691, 839, 306, 522, 610, -913, -16, 871, -900, 234, -760},
            {-568, -352, 14, 497, -491, 594, 659, 782, -483, -948, -428, -25, 415, -574, 163, -724, -347, 625, 398, 162, -832, 788, 377, -776, -72, 308, 668, 325, 112, 963, 408, -660, -32, 571, -219, 149, -860, 866, -50, 718, 340, 17, 913, -802},
            {879, 68, 908, -18, -529, 955, -997, 457, 100, -39, 648, -92, 55, -544, -74, 274, 248, 161, -900, 667, 204, -251, 419, -81, -202, 31, 838, 71, -183, -104, 103, 427, -47, -591, 170, 34, -327, 884, -90, 719, -909, 705, -399, 192},
            {-309, -575, 133, -561, 846, -146, -826, -355, 971, 736, -24, -80, 792, 762, 21, -340, 889, -350, 242, 834, 669, -486, 665, -953, 323, -963, 434, 123, -409, -150, 556, -538, 251, -610, 726, 399, 260, -283, 415, 15, 827, 793, 651, 797},
            {483, 839, -591, -350, -788, 231, 288, -161, -756, 969, 70, -588, -536, -702, 234, -777, -552, 967, 288, -394, -521, -969, 279, -648, 515, 270, -627, -1, 824, 110, 803, -729, 310, -251, -946, -906, -658, -889, 275, 946, 600, -263, 208, -688},
            {-738, 999, -181, -14, -285, -516, -281, -614, 678, -93, 970, -148, 622, 426, 520, -448, 463, 657, 849, -378, 756, 454, 811, -796, 780, 319, -710, -191, -307, 183, -37, -407, -301, 752, 800, -486, -222, -866, 614, -957, 834, 542, 259, 592},
            {-201, -10, -523, 61, -417, -670, -536, -298, 549, 984, 722, -394, 879, 240, -823, -457, -839, -24, -299, 252, -683, -369, -994, 99, 788, -989, -98, -824, 263, -59, 53, -53, -328, -165, -943, -639, -343, -230, 33, 57, -847, 128, -936, 398},
        };
        int[][] smer = {
            {0, 1, 3, 4, 1, 4, 1, 3, 3, 4, 1, 3, 4, 1, 1, 1, 3, 3, 3, 3, 4, 3, 3, 3, 3, 4, 3, 3, 4, 1, 1, 1, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 4, 1},
            {3, 2, 2, 4, 2, 1, 2, 1, 2, 3, 4, 2, 4, 3, 2, 3, 2, 3, 3, 4, 4, 2, 1, 1, 4, 4, 2, 4, 1, 3, 3, 2, 2, 1, 1, 1, 4, 1, 1, 4, 1, 2, 4, 2},
            {2, 3, 2, 4, 3, 4, 1, 2, 1, 2, 3, 2, 4, 2, 3, 2, 4, 1, 1, 1, 4, 3, 4, 2, 4, 4, 2, 3, 4, 2, 1, 4, 1, 1, 1, 1, 1, 4, 2, 1, 2, 1, 3, 4},
            {2, 2, 1, 4, 4, 1, 2, 1, 2, 2, 1, 1, 4, 2, 2, 3, 4, 3, 3, 4, 4, 2, 4, 2, 4, 3, 2, 4, 3, 4, 2, 1, 3, 3, 4, 3, 3, 4, 1, 1, 1, 2, 2, 4},
            {2, 1, 1, 4, 3, 3, 3, 4, 2, 2, 4, 1, 1, 3, 2, 2, 4, 2, 4, 1, 4, 2, 3, 2, 4, 3, 4, 1, 1, 3, 3, 4, 2, 1, 3, 2, 1, 4, 3, 2, 3, 2, 2, 4},
            {4, 1, 2, 4, 2, 1, 4, 3, 2, 2, 4, 3, 3, 2, 4, 2, 4, 2, 4, 2, 4, 2, 1, 3, 3, 2, 4, 3, 2, 1, 1, 3, 4, 2, 4, 1, 4, 1, 2, 4, 2, 4, 1, 1},
            {4, 3, 2, 3, 4, 2, 4, 1, 4, 1, 4, 2, 3, 4, 3, 2, 3, 2, 4, 2, 3, 4, 2, 1, 1, 1, 4, 2, 4, 4, 1, 1, 1, 4, 1, 2, 4, 4, 2, 4, 2, 4, 3, 2},
            {3, 2, 3, 4, 1, 2, 1, 2, 1, 2, 3, 2, 1, 3, 2, 1, 1, 4, 3, 3, 4, 4, 3, 4, 1, 2, 4, 2, 1, 4, 3, 4, 1, 1, 3, 2, 4, 3, 2, 1, 2, 3, 3, 4},
            {2, 4, 1, 3, 4, 4, 1, 3, 4, 2, 1, 1, 2, 2, 4, 1, 2, 3, 4, 1, 4, 3, 2, 3, 3, 2, 4, 3, 2, 4, 2, 4, 2, 3, 4, 2, 1, 2, 3, 3, 2, 2, 1, 4},
            {2, 1, 2, 1, 1, 4, 3, 2, 4, 1, 3, 2, 2, 2, 4, 2, 2, 1, 1, 2, 3, 4, 1, 1, 4, 1, 1, 2, 1, 3, 4, 3, 3, 2, 4, 4, 3, 2, 2, 3, 4, 1, 4, 1},
            {4, 1, 1, 3, 3, 3, 2, 4, 3, 3, 2, 4, 2, 1, 1, 2, 1, 3, 4, 2, 1, 4, 3, 2, 1, 4, 1, 1, 1, 1, 4, 2, 1, 1, 4, 3, 2, 1, 2, 1, 1, 2, 4, 2},
            {3, 3, 4, 2, 3, 4, 1, 3, 4, 1, 3, 3, 4, 1, 1, 1, 2, 1, 4, 1, 2, 3, 3, 4, 2, 3, 3, 3, 4, 2, 1, 4, 1, 2, 3, 3, 4, 2, 1, 1, 3, 2, 3, 4},
            {2, 4, 3, 2, 2, 3, 3, 2, 4, 2, 2, 1, 3, 3, 3, 4, 3, 2, 4, 2, 2, 3, 4, 3, 3, 4, 1, 4, 4, 3, 4, 4, 3, 2, 3, 4, 3, 3, 4, 3, 2, 3, 2, 4},
            {2, 4, 1, 1, 2, 4, 1, 4, 1, 2, 1, 2, 1, 4, 1, 3, 2, 3, 3, 3, 2, 4, 1, 1, 4, 1, 2, 1, 3, 2, 4, 4, 2, 3, 2, 3, 3, 4, 3, 2, 4, 1, 1, 1},
            {2, 1, 4, 2, 2, 1, 2, 4, 3, 3, 3, 4, 2, 4, 2, 3, 3, 2, 1, 1, 1, 1, 4, 2, 3, 4, 3, 2, 4, 1, 4, 3, 2, 1, 1, 1, 1, 1, 1, 4, 1, 3, 3, 2},
            {4, 3, 3, 2, 3, 3, 2, 4, 2, 1, 4, 4, 2, 4, 2, 4, 1, 1, 3, 4, 1, 1, 3, 2, 4, 4, 3, 4, 4, 2, 1, 2, 3, 3, 3, 3, 3, 4, 2, 1, 4, 2, 1, 1},
            {3, 2, 4, 1, 1, 1, 1, 4, 3, 2, 4, 3, 2, 4, 2, 1, 4, 2, 1, 4, 3, 2, 2, 1, 1, 3, 2, 4, 3, 3, 4, 2, 2, 1, 1, 4, 1, 1, 4, 1, 1, 1, 1, 2},
            {2, 1, 1, 4, 1, 1, 2, 4, 2, 4, 1, 1, 3, 4, 3, 4, 1, 1, 2, 4, 2, 1, 3, 3, 2, 4, 1, 1, 3, 4, 3, 3, 4, 1, 2, 3, 4, 4, 1, 3, 3, 4, 3, 2},
            {4, 3, 3, 3, 3, 4, 2, 4, 2, 1, 4, 2, 2, 3, 4, 4, 3, 4, 2, 4, 2, 3, 2, 1, 4, 1, 4, 2, 4, 1, 4, 1, 4, 2, 2, 4, 1, 4, 2, 2, 4, 1, 2, 4},
            {3, 2, 3, 4, 1, 3, 2, 4, 1, 3, 3, 2, 2, 1, 4, 3, 2, 3, 2, 4, 3, 2, 4, 1, 1, 3, 4, 2, 1, 2, 3, 4, 3, 3, 2, 4, 3, 3, 3, 2, 3, 4, 2, 4},
            {2, 1, 4, 1, 2, 3, 3, 4, 2, 2, 4, 1, 1, 1, 3, 4, 2, 3, 3, 3, 2, 1, 4, 3, 3, 4, 3, 3, 3, 2, 2, 4, 3, 3, 4, 4, 2, 1, 1, 1, 1, 4, 2, 4},
            {3, 2, 4, 4, 2, 1, 1, 3, 3, 2, 4, 4, 1, 2, 2, 4, 2, 1, 1, 1, 3, 2, 3, 2, 1, 4, 2, 3, 4, 1, 2, 3, 2, 4, 1, 3, 4, 3, 4, 1, 2, 3, 2, 4},
            {2, 1, 4, 3, 3, 3, 2, 2, 4, 1, 4, 3, 4, 2, 1, 1, 3, 4, 1, 2, 2, 1, 4, 4, 1, 1, 2, 4, 1, 2, 1, 1, 1, 4, 4, 1, 1, 2, 4, 3, 2, 3, 3, 4},
            {3, 2, 4, 2, 1, 3, 3, 2, 4, 2, 1, 2, 3, 3, 3, 3, 2, 3, 3, 2, 3, 2, 1, 3, 4, 4, 2, 3, 3, 4, 4, 1, 2, 1, 3, 3, 4, 2, 3, 2, 1, 1, 4, 1},
            {2, 1, 4, 4, 2, 1, 2, 1, 4, 4, 1, 2, 1, 1, 4, 1, 1, 4, 1, 4, 1, 1, 1, 4, 1, 3, 2, 1, 1, 4, 4, 2, 1, 2, 3, 4, 3, 4, 2, 3, 4, 2, 4, 2},
            {3, 2, 4, 3, 4, 2, 4, 2, 1, 3, 4, 1, 1, 2, 3, 4, 2, 1, 2, 1, 3, 3, 2, 1, 2, 4, 1, 3, 2, 1, 4, 2, 3, 2, 2, 4, 1, 4, 3, 2, 4, 2, 4, 2},
            {2, 4, 1, 2, 3, 2, 4, 1, 3, 2, 4, 3, 2, 2, 2, 4, 3, 3, 3, 3, 3, 3, 4, 4, 1, 1, 2, 1, 1, 1, 3, 3, 2, 1, 1, 1, 2, 4, 2, 1, 4, 2, 3, 4},
            {2, 4, 4, 2, 3, 3, 3, 3, 2, 4, 3, 3, 3, 2, 2, 4, 2, 1, 1, 4, 4, 1, 1, 3, 4, 3, 3, 3, 3, 2, 1, 1, 1, 4, 1, 1, 1, 1, 3, 2, 4, 2, 1, 4},
            {2, 1, 4, 2, 1, 2, 1, 1, 1, 1, 3, 4, 1, 1, 2, 3, 3, 4, 2, 4, 4, 2, 4, 1, 1, 2, 3, 3, 4, 3, 3, 3, 2, 3, 3, 3, 4, 2, 2, 4, 4, 3, 2, 4},
            {4, 3, 3, 3, 2, 4, 1, 3, 4, 2, 1, 3, 3, 3, 2, 4, 1, 3, 2, 4, 4, 2, 3, 3, 3, 3, 2, 4, 4, 3, 4, 2, 1, 2, 1, 1, 4, 2, 2, 4, 3, 4, 2, 4},
            {3, 2, 3, 4, 1, 1, 2, 1, 1, 3, 2, 2, 1, 1, 3, 4, 4, 1, 2, 1, 4, 4, 1, 1, 2, 3, 4, 1, 4, 2, 4, 4, 2, 4, 1, 1, 1, 2, 2, 1, 4, 1, 2, 4},
            {2, 4, 1, 4, 3, 2, 3, 3, 4, 2, 1, 4, 1, 2, 1, 4, 4, 2, 1, 4, 1, 3, 4, 2, 2, 1, 1, 2, 4, 2, 4, 4, 2, 4, 3, 2, 3, 3, 2, 4, 1, 4, 2, 4},
            {2, 1, 2, 3, 4, 2, 2, 4, 4, 1, 2, 4, 3, 4, 2, 1, 3, 4, 2, 1, 4, 1, 1, 2, 1, 2, 4, 1, 4, 2, 4, 3, 2, 1, 2, 3, 2, 4, 4, 1, 3, 3, 2, 4},
            {4, 1, 2, 1, 3, 4, 2, 4, 4, 2, 2, 3, 2, 4, 1, 2, 4, 3, 3, 4, 4, 3, 3, 3, 2, 1, 1, 2, 4, 2, 4, 3, 4, 2, 3, 2, 1, 1, 4, 4, 2, 3, 3, 4},
            {4, 2, 3, 2, 4, 1, 2, 1, 4, 2, 2, 4, 1, 4, 3, 2, 4, 4, 1, 1, 4, 3, 4, 3, 3, 4, 3, 2, 3, 2, 3, 2, 3, 3, 2, 4, 1, 4, 1, 4, 2, 2, 4, 1},
            {4, 2, 2, 3, 3, 3, 2, 4, 1, 2, 2, 1, 2, 3, 2, 1, 1, 3, 4, 2, 4, 2, 4, 2, 4, 3, 4, 2, 2, 4, 1, 2, 1, 4, 1, 4, 2, 1, 3, 3, 2, 1, 1, 2},
            {4, 3, 2, 2, 4, 1, 1, 3, 3, 3, 4, 1, 2, 2, 4, 1, 2, 4, 1, 4, 1, 2, 4, 2, 1, 4, 4, 2, 2, 4, 2, 1, 2, 1, 4, 1, 2, 3, 3, 4, 3, 3, 3, 4},
            {4, 2, 1, 1, 3, 4, 2, 1, 1, 1, 3, 3, 2, 4, 1, 2, 1, 1, 4, 1, 3, 2, 4, 1, 2, 1, 4, 2, 1, 1, 3, 2, 4, 1, 3, 3, 4, 2, 4, 3, 2, 1, 4, 1},
            {4, 1, 3, 2, 2, 4, 4, 1, 4, 2, 1, 1, 2, 4, 4, 3, 3, 2, 3, 4, 2, 1, 3, 3, 3, 2, 3, 3, 4, 4, 2, 1, 4, 2, 1, 1, 4, 2, 4, 1, 1, 4, 1, 2},
            {4, 2, 2, 1, 4, 1, 4, 2, 1, 1, 1, 2, 2, 1, 4, 2, 1, 1, 1, 3, 2, 4, 1, 4, 1, 2, 1, 1, 4, 3, 4, 2, 1, 4, 1, 2, 3, 2, 1, 2, 4, 1, 4, 2},
            {3, 3, 3, 2, 4, 4, 1, 3, 3, 4, 2, 2, 1, 3, 3, 3, 3, 3, 2, 1, 1, 4, 2, 1, 2, 1, 2, 4, 1, 2, 4, 3, 3, 3, 3, 2, 2, 4, 1, 2, 4, 3, 3, 2},
            {2, 4, 1, 1, 4, 3, 4, 2, 4, 3, 3, 3, 2, 2, 1, 1, 1, 1, 4, 1, 2, 3, 4, 3, 3, 2, 1, 1, 3, 4, 1, 2, 3, 4, 1, 3, 4, 1, 2, 2, 4, 2, 3, 4},
            {2, 3, 4, 2, 1, 2, 3, 2, 4, 3, 4, 3, 3, 4, 2, 4, 1, 1, 1, 2, 1, 1, 3, 3, 3, 3, 3, 3, 4, 4, 3, 2, 4, 1, 2, 1, 4, 4, 2, 2, 4, 2, 1, 1},
            {2, 4, 1, 3, 3, 2, 3, 3, 3, 2, 3, 2, 1, 3, 2, 3, 4, 3, 4, 1, 1, 2, 4, 1, 2, 1, 1, 4, 1, 4, 2, 1, 4, 3, 3, 2, 4, 4, 2, 2, 4, 4, 1, 2},
            {2, 1, 4, 2, 4, 1, 2, 1, 1, 4, 1, 4, 1, 4, 1, 1, 1, 2, 3, 4, 2, 2, 4, 2, 4, 1, 1, 4, 3, 3, 3, 2, 4, 2, 1, 3, 4, 4, 2, 1, 1, 3, 4, 2},
            {3, 3, 3, 2, 1, 2, 1, 1, 1, 1, 2, 1, 2, 1, 3, 3, 3, 2, 1, 3, 3, 2, 1, 2, 1, 3, 2, 1, 2, 1, 1, 1, 1, 3, 2, 1, 1, 3, 3, 3, 3, 2, 3, 2},
        };

        int[][] dejanske = Druga.visine(rel, smer);
        System.out.println(Arrays.deepToString(dejanske));
    }
}
