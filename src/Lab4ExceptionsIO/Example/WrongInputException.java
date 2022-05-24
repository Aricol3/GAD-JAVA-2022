package Lab4ExceptionsIO.Example;

public class WrongInputException extends Exception {
    public WrongInputException(int i) {
        super("The following value is not supported: " + i);
    }
}