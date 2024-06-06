package Obraz;

import Figury.Czworokat;
import Figury.Trojkat;

import java.util.ArrayList;

public class obraz {
    private ArrayList<Czworokat> Czworokaty;
    private ArrayList<Trojkat> Trojkaty;
    public obraz(){
        Czworokaty = new ArrayList<>();
        Trojkaty = new ArrayList<>();
    }

    public void dodajTrojkat(Trojkat trojkat) {
        Trojkaty.add(trojkat);
    }

    public void dodajCzworokat(Czworokat czworokat) {
        Czworokaty.add(czworokat);
    }

    public void przesun(int dx, int dy){
        for (Czworokat czworokat : Czworokaty) {
            czworokat.przesun(dx, dy);
        }
        for (Trojkat trojkat : Trojkaty) {
            trojkat.przesun(dx, dy);
        }
    }

    public String toString(){
        String result="Czworokaty: \n";
        for(Czworokat czworokat : Czworokaty) result += czworokat.toString() + "\n";
        result+="\nTrojkaty: \n";
        for(Trojkat trojkat : Trojkaty)  result += trojkat.toString() + "\n";

        return result;
    }
}
