package Lab5Generics.Ch5;

public class ArrayNotSortedException extends Exception {
    public ArrayNotSortedException(String msj) {
        super(msj);
    }

    public ArrayNotSortedException() {
        super("The array is not sorted");
    }
}