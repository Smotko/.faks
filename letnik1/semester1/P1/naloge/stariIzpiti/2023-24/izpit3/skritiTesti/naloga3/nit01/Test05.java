
import java.util.*;

public class Test05 {

    public static void main(String[] args) {
        Tretja.Program program = new Tretja.Program(new Tretja.Oddaja[]{
            new Tretja.Info("CIO8W", 32),
            new Tretja.Info("NG4HTWm", 50),
            new Tretja.Sport("DNogJm", 12),
            new Tretja.Film("0kdTun4", 10),
            new Tretja.Film("seeIuRm", 40),
            new Tretja.Info("g2Irk", 10),
            new Tretja.Film("K2BVQ", 18),
            new Tretja.Film("pK8p6", 19),
            new Tretja.Sport("wx8DH6D", 36),
            new Tretja.Info("Cdli3l", 36),
            new Tretja.Film("WGXvc", 44),
            new Tretja.Film("BOJrYa", 52),
            new Tretja.Film("MUSDD", 47),
            new Tretja.Info("G7puBc", 25),
            new Tretja.Info("eF1njKM", 34),
            new Tretja.Sport("Mj7Vyx", 33),
            new Tretja.Sport("Y8fSm", 11),
            new Tretja.Info("lS5cf", 50),
            new Tretja.Film("LDdHJow", 15),
        });

        System.out.println(program.konec(new Cas(9, 34)));
        System.out.println(program.konec(new Cas(3, 39)));
        System.out.println(program.konec(new Cas(8, 44)));
        System.out.println(program.konec(new Cas(9, 41)));
        System.out.println(program.konec(new Cas(12, 26)));
    }
}
