
import java.util.*;

public class Test40 {

    public static void main(String[] args) {
        izpisi(Tretja.Poniz.izNiza("VVVVVVVVUUUUUUUUUUUUUUUUUUUUUUUUUUUUUU444444444444LLLLLLLLLLLLLLL1111111111111111111111111111111111111GGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKKyyyyyyyyyyyyyyyyyyyyyyyyyyy0000000000000000000000000000000000000000000000PPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPPNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNNN_____IIIggggggggggggggggggggvv"));
        izpisi(Tretja.Poniz.izNiza("YYYYYYpppppppppppppppppppppppppkkkkkkkkkkkkkkkkkkkkkkkttttttttttttttttttttttttttttttttxxxxxxxxxxxxx000000000000jjjjjjAAAAAAAAAAAAAAAAAqqqqq555555555555555555555zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzMMMMMMMMMMMMMMMMMqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqllllllllllllllllllllllllllllllllllllllllllllllxxxxxxxxxxxxxxxxxxxxxxxxxxxxx"));
    }

    private static void izpisi(Tretja.Poniz poniz) {
        System.out.printf("%s / %s%n",
                Arrays.toString(poniz.vrniZnake()), Arrays.toString(poniz.vrniPonovitve()));
    }
}
