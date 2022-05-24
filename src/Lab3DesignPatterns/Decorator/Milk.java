package Lab3DesignPatterns.Decorator;

public class Milk extends BeverageTopping {
    public Milk(Beverage beverage) {
        super(beverage, 2, "Milk");
    }
}