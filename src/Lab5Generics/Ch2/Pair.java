package Lab5Generics.Ch2;

public class Pair<T extends Shoe> {
    private T first;
    private T second;

    public Pair(T first, T second) throws ColorsDoNotMatchException, SizesDoNotMatchException {
        this.first = first;
        this.second = second;
        if (!first.getColor().equals(second.getColor())) {
            throw new ColorsDoNotMatchException("Color dose not match!");
        }

        if (first.getSize() != second.getSize()) {
            throw new SizesDoNotMatchException("Size does not match!");
        }
    }

    public T getFirst() {
        return first;
    }

    public T getSecond() {
        return second;
    }
}