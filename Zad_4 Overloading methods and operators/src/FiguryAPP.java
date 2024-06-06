import Figury.Czworokat;
import Figury.Punkt;
import Figury.Trojkat;
import Obraz.obraz;

import java.util.Scanner;

public class FiguryAPP{
    Scanner scanner = new Scanner(System.in);
    Obraz.obraz obraz = new obraz();

    public void start(){
        while(true){
            System.out.println("1. Dodaj trojkat");
            System.out.println("2. Dodaj czworokat");
            System.out.println("3. Narysuj obraz");
            System.out.println("4. Przesun obraz");
            System.out.println("0. Wyjdz");

            int choice = scanner.nextInt();

            switch(choice){
                case 1:
                    DodajTrojkat();
                    break;
                case 2:
                    DodajCzworokat();
                    break;
                case 3:
                    PrintObraz();
                    break;
                case 4:
                    PrzesunObraz();
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("Nie ma takiej opcji");
                    break;
            }
        }
    }
    private Punkt WczytajPunkt() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj współrzędne punktu (x, y):");
        int x = scan.nextInt();
        int y = scan.nextInt();
        return new Punkt(x, y);
    }

    private void DodajTrojkat(){
        Punkt punkt1 = WczytajPunkt();
        Punkt punkt2 = WczytajPunkt();
        Punkt punkt3 = WczytajPunkt();
        Trojkat trojkat = new Trojkat(punkt1,punkt2,punkt3);
        obraz.dodajTrojkat(trojkat);
    }

    private void DodajCzworokat(){
        Punkt punkt1 = WczytajPunkt();
        Punkt punkt2 = WczytajPunkt();
        Punkt punkt3 = WczytajPunkt();
        Punkt punkt4 = WczytajPunkt();
        Czworokat czworokat = new Czworokat(punkt1,punkt2,punkt3,punkt4);
        obraz.dodajCzworokat(czworokat);
    }

    private void PrintObraz(){
        System.out.println(obraz);
    }

    private void PrzesunObraz(){
        System.out.println("Podaj przesuniecie x: ");
        int dx = scanner.nextInt();
        System.out.println("Podaj przesuniecie y: ");
        int dy = scanner.nextInt();
        obraz.przesun(dx,dy);
    }
}
