package Lab5Generics.Ch4;

public interface IArrayIterator<T> {
    boolean hasNext();

    T next();
}