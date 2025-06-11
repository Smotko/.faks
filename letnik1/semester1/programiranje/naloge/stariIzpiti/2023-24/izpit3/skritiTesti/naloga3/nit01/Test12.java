
import java.util.*;

public class Test12 {

    public static void main(String[] args) {
        Tretja.Program program = new Tretja.Program(new Tretja.Oddaja[]{
            new Tretja.Info("vrfO0", 29),
            new Tretja.Info("Yqv8hha", 41),
            new Tretja.Info("EROwW8", 33),
            new Tretja.Info("kavAUn", 3),
            new Tretja.Sport("OvO4Y", 41),
            new Tretja.Film("EuqNY", 18),
            new Tretja.Sport("E0ujxVe", 39),
            new Tretja.Sport("sCASsqc", 10),
            new Tretja.Sport("uI5eO", 24),
            new Tretja.Film("tOdCC", 20),
            new Tretja.Info("sPsO4", 5),
            new Tretja.Film("LsPDj", 34),
            new Tretja.Info("nQdSeP", 15),
            new Tretja.Sport("ujl14dN", 30),
            new Tretja.Film("rxUIqiS", 45),
            new Tretja.Info("pCCKA", 2),
            new Tretja.Sport("qOtywe", 18),
            new Tretja.Sport("pyyBK", 38),
            new Tretja.Film("twWbNIU", 30),
            new Tretja.Info("EMoSg", 33),
            new Tretja.Info("Uhwxa", 10),
            new Tretja.Sport("447FQ", 18),
        });

        System.out.println(program.konec(new Cas(2, 3)));
        System.out.println(program.konec(new Cas(3, 1)));
        System.out.println(program.konec(new Cas(8, 5)));
        System.out.println(program.konec(new Cas(12, 50)));
        System.out.println(program.konec(new Cas(5, 13)));
    }
}
