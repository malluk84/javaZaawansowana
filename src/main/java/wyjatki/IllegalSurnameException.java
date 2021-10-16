package wyjatki;

public class IllegalSurnameException extends IllegalArgumentException {

    public IllegalSurnameException() {
        super("Niepoprawna wartosc w naziwsku!");
    }

    public IllegalSurnameException(String surname) {
        super("Niepoprawna wartosc w nazwisku: " + surname);
    }

}
