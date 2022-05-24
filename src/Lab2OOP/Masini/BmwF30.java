package Lab2OOP.Masini;

public class BmwF30 extends Car implements DrivingCar {
    public BmwF30(Engine e) {
        super(e);
    }

    @Override
    public void start() {
        System.out.println("Start BMW");
    }

    @Override
    public void stop() {
        System.out.println("Stop BMW");
    }
}
