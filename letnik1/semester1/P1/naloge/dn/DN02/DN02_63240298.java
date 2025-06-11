import java.util.Scanner;
public class DN02_63240298{

        public static void ravnovrstnica(int velikost, int dolzinaNiza){
                Scanner sc = new Scanner(System.in);

                int dolzinaPoti = 0;
                int pozicija1 = sc.nextInt();
                int pozicija2 = pozicija1;
                

                for (int i = 1; i < dolzinaNiza; i++){
                        pozicija2 = sc.nextInt();
                        dolzinaPoti += Math.abs(pozicija1/2 - pozicija2/2);
                        pozicija1 = pozicija2;
                }

                System.out.println(dolzinaPoti);
        }

        public static void kvadratnica(int velikost, int dolzinaNiza){
                Scanner sc = new Scanner(System.in);

                int dolzinaPoti = 0;
                int pozicija1 = sc.nextInt();
                int pozicija2 = pozicija1;
                int pozicijaPlaceholder = pozicija2;
                
                for(int i = 1; i < dolzinaNiza;i++){
                        pozicija2 = sc.nextInt();
                        pozicijaPlaceholder = pozicija2;
                        while((pozicija1 / velikost) != (pozicija2 / velikost)){
                                if(pozicija1 < pozicija2){
                                        pozicija2 -= velikost;
                                }else{
                                        pozicija1 -= velikost;
                                }
                                dolzinaPoti ++;
                        }
                        dolzinaPoti += Math.abs(pozicija1 - pozicija2);
                        pozicija1 = pozicijaPlaceholder;
                }
                System.out.println(dolzinaPoti);
        }

        public static void piramidnica(int velikost, int dolzinaNiza){
                Scanner sc = new Scanner(System.in);

                int dolzinaPoti = 0;
                int pozicija1 = sc.nextInt();
                int pozicija2 = pozicija1;
                int pozicijaPlaceholder = pozicija2;
                
                for(int i = 1; i < dolzinaNiza;i++){
                        pozicija2 = sc.nextInt();
                        pozicijaPlaceholder = pozicija2;
                        while((Math.floor(Math.sqrt(pozicija1))) != Math.floor((Math.sqrt(pozicija2)))){
                                if(pozicija1 < pozicija2){
                                        if(pozicija2 % Math.sqrt(pozicija2) == 0){
                                                pozicija2 -= (Math.sqrt(pozicija2)*2-1);
                                                dolzinaPoti +=2;
                                        }else if(pozicija2 +1 % Math.sqrt(pozicija2 + 1) == 0){
                                                pozicija2 -= (Math.sqrt(pozicija2 +1)*2-1);
                                                dolzinaPoti +=2;
                                        }else{
                                                pozicija2 -= Math.floor((Math.sqrt(pozicija2)))*2;
                                                dolzinaPoti ++;
                                        }
                                }else{
                                        if(pozicija1 % Math.sqrt(pozicija1) == 0){
                                                pozicija1 -= (Math.sqrt(pozicija1)*2-1);
                                                dolzinaPoti +=2;
                                        }else if(pozicija1 +1 % Math.sqrt(pozicija1 + 1) == 0){
                                                pozicija1 -= (Math.sqrt(pozicija1 +1)*2-1);
                                                dolzinaPoti +=2;
                                        }else{
                                                pozicija1 -= Math.floor((Math.sqrt(pozicija1)))*2;
                                                dolzinaPoti ++;
                                        }
                                }
                        }
                        dolzinaPoti += Math.abs(pozicija1 - pozicija2);
                        pozicija1 = pozicijaPlaceholder;
                }
                System.out.println(dolzinaPoti);
        }

        public static void spiralnica(int velikost, int dolzinaNiza){
                Scanner sc = new Scanner(System.in);

                int dolzinaPoti = 0;
                int pozicija1 = sc.nextInt();
                int pozicija2 = pozicija1;
                int pozicijaPlaceholder = pozicija2;
                
                for(int i = 1; i < dolzinaNiza;i++){
                        pozicija2 = sc.nextInt();
                        pozicijaPlaceholder = pozicija2;
                        while((Math.floor(Math.sqrt(pozicija1))) != Math.floor((Math.sqrt(pozicija2)))){
                                if(pozicija1 < pozicija2){
                                        if(pozicija2 % Math.sqrt(pozicija2) == 0){
                                                pozicija2 -= (Math.sqrt(pozicija2)*2-1);
                                                dolzinaPoti +=2;
                                        }else if(pozicija2 +1 % Math.sqrt(pozicija2 + 1) == 0){
                                                pozicija2 -= (Math.sqrt(pozicija2 +1)*2-1);
                                                dolzinaPoti +=2;
                                        }else{
                                                pozicija2 -= Math.floor((Math.sqrt(pozicija2)))*2;
                                                dolzinaPoti ++;
                                        }
                                }else{
                                        if(pozicija1 % Math.sqrt(pozicija1) == 0){
                                                pozicija1 -= (Math.sqrt(pozicija1)*2-1);
                                                dolzinaPoti +=2;
                                        }else if(pozicija1 +1 % Math.sqrt(pozicija1 + 1) == 0){
                                                pozicija1 -= (Math.sqrt(pozicija1 +1)*2-1);
                                                dolzinaPoti +=2;
                                        }else{
                                                pozicija1 -= Math.floor((Math.sqrt(pozicija1)))*2;
                                                dolzinaPoti ++;
                                        }
                                }
                        }
                        dolzinaPoti += Math.abs(pozicija1 - pozicija2);
                        pozicija1 = pozicijaPlaceholder;
                }
                System.out.println(dolzinaPoti);
        }

        public static void tipkovnica(int oblika, int velikost, int dolzinaNiza){
                switch(oblika){
                case 2:
                        kvadratnica(velikost, dolzinaNiza);
                        break;
                case 3:
                        piramidnica(velikost, dolzinaNiza);
                        break;
                case 4:
                        spiralnica(velikost, dolzinaNiza);
                        break;
                default:
                        ravnovrstnica(velikost, dolzinaNiza);
                }
        }

        public static void main(String[] args){
                Scanner sc = new Scanner(System.in);

                int b = sc.nextInt();
                int d = sc.nextInt();
                int n = sc.nextInt();

                tipkovnica(b, d, n);    
        }
}
