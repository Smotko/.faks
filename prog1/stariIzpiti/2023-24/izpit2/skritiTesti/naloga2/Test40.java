
import java.util.*;

public class Test40 {

    public static void main(String[] args) {
        int[][] rel = {
            {0, 178, -640, -116, 590, -303, -406, -241, -872, -129, -551, 795, 635, -341, -238, 877, -29, 699, 232, 386, 368, -562, 400, 512, 303, -62, -702, 53, -699, 910, 214, -985, -104, 277, 897, 966, -69, 681, -381, 11, 79, 829, -503},
            {-32, 630, 85, -61, -128, -229, 38, 412, 129, -172, -914, 979, 435, 569, -786, 882, 137, 813, -645, -895, 808, -680, 463, -165, 398, -148, 937, -52, -293, -726, -60, 962, 215, -796, -122, -38, 507, 533, -498, -208, -127, 455, -264},
            {524, 816, 809, -986, -751, 915, 487, 175, -57, -925, -95, -208, -139, -751, -813, -615, -909, -676, -610, -175, -320, -102, -939, 230, 987, -320, 296, -268, 580, -408, -640, 189, -981, 739, 403, 537, -755, -819, 50, 974, 499, 472, 502},
            {662, 409, 910, -749, -739, 423, -333, -154, 76, -270, 692, -235, -458, -560, -282, -965, -909, 569, 680, 7, 114, 24, 340, -857, -992, 178, 420, 229, 504, 259, -371, -623, 739, 925, -149, -687, 551, -886, 933, 512, 471, 625, -671},
            {618, -961, 124, 417, -194, -241, -555, 472, 43, -839, -329, 446, -8, 561, 692, -634, -569, -250, -285, -345, -389, 247, -307, 465, 494, -762, -539, -676, 552, 820, 353, 669, -475, -135, -281, -892, -903, 55, -691, -700, 729, -49, -432},
            {-470, 683, -310, -609, 224, -175, -988, 809, 764, 709, -861, 476, 799, -780, -742, 59, 178, -680, 531, 923, 607, 350, 191, 689, 369, -102, -452, -736, 577, 504, 103, -392, 156, -619, -734, -613, 874, 19, -624, -123, 445, -96, -895},
            {-520, 801, 592, 563, 821, -399, 617, -337, -362, 556, -901, -705, -428, 213, -647, 277, -337, -751, -32, 247, 888, 112, -421, -10, 950, 351, -832, 951, 665, -986, -915, -138, -28, 863, 944, 787, 762, 756, -376, -311, 327, -136, 121},
            {665, 24, 693, 138, 282, 633, 477, 27, -492, -72, -763, 50, 154, -711, 453, -643, 963, 603, -295, -648, -418, 605, -703, 363, -144, -495, 253, -305, 346, -672, -3, -673, -64, -164, -350, 372, 243, -932, 423, 502, 141, -551, -954},
            {-77, -586, -136, 621, -467, -631, 658, -985, 661, 901, 977, -795, -693, 859, 569, -75, -677, 518, 558, 366, 975, 568, 547, -609, 94, -671, -524, 497, -848, 542, -693, 411, 984, 868, -174, -822, -252, -602, -224, -680, 658, 97, -471},
            {439, -656, 224, 450, 537, -999, 606, -630, 664, 981, -853, -496, 384, 841, -172, -63, -664, 908, 530, -182, 498, -308, -127, -456, -712, 509, -923, 843, -183, 329, 964, -536, 460, 391, -484, 341, 985, 879, 524, 576, -585, 665, -623},
            {267, 714, 353, 810, -68, 976, -206, 932, 789, 117, 211, 734, 405, -743, 656, 31, 659, -87, -654, 516, 853, -777, 704, 446, 402, 705, -677, -78, -218, 397, -424, -249, 508, 719, 85, 538, 444, 216, 69, -302, 952, 423, -974},
            {-414, 845, -612, 762, 798, -12, 975, 589, 829, 648, -576, 299, -437, 275, 943, -955, 568, 209, -77, -138, -777, 35, -629, -488, -366, -940, 651, -407, 841, -775, -368, -43, 179, -516, -651, -784, -305, -692, 854, 793, 587, 441, -191},
            {-400, 411, 965, -682, -850, -413, 107, 856, -42, -249, 178, -7, -84, 578, -246, -591, -335, -37, -306, -893, 181, -239, -803, 274, -286, 164, -403, -578, 479, 590, 428, 764, -915, -980, -814, 43, -181, -529, -432, -981, 744, 291, 356},
            {-694, -633, -353, 494, -912, -80, 978, 402, 829, 55, 383, -533, -218, 427, 479, 831, 462, 466, 552, -866, 1000, 725, 418, -615, -178, -42, 391, -353, -450, 797, 790, -555, -91, -404, -592, 409, -684, 853, 969, -569, -391, 209, -343},
            {-984, -713, -284, 302, 865, -855, -715, 898, -428, 692, -13, -573, 925, -247, 537, -10, -348, -402, -757, 864, 940, -20, 993, -427, -717, 339, -307, -875, -862, 424, -313, -890, 818, 439, 525, -439, 73, 427, 39, 605, 558, -920, -639},
            {-236, -345, -44, 761, 577, -967, 802, -75, -801, 777, 497, -889, -160, 413, -678, 503, -541, -56, -80, 853, 282, 613, -489, 904, 217, 442, -33, -888, -26, -208, -223, -141, 828, -529, 500, -816, 767, 441, 872, -27, 867, 443, 489},
            {520, 839, -349, -102, -53, 324, 575, -653, -178, 443, 168, 347, 955, -660, -119, 894, -120, -587, -42, 668, 985, 925, -628, -299, 241, -938, 994, 582, -908, 765, -432, 702, 22, -267, -759, 304, -474, 869, 274, -638, -580, -452, -141},
            {-20, -478, 94, 251, -360, 742, 43, -352, 748, -3, 24, 934, -487, -609, -450, -97, -189, 851, 248, 502, 522, -735, 148, 756, -649, 812, 650, -517, 784, -47, -811, 951, 6, 857, 319, -542, -775, 382, 954, -55, 60, -936, 496},
            {595, -450, -417, 271, -26, 925, 325, -169, -64, 495, 720, -959, -918, 153, 368, -471, -487, -984, 254, 366, -807, 253, -990, -33, 335, 69, -537, -866, -473, -127, 968, -483, -292, 767, -412, -294, 54, -573, -175, 816, 125, 645, 617},
            {-790, -528, 767, -723, 510, -556, -431, -589, 212, 792, -718, -580, -132, -733, -708, -128, 56, 373, -368, -423, -610, -922, 870, -678, 40, -804, -410, 447, 478, 809, 21, 781, 899, 269, 799, 241, -723, 592, -950, 91, 233, -691, 430},
            {-117, -300, 679, -469, -915, -65, -46, -317, 632, -339, 712, -505, 585, 836, -827, 525, 70, 459, 852, -491, 475, 923, 42, 312, 565, 494, 540, -488, 204, -832, 266, -102, 611, 261, 123, 804, -816, 361, 670, -685, 149, -898, -139},
            {-44, 511, -962, 235, 770, -312, -389, -587, -506, -807, 590, 953, -663, -990, -838, -336, -771, 548, 79, -387, -179, 520, -866, -718, 435, 276, 486, -696, 360, -567, 507, -346, -390, 638, -573, -151, 869, 713, 114, -618, 649, -343, 582},
            {-34, -314, -198, -134, -5, -63, 223, -195, -429, -101, -782, -650, -765, 220, -446, 433, 128, 98, 966, 246, -260, 932, 961, 502, 297, -504, 442, -974, 346, 152, 46, -359, -34, -704, 124, -682, 486, -222, -590, 892, 365, 682, 442},
            {-506, 798, 835, 45, -512, 586, -730, 591, 523, 627, 954, -790, -209, 59, -853, -12, -988, 900, 380, -432, 562, 180, -281, 924, 854, 122, -662, -493, 790, 132, -545, -417, -463, -715, 11, -745, -458, 649, 444, -799, -912, -221, -426},
            {-894, -46, 316, -479, 469, 192, 42, -243, -724, -180, 641, -639, -11, -506, -378, 557, 762, 974, -449, 512, -128, -614, 492, -93, 519, 474, -823, 731, -380, 345, -862, -255, -871, 7, -902, 424, -79, 212, -935, -2, 305, -852, -39},
            {529, 936, -355, -700, 669, 783, 161, -14, 745, 831, 993, -362, 153, -134, -974, -484, -236, 114, 697, 315, -864, -940, 46, 877, 574, 555, -117, 656, 500, 753, -871, -915, 236, 394, 432, 413, 523, -524, 883, -637, 833, 179, -413},
            {-653, 779, -352, 30, -182, -936, -413, -962, 527, -379, -814, -126, -333, -397, 77, -922, 670, 257, 759, -44, 442, -490, -959, -675, 992, -220, 657, -241, 183, -745, 118, -293, -888, 263, 667, 740, 864, 680, 646, 997, 616, 654, 813},
            {367, -239, -423, 967, -637, 196, 423, 217, 613, 898, -58, -808, -382, 901, -919, 872, -977, -860, -439, -432, 137, 614, 236, -150, -227, -559, -771, 654, -204, -101, -860, -387, -669, -633, -227, 871, 935, -846, -367, 231, -623, -9, -354},
            {296, 253, 597, 66, -134, -601, -387, -120, 929, 587, 410, 430, 917, 475, -964, 39, -685, -75, 732, 789, 923, -156, -262, -743, 809, -585, 793, -432, 451, -496, -798, -404, 423, -535, -971, 425, 904, 95, 788, 83, -596, 113, -80},
            {-528, -626, -814, -6, -970, -644, 783, 165, -13, -66, 371, 184, -991, -723, -729, -24, 34, 18, 720, 912, -606, 206, -942, 196, 546, -350, -656, -7, 566, -171, -856, 673, -18, 837, -326, 401, -771, -931, 241, -321, 788, -65, 766},
            {-351, 748, 967, 857, 446, 948, -501, -804, 859, 94, 618, -462, -748, -850, -247, 485, -161, 519, 55, 425, 679, 545, 251, -933, 786, 914, -141, -170, -198, 45, 62, 148, 206, -59, 265, 386, 30, -982, 159, -834, -88, -310, -92},
            {314, 762, 809, -414, -169, -956, -126, 612, -302, -156, 780, -447, -571, 515, -50, -989, 810, 56, 914, 920, -904, 136, 7, -413, 843, -295, -928, -378, 0, -170, 842, -770, 967, 306, 330, -88, 4, 604, 981, 37, -521, 276, 132},
            {-3, -584, 275, 500, -53, 945, -845, -486, -959, -853, -207, -835, 213, -581, -346, 151, -113, 481, 578, -24, 63, 74, 577, 847, 135, 436, 433, -599, -886, 362, 296, -894, 226, 791, -347, -819, -11, 140, -330, -658, -152, 834, 361},
            {55, -506, 964, -690, 813, 492, -520, -841, -567, -1, -596, 94, 127, 116, -130, 360, -499, 817, -715, 146, -264, 874, -832, 997, 556, 698, -337, 628, -757, 259, -236, 808, -295, 553, 902, -368, 661, 882, -212, 867, 407, -82, -594},
            {376, -600, -897, -111, -442, -399, 206, -556, 975, -867, -906, 752, -593, -957, -114, -990, -848, 667, -478, -142, -697, 423, -548, -902, 95, -876, 699, 838, 180, 792, -246, 381, 685, 213, -781, 730, 236, -24, -139, 192, -359, -746, -910},
            {-365, -897, -902, 519, 137, -450, 824, -92, -93, 887, 998, -265, 512, -326, 499, -75, -333, 710, -190, 758, -823, -654, 849, 732, -666, 469, -659, 11, -186, 547, -956, -148, -781, 802, -971, -209, -29, -872, -483, 249, -575, -67, 284},
            {-246, -934, 424, 196, 808, 140, -629, 200, -954, 104, -369, -696, 203, 995, 416, -303, 545, -858, 344, 147, 171, -209, -21, 904, -851, 558, 109, 109, 456, -589, -295, 193, 236, -89, -133, -277, -949, -804, 648, -590, -791, 611, 732},
            {43, 792, 624, -688, -241, -585, 461, 114, 899, 19, 195, -247, -463, -580, -688, 92, 260, -926, 69, 239, 877, 60, -483, -780, 931, 367, -563, -82, 850, 626, 191, -644, -112, -305, -30, -971, 201, 950, 713, 997, -897, 851, 135},
            {594, 333, 272, -996, 880, 342, 481, -574, 197, -397, -930, 845, 984, -296, 60, -242, -149, -485, -842, -595, -843, -762, -53, -67, 351, -233, -546, -421, 382, 326, 265, 737, -853, 956, 921, 883, 479, -235, -919, 959, -799, -226, -551},
            {678, 842, 302, -219, 503, 613, -301, 349, -317, -832, -978, 945, 345, 895, -705, -765, 272, -541, 232, -863, -985, -688, 377, 762, -280, 944, -82, 785, 526, -151, -384, 442, 43, 225, 363, -181, -903, -121, -60, 8, 37, -372, -542},
            {-957, 646, 390, -327, -61, 132, 478, -696, -468, -271, 470, 823, 658, 361, -731, -922, 865, -217, 459, -486, -412, 75, 866, -453, 1, -504, 641, 810, -679, 808, 149, -514, 417, -719, 107, -136, -194, 319, 289, 840, 873, 358, -534},
            {591, -740, 55, 852, 435, -227, 538, 307, 201, -271, -432, -528, 616, 304, 194, -670, -279, -350, 207, -290, -539, -697, 163, 745, -273, -17, 993, -608, 182, -456, -392, -294, 470, -38, 373, 885, 692, -689, -415, 104, -489, -38, -668},
            {-875, -441, 433, -464, -444, -575, 78, -58, 996, 91, 7, 497, -744, 361, 853, 206, -776, 946, -526, 460, 201, 105, 67, -502, -173, 949, 124, -218, -202, -243, 58, 625, -962, -149, -469, -508, -614, -10, -54, 98, 796, -333, -780},
            {252, -107, 740, -654, 681, 788, -547, 615, 321, -8, 380, 399, 266, 46, -287, -713, 815, 239, 593, 706, 97, 69, 198, 122, 268, 329, -675, -123, 767, 643, -304, 61, 107, -523, 786, -272, 271, -665, 88, 187, -869, -831, 312},
            {537, -396, -58, 839, 803, -438, -222, -184, 245, -275, -837, -824, 459, -754, -142, 26, 173, 910, -461, 815, 265, -854, -36, -478, 695, 772, -583, -787, 172, 563, -18, -860, 734, 575, -926, 669, 103, -852, -560, 852, -524, -402, -25},
            {869, 568, -673, 495, 381, -21, -951, -498, -786, 570, 373, -142, -784, -242, -489, -581, 940, 711, -682, 37, -634, 357, 255, 125, -231, 869, -151, 742, 871, -81, 183, 455, 106, 258, 469, 967, 110, 697, 585, -479, 218, 519, 488},
            {-343, 714, -513, -310, -82, -256, 428, -938, 176, 595, -885, -685, 9, -282, -756, -633, -662, -249, 672, 924, 448, -761, -615, -425, 135, 779, -983, -53, -557, -118, -922, -964, 299, -715, 998, 483, -666, -459, -276, -918, -428, 22, -815},
        };
        int[][] smer = {
            {0, 4, 1, 1, 1, 4, 1, 1, 3, 3, 3, 3, 4, 1, 1, 1, 1, 1, 4, 1, 1, 3, 3, 4, 1, 1, 1, 1, 1, 3, 4, 1, 3, 3, 4, 1, 3, 3, 4, 1, 3, 3, 4},
            {2, 4, 3, 4, 2, 1, 4, 2, 2, 1, 1, 1, 4, 3, 3, 4, 4, 2, 3, 3, 3, 2, 1, 3, 3, 4, 3, 4, 2, 4, 1, 2, 1, 1, 4, 2, 1, 1, 1, 2, 1, 4, 1},
            {2, 1, 2, 3, 3, 3, 3, 2, 4, 2, 4, 1, 3, 2, 4, 1, 3, 2, 1, 2, 4, 1, 1, 1, 2, 4, 2, 4, 2, 1, 3, 4, 1, 2, 1, 4, 1, 4, 3, 4, 2, 3, 4},
            {3, 4, 2, 1, 1, 1, 3, 4, 3, 2, 4, 2, 1, 1, 3, 3, 3, 4, 2, 1, 1, 4, 1, 2, 1, 3, 2, 4, 4, 1, 2, 4, 2, 3, 4, 1, 2, 1, 2, 4, 2, 1, 1},
            {2, 3, 3, 4, 3, 2, 2, 4, 2, 1, 4, 3, 4, 2, 4, 1, 1, 4, 3, 3, 3, 4, 2, 1, 2, 2, 1, 4, 4, 3, 2, 4, 2, 1, 4, 3, 3, 4, 2, 4, 1, 1, 2},
            {2, 3, 4, 3, 2, 4, 1, 3, 3, 2, 3, 2, 4, 2, 4, 3, 2, 1, 2, 4, 1, 1, 4, 2, 2, 1, 1, 1, 4, 2, 4, 3, 4, 2, 4, 2, 4, 4, 2, 4, 3, 2, 2},
            {2, 1, 1, 4, 3, 4, 2, 1, 1, 2, 4, 1, 4, 2, 1, 3, 4, 3, 2, 3, 4, 3, 4, 2, 1, 1, 4, 1, 3, 2, 3, 4, 4, 2, 1, 2, 1, 3, 2, 4, 3, 3, 2},
            {4, 1, 2, 3, 2, 3, 4, 4, 2, 2, 3, 4, 3, 3, 3, 2, 3, 3, 3, 4, 3, 4, 3, 3, 4, 2, 1, 2, 1, 2, 1, 4, 3, 3, 3, 3, 2, 1, 4, 1, 2, 4, 1},
            {3, 4, 2, 1, 1, 4, 1, 3, 2, 2, 1, 1, 4, 4, 1, 1, 4, 1, 1, 1, 2, 4, 2, 1, 4, 1, 1, 1, 2, 1, 2, 1, 4, 1, 1, 2, 4, 1, 1, 2, 2, 1, 2},
            {2, 4, 1, 1, 2, 3, 3, 4, 2, 3, 3, 2, 1, 3, 4, 2, 4, 4, 3, 3, 4, 1, 3, 2, 4, 3, 4, 3, 3, 2, 3, 2, 4, 4, 2, 1, 1, 3, 2, 3, 3, 3, 2},
            {2, 4, 4, 2, 2, 1, 1, 4, 2, 1, 1, 1, 4, 1, 4, 2, 1, 3, 2, 4, 3, 3, 4, 4, 1, 2, 3, 2, 3, 3, 2, 1, 4, 3, 2, 3, 3, 3, 3, 2, 4, 1, 1},
            {4, 1, 3, 2, 3, 4, 2, 3, 4, 4, 1, 2, 4, 2, 3, 3, 4, 2, 1, 3, 4, 4, 1, 4, 2, 2, 4, 1, 1, 1, 3, 2, 3, 4, 3, 2, 3, 3, 3, 4, 1, 4, 2},
            {3, 4, 2, 3, 4, 1, 2, 1, 4, 3, 4, 2, 1, 2, 4, 1, 1, 3, 2, 2, 4, 3, 4, 3, 3, 2, 1, 3, 4, 2, 2, 1, 1, 4, 2, 4, 1, 1, 1, 4, 4, 1, 2},
            {4, 1, 2, 4, 1, 2, 3, 2, 3, 4, 3, 4, 1, 2, 3, 3, 4, 2, 3, 4, 1, 4, 4, 2, 3, 4, 3, 2, 4, 2, 1, 4, 1, 1, 2, 1, 4, 3, 2, 4, 3, 3, 2},
            {4, 3, 2, 1, 4, 2, 2, 1, 2, 4, 4, 1, 2, 2, 2, 4, 1, 2, 1, 1, 2, 1, 4, 2, 2, 4, 3, 4, 3, 3, 2, 1, 3, 2, 3, 4, 1, 2, 1, 1, 2, 3, 4},
            {3, 3, 4, 4, 1, 2, 4, 2, 1, 1, 3, 3, 4, 2, 1, 1, 4, 1, 3, 3, 2, 4, 1, 2, 2, 3, 2, 3, 3, 3, 3, 3, 4, 2, 4, 1, 3, 3, 3, 3, 2, 2, 4},
            {4, 1, 1, 4, 2, 2, 3, 3, 3, 3, 2, 1, 4, 1, 1, 1, 1, 2, 1, 1, 1, 4, 3, 2, 2, 1, 1, 1, 1, 1, 1, 4, 1, 2, 4, 2, 2, 1, 3, 3, 3, 4, 1},
            {4, 3, 4, 3, 3, 2, 1, 1, 1, 1, 1, 1, 4, 2, 3, 3, 3, 3, 3, 4, 2, 1, 2, 3, 4, 1, 3, 3, 3, 3, 2, 4, 3, 2, 4, 2, 1, 2, 1, 1, 1, 4, 2},
            {3, 4, 3, 2, 1, 3, 3, 3, 4, 4, 3, 2, 3, 4, 2, 1, 4, 4, 1, 1, 3, 2, 3, 2, 3, 4, 2, 1, 1, 4, 1, 4, 2, 4, 1, 3, 2, 1, 3, 4, 2, 1, 2},
            {4, 1, 3, 3, 3, 2, 4, 4, 1, 3, 2, 4, 1, 1, 3, 2, 1, 3, 4, 3, 2, 3, 2, 4, 1, 4, 3, 3, 2, 4, 2, 1, 2, 1, 2, 3, 3, 3, 2, 4, 1, 3, 2},
            {4, 2, 2, 1, 1, 4, 1, 3, 4, 2, 1, 4, 2, 3, 2, 4, 1, 2, 4, 2, 3, 2, 4, 1, 2, 3, 2, 4, 1, 3, 3, 3, 3, 3, 4, 2, 4, 1, 4, 1, 3, 2, 4},
            {3, 4, 1, 1, 2, 4, 4, 1, 4, 4, 2, 1, 3, 2, 4, 4, 2, 1, 4, 3, 2, 3, 3, 3, 4, 1, 3, 3, 3, 4, 3, 4, 3, 4, 3, 2, 3, 4, 4, 3, 2, 4, 1},
            {4, 1, 3, 3, 2, 4, 4, 2, 1, 4, 1, 2, 2, 1, 1, 3, 4, 2, 1, 2, 1, 2, 1, 1, 4, 3, 2, 3, 4, 3, 2, 3, 2, 3, 4, 1, 1, 1, 4, 2, 3, 3, 4},
            {4, 3, 2, 3, 3, 4, 4, 3, 3, 3, 3, 2, 4, 1, 2, 1, 3, 4, 2, 1, 2, 1, 1, 2, 3, 2, 1, 1, 1, 1, 1, 1, 1, 1, 3, 4, 4, 2, 3, 2, 2, 1, 4},
            {4, 2, 4, 1, 1, 1, 3, 3, 4, 2, 1, 1, 4, 3, 4, 2, 4, 4, 3, 2, 1, 4, 2, 4, 1, 1, 3, 3, 4, 2, 4, 1, 3, 2, 1, 4, 3, 2, 3, 4, 3, 2, 4},
            {3, 2, 4, 3, 4, 2, 1, 4, 4, 3, 4, 2, 4, 2, 4, 2, 4, 3, 4, 3, 2, 1, 2, 1, 4, 2, 4, 1, 1, 2, 4, 2, 1, 1, 1, 1, 2, 1, 1, 3, 2, 4, 1},
            {2, 1, 3, 2, 3, 4, 2, 1, 3, 4, 3, 2, 4, 2, 3, 2, 3, 4, 3, 4, 2, 3, 4, 3, 3, 2, 4, 2, 3, 2, 4, 3, 4, 3, 3, 4, 3, 3, 2, 2, 4, 4, 2},
            {4, 2, 1, 1, 2, 3, 3, 4, 1, 4, 2, 1, 1, 2, 4, 1, 2, 4, 4, 1, 2, 2, 3, 2, 3, 4, 3, 3, 2, 1, 3, 2, 4, 2, 4, 1, 2, 3, 4, 2, 1, 4, 2},
            {4, 1, 4, 2, 2, 1, 1, 4, 4, 1, 3, 3, 4, 2, 1, 2, 2, 4, 3, 3, 3, 2, 4, 1, 1, 1, 2, 1, 4, 1, 4, 1, 3, 4, 3, 3, 2, 2, 3, 2, 4, 1, 2},
            {4, 2, 1, 2, 2, 4, 1, 1, 4, 2, 2, 4, 3, 4, 1, 2, 2, 3, 3, 4, 1, 3, 4, 3, 3, 4, 3, 2, 4, 2, 4, 2, 1, 4, 2, 1, 1, 1, 2, 4, 4, 3, 2},
            {3, 4, 2, 2, 4, 1, 3, 2, 3, 4, 2, 1, 1, 3, 4, 2, 1, 1, 1, 1, 2, 2, 4, 2, 4, 3, 2, 1, 4, 2, 1, 3, 2, 1, 4, 3, 3, 2, 2, 4, 4, 3, 4},
            {2, 4, 2, 2, 3, 3, 4, 2, 1, 3, 3, 3, 2, 4, 4, 1, 1, 3, 3, 4, 2, 4, 1, 2, 1, 4, 1, 2, 3, 3, 3, 4, 3, 4, 1, 2, 1, 1, 2, 1, 3, 2, 4},
            {2, 3, 4, 2, 1, 1, 3, 3, 3, 3, 4, 1, 1, 1, 4, 3, 3, 2, 4, 4, 2, 3, 3, 2, 4, 1, 2, 1, 1, 1, 1, 4, 2, 4, 2, 1, 1, 2, 1, 2, 1, 4, 1},
            {2, 1, 4, 3, 3, 2, 4, 1, 1, 1, 3, 4, 3, 2, 4, 2, 3, 4, 1, 3, 2, 2, 1, 1, 3, 4, 3, 2, 3, 4, 2, 3, 4, 3, 4, 3, 2, 1, 2, 3, 2, 4, 2},
            {2, 4, 1, 2, 3, 4, 1, 3, 4, 2, 1, 4, 2, 1, 3, 2, 2, 3, 3, 3, 4, 1, 1, 1, 1, 1, 2, 1, 2, 4, 2, 1, 1, 2, 3, 3, 3, 3, 2, 4, 1, 4, 2},
            {4, 1, 2, 2, 1, 4, 3, 2, 3, 3, 2, 1, 3, 2, 4, 1, 2, 4, 1, 1, 1, 2, 3, 3, 3, 3, 3, 3, 2, 4, 3, 4, 1, 2, 1, 1, 4, 1, 1, 4, 2, 1, 2},
            {4, 3, 3, 3, 2, 4, 3, 3, 3, 4, 4, 1, 2, 1, 3, 3, 2, 4, 3, 3, 4, 2, 2, 1, 1, 1, 4, 1, 1, 4, 4, 1, 2, 4, 3, 2, 4, 4, 2, 1, 3, 4, 2},
            {4, 2, 1, 3, 4, 3, 2, 4, 1, 1, 3, 4, 1, 2, 1, 2, 4, 4, 2, 1, 4, 3, 4, 1, 3, 2, 1, 3, 2, 4, 3, 4, 2, 1, 2, 4, 1, 3, 3, 4, 2, 4, 2},
            {4, 3, 2, 2, 3, 2, 4, 1, 3, 4, 1, 1, 2, 3, 2, 2, 4, 4, 1, 2, 3, 2, 3, 3, 2, 4, 1, 1, 1, 1, 2, 4, 3, 3, 2, 3, 4, 4, 1, 1, 2, 4, 2},
            {3, 2, 3, 2, 1, 1, 4, 4, 1, 1, 2, 3, 3, 2, 3, 2, 1, 4, 2, 2, 3, 4, 1, 1, 1, 3, 4, 3, 4, 3, 2, 4, 2, 1, 4, 1, 4, 3, 4, 2, 2, 3, 2},
            {2, 4, 1, 1, 3, 2, 4, 3, 3, 3, 3, 2, 4, 1, 1, 1, 2, 4, 2, 2, 1, 1, 3, 3, 2, 4, 1, 2, 4, 2, 4, 4, 1, 2, 1, 2, 4, 2, 4, 2, 2, 4, 1},
            {2, 1, 4, 2, 2, 1, 3, 3, 4, 2, 1, 1, 4, 3, 4, 2, 1, 3, 3, 2, 4, 1, 4, 1, 2, 4, 3, 4, 3, 2, 1, 4, 2, 3, 4, 2, 1, 2, 3, 4, 2, 3, 4},
            {3, 4, 1, 2, 1, 1, 4, 1, 3, 4, 4, 2, 3, 2, 4, 4, 2, 1, 1, 1, 4, 2, 1, 2, 1, 4, 2, 3, 3, 4, 2, 3, 4, 2, 3, 3, 3, 2, 1, 4, 2, 1, 1},
            {4, 1, 2, 1, 1, 2, 1, 2, 2, 4, 4, 2, 2, 1, 4, 3, 3, 4, 3, 2, 3, 3, 4, 3, 2, 1, 2, 4, 1, 3, 3, 4, 3, 2, 1, 1, 1, 4, 1, 1, 1, 1, 2},
            {3, 4, 3, 3, 3, 4, 1, 2, 1, 4, 3, 2, 1, 4, 1, 2, 4, 1, 2, 4, 1, 2, 3, 3, 3, 3, 2, 3, 4, 1, 4, 1, 2, 1, 4, 1, 1, 4, 3, 4, 3, 4, 2},
            {2, 4, 2, 3, 4, 3, 4, 3, 2, 3, 4, 3, 2, 3, 4, 2, 4, 2, 2, 4, 2, 1, 1, 1, 1, 1, 2, 1, 1, 2, 4, 4, 1, 1, 1, 3, 2, 1, 2, 4, 2, 3, 2},
            {2, 3, 2, 1, 1, 1, 3, 2, 1, 1, 1, 2, 1, 1, 1, 2, 3, 3, 2, 1, 3, 3, 3, 3, 3, 2, 1, 1, 1, 1, 1, 3, 3, 3, 3, 3, 3, 3, 2, 3, 2, 1, 1},
        };

        int[][] dejanske = Druga.visine(rel, smer);
        System.out.println(Arrays.deepToString(dejanske));
    }
}