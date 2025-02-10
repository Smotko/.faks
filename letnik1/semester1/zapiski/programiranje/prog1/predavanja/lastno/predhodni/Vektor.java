public class Vektor{

    private static final int ZACETNA_KAPACITETA = 10;

    private int[] elementi = new int[ZACETNA_KAPACITETA];
    private int povecajDolzino;

    public Vektor(int povecajDolzino){
        this.povecajDolzino = povecajDolzino;
    }

    public void setDolzinoTabele(){
        elementi = new int[ZACETNA_KAPACITETA + povecajDolzino];
    }

    public void izpisiDolzinoTabele(){
        setDolzinoTabele();
        System.out.println(elementi.length);
    }

}