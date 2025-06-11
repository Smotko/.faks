

import java.util.*;

public class Glavni {

    public static void urediPoLetuInNaslovu(List<Clanek> clanki) {
        Comparator<Clanek> primerjalnik = Clanek.urediPoLetuInNaslovu();
        clanki.sort(primerjalnik);
    }

    public static Set<Avtor> vsiAvtorji(Collection<Clanek> clanki) {
        Set<Avtor> vsiAvtorji = new HashSet<>();
        for(Clanek c: clanki){
            for(Avtor a : c.getAvtors()){
                vsiAvtorji.add(a);
            }
        }
        return vsiAvtorji;
    }

    public static Map<Avtor, List<Clanek>> clankiPoAvtorjih(Collection<Clanek> clanki) {
        Map<Avtor, List<Clanek>> avtor2clanki= new HashMap<>();
        for(Clanek c: clanki){
            for(Avtor a : c.getAvtors()){
                List<Clanek> clankiAvtorja = avtor2clanki.get(a);
                if (clankiAvtorja == null) {
                    clankiAvtorja = new ArrayList<Clanek>();
                    avtor2clanki.put(a, clankiAvtorja);
                }
                clankiAvtorja.add(c);
            }
            for (Avtor avtor : avtor2clanki.keySet()) {
                List<Clanek> clankiAvtorja = avtor2clanki.get(avtor);
                urediPoLetuInNaslovu(clankiAvtorja);
            }
        }
        return avtor2clanki;
    }

    public static Avtor najplodnejsiAvtor(Collection<Clanek> clanki) {
        Map<Avtor, List<Clanek>> avtor2clanki = clankiPoAvtorjih(clanki);
        Set<Avtor> avtorji = avtor2clanki.keySet();
        return Collections.max(avtorji, (a, b) -> avtor2clanki.get(a).size() - avtor2clanki.get(b).size());
    }
}
