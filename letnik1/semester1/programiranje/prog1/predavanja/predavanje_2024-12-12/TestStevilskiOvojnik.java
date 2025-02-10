
public class TestStevilskiOvojnik {

    public static void main(String[] args) {
        StevilskiOvojnik<Integer> ov1 = 
            new StevilskiOvojnik<>(5);

        StevilskiOvojnik<Integer> ov2 = 
            new StevilskiOvojnik<>(3);

        System.out.println(ov1.jeVecjiKot(ov2));

        StevilskiOvojnik<Double> ov3 = 
            new StevilskiOvojnik<>(3.1);

        //System.out.println(ov1.jeVecjiKot(ov3));
        System.out.println(ov1.jeVecjiKot2(ov3));
        System.out.println(ov3.jeVecjiKot2(ov1));
    }
}
