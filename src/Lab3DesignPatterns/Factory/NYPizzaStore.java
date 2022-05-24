package Lab3DesignPatterns.Factory;

public class NYPizzaStore extends PizzaStore {

    @Override
    protected Pizza createPizza(String type) {
        switch (type) {
            case "Cheese":
                return new NYstyleCheesePizza();
            case "Pepperoni":
                return new NYstylePepperoniPizza();
            default:
                return null;
        }
    }
}