package Figury;

public class Linia{
    private final Punkt p1, p2;

    public Linia(){
        this.p1 = new Punkt();
        this.p2 = new Punkt();
    }

    public Linia(Punkt p1, Punkt p2){
        this.p1 = new Punkt(p1);
        this.p2 = new Punkt(p2);
    }

    public Linia(Linia linia){
        this.p1 = linia.p1;
        this.p2 = linia.p2;
    }

    public void przesun(int dx, int dy){
        p1.przesun(dx, dy);
        p2.przesun(dx, dy);
    }

    public String toString() {
        return "Linia: [" + p1 + ", " + p2 + "]";
    }

}
