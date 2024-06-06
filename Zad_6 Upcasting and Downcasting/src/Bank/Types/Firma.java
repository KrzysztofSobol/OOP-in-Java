package Bank.Types;

import Bank.Klient;
import Bank.Konto;

public class Firma extends Klient {
    private String nazwa, KRS;
    public Firma(String nazwa, String KRS){
        this.nazwa = nazwa;
        this.KRS = KRS;
    }

    public void wplac(int wplata){

    }
}
