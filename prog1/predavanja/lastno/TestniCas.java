public class TestniCas{
    public static void main(String[] args){
        Cas kosilo = new Cas(9, 30);
        Cas malica = new Cas(13, 50);
        Cas.izpisi(kosilo);
        Cas.pristejcas(kosilo, 1, 10);
        Cas.izpisi(kosilo);
        kosilo.pristejcas2(2, 70);  
        
        System.out.print(kosilo.toString());

        System.out.print(kosilo.jeEnakaKot(malica));
    }
}