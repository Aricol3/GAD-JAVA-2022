package Lab2OOP.Staticex;

public class Bicycle {
    private static int nrOfBicycles = 0;
    private String name;
    private int size;

    public Bicycle(String name, int size) {
        this.size = size;
        this.name = name;
        nrOfBicycles++;
    }

    public static int getNrOfBicycles() {
        return nrOfBicycles;
    }

    public String toString() {
        return "Bicycle named " + name + " of size " + size;
    }
}