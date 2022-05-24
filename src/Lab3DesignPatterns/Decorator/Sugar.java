package Lab3DesignPatterns.Decorator;

public class Sugar extends BeverageTopping {
    public Sugar(Beverage beverage) {
        super(beverage, 1, "White Sugar");
    }
}