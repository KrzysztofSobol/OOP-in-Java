package Bank.Types;

import Bank.Klient;

public class Osoba extends Klient {
    private String imie, nazwisko, PESEL;

    public Osoba(String imie, String nazwisko, String PESEL){
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.PESEL = PESEL;
    }
}
