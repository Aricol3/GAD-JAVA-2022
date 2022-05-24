package Lab5Generics.Ch1;

import java.lang.reflect.InvocationTargetException;

public class ExchangeDesk<F extends Currency, T extends Currency> {
    private double rate;

    public void addRate(Class<F> fromClass, Class<T> toClass, Double value) {
        rate = value;
    }

    public T convert(F from, Class<T> toClass) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        T toReturn = null;
        double value = from.getValue() * rate;
        toReturn = toClass.getDeclaredConstructor(double.class).newInstance(value);

        return toReturn;
    }
}