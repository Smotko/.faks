
/*
Samodejno testiranje:

tj.exe

Javni testni primeri:

01--05: klici metode skupne
06--10: klici metode poDolziniBrezDuplikatov

01, 02, 06, 07: ro"cno izdelani
*/

import com.sun.source.tree.NewArrayTree;
import java.util.*;

public class Cetrta {

    public static void main(String[] args) {
        // dopolnite, "ce "zelite metodi testirati ro"cno
    }


    static class Crka{
        String ime;
        List<Integer> vrstice = new ArrayList<Integer>();
    
        Crka(String ime){
            this.ime = ime;
        }
    }
    
    static boolean checkName(List<Crka> list, Crka item, int vrstica)
    {
        for(Crka c : list)
        {
            if(c.ime.equals(item.ime))
            {
                c.vrstice.add(vrstica);
                return true;
            }
        }
        return false;
    }

    public static <T> Set<T> skupni(List<List<T>> s) {
        Set<T> ret = new HashSet<T>();
        int i = 1;
        List<Crka> crke = new ArrayList<Crka>();
        for (List<T> tx : s) {
            for (T ty : tx) {
                String zac = ty.toString();
                Crka item = new Crka(zac);
                if(!checkName(crke, item, i))
                {
                //    System.out.println(item.ime);
                    item.vrstice.add(i);
                    crke.add(item);
                }
            }
            i++;
        }
        int stev = 0;
        for(Crka c : crke)
        {
            for (int j : c.vrstice){

                stev ++;
                if(stev == s.size()){
                    ret.add((T)c.ime);
                }
            }
            stev = 0;
                
        }


        return ret;

        //  

        /* 
        
        Set<T> test = new HashSet<T>();
        Set<T> ret = new HashSet<T>();
        for(List<T> el : s){
            for(T el2 : el){

                

                test.add(el2); 
                int stevec = 0;

                for(int i = 0 ; i < s.size(); i++){

                    if(!test.contains(el2)){
                        break;
                    }

                    if(test.contains(el2)){
                        stevec ++;
                        test.remove(el2);

                        if(i == s.size()-2){
                            ret.add(el2);
                        }
                    }
                }
                for(int i = 0 ; i < stevec; i++){
                    test.add(el2);
                }

            }
        }
        return ret;
        */
        
    }

    public static <T> void poDolziniBrezDuplikatov(List<List<T>> s) {
        // dopolnite ...
    }


}
