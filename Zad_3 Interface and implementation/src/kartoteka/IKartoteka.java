package kartoteka;

public interface IKartoteka {
    void dodaj(Osoba osoba);
    void usun(Osoba osoba);
    int rozmiar();
    boolean czyZawiera(Osoba osoba);
    Osoba pobierz(int index);
}
