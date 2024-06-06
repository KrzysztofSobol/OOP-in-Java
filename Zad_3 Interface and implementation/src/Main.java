import kartoteka.IKartoteka;
import kartoteka.Osoba;
import kartoteka.impl.Kartoteka;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicMarkableReference;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    private static Osoba GetOsoba(){
        System.out.println("Imie: ");
        String imie = scanner.next();
        System.out.println("Nazwisko: ");
        String nazwisko = scanner.next();
        return new Osoba(imie, nazwisko);
    }

    private static int GetIndex(){
        System.out.println("Podaj index: ");
        return scanner.nextInt();
    }

    public static void main(String[] args) {
        // Implementacja
        Kartoteka kartoteka = new Kartoteka();
        // Mockup
        //kartoteka.mockup.Kartoteka kartoteka = new kartoteka.mockup.Kartoteka();

        while(true){
            System.out.println("1. Dodaj osobe");
            System.out.println("2. Usun osobę");
            System.out.println("3. Rozmiar kartoteki");
            System.out.println("4. Czy zawiera dana osobe");
            System.out.println("5. Pobierz osobe o danym indeksie");
            System.out.println("0. Wyjdz");

            int choice = scanner.nextInt();

            switch(choice){
                case 1:
                    kartoteka.dodaj(GetOsoba());
                    break;
                case 2:
                    kartoteka.usun(GetOsoba());
                    break;
                case 3:
                    int rozmiar = kartoteka.rozmiar();
                    System.out.println("Rozmiar: " + rozmiar);
                    break;
                case 4:
                    boolean czyZawiera = kartoteka.czyZawiera(GetOsoba());
                    if(czyZawiera)
                        System.out.println(true);
                    else
                        System.out.println(false);
                    break;
                case 5:
                    Osoba osoba = kartoteka.pobierz(GetIndex());
                    System.out.println("Osoba: " + osoba.getImie() + " " + osoba.getNazwisko());
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("Nie ma takiej opcji");
                    break;
            }
        }
    }
}