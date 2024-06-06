package Figury;

public class Czworokat{
    private final Linia linia1, linia2, linia3, linia4;

    public Czworokat(){
        linia1 = new Linia();
        linia2 = new Linia();
        linia3 = new Linia();
        linia4 = new Linia();
    }

    public Czworokat(Punkt punkt1, Punkt punkt2, Punkt punkt3, Punkt punkt4){
        linia1 = new Linia(punkt1, punkt2);
        linia2 = new Linia(punkt2, punkt3);
        linia3 = new Linia(punkt3, punkt4);
        linia4 = new Linia(punkt4, punkt1);
    }

    public Czworokat(Czworokat dc){
        linia1 =  dc.linia1;
        linia2 =  dc.linia1;
        linia3 =  dc.linia1;
        linia4 =  dc.linia1;
    }

    public void przesun(int dx, int dy){
        linia1.przesun(dx, dy);
        linia2.przesun(dx, dy);
        linia3.przesun(dx, dy);
        linia4.przesun(dy, dy);
    }

    public String toString() {
        return "Czworokat: " + "{" + linia1 + ", " + linia2 + ", " + linia3 + ", " + linia4 + "}";
    }
}