package Lab5Generics.Ch2;

public class ColorsDoNotMatchException extends Exception {
    ColorsDoNotMatchException(String message) {
        super(message);
        System.out.println("ColorsDoNotMatchException");
    }
}