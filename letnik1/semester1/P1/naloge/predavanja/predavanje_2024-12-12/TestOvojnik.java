
public class TestOvojnik {

    public static void main(String[] args) {
        Ovojnik<String> os = new Ovojnik<String>("abc");
        Ovojnik<Integer> oi = new Ovojnik<Integer>(123);

        // String niz = (String) os.vrni();
        String niz = os.vrni();
        Integer stevilo = oi.vrni();

        System.out.println(niz);
        System.out.println(stevilo);

        //Integer st = os.vrni();
        //Ovojnik<String> ot = new Ovojnik<String>(123);

        //Ovojnik<String> os2 = new Ovojnik<String>("xyz");
        Ovojnik<String> os2 = new Ovojnik<>("xyz");
    }
}
