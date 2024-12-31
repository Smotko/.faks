
import java.util.*;

public class Test29 {

    public static void main(String[] args) {
        Tretja.Mesto mesto = new Tretja.Mesto(10, 15);

        mesto.postavi(8, 7, new Tretja.Stanovanjska(43));
        System.out.println(mesto.koliko(new Tretja.Stanovanjska(0)));
        System.out.println(mesto.koliko(new Tretja.Poslovna()));
        mesto.postavi(5, 2, new Tretja.Poslovna());
        mesto.postavi(2, 5, new Tretja.Stanovanjska(77));
        System.out.println(mesto.koliko(new Tretja.Stanovanjska(0)));
        System.out.println(mesto.koliko(new Tretja.Poslovna()));
        mesto.postavi(9, 2, new Tretja.Poslovna());
        mesto.postavi(3, 5, new Tretja.Poslovna());
        System.out.println(mesto.koliko(new Tretja.Stanovanjska(0)));
        System.out.println(mesto.koliko(new Tretja.Poslovna()));
        mesto.postavi(6, 11, new Tretja.Stanovanjska(16));
        mesto.postavi(2, 12, new Tretja.Stanovanjska(5));
        System.out.println(mesto.koliko(new Tretja.Stanovanjska(0)));
        System.out.println(mesto.koliko(new Tretja.Poslovna()));
        mesto.postavi(3, 3, new Tretja.Stanovanjska(77));
        System.out.println(mesto.koliko(new Tretja.Stanovanjska(0)));
        System.out.println(mesto.koliko(new Tretja.Poslovna()));
        mesto.postavi(2, 3, new Tretja.Stanovanjska(71));
        mesto.postavi(6, 10, new Tretja.Poslovna());
        mesto.postavi(6, 12, new Tretja.Poslovna());
        mesto.postavi(4, 8, new Tretja.Stanovanjska(63));
        mesto.postavi(3, 4, new Tretja.Poslovna());
        mesto.postavi(9, 1, new Tretja.Stanovanjska(35));
        mesto.postavi(9, 12, new Tretja.Stanovanjska(67));
        mesto.postavi(0, 10, new Tretja.Stanovanjska(43));
        mesto.postavi(7, 4, new Tretja.Poslovna());
        mesto.postavi(3, 14, new Tretja.Poslovna());
        mesto.postavi(2, 1, new Tretja.Poslovna());
        mesto.postavi(5, 11, new Tretja.Stanovanjska(1));
        System.out.println(mesto.koliko(new Tretja.Stanovanjska(0)));
        System.out.println(mesto.koliko(new Tretja.Poslovna()));
        mesto.postavi(2, 0, new Tretja.Stanovanjska(94));
        mesto.postavi(0, 14, new Tretja.Poslovna());
        mesto.postavi(6, 2, new Tretja.Poslovna());
        System.out.println(mesto.koliko(new Tretja.Stanovanjska(0)));
        System.out.println(mesto.koliko(new Tretja.Poslovna()));
        mesto.postavi(0, 7, new Tretja.Poslovna());
        mesto.postavi(1, 5, new Tretja.Poslovna());
        mesto.postavi(9, 7, new Tretja.Poslovna());
        mesto.postavi(7, 3, new Tretja.Poslovna());
        mesto.postavi(1, 2, new Tretja.Poslovna());
        mesto.postavi(0, 3, new Tretja.Stanovanjska(73));
        mesto.postavi(0, 8, new Tretja.Poslovna());
        mesto.postavi(1, 10, new Tretja.Stanovanjska(62));
        mesto.postavi(1, 8, new Tretja.Poslovna());
        mesto.postavi(6, 4, new Tretja.Poslovna());
        mesto.postavi(3, 1, new Tretja.Poslovna());
        mesto.postavi(0, 4, new Tretja.Poslovna());
        mesto.postavi(9, 3, new Tretja.Poslovna());
        mesto.postavi(3, 10, new Tretja.Poslovna());
        mesto.postavi(7, 6, new Tretja.Poslovna());
        mesto.postavi(4, 9, new Tretja.Stanovanjska(84));
        System.out.println(mesto.koliko(new Tretja.Stanovanjska(0)));
        System.out.println(mesto.koliko(new Tretja.Poslovna()));
        mesto.postavi(3, 9, new Tretja.Stanovanjska(44));
        mesto.postavi(7, 0, new Tretja.Poslovna());
        System.out.println(mesto.koliko(new Tretja.Stanovanjska(0)));
        System.out.println(mesto.koliko(new Tretja.Poslovna()));
        mesto.postavi(7, 10, new Tretja.Stanovanjska(45));
        System.out.println(mesto.koliko(new Tretja.Stanovanjska(0)));
        System.out.println(mesto.koliko(new Tretja.Poslovna()));
        mesto.postavi(0, 9, new Tretja.Stanovanjska(32));
        mesto.postavi(7, 9, new Tretja.Poslovna());
        System.out.println(mesto.koliko(new Tretja.Stanovanjska(0)));
        System.out.println(mesto.koliko(new Tretja.Poslovna()));
        mesto.postavi(9, 6, new Tretja.Stanovanjska(45));
        mesto.postavi(7, 11, new Tretja.Poslovna());
        mesto.postavi(6, 1, new Tretja.Stanovanjska(7));
        mesto.postavi(9, 9, new Tretja.Poslovna());
        System.out.println(mesto.koliko(new Tretja.Stanovanjska(0)));
        System.out.println(mesto.koliko(new Tretja.Poslovna()));
    }
}
