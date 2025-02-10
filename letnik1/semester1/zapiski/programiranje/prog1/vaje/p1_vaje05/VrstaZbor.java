import java.util.Scanner;

public class VrstaZbor {

    private static boolean lokalnoPravilno(int[] t, int i) {
        return t[i] >= t[i-1] && t[i] <= t[i+1];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int stVojakov = sc.nextInt();
        int[] visine = new int[stVojakov];
        boolean vsajEden = false;

        for(int i = 0; i < stVojakov; i++){
            visine[i] = sc.nextInt();
        }

        if(stVojakov >= 3){
            if(visine[0] < visine[1]){
                System.out.println(0);
                vsajEden = true;
            }
            for(int i = 1; i < stVojakov - 1; i++){
                if(lokalnoPravilno(visine, i)){
                    System.out.println(i);
                    vsajEden = true;
                }
            }
            if(visine[stVojakov-2] < visine[stVojakov-1]){
                System.out.println(stVojakov-1);
                vsajEden = true;
            }
        }else if(stVojakov == 2){
            if(visine[0] <= visine[1]){
                System.out.println(0);
                System.out.println(1);
                vsajEden = true;
            }
        }else if(stVojakov == 1){
            System.out.println(0);
            vsajEden = true;
        }else{

        }
        if(!vsajEden)
            System.out.println("NOBEDEN");
        }
}