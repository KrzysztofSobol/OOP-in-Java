import Figury.Figura;
import Figury.kolo;
import Figury.kwadrat;

public class Main {
    public static void main(String[] args) {
        Figura[] figury = new Figura[2];
        figury[0] = new kolo(2,2,4);
        figury[1] = new kwadrat(2,2,4);

        double p = 0, o = 0;
        for(Figura f: figury){
            p = f.pole();
            o = f.obwod();
            System.out.println("\nWartosci przed przesunienciem: \n" + "Pole figur: " + p + "\nObwod figur: " + o);
        }

        for(Figura f: figury){
            f.przesun(3,6);
            p = f.pole();
            o = f.obwod();
            System.out.println("\nWartosci po przesunieciu: \n" + "Pole figur: " + p + "\nObwod figur: " + o);
        }

        for(Figura f: figury){
            f.skaluj(2);
            p = f.pole();
            o = f.obwod();
            System.out.println("\nWartosci po przeskalowaniu razy 2: \n" + "Pole figur: " + p + "\nObwod figur: " + o);
        }
    }
}