
import java.util.*;

public class Test03 {

    public static void main(String[] args) {
        Tretja.Program program = new Tretja.Program(new Tretja.Oddaja[]{
            new Tretja.Info("3wLYWt6", 48),
            new Tretja.Film("0JvPaMo", 27),
            new Tretja.Info("bjVdl", 17),
            new Tretja.Info("yJvts4", 16),
            new Tretja.Film("2AnGay", 47),
            new Tretja.Info("nHwdbM", 52),
            new Tretja.Film("FBJcDX", 33),
            new Tretja.Info("oPQpP", 23),
            new Tretja.Film("VC8vtxg", 51),
            new Tretja.Film("nJo7i2", 52),
            new Tretja.Film("1WkHQ", 50),
            new Tretja.Sport("AVGgfJl", 1),
            new Tretja.Info("RWo5OQ", 23),
            new Tretja.Info("wxgrJ", 35),
            new Tretja.Info("COXUQ", 47),
            new Tretja.Info("oV14h", 1),
            new Tretja.Sport("TL6oB", 12),
            new Tretja.Info("XMWvA8", 41),
            new Tretja.Info("61VsHe", 26),
        });

        System.out.println(program.konec(new Cas(3, 38)));
        System.out.println(program.konec(new Cas(1, 32)));
        System.out.println(program.konec(new Cas(8, 50)));
        System.out.println(program.konec(new Cas(12, 55)));
        System.out.println(program.konec(new Cas(1, 10)));
    }
}
