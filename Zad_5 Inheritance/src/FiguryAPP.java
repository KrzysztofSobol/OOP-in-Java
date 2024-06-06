import Figura.Czworokat.Czworokat;
import Figura.Czworokat.Kwadrat;
import Figura.Czworokat.Prostokat;
import Figura.Trojkat;
import Figura.Punkt;

import java.util.Scanner;

public class FiguryAPP{
    Scanner scanner = new Scanner(System.in);

    public void start(){
        while(true){
            System.out.println("1. Stworz trojkat");
            System.out.println("2. Stworz czworokat");
            System.out.println("3. Stworz prostokat");
            System.out.println("4. Stworz kwadrat");
            System.out.println("0. Wyjdz");

            int choice = scanner.nextInt();

            switch(choice){
                case 1:
                    Trojkat();
                    break;
                case 2:
                    Czworokat();
                    break;
                case 3:
                    Prostokat();
                    break;
                case 4:
                    Kwadrat();
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
        System.out.println("Podaj współrzędne punktu (x, y): ");
        int x = scan.nextInt();
        int y = scan.nextInt();
        return new Punkt(x, y);
    }

    private void Trojkat(){
        System.out.println("Podaj kolor trojkata: ");
        Scanner scan = new Scanner(System.in);
        String kolor = scan.next();
        Punkt punkt1 = WczytajPunkt();
        Punkt punkt2 = WczytajPunkt();
        Punkt punkt3 = WczytajPunkt();
        Trojkat trojkat = new Trojkat(kolor,punkt1,punkt2,punkt3);
        System.out.println(trojkat);
    }

    private void Czworokat(){
        System.out.println("Podaj kolor czworokatu: ");
        Scanner scan = new Scanner(System.in);
        String kolor = scan.next();
        Punkt punkt1 = WczytajPunkt();
        Punkt punkt2 = WczytajPunkt();
        Punkt punkt3 = WczytajPunkt();
        Punkt punkt4 = WczytajPunkt();
        Czworokat czworokat = new Czworokat(kolor,punkt1,punkt2,punkt3,punkt4);
        System.out.println(czworokat);
    }

    private void Prostokat(){
        System.out.println("Podaj kolor prostokatu: ");
        Scanner scan = new Scanner(System.in);
        String kolor = scan.next();
        Punkt punkt1 = WczytajPunkt();
        Punkt punkt2 = WczytajPunkt();
        Prostokat prostokat = new Prostokat(kolor, punkt1, punkt2);
        System.out.println(prostokat);
    }

    private void Kwadrat(){
        System.out.println("Podaj kolor kwadratu: ");
        Scanner scan = new Scanner(System.in);
        String kolor = scan.next();
        System.out.println("Podaj dlugosc boku kwadratu: ");
        int length = scan.nextInt();
        Punkt punkt = WczytajPunkt();
        Kwadrat kwadrat = new Kwadrat(kolor, punkt, length);
        System.out.println(kwadrat);
    }
}
