
import java.util.*;

public class Test10 {

    public static void main(String[] args) {
        int[][] rel = {
            {0, -563, 7, 520, -997, 421, -667, -856, -702, -839, 581, -536, 970, 689, -210, -549, 497, 919, -410, -837, -244, 209, 223, -233, 244, -945, -947, 804, -666, -653},
            {66, -878, 986, 605, 946, -137, -576, -609, -961, -803, -746, 417, -392, -178, 694, -653, -30, 546, -600, 793, 315, -951, -295, -207, 678, -648, 175, -834, 48, 96},
            {276, 69, -601, -256, 574, -531, 782, 631, -219, 842, -845, 452, -286, -591, -420, 3, 967, -305, -711, 358, -316, 969, 990, 767, 432, -487, 109, 677, 768, -498},
            {577, 504, -944, -237, -428, 403, -874, -412, -932, -754, 509, 297, 561, -967, -154, 324, 172, 353, -139, -997, 874, -848, -221, 556, -431, -22, -708, 656, 743, -661},
            {794, 863, -356, -519, -308, 963, -636, 916, 75, -879, 142, 130, -241, -551, -626, -473, -561, 701, -1000, -179, -535, -873, 923, -630, 67, 844, -934, 805, -428, 245},
            {599, 424, 822, -423, -739, -313, -730, 868, 57, -571, 382, 135, -100, 541, 449, 516, 782, 389, -724, 675, -919, 294, 422, 650, -564, -6, 565, 665, -948, 311},
            {258, -940, 24, 450, 424, 369, -85, -800, 136, -272, -133, -690, -710, -252, -6, 727, 326, -216, -693, 89, 717, -733, 531, -228, 665, 585, 993, -438, 557, -822},
            {-566, -511, -235, 878, 563, -515, -582, 414, -417, -396, 393, -427, -241, 949, -858, 812, -115, -130, 986, -824, -880, -583, 830, -554, -730, -684, -985, 834, -803, -722},
            {208, 355, 41, -9, -2, -335, -35, -65, -916, -889, 577, -394, 265, -968, 772, 25, -278, 569, -957, 984, -952, 355, 992, -593, 141, 804, 298, 342, -146, -49},
            {-510, 76, -926, -257, -201, -522, 971, 98, 114, 210, -885, -654, 349, 586, -932, 52, 790, 563, 665, 869, 864, 12, 938, -906, 547, 120, 234, 288, -90, 768},
            {640, -774, -119, -944, -729, -962, -991, 318, 650, 442, 439, -641, -13, -5, -152, -917, -837, -955, 783, -948, -802, 218, -308, 228, -808, 504, -803, -684, -370, 90},
            {-963, 130, 53, -242, 788, 321, -990, 268, 485, -69, 908, 569, -14, -65, -126, 496, 247, 151, 527, 672, 121, -486, 622, -551, 908, -178, 720, 678, 153, -991},
            {366, -334, 222, -406, -192, 523, -928, 151, 56, 356, -359, 427, 984, -920, -969, -14, 572, 228, -160, -291, 907, 556, -996, 902, 988, -347, -886, 209, -368, 809},
            {220, 854, -758, -997, 876, 546, 19, -972, 727, -792, -500, -874, -117, -378, -521, 96, 611, 725, -899, -119, -299, -126, -228, -132, -81, 452, 895, 337, 930, 633},
            {-743, -54, 280, -838, 296, -860, -445, 213, 917, -199, -567, -686, -641, -496, 231, 941, 387, -991, -338, -436, 950, -45, 541, -151, -888, -50, -359, 593, -559, -161},
            {-630, 553, 398, -759, -921, 949, 599, -169, 754, 243, -155, -656, -484, -582, -119, -13, -323, -556, -712, 678, -153, -80, -927, -826, 740, -337, 688, 580, 579, 205},
            {361, 741, -176, -246, 255, 743, 950, -136, -677, 375, 130, 466, -595, -857, 984, -405, 598, -124, -621, -57, 508, 318, 333, 961, 752, -902, 866, -642, 76, 821},
            {460, 257, -597, -833, -231, -755, -559, -746, 181, -382, -66, -880, -492, -865, -243, -599, 539, -723, 84, -840, -991, 302, -120, -182, -833, 351, 154, -66, -455, -818},
            {280, -232, 507, 414, 999, 944, -103, 376, -708, 290, -999, -871, 592, 393, 451, -797, 711, 459, 567, 975, 875, -162, -842, 45, 850, -556, 215, 61, -771, -119},
            {913, -685, -207, 468, -9, -148, 698, 318, 175, -309, 634, -51, -537, -138, 13, -360, -342, -595, 620, -108, -194, -951, -689, 919, 692, 214, -445, 914, 51, 272},
            {675, -545, 883, 915, 348, -825, -978, -391, -9, 12, 702, -365, -334, 766, -786, 970, 866, 185, 331, -636, 20, 114, -417, 978, -385, -765, -560, -84, 840, 297},
            {-814, -921, 615, -998, 406, -732, -382, 690, -635, 629, -423, -234, 29, 946, -69, 207, 525, -1000, -931, -949, -601, -852, 932, 648, -557, -643, -347, 445, 112, 174},
            {746, 501, 573, 402, -742, -818, 982, 80, -356, 221, 644, 790, -660, -88, -130, -362, 519, 659, 542, -527, -76, -9, -728, -469, -926, -291, 237, 316, 680, 253},
            {242, -476, 237, 478, -433, 961, 355, -409, 450, 812, -213, 967, -860, 6, -755, 499, -807, 648, 981, 610, -333, 315, 187, -573, 905, 750, -169, -832, -493, 299},
            {254, -327, 95, 123, 102, -747, 932, -315, 121, -452, -693, 864, -591, 250, 453, 758, 425, -536, 511, -896, 789, 611, 158, 174, 50, 432, -335, -618, -503, 911},
            {440, -136, 953, -727, 822, 460, 779, 481, -537, -636, -183, -589, -66, 736, 301, -887, 343, -642, 455, 887, -120, 660, 39, 117, 389, -5, 817, -160, 721, -8},
            {-324, 310, 911, -449, 298, -747, -774, 165, 504, 7, -693, 159, -277, 71, -869, 112, 19, -926, 662, 415, 604, -888, -166, 329, 711, 233, -240, 226, -232, 64},
            {-471, 50, 485, 109, -921, 302, 553, -967, 40, -662, -998, 929, -841, -964, 749, 189, 220, -75, 979, 339, -36, -505, -304, 439, -715, -223, -836, 683, -997, 602},
            {-332, -487, -854, -84, 351, -598, -675, 453, 902, 899, 907, 471, -67, 742, 454, -619, -392, 744, 517, -54, 828, 736, -364, 839, 64, -460, 778, -599, -601, -435},
            {-953, 191, 14, 349, 682, 782, 253, -407, 214, -726, 163, -540, 480, 202, -868, -851, 940, 320, -33, 408, -615, 510, 103, 152, -857, -506, 862, -256, -331, 383},
            {-341, 887, -509, -893, 92, 112, 746, -501, -646, 382, 219, 829, 670, -658, 726, 206, -749, 31, 274, -698, 4, 8, 245, -198, 720, 345, -82, 38, 114, 745},
            {-445, 91, -260, 879, -28, -512, -247, -578, 464, -70, -916, 605, -588, 542, 205, -848, 145, -158, 412, -825, 205, 446, -706, -688, -942, 657, -812, -246, -103, -823},
            {60, -197, 138, -516, -852, 260, -709, -849, -208, 273, -91, -272, 648, 552, -344, -472, -273, -388, -305, 183, 770, -137, -933, 797, 63, 682, 677, -462, 375, 412},
            {144, -629, -74, -447, 686, 922, 774, 44, 926, -942, 986, -274, -390, 47, -735, -29, -365, -592, 304, -514, -945, -346, 106, -221, 520, -146, 752, 566, 576, 686},
            {-644, 24, -238, 405, -645, -77, -273, 624, 535, -481, -670, 468, 679, -43, 13, -996, -567, 56, 431, -777, -394, 431, 999, 963, 554, -15, -448, 296, -921, 731},
            {-736, -474, 467, 562, -424, -698, -224, 318, 672, 136, 255, 890, 667, -965, -462, 260, -111, 298, -933, 685, -593, -630, 456, -396, -875, 75, 157, 102, -906, 884},
            {79, 118, -690, -118, -675, -393, 458, 657, 589, -909, -713, -770, 472, 26, 524, 766, 236, -448, -397, -852, 209, -338, -308, 538, 254, -693, -721, 120, 683, 643},
            {174, 839, -467, 913, -421, 808, -59, -132, 331, -9, -532, -898, -858, 558, -846, -224, -352, 653, 707, 428, 953, 230, -37, 449, -90, -667, -270, -326, -101, 373},
            {-18, -737, 875, -584, 270, 785, 290, -719, -94, -802, -786, 229, 361, -683, 991, -894, -712, -232, 800, -273, 11, 823, 434, -397, 651, -502, 461, -197, 507, 124},
            {976, -371, -428, -574, -760, -587, 640, -472, 246, 437, -989, 177, 488, -733, 835, -808, 782, -281, 63, -735, -199, -189, 658, 892, 981, -665, -801, 489, 371, -965},
            {129, 665, -727, 530, 460, -995, -381, -414, -257, 37, -993, 588, 949, 134, -524, 97, -160, 634, 493, 522, -670, 682, -387, -856, -608, -62, -245, -253, 604, 202},
            {155, -459, 912, 327, 843, 570, 203, -623, 313, -525, -546, -584, 545, 567, -761, -760, -524, -527, -161, 705, 11, -779, 822, -146, -67, 797, -967, -806, -560, 876},
            {966, 605, -578, 136, 335, 700, -154, 97, -427, -181, -420, -886, 124, 818, -451, 263, 3, -253, -539, -901, 361, -693, 826, 415, 310, -565, 384, -705, -456, -609},
            {-289, -974, -326, -534, -782, 690, -854, 4, 471, -85, -182, 618, 509, -234, -683, -41, 101, -195, -879, 614, -285, 532, 143, -874, -445, -563, 142, 618, -210, 446},
            {-924, 274, -236, 604, -145, 999, 676, 294, 371, -259, 71, -154, -961, -583, -492, -296, -541, -763, -471, 164, -419, -418, 161, 628, 613, 438, 111, 365, -928, -606},
            {726, -196, 301, -197, -874, -295, -987, -295, -893, 679, -751, 665, 570, 170, -483, 175, -757, -336, -209, -524, 142, 365, -233, 761, -555, -931, -274, 248, -745, 564},
            {-500, -695, 627, 965, 791, 358, -706, -908, -711, 349, 618, 982, -861, -985, -196, 988, -961, 204, -891, 884, 468, -738, 446, 699, -37, -729, -622, -396, 469, -442},
            {441, -229, -601, -116, 428, 483, -289, 350, 270, -327, 457, -110, 909, -93, 744, -883, -962, -945, 104, 899, -669, 933, -511, 245, 47, 473, 834, -198, 454, 604},
            {-658, 58, -200, -689, 902, -376, -989, 381, 377, -365, -326, -431, -622, -702, 108, 365, -342, 789, -195, -744, -892, -496, -363, 365, 469, -481, 621, 745, 143, -328},
        };
        int[][] smer = {
            {0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
            {2, 1, 2, 2, 1, 2, 1, 2, 2, 1, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 1, 1, 1},
            {2, 1, 2, 2, 2, 1, 2, 2, 1, 2, 1, 2, 2, 2, 2, 2, 2, 1, 2, 2, 1, 1, 2, 2, 1, 1, 2, 2, 2, 1},
            {2, 2, 2, 1, 2, 1, 2, 2, 1, 1, 1, 1, 2, 2, 1, 1, 1, 1, 1, 1, 1, 2, 1, 2, 2, 1, 1, 1, 1, 1},
            {2, 1, 1, 2, 1, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 2, 1, 1, 1, 1, 1, 2, 1, 1, 1, 1, 1, 1, 1},
            {2, 1, 2, 2, 1, 1, 1, 2, 2, 2, 2, 2, 1, 2, 1, 1, 1, 1, 2, 1, 2, 1, 1, 2, 2, 2, 1, 2, 2, 2},
            {2, 1, 2, 1, 1, 1, 1, 1, 1, 1, 1, 2, 1, 1, 2, 2, 2, 2, 2, 1, 1, 2, 1, 1, 1, 2, 1, 1, 1, 2},
            {2, 1, 2, 2, 2, 1, 2, 1, 2, 2, 1, 2, 1, 2, 1, 1, 1, 2, 1, 2, 1, 2, 2, 1, 2, 2, 2, 1, 1, 1},
            {2, 2, 1, 1, 2, 2, 2, 1, 1, 2, 1, 2, 1, 2, 1, 2, 1, 1, 1, 2, 1, 2, 1, 1, 2, 2, 2, 2, 2, 2},
            {2, 1, 1, 1, 1, 1, 2, 1, 2, 2, 2, 1, 1, 1, 1, 1, 1, 2, 2, 2, 1, 2, 1, 1, 1, 1, 1, 2, 1, 1},
            {2, 1, 1, 1, 1, 1, 2, 2, 1, 2, 2, 2, 1, 2, 1, 1, 1, 2, 2, 2, 1, 2, 1, 1, 2, 1, 2, 2, 2, 1},
            {2, 1, 2, 2, 2, 1, 2, 1, 2, 2, 2, 1, 2, 2, 1, 2, 2, 2, 1, 1, 2, 2, 1, 2, 1, 2, 1, 2, 2, 2},
            {2, 2, 2, 2, 1, 1, 1, 2, 1, 2, 2, 2, 2, 1, 1, 1, 2, 1, 2, 2, 2, 1, 1, 1, 1, 2, 2, 2, 2, 2},
            {2, 1, 2, 1, 1, 1, 1, 1, 2, 2, 1, 1, 1, 1, 2, 1, 2, 1, 2, 2, 2, 1, 1, 2, 1, 1, 2, 2, 2, 2},
            {2, 2, 1, 2, 1, 1, 2, 1, 2, 1, 1, 2, 2, 2, 1, 2, 1, 2, 2, 2, 1, 2, 2, 2, 2, 1, 1, 1, 1, 1},
            {2, 2, 1, 1, 2, 2, 2, 1, 1, 2, 2, 2, 2, 2, 2, 1, 1, 2, 2, 2, 1, 2, 1, 2, 1, 2, 1, 1, 1, 1},
            {2, 2, 1, 2, 1, 1, 1, 1, 2, 1, 1, 1, 2, 2, 1, 1, 2, 2, 1, 2, 2, 1, 1, 2, 1, 1, 1, 1, 1, 1},
            {2, 2, 1, 2, 1, 1, 2, 2, 2, 2, 1, 2, 1, 2, 2, 1, 2, 1, 1, 2, 1, 2, 2, 1, 2, 1, 2, 2, 1, 2},
            {2, 2, 1, 2, 2, 2, 2, 1, 1, 1, 2, 2, 2, 2, 1, 1, 2, 2, 1, 1, 2, 1, 1, 2, 2, 2, 2, 1, 2, 2},
            {2, 2, 2, 1, 2, 1, 2, 2, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 2, 2, 1, 2, 2, 2, 1, 2, 1, 2, 2},
            {2, 1, 2, 1, 1, 1, 2, 2, 1, 1, 1, 1, 1, 2, 1, 2, 2, 2, 2, 1, 2, 1, 2, 1, 1, 1, 2, 1, 2, 2},
            {2, 2, 1, 2, 2, 2, 1, 1, 1, 1, 2, 1, 1, 2, 2, 2, 2, 1, 2, 1, 1, 2, 2, 2, 2, 2, 1, 1, 2, 2},
            {2, 1, 2, 1, 2, 2, 2, 2, 2, 1, 2, 2, 1, 2, 1, 1, 2, 2, 2, 1, 2, 2, 1, 1, 1, 1, 2, 2, 2, 2},
            {2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 2, 2, 1, 1, 1, 1, 2, 1, 2, 1, 2, 2, 1, 2, 2, 1, 2, 1, 2},
            {2, 2, 2, 1, 1, 2, 2, 2, 2, 1, 1, 2, 2, 2, 2, 2, 1, 2, 1, 2, 2, 2, 1, 1, 2, 2, 2, 1, 2, 2},
            {2, 2, 2, 1, 2, 1, 2, 2, 1, 2, 2, 1, 1, 1, 1, 1, 1, 2, 1, 2, 2, 2, 2, 1, 1, 1, 2, 1, 1, 1},
            {2, 2, 1, 1, 1, 2, 2, 2, 1, 1, 2, 2, 2, 1, 1, 1, 1, 2, 1, 1, 1, 2, 1, 2, 1, 2, 2, 1, 2, 2},
            {2, 1, 1, 2, 2, 2, 2, 1, 2, 1, 2, 1, 1, 2, 2, 2, 1, 2, 2, 1, 1, 2, 2, 1, 2, 1, 1, 2, 2, 2},
            {2, 2, 2, 2, 2, 2, 1, 2, 1, 2, 1, 1, 1, 1, 2, 2, 2, 1, 1, 2, 1, 1, 1, 2, 1, 1, 2, 2, 2, 2},
            {2, 1, 1, 1, 1, 2, 1, 2, 1, 1, 1, 1, 2, 2, 1, 2, 1, 1, 2, 2, 1, 2, 2, 2, 1, 1, 2, 2, 2, 2},
            {2, 1, 1, 1, 1, 1, 1, 1, 2, 1, 2, 2, 1, 2, 1, 1, 2, 1, 1, 2, 1, 1, 1, 1, 2, 2, 2, 1, 2, 1},
            {2, 2, 2, 2, 1, 1, 2, 2, 1, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 2, 2, 2, 2, 2, 1, 1, 1, 2, 1, 1},
            {2, 2, 2, 2, 2, 1, 1, 2, 2, 2, 2, 2, 1, 2, 1, 2, 1, 1, 1, 2, 2, 1, 2, 1, 2, 2, 1, 2, 2, 2},
            {2, 1, 1, 2, 1, 1, 1, 2, 1, 2, 1, 1, 1, 2, 2, 2, 1, 2, 1, 1, 1, 2, 2, 2, 1, 2, 1, 2, 1, 1},
            {2, 2, 1, 2, 1, 1, 2, 1, 2, 1, 2, 2, 1, 1, 2, 1, 2, 1, 2, 1, 1, 2, 2, 2, 2, 1, 1, 1, 1, 2},
            {2, 2, 1, 1, 2, 2, 2, 1, 1, 1, 1, 1, 1, 2, 1, 1, 2, 1, 1, 2, 1, 2, 1, 1, 1, 1, 2, 1, 2, 1},
            {2, 1, 2, 2, 2, 1, 2, 1, 1, 2, 2, 2, 1, 2, 1, 1, 2, 1, 1, 1, 2, 2, 2, 1, 2, 1, 2, 1, 1, 1},
            {2, 1, 2, 1, 1, 1, 2, 1, 2, 2, 1, 1, 1, 1, 1, 2, 1, 1, 1, 1, 2, 1, 2, 2, 2, 2, 2, 2, 2, 2},
            {2, 2, 2, 2, 1, 1, 1, 2, 2, 1, 2, 2, 2, 2, 2, 2, 2, 2, 1, 2, 1, 2, 2, 1, 2, 1, 2, 1, 2, 2},
            {2, 1, 1, 1, 1, 2, 1, 2, 2, 1, 1, 1, 1, 1, 2, 2, 2, 1, 2, 1, 1, 2, 1, 1, 1, 1, 2, 1, 2, 1},
            {2, 2, 2, 1, 1, 1, 2, 1, 2, 2, 1, 2, 2, 2, 2, 2, 1, 1, 1, 2, 1, 2, 2, 2, 2, 2, 2, 1, 2, 1},
            {2, 1, 2, 1, 2, 1, 1, 1, 2, 2, 2, 2, 1, 1, 2, 1, 1, 2, 2, 2, 2, 1, 1, 2, 1, 1, 2, 1, 2, 1},
            {2, 1, 2, 1, 2, 1, 1, 2, 1, 1, 1, 1, 1, 1, 2, 1, 2, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 1, 2, 2},
            {2, 2, 1, 1, 1, 2, 2, 1, 2, 1, 2, 1, 1, 1, 1, 1, 2, 1, 1, 1, 2, 2, 2, 2, 1, 1, 2, 2, 1, 2},
            {2, 2, 1, 2, 2, 2, 2, 1, 1, 2, 1, 2, 2, 2, 2, 1, 2, 1, 2, 1, 1, 2, 1, 1, 2, 1, 2, 1, 1, 1},
            {2, 1, 2, 2, 1, 2, 1, 2, 2, 1, 1, 1, 2, 1, 1, 2, 2, 1, 2, 1, 2, 2, 2, 1, 2, 1, 1, 1, 1, 1},
            {2, 1, 1, 2, 1, 2, 1, 2, 1, 1, 1, 2, 2, 1, 1, 1, 1, 2, 2, 1, 1, 2, 2, 2, 1, 2, 2, 1, 1, 2},
            {2, 2, 2, 2, 2, 1, 2, 2, 2, 2, 2, 1, 2, 2, 2, 1, 1, 1, 1, 1, 2, 1, 1, 1, 1, 1, 2, 1, 2, 2},
            {2, 1, 1, 1, 1, 1, 2, 1, 2, 1, 2, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 1, 1, 1, 2, 2, 1, 1, 2, 2},
        };

        int[][] dejanske = Druga.visine(rel, smer);
        System.out.println(Arrays.deepToString(dejanske));
    }
}