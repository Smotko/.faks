
public class Isci {

    public static void main(String[] args) {
        String[] nizi = {"Ana", "Bojan", "Cvetka"};
        Integer[] stevilke = {42, 50, 70};

        //System.out.println(Isci.<String>poisci(nizi, "Bojan"));
        System.out.println(Isci.<Integer>poisci(stevilke, 70));

        //System.out.println(poisci(nizi, "Bojan"));
        System.out.println(poisci(stevilke, 70));

//        System.out.println(poisci(nizi, 70);
    }

    public static <T extends Number> int poisci(T[] tabela, T element) {
        for (int i = 0; i < tabela.length; i++) {
            //if (tabela[i] == element) {
            if (tabela[i].equals(element)) {
                return i;
            }
        }
        return -1;
    }
}
