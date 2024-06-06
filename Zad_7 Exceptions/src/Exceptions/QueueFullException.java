package Exceptions;

public class QueueFullException extends Exception {
    public QueueFullException() {
        super("Kolejka jest pełna.");
    }
}