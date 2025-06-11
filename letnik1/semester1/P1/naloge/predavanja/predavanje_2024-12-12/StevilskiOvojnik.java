
public class StevilskiOvojnik<T extends Number> {

    private T a;
    
    public StevilskiOvojnik(T a) {
        this.a = a;
    }

    public T vrni() {
        return this.a;
    }

    public boolean jeVecjiKot(StevilskiOvojnik<T> so) {
        return this.a.doubleValue() > so.a.doubleValue();
    }

    public <U extends Number> boolean jeVecjiKot2(
            StevilskiOvojnik<U> so) {
        return this.a.doubleValue() > so.a.doubleValue();
    }

}
