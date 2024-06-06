package Figura;

public class Trojkat extends Figura{
    private final Linia linia1, linia2, linia3;

    public Trojkat(String kolor, Punkt punkt1, Punkt punkt2, Punkt punkt3){
        super(kolor);
        linia1 = new Linia(punkt1, punkt2);
        linia2 = new Linia(punkt2, punkt3);
        linia3 = new Linia(punkt3, punkt1);
    }

    public String toString() {
        return GetKolor() + " trojkat: " + "{" + linia1 + ", " + linia2 + ", " + linia3 + "}";
    }
}
