package Figura.Czworokat;
import Figura.Figura;
import Figura.Linia;
import Figura.Punkt;

public class Czworokat extends Figura {
    private final Linia linia1, linia2, linia3, linia4;

    public Czworokat(String kolor, Punkt punkt1, Punkt punkt2, Punkt punkt3, Punkt punkt4){
        super(kolor);
        linia1 = new Linia(punkt1, punkt2);
        linia2 = new Linia(punkt2, punkt3);
        linia3 = new Linia(punkt3, punkt4);
        linia4 = new Linia(punkt4, punkt1);
    }

    public String toString() {
        return GetKolor() + " czworokat: " + "{" + linia1 + ", " + linia2 + ", " + linia3 + ", " + linia4 + "}";
    }
}