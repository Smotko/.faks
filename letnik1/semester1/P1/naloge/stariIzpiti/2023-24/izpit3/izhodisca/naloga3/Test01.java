
import java.util.*;

public class Test01 {

    public static void main(String[] args) {
        Tretja.Program program = new Tretja.Program(new Tretja.Oddaja[]{
            new Tretja.Sport("Sport1",  50),
            new Tretja.Info("Info1",    30),
            new Tretja.Film("Film1",   120),
            new Tretja.Info("Info2",    40),
            new Tretja.Info("Info3",    20),
            new Tretja.Sport("Sport2",  60),
            new Tretja.Film("Film2",    30),
            new Tretja.Info("Info4",    20),
            new Tretja.Film("Film3",    80),
            new Tretja.Sport("Sport3",  20),
            new Tretja.Film("Film4",    30),
            new Tretja.Info("Info5",    70),
        });

        System.out.println(program.konec(new Cas(0, 0)));
        System.out.println(program.konec(new Cas(4, 55)));
        System.out.println(program.konec(new Cas(8, 20)));
        System.out.println(program.konec(new Cas(11, 47)));
        System.out.println(program.konec(new Cas(14, 29)));
    }
}
