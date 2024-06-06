package Bank;
import java.util.ArrayList;
import java.util.List;

public class Klient {
    public List<Konto> konta = new ArrayList<>();
    public void dodajKonto(Konto konto){
        konta.add(konto);
    }
    public List<Konto> getKonta(){
        return konta;
    }
}
