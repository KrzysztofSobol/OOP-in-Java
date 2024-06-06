package Exceptions;

public class QueueEmptyException extends Exception {
    public QueueEmptyException() {
        super("Tablica jest pusta.");
    }
}
