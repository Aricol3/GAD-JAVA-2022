package Lab5Generics.Ch2;

public class SizesDoNotMatchException extends Exception {
    SizesDoNotMatchException(String message) {
        super(message);
        System.out.println("SizesDoNotMatchException");
    }
}