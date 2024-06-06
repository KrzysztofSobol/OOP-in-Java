package kartoteka;

public class Osoba {
    private final String imie;
    private final String nazwisko;

    public Osoba(String imie, String nazwisko){
        this.imie = imie;
        this.nazwisko = nazwisko;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Osoba)) {
            return false;
        }
        Osoba os = (Osoba) obj;
        return this.imie.equals(os.imie) && this.nazwisko.equals(os.nazwisko);
    }

    public String getImie(){
        return imie;
    }
    public String getNazwisko(){
        return nazwisko;
    }
}
