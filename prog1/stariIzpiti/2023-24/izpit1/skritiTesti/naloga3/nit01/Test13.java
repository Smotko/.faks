
import java.util.*;

public class Test13 {

    public static void main(String[] args) {

        Tretja.Dogodek[] dogodki = {
            new Tretja.Rekreacija(44, new Cas(0, 7), true),
            new Tretja.Rekreacija(21, new Cas(0, 25), true),
            new Tretja.Malica(25, new Cas(0, 31), true),
            new Tretja.Rekreacija(1, new Cas(0, 43), true),
            new Tretja.Rekreacija(24, new Cas(0, 46), true),
            new Tretja.Rekreacija(2, new Cas(0, 51), true),
            new Tretja.Malica(9, new Cas(0, 52), true),
            new Tretja.Rekreacija(43, new Cas(0, 52), true),
            new Tretja.Rekreacija(0, new Cas(0, 56), true),
            new Tretja.Rekreacija(44, new Cas(0, 57), false),
            new Tretja.Rekreacija(38, new Cas(1, 3), true),
            new Tretja.Malica(9, new Cas(1, 9), false),
            new Tretja.SluzbenaPot(14, new Cas(1, 19), true),
            new Tretja.Rekreacija(41, new Cas(1, 34), true),
            new Tretja.Rekreacija(12, new Cas(1, 39), true),
            new Tretja.Malica(32, new Cas(1, 43), true),
            new Tretja.SluzbenaPot(15, new Cas(1, 47), true),
            new Tretja.SluzbenaPot(9, new Cas(1, 58), true),
            new Tretja.Malica(30, new Cas(2, 3), true),
            new Tretja.Rekreacija(3, new Cas(2, 4), true),
            new Tretja.SluzbenaPot(34, new Cas(2, 9), true),
            new Tretja.SluzbenaPot(18, new Cas(2, 11), true),
            new Tretja.SluzbenaPot(28, new Cas(2, 14), true),
            new Tretja.Rekreacija(21, new Cas(2, 15), false),
            new Tretja.SluzbenaPot(37, new Cas(2, 19), true),
            new Tretja.Malica(17, new Cas(2, 40), true),
            new Tretja.SluzbenaPot(46, new Cas(2, 40), true),
            new Tretja.Rekreacija(20, new Cas(2, 41), true),
            new Tretja.Rekreacija(38, new Cas(2, 47), false),
            new Tretja.Rekreacija(35, new Cas(2, 50), true),
            new Tretja.Malica(10, new Cas(2, 58), true),
            new Tretja.Malica(6, new Cas(3, 19), true),
            new Tretja.Rekreacija(38, new Cas(3, 47), true),
            new Tretja.Rekreacija(48, new Cas(3, 52), true),
            new Tretja.Rekreacija(8, new Cas(4, 4), true),
            new Tretja.SluzbenaPot(33, new Cas(4, 11), true),
            new Tretja.Rekreacija(5, new Cas(4, 18), true),
            new Tretja.Malica(47, new Cas(4, 58), true),
            new Tretja.Malica(17, new Cas(5, 8), false),
            new Tretja.SluzbenaPot(36, new Cas(5, 9), true),
            new Tretja.Malica(16, new Cas(5, 15), true),
            new Tretja.Malica(42, new Cas(5, 15), true),
            new Tretja.SluzbenaPot(23, new Cas(5, 17), true),
            new Tretja.SluzbenaPot(26, new Cas(5, 20), true),
            new Tretja.Rekreacija(44, new Cas(5, 27), true),
            new Tretja.SluzbenaPot(39, new Cas(5, 30), true),
            new Tretja.Rekreacija(17, new Cas(5, 31), true),
            new Tretja.SluzbenaPot(4, new Cas(5, 31), true),
            new Tretja.SluzbenaPot(27, new Cas(5, 39), true),
            new Tretja.SluzbenaPot(49, new Cas(5, 41), true),
            new Tretja.SluzbenaPot(36, new Cas(5, 47), false),
            new Tretja.Rekreacija(11, new Cas(5, 48), true),
            new Tretja.Malica(7, new Cas(5, 48), true),
            new Tretja.Malica(21, new Cas(5, 53), true),
            new Tretja.Rekreacija(13, new Cas(5, 56), true),
            new Tretja.Rekreacija(2, new Cas(6, 2), false),
            new Tretja.SluzbenaPot(33, new Cas(6, 10), false),
            new Tretja.Rekreacija(29, new Cas(6, 11), true),
            new Tretja.Rekreacija(31, new Cas(6, 23), true),
            new Tretja.Malica(21, new Cas(6, 38), false),
            new Tretja.Rekreacija(5, new Cas(6, 48), false),
            new Tretja.SluzbenaPot(40, new Cas(6, 58), true),
            new Tretja.Malica(16, new Cas(6, 58), false),
            new Tretja.Rekreacija(3, new Cas(7, 7), false),
            new Tretja.SluzbenaPot(45, new Cas(7, 12), true),
            new Tretja.SluzbenaPot(19, new Cas(7, 19), true),
            new Tretja.SluzbenaPot(16, new Cas(7, 24), true),
            new Tretja.SluzbenaPot(9, new Cas(7, 27), false),
            new Tretja.Rekreacija(2, new Cas(7, 36), true),
            new Tretja.Rekreacija(44, new Cas(7, 40), false),
            new Tretja.SluzbenaPot(22, new Cas(7, 41), true),
            new Tretja.SluzbenaPot(37, new Cas(7, 54), false),
            new Tretja.Rekreacija(33, new Cas(7, 54), true),
            new Tretja.SluzbenaPot(28, new Cas(8, 0), false),
            new Tretja.Malica(3, new Cas(8, 5), true),
            new Tretja.SluzbenaPot(28, new Cas(8, 14), true),
            new Tretja.SluzbenaPot(21, new Cas(8, 16), true),
            new Tretja.Rekreacija(29, new Cas(8, 24), false),
            new Tretja.Rekreacija(37, new Cas(8, 25), true),
            new Tretja.Rekreacija(1, new Cas(8, 27), false),
            new Tretja.Malica(1, new Cas(8, 36), true),
            new Tretja.Rekreacija(48, new Cas(8, 45), false),
            new Tretja.Rekreacija(0, new Cas(8, 48), false),
            new Tretja.SluzbenaPot(39, new Cas(8, 49), false),
            new Tretja.Malica(10, new Cas(8, 58), false),
            new Tretja.Malica(44, new Cas(9, 8), true),
            new Tretja.Malica(0, new Cas(9, 11), true),
            new Tretja.Malica(36, new Cas(9, 23), true),
            new Tretja.Rekreacija(48, new Cas(9, 24), true),
            new Tretja.SluzbenaPot(45, new Cas(9, 26), false),
            new Tretja.Malica(44, new Cas(9, 35), false),
            new Tretja.Rekreacija(17, new Cas(9, 41), false),
            new Tretja.Rekreacija(8, new Cas(9, 50), false),
            new Tretja.SluzbenaPot(17, new Cas(9, 58), true),
            new Tretja.Malica(39, new Cas(9, 59), true),
            new Tretja.Rekreacija(8, new Cas(10, 15), true),
            new Tretja.Rekreacija(44, new Cas(10, 24), true),
            new Tretja.SluzbenaPot(45, new Cas(10, 43), true),
            new Tretja.SluzbenaPot(4, new Cas(10, 45), false),
            new Tretja.SluzbenaPot(10, new Cas(10, 46), true),
            new Tretja.Malica(7, new Cas(10, 48), false),
            new Tretja.SluzbenaPot(29, new Cas(11, 3), true),
            new Tretja.Rekreacija(38, new Cas(11, 7), false),
            new Tretja.SluzbenaPot(9, new Cas(11, 11), true),
            new Tretja.Rekreacija(33, new Cas(11, 15), false),
            new Tretja.SluzbenaPot(10, new Cas(11, 25), false),
            new Tretja.Rekreacija(4, new Cas(11, 25), true),
            new Tretja.Malica(25, new Cas(11, 31), false),
            new Tretja.SluzbenaPot(17, new Cas(11, 38), false),
            new Tretja.Rekreacija(5, new Cas(11, 45), true),
            new Tretja.Rekreacija(7, new Cas(11, 45), true),
            new Tretja.Rekreacija(25, new Cas(11, 51), true),
            new Tretja.SluzbenaPot(17, new Cas(11, 55), true),
            new Tretja.SluzbenaPot(29, new Cas(12, 3), false),
            new Tretja.Rekreacija(31, new Cas(12, 15), false),
            new Tretja.Malica(38, new Cas(12, 17), true),
            new Tretja.Rekreacija(10, new Cas(12, 32), true),
            new Tretja.SluzbenaPot(17, new Cas(12, 47), false),
            new Tretja.Rekreacija(8, new Cas(12, 57), false),
            new Tretja.SluzbenaPot(16, new Cas(13, 4), false),
            new Tretja.SluzbenaPot(18, new Cas(13, 15), false),
            new Tretja.Rekreacija(29, new Cas(13, 20), true),
            new Tretja.SluzbenaPot(28, new Cas(13, 22), false),
            new Tretja.Malica(3, new Cas(13, 28), false),
            new Tretja.Malica(31, new Cas(13, 29), true),
            new Tretja.Rekreacija(18, new Cas(13, 33), true),
            new Tretja.Rekreacija(5, new Cas(13, 43), false),
            new Tretja.Malica(0, new Cas(13, 43), false),
            new Tretja.SluzbenaPot(9, new Cas(13, 49), false),
            new Tretja.Malica(47, new Cas(14, 2), false),
            new Tretja.Rekreacija(9, new Cas(14, 8), true),
            new Tretja.Rekreacija(41, new Cas(14, 11), false),
            new Tretja.Malica(33, new Cas(14, 12), true),
            new Tretja.Rekreacija(17, new Cas(14, 14), true),
            new Tretja.SluzbenaPot(23, new Cas(14, 16), false),
            new Tretja.SluzbenaPot(15, new Cas(14, 19), false),
            new Tretja.Rekreacija(0, new Cas(14, 28), true),
            new Tretja.Malica(5, new Cas(14, 37), true),
            new Tretja.SluzbenaPot(41, new Cas(14, 48), true),
            new Tretja.Malica(32, new Cas(14, 55), false),
            new Tretja.Rekreacija(17, new Cas(14, 57), false),
            new Tretja.Rekreacija(11, new Cas(14, 59), false),
            new Tretja.SluzbenaPot(8, new Cas(15, 3), true),
            new Tretja.Malica(36, new Cas(15, 4), false),
            new Tretja.Malica(23, new Cas(15, 10), true),
            new Tretja.SluzbenaPot(41, new Cas(15, 13), false),
            new Tretja.Rekreacija(13, new Cas(15, 17), false),
            new Tretja.SluzbenaPot(32, new Cas(15, 18), true),
            new Tretja.SluzbenaPot(45, new Cas(15, 34), false),
            new Tretja.Rekreacija(15, new Cas(15, 39), true),
            new Tretja.Rekreacija(7, new Cas(15, 41), false),
            new Tretja.SluzbenaPot(14, new Cas(15, 45), false),
            new Tretja.Rekreacija(3, new Cas(15, 56), true),
            new Tretja.SluzbenaPot(49, new Cas(15, 56), false),
            new Tretja.Malica(38, new Cas(16, 15), false),
            new Tretja.SluzbenaPot(19, new Cas(16, 19), false),
            new Tretja.SluzbenaPot(34, new Cas(16, 23), false),
            new Tretja.Rekreacija(37, new Cas(16, 34), false),
            new Tretja.Malica(6, new Cas(16, 34), false),
            new Tretja.Rekreacija(43, new Cas(16, 34), false),
            new Tretja.Rekreacija(10, new Cas(16, 44), false),
            new Tretja.SluzbenaPot(7, new Cas(16, 46), true),
            new Tretja.Malica(1, new Cas(16, 54), false),
            new Tretja.Malica(28, new Cas(17, 1), true),
            new Tretja.SluzbenaPot(10, new Cas(17, 1), true),
            new Tretja.SluzbenaPot(41, new Cas(17, 8), true),
            new Tretja.SluzbenaPot(47, new Cas(17, 8), true),
            new Tretja.Malica(34, new Cas(17, 15), true),
            new Tretja.Rekreacija(17, new Cas(17, 22), true),
            new Tretja.Rekreacija(17, new Cas(17, 37), false),
            new Tretja.SluzbenaPot(8, new Cas(17, 51), false),
            new Tretja.SluzbenaPot(27, new Cas(17, 54), false),
            new Tretja.Rekreacija(16, new Cas(18, 0), true),
            new Tretja.SluzbenaPot(8, new Cas(18, 9), true),
            new Tretja.SluzbenaPot(43, new Cas(18, 13), true),
            new Tretja.SluzbenaPot(14, new Cas(18, 14), true),
            new Tretja.Rekreacija(20, new Cas(18, 15), false),
            new Tretja.SluzbenaPot(8, new Cas(18, 24), false),
            new Tretja.SluzbenaPot(7, new Cas(18, 27), false),
            new Tretja.Malica(34, new Cas(18, 37), false),
            new Tretja.SluzbenaPot(45, new Cas(18, 40), true),
            new Tretja.Rekreacija(20, new Cas(18, 41), true),
            new Tretja.Malica(23, new Cas(18, 44), false),
            new Tretja.SluzbenaPot(41, new Cas(18, 45), false),
            new Tretja.SluzbenaPot(10, new Cas(18, 56), false),
            new Tretja.Rekreacija(18, new Cas(18, 57), false),
            new Tretja.Rekreacija(0, new Cas(19, 4), false),
            new Tretja.SluzbenaPot(45, new Cas(19, 12), false),
            new Tretja.SluzbenaPot(47, new Cas(19, 15), false),
            new Tretja.Malica(13, new Cas(19, 23), true),
            new Tretja.Rekreacija(17, new Cas(19, 30), true),
            new Tretja.SluzbenaPot(36, new Cas(19, 31), true),
            new Tretja.SluzbenaPot(26, new Cas(19, 44), false),
            new Tretja.Rekreacija(29, new Cas(19, 46), false),
            new Tretja.Rekreacija(3, new Cas(20, 2), false),
            new Tretja.Malica(13, new Cas(20, 5), false),
            new Tretja.Rekreacija(4, new Cas(20, 13), false),
            new Tretja.Malica(26, new Cas(20, 24), true),
            new Tretja.Rekreacija(17, new Cas(20, 52), false),
            new Tretja.SluzbenaPot(46, new Cas(20, 56), false),
            new Tretja.Rekreacija(25, new Cas(20, 57), false),
            new Tretja.Malica(33, new Cas(21, 1), false),
            new Tretja.Malica(30, new Cas(21, 16), false),
            new Tretja.Malica(26, new Cas(21, 26), false),
            new Tretja.Malica(39, new Cas(21, 30), false),
            new Tretja.Malica(5, new Cas(21, 32), false),
            new Tretja.SluzbenaPot(43, new Cas(21, 32), false),
            new Tretja.Malica(37, new Cas(21, 41), true),
            new Tretja.SluzbenaPot(32, new Cas(21, 42), false),
            new Tretja.SluzbenaPot(22, new Cas(21, 54), false),
            new Tretja.Rekreacija(15, new Cas(21, 56), false),
            new Tretja.SluzbenaPot(21, new Cas(21, 56), false),
            new Tretja.Malica(28, new Cas(22, 13), false),
            new Tretja.SluzbenaPot(40, new Cas(22, 23), false),
            new Tretja.Rekreacija(16, new Cas(22, 33), false),
            new Tretja.Malica(42, new Cas(22, 33), false),
            new Tretja.Rekreacija(24, new Cas(22, 37), false),
            new Tretja.Rekreacija(20, new Cas(22, 47), false),
            new Tretja.Rekreacija(35, new Cas(22, 56), false),
            new Tretja.Rekreacija(12, new Cas(23, 1), false),
            new Tretja.Rekreacija(44, new Cas(23, 1), false),
            new Tretja.Malica(37, new Cas(23, 2), false),
            new Tretja.Rekreacija(9, new Cas(23, 5), false),
            new Tretja.Rekreacija(2, new Cas(23, 8), false),
            new Tretja.SluzbenaPot(14, new Cas(23, 21), false),
            new Tretja.Rekreacija(48, new Cas(23, 41), false),
            new Tretja.Malica(31, new Cas(23, 51), false),
            new Tretja.SluzbenaPot(36, new Cas(23, 53), false),
        };

        int stZaposlenih = 50;
        Tretja.Dnevnik dnevnik = new Tretja.Dnevnik(stZaposlenih, dogodki);

        System.out.println(dnevnik.steviloMalicarjev());
        System.out.println();
    }
}