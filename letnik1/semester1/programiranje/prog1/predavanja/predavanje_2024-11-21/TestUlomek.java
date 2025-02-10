
public class TestUlomek {

    public static void main(String[] args) {
        Ulomek u = new Ulomek();
        u.stevec = 3;
        u.imenovalec = 5;
        System.out.printf("%d/%d%n",
                u.stevec, u.imenovalec);

        Ulomek v = new Ulomek();
        v.stevec = 4;
        v.imenovalec = 3;
        System.out.printf("%d/%d%n",
                v.stevec, v.imenovalec);

        Ulomek[] ulomki = new Ulomek[3];
        ulomki[0] = new Ulomek();
        ulomki[0].stevec = 10;
        ulomki[0].imenovalec = 11;

        Student s = new Student();
        s.predmeti = new Predmet[5];
        s.predmeti[0] = new Predmet();
        s.predmeti[0].ime = "P1";
    }
}
