package kartoteka.mockup;
import kartoteka.IKartoteka;
import kartoteka.Osoba;

public class Kartoteka implements IKartoteka {
    public void dodaj(Osoba osoba){}
    public void usun(Osoba osoba){}
    public int rozmiar(){
        return 1;
    }
    public boolean czyZawiera(Osoba osoba){
        return true;
    }
    public Osoba pobierz(int index){
        return new Osoba("Gall", "Anonim");
    }
}
