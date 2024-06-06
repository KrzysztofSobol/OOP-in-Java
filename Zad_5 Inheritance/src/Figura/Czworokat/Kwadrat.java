package Figura.Czworokat;
import Figura.Punkt;

public class Kwadrat extends Prostokat {
    public Kwadrat(String kolor, Punkt TopLeft, int length) {
        super(kolor, TopLeft, new Punkt(TopLeft.getX() + length, TopLeft.getY() - length));
    }

    public String toString() {
        return super.toString();
    }
}
