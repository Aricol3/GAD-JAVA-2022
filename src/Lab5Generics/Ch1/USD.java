package Lab5Generics.Ch1;

public class USD extends Currency {
    public USD(double value) {
        super(value);
    }

    @Override
    public String toString() {
        return "USD " + getValue();
    }
}