package Lab4ExceptionsIO.Example;

public class FatalException extends RuntimeException {
    public FatalException() {
        super("There is no way from here!");
    }
}