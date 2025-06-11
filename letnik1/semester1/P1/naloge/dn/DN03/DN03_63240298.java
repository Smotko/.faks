import java.util.Scanner;
import java.util.Arrays;

public class DN03_63240298{

        public static void prestejPloscice(int[][] stena){
                private int stPloscic = 0; 

                for(int i = 0; i < stena.length; i++){
                        for(int j = 0; j < stena[i].length; j ++){
                                if(stena[i][j] > 0){
                                        stPloscic++;
                                }
                        }
                }
                System.out.println(stPloscic);
        }

        public static int[][] zapolniDelStene(int[][] stena, int k, int zamik){
                
                private int preverjenavisina = 0;
                private int preverjenaDolzina = zamik;

                while(k > 0){
                        
                        for(int i = k + preverjenavisina; i <= stena.length; i+= k){
                                
                                for(int j = k + preverjenaDolzina; j <=stena[0].length; j+= k){
                                        stena[i-1][j-1] = k;
                                        preverjenaDolzina+= k;
                                }       
                                preverjenavisina += k;
                                preverjenaDolzina = zamik;
                        }
                        k /= 2;
                }
                return stena;
        }

        public static int[][] zapolniSteno(int[][] stena, int k){

                int zamik = 0;

                if(stena[0].length%k == 0){
                        stena = zapolniDelStene(stena,k,zamik);
                }else{
                        stena = zapolniDelStene(stena,k,zamik);
                        while(stena[0].length%k != 0){
                                zamik = stena[0].length-stena[0].length%k;
                                k /=2; 
                                stena = zapolniDelStene(stena,k,zamik); 
                        }
                }
                
                return stena;
        }

        public static void main(String[] args){
                Scanner sc = new Scanner(System.in);

                int h = sc.nextInt(); //stVrstic
                int w = sc.nextInt(); //stStolpcev
                int k = (int) Math.pow(2, sc.nextInt()); //stranicaNajvecjePloscice
                int[][] stena = new int[h][w];
                prestejPloscice(zapolniSteno(stena, k));
        }
}
