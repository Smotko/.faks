
public class TestVektor {

    public static void main(String[] args) {
        Vektor v = new Vektor();
        v.dodaj("abc");
        v.dodaj(new Cas(10, 20));
        v.dodaj(5);
        // v.dodaj(Integer.valueOf(5));

        Object obj = v.vrni(0);
        System.out.println(obj);

        String str = (String) v.vrni(0);
        System.out.println(str.substring(1));

        String str2 = (String) obj;
        System.out.println(str2.substring(1));

        System.out.println(((String) obj).substring(1));

        Integer a = (Integer) v.vrni(0);
    }
}
