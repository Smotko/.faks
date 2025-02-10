
import java.util.*;

public class Test06 {

    public static void main(String[] args) {
        Tretja.Program program = new Tretja.Program(new Tretja.Oddaja[]{
            new Tretja.Film("W7bGsQG", 31),
            new Tretja.Film("Lr1PO", 49),
            new Tretja.Film("3O0ltUB", 4),
            new Tretja.Sport("LRJsol", 9),
            new Tretja.Info("7ijjUS", 29),
            new Tretja.Film("O8fUct", 17),
            new Tretja.Film("6xEoV", 52),
            new Tretja.Film("APurSV", 16),
            new Tretja.Info("iQFWw8", 15),
            new Tretja.Info("CgXHAjS", 14),
            new Tretja.Film("sWGxhK", 49),
            new Tretja.Film("53iUfMB", 12),
            new Tretja.Film("clM2q2n", 24),
            new Tretja.Info("p7qmROe", 30),
            new Tretja.Film("wWIOoJ", 47),
            new Tretja.Film("eIOhf", 39),
            new Tretja.Sport("JWeGXai", 22),
            new Tretja.Film("GqOO4", 50),
            new Tretja.Sport("0GBYR6J", 22),
        });

        System.out.println(program.konec(new Cas(7, 30)));
        System.out.println(program.konec(new Cas(13, 12)));
        System.out.println(program.konec(new Cas(2, 42)));
        System.out.println(program.konec(new Cas(2, 33)));
        System.out.println(program.konec(new Cas(7, 56)));
    }
}
