
import java.util.*;

public class Test01 {

    public static void main(String[] args) {
        Tretja.Mesto mesto = new Tretja.Mesto(26, 19);

        mesto.postavi(23, 13, new Tretja.Stanovanjska(20));
        mesto.postavi(9, 4, new Tretja.Stanovanjska(74));
        System.out.println(mesto.steviloStanovanj());
        mesto.postavi(10, 6, new Tretja.Poslovna());
        mesto.postavi(16, 4, new Tretja.Stanovanjska(28));
        System.out.println(mesto.steviloStanovanj());
        mesto.postavi(23, 0, new Tretja.Stanovanjska(14));
        mesto.postavi(19, 3, new Tretja.Poslovna());
        System.out.println(mesto.steviloStanovanj());
        mesto.postavi(16, 9, new Tretja.Poslovna());
        mesto.postavi(23, 15, new Tretja.Stanovanjska(17));
        System.out.println(mesto.steviloStanovanj());
        mesto.postavi(11, 14, new Tretja.Poslovna());
        mesto.postavi(1, 6, new Tretja.Stanovanjska(30));
        mesto.postavi(3, 0, new Tretja.Stanovanjska(68));
        mesto.postavi(25, 17, new Tretja.Stanovanjska(65));
        System.out.println(mesto.steviloStanovanj());
        mesto.postavi(12, 3, new Tretja.Poslovna());
        mesto.postavi(23, 14, new Tretja.Stanovanjska(36));
        mesto.postavi(2, 14, new Tretja.Poslovna());
        System.out.println(mesto.steviloStanovanj());
        mesto.postavi(21, 12, new Tretja.Stanovanjska(11));
        mesto.postavi(10, 10, new Tretja.Poslovna());
        System.out.println(mesto.steviloStanovanj());
        mesto.postavi(11, 11, new Tretja.Poslovna());
        System.out.println(mesto.steviloStanovanj());
        mesto.postavi(11, 10, new Tretja.Stanovanjska(59));
        mesto.postavi(2, 13, new Tretja.Stanovanjska(72));
        mesto.postavi(25, 10, new Tretja.Poslovna());
        System.out.println(mesto.steviloStanovanj());
        mesto.postavi(24, 10, new Tretja.Poslovna());
        System.out.println(mesto.steviloStanovanj());
        mesto.postavi(20, 10, new Tretja.Poslovna());
        System.out.println(mesto.steviloStanovanj());
        mesto.postavi(13, 16, new Tretja.Poslovna());
        mesto.postavi(22, 18, new Tretja.Stanovanjska(31));
        System.out.println(mesto.steviloStanovanj());
        mesto.postavi(24, 16, new Tretja.Poslovna());
        System.out.println(mesto.steviloStanovanj());
        mesto.postavi(12, 0, new Tretja.Poslovna());
        mesto.postavi(9, 9, new Tretja.Stanovanjska(85));
        mesto.postavi(23, 2, new Tretja.Poslovna());
        mesto.postavi(17, 10, new Tretja.Stanovanjska(86));
        mesto.postavi(0, 0, new Tretja.Stanovanjska(89));
        System.out.println(mesto.steviloStanovanj());
        mesto.postavi(11, 18, new Tretja.Poslovna());
        mesto.postavi(20, 0, new Tretja.Stanovanjska(8));
        mesto.postavi(9, 5, new Tretja.Poslovna());
        mesto.postavi(20, 7, new Tretja.Stanovanjska(12));
        mesto.postavi(10, 1, new Tretja.Stanovanjska(71));
        mesto.postavi(10, 17, new Tretja.Poslovna());
        mesto.postavi(18, 4, new Tretja.Poslovna());
        System.out.println(mesto.steviloStanovanj());
        mesto.postavi(3, 2, new Tretja.Stanovanjska(95));
        mesto.postavi(3, 15, new Tretja.Stanovanjska(52));
        mesto.postavi(25, 5, new Tretja.Poslovna());
        System.out.println(mesto.steviloStanovanj());
        mesto.postavi(10, 0, new Tretja.Stanovanjska(96));
        mesto.postavi(14, 12, new Tretja.Stanovanjska(29));
        mesto.postavi(21, 11, new Tretja.Poslovna());
        mesto.postavi(19, 12, new Tretja.Poslovna());
        mesto.postavi(17, 6, new Tretja.Stanovanjska(96));
        System.out.println(mesto.steviloStanovanj());
        mesto.postavi(22, 8, new Tretja.Stanovanjska(69));
        System.out.println(mesto.steviloStanovanj());
        mesto.postavi(18, 16, new Tretja.Poslovna());
        mesto.postavi(4, 15, new Tretja.Stanovanjska(6));
        mesto.postavi(7, 7, new Tretja.Poslovna());
        mesto.postavi(14, 13, new Tretja.Stanovanjska(34));
        System.out.println(mesto.steviloStanovanj());
        mesto.postavi(5, 8, new Tretja.Stanovanjska(24));
        System.out.println(mesto.steviloStanovanj());
        mesto.postavi(16, 5, new Tretja.Stanovanjska(74));
        mesto.postavi(0, 2, new Tretja.Stanovanjska(64));
        mesto.postavi(19, 8, new Tretja.Poslovna());
        mesto.postavi(9, 2, new Tretja.Poslovna());
        System.out.println(mesto.steviloStanovanj());
        mesto.postavi(15, 8, new Tretja.Poslovna());
        System.out.println(mesto.steviloStanovanj());
        mesto.postavi(8, 3, new Tretja.Stanovanjska(36));
        System.out.println(mesto.steviloStanovanj());
        mesto.postavi(11, 1, new Tretja.Stanovanjska(55));
        mesto.postavi(1, 8, new Tretja.Poslovna());
        System.out.println(mesto.steviloStanovanj());
        mesto.postavi(12, 13, new Tretja.Poslovna());
        System.out.println(mesto.steviloStanovanj());
        mesto.postavi(2, 18, new Tretja.Poslovna());
        System.out.println(mesto.steviloStanovanj());
        mesto.postavi(9, 17, new Tretja.Stanovanjska(81));
        mesto.postavi(13, 11, new Tretja.Poslovna());
        mesto.postavi(8, 12, new Tretja.Stanovanjska(70));
        System.out.println(mesto.steviloStanovanj());
        mesto.postavi(23, 11, new Tretja.Stanovanjska(71));
        mesto.postavi(9, 8, new Tretja.Stanovanjska(50));
        mesto.postavi(7, 12, new Tretja.Stanovanjska(95));
        mesto.postavi(20, 16, new Tretja.Stanovanjska(39));
        mesto.postavi(11, 12, new Tretja.Poslovna());
        mesto.postavi(4, 10, new Tretja.Poslovna());
        System.out.println(mesto.steviloStanovanj());
        mesto.postavi(15, 17, new Tretja.Poslovna());
        mesto.postavi(5, 10, new Tretja.Poslovna());
        mesto.postavi(6, 3, new Tretja.Stanovanjska(8));
        mesto.postavi(17, 13, new Tretja.Stanovanjska(42));
        mesto.postavi(9, 3, new Tretja.Stanovanjska(31));
        mesto.postavi(10, 11, new Tretja.Poslovna());
        System.out.println(mesto.steviloStanovanj());
        mesto.postavi(14, 5, new Tretja.Poslovna());
        mesto.postavi(5, 4, new Tretja.Stanovanjska(100));
        System.out.println(mesto.steviloStanovanj());
        mesto.postavi(14, 1, new Tretja.Poslovna());
        mesto.postavi(19, 13, new Tretja.Stanovanjska(57));
        System.out.println(mesto.steviloStanovanj());
        mesto.postavi(21, 5, new Tretja.Poslovna());
        mesto.postavi(11, 4, new Tretja.Poslovna());
        mesto.postavi(19, 11, new Tretja.Stanovanjska(64));
        System.out.println(mesto.steviloStanovanj());
        mesto.postavi(12, 12, new Tretja.Poslovna());
        mesto.postavi(5, 11, new Tretja.Poslovna());
        mesto.postavi(6, 13, new Tretja.Poslovna());
        mesto.postavi(16, 15, new Tretja.Stanovanjska(89));
        mesto.postavi(21, 14, new Tretja.Stanovanjska(41));
        System.out.println(mesto.steviloStanovanj());
        mesto.postavi(21, 13, new Tretja.Poslovna());
        mesto.postavi(16, 1, new Tretja.Poslovna());
        mesto.postavi(20, 17, new Tretja.Poslovna());
        mesto.postavi(23, 16, new Tretja.Poslovna());
        mesto.postavi(25, 7, new Tretja.Poslovna());
        mesto.postavi(12, 16, new Tretja.Poslovna());
        mesto.postavi(0, 7, new Tretja.Stanovanjska(69));
        mesto.postavi(15, 1, new Tretja.Stanovanjska(99));
        System.out.println(mesto.steviloStanovanj());
        mesto.postavi(3, 11, new Tretja.Poslovna());
        mesto.postavi(18, 15, new Tretja.Stanovanjska(86));
        mesto.postavi(21, 4, new Tretja.Stanovanjska(2));
        System.out.println(mesto.steviloStanovanj());
        mesto.postavi(8, 0, new Tretja.Poslovna());
        mesto.postavi(0, 5, new Tretja.Poslovna());
        System.out.println(mesto.steviloStanovanj());
        mesto.postavi(1, 0, new Tretja.Poslovna());
        mesto.postavi(4, 1, new Tretja.Stanovanjska(18));
        mesto.postavi(0, 17, new Tretja.Stanovanjska(2));
        mesto.postavi(7, 14, new Tretja.Poslovna());
        mesto.postavi(13, 4, new Tretja.Poslovna());
        mesto.postavi(1, 1, new Tretja.Stanovanjska(64));
        System.out.println(mesto.steviloStanovanj());
        mesto.postavi(13, 8, new Tretja.Poslovna());
        mesto.postavi(24, 8, new Tretja.Poslovna());
        mesto.postavi(21, 6, new Tretja.Poslovna());
        System.out.println(mesto.steviloStanovanj());
        mesto.postavi(15, 5, new Tretja.Stanovanjska(91));
        System.out.println(mesto.steviloStanovanj());
        mesto.postavi(11, 6, new Tretja.Stanovanjska(96));
        mesto.postavi(4, 0, new Tretja.Poslovna());
        mesto.postavi(25, 14, new Tretja.Poslovna());
        System.out.println(mesto.steviloStanovanj());
        mesto.postavi(9, 7, new Tretja.Poslovna());
        mesto.postavi(17, 12, new Tretja.Stanovanjska(62));
        System.out.println(mesto.steviloStanovanj());
        mesto.postavi(23, 7, new Tretja.Stanovanjska(98));
        mesto.postavi(6, 1, new Tretja.Poslovna());
        mesto.postavi(4, 3, new Tretja.Poslovna());
        mesto.postavi(13, 2, new Tretja.Poslovna());
        mesto.postavi(17, 14, new Tretja.Poslovna());
        mesto.postavi(11, 17, new Tretja.Poslovna());
        mesto.postavi(12, 15, new Tretja.Poslovna());
        mesto.postavi(17, 16, new Tretja.Poslovna());
        System.out.println(mesto.steviloStanovanj());
        mesto.postavi(19, 2, new Tretja.Stanovanjska(77));
        mesto.postavi(19, 5, new Tretja.Stanovanjska(94));
        mesto.postavi(2, 10, new Tretja.Stanovanjska(39));
        mesto.postavi(18, 1, new Tretja.Poslovna());
        System.out.println(mesto.steviloStanovanj());
        mesto.postavi(6, 0, new Tretja.Poslovna());
        mesto.postavi(11, 7, new Tretja.Stanovanjska(51));
        mesto.postavi(12, 10, new Tretja.Stanovanjska(11));
        mesto.postavi(1, 12, new Tretja.Poslovna());
        mesto.postavi(19, 14, new Tretja.Poslovna());
        mesto.postavi(25, 16, new Tretja.Stanovanjska(69));
        mesto.postavi(9, 15, new Tretja.Stanovanjska(8));
        mesto.postavi(7, 1, new Tretja.Stanovanjska(62));
        System.out.println(mesto.steviloStanovanj());
        mesto.postavi(20, 13, new Tretja.Poslovna());
        mesto.postavi(18, 6, new Tretja.Stanovanjska(65));
        mesto.postavi(7, 10, new Tretja.Stanovanjska(40));
        System.out.println(mesto.steviloStanovanj());
        mesto.postavi(15, 6, new Tretja.Stanovanjska(70));
        mesto.postavi(6, 4, new Tretja.Stanovanjska(95));
        mesto.postavi(11, 5, new Tretja.Poslovna());
        System.out.println(mesto.steviloStanovanj());
        mesto.postavi(1, 16, new Tretja.Stanovanjska(10));
        mesto.postavi(5, 18, new Tretja.Stanovanjska(22));
        mesto.postavi(6, 12, new Tretja.Stanovanjska(20));
        mesto.postavi(1, 13, new Tretja.Poslovna());
        mesto.postavi(0, 15, new Tretja.Stanovanjska(42));
        mesto.postavi(25, 12, new Tretja.Poslovna());
        mesto.postavi(8, 11, new Tretja.Poslovna());
        mesto.postavi(10, 16, new Tretja.Poslovna());
        System.out.println(mesto.steviloStanovanj());
        mesto.postavi(4, 14, new Tretja.Stanovanjska(15));
        mesto.postavi(16, 0, new Tretja.Poslovna());
        mesto.postavi(5, 7, new Tretja.Poslovna());
        System.out.println(mesto.steviloStanovanj());
        mesto.postavi(25, 11, new Tretja.Poslovna());
        System.out.println(mesto.steviloStanovanj());
        mesto.postavi(8, 9, new Tretja.Poslovna());
        System.out.println(mesto.steviloStanovanj());
        mesto.postavi(14, 18, new Tretja.Stanovanjska(53));
        System.out.println(mesto.steviloStanovanj());
        mesto.postavi(13, 14, new Tretja.Poslovna());
        mesto.postavi(19, 18, new Tretja.Poslovna());
        mesto.postavi(8, 4, new Tretja.Stanovanjska(11));
        mesto.postavi(7, 13, new Tretja.Stanovanjska(39));
        System.out.println(mesto.steviloStanovanj());
        mesto.postavi(22, 3, new Tretja.Poslovna());
        System.out.println(mesto.steviloStanovanj());
        mesto.postavi(16, 11, new Tretja.Poslovna());
        mesto.postavi(4, 16, new Tretja.Stanovanjska(62));
        mesto.postavi(20, 11, new Tretja.Poslovna());
        System.out.println(mesto.steviloStanovanj());
        mesto.postavi(20, 3, new Tretja.Poslovna());
        mesto.postavi(9, 13, new Tretja.Stanovanjska(97));
        System.out.println(mesto.steviloStanovanj());
        mesto.postavi(18, 18, new Tretja.Stanovanjska(51));
        mesto.postavi(23, 1, new Tretja.Poslovna());
        mesto.postavi(19, 17, new Tretja.Poslovna());
        System.out.println(mesto.steviloStanovanj());
        mesto.postavi(21, 10, new Tretja.Stanovanjska(26));
        mesto.postavi(0, 4, new Tretja.Stanovanjska(8));
        mesto.postavi(3, 3, new Tretja.Stanovanjska(76));
        System.out.println(mesto.steviloStanovanj());
        mesto.postavi(14, 9, new Tretja.Poslovna());
        mesto.postavi(11, 3, new Tretja.Stanovanjska(49));
        System.out.println(mesto.steviloStanovanj());
        mesto.postavi(19, 16, new Tretja.Poslovna());
        System.out.println(mesto.steviloStanovanj());
        mesto.postavi(18, 12, new Tretja.Stanovanjska(5));
        mesto.postavi(7, 4, new Tretja.Stanovanjska(74));
        System.out.println(mesto.steviloStanovanj());
        mesto.postavi(25, 18, new Tretja.Poslovna());
        mesto.postavi(8, 15, new Tretja.Poslovna());
        System.out.println(mesto.steviloStanovanj());
        mesto.postavi(5, 1, new Tretja.Poslovna());
        System.out.println(mesto.steviloStanovanj());
        mesto.postavi(16, 12, new Tretja.Stanovanjska(20));
        mesto.postavi(25, 1, new Tretja.Poslovna());
        mesto.postavi(0, 9, new Tretja.Stanovanjska(63));
        mesto.postavi(17, 5, new Tretja.Stanovanjska(63));
        mesto.postavi(8, 7, new Tretja.Poslovna());
        mesto.postavi(12, 4, new Tretja.Poslovna());
        mesto.postavi(8, 16, new Tretja.Stanovanjska(56));
        mesto.postavi(20, 18, new Tretja.Poslovna());
        System.out.println(mesto.steviloStanovanj());
    }
}
