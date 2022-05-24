package Lab2OOP.Masini;

public class AudiA4 extends Car implements DrivingCar {

    public AudiA4(Engine e) {
        super(e);
    }

    @Override
    public void start() {
        System.out.println("Start Audi A4");
    }

    @Override
    public void stop() {
        System.out.println("Stop audi A4");
    }
}