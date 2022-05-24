package Lab4ExceptionsIO.ExceptionExample;

public class FatalException extends RuntimeException {
    public FatalException() {
        super("There is no way from here!");
    }
}