package Lab6Collections.Ch9;

public class CorrespondingSet<T> implements MySet<T> {
    private T[] set;
    private int noElements;
    private int capacity;

    public CorrespondingSet() {
        set = (T[]) new Object[100];
        noElements = 0;
        capacity = 100;
    }

    public CorrespondingSet(T[] set) {
        this.set = set;
        noElements = set.length;
        capacity = set.length;
    }

    @Override
    public void add(T e) {
        if (!this.contains(e)) {
            if (noElements >= capacity) {
                T[] aux = (T[]) new Object[capacity + 100];
                for (int i = 0; i < noElements; i++)
                    aux[i] = set[i];
                set = aux;
                capacity = capacity + 100;
            }
            set[noElements] = e;
            noElements++;
        } else {
            System.out.println("The set already contains " + e);
        }
    }

    @Override
    public void remove(T e) {
        for (int i = 0; i < noElements; i++) {
            if (set[i].equals(e)) {
                for (int j = i; j < noElements - 1; j++)
                    set[j] = set[j + 1];
                break;
            }
        }
    }

    @Override
    public T get(int index) {
        return set[index];
    }

    @Override
    public void set(int index, T e) {
        if (!this.contains(e)) {
            set[index] = e;
        } else {
            System.out.println("The set already contains " + e);
        }
    }

    @Override
    public int size() {
        return noElements;
    }

    @Override
    public boolean contains(T e) {
        for (int i = 0; i < noElements; i++)
            if (set[i].equals(e))
                return true;
        return false;
    }

    public void print() {
        System.out.print("The set is: ");
        for (int i = 0; i < noElements; i++)
            System.out.print(set[i] + " ");
        System.out.println();
    }
}