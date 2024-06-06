package Figura;

public class Punkt {
    private final int x, y;

    public Punkt(){
        this.x = 0;
        this.y = 0;
    }

    public Punkt(int x, int y){
        this.x = x;
        this.y = y;
    }

    public Punkt(Punkt punkt) {
        this.x = punkt.x;
        this.y = punkt.y;
    }

    public int getX(){
        return this.x;
    }

    public int getY(){
        return this.y;
    }

    public String toString(){
        return "(" + x + "," + y + ")";
    }
}
