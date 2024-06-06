package Figury;

public abstract class Figura {
    protected double podstawa;
    protected double x, y;
    public abstract double wysokosc();
    public abstract double liczba();

    public Figura(double x, double y, double p){
        podstawa = p;
        this.x = x;
        this.y = y;
    }

    public double pole() {
        return wysokosc()*podstawa;
    }

    public double obwod(){
        return liczba()*podstawa;
    }

    public void przesun(double x, double y){
        this.x += x;
        this.y += y;
    }

    public void skaluj(double s){
        podstawa*=s;
    }
}
