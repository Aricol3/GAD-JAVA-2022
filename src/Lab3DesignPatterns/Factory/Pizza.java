package Lab3DesignPatterns.Factory;

public abstract class Pizza {

    public void bake() {
        System.out.println("Bake for 25 min at 350*");
    }

    public void cut() {
        System.out.println("Cut ting pizza.");
    }

    public void box() {
        System.out.println("Place pizza in a box.");
    }
}