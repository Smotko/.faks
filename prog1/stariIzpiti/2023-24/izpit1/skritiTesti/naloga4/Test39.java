
import java.util.*;

public class Test39 {

    public static void main(String[] args) {
        List<Integer> la = List.of(1, 2, 4, 7, 8, 10, 12, 13, 19, 21, 23, 24, 28, 29, 30, 37, 39, 45, 47, 48, 49, 51, 55, 59, 60, 65, 68, 70, 77, 78, 79, 84, 86, 88, 89, 90, 92, 94, 96, 100, 102, 107, 108, 109, 111, 115, 116, 117, 119, 121, 122, 129, 132, 138, 141, 142, 143, 146, 150, 151, 154, 156, 157, 159, 161, 163, 165, 168, 170, 172, 177, 183, 185, 195, 196, 201, 203, 205, 206, 207, 208, 210, 215, 217, 218, 224, 226, 227, 231, 233, 234, 239, 243, 246, 248, 250, 252, 253, 259, 260, 262, 265, 266, 267, 268, 272, 274, 275, 280, 282, 283, 284, 285, 286, 287, 288, 289, 290, 292, 293, 294, 295, 297, 299, 300, 302, 304, 306, 309, 313, 314, 324, 325, 327, 331, 332, 333, 334, 336, 341, 344, 350, 351, 354, 358, 363, 364, 365, 369, 370, 374, 375, 377, 378, 379, 381, 382, 383, 387, 388, 390, 397, 400, 402, 404, 405, 406, 411, 413, 416, 421, 424, 428, 430, 434, 435, 440, 441, 442, 443, 445, 447, 449, 452, 453, 460, 461, 465, 467, 470, 471, 472, 473, 474, 478, 480, 482, 484, 486, 488, 489, 491, 492, 493, 496, 498, 500, 502, 508, 510, 511, 512, 515, 516, 517, 518, 521, 527, 530, 531, 532, 537, 538, 539, 552, 554, 557, 558, 559, 562, 563, 568, 569, 574, 575, 577, 579, 584, 587, 588, 590, 591, 593, 595, 597, 599, 600, 605, 606, 608, 609, 610, 613, 614, 615, 616, 620, 622, 627, 628, 631, 632, 634, 643, 644, 647, 649, 651, 652, 654, 655, 656, 657, 658, 659, 664, 669, 672, 673, 675, 677, 681, 683, 685, 689, 690, 691, 697, 701, 703, 704, 705, 710, 712, 714, 717, 720, 722, 725, 728, 729, 731, 732, 733, 735, 738, 741, 745, 748, 749, 753, 755, 756, 764, 765, 770, 772, 773, 776, 778, 780, 781, 787, 788, 790, 792, 794, 799, 800, 801, 804, 807, 808, 810, 818, 826, 828, 831, 832, 834, 837, 838, 839, 840, 843, 847, 848, 854, 856, 858, 860, 863, 870, 871, 876, 883, 885, 888, 890, 891, 893, 895, 897, 901, 902, 906, 907, 911, 912, 913, 914, 915, 920, 923, 925, 926, 927, 929, 931, 932, 933, 939, 941, 945, 946, 948, 950, 951, 952, 953, 955, 956, 966, 977, 979, 980, 982, 983, 985, 986, 988, 990, 992, 994, 998, 999);
        List<Integer> lb = List.of(1, 2, 4, 5, 8, 9, 10, 13, 14, 15, 19, 20, 22, 24, 25, 28, 29, 32, 33, 35, 36, 37, 42, 44, 50, 54, 57, 58, 59, 61, 65, 69, 70, 71, 72, 77, 79, 81, 82, 83, 85, 87, 89, 91, 93, 95, 96, 99, 103, 105, 106, 107, 108, 109, 110, 111, 114, 115, 116, 117, 118, 120, 123, 125, 126, 127, 128, 131, 135, 137, 145, 146, 147, 149, 150, 155, 156, 158, 159, 161, 167, 168, 169, 170, 171, 172, 174, 180, 181, 182, 185, 186, 187, 189, 190, 194, 195, 196, 198, 201, 202, 206, 208, 209, 211, 215, 216, 217, 218, 220, 223, 224, 227, 229, 230, 231, 232, 234, 235, 237, 240, 243, 245, 248, 252, 253, 256, 260, 264, 271, 273, 274, 276, 279, 280, 282, 283, 286, 289, 290, 293, 296, 300, 303, 304, 305, 306, 309, 311, 312, 313, 315, 316, 317, 320, 321, 322, 324, 328, 332, 333, 336, 339, 341, 342, 344, 347, 348, 349, 350, 352, 354, 355, 356, 357, 359, 360, 361, 364, 368, 370, 371, 373, 377, 378, 379, 380, 381, 385, 387, 388, 391, 393, 394, 395, 396, 398, 400, 401, 402, 404, 405, 407, 408, 409, 412, 413, 415, 416, 418, 419, 422, 423, 429, 430, 432, 438, 439, 440, 441, 442, 443, 445, 452, 453, 454, 456, 459, 460, 463, 465, 468, 469, 471, 472, 477, 480, 483, 484, 486, 487, 488, 490, 493, 494, 497, 499, 505, 507, 508, 510, 512, 513, 515, 516, 517, 518, 522, 526, 527, 537, 538, 541, 542, 544, 545, 546, 547, 552, 555, 556, 557, 558, 559, 562, 563, 565, 566, 567, 569, 573, 574, 579, 581, 585, 587, 592, 593, 596, 597, 600, 603, 604, 608, 610, 611, 614, 620, 621, 625, 628, 632, 634, 635, 637, 639, 641, 642, 646, 648, 649, 650, 651, 654, 656, 657, 659, 660, 661, 662, 663, 664, 667, 668, 670, 674, 677, 678, 679, 683, 684, 685, 686, 688, 689, 693, 698, 704, 707, 709, 710, 711, 713, 714, 717, 718, 720, 721, 723, 727, 732, 733, 736, 738, 741, 744, 745, 746, 749, 751, 755, 757, 759, 761, 762, 763, 765, 769, 772, 774, 775, 779, 781, 784, 786, 787, 788, 789, 790, 791, 792, 793, 795, 800, 803, 804, 806, 807, 809, 810, 811, 812, 813, 816, 817, 818, 820, 822, 823, 824, 826, 828, 830, 835, 837, 838, 840, 841, 842, 843, 845, 846, 850, 851, 852, 855, 856, 857, 858, 859, 860, 864, 867, 871, 874, 875, 878, 881, 884, 885, 886, 887, 890, 891, 893, 897, 901, 906, 910, 911, 912, 917, 918, 919, 922, 923, 924, 926, 927, 928, 929, 930, 932, 934, 939, 940, 941, 942, 951, 952, 953, 957, 959, 961, 962, 963, 964, 965, 966, 972, 976, 978, 979, 981, 983, 985, 986, 987, 991, 992, 996, 999);
        List<Integer> lc = it2list(Cetrta.zlitje(la.iterator(), lb.iterator()));
        System.out.println(lc);
    }

    private static <T> List<T> it2list(Iterator<T> it) {
        List<T> seznam = new ArrayList<>();
        while (it.hasNext()) {
            T element = it.next();
            seznam.add(element);
        }
        return seznam;
    }
}