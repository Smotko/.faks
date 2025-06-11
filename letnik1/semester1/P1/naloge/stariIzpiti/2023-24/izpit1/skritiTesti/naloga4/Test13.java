
import java.util.*;

public class Test13 {

    public static void main(String[] args) {
        List<Integer> la = List.of(13, 31, 34, 45, 66, 68, 84, 89, 90, 121, 131, 145, 151, 160, 162, 167, 177, 180, 194, 197, 199, 209, 232, 235, 244, 245, 246, 260, 282, 286, 297, 298, 305, 306, 311, 314, 319, 324, 340, 351, 358, 360, 372, 375, 381, 384, 391, 392, 394, 397, 403, 411, 413, 417, 424, 435, 465, 468, 469, 475, 481, 503, 510, 524, 528);
        List<Integer> lb = List.of(534, 535, 545, 548, 551, 554, 560, 565, 575, 576, 578, 585, 594, 595, 615, 623, 632, 645, 648, 655, 659, 683, 686, 702, 712, 719, 740, 746, 751, 758, 761, 766, 770, 773, 782, 787, 790, 803, 809, 822, 828, 834, 840, 846, 848, 858, 863, 888, 890, 892, 900, 904, 910, 911, 923, 929, 952, 962, 965, 974, 978, 981, 985, 989, 993);
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
