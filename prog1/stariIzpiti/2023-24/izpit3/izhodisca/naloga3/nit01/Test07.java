
import java.util.*;

public class Test07 {

    public static void main(String[] args) {
        Tretja.Program program = new Tretja.Program(new Tretja.Oddaja[]{
            new Tretja.Sport("Sport1",  50),
            new Tretja.Info("Info1",    30),  // do naslednje informativne oddaje je 120 minut
            new Tretja.Film("Film1",   120),
            new Tretja.Info("Info2",    40),  // do naslednje informativne oddaje je 0 minut
            new Tretja.Info("Info3",    20),  // do naslednje informativne oddaje je 90 minut
            new Tretja.Sport("Sport2",  60),
            new Tretja.Film("Film2",    30),
            new Tretja.Info("Info4",    20),  // do naslednje informativne oddaje je 130 minut
            new Tretja.Film("Film3",    80),
            new Tretja.Sport("Sport3",  20),
            new Tretja.Film("Film4",    30),
            new Tretja.Info("Info5",    70),
        });

        System.out.println(program.infoDovoljPogosto(0));
        System.out.println(program.infoDovoljPogosto(129));
        System.out.println(program.infoDovoljPogosto(130));
        System.out.println(program.infoDovoljPogosto(131));
        System.out.println(program.infoDovoljPogosto(200));
    }
}
