
import java.util.*;

public class Test09 {

    public static void main(String[] args) {
        Tretja.Mesto mesto = new Tretja.Mesto(17, 15);

        mesto.postavi(3, 7, new Tretja.Poslovna());
        System.out.println(mesto.steviloStanovanj());
        mesto.postavi(3, 4, new Tretja.Poslovna());
        mesto.postavi(7, 5, new Tretja.Poslovna());
        mesto.postavi(10, 5, new Tretja.Poslovna());
        mesto.postavi(16, 12, new Tretja.Poslovna());
        mesto.postavi(16, 3, new Tretja.Stanovanjska(73));
        System.out.println(mesto.steviloStanovanj());
        mesto.postavi(14, 10, new Tretja.Stanovanjska(29));
        mesto.postavi(11, 5, new Tretja.Poslovna());
        mesto.postavi(3, 6, new Tretja.Stanovanjska(25));
        System.out.println(mesto.steviloStanovanj());
        mesto.postavi(11, 2, new Tretja.Stanovanjska(97));
        mesto.postavi(11, 11, new Tretja.Stanovanjska(63));
        mesto.postavi(13, 11, new Tretja.Poslovna());
        mesto.postavi(15, 2, new Tretja.Poslovna());
        mesto.postavi(8, 2, new Tretja.Poslovna());
        mesto.postavi(7, 1, new Tretja.Stanovanjska(54));
        System.out.println(mesto.steviloStanovanj());
        mesto.postavi(14, 1, new Tretja.Stanovanjska(54));
        mesto.postavi(3, 3, new Tretja.Poslovna());
        mesto.postavi(1, 4, new Tretja.Stanovanjska(10));
        mesto.postavi(13, 14, new Tretja.Poslovna());
        mesto.postavi(10, 12, new Tretja.Stanovanjska(71));
        mesto.postavi(7, 4, new Tretja.Poslovna());
        mesto.postavi(4, 1, new Tretja.Poslovna());
        mesto.postavi(7, 14, new Tretja.Poslovna());
        System.out.println(mesto.steviloStanovanj());
        mesto.postavi(5, 13, new Tretja.Poslovna());
        System.out.println(mesto.steviloStanovanj());
        mesto.postavi(16, 10, new Tretja.Poslovna());
        mesto.postavi(1, 2, new Tretja.Poslovna());
        mesto.postavi(11, 3, new Tretja.Poslovna());
        mesto.postavi(4, 0, new Tretja.Stanovanjska(48));
        mesto.postavi(8, 8, new Tretja.Poslovna());
        mesto.postavi(7, 9, new Tretja.Stanovanjska(34));
        mesto.postavi(10, 14, new Tretja.Stanovanjska(57));
        System.out.println(mesto.steviloStanovanj());
        mesto.postavi(15, 5, new Tretja.Stanovanjska(78));
        mesto.postavi(12, 1, new Tretja.Stanovanjska(74));
        System.out.println(mesto.steviloStanovanj());
        mesto.postavi(13, 1, new Tretja.Stanovanjska(35));
        mesto.postavi(11, 14, new Tretja.Stanovanjska(79));
        mesto.postavi(0, 4, new Tretja.Poslovna());
        mesto.postavi(10, 2, new Tretja.Poslovna());
        System.out.println(mesto.steviloStanovanj());
        mesto.postavi(9, 5, new Tretja.Stanovanjska(50));
        mesto.postavi(4, 11, new Tretja.Poslovna());
        mesto.postavi(1, 11, new Tretja.Stanovanjska(49));
        mesto.postavi(14, 12, new Tretja.Poslovna());
        System.out.println(mesto.steviloStanovanj());
        mesto.postavi(12, 4, new Tretja.Stanovanjska(63));
        mesto.postavi(4, 13, new Tretja.Poslovna());
        mesto.postavi(12, 5, new Tretja.Stanovanjska(47));
        mesto.postavi(13, 0, new Tretja.Stanovanjska(21));
        mesto.postavi(9, 11, new Tretja.Stanovanjska(14));
        System.out.println(mesto.steviloStanovanj());
        mesto.postavi(11, 7, new Tretja.Poslovna());
        System.out.println(mesto.steviloStanovanj());
        mesto.postavi(9, 7, new Tretja.Poslovna());
        mesto.postavi(16, 6, new Tretja.Poslovna());
        System.out.println(mesto.steviloStanovanj());
        mesto.postavi(5, 14, new Tretja.Poslovna());
        System.out.println(mesto.steviloStanovanj());
        mesto.postavi(6, 12, new Tretja.Poslovna());
        mesto.postavi(14, 13, new Tretja.Poslovna());
        mesto.postavi(2, 1, new Tretja.Stanovanjska(71));
        mesto.postavi(7, 8, new Tretja.Poslovna());
        mesto.postavi(9, 12, new Tretja.Poslovna());
        mesto.postavi(7, 3, new Tretja.Poslovna());
        System.out.println(mesto.steviloStanovanj());
        mesto.postavi(14, 4, new Tretja.Poslovna());
        mesto.postavi(14, 7, new Tretja.Poslovna());
        mesto.postavi(5, 6, new Tretja.Stanovanjska(55));
        mesto.postavi(2, 0, new Tretja.Stanovanjska(15));
        mesto.postavi(8, 13, new Tretja.Stanovanjska(52));
        mesto.postavi(6, 4, new Tretja.Stanovanjska(14));
        mesto.postavi(3, 14, new Tretja.Poslovna());
        mesto.postavi(13, 5, new Tretja.Stanovanjska(37));
        System.out.println(mesto.steviloStanovanj());
        mesto.postavi(16, 11, new Tretja.Stanovanjska(96));
        mesto.postavi(10, 9, new Tretja.Poslovna());
        mesto.postavi(11, 6, new Tretja.Stanovanjska(85));
        mesto.postavi(8, 10, new Tretja.Poslovna());
        mesto.postavi(4, 8, new Tretja.Stanovanjska(81));
        System.out.println(mesto.steviloStanovanj());
        mesto.postavi(6, 6, new Tretja.Poslovna());
        System.out.println(mesto.steviloStanovanj());
        mesto.postavi(5, 10, new Tretja.Stanovanjska(5));
        mesto.postavi(11, 4, new Tretja.Stanovanjska(34));
        mesto.postavi(15, 14, new Tretja.Poslovna());
        System.out.println(mesto.steviloStanovanj());
        mesto.postavi(10, 8, new Tretja.Stanovanjska(20));
        System.out.println(mesto.steviloStanovanj());
        mesto.postavi(12, 2, new Tretja.Poslovna());
        mesto.postavi(11, 1, new Tretja.Poslovna());
        mesto.postavi(1, 5, new Tretja.Poslovna());
        mesto.postavi(16, 14, new Tretja.Stanovanjska(19));
        System.out.println(mesto.steviloStanovanj());
        mesto.postavi(16, 0, new Tretja.Stanovanjska(7));
        System.out.println(mesto.steviloStanovanj());
        mesto.postavi(7, 11, new Tretja.Poslovna());
        System.out.println(mesto.steviloStanovanj());
        mesto.postavi(5, 1, new Tretja.Stanovanjska(59));
        mesto.postavi(12, 12, new Tretja.Poslovna());
        mesto.postavi(1, 10, new Tretja.Stanovanjska(54));
        mesto.postavi(6, 10, new Tretja.Stanovanjska(20));
        System.out.println(mesto.steviloStanovanj());
        mesto.postavi(3, 9, new Tretja.Stanovanjska(89));
        System.out.println(mesto.steviloStanovanj());
        mesto.postavi(10, 1, new Tretja.Stanovanjska(3));
        System.out.println(mesto.steviloStanovanj());
        mesto.postavi(9, 1, new Tretja.Stanovanjska(45));
        System.out.println(mesto.steviloStanovanj());
        mesto.postavi(12, 7, new Tretja.Poslovna());
        System.out.println(mesto.steviloStanovanj());
        mesto.postavi(13, 6, new Tretja.Stanovanjska(97));
        mesto.postavi(8, 4, new Tretja.Stanovanjska(60));
        mesto.postavi(4, 9, new Tretja.Stanovanjska(6));
        mesto.postavi(0, 9, new Tretja.Poslovna());
        System.out.println(mesto.steviloStanovanj());
        mesto.postavi(15, 4, new Tretja.Poslovna());
        System.out.println(mesto.steviloStanovanj());
        mesto.postavi(1, 0, new Tretja.Stanovanjska(18));
        mesto.postavi(15, 0, new Tretja.Stanovanjska(1));
        System.out.println(mesto.steviloStanovanj());
        mesto.postavi(5, 12, new Tretja.Stanovanjska(96));
        mesto.postavi(3, 1, new Tretja.Poslovna());
        System.out.println(mesto.steviloStanovanj());
        mesto.postavi(8, 3, new Tretja.Stanovanjska(45));
        mesto.postavi(6, 13, new Tretja.Stanovanjska(34));
        mesto.postavi(1, 13, new Tretja.Stanovanjska(29));
        mesto.postavi(14, 11, new Tretja.Poslovna());
        System.out.println(mesto.steviloStanovanj());
        mesto.postavi(8, 14, new Tretja.Poslovna());
        mesto.postavi(3, 12, new Tretja.Stanovanjska(11));
        mesto.postavi(12, 6, new Tretja.Poslovna());
        System.out.println(mesto.steviloStanovanj());
        mesto.postavi(3, 13, new Tretja.Stanovanjska(5));
        mesto.postavi(14, 8, new Tretja.Poslovna());
        mesto.postavi(0, 0, new Tretja.Poslovna());
        mesto.postavi(13, 8, new Tretja.Stanovanjska(36));
        System.out.println(mesto.steviloStanovanj());
        mesto.postavi(9, 2, new Tretja.Stanovanjska(31));
        mesto.postavi(7, 7, new Tretja.Poslovna());
        mesto.postavi(8, 12, new Tretja.Stanovanjska(26));
        System.out.println(mesto.steviloStanovanj());
        mesto.postavi(15, 6, new Tretja.Poslovna());
        System.out.println(mesto.steviloStanovanj());
        mesto.postavi(16, 1, new Tretja.Stanovanjska(36));
        System.out.println(mesto.steviloStanovanj());
        mesto.postavi(8, 0, new Tretja.Stanovanjska(70));
        mesto.postavi(7, 10, new Tretja.Poslovna());
        mesto.postavi(11, 9, new Tretja.Stanovanjska(77));
        System.out.println(mesto.steviloStanovanj());
    }
}
