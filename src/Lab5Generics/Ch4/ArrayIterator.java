package Lab5Generics.Ch4;

public class ArrayIterator<T> implements IArrayIterator {

    private T[] array;
    private int index;

    public ArrayIterator(T obj) {
        array = (T[]) obj;
    }

    @Override
    public boolean hasNext() {
        return (index < array.length);
    }

    @Override
    public T next() {
        if (index < array.length) {
            T obj = array[index];
            index++;
            return obj;
        }
        return null;
    }
}