package kartoteka.impl;
import kartoteka.IKartoteka;
import kartoteka.Osoba;
import java.util.ArrayList;
import java.util.List;


public class Kartoteka implements IKartoteka {
    private final List<Osoba> osoby = new ArrayList<>();

    public void dodaj(Osoba osoba){
        osoby.add(osoba);
    }
    public void usun(Osoba osoba){
        osoby.remove(osoba);
    }
    public int rozmiar(){
        return osoby.size();
    }
    public boolean czyZawiera(Osoba osoba){
        return osoby.contains(osoba);
    }

    public Osoba pobierz(int index) {
        if (index >= 0 && index < rozmiar()) {
            return osoby.get(index);
        }
        else{
            return new Osoba("Brak osoby","o takim indexie");
        }
    }
}
