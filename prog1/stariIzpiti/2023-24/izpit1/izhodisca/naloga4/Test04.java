
import java.util.*;

public class Test04 {

    public static void main(String[] args) {
        List<Integer> la = List.of(0, 1, 2, 3, 4, 6, 7, 8, 9, 10, 11, 12, 13, 14, 20, 22, 23, 24, 25, 26, 28, 32, 33, 36, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 53, 55, 56, 57, 58, 59, 60, 62, 63, 64, 65, 66, 67, 68, 69, 71, 72, 73, 74, 75, 76, 78, 79, 80, 82, 83, 88, 89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99, 100, 101, 104, 105, 106, 107, 109, 111, 112, 114, 115, 116, 117, 122, 123, 126, 127, 129, 132, 133, 134, 135, 137, 138, 139, 140, 142, 145, 146, 149, 150, 151, 152, 153, 154, 155, 156, 157, 158, 159, 161, 162, 163, 164, 165, 166, 167, 169, 170, 171, 173, 174, 175, 176, 177, 178, 179, 180, 181, 182, 186, 187, 188, 190, 191, 192, 193, 194, 195, 196, 197, 198, 199, 200, 201, 202, 203, 204, 205, 206, 207, 208, 209, 210, 211, 214, 216, 217, 218, 220, 222, 223, 224, 229, 230, 231, 235, 237, 238, 239, 240, 241, 243, 245, 246, 247, 248, 249, 250, 254, 256, 257, 258, 260, 261, 263, 264, 266, 269, 271, 272, 275, 276, 278, 279, 280, 282, 283, 284, 285, 286, 288, 292, 294, 295, 298, 299, 300, 303, 304, 305, 309, 310, 311, 313, 315, 316, 317, 318, 319, 320, 321, 324, 325, 326, 328, 329, 330, 331, 332, 333, 334, 335, 338, 339, 340, 342, 344, 345, 346, 349, 350, 351, 353, 354, 355, 357, 359, 360, 361, 363, 364, 365, 366, 367, 368, 369, 371, 372, 373, 374, 376, 377, 378, 379, 380, 382, 383, 385, 386, 388, 389, 390, 391, 392, 394, 395, 396, 397, 398, 399, 400, 401, 404, 406, 407, 408, 409, 412, 413, 414, 415, 416, 417, 418, 421, 422, 423, 424, 425, 426, 427, 428, 429, 430, 431, 432, 433, 434, 435, 437, 438, 439, 440, 441, 442, 443, 444, 445, 446, 447, 449, 451, 452, 453, 455, 456, 461, 462, 463, 464, 465, 467, 468, 469, 470, 471, 472, 473, 474, 475, 476, 477, 478, 479, 481, 482, 483, 484, 485, 486, 488, 489);
        List<Integer> lb = List.of(491, 493, 494, 495, 497, 499, 500, 501, 502, 503, 504, 505, 506, 507, 508, 509, 510, 511, 513, 514, 515, 516, 518, 519, 521, 522, 523, 524, 525, 526, 527, 528, 529, 530, 532, 533, 534, 535, 536, 537, 538, 539, 540, 542, 543, 544, 545, 547, 548, 550, 551, 552, 553, 554, 555, 556, 559, 560, 561, 566, 569, 570, 572, 573, 575, 576, 577, 579, 580, 581, 582, 585, 587, 589, 590, 591, 592, 593, 594, 595, 596, 598, 599, 600, 604, 606, 607, 608, 609, 610, 613, 614, 615, 618, 619, 620, 625, 626, 628, 629, 630, 631, 632, 633, 634, 635, 636, 637, 639, 642, 643, 644, 645, 647, 648, 649, 650, 651, 652, 654, 655, 656, 658, 660, 661, 662, 665, 666, 667, 669, 670, 671, 672, 673, 674, 675, 676, 677, 678, 679, 681, 682, 683, 684, 685, 686, 687, 688, 690, 691, 692, 695, 696, 697, 702, 704, 705, 706, 707, 708, 709, 712, 716, 718, 719, 720, 721, 725, 727, 728, 730, 731, 732, 733, 734, 735, 736, 737, 738, 739, 742, 743, 744, 745, 746, 747, 749, 750, 751, 753, 754, 755, 756, 760, 761, 762, 763, 765, 766, 767, 769, 770, 771, 773, 776, 777, 778, 779, 780, 781, 782, 786, 788, 790, 791, 793, 794, 795, 796, 797, 798, 799, 801, 802, 803, 804, 806, 807, 808, 810, 812, 813, 814, 816, 817, 818, 820, 821, 823, 824, 826, 827, 828, 830, 831, 832, 833, 834, 835, 836, 837, 841, 842, 843, 844, 847, 849, 850, 851, 854, 855, 856, 857, 860, 861, 863, 864, 865, 866, 868, 869, 870, 871, 872, 873, 874, 875, 876, 878, 879, 880, 881, 882, 883, 885, 886, 890, 891, 892, 894, 895, 896, 897, 898, 899, 900, 901, 902, 904, 905, 906, 907, 908, 910, 912, 915, 916, 919, 920, 921, 923, 924, 925, 926, 927, 930, 931, 932, 933, 934, 935, 936, 938, 939, 941, 942, 943, 945, 946, 947, 948, 951, 953, 954, 955, 957, 959, 960, 963, 964, 966, 967, 968, 970, 971, 973, 974, 975, 976, 977, 979, 980, 983, 984, 987, 993, 995, 997, 999);
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