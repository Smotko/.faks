public class Isci{


    public static void main(String[] args){
        
        String[] nizi = {"aa", "ab", "bc"};
        Integer[] init = {1,2,4};
        System.out.println(poisci(init, 1));
    }

                            //POTREBUJEM, DA SE PREVEDE 
    public static <T extends Integer> Integer poisci(T[] tabela, T element){
        System.out.println(tabela[element]);
        return tabela[element];
    }
}