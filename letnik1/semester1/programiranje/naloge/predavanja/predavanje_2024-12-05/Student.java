
public class Student {

    private String ip;       // ime in priimek
    private String vpisna;   // vpisna številka
    private int stroskiBivanja;  // mesečni stroški bivanja

    public Student(String ip, String vpisna, int stroskiBivanja) {
        this.ip = ip;
        this.vpisna = vpisna;
        this.stroskiBivanja = stroskiBivanja;
    }

    public String vrniIP() {
        return this.ip;
    }

    //
    // Vrne skupne mesečne stroške.
    //
    public int stroski() {
        return this.stroskiBivanja;
    }
}
