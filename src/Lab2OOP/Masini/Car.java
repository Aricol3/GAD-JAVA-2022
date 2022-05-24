package Lab2OOP.Masini;

public abstract class Car {
    private Engine engine;

    public Car(Engine e) {
        this.engine = e;
    }

    public abstract void start();

    public abstract void stop();

    public void drive() {
        start();
        this.engine.drive();
        stop();
    }
}