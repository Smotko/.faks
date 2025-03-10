
import java.util.*;

public class Test27 {

    public static void main(String[] args) {
        int[][] rel = {
            {0, 245, 727, -744, -437, -273, 68, -577, -316, -2, -905, -456, 448, 308, -896, 288, 877, 518, 59, -53, 713, -231, 855, 88, 983, -154, -576, -825, 647, -965, 146, 855, -57, 617, 382, -906, 950, 139, 100, 474, -307, -181, 731, 641, 410, 895, -874, 824, -923},
            {-395, -50, 850, -63, -37, 279, -10, -304, -984, 997, 209, 516, -706, -939, -786, 844, -729, -320, 441, -731, -909, -814, 271, 565, 100, 623, 511, -834, -809, -79, -401, 248, 731, -924, -344, 716, 284, -742, -234, 507, 792, 643, 363, -275, -330, 329, -879, 22, 464},
            {-96, -558, 20, 17, 400, 783, -985, 987, 586, 508, 265, 172, 693, 660, -544, 979, 960, 588, 425, 442, -217, -467, 643, -611, 104, -943, -357, -345, 516, 607, 463, -360, -348, -342, -195, -701, -9, 297, 803, 785, 795, -690, -598, -735, -725, -377, 539, 583, -289},
            {633, 894, -235, 214, 618, 562, -928, -884, -517, -391, 714, 405, 897, -490, -777, -211, 917, 27, 500, -522, -530, -135, 507, 615, -108, -596, -280, 665, -740, -732, 292, 596, -595, 981, 300, 752, 430, -884, -827, -221, -576, -486, 732, 167, 890, -820, 937, 426, 494},
            {-733, 76, -74, 663, -867, 175, -718, 415, -619, -113, -498, -422, 2, -719, 927, 865, 470, 967, 997, 206, -194, -609, 243, 33, 591, 263, 810, 936, -579, -213, 15, -553, 345, 444, 953, 909, 148, 663, -939, 384, 695, 509, 682, 37, -334, 690, -219, 184, 831},
            {850, -900, 730, 505, 220, -550, 386, 814, -681, -708, -127, -599, 650, 172, -566, 687, 287, -890, 576, 876, 556, 850, -43, 658, 562, 849, 146, 206, 337, -447, 725, 14, -812, 804, -599, -52, 233, 906, 294, -617, 463, 50, 531, -708, -348, 152, -804, -157, 725},
            {-329, -59, 805, 672, 260, -478, -11, 826, 587, 831, -679, 108, -100, 44, 359, -327, 981, 971, 14, -118, 366, 860, -388, 585, -562, 514, 79, -469, -503, 662, 22, 683, -575, -623, -567, 956, 989, -640, -88, 175, 275, 461, -729, -417, 87, -523, 231, -254, -77},
            {-377, -28, 533, -567, 3, -176, 876, 239, 401, -853, -331, 800, 926, 209, -196, -279, -253, -193, -819, 43, -499, -317, 607, -164, 509, -455, 922, -554, 26, 22, -811, 329, -427, -43, -642, -417, -305, -101, -532, 477, 414, -950, 876, -747, -459, -162, -234, -949, -451},
            {-447, 190, -739, -54, 573, 371, -52, -240, 924, 398, -156, -496, 24, 880, 511, 534, 179, 332, 429, 294, -578, -582, 679, 656, -572, -692, -97, -562, 248, 65, 612, 542, -940, 499, -156, 822, -361, 327, -334, 613, -603, 709, 996, -134, 936, -970, -56, -642, 710},
            {406, -508, -178, -693, 418, -64, 358, -644, 137, -261, -976, 3, -509, 190, 744, -749, -858, -393, 996, -253, 885, 457, -442, 390, -197, 417, 451, 342, 867, -430, -561, -532, 443, 395, 548, -358, 115, -250, 326, -52, 903, -543, 633, -188, 906, 139, 435, -796, 603},
            {-619, -157, 80, -217, -799, 966, -245, 36, -803, 532, 147, 64, 382, 419, -486, 725, -202, -214, 630, -39, -651, -935, -949, 835, 856, -668, -116, 322, -911, -923, -315, -387, 925, 547, 367, 827, 556, -511, -74, -581, -615, -496, 541, 776, 377, 683, -699, -303, -827},
            {-473, 116, -368, -218, -850, -13, 204, 477, 751, -662, -269, -904, -319, 198, 749, -975, 838, 47, -844, 306, -170, -320, 524, -855, -714, -759, -715, -864, 2, -478, 716, 60, -502, -341, 774, -504, 3, 607, 685, -250, -509, 122, 609, 37, 857, 510, 367, 218, 401},
            {498, 677, -397, 458, 127, -382, -439, 10, -817, -63, -602, -198, 958, 418, 112, 752, -461, 236, 394, 841, -327, 873, 62, 196, -921, -138, 74, 447, 28, -649, 443, -286, 970, -874, 437, -34, -95, -507, -951, -853, 515, 766, 793, -394, 469, -906, -702, 675, 840},
            {488, 670, 554, -223, -685, -786, -289, -358, 215, 565, -457, -47, -946, -675, 727, 825, 21, -64, -782, -812, -715, -906, -449, 726, -393, 130, -135, -95, -799, 919, 312, -615, -833, 523, 701, 143, 972, -669, -36, 738, -171, 356, -529, -534, 58, -351, -408, 642, -619},
            {-194, 343, -485, 893, -379, 177, -929, -266, -186, 545, -868, -564, -111, -123, -573, -443, 639, 884, -46, 430, 318, 166, 590, -65, 462, 287, -610, -798, 362, 483, -782, 321, -809, -186, 93, -265, 967, -133, -775, -685, -140, 189, -748, -398, 402, -16, 311, 153, 369},
            {743, -986, 365, -132, -582, 704, -42, -286, 825, 208, -150, 967, -59, -91, 547, -619, -325, 425, -785, -703, -590, 495, 708, 276, 931, 594, -61, 64, 800, 703, -480, 819, 46, -37, -596, -400, 74, -917, 939, 510, -481, 573, 64, -278, -226, 854, 716, -303, -943},
            {752, 359, -288, 135, -684, -42, 140, 325, 211, -51, 665, 734, 573, -769, 565, -406, 542, -113, -979, -144, -22, 66, 494, -902, -723, 980, 464, -245, -607, 425, 784, 905, 812, -523, -269, -504, 578, 391, 457, 852, -24, 547, -855, 289, -499, -234, 290, 321, -963},
            {-788, 510, -413, 903, 69, -54, -583, -272, 254, 213, 56, 116, -965, -278, -200, 280, 262, -764, -289, 453, 599, 89, -698, -501, -88, -587, 884, 913, -600, 928, 558, -801, 21, 353, 141, 329, 296, -368, 78, -249, 210, -876, -857, -708, 828, -718, -639, 629, -230},
            {-175, -194, -211, -124, 772, 67, 237, -225, -82, -88, -163, 137, 12, 911, -358, 378, 471, -471, -646, -863, 17, -765, -480, 594, 140, 823, 916, 633, 473, -680, 179, -356, -157, -662, 336, -927, -59, -208, -384, 679, 541, 582, 306, 566, 609, -709, -807, 133, -806},
            {-429, -490, 772, 151, -726, 300, -782, 82, -876, -270, -919, 965, 934, 357, -825, 12, 812, 816, -535, 905, -377, -481, -915, 852, 990, -125, 650, 846, 769, -340, -718, -734, 463, 557, 462, 858, 212, -759, -896, 959, -680, -627, -925, -422, 725, 936, 491, -929, -749},
            {925, -668, -343, -195, 916, 449, 955, 71, -79, 397, -171, 722, 858, -295, 982, 408, -239, 901, -197, -697, -504, -899, 518, -687, -596, 474, -370, -969, -153, -5, -992, -382, 114, -904, 913, 104, 999, 686, -441, 3, -307, -488, 496, -16, 410, -167, -342, 468, 72},
            {493, -184, -651, -57, 408, -243, -943, 1000, 355, -545, 533, -997, -290, 799, 925, -96, -486, 517, 656, -646, 863, 809, 677, -751, -862, 145, -342, -457, 493, 401, -609, 280, -140, -930, -622, 141, 886, 980, 605, 550, 858, 414, -764, -623, 573, -85, 602, -542, -176},
            {-63, -441, -459, -35, 659, 392, -300, 589, 268, -963, 101, -123, 896, -901, 655, -630, 761, -524, -722, -947, 728, 280, -496, -264, 635, -892, -950, 628, -979, 911, 745, 289, 878, 355, -717, 715, 119, -511, -963, -707, -791, 363, -931, -633, -37, -429, -544, 184, 860},
            {-470, -825, -585, -948, 528, -759, 775, 587, 864, 888, -891, -468, -489, -181, 764, 907, 972, -17, -608, -56, -701, 879, -836, -536, 641, 879, 393, -352, -673, -835, -688, -515, 933, 928, -320, -100, 120, 943, 767, -561, -207, 199, -621, 41, -711, 433, 708, 273, 976},
            {-461, -314, 210, 477, -64, -625, -956, -866, -117, 26, 140, -743, -204, 83, -512, 24, -385, -159, 330, -721, -122, 349, -934, -683, 887, 908, 303, 918, -473, 236, -396, -593, 124, 208, 131, 805, -122, -714, -773, -268, 699, -372, 11, -289, -874, -231, -99, -31, 659},
            {862, -845, 109, -311, -205, 458, -712, 659, 204, 653, 496, 296, -115, 109, 837, -702, 516, 16, 317, 185, -808, 36, -493, 965, -513, -446, -129, -491, 493, 467, -31, 130, -780, -238, -375, -995, 19, 667, 729, -949, 890, 171, -84, 406, -737, 737, 58, 523, 185},
            {435, -912, 92, -140, -656, -191, -365, -948, 835, -334, 463, 218, 897, 333, 851, -99, 372, 706, -601, -374, 500, 244, -119, 649, 16, -63, -297, -947, -408, 385, 50, 470, 366, -612, 309, -942, 74, 747, 514, -949, -196, -937, 1000, 990, 773, 839, -946, -310, 219},
            {-778, -350, -340, 798, -869, 715, -803, 286, -20, -122, 143, -908, -144, -786, -837, 588, -310, 645, 366, -751, -299, 221, 941, -177, 993, 656, -217, -529, -420, 908, -58, -225, -366, 961, 837, 713, -295, -609, -125, -353, -940, -169, 80, -297, -66, -960, -42, -853, -928},
            {4, 335, -461, 839, -759, -733, -217, -446, -165, 53, 658, 75, 235, -727, -146, -423, -95, -248, -226, 735, -434, -495, -202, 470, 579, -951, -320, 288, -563, -730, -827, -442, -135, -37, 742, 955, 497, -734, 723, -877, -577, 480, -884, 53, 474, 810, -662, -157, -31},
            {-827, 297, -558, 329, 393, -453, -262, -114, -537, -320, 672, 583, 994, -752, 801, 818, 308, 417, -409, -595, 4, 77, -179, -242, 30, -882, -458, 224, 241, -48, -513, 611, 616, 358, 23, -745, 500, 20, -150, 829, 80, -408, 645, -748, 884, -584, -336, -478, 779},
            {-278, -258, 180, 378, 937, 175, -131, 528, 310, 961, 877, -127, -766, -876, -556, -106, -840, -243, -22, -882, -666, 235, 125, 77, -785, 675, 397, 987, 389, -615, 161, -784, 442, -920, 927, 300, -904, -685, -892, 971, 925, -955, 163, 86, 548, 570, 196, -195, 223},
            {-417, 357, 916, -498, 259, 373, -201, 744, -943, -363, -362, -745, -518, 685, 652, 511, 722, 116, -983, -877, 750, -936, 527, 175, 957, -482, 665, 521, -805, 226, -481, 575, -493, 355, 189, 131, -310, 178, -118, 188, 823, 450, 784, -30, -79, -30, 958, 293, -247},
            {904, -195, 299, -214, 586, 948, 63, 156, -701, -308, 668, -524, 376, 934, -194, 647, -513, -796, -29, -10, 198, 514, 994, -729, 768, 111, 460, 182, -715, -954, -403, 822, 706, -142, -673, 358, 405, 566, 439, 669, 715, -495, -23, 650, 143, 28, -612, 152, -626},
            {106, 131, 272, 951, -288, -786, 730, -103, 789, -769, 764, -216, 130, -431, -442, -53, -81, 351, -84, 914, -719, 224, -929, 131, -893, 684, -233, 53, -630, -217, -566, -82, -934, 141, 167, -407, -272, -641, -840, -851, -276, -948, 38, 187, 944, 371, -803, -700, 515},
            {-215, 749, 94, -936, -329, 640, -801, -795, -788, 899, -579, 519, 269, 514, -119, -549, -25, -60, 407, 55, 470, -318, 907, 691, -583, -124, -133, -185, 806, -595, 631, -518, 838, -221, -4, -799, 654, 307, -641, 489, 343, -27, -86, -421, -574, 923, 777, 600, 886},
            {934, -149, -215, -533, 603, -595, -289, 263, -90, 761, -994, -670, 330, 545, 331, -755, -944, 597, 680, -493, 611, -772, -950, -879, 173, -509, 746, 670, -771, -364, -780, -268, 169, 618, -496, -172, 513, 682, 470, 641, -950, -707, 995, -602, -872, -943, -560, -486, -704},
            {175, -234, -17, -447, -374, -784, -107, 526, -314, 474, -662, 142, 61, -150, -953, 106, -616, 22, 487, -746, -517, 752, -587, 533, -812, -147, -747, 875, 249, 575, -127, 855, 152, 461, -561, 381, -232, -418, -488, 181, 781, 53, -485, 29, 258, 742, -322, 487, 779},
            {-358, 586, 268, -257, -717, 366, 662, 683, -919, -556, -32, 145, 679, 40, 890, 244, -669, -505, 57, 295, 448, 882, 179, 876, -756, 930, -593, 222, -275, 751, 18, 694, -52, 328, 544, 275, -360, 235, -554, 721, 486, -973, 144, -269, 823, 159, -18, 146, -799},
            {476, -138, 811, 990, -300, -259, 755, 579, 687, -283, -440, -44, 1, -970, 411, 980, -489, -286, 437, 809, 173, -202, 723, -773, 95, 685, -663, 459, 77, -917, -907, -267, 638, -480, -214, 85, 118, 433, 635, -887, -27, -938, -420, 435, 783, -265, 642, 87, -547},
            {660, -337, 66, -989, 408, 707, -542, -918, 812, -386, 690, 377, -690, -383, 853, -95, 520, -394, 143, -616, 132, 744, 66, -44, -7, -727, 1, 537, -810, -409, 203, -438, 551, 335, 165, 620, 331, -472, -180, 441, -7, 975, 512, -194, 755, -596, 476, 26, 426},
            {351, -478, 321, 359, 239, 314, -832, -34, -385, -449, -471, -693, -758, -233, -244, 387, 637, -351, 816, 217, -264, -582, -27, 394, 634, 214, -716, -424, -329, 506, 1000, -639, -320, -189, -652, -675, -707, 524, -476, 967, 640, 847, 27, -799, 576, 754, -250, -138, 104},
            {293, 779, -477, 460, -815, -372, -401, -106, 659, -792, -774, -867, 506, 18, -939, -95, -313, -550, -528, -791, -370, -598, 415, 7, 662, 354, 734, 397, 450, 111, 241, -309, 86, -726, -662, 903, -631, 78, 602, -286, -376, -47, 345, -122, 243, -536, 844, -845, 320},
            {-740, 47, 373, 351, -557, 400, 980, 802, 637, -762, -337, -382, -451, 198, 79, -49, -645, 230, -122, 930, 493, 890, 923, -529, -568, 669, 473, 131, -493, 802, 594, -365, -754, 776, 2, -355, -554, 674, 624, 302, 844, 629, 158, -212, -785, -866, 870, -71, -417},
            {-945, 500, -731, 305, 827, -891, 374, 425, -877, 322, 512, 496, 611, -131, 255, -829, 982, 592, 8, 594, 12, -75, 531, 175, 146, -153, 612, -94, -569, 165, -228, 786, -716, 684, 0, 874, 722, -327, 468, 415, -635, -474, 353, -835, -499, -306, -864, 947, 227},
        };
        int[][] smer = {
            {0, 4, 3, 3, 3, 3, 4, 1, 3, 3, 3, 4, 3, 4, 3, 3, 4, 1, 3, 4, 1, 1, 3, 3, 3, 4, 3, 4, 1, 3, 3, 4, 3, 3, 3, 3, 4, 1, 3, 3, 4, 1, 1, 1, 4, 1, 1, 1, 4},
            {2, 4, 2, 4, 1, 4, 4, 2, 2, 3, 4, 3, 2, 4, 2, 4, 3, 3, 2, 3, 3, 3, 2, 4, 1, 3, 2, 3, 3, 2, 1, 3, 2, 4, 1, 2, 4, 3, 2, 1, 3, 4, 4, 2, 3, 4, 4, 2, 1},
            {2, 3, 2, 4, 2, 1, 4, 2, 2, 1, 4, 1, 4, 1, 2, 1, 4, 1, 1, 1, 1, 2, 1, 1, 2, 4, 1, 2, 3, 4, 4, 1, 1, 1, 2, 1, 3, 2, 4, 1, 1, 4, 4, 2, 1, 1, 3, 4, 2},
            {2, 1, 2, 1, 4, 2, 4, 3, 4, 2, 4, 2, 3, 3, 3, 2, 3, 4, 4, 1, 2, 3, 2, 4, 1, 1, 2, 2, 1, 1, 3, 3, 3, 4, 3, 2, 1, 1, 1, 4, 2, 1, 3, 4, 1, 1, 2, 3, 2},
            {3, 2, 3, 3, 3, 2, 3, 2, 4, 2, 1, 2, 1, 1, 1, 4, 1, 1, 3, 4, 2, 1, 1, 3, 4, 4, 2, 1, 4, 2, 4, 1, 1, 4, 2, 3, 3, 4, 3, 3, 3, 3, 4, 1, 2, 3, 2, 3, 4},
            {2, 4, 1, 2, 1, 3, 4, 4, 1, 1, 3, 4, 1, 2, 4, 1, 3, 4, 1, 4, 1, 3, 2, 2, 4, 3, 3, 2, 4, 2, 4, 2, 4, 1, 2, 2, 1, 4, 2, 1, 4, 1, 1, 3, 2, 2, 1, 2, 4},
            {2, 1, 2, 1, 2, 1, 1, 4, 3, 3, 2, 3, 3, 2, 3, 4, 4, 1, 2, 4, 3, 2, 3, 4, 1, 2, 1, 1, 4, 2, 4, 2, 3, 4, 2, 3, 2, 4, 3, 2, 3, 3, 3, 3, 4, 3, 2, 4, 1},
            {4, 1, 1, 2, 2, 4, 1, 3, 2, 1, 1, 1, 4, 1, 1, 1, 3, 4, 2, 1, 2, 3, 4, 1, 3, 4, 3, 2, 3, 2, 1, 4, 1, 1, 3, 2, 4, 3, 3, 3, 3, 4, 2, 1, 4, 2, 1, 3, 4},
            {3, 3, 4, 2, 1, 1, 2, 1, 1, 3, 3, 2, 4, 4, 1, 1, 1, 1, 2, 3, 2, 4, 1, 3, 2, 4, 2, 3, 4, 1, 2, 3, 4, 2, 2, 1, 4, 1, 4, 1, 4, 4, 3, 2, 4, 1, 2, 1, 4},
            {2, 4, 1, 1, 3, 4, 3, 3, 2, 2, 4, 1, 1, 3, 4, 2, 3, 3, 4, 2, 4, 1, 3, 3, 4, 3, 2, 2, 4, 2, 2, 4, 1, 2, 3, 2, 4, 2, 1, 2, 1, 3, 4, 2, 3, 3, 3, 2, 4},
            {2, 4, 3, 2, 4, 1, 2, 4, 1, 4, 1, 3, 4, 1, 1, 3, 2, 4, 3, 2, 4, 3, 2, 4, 4, 2, 1, 1, 1, 2, 1, 1, 3, 2, 2, 1, 3, 4, 3, 3, 3, 4, 4, 2, 3, 3, 4, 2, 4},
            {2, 4, 2, 3, 4, 2, 2, 1, 2, 3, 4, 2, 3, 4, 2, 2, 4, 3, 3, 3, 4, 2, 1, 4, 4, 3, 3, 3, 3, 3, 3, 3, 3, 4, 3, 2, 4, 1, 2, 1, 4, 4, 4, 2, 2, 4, 1, 2, 4},
            {4, 1, 2, 1, 4, 2, 1, 1, 2, 1, 1, 2, 1, 3, 3, 2, 4, 2, 1, 4, 3, 4, 2, 1, 3, 2, 3, 3, 3, 4, 1, 1, 1, 3, 2, 4, 3, 3, 3, 2, 1, 4, 3, 3, 2, 4, 3, 2, 1},
            {3, 4, 3, 2, 3, 4, 3, 3, 3, 4, 3, 3, 2, 4, 3, 4, 1, 3, 2, 1, 1, 3, 4, 2, 4, 1, 2, 4, 4, 1, 3, 2, 3, 4, 1, 4, 2, 1, 3, 4, 4, 1, 3, 3, 4, 3, 3, 3, 4},
            {2, 4, 2, 1, 1, 1, 2, 1, 1, 3, 2, 4, 1, 1, 2, 4, 3, 2, 4, 1, 4, 1, 1, 2, 4, 3, 2, 1, 3, 3, 4, 3, 2, 4, 2, 1, 1, 2, 1, 1, 4, 2, 1, 1, 4, 4, 1, 1, 1},
            {2, 4, 3, 3, 3, 2, 1, 1, 2, 3, 4, 1, 3, 2, 2, 3, 2, 4, 1, 2, 1, 2, 3, 2, 3, 2, 1, 4, 1, 2, 3, 2, 4, 1, 3, 3, 3, 2, 4, 1, 3, 4, 3, 2, 1, 4, 4, 3, 2},
            {4, 1, 2, 3, 4, 3, 3, 3, 2, 4, 1, 2, 3, 3, 2, 4, 1, 4, 3, 3, 4, 2, 2, 1, 4, 1, 1, 1, 2, 2, 1, 1, 4, 2, 2, 1, 4, 1, 4, 2, 2, 3, 4, 2, 4, 1, 3, 2, 4},
            {4, 2, 3, 2, 3, 2, 4, 1, 4, 1, 3, 2, 2, 1, 4, 1, 2, 4, 2, 1, 4, 2, 3, 2, 3, 3, 4, 4, 2, 1, 2, 4, 1, 2, 1, 2, 1, 2, 4, 2, 2, 1, 4, 2, 4, 3, 2, 1, 1},
            {4, 3, 2, 3, 4, 1, 1, 2, 3, 3, 4, 2, 3, 2, 4, 2, 4, 1, 3, 4, 3, 2, 2, 1, 1, 4, 1, 4, 1, 2, 2, 4, 3, 3, 4, 3, 3, 2, 4, 2, 1, 1, 4, 2, 3, 4, 3, 3, 4},
            {3, 2, 3, 4, 1, 3, 4, 2, 1, 1, 4, 2, 2, 1, 4, 2, 4, 3, 2, 3, 3, 3, 4, 1, 2, 1, 4, 3, 3, 2, 2, 3, 2, 4, 3, 2, 4, 1, 1, 3, 3, 2, 4, 2, 1, 3, 2, 1, 4},
            {2, 3, 2, 3, 4, 2, 4, 4, 3, 2, 3, 3, 4, 2, 1, 2, 3, 2, 4, 1, 1, 1, 3, 3, 3, 3, 4, 2, 1, 3, 2, 4, 3, 3, 3, 4, 4, 3, 3, 2, 1, 1, 1, 3, 2, 4, 1, 4, 1},
            {2, 2, 1, 1, 3, 2, 4, 4, 2, 1, 2, 1, 3, 4, 3, 2, 4, 1, 1, 4, 1, 2, 1, 1, 1, 4, 3, 3, 2, 2, 3, 3, 2, 4, 1, 4, 3, 4, 2, 4, 1, 1, 4, 1, 1, 1, 2, 1, 2},
            {2, 2, 4, 1, 4, 1, 1, 3, 3, 2, 3, 2, 4, 3, 2, 4, 1, 4, 1, 4, 3, 3, 3, 3, 2, 3, 3, 3, 3, 2, 2, 4, 1, 1, 2, 4, 1, 4, 2, 4, 3, 2, 1, 3, 3, 3, 4, 3, 2},
            {2, 1, 4, 2, 1, 4, 1, 2, 1, 1, 2, 1, 1, 1, 1, 1, 4, 1, 2, 3, 2, 1, 3, 3, 3, 2, 1, 1, 1, 4, 1, 1, 4, 1, 2, 4, 2, 3, 4, 3, 4, 3, 3, 2, 3, 4, 4, 2, 1},
            {3, 2, 3, 4, 3, 3, 3, 4, 1, 2, 3, 3, 2, 4, 1, 1, 1, 4, 2, 1, 1, 2, 2, 4, 1, 4, 1, 1, 2, 1, 3, 3, 4, 2, 2, 4, 2, 4, 1, 4, 3, 2, 1, 1, 1, 1, 4, 3, 4},
            {2, 1, 1, 3, 3, 4, 2, 3, 3, 2, 2, 1, 1, 4, 4, 3, 4, 1, 1, 4, 2, 2, 1, 1, 2, 3, 3, 3, 3, 4, 2, 1, 3, 3, 2, 1, 4, 1, 2, 1, 4, 1, 4, 1, 1, 2, 3, 2, 4},
            {3, 4, 2, 1, 2, 4, 2, 3, 3, 3, 4, 2, 4, 1, 4, 2, 3, 4, 2, 4, 2, 1, 1, 3, 2, 4, 1, 1, 4, 1, 3, 2, 1, 4, 1, 4, 1, 4, 3, 2, 3, 4, 4, 3, 2, 1, 1, 1, 1},
            {4, 1, 1, 2, 4, 1, 2, 1, 4, 1, 3, 2, 4, 3, 3, 2, 4, 1, 2, 4, 1, 3, 2, 2, 1, 1, 3, 2, 3, 3, 2, 4, 1, 1, 2, 1, 4, 1, 2, 1, 1, 1, 3, 3, 3, 4, 3, 4, 2},
            {4, 2, 3, 2, 4, 3, 3, 2, 1, 2, 1, 1, 4, 2, 1, 1, 3, 4, 2, 4, 2, 2, 1, 1, 1, 1, 2, 3, 4, 1, 1, 1, 3, 3, 3, 3, 3, 3, 3, 2, 4, 1, 1, 1, 2, 4, 4, 1, 2},
            {4, 2, 2, 3, 3, 3, 4, 3, 4, 3, 4, 2, 4, 3, 4, 2, 4, 1, 2, 1, 2, 3, 4, 1, 1, 2, 2, 1, 1, 4, 1, 3, 2, 1, 4, 1, 1, 1, 2, 4, 1, 4, 1, 2, 1, 1, 4, 2, 2},
            {3, 3, 2, 2, 1, 1, 4, 2, 3, 2, 4, 2, 4, 2, 4, 2, 3, 3, 3, 4, 2, 2, 3, 4, 2, 2, 4, 1, 3, 3, 4, 2, 1, 4, 1, 3, 3, 2, 4, 1, 3, 4, 2, 1, 1, 3, 4, 2, 2},
            {2, 3, 4, 1, 1, 1, 1, 2, 3, 4, 4, 2, 1, 4, 1, 2, 1, 4, 1, 1, 2, 2, 4, 3, 3, 2, 4, 2, 1, 2, 4, 3, 2, 3, 4, 2, 3, 4, 1, 3, 2, 4, 3, 4, 2, 2, 4, 2, 2},
            {2, 2, 4, 4, 1, 1, 3, 2, 2, 4, 4, 3, 3, 3, 3, 2, 4, 1, 3, 4, 2, 2, 3, 3, 3, 4, 1, 4, 2, 4, 1, 2, 1, 1, 4, 2, 2, 4, 3, 2, 4, 1, 2, 3, 3, 2, 3, 3, 2},
            {2, 2, 4, 3, 3, 3, 2, 3, 2, 4, 3, 2, 3, 4, 2, 4, 4, 3, 2, 3, 4, 2, 1, 1, 1, 3, 4, 4, 2, 3, 3, 2, 4, 1, 1, 2, 1, 4, 4, 1, 1, 2, 2, 1, 4, 1, 1, 1, 4},
            {2, 2, 3, 4, 3, 3, 3, 2, 1, 4, 2, 3, 2, 4, 2, 1, 3, 2, 1, 1, 4, 1, 1, 1, 2, 1, 4, 4, 2, 1, 1, 1, 4, 3, 3, 3, 2, 1, 3, 3, 4, 3, 3, 2, 4, 3, 4, 2, 4},
            {2, 1, 1, 4, 2, 3, 4, 1, 4, 1, 3, 2, 1, 3, 4, 2, 4, 1, 4, 1, 3, 3, 4, 2, 1, 2, 4, 4, 1, 4, 3, 2, 3, 4, 2, 3, 3, 4, 2, 4, 1, 2, 1, 4, 1, 2, 3, 2, 4},
            {4, 3, 2, 3, 2, 2, 3, 4, 4, 2, 2, 4, 4, 1, 1, 4, 1, 2, 1, 2, 2, 1, 4, 3, 2, 2, 1, 4, 2, 1, 2, 3, 4, 1, 2, 2, 1, 4, 2, 4, 2, 3, 2, 3, 3, 4, 2, 1, 4},
            {4, 2, 3, 2, 3, 4, 1, 1, 3, 3, 2, 4, 4, 3, 3, 3, 4, 3, 3, 2, 4, 1, 1, 3, 4, 3, 3, 3, 4, 2, 2, 1, 3, 3, 3, 3, 2, 3, 4, 4, 3, 2, 3, 2, 4, 1, 4, 2, 1},
            {4, 2, 2, 1, 4, 1, 4, 1, 1, 2, 1, 1, 4, 2, 4, 1, 1, 2, 1, 1, 1, 3, 3, 2, 3, 2, 1, 1, 4, 2, 1, 2, 1, 2, 4, 1, 4, 4, 1, 4, 2, 3, 2, 1, 4, 3, 3, 3, 2},
            {3, 2, 3, 2, 1, 2, 3, 4, 2, 2, 4, 1, 3, 4, 4, 3, 2, 3, 3, 3, 3, 2, 3, 4, 1, 1, 4, 1, 1, 3, 3, 4, 2, 2, 1, 2, 4, 4, 4, 1, 2, 1, 4, 1, 3, 4, 2, 1, 1},
            {2, 4, 2, 4, 1, 4, 1, 1, 2, 4, 1, 2, 1, 1, 3, 3, 4, 2, 3, 3, 4, 1, 2, 3, 3, 4, 3, 4, 2, 2, 4, 4, 2, 1, 3, 2, 1, 4, 4, 2, 1, 2, 1, 2, 1, 1, 4, 3, 2},
            {2, 3, 2, 4, 2, 1, 4, 1, 2, 3, 4, 3, 4, 1, 4, 1, 1, 2, 1, 2, 4, 2, 1, 2, 4, 3, 4, 3, 3, 2, 4, 4, 1, 2, 1, 1, 1, 1, 3, 4, 2, 1, 1, 1, 1, 1, 4, 2, 1},
            {2, 4, 1, 1, 3, 4, 3, 4, 2, 1, 1, 2, 4, 2, 1, 3, 2, 1, 2, 2, 4, 3, 2, 2, 1, 4, 1, 4, 1, 1, 4, 4, 3, 4, 1, 1, 1, 1, 2, 4, 2, 3, 4, 3, 4, 2, 1, 3, 2},
            {2, 1, 3, 3, 2, 3, 2, 3, 3, 3, 3, 2, 3, 3, 3, 3, 3, 3, 2, 1, 1, 2, 1, 1, 1, 1, 2, 1, 3, 2, 1, 3, 2, 3, 3, 3, 3, 3, 2, 3, 3, 2, 3, 2, 3, 3, 3, 2, 1},
        };

        int[][] dejanske = Druga.visine(rel, smer);
        System.out.println(Arrays.deepToString(dejanske));
    }
}
