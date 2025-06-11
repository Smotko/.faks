import java.util.Scanner;
import java.util.Arrays;
public class DN04_63240298{

        public static long preverjanjeEnakosti(int[] moski, int[] zenske, int k){
                long stevec = 0;
                for(int i = 0; i < moski.length; i++){
                        for (int j = 0; j < zenske.length; j++){
                                if(moski[i] + zenske[j] == k){
                                        stevec++;
                                }
                        }
                }
                return stevec;
        }


        public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                int n = sc.nextInt(); //pair number
                int k = sc.nextInt(); //lucky number
                int[] moski = new int[n];
                int[] zenske = new int[n];
                for(int i = 0; i < n; i++){
                        moski[i] = sc.nextInt();
                        zenske[i] = moski[i];
                }
                
                System.out.println(preverjanjeEnakosti(moski, zenske, k));

        }
}
