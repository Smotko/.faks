package prog1.predavanja.lastno.podrazredi;

public class Main {
    public static void main(String[] args) {
        Student ana = new Student("Ana Arko", "63240800", 500);
        IzredniStudent bojan = new IzredniStudent("Bojan Ban", "63240900", 600, 300);
        System.out.println(ana.toString());
        ana = bojan;
        System.out.println(ana.toString());
        Student[] studentje = {
            new Student("Ana Arko", "63240800", 500),
            new IzredniStudent("Bojan Ban", "63240900", 600, 300),
            new IzredniStudent("Cvetka Cevc", "63241000", 400, 350),
            new Student("Denis Denk", "63241100", 450)
            };
    }
}
