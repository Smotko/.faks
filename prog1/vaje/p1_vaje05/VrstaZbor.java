import java.util.Scanner;

public class VrstaZbor {
    
    /** 
     * Naredi tabelo, prebere visine vojakov in jo vrne
     */
    
    private static int[] preberiVisine(int n, Scanner sc) {
        int[] visine = new int[n];
        for(int i = 0; i < n; i++){
            visine[i] = sc.nextInt();
        }
        return visine;
    }
    
    private static void izpisi(int[] t) {
        for(int i = 0; i < t.length; i++){
            System.out.printf("%d", t[i]);
        }
    }
    
    /** 
     * Vrne true natanko v primeru, ce je element tabele 't' na indeksu 'ix' vecji
     * ali enak kot njegov levi sosed in hkrati manjsi ali enak kot njegov desni sosed.
     */
    
    private static boolean lokalnoPravilno(int[] t, int ix) {

        boolean pravilnost = false;
        if(t[0]<t[1]){
            pravilnost = true;
        }else{
            pravilnost = false;
        }

        if(t[t.length-1]<t[t.length]){
            pravilnost = true;
        }else{
            pravilnost = false;
        }

        for(int i = 0; i <= t.length - 2; i++){
            if(t[i] < t[i+1] && t[i+1] < t[i+2]){
                pravilnost = true;
            }else{
                pravilnost = false;
            }
        }
        return pravilnost;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int stVojakov = sc.nextInt();
        int[] visine = new int[stVojakov];

        boolean vsajeden = false;

        for(int i = 0; i < stVojakov; i++){
            if(lokalnoPravilno(visine, i) == true){
                System.out.println(i);
                vsajeden = true;
            }

            if(!vsajeden){
                System.out.println("NOBEDEN");
            }
        }
            
    }
}