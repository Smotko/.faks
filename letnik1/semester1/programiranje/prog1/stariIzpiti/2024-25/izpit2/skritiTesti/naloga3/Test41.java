
import java.util.*;

public class Test41 {

    public static void main(String[] args) {
        izpisi(Tretja.Poniz.izNiza("4444444444444444444444444444444444BBBBBBBBBBBBBBBBBBB2222222222222222222222222222222wwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTTpppppppppppppppppppppppppppppppppppppppp55555555555555555555555555555555555555555555555VVVVVVVVVVVVVVVVVJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJkkkkkkkkkkkkkkHHHHHHHHHHHHHHHHHHHHHHHHHHHHHH2222222222222222222222ddddddddddddddddddddddddPPPPPPPMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMMuuuu"));
        izpisi(Tretja.Poniz.izNiza("EEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEExxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxZZZZZZZZZZZZZSSSSSSSSSSSSSSSSSSSSSSSSSSSSAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAwwwwwwwwwwwwwwwwwwwwwwwwww99999999999999999999999999999999cccccccccccccccccccccccccccVVVVVVVVVGGGUUUDDDDDDiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiidddddddddddXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX444444444444444444444444"));
    }

    private static void izpisi(Tretja.Poniz poniz) {
        System.out.printf("%s / %s%n",
                Arrays.toString(poniz.vrniZnake()), Arrays.toString(poniz.vrniPonovitve()));
    }
}
