package Figury;

public class Punkt {
    private int x, y;

    public Punkt(){
        this.x = 0;
        this.y = 0;
    }

    public Punkt(int x, int y){
        this.x = x;
        this.y = y;
    }

    public Punkt(Punkt punkt){
        this.x = punkt.x;
        this.y = punkt.y;
    }

    public void przesun(int dx, int dy){
        x += dx;
        y += dy;
    }

    public String toString(){
       return "(" + x + "," + y + ")";
    }
}
