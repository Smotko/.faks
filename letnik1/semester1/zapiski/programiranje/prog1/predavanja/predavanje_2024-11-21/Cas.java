
public class Cas {
    private int ura;
    private int minuta;

    private static boolean zapis12 = false;

    public Cas(int h, int min) {
        this.ura = h;
        this.minuta = min;
    }

    public static void nastaviZapis12(boolean da) {
        zapis12 = da;    // ne this.zapis12!
    }

    public int vrniUro() {
        return this.ura;
    }

    public int vrniMinuto() {
        return this.minuta;
    }

    public void nastaviUro(int novaUra) {
        this.ura = novaUra;
    }

    public void nastaviMinuto(int novaMinuta) {
        this.minuta = novaMinuta;
    }

    public static void izpisiStatic(Cas cas) {
        System.out.printf("%d:%02d%n", cas.ura, cas.minuta);
    }

    public void izpisi() {
        System.out.printf("%d:%02d%n", this.ura, this.minuta);
    }

    public String toString() {
        if (zapis12) {
            String pripona = (this.ura < 12) ? ("AM") : ("PM");
            int h = (this.ura + 11) % 12 + 1;
            return String.format("%d:%02d %s", h, this.minuta, pripona);
        }
        return String.format("%d:%02d", this.ura, this.minuta);
    }

    public static void pristejStatic(Cas cas, int h, int min) {
        int noveMinute = 60 * (cas.ura + h) + (cas.minuta + min);
        noveMinute = (noveMinute % 1440 + 1440) % 1440;
        cas.ura = noveMinute / 60;
        cas.minuta = noveMinute % 60;
    }

    public void pristej(int h, int min) {
        int noveMinute = 60 * (this.ura + h) + (this.minuta + min);
        noveMinute = (noveMinute % 1440 + 1440) % 1440;
        this.ura = noveMinute / 60;
        this.minuta = noveMinute % 60;
    }

    public Cas plus(int h, int min) {
        int noveMinute = 60 * (this.ura + h) + (this.minuta + min);
        noveMinute = (noveMinute % 1440 + 1440) % 1440;

        int h1 = noveMinute / 60;
        int min1 = noveMinute % 60;
        return new Cas(h1, min1);
    }
    
    /*
    public static boolean staEnaka(Cas prvi, Cas drugi) {
        ...
    }
    */

    /*
    // Načeloma OK, vendar pa se moramo zavedati, da
    // primerja zgolj kazalca na objekta.
    public boolean jeEnakKot(Cas drugi) {
        return this == drugi;
    }
    */

    public boolean jeEnakKot(Cas drugi) {
        return this.ura == drugi.ura && this.minuta == drugi.minuta;
    }

    //
    // Vrne razliko (v minutah) med časoma <this> in <drugi>.
    //
    public int razlika(Cas drugi) {
        return 60 * (this.ura - drugi.ura) + (this.minuta - drugi.minuta);
    }

    public boolean jeManjsiAliEnakKot(Cas drugi) {
        /*
        return this.ura < drugi.ura || 
            this.ura == drugi.ura && this.minuta <= drugi.minuta;
        */
        return this.razlika(drugi) <= 0;
    }
}
