
import java.util.*;

public class Test03 {

    public static void main(String[] args) {
        Tretja.Mesto mesto = new Tretja.Mesto(29, 28);

        mesto.postavi(26, 15, new Tretja.Poslovna());
        mesto.postavi(16, 25, new Tretja.Stanovanjska(59));
        mesto.postavi(6, 19, new Tretja.Poslovna());
        System.out.println(mesto.steviloStanovanj());
        mesto.postavi(17, 2, new Tretja.Poslovna());
        mesto.postavi(6, 13, new Tretja.Poslovna());
        mesto.postavi(16, 2, new Tretja.Poslovna());
        System.out.println(mesto.steviloStanovanj());
        mesto.postavi(10, 12, new Tretja.Poslovna());
        mesto.postavi(4, 22, new Tretja.Stanovanjska(1));
        System.out.println(mesto.steviloStanovanj());
        mesto.postavi(17, 9, new Tretja.Stanovanjska(57));
        mesto.postavi(3, 11, new Tretja.Stanovanjska(15));
        mesto.postavi(18, 5, new Tretja.Stanovanjska(57));
        mesto.postavi(17, 11, new Tretja.Stanovanjska(68));
        mesto.postavi(14, 1, new Tretja.Stanovanjska(5));
        mesto.postavi(5, 25, new Tretja.Stanovanjska(39));
        mesto.postavi(9, 15, new Tretja.Stanovanjska(93));
        mesto.postavi(19, 4, new Tretja.Stanovanjska(46));
        System.out.println(mesto.steviloStanovanj());
        mesto.postavi(1, 2, new Tretja.Stanovanjska(69));
        mesto.postavi(3, 14, new Tretja.Stanovanjska(100));
        mesto.postavi(17, 3, new Tretja.Poslovna());
        System.out.println(mesto.steviloStanovanj());
        mesto.postavi(15, 0, new Tretja.Stanovanjska(30));
        mesto.postavi(5, 24, new Tretja.Stanovanjska(6));
        System.out.println(mesto.steviloStanovanj());
        mesto.postavi(27, 21, new Tretja.Poslovna());
        System.out.println(mesto.steviloStanovanj());
        mesto.postavi(2, 11, new Tretja.Poslovna());
        mesto.postavi(12, 20, new Tretja.Stanovanjska(25));
        System.out.println(mesto.steviloStanovanj());
        mesto.postavi(2, 20, new Tretja.Stanovanjska(20));
        mesto.postavi(16, 27, new Tretja.Stanovanjska(5));
        System.out.println(mesto.steviloStanovanj());
        mesto.postavi(14, 20, new Tretja.Poslovna());
        System.out.println(mesto.steviloStanovanj());
        mesto.postavi(28, 4, new Tretja.Stanovanjska(65));
        mesto.postavi(7, 4, new Tretja.Stanovanjska(53));
        mesto.postavi(11, 5, new Tretja.Poslovna());
        mesto.postavi(25, 6, new Tretja.Stanovanjska(62));
        mesto.postavi(27, 4, new Tretja.Stanovanjska(42));
        mesto.postavi(10, 25, new Tretja.Poslovna());
        System.out.println(mesto.steviloStanovanj());
        mesto.postavi(12, 15, new Tretja.Poslovna());
        mesto.postavi(26, 20, new Tretja.Stanovanjska(70));
        mesto.postavi(7, 11, new Tretja.Poslovna());
        mesto.postavi(18, 10, new Tretja.Poslovna());
        mesto.postavi(11, 10, new Tretja.Poslovna());
        System.out.println(mesto.steviloStanovanj());
        mesto.postavi(2, 7, new Tretja.Stanovanjska(57));
        mesto.postavi(21, 25, new Tretja.Stanovanjska(7));
        mesto.postavi(2, 1, new Tretja.Poslovna());
        mesto.postavi(16, 21, new Tretja.Stanovanjska(38));
        mesto.postavi(0, 6, new Tretja.Stanovanjska(64));
        mesto.postavi(10, 10, new Tretja.Poslovna());
        mesto.postavi(23, 23, new Tretja.Stanovanjska(55));
        mesto.postavi(17, 16, new Tretja.Stanovanjska(3));
        mesto.postavi(25, 20, new Tretja.Poslovna());
        mesto.postavi(6, 23, new Tretja.Poslovna());
        System.out.println(mesto.steviloStanovanj());
        mesto.postavi(19, 11, new Tretja.Stanovanjska(92));
        mesto.postavi(12, 18, new Tretja.Stanovanjska(75));
        mesto.postavi(4, 11, new Tretja.Poslovna());
        System.out.println(mesto.steviloStanovanj());
        mesto.postavi(19, 18, new Tretja.Poslovna());
        mesto.postavi(20, 18, new Tretja.Stanovanjska(44));
        mesto.postavi(18, 20, new Tretja.Poslovna());
        mesto.postavi(27, 11, new Tretja.Poslovna());
        mesto.postavi(11, 8, new Tretja.Poslovna());
        mesto.postavi(22, 1, new Tretja.Poslovna());
        mesto.postavi(20, 25, new Tretja.Poslovna());
        mesto.postavi(7, 16, new Tretja.Stanovanjska(94));
        mesto.postavi(13, 18, new Tretja.Poslovna());
        mesto.postavi(7, 18, new Tretja.Poslovna());
        mesto.postavi(1, 0, new Tretja.Stanovanjska(16));
        mesto.postavi(1, 9, new Tretja.Stanovanjska(37));
        System.out.println(mesto.steviloStanovanj());
        mesto.postavi(26, 6, new Tretja.Poslovna());
        mesto.postavi(0, 17, new Tretja.Poslovna());
        System.out.println(mesto.steviloStanovanj());
        mesto.postavi(11, 22, new Tretja.Stanovanjska(31));
        System.out.println(mesto.steviloStanovanj());
        mesto.postavi(17, 10, new Tretja.Stanovanjska(41));
        System.out.println(mesto.steviloStanovanj());
        mesto.postavi(26, 27, new Tretja.Poslovna());
        mesto.postavi(1, 17, new Tretja.Stanovanjska(53));
        System.out.println(mesto.steviloStanovanj());
        mesto.postavi(25, 0, new Tretja.Stanovanjska(91));
        System.out.println(mesto.steviloStanovanj());
        mesto.postavi(6, 0, new Tretja.Poslovna());
        mesto.postavi(24, 27, new Tretja.Poslovna());
        mesto.postavi(24, 12, new Tretja.Stanovanjska(33));
        System.out.println(mesto.steviloStanovanj());
        mesto.postavi(24, 22, new Tretja.Stanovanjska(53));
        System.out.println(mesto.steviloStanovanj());
        mesto.postavi(26, 12, new Tretja.Stanovanjska(36));
        mesto.postavi(28, 5, new Tretja.Stanovanjska(32));
        mesto.postavi(7, 1, new Tretja.Poslovna());
        mesto.postavi(19, 1, new Tretja.Stanovanjska(74));
        mesto.postavi(14, 10, new Tretja.Poslovna());
        mesto.postavi(8, 5, new Tretja.Stanovanjska(43));
        mesto.postavi(15, 22, new Tretja.Stanovanjska(98));
        mesto.postavi(26, 21, new Tretja.Stanovanjska(13));
        System.out.println(mesto.steviloStanovanj());
        mesto.postavi(26, 10, new Tretja.Poslovna());
        mesto.postavi(10, 26, new Tretja.Poslovna());
        mesto.postavi(4, 23, new Tretja.Poslovna());
        mesto.postavi(19, 12, new Tretja.Stanovanjska(30));
        mesto.postavi(11, 24, new Tretja.Poslovna());
        System.out.println(mesto.steviloStanovanj());
        mesto.postavi(17, 0, new Tretja.Poslovna());
        mesto.postavi(0, 19, new Tretja.Stanovanjska(62));
        mesto.postavi(5, 6, new Tretja.Stanovanjska(47));
        mesto.postavi(25, 7, new Tretja.Stanovanjska(54));
        mesto.postavi(4, 20, new Tretja.Poslovna());
        mesto.postavi(21, 9, new Tretja.Stanovanjska(36));
        mesto.postavi(28, 1, new Tretja.Poslovna());
        mesto.postavi(3, 4, new Tretja.Stanovanjska(38));
        mesto.postavi(6, 12, new Tretja.Stanovanjska(21));
        mesto.postavi(24, 8, new Tretja.Stanovanjska(20));
        mesto.postavi(15, 9, new Tretja.Stanovanjska(52));
        mesto.postavi(13, 21, new Tretja.Stanovanjska(51));
        mesto.postavi(10, 23, new Tretja.Stanovanjska(83));
        mesto.postavi(4, 16, new Tretja.Poslovna());
        System.out.println(mesto.steviloStanovanj());
        mesto.postavi(7, 21, new Tretja.Stanovanjska(68));
        mesto.postavi(19, 10, new Tretja.Poslovna());
        System.out.println(mesto.steviloStanovanj());
        mesto.postavi(8, 6, new Tretja.Stanovanjska(1));
        System.out.println(mesto.steviloStanovanj());
        mesto.postavi(5, 20, new Tretja.Poslovna());
        mesto.postavi(15, 3, new Tretja.Poslovna());
        mesto.postavi(14, 4, new Tretja.Stanovanjska(92));
        mesto.postavi(2, 16, new Tretja.Stanovanjska(96));
        mesto.postavi(13, 26, new Tretja.Stanovanjska(39));
        System.out.println(mesto.steviloStanovanj());
        mesto.postavi(1, 26, new Tretja.Poslovna());
        mesto.postavi(9, 14, new Tretja.Poslovna());
        mesto.postavi(15, 21, new Tretja.Stanovanjska(31));
        mesto.postavi(20, 15, new Tretja.Poslovna());
        mesto.postavi(25, 18, new Tretja.Stanovanjska(21));
        System.out.println(mesto.steviloStanovanj());
        mesto.postavi(13, 0, new Tretja.Stanovanjska(40));
        mesto.postavi(28, 25, new Tretja.Poslovna());
        mesto.postavi(4, 7, new Tretja.Stanovanjska(30));
        mesto.postavi(19, 15, new Tretja.Poslovna());
        mesto.postavi(19, 7, new Tretja.Stanovanjska(32));
        mesto.postavi(20, 17, new Tretja.Poslovna());
        mesto.postavi(6, 1, new Tretja.Stanovanjska(75));
        mesto.postavi(16, 15, new Tretja.Stanovanjska(21));
        mesto.postavi(2, 26, new Tretja.Stanovanjska(51));
        System.out.println(mesto.steviloStanovanj());
        mesto.postavi(14, 22, new Tretja.Poslovna());
        mesto.postavi(13, 13, new Tretja.Stanovanjska(45));
        System.out.println(mesto.steviloStanovanj());
        mesto.postavi(13, 17, new Tretja.Poslovna());
        System.out.println(mesto.steviloStanovanj());
        mesto.postavi(9, 21, new Tretja.Stanovanjska(30));
        mesto.postavi(20, 23, new Tretja.Stanovanjska(6));
        mesto.postavi(12, 3, new Tretja.Poslovna());
        System.out.println(mesto.steviloStanovanj());
        mesto.postavi(1, 1, new Tretja.Poslovna());
        mesto.postavi(8, 23, new Tretja.Stanovanjska(69));
        System.out.println(mesto.steviloStanovanj());
        mesto.postavi(4, 1, new Tretja.Stanovanjska(76));
        System.out.println(mesto.steviloStanovanj());
        mesto.postavi(11, 23, new Tretja.Stanovanjska(27));
        mesto.postavi(14, 2, new Tretja.Poslovna());
        mesto.postavi(4, 14, new Tretja.Poslovna());
        mesto.postavi(1, 16, new Tretja.Poslovna());
        mesto.postavi(0, 9, new Tretja.Stanovanjska(75));
        mesto.postavi(4, 4, new Tretja.Poslovna());
        mesto.postavi(0, 1, new Tretja.Stanovanjska(97));
        mesto.postavi(15, 18, new Tretja.Poslovna());
        mesto.postavi(7, 12, new Tretja.Stanovanjska(100));
        mesto.postavi(15, 2, new Tretja.Stanovanjska(65));
        System.out.println(mesto.steviloStanovanj());
        mesto.postavi(16, 17, new Tretja.Poslovna());
        mesto.postavi(18, 14, new Tretja.Stanovanjska(46));
        mesto.postavi(11, 20, new Tretja.Poslovna());
        mesto.postavi(12, 7, new Tretja.Stanovanjska(92));
        mesto.postavi(17, 24, new Tretja.Stanovanjska(84));
        System.out.println(mesto.steviloStanovanj());
        mesto.postavi(15, 16, new Tretja.Poslovna());
        mesto.postavi(6, 6, new Tretja.Poslovna());
        mesto.postavi(5, 17, new Tretja.Poslovna());
        System.out.println(mesto.steviloStanovanj());
        mesto.postavi(12, 22, new Tretja.Poslovna());
        mesto.postavi(16, 20, new Tretja.Poslovna());
        mesto.postavi(22, 3, new Tretja.Stanovanjska(70));
        System.out.println(mesto.steviloStanovanj());
        mesto.postavi(5, 18, new Tretja.Poslovna());
        System.out.println(mesto.steviloStanovanj());
        mesto.postavi(28, 21, new Tretja.Stanovanjska(11));
        mesto.postavi(27, 25, new Tretja.Stanovanjska(74));
        mesto.postavi(25, 22, new Tretja.Poslovna());
        mesto.postavi(20, 11, new Tretja.Stanovanjska(68));
        mesto.postavi(3, 7, new Tretja.Stanovanjska(60));
        mesto.postavi(17, 7, new Tretja.Stanovanjska(76));
        mesto.postavi(19, 16, new Tretja.Stanovanjska(12));
        System.out.println(mesto.steviloStanovanj());
        mesto.postavi(10, 19, new Tretja.Poslovna());
        mesto.postavi(4, 17, new Tretja.Stanovanjska(87));
        mesto.postavi(27, 26, new Tretja.Poslovna());
        System.out.println(mesto.steviloStanovanj());
        mesto.postavi(10, 15, new Tretja.Stanovanjska(38));
        mesto.postavi(12, 1, new Tretja.Stanovanjska(35));
        mesto.postavi(25, 19, new Tretja.Poslovna());
        mesto.postavi(28, 26, new Tretja.Poslovna());
        mesto.postavi(11, 7, new Tretja.Stanovanjska(72));
        mesto.postavi(23, 17, new Tretja.Stanovanjska(98));
        mesto.postavi(24, 23, new Tretja.Poslovna());
        System.out.println(mesto.steviloStanovanj());
        mesto.postavi(9, 18, new Tretja.Stanovanjska(26));
        mesto.postavi(7, 14, new Tretja.Stanovanjska(77));
        mesto.postavi(26, 9, new Tretja.Stanovanjska(65));
        mesto.postavi(28, 15, new Tretja.Stanovanjska(84));
        mesto.postavi(28, 7, new Tretja.Stanovanjska(61));
        mesto.postavi(14, 18, new Tretja.Poslovna());
        mesto.postavi(13, 7, new Tretja.Poslovna());
        mesto.postavi(23, 22, new Tretja.Poslovna());
        mesto.postavi(12, 6, new Tretja.Stanovanjska(73));
        mesto.postavi(23, 24, new Tretja.Poslovna());
        mesto.postavi(18, 8, new Tretja.Poslovna());
        System.out.println(mesto.steviloStanovanj());
        mesto.postavi(24, 21, new Tretja.Stanovanjska(94));
        System.out.println(mesto.steviloStanovanj());
        mesto.postavi(22, 2, new Tretja.Poslovna());
        mesto.postavi(24, 24, new Tretja.Poslovna());
        mesto.postavi(21, 18, new Tretja.Poslovna());
        mesto.postavi(17, 4, new Tretja.Stanovanjska(91));
        System.out.println(mesto.steviloStanovanj());
        mesto.postavi(20, 20, new Tretja.Stanovanjska(71));
        mesto.postavi(8, 24, new Tretja.Poslovna());
        System.out.println(mesto.steviloStanovanj());
        mesto.postavi(26, 25, new Tretja.Poslovna());
        mesto.postavi(8, 9, new Tretja.Poslovna());
        mesto.postavi(26, 1, new Tretja.Poslovna());
        mesto.postavi(2, 3, new Tretja.Poslovna());
        System.out.println(mesto.steviloStanovanj());
        mesto.postavi(17, 23, new Tretja.Poslovna());
        mesto.postavi(12, 27, new Tretja.Stanovanjska(16));
        System.out.println(mesto.steviloStanovanj());
        mesto.postavi(15, 20, new Tretja.Stanovanjska(90));
        System.out.println(mesto.steviloStanovanj());
        mesto.postavi(17, 12, new Tretja.Stanovanjska(16));
        System.out.println(mesto.steviloStanovanj());
        mesto.postavi(4, 10, new Tretja.Stanovanjska(52));
        System.out.println(mesto.steviloStanovanj());
        mesto.postavi(2, 24, new Tretja.Poslovna());
        mesto.postavi(19, 24, new Tretja.Poslovna());
        mesto.postavi(18, 15, new Tretja.Stanovanjska(32));
        mesto.postavi(27, 18, new Tretja.Poslovna());
        System.out.println(mesto.steviloStanovanj());
        mesto.postavi(0, 14, new Tretja.Poslovna());
        mesto.postavi(16, 10, new Tretja.Stanovanjska(85));
        mesto.postavi(18, 12, new Tretja.Poslovna());
        System.out.println(mesto.steviloStanovanj());
        mesto.postavi(4, 2, new Tretja.Poslovna());
        mesto.postavi(5, 4, new Tretja.Stanovanjska(89));
        mesto.postavi(24, 20, new Tretja.Stanovanjska(92));
        mesto.postavi(1, 14, new Tretja.Poslovna());
        mesto.postavi(13, 25, new Tretja.Poslovna());
        mesto.postavi(15, 26, new Tretja.Poslovna());
        mesto.postavi(13, 27, new Tretja.Poslovna());
        System.out.println(mesto.steviloStanovanj());
        mesto.postavi(26, 18, new Tretja.Stanovanjska(14));
        System.out.println(mesto.steviloStanovanj());
        mesto.postavi(19, 9, new Tretja.Poslovna());
        mesto.postavi(10, 8, new Tretja.Poslovna());
        mesto.postavi(7, 10, new Tretja.Stanovanjska(28));
        mesto.postavi(23, 10, new Tretja.Stanovanjska(28));
        System.out.println(mesto.steviloStanovanj());
        mesto.postavi(14, 21, new Tretja.Poslovna());
        mesto.postavi(23, 18, new Tretja.Stanovanjska(73));
        mesto.postavi(23, 15, new Tretja.Poslovna());
        System.out.println(mesto.steviloStanovanj());
        mesto.postavi(25, 10, new Tretja.Poslovna());
        mesto.postavi(0, 0, new Tretja.Stanovanjska(90));
        mesto.postavi(15, 7, new Tretja.Stanovanjska(47));
        System.out.println(mesto.steviloStanovanj());
        mesto.postavi(25, 2, new Tretja.Stanovanjska(28));
        mesto.postavi(3, 24, new Tretja.Stanovanjska(3));
        mesto.postavi(5, 22, new Tretja.Poslovna());
        mesto.postavi(22, 17, new Tretja.Stanovanjska(78));
        System.out.println(mesto.steviloStanovanj());
        mesto.postavi(22, 5, new Tretja.Stanovanjska(52));
        System.out.println(mesto.steviloStanovanj());
        mesto.postavi(21, 4, new Tretja.Stanovanjska(48));
        mesto.postavi(1, 5, new Tretja.Stanovanjska(42));
        System.out.println(mesto.steviloStanovanj());
    }
}
