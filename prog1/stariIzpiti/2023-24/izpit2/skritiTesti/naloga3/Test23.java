
import java.util.*;

public class Test23 {

    public static void main(String[] args) {
        Tretja.Mesto mesto = new Tretja.Mesto(27, 18);

        mesto.postavi(10, 15, new Tretja.Poslovna());
        mesto.postavi(3, 8, new Tretja.Poslovna());
        mesto.postavi(22, 14, new Tretja.Poslovna());
        System.out.println(mesto.koliko(new Tretja.Stanovanjska(0)));
        System.out.println(mesto.koliko(new Tretja.Poslovna()));
        mesto.postavi(24, 6, new Tretja.Poslovna());
        mesto.postavi(24, 3, new Tretja.Stanovanjska(3));
        mesto.postavi(10, 1, new Tretja.Stanovanjska(70));
        mesto.postavi(6, 10, new Tretja.Poslovna());
        System.out.println(mesto.koliko(new Tretja.Stanovanjska(0)));
        System.out.println(mesto.koliko(new Tretja.Poslovna()));
        mesto.postavi(22, 11, new Tretja.Poslovna());
        mesto.postavi(12, 11, new Tretja.Stanovanjska(24));
        mesto.postavi(26, 5, new Tretja.Stanovanjska(75));
        mesto.postavi(5, 2, new Tretja.Poslovna());
        System.out.println(mesto.koliko(new Tretja.Stanovanjska(0)));
        System.out.println(mesto.koliko(new Tretja.Poslovna()));
        mesto.postavi(19, 5, new Tretja.Stanovanjska(11));
        mesto.postavi(16, 16, new Tretja.Poslovna());
        mesto.postavi(22, 12, new Tretja.Stanovanjska(61));
        mesto.postavi(6, 9, new Tretja.Poslovna());
        System.out.println(mesto.koliko(new Tretja.Stanovanjska(0)));
        System.out.println(mesto.koliko(new Tretja.Poslovna()));
        mesto.postavi(19, 3, new Tretja.Poslovna());
        mesto.postavi(23, 4, new Tretja.Stanovanjska(19));
        System.out.println(mesto.koliko(new Tretja.Stanovanjska(0)));
        System.out.println(mesto.koliko(new Tretja.Poslovna()));
        mesto.postavi(17, 12, new Tretja.Stanovanjska(12));
        System.out.println(mesto.koliko(new Tretja.Stanovanjska(0)));
        System.out.println(mesto.koliko(new Tretja.Poslovna()));
        mesto.postavi(5, 16, new Tretja.Stanovanjska(31));
        mesto.postavi(3, 17, new Tretja.Stanovanjska(69));
        System.out.println(mesto.koliko(new Tretja.Stanovanjska(0)));
        System.out.println(mesto.koliko(new Tretja.Poslovna()));
        mesto.postavi(9, 8, new Tretja.Poslovna());
        mesto.postavi(23, 3, new Tretja.Stanovanjska(70));
        System.out.println(mesto.koliko(new Tretja.Stanovanjska(0)));
        System.out.println(mesto.koliko(new Tretja.Poslovna()));
        mesto.postavi(20, 1, new Tretja.Stanovanjska(81));
        mesto.postavi(16, 10, new Tretja.Poslovna());
        mesto.postavi(8, 17, new Tretja.Stanovanjska(10));
        mesto.postavi(5, 11, new Tretja.Stanovanjska(20));
        mesto.postavi(2, 2, new Tretja.Stanovanjska(68));
        mesto.postavi(15, 0, new Tretja.Stanovanjska(2));
        mesto.postavi(2, 9, new Tretja.Stanovanjska(96));
        mesto.postavi(11, 8, new Tretja.Stanovanjska(15));
        mesto.postavi(2, 13, new Tretja.Stanovanjska(74));
        mesto.postavi(2, 1, new Tretja.Stanovanjska(63));
        mesto.postavi(0, 12, new Tretja.Stanovanjska(98));
        mesto.postavi(7, 5, new Tretja.Poslovna());
        System.out.println(mesto.koliko(new Tretja.Stanovanjska(0)));
        System.out.println(mesto.koliko(new Tretja.Poslovna()));
        mesto.postavi(17, 11, new Tretja.Poslovna());
        mesto.postavi(26, 2, new Tretja.Stanovanjska(53));
        System.out.println(mesto.koliko(new Tretja.Stanovanjska(0)));
        System.out.println(mesto.koliko(new Tretja.Poslovna()));
        mesto.postavi(5, 17, new Tretja.Poslovna());
        mesto.postavi(21, 3, new Tretja.Poslovna());
        mesto.postavi(3, 16, new Tretja.Poslovna());
        mesto.postavi(20, 13, new Tretja.Poslovna());
        mesto.postavi(14, 6, new Tretja.Stanovanjska(76));
        mesto.postavi(4, 9, new Tretja.Poslovna());
        mesto.postavi(17, 2, new Tretja.Stanovanjska(72));
        System.out.println(mesto.koliko(new Tretja.Stanovanjska(0)));
        System.out.println(mesto.koliko(new Tretja.Poslovna()));
        mesto.postavi(9, 7, new Tretja.Poslovna());
        mesto.postavi(21, 10, new Tretja.Poslovna());
        mesto.postavi(14, 2, new Tretja.Poslovna());
        mesto.postavi(7, 7, new Tretja.Stanovanjska(99));
        mesto.postavi(20, 6, new Tretja.Stanovanjska(77));
        mesto.postavi(12, 5, new Tretja.Poslovna());
        mesto.postavi(16, 3, new Tretja.Poslovna());
        mesto.postavi(9, 14, new Tretja.Poslovna());
        mesto.postavi(7, 3, new Tretja.Poslovna());
        mesto.postavi(23, 9, new Tretja.Stanovanjska(11));
        System.out.println(mesto.koliko(new Tretja.Stanovanjska(0)));
        System.out.println(mesto.koliko(new Tretja.Poslovna()));
        mesto.postavi(6, 6, new Tretja.Stanovanjska(39));
        mesto.postavi(3, 10, new Tretja.Poslovna());
        mesto.postavi(16, 0, new Tretja.Stanovanjska(65));
        mesto.postavi(2, 7, new Tretja.Stanovanjska(54));
        System.out.println(mesto.koliko(new Tretja.Stanovanjska(0)));
        System.out.println(mesto.koliko(new Tretja.Poslovna()));
        mesto.postavi(8, 8, new Tretja.Stanovanjska(47));
        mesto.postavi(12, 10, new Tretja.Stanovanjska(8));
        System.out.println(mesto.koliko(new Tretja.Stanovanjska(0)));
        System.out.println(mesto.koliko(new Tretja.Poslovna()));
        mesto.postavi(5, 13, new Tretja.Stanovanjska(84));
        mesto.postavi(13, 4, new Tretja.Stanovanjska(57));
        mesto.postavi(23, 10, new Tretja.Poslovna());
        mesto.postavi(26, 12, new Tretja.Stanovanjska(92));
        System.out.println(mesto.koliko(new Tretja.Stanovanjska(0)));
        System.out.println(mesto.koliko(new Tretja.Poslovna()));
        mesto.postavi(25, 16, new Tretja.Stanovanjska(29));
        System.out.println(mesto.koliko(new Tretja.Stanovanjska(0)));
        System.out.println(mesto.koliko(new Tretja.Poslovna()));
        mesto.postavi(21, 14, new Tretja.Stanovanjska(98));
        System.out.println(mesto.koliko(new Tretja.Stanovanjska(0)));
        System.out.println(mesto.koliko(new Tretja.Poslovna()));
        mesto.postavi(1, 9, new Tretja.Poslovna());
        mesto.postavi(14, 16, new Tretja.Poslovna());
        mesto.postavi(2, 11, new Tretja.Stanovanjska(36));
        mesto.postavi(1, 7, new Tretja.Poslovna());
        mesto.postavi(2, 4, new Tretja.Stanovanjska(91));
        System.out.println(mesto.koliko(new Tretja.Stanovanjska(0)));
        System.out.println(mesto.koliko(new Tretja.Poslovna()));
        mesto.postavi(5, 12, new Tretja.Stanovanjska(61));
        mesto.postavi(21, 0, new Tretja.Stanovanjska(49));
        mesto.postavi(20, 5, new Tretja.Stanovanjska(41));
        System.out.println(mesto.koliko(new Tretja.Stanovanjska(0)));
        System.out.println(mesto.koliko(new Tretja.Poslovna()));
        mesto.postavi(6, 5, new Tretja.Stanovanjska(59));
        mesto.postavi(12, 13, new Tretja.Poslovna());
        System.out.println(mesto.koliko(new Tretja.Stanovanjska(0)));
        System.out.println(mesto.koliko(new Tretja.Poslovna()));
        mesto.postavi(21, 13, new Tretja.Poslovna());
        System.out.println(mesto.koliko(new Tretja.Stanovanjska(0)));
        System.out.println(mesto.koliko(new Tretja.Poslovna()));
        mesto.postavi(23, 15, new Tretja.Poslovna());
        mesto.postavi(18, 12, new Tretja.Poslovna());
        System.out.println(mesto.koliko(new Tretja.Stanovanjska(0)));
        System.out.println(mesto.koliko(new Tretja.Poslovna()));
        mesto.postavi(7, 13, new Tretja.Stanovanjska(30));
        System.out.println(mesto.koliko(new Tretja.Stanovanjska(0)));
        System.out.println(mesto.koliko(new Tretja.Poslovna()));
        mesto.postavi(24, 1, new Tretja.Poslovna());
        System.out.println(mesto.koliko(new Tretja.Stanovanjska(0)));
        System.out.println(mesto.koliko(new Tretja.Poslovna()));
        mesto.postavi(13, 17, new Tretja.Stanovanjska(38));
        System.out.println(mesto.koliko(new Tretja.Stanovanjska(0)));
        System.out.println(mesto.koliko(new Tretja.Poslovna()));
        mesto.postavi(21, 4, new Tretja.Stanovanjska(80));
        mesto.postavi(15, 8, new Tretja.Stanovanjska(17));
        System.out.println(mesto.koliko(new Tretja.Stanovanjska(0)));
        System.out.println(mesto.koliko(new Tretja.Poslovna()));
        mesto.postavi(14, 11, new Tretja.Stanovanjska(99));
        System.out.println(mesto.koliko(new Tretja.Stanovanjska(0)));
        System.out.println(mesto.koliko(new Tretja.Poslovna()));
        mesto.postavi(23, 0, new Tretja.Stanovanjska(31));
        mesto.postavi(21, 11, new Tretja.Poslovna());
        System.out.println(mesto.koliko(new Tretja.Stanovanjska(0)));
        System.out.println(mesto.koliko(new Tretja.Poslovna()));
        mesto.postavi(10, 14, new Tretja.Poslovna());
        mesto.postavi(19, 6, new Tretja.Poslovna());
        mesto.postavi(26, 6, new Tretja.Poslovna());
        mesto.postavi(15, 3, new Tretja.Poslovna());
        mesto.postavi(14, 14, new Tretja.Stanovanjska(64));
        mesto.postavi(7, 10, new Tretja.Poslovna());
        System.out.println(mesto.koliko(new Tretja.Stanovanjska(0)));
        System.out.println(mesto.koliko(new Tretja.Poslovna()));
        mesto.postavi(24, 8, new Tretja.Poslovna());
        System.out.println(mesto.koliko(new Tretja.Stanovanjska(0)));
        System.out.println(mesto.koliko(new Tretja.Poslovna()));
        mesto.postavi(6, 14, new Tretja.Stanovanjska(39));
        mesto.postavi(21, 5, new Tretja.Poslovna());
        mesto.postavi(26, 8, new Tretja.Poslovna());
        mesto.postavi(0, 0, new Tretja.Stanovanjska(13));
        mesto.postavi(8, 2, new Tretja.Stanovanjska(95));
        mesto.postavi(8, 16, new Tretja.Poslovna());
        System.out.println(mesto.koliko(new Tretja.Stanovanjska(0)));
        System.out.println(mesto.koliko(new Tretja.Poslovna()));
        mesto.postavi(6, 16, new Tretja.Stanovanjska(1));
        System.out.println(mesto.koliko(new Tretja.Stanovanjska(0)));
        System.out.println(mesto.koliko(new Tretja.Poslovna()));
        mesto.postavi(15, 9, new Tretja.Poslovna());
        System.out.println(mesto.koliko(new Tretja.Stanovanjska(0)));
        System.out.println(mesto.koliko(new Tretja.Poslovna()));
        mesto.postavi(10, 17, new Tretja.Stanovanjska(9));
        System.out.println(mesto.koliko(new Tretja.Stanovanjska(0)));
        System.out.println(mesto.koliko(new Tretja.Poslovna()));
        mesto.postavi(16, 6, new Tretja.Poslovna());
        mesto.postavi(26, 14, new Tretja.Stanovanjska(43));
        mesto.postavi(16, 1, new Tretja.Stanovanjska(88));
        mesto.postavi(3, 4, new Tretja.Stanovanjska(77));
        mesto.postavi(7, 8, new Tretja.Stanovanjska(75));
        mesto.postavi(22, 8, new Tretja.Poslovna());
        System.out.println(mesto.koliko(new Tretja.Stanovanjska(0)));
        System.out.println(mesto.koliko(new Tretja.Poslovna()));
        mesto.postavi(15, 10, new Tretja.Stanovanjska(55));
        System.out.println(mesto.koliko(new Tretja.Stanovanjska(0)));
        System.out.println(mesto.koliko(new Tretja.Poslovna()));
        mesto.postavi(9, 12, new Tretja.Poslovna());
        System.out.println(mesto.koliko(new Tretja.Stanovanjska(0)));
        System.out.println(mesto.koliko(new Tretja.Poslovna()));
        mesto.postavi(20, 4, new Tretja.Stanovanjska(40));
        System.out.println(mesto.koliko(new Tretja.Stanovanjska(0)));
        System.out.println(mesto.koliko(new Tretja.Poslovna()));
        mesto.postavi(0, 16, new Tretja.Poslovna());
        mesto.postavi(11, 12, new Tretja.Poslovna());
        System.out.println(mesto.koliko(new Tretja.Stanovanjska(0)));
        System.out.println(mesto.koliko(new Tretja.Poslovna()));
        mesto.postavi(7, 15, new Tretja.Stanovanjska(4));
        System.out.println(mesto.koliko(new Tretja.Stanovanjska(0)));
        System.out.println(mesto.koliko(new Tretja.Poslovna()));
        mesto.postavi(21, 16, new Tretja.Poslovna());
        mesto.postavi(25, 11, new Tretja.Poslovna());
        System.out.println(mesto.koliko(new Tretja.Stanovanjska(0)));
        System.out.println(mesto.koliko(new Tretja.Poslovna()));
        mesto.postavi(18, 11, new Tretja.Stanovanjska(38));
        mesto.postavi(17, 9, new Tretja.Stanovanjska(30));
        mesto.postavi(8, 10, new Tretja.Stanovanjska(91));
        mesto.postavi(3, 12, new Tretja.Poslovna());
        mesto.postavi(6, 8, new Tretja.Poslovna());
        System.out.println(mesto.koliko(new Tretja.Stanovanjska(0)));
        System.out.println(mesto.koliko(new Tretja.Poslovna()));
        mesto.postavi(1, 6, new Tretja.Stanovanjska(29));
        System.out.println(mesto.koliko(new Tretja.Stanovanjska(0)));
        System.out.println(mesto.koliko(new Tretja.Poslovna()));
        mesto.postavi(13, 3, new Tretja.Stanovanjska(7));
        mesto.postavi(7, 2, new Tretja.Stanovanjska(89));
        mesto.postavi(11, 5, new Tretja.Poslovna());
        mesto.postavi(11, 15, new Tretja.Poslovna());
        mesto.postavi(22, 1, new Tretja.Stanovanjska(27));
        System.out.println(mesto.koliko(new Tretja.Stanovanjska(0)));
        System.out.println(mesto.koliko(new Tretja.Poslovna()));
        mesto.postavi(22, 13, new Tretja.Stanovanjska(52));
        mesto.postavi(7, 12, new Tretja.Poslovna());
        mesto.postavi(9, 16, new Tretja.Stanovanjska(75));
        mesto.postavi(18, 16, new Tretja.Stanovanjska(18));
        System.out.println(mesto.koliko(new Tretja.Stanovanjska(0)));
        System.out.println(mesto.koliko(new Tretja.Poslovna()));
        mesto.postavi(1, 4, new Tretja.Stanovanjska(58));
        mesto.postavi(6, 1, new Tretja.Stanovanjska(62));
        System.out.println(mesto.koliko(new Tretja.Stanovanjska(0)));
        System.out.println(mesto.koliko(new Tretja.Poslovna()));
        mesto.postavi(5, 4, new Tretja.Poslovna());
        System.out.println(mesto.koliko(new Tretja.Stanovanjska(0)));
        System.out.println(mesto.koliko(new Tretja.Poslovna()));
        mesto.postavi(17, 14, new Tretja.Stanovanjska(41));
        mesto.postavi(0, 13, new Tretja.Stanovanjska(20));
        mesto.postavi(17, 13, new Tretja.Stanovanjska(22));
        System.out.println(mesto.koliko(new Tretja.Stanovanjska(0)));
        System.out.println(mesto.koliko(new Tretja.Poslovna()));
        mesto.postavi(26, 17, new Tretja.Poslovna());
        System.out.println(mesto.koliko(new Tretja.Stanovanjska(0)));
        System.out.println(mesto.koliko(new Tretja.Poslovna()));
        mesto.postavi(21, 7, new Tretja.Poslovna());
        mesto.postavi(4, 15, new Tretja.Stanovanjska(73));
        mesto.postavi(3, 13, new Tretja.Stanovanjska(51));
        System.out.println(mesto.koliko(new Tretja.Stanovanjska(0)));
        System.out.println(mesto.koliko(new Tretja.Poslovna()));
        mesto.postavi(13, 7, new Tretja.Poslovna());
        System.out.println(mesto.koliko(new Tretja.Stanovanjska(0)));
        System.out.println(mesto.koliko(new Tretja.Poslovna()));
        mesto.postavi(25, 10, new Tretja.Stanovanjska(100));
        mesto.postavi(26, 7, new Tretja.Stanovanjska(61));
        mesto.postavi(25, 9, new Tretja.Stanovanjska(56));
        mesto.postavi(17, 10, new Tretja.Stanovanjska(47));
        mesto.postavi(9, 4, new Tretja.Stanovanjska(10));
        System.out.println(mesto.koliko(new Tretja.Stanovanjska(0)));
        System.out.println(mesto.koliko(new Tretja.Poslovna()));
        mesto.postavi(2, 14, new Tretja.Poslovna());
        System.out.println(mesto.koliko(new Tretja.Stanovanjska(0)));
        System.out.println(mesto.koliko(new Tretja.Poslovna()));
        mesto.postavi(6, 13, new Tretja.Stanovanjska(92));
        System.out.println(mesto.koliko(new Tretja.Stanovanjska(0)));
        System.out.println(mesto.koliko(new Tretja.Poslovna()));
        mesto.postavi(21, 15, new Tretja.Stanovanjska(9));
        mesto.postavi(3, 15, new Tretja.Poslovna());
        mesto.postavi(20, 3, new Tretja.Stanovanjska(3));
        System.out.println(mesto.koliko(new Tretja.Stanovanjska(0)));
        System.out.println(mesto.koliko(new Tretja.Poslovna()));
        mesto.postavi(14, 5, new Tretja.Poslovna());
        System.out.println(mesto.koliko(new Tretja.Stanovanjska(0)));
        System.out.println(mesto.koliko(new Tretja.Poslovna()));
        mesto.postavi(3, 9, new Tretja.Stanovanjska(85));
        System.out.println(mesto.koliko(new Tretja.Stanovanjska(0)));
        System.out.println(mesto.koliko(new Tretja.Poslovna()));
        mesto.postavi(5, 14, new Tretja.Stanovanjska(12));
        mesto.postavi(13, 6, new Tretja.Stanovanjska(83));
        System.out.println(mesto.koliko(new Tretja.Stanovanjska(0)));
        System.out.println(mesto.koliko(new Tretja.Poslovna()));
        mesto.postavi(24, 17, new Tretja.Stanovanjska(22));
        System.out.println(mesto.koliko(new Tretja.Stanovanjska(0)));
        System.out.println(mesto.koliko(new Tretja.Poslovna()));
        mesto.postavi(25, 0, new Tretja.Poslovna());
        mesto.postavi(21, 1, new Tretja.Poslovna());
        mesto.postavi(0, 4, new Tretja.Poslovna());
        System.out.println(mesto.koliko(new Tretja.Stanovanjska(0)));
        System.out.println(mesto.koliko(new Tretja.Poslovna()));
        mesto.postavi(15, 15, new Tretja.Stanovanjska(51));
        mesto.postavi(18, 8, new Tretja.Stanovanjska(50));
        mesto.postavi(4, 16, new Tretja.Stanovanjska(90));
        System.out.println(mesto.koliko(new Tretja.Stanovanjska(0)));
        System.out.println(mesto.koliko(new Tretja.Poslovna()));
        mesto.postavi(26, 16, new Tretja.Poslovna());
        mesto.postavi(1, 13, new Tretja.Poslovna());
        mesto.postavi(3, 11, new Tretja.Stanovanjska(13));
        mesto.postavi(22, 16, new Tretja.Stanovanjska(3));
        System.out.println(mesto.koliko(new Tretja.Stanovanjska(0)));
        System.out.println(mesto.koliko(new Tretja.Poslovna()));
        mesto.postavi(6, 17, new Tretja.Stanovanjska(23));
        mesto.postavi(25, 14, new Tretja.Poslovna());
        System.out.println(mesto.koliko(new Tretja.Stanovanjska(0)));
        System.out.println(mesto.koliko(new Tretja.Poslovna()));
        mesto.postavi(17, 3, new Tretja.Poslovna());
        mesto.postavi(16, 2, new Tretja.Poslovna());
        System.out.println(mesto.koliko(new Tretja.Stanovanjska(0)));
        System.out.println(mesto.koliko(new Tretja.Poslovna()));
        mesto.postavi(16, 9, new Tretja.Poslovna());
        mesto.postavi(14, 10, new Tretja.Stanovanjska(52));
        mesto.postavi(3, 3, new Tretja.Stanovanjska(93));
        mesto.postavi(9, 15, new Tretja.Stanovanjska(27));
        mesto.postavi(14, 3, new Tretja.Stanovanjska(37));
        System.out.println(mesto.koliko(new Tretja.Stanovanjska(0)));
        System.out.println(mesto.koliko(new Tretja.Poslovna()));
        mesto.postavi(19, 12, new Tretja.Poslovna());
        mesto.postavi(13, 11, new Tretja.Poslovna());
        mesto.postavi(12, 4, new Tretja.Poslovna());
        mesto.postavi(16, 15, new Tretja.Stanovanjska(5));
        System.out.println(mesto.koliko(new Tretja.Stanovanjska(0)));
        System.out.println(mesto.koliko(new Tretja.Poslovna()));
        mesto.postavi(5, 0, new Tretja.Stanovanjska(32));
        mesto.postavi(12, 2, new Tretja.Stanovanjska(65));
        System.out.println(mesto.koliko(new Tretja.Stanovanjska(0)));
        System.out.println(mesto.koliko(new Tretja.Poslovna()));
        mesto.postavi(10, 5, new Tretja.Stanovanjska(36));
        mesto.postavi(0, 3, new Tretja.Poslovna());
        mesto.postavi(17, 8, new Tretja.Poslovna());
        System.out.println(mesto.koliko(new Tretja.Stanovanjska(0)));
        System.out.println(mesto.koliko(new Tretja.Poslovna()));
        mesto.postavi(0, 5, new Tretja.Poslovna());
        System.out.println(mesto.koliko(new Tretja.Stanovanjska(0)));
        System.out.println(mesto.koliko(new Tretja.Poslovna()));
        mesto.postavi(20, 8, new Tretja.Stanovanjska(22));
        mesto.postavi(12, 1, new Tretja.Poslovna());
        mesto.postavi(14, 7, new Tretja.Poslovna());
        mesto.postavi(2, 16, new Tretja.Stanovanjska(15));
        mesto.postavi(8, 14, new Tretja.Stanovanjska(46));
        System.out.println(mesto.koliko(new Tretja.Stanovanjska(0)));
        System.out.println(mesto.koliko(new Tretja.Poslovna()));
        mesto.postavi(10, 7, new Tretja.Stanovanjska(13));
        mesto.postavi(20, 9, new Tretja.Poslovna());
        System.out.println(mesto.koliko(new Tretja.Stanovanjska(0)));
        System.out.println(mesto.koliko(new Tretja.Poslovna()));
        mesto.postavi(7, 9, new Tretja.Poslovna());
        mesto.postavi(4, 0, new Tretja.Stanovanjska(20));
        mesto.postavi(8, 13, new Tretja.Stanovanjska(91));
        System.out.println(mesto.koliko(new Tretja.Stanovanjska(0)));
        System.out.println(mesto.koliko(new Tretja.Poslovna()));
        mesto.postavi(4, 13, new Tretja.Poslovna());
        System.out.println(mesto.koliko(new Tretja.Stanovanjska(0)));
        System.out.println(mesto.koliko(new Tretja.Poslovna()));
        mesto.postavi(7, 6, new Tretja.Poslovna());
        System.out.println(mesto.koliko(new Tretja.Stanovanjska(0)));
        System.out.println(mesto.koliko(new Tretja.Poslovna()));
        mesto.postavi(17, 0, new Tretja.Stanovanjska(38));
        mesto.postavi(19, 7, new Tretja.Poslovna());
        mesto.postavi(25, 2, new Tretja.Stanovanjska(95));
        mesto.postavi(10, 10, new Tretja.Stanovanjska(27));
        mesto.postavi(21, 12, new Tretja.Stanovanjska(35));
        mesto.postavi(17, 5, new Tretja.Stanovanjska(61));
        System.out.println(mesto.koliko(new Tretja.Stanovanjska(0)));
        System.out.println(mesto.koliko(new Tretja.Poslovna()));
        mesto.postavi(9, 0, new Tretja.Stanovanjska(67));
        mesto.postavi(11, 2, new Tretja.Poslovna());
        mesto.postavi(15, 12, new Tretja.Stanovanjska(35));
        mesto.postavi(2, 10, new Tretja.Poslovna());
        System.out.println(mesto.koliko(new Tretja.Stanovanjska(0)));
        System.out.println(mesto.koliko(new Tretja.Poslovna()));
        mesto.postavi(15, 16, new Tretja.Stanovanjska(51));
        System.out.println(mesto.koliko(new Tretja.Stanovanjska(0)));
        System.out.println(mesto.koliko(new Tretja.Poslovna()));
        mesto.postavi(13, 10, new Tretja.Poslovna());
        System.out.println(mesto.koliko(new Tretja.Stanovanjska(0)));
        System.out.println(mesto.koliko(new Tretja.Poslovna()));
        mesto.postavi(4, 14, new Tretja.Stanovanjska(40));
        mesto.postavi(22, 0, new Tretja.Poslovna());
        System.out.println(mesto.koliko(new Tretja.Stanovanjska(0)));
        System.out.println(mesto.koliko(new Tretja.Poslovna()));
        mesto.postavi(14, 13, new Tretja.Poslovna());
        mesto.postavi(2, 8, new Tretja.Poslovna());
        mesto.postavi(19, 14, new Tretja.Stanovanjska(9));
        System.out.println(mesto.koliko(new Tretja.Stanovanjska(0)));
        System.out.println(mesto.koliko(new Tretja.Poslovna()));
        mesto.postavi(25, 8, new Tretja.Poslovna());
        System.out.println(mesto.koliko(new Tretja.Stanovanjska(0)));
        System.out.println(mesto.koliko(new Tretja.Poslovna()));
        mesto.postavi(22, 2, new Tretja.Poslovna());
        mesto.postavi(10, 3, new Tretja.Stanovanjska(80));
        mesto.postavi(1, 15, new Tretja.Poslovna());
        mesto.postavi(18, 3, new Tretja.Poslovna());
        mesto.postavi(5, 3, new Tretja.Stanovanjska(91));
        System.out.println(mesto.koliko(new Tretja.Stanovanjska(0)));
        System.out.println(mesto.koliko(new Tretja.Poslovna()));
        mesto.postavi(13, 9, new Tretja.Stanovanjska(45));
        System.out.println(mesto.koliko(new Tretja.Stanovanjska(0)));
        System.out.println(mesto.koliko(new Tretja.Poslovna()));
        mesto.postavi(15, 1, new Tretja.Stanovanjska(40));
        mesto.postavi(4, 1, new Tretja.Stanovanjska(95));
        mesto.postavi(12, 0, new Tretja.Stanovanjska(85));
        System.out.println(mesto.koliko(new Tretja.Stanovanjska(0)));
        System.out.println(mesto.koliko(new Tretja.Poslovna()));
        mesto.postavi(1, 12, new Tretja.Poslovna());
        mesto.postavi(26, 10, new Tretja.Stanovanjska(97));
        System.out.println(mesto.koliko(new Tretja.Stanovanjska(0)));
        System.out.println(mesto.koliko(new Tretja.Poslovna()));
        mesto.postavi(18, 7, new Tretja.Poslovna());
        mesto.postavi(2, 17, new Tretja.Poslovna());
        mesto.postavi(0, 10, new Tretja.Poslovna());
        mesto.postavi(23, 1, new Tretja.Poslovna());
        System.out.println(mesto.koliko(new Tretja.Stanovanjska(0)));
        System.out.println(mesto.koliko(new Tretja.Poslovna()));
        mesto.postavi(1, 3, new Tretja.Stanovanjska(66));
        mesto.postavi(0, 14, new Tretja.Stanovanjska(41));
        mesto.postavi(6, 12, new Tretja.Stanovanjska(80));
        mesto.postavi(18, 13, new Tretja.Stanovanjska(90));
        mesto.postavi(23, 14, new Tretja.Stanovanjska(50));
        mesto.postavi(8, 3, new Tretja.Stanovanjska(7));
        mesto.postavi(25, 4, new Tretja.Poslovna());
        mesto.postavi(25, 3, new Tretja.Stanovanjska(94));
        mesto.postavi(25, 1, new Tretja.Stanovanjska(29));
        System.out.println(mesto.koliko(new Tretja.Stanovanjska(0)));
        System.out.println(mesto.koliko(new Tretja.Poslovna()));
        mesto.postavi(8, 9, new Tretja.Stanovanjska(25));
        mesto.postavi(0, 2, new Tretja.Stanovanjska(21));
        mesto.postavi(24, 2, new Tretja.Poslovna());
        System.out.println(mesto.koliko(new Tretja.Stanovanjska(0)));
        System.out.println(mesto.koliko(new Tretja.Poslovna()));
        mesto.postavi(2, 15, new Tretja.Poslovna());
        mesto.postavi(8, 0, new Tretja.Stanovanjska(2));
        mesto.postavi(23, 16, new Tretja.Stanovanjska(47));
        mesto.postavi(4, 6, new Tretja.Poslovna());
        mesto.postavi(11, 9, new Tretja.Stanovanjska(90));
        mesto.postavi(21, 9, new Tretja.Poslovna());
        System.out.println(mesto.koliko(new Tretja.Stanovanjska(0)));
        System.out.println(mesto.koliko(new Tretja.Poslovna()));
        mesto.postavi(16, 5, new Tretja.Stanovanjska(50));
        mesto.postavi(20, 0, new Tretja.Poslovna());
        mesto.postavi(11, 4, new Tretja.Stanovanjska(58));
        System.out.println(mesto.koliko(new Tretja.Stanovanjska(0)));
        System.out.println(mesto.koliko(new Tretja.Poslovna()));
        mesto.postavi(6, 11, new Tretja.Stanovanjska(75));
        mesto.postavi(5, 8, new Tretja.Poslovna());
        mesto.postavi(14, 0, new Tretja.Poslovna());
        mesto.postavi(8, 15, new Tretja.Stanovanjska(4));
        mesto.postavi(3, 14, new Tretja.Stanovanjska(82));
        mesto.postavi(15, 11, new Tretja.Poslovna());
        mesto.postavi(4, 3, new Tretja.Poslovna());
        mesto.postavi(17, 16, new Tretja.Poslovna());
        System.out.println(mesto.koliko(new Tretja.Stanovanjska(0)));
        System.out.println(mesto.koliko(new Tretja.Poslovna()));
        mesto.postavi(1, 1, new Tretja.Stanovanjska(82));
        mesto.postavi(12, 17, new Tretja.Stanovanjska(5));
        System.out.println(mesto.koliko(new Tretja.Stanovanjska(0)));
        System.out.println(mesto.koliko(new Tretja.Poslovna()));
        mesto.postavi(19, 13, new Tretja.Poslovna());
        System.out.println(mesto.koliko(new Tretja.Stanovanjska(0)));
        System.out.println(mesto.koliko(new Tretja.Poslovna()));
        mesto.postavi(19, 4, new Tretja.Poslovna());
        mesto.postavi(5, 15, new Tretja.Stanovanjska(46));
        System.out.println(mesto.koliko(new Tretja.Stanovanjska(0)));
        System.out.println(mesto.koliko(new Tretja.Poslovna()));
        mesto.postavi(19, 17, new Tretja.Stanovanjska(18));
        mesto.postavi(18, 6, new Tretja.Stanovanjska(19));
        mesto.postavi(2, 12, new Tretja.Poslovna());
        mesto.postavi(15, 6, new Tretja.Stanovanjska(31));
        mesto.postavi(16, 13, new Tretja.Stanovanjska(17));
        mesto.postavi(4, 7, new Tretja.Poslovna());
        System.out.println(mesto.koliko(new Tretja.Stanovanjska(0)));
        System.out.println(mesto.koliko(new Tretja.Poslovna()));
        mesto.postavi(2, 0, new Tretja.Poslovna());
        mesto.postavi(17, 6, new Tretja.Stanovanjska(83));
        mesto.postavi(9, 6, new Tretja.Poslovna());
        mesto.postavi(13, 1, new Tretja.Stanovanjska(32));
        System.out.println(mesto.koliko(new Tretja.Stanovanjska(0)));
        System.out.println(mesto.koliko(new Tretja.Poslovna()));
        mesto.postavi(2, 6, new Tretja.Stanovanjska(74));
        System.out.println(mesto.koliko(new Tretja.Stanovanjska(0)));
        System.out.println(mesto.koliko(new Tretja.Poslovna()));
        mesto.postavi(2, 5, new Tretja.Stanovanjska(68));
        mesto.postavi(14, 17, new Tretja.Stanovanjska(38));
        System.out.println(mesto.koliko(new Tretja.Stanovanjska(0)));
        System.out.println(mesto.koliko(new Tretja.Poslovna()));
        mesto.postavi(13, 2, new Tretja.Poslovna());
        mesto.postavi(20, 12, new Tretja.Poslovna());
        mesto.postavi(24, 9, new Tretja.Poslovna());
        mesto.postavi(10, 12, new Tretja.Stanovanjska(35));
        mesto.postavi(0, 9, new Tretja.Stanovanjska(52));
        mesto.postavi(3, 1, new Tretja.Poslovna());
        System.out.println(mesto.koliko(new Tretja.Stanovanjska(0)));
        System.out.println(mesto.koliko(new Tretja.Poslovna()));
        mesto.postavi(10, 0, new Tretja.Stanovanjska(97));
        System.out.println(mesto.koliko(new Tretja.Stanovanjska(0)));
        System.out.println(mesto.koliko(new Tretja.Poslovna()));
        mesto.postavi(25, 17, new Tretja.Poslovna());
        mesto.postavi(8, 7, new Tretja.Poslovna());
        System.out.println(mesto.koliko(new Tretja.Stanovanjska(0)));
        System.out.println(mesto.koliko(new Tretja.Poslovna()));
        mesto.postavi(18, 17, new Tretja.Poslovna());
        mesto.postavi(24, 4, new Tretja.Poslovna());
        mesto.postavi(8, 6, new Tretja.Stanovanjska(25));
        mesto.postavi(17, 1, new Tretja.Stanovanjska(20));
        mesto.postavi(26, 9, new Tretja.Poslovna());
        mesto.postavi(20, 14, new Tretja.Poslovna());
        mesto.postavi(24, 16, new Tretja.Poslovna());
        mesto.postavi(11, 14, new Tretja.Stanovanjska(29));
        mesto.postavi(6, 0, new Tretja.Stanovanjska(49));
        System.out.println(mesto.koliko(new Tretja.Stanovanjska(0)));
        System.out.println(mesto.koliko(new Tretja.Poslovna()));
        mesto.postavi(12, 14, new Tretja.Stanovanjska(71));
        mesto.postavi(20, 10, new Tretja.Poslovna());
        mesto.postavi(25, 12, new Tretja.Stanovanjska(92));
        System.out.println(mesto.koliko(new Tretja.Stanovanjska(0)));
        System.out.println(mesto.koliko(new Tretja.Poslovna()));
        mesto.postavi(16, 12, new Tretja.Poslovna());
        System.out.println(mesto.koliko(new Tretja.Stanovanjska(0)));
        System.out.println(mesto.koliko(new Tretja.Poslovna()));
        mesto.postavi(19, 1, new Tretja.Stanovanjska(26));
        mesto.postavi(16, 17, new Tretja.Stanovanjska(33));
        System.out.println(mesto.koliko(new Tretja.Stanovanjska(0)));
        System.out.println(mesto.koliko(new Tretja.Poslovna()));
        mesto.postavi(11, 7, new Tretja.Poslovna());
        mesto.postavi(0, 8, new Tretja.Poslovna());
        mesto.postavi(7, 16, new Tretja.Poslovna());
        mesto.postavi(4, 5, new Tretja.Poslovna());
        mesto.postavi(20, 7, new Tretja.Stanovanjska(31));
        mesto.postavi(0, 6, new Tretja.Stanovanjska(29));
        System.out.println(mesto.koliko(new Tretja.Stanovanjska(0)));
        System.out.println(mesto.koliko(new Tretja.Poslovna()));
        mesto.postavi(0, 15, new Tretja.Stanovanjska(85));
        mesto.postavi(22, 5, new Tretja.Stanovanjska(82));
        mesto.postavi(11, 6, new Tretja.Poslovna());
        mesto.postavi(0, 11, new Tretja.Poslovna());
        mesto.postavi(3, 0, new Tretja.Poslovna());
        System.out.println(mesto.koliko(new Tretja.Stanovanjska(0)));
        System.out.println(mesto.koliko(new Tretja.Poslovna()));
        mesto.postavi(17, 4, new Tretja.Stanovanjska(25));
        System.out.println(mesto.koliko(new Tretja.Stanovanjska(0)));
        System.out.println(mesto.koliko(new Tretja.Poslovna()));
        mesto.postavi(8, 11, new Tretja.Stanovanjska(70));
        mesto.postavi(24, 10, new Tretja.Poslovna());
        mesto.postavi(10, 6, new Tretja.Poslovna());
        mesto.postavi(23, 8, new Tretja.Stanovanjska(5));
        mesto.postavi(2, 3, new Tretja.Stanovanjska(16));
        System.out.println(mesto.koliko(new Tretja.Stanovanjska(0)));
        System.out.println(mesto.koliko(new Tretja.Poslovna()));
        mesto.postavi(11, 17, new Tretja.Stanovanjska(57));
        mesto.postavi(11, 0, new Tretja.Stanovanjska(7));
        System.out.println(mesto.koliko(new Tretja.Stanovanjska(0)));
        System.out.println(mesto.koliko(new Tretja.Poslovna()));
        mesto.postavi(4, 12, new Tretja.Stanovanjska(80));
        System.out.println(mesto.koliko(new Tretja.Stanovanjska(0)));
        System.out.println(mesto.koliko(new Tretja.Poslovna()));
        mesto.postavi(14, 1, new Tretja.Poslovna());
        System.out.println(mesto.koliko(new Tretja.Stanovanjska(0)));
        System.out.println(mesto.koliko(new Tretja.Poslovna()));
        mesto.postavi(20, 11, new Tretja.Stanovanjska(97));
        System.out.println(mesto.koliko(new Tretja.Stanovanjska(0)));
        System.out.println(mesto.koliko(new Tretja.Poslovna()));
        mesto.postavi(4, 11, new Tretja.Poslovna());
        System.out.println(mesto.koliko(new Tretja.Stanovanjska(0)));
        System.out.println(mesto.koliko(new Tretja.Poslovna()));
        mesto.postavi(8, 5, new Tretja.Stanovanjska(76));
        mesto.postavi(24, 15, new Tretja.Poslovna());
        mesto.postavi(6, 3, new Tretja.Poslovna());
        mesto.postavi(1, 10, new Tretja.Poslovna());
        System.out.println(mesto.koliko(new Tretja.Stanovanjska(0)));
        System.out.println(mesto.koliko(new Tretja.Poslovna()));
        mesto.postavi(18, 14, new Tretja.Stanovanjska(79));
        mesto.postavi(14, 8, new Tretja.Stanovanjska(14));
        mesto.postavi(9, 9, new Tretja.Stanovanjska(89));
        mesto.postavi(20, 16, new Tretja.Stanovanjska(29));
        mesto.postavi(9, 11, new Tretja.Stanovanjska(50));
        mesto.postavi(25, 15, new Tretja.Stanovanjska(80));
        mesto.postavi(25, 7, new Tretja.Stanovanjska(52));
        mesto.postavi(18, 10, new Tretja.Stanovanjska(90));
        mesto.postavi(23, 6, new Tretja.Stanovanjska(2));
        System.out.println(mesto.koliko(new Tretja.Stanovanjska(0)));
        System.out.println(mesto.koliko(new Tretja.Poslovna()));
        mesto.postavi(11, 1, new Tretja.Stanovanjska(10));
        mesto.postavi(10, 2, new Tretja.Stanovanjska(77));
        System.out.println(mesto.koliko(new Tretja.Stanovanjska(0)));
        System.out.println(mesto.koliko(new Tretja.Poslovna()));
        mesto.postavi(13, 13, new Tretja.Poslovna());
        System.out.println(mesto.koliko(new Tretja.Stanovanjska(0)));
        System.out.println(mesto.koliko(new Tretja.Poslovna()));
        mesto.postavi(19, 2, new Tretja.Stanovanjska(17));
        mesto.postavi(26, 15, new Tretja.Stanovanjska(28));
        System.out.println(mesto.koliko(new Tretja.Stanovanjska(0)));
        System.out.println(mesto.koliko(new Tretja.Poslovna()));
        mesto.postavi(1, 11, new Tretja.Poslovna());
        System.out.println(mesto.koliko(new Tretja.Stanovanjska(0)));
        System.out.println(mesto.koliko(new Tretja.Poslovna()));
        mesto.postavi(10, 11, new Tretja.Stanovanjska(54));
        mesto.postavi(7, 4, new Tretja.Stanovanjska(82));
        mesto.postavi(4, 17, new Tretja.Poslovna());
        mesto.postavi(20, 2, new Tretja.Poslovna());
        System.out.println(mesto.koliko(new Tretja.Stanovanjska(0)));
        System.out.println(mesto.koliko(new Tretja.Poslovna()));
        mesto.postavi(12, 8, new Tretja.Poslovna());
        System.out.println(mesto.koliko(new Tretja.Stanovanjska(0)));
        System.out.println(mesto.koliko(new Tretja.Poslovna()));
        mesto.postavi(18, 1, new Tretja.Poslovna());
        mesto.postavi(19, 10, new Tretja.Stanovanjska(66));
        mesto.postavi(16, 11, new Tretja.Stanovanjska(68));
        System.out.println(mesto.koliko(new Tretja.Stanovanjska(0)));
        System.out.println(mesto.koliko(new Tretja.Poslovna()));
        mesto.postavi(13, 16, new Tretja.Poslovna());
        System.out.println(mesto.koliko(new Tretja.Stanovanjska(0)));
        System.out.println(mesto.koliko(new Tretja.Poslovna()));
        mesto.postavi(22, 3, new Tretja.Poslovna());
        mesto.postavi(6, 15, new Tretja.Stanovanjska(34));
        mesto.postavi(13, 14, new Tretja.Stanovanjska(26));
        mesto.postavi(13, 15, new Tretja.Poslovna());
        mesto.postavi(16, 4, new Tretja.Poslovna());
        mesto.postavi(7, 11, new Tretja.Poslovna());
        mesto.postavi(15, 14, new Tretja.Poslovna());
        mesto.postavi(22, 9, new Tretja.Stanovanjska(39));
        mesto.postavi(23, 5, new Tretja.Stanovanjska(7));
        System.out.println(mesto.koliko(new Tretja.Stanovanjska(0)));
        System.out.println(mesto.koliko(new Tretja.Poslovna()));
        mesto.postavi(10, 16, new Tretja.Stanovanjska(35));
        System.out.println(mesto.koliko(new Tretja.Stanovanjska(0)));
        System.out.println(mesto.koliko(new Tretja.Poslovna()));
        mesto.postavi(3, 2, new Tretja.Poslovna());
        mesto.postavi(13, 8, new Tretja.Stanovanjska(97));
        System.out.println(mesto.koliko(new Tretja.Stanovanjska(0)));
        System.out.println(mesto.koliko(new Tretja.Poslovna()));
        mesto.postavi(19, 11, new Tretja.Poslovna());
        mesto.postavi(1, 14, new Tretja.Poslovna());
        mesto.postavi(11, 10, new Tretja.Poslovna());
        mesto.postavi(25, 5, new Tretja.Poslovna());
        mesto.postavi(19, 8, new Tretja.Poslovna());
        mesto.postavi(9, 10, new Tretja.Poslovna());
        mesto.postavi(4, 4, new Tretja.Poslovna());
        mesto.postavi(7, 17, new Tretja.Stanovanjska(81));
        mesto.postavi(15, 13, new Tretja.Poslovna());
        System.out.println(mesto.koliko(new Tretja.Stanovanjska(0)));
        System.out.println(mesto.koliko(new Tretja.Poslovna()));
        mesto.postavi(24, 12, new Tretja.Poslovna());
        mesto.postavi(18, 5, new Tretja.Poslovna());
        System.out.println(mesto.koliko(new Tretja.Stanovanjska(0)));
        System.out.println(mesto.koliko(new Tretja.Poslovna()));
        mesto.postavi(20, 15, new Tretja.Poslovna());
        mesto.postavi(9, 17, new Tretja.Stanovanjska(37));
        mesto.postavi(24, 13, new Tretja.Poslovna());
        mesto.postavi(18, 9, new Tretja.Poslovna());
        System.out.println(mesto.koliko(new Tretja.Stanovanjska(0)));
        System.out.println(mesto.koliko(new Tretja.Poslovna()));
    }
}
