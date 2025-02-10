import java.util.*;
import java.util.function.*;
public class Test{
    public static void main(String[] args){
        String prva = "A";
        String druga = "B";
        final  int k = 12;
        int st1 = 2;
        int st2 = 3;
        IntBinaryOperator op = (a,b) -> (a+b)*k; 
        Comparator<String> primerjalnikPoDolzini = (a,b) -> a.charAt(0)- b.charAt(0);
        System.out.println(primerjalnikPoDolzini.compare(prva,druga));
        System.out.println(op.applyAsInt(st1,st2));

        Collection<Number> lol = List.of(3,4,5,6);
        Collection<String> l = new ArrayList<String>();

        List<Integer> stevila = List.of(20, 15, 32, 7, 19, 14, 23, 35);
        int stSodih = prestej(stevila, n-> n % 2== 0);
        List<String>imena = List.of("Ana","Branko", "Cvetka","Denis");
        int stImenDolzine5 = prestej(imena,ime-> ime.length() == 5);
        System.out.printf("%d  |  %d", stSodih, stImenDolzine5);

    }

    public static <T> int prestej(Collection<T> zbirka,Predicate<T> pogoj){
        int stevec =0;
        for (T element:zbirka){
                if (pogoj.test(element)) {
                   stevec++;
                }
        }
        return stevec;
    }


    
/*
    public static Comparator<String> primerjalnikPoDolzini(){
        return new Primerjalnik();
    }

    private static class Primerjalnik implements Comparator<String>{
        public Primerjalnik(){

        }
        @Override
        public int compare(String prva, String druga){
            return  0;
        }
    }
*/


}