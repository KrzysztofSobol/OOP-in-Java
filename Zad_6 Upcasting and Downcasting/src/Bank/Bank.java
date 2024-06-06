package Bank;

import java.util.ArrayList;
import java.util.List;

public class Bank {
    private List<Klient> klienci = new ArrayList<>();
    public void dodajKlienta(Klient klient){
        klienci.add(klient);
    }

    public List<Klient> getKlienci(){
        return klienci;
    }
}
