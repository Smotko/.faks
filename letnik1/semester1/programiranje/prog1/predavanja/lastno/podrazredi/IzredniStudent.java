package prog1.predavanja.lastno.podrazredi;
import prog1.predavanja.lastno.podrazredi.*;

public class IzredniStudent extends Student{
    int izredniStroski;

    public IzredniStudent(String ip, String vpisna, int stroskiBivanja, int izredniStroski) {
        super(ip, vpisna, stroskiBivanja);
        this.izredniStroski = izredniStroski;
    }
    
}
