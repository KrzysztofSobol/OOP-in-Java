import Exceptions.InvalidNumberException;
import Exceptions.QueueEmptyException;
import Exceptions.QueueFullException;

public class Main {
    public static void main(String[] args) {
        try {
            FIFO fifotab = new FIFO(6, 11);
            fifotab.dodaj(1);
            System.out.println("Liczba dodana pomyslnie.");

            fifotab.usun();
            System.out.println("Liczba usunienta pomyslnie.");

            fifotab.dodaj(-5);
            System.out.println("Liczba dodana pomyslnie.");

        } catch (QueueFullException e) {
            System.out.println("Tablica jest pelna!");
            e.printStackTrace();
        } catch (QueueEmptyException e) {
            System.out.println("Tablica jest pusta!");
            e.printStackTrace();
        } catch (InvalidNumberException e) {
            System.out.println("Niepoprawna liczba: " + e.getInvalidNumber());
            System.out.println("Podaj poprawna liczbe!");
            e.printStackTrace();
        }
    }
}
