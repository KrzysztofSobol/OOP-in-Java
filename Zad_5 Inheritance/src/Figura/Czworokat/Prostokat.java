package Figura.Czworokat;
import Figura.Punkt;


public class Prostokat extends Czworokat{
    public Prostokat(String kolor, Punkt TopLeft, Punkt BottomRight){
        super(kolor, TopLeft, new Punkt(BottomRight.getX(), TopLeft.getY()), BottomRight, new Punkt(TopLeft.getX(), BottomRight.getY()));
    }

    public String toString() {
        return super.toString();
    }
}


