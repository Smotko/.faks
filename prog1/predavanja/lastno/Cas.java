public class Cas{
    private int ura;
    private int minuta;

    public Cas(int h, int min){
        this.ura  = h;
        this.minuta = min;
    }

    public static void izpisi(Cas cas){
        System.out.printf("%d:%02d%n",cas.ura , cas.minuta);
    }

    public static void pristejcas(Cas cas, int h, int min){
        int noveMinute = 60* (cas.ura + h) + (cas.minuta + min);
        cas.ura = noveMinute/60;
        cas.minuta = noveMinute%60;
    }

    public void pristejcas2(int h, int min){
        int noveMinute = 60* (this.ura + h) + (this.minuta + min);
        this.ura = noveMinute/60;
        this.minuta = noveMinute%60;
    }

    public Cas plus(int h, int min){
        int noveMinute = 60* (this.ura + h) + (this.minuta + min);
        noveMinute = (noveMinute%1440 + 1440) % 1440;
        int h1 = noveMinute/60;
        int min1 = noveMinute%60;
        return new Cas(h1, min1);
    }

    public String toString(){
        return String.format("%d:%02d%n",this.ura , this.minuta);
    }

    public boolean jeEnakaKot(Cas drugi){
        //return this.equals(drugi); rip bozo
        return this.ura == drugi.ura && this.minuta == drugi.minuta;
    }
}