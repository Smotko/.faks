
import java.util.*;

public class Test05 {

    public static void main(String[] args) {
        Tretja.Program program = new Tretja.Program(new Tretja.Oddaja[]{
            new Tretja.Film("JGNVCc", 9),
            new Tretja.Film("I73L6Dy", 14),
            new Tretja.Sport("DKVjNN5", 12),
            new Tretja.Info("dGbOnnB", 15),
            new Tretja.Sport("hDRTndp", 21),
            new Tretja.Film("EkmoId", 23),
            new Tretja.Sport("oOxTFm", 17),
            new Tretja.Film("qpTdOQH", 4),
            new Tretja.Info("tcwFC", 9),
            new Tretja.Info("d08ABVC", 3),
            new Tretja.Film("Pc50l", 20),
            new Tretja.Info("LwyJShF", 7),
            new Tretja.Info("xcJ5PG", 21),
            new Tretja.Info("LTq2Rxn", 23),
            new Tretja.Film("GGm5CF", 6),
            new Tretja.Sport("Se5iQ7", 2),
            new Tretja.Sport("6DceAc", 14),
            new Tretja.Sport("wpiNr8P", 2),
            new Tretja.Film("fYAQCdv", 10),
            new Tretja.Sport("56bdPGq", 17),
            new Tretja.Info("sAahA0", 13),
            new Tretja.Info("rGB4QFQ", 7),
            new Tretja.Info("bw2JS62", 19),
            new Tretja.Sport("Mrk14V", 10),
            new Tretja.Film("v0txJ", 13),
            new Tretja.Sport("s2UgVbj", 22),
            new Tretja.Info("ucwPyS", 17),
            new Tretja.Film("3HpTMF", 21),
            new Tretja.Info("ORYB0m", 21),
            new Tretja.Film("g3wtf4", 5),
            new Tretja.Sport("0QoVWc", 2),
            new Tretja.Sport("IhvChT2", 8),
            new Tretja.Sport("hwoDaM", 4),
            new Tretja.Film("6VC30", 13),
            new Tretja.Film("REURPF", 5),
            new Tretja.Sport("xEncDE", 12),
            new Tretja.Info("dlk3x", 8),
            new Tretja.Film("4tUg1C", 18),
            new Tretja.Film("gxXPDpO", 13),
            new Tretja.Film("epy4ySV", 3),
            new Tretja.Film("DAgEGk", 23),
            new Tretja.Info("NkSg1", 12),
            new Tretja.Info("rBYvg6", 19),
        });

        Tretja.Film film = program.zadnjiFilm();
        System.out.println(film);
    }
}
