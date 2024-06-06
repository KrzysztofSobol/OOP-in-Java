package Figury;

public class Trojkat{
    private final Linia linia1;
    private final Linia linia2;
    private final Linia linia3;

    public Trojkat(){
        linia1 = new Linia();
        linia2 = new Linia();
        linia3 = new Linia();
    }

    public Trojkat(Punkt punkt1, Punkt punkt2, Punkt punkt3){
        linia1 = new Linia(punkt1, punkt2);
        linia2 = new Linia(punkt2, punkt3);
        linia3 = new Linia(punkt3, punkt1);
    }

    public Trojkat(Trojkat dt){
        linia1 = dt.linia1;
        linia2 = dt.linia2;
        linia3 = dt.linia3;
    }

    public void przesun(int dx, int dy){
        linia1.przesun(dx, dy);
        linia2.przesun(dx, dy);
        linia3.przesun(dx, dy);
    }

    public String toString() {
        return "Trojkat: " + "{" + linia1 + ", " + linia2 + ", " + linia3 + "}";
    }
}
