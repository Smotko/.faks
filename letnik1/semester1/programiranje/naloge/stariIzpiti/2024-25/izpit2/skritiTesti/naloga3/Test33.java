
import java.util.*;

public class Test33 {

    public static void main(String[] args) {
        izpisi(Tretja.Poniz.izNiza("000000000pppppppppppppppppppppppppppppttttttttttttkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkkVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVVzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzjjjjjjjjjjjjjjjj99999999999"));
        izpisi(Tretja.Poniz.izNiza("PPPPPPPPPPPPPPPPPPPP111111111bbbbbJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJMMMMvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvHHHHHHHHHHHHHHHHHHHHHxxxxxxxxx"));
    }

    private static void izpisi(Tretja.Poniz poniz) {
        System.out.printf("%s / %s%n",
                Arrays.toString(poniz.vrniZnake()), Arrays.toString(poniz.vrniPonovitve()));
    }
}
