
import java.util.*;

public class Test33 {

    public static void main(String[] args) {
        Tretja.Mesto mesto = new Tretja.Mesto(13, 27);

        mesto.postavi(4, 14, new Tretja.Stanovanjska(61));
        System.out.println(mesto.koliko(new Tretja.Stanovanjska(0)));
        System.out.println(mesto.koliko(new Tretja.Poslovna()));
        mesto.postavi(4, 0, new Tretja.Stanovanjska(38));
        mesto.postavi(1, 16, new Tretja.Poslovna());
        System.out.println(mesto.koliko(new Tretja.Stanovanjska(0)));
        System.out.println(mesto.koliko(new Tretja.Poslovna()));
        mesto.postavi(1, 15, new Tretja.Poslovna());
        System.out.println(mesto.koliko(new Tretja.Stanovanjska(0)));
        System.out.println(mesto.koliko(new Tretja.Poslovna()));
        mesto.postavi(2, 19, new Tretja.Poslovna());
        mesto.postavi(6, 26, new Tretja.Poslovna());
        mesto.postavi(1, 20, new Tretja.Poslovna());
        mesto.postavi(2, 8, new Tretja.Stanovanjska(14));
        mesto.postavi(12, 18, new Tretja.Poslovna());
        mesto.postavi(2, 22, new Tretja.Poslovna());
        mesto.postavi(0, 7, new Tretja.Poslovna());
        mesto.postavi(7, 21, new Tretja.Stanovanjska(78));
        mesto.postavi(4, 18, new Tretja.Poslovna());
        System.out.println(mesto.koliko(new Tretja.Stanovanjska(0)));
        System.out.println(mesto.koliko(new Tretja.Poslovna()));
        mesto.postavi(6, 7, new Tretja.Stanovanjska(60));
        mesto.postavi(2, 1, new Tretja.Stanovanjska(66));
        mesto.postavi(8, 0, new Tretja.Poslovna());
        mesto.postavi(10, 5, new Tretja.Stanovanjska(33));
        mesto.postavi(7, 7, new Tretja.Stanovanjska(88));
        mesto.postavi(10, 16, new Tretja.Poslovna());
        mesto.postavi(1, 23, new Tretja.Stanovanjska(63));
        mesto.postavi(11, 6, new Tretja.Poslovna());
        mesto.postavi(9, 16, new Tretja.Poslovna());
        mesto.postavi(12, 0, new Tretja.Poslovna());
        mesto.postavi(6, 10, new Tretja.Stanovanjska(52));
        System.out.println(mesto.koliko(new Tretja.Stanovanjska(0)));
        System.out.println(mesto.koliko(new Tretja.Poslovna()));
        mesto.postavi(5, 5, new Tretja.Poslovna());
        mesto.postavi(1, 25, new Tretja.Poslovna());
        mesto.postavi(6, 3, new Tretja.Stanovanjska(53));
        mesto.postavi(8, 18, new Tretja.Stanovanjska(100));
        mesto.postavi(6, 23, new Tretja.Poslovna());
        mesto.postavi(4, 5, new Tretja.Stanovanjska(39));
        mesto.postavi(1, 5, new Tretja.Stanovanjska(57));
        mesto.postavi(7, 1, new Tretja.Poslovna());
        mesto.postavi(3, 14, new Tretja.Poslovna());
        System.out.println(mesto.koliko(new Tretja.Stanovanjska(0)));
        System.out.println(mesto.koliko(new Tretja.Poslovna()));
        mesto.postavi(10, 0, new Tretja.Poslovna());
        mesto.postavi(3, 22, new Tretja.Poslovna());
        mesto.postavi(4, 12, new Tretja.Poslovna());
        System.out.println(mesto.koliko(new Tretja.Stanovanjska(0)));
        System.out.println(mesto.koliko(new Tretja.Poslovna()));
        mesto.postavi(1, 12, new Tretja.Poslovna());
        mesto.postavi(3, 3, new Tretja.Poslovna());
        mesto.postavi(9, 26, new Tretja.Stanovanjska(15));
        mesto.postavi(2, 11, new Tretja.Poslovna());
        mesto.postavi(9, 23, new Tretja.Stanovanjska(40));
        mesto.postavi(12, 22, new Tretja.Stanovanjska(75));
        mesto.postavi(7, 13, new Tretja.Poslovna());
        System.out.println(mesto.koliko(new Tretja.Stanovanjska(0)));
        System.out.println(mesto.koliko(new Tretja.Poslovna()));
        mesto.postavi(12, 14, new Tretja.Poslovna());
        mesto.postavi(3, 19, new Tretja.Poslovna());
        mesto.postavi(0, 14, new Tretja.Stanovanjska(32));
        mesto.postavi(9, 18, new Tretja.Poslovna());
        System.out.println(mesto.koliko(new Tretja.Stanovanjska(0)));
        System.out.println(mesto.koliko(new Tretja.Poslovna()));
        mesto.postavi(6, 4, new Tretja.Stanovanjska(42));
        mesto.postavi(1, 17, new Tretja.Stanovanjska(49));
        mesto.postavi(11, 24, new Tretja.Poslovna());
        mesto.postavi(12, 10, new Tretja.Stanovanjska(2));
        mesto.postavi(3, 23, new Tretja.Stanovanjska(6));
        mesto.postavi(12, 20, new Tretja.Stanovanjska(24));
        mesto.postavi(5, 20, new Tretja.Poslovna());
        mesto.postavi(0, 25, new Tretja.Poslovna());
        System.out.println(mesto.koliko(new Tretja.Stanovanjska(0)));
        System.out.println(mesto.koliko(new Tretja.Poslovna()));
        mesto.postavi(4, 7, new Tretja.Poslovna());
        System.out.println(mesto.koliko(new Tretja.Stanovanjska(0)));
        System.out.println(mesto.koliko(new Tretja.Poslovna()));
        mesto.postavi(10, 11, new Tretja.Poslovna());
        System.out.println(mesto.koliko(new Tretja.Stanovanjska(0)));
        System.out.println(mesto.koliko(new Tretja.Poslovna()));
        mesto.postavi(0, 12, new Tretja.Poslovna());
        mesto.postavi(2, 3, new Tretja.Poslovna());
        mesto.postavi(8, 24, new Tretja.Stanovanjska(96));
        System.out.println(mesto.koliko(new Tretja.Stanovanjska(0)));
        System.out.println(mesto.koliko(new Tretja.Poslovna()));
        mesto.postavi(2, 2, new Tretja.Poslovna());
        mesto.postavi(10, 19, new Tretja.Stanovanjska(52));
        mesto.postavi(3, 13, new Tretja.Stanovanjska(35));
        mesto.postavi(4, 9, new Tretja.Stanovanjska(57));
        mesto.postavi(4, 3, new Tretja.Stanovanjska(1));
        mesto.postavi(10, 4, new Tretja.Stanovanjska(84));
        mesto.postavi(11, 19, new Tretja.Poslovna());
        mesto.postavi(4, 1, new Tretja.Poslovna());
        mesto.postavi(10, 15, new Tretja.Stanovanjska(71));
        System.out.println(mesto.koliko(new Tretja.Stanovanjska(0)));
        System.out.println(mesto.koliko(new Tretja.Poslovna()));
        mesto.postavi(7, 18, new Tretja.Poslovna());
        mesto.postavi(5, 23, new Tretja.Poslovna());
        System.out.println(mesto.koliko(new Tretja.Stanovanjska(0)));
        System.out.println(mesto.koliko(new Tretja.Poslovna()));
        mesto.postavi(11, 9, new Tretja.Stanovanjska(35));
        mesto.postavi(7, 3, new Tretja.Stanovanjska(97));
        mesto.postavi(11, 25, new Tretja.Stanovanjska(48));
        mesto.postavi(12, 25, new Tretja.Poslovna());
        System.out.println(mesto.koliko(new Tretja.Stanovanjska(0)));
        System.out.println(mesto.koliko(new Tretja.Poslovna()));
        mesto.postavi(11, 26, new Tretja.Poslovna());
        mesto.postavi(7, 17, new Tretja.Poslovna());
        mesto.postavi(8, 19, new Tretja.Stanovanjska(37));
        mesto.postavi(1, 9, new Tretja.Stanovanjska(1));
        System.out.println(mesto.koliko(new Tretja.Stanovanjska(0)));
        System.out.println(mesto.koliko(new Tretja.Poslovna()));
        mesto.postavi(9, 22, new Tretja.Stanovanjska(96));
        System.out.println(mesto.koliko(new Tretja.Stanovanjska(0)));
        System.out.println(mesto.koliko(new Tretja.Poslovna()));
        mesto.postavi(4, 15, new Tretja.Stanovanjska(49));
        mesto.postavi(12, 23, new Tretja.Poslovna());
        mesto.postavi(12, 24, new Tretja.Poslovna());
        mesto.postavi(4, 19, new Tretja.Poslovna());
        System.out.println(mesto.koliko(new Tretja.Stanovanjska(0)));
        System.out.println(mesto.koliko(new Tretja.Poslovna()));
        mesto.postavi(5, 16, new Tretja.Poslovna());
        mesto.postavi(0, 2, new Tretja.Stanovanjska(13));
        mesto.postavi(7, 11, new Tretja.Poslovna());
        System.out.println(mesto.koliko(new Tretja.Stanovanjska(0)));
        System.out.println(mesto.koliko(new Tretja.Poslovna()));
        mesto.postavi(11, 11, new Tretja.Poslovna());
        System.out.println(mesto.koliko(new Tretja.Stanovanjska(0)));
        System.out.println(mesto.koliko(new Tretja.Poslovna()));
        mesto.postavi(5, 13, new Tretja.Poslovna());
        mesto.postavi(1, 8, new Tretja.Poslovna());
        mesto.postavi(4, 8, new Tretja.Poslovna());
        mesto.postavi(3, 21, new Tretja.Stanovanjska(4));
        mesto.postavi(7, 25, new Tretja.Poslovna());
        System.out.println(mesto.koliko(new Tretja.Stanovanjska(0)));
        System.out.println(mesto.koliko(new Tretja.Poslovna()));
        mesto.postavi(0, 10, new Tretja.Stanovanjska(23));
        mesto.postavi(12, 13, new Tretja.Stanovanjska(5));
        System.out.println(mesto.koliko(new Tretja.Stanovanjska(0)));
        System.out.println(mesto.koliko(new Tretja.Poslovna()));
        mesto.postavi(11, 17, new Tretja.Poslovna());
        mesto.postavi(7, 2, new Tretja.Poslovna());
        System.out.println(mesto.koliko(new Tretja.Stanovanjska(0)));
        System.out.println(mesto.koliko(new Tretja.Poslovna()));
        mesto.postavi(11, 8, new Tretja.Stanovanjska(38));
        mesto.postavi(3, 15, new Tretja.Stanovanjska(16));
        mesto.postavi(1, 2, new Tretja.Stanovanjska(88));
        mesto.postavi(1, 26, new Tretja.Stanovanjska(47));
        mesto.postavi(11, 22, new Tretja.Stanovanjska(2));
        mesto.postavi(3, 20, new Tretja.Stanovanjska(5));
        mesto.postavi(5, 2, new Tretja.Poslovna());
        mesto.postavi(1, 24, new Tretja.Stanovanjska(81));
        System.out.println(mesto.koliko(new Tretja.Stanovanjska(0)));
        System.out.println(mesto.koliko(new Tretja.Poslovna()));
    }
}