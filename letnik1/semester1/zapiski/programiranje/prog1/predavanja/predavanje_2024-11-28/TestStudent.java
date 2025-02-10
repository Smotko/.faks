
public class TestStudent {

    public static void main(String[] args) {
        Student ana = new Student("Ana Novak", "63240123", 500);
        System.out.println(ana.vrniIP());
        System.out.println(ana.stroski());

        IzredniStudent bojan = new IzredniStudent("Bojan Petrič", "63240432", 300, 600);
        System.out.println(bojan.vrniIP());
        System.out.println(bojan.stroski());

        Student s = bojan;
        System.out.println(s.stroski());
        // poklicala se bo metoda stroski iz razreda IzredniStudent,
        // ker izvajalnik vidi, da kazalec <s> kaže na objekt tipa
        // IzredniStudent

        s = ana;
        System.out.println(s.stroski());

        // IzredniStudent is = ana; // napaka pri prevajanju

        Student[] t = new Student[4];
        t[0] = ana;
        t[1] = bojan;
        t[2] = new IzredniStudent("Cvetka Debeljak", "63231234", 700, 500);
        t[3] = new Student("Denis Golob", "63220167", 800);

        for (Student student: t) {
            System.out.printf("%s: %d%n", student.vrniIP(), student.stroski());
        }
    }
}
