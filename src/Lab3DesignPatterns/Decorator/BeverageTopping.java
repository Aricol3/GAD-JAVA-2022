package Lab3DesignPatterns.Decorator;

public class BeverageTopping extends Beverage {
    protected Beverage beverage;

    public BeverageTopping(Beverage beverage, int cost, String description) {
        super(cost, description);
        this.beverage = beverage;
    }

    @Override
    public int getCost() {
        return super.getCost() + beverage.getCost();
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", " + beverage.getDescription();
    }
}