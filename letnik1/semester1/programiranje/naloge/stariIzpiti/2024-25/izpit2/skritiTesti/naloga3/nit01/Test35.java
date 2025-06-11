
import java.util.*;

public class Test35 {

    public static void main(String[] args) {
        izpisi(Tretja.Poniz.izNiza("kkkkkkkkkkkXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL777777777ggggggggggggggggggggggggghhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhssssssssssssssssssssssssssssssssssooooooooo55555555kkkkkkkkkkkkkkkk"));
        izpisi(Tretja.Poniz.izNiza("YYYYU88888888888mmmmmwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO55555555555555555555555uuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuOOOOOOOOOOOOUUUUUUUUUUUU"));
    }

    private static void izpisi(Tretja.Poniz poniz) {
        System.out.printf("%s / %s%n",
                Arrays.toString(poniz.vrniZnake()), Arrays.toString(poniz.vrniPonovitve()));
    }
}
