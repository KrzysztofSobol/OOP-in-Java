package Exceptions;

public class InvalidNumberException extends Exception {
    private int invalidNumber;

    public InvalidNumberException(int invalidNumber) {
        super("Niepoprawna liczba: " + invalidNumber);
        this.invalidNumber = invalidNumber;
    }

    public int getInvalidNumber() {
        return invalidNumber;
    }
}