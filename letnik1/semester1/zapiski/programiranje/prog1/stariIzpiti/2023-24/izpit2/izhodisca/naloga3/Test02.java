
import java.util.*;

public class Test02 {

    public static void main(String[] args) {
        Tretja.Mesto mesto = new Tretja.Mesto(3, 4);

        // gradnje brez ru"sitev
        mesto.postavi(0, 0, new Tretja.Stanovanjska(50));
        mesto.postavi(0, 1, new Tretja.Poslovna());
        mesto.postavi(1, 1, new Tretja.Poslovna());
        mesto.postavi(1, 2, new Tretja.Poslovna());
        mesto.postavi(1, 3, new Tretja.Stanovanjska(40));
        mesto.postavi(2, 0, new Tretja.Poslovna());
        mesto.postavi(2, 1, new Tretja.Poslovna());
        mesto.postavi(2, 2, new Tretja.Stanovanjska(60));

        // gradnje z ru"sitvami
        mesto.postavi(1, 1, new Tretja.Stanovanjska(70));  // prej: Poslovna
        mesto.postavi(1, 3, new Tretja.Poslovna());        // prej: Stanovanjska(40)
        mesto.postavi(2, 0, new Tretja.Poslovna());        // prej: Poslovna
        mesto.postavi(2, 2, new Tretja.Stanovanjska(25));  // prej: Stanovanjska(60)
        mesto.postavi(1, 1, new Tretja.Poslovna());        // prej: Stanovanjska(70)

        System.out.println(mesto.steviloStanovanj());
    }
}
