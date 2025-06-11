
public abstract class Zaporedje {

    public abstract Integer y(int x);

    public String vNiz(Interval interval) {
        StringBuilder sb = new StringBuilder("[");
        int zacetek = interval.vrniZacetek();
        int konec = interval.vrniKonec();
        boolean prvic = true;
        for (int x = zacetek;  x <= konec;  x++) {
            Integer y = this.y(x);
            if (y != null) {
                if (!prvic) {
                    sb.append(", ");
                }
                prvic = false;
                sb.append(String.format("%d -> %d", x, y));
            }
        }
        sb.append("]");
        return sb.toString();
    }

    public Interval minMax(Interval interval) {
        // popravite / dopolnite ...
        return null;
    }

    public boolean jeMonotono(Interval interval) {
        // popravite / dopolnite ...
        return false;
    }

    public Zaporedje vsota(Zaporedje drugo) {
        // popravite / dopolnite ...
        return null;
    }

    public Zaporedje inverz(Interval interval) {
        // popravite / dopolnite ...
        return null;
    }
}
