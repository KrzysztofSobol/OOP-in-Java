package Figury;

public class kolo extends Figura {
    public kolo(double x, double y, double p){
        super(x,y,p);
    }

    public double wysokosc(){
        return Math.PI*podstawa;
    }
    public double liczba() {
        return 2*Math.PI;
    }
}
