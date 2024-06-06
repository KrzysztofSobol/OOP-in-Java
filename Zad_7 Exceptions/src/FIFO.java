import Exceptions.InvalidNumberException;
import Exceptions.QueueEmptyException;
import Exceptions.QueueFullException;

public class FIFO {
    private int obecny_rozmiar;
    private int max_rozmiar;
    private int[] tab;

    public FIFO(int N, int max_rozmiar) {
        this.obecny_rozmiar = 0;
        this.max_rozmiar = max_rozmiar;
        this.tab = new int[max_rozmiar];
        for(int i=0; i<N; i++){
            tab[i] = i;
            obecny_rozmiar++;
        }
    }
    public void dodaj(int liczba) throws QueueFullException, InvalidNumberException {
        if (obecny_rozmiar == max_rozmiar) {
            throw new QueueFullException();
        }

        if (liczba < 0) {
            throw new InvalidNumberException(liczba);
        }
    }

    public void usun() throws QueueEmptyException {
        if (obecny_rozmiar == 0) {
            throw new QueueEmptyException();
        }
    }
}
