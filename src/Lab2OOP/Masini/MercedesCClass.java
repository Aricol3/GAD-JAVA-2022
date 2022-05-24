package Lab2OOP.Masini;

public class MercedesCClass extends Car {

    public MercedesCClass(Engine e) {
        super(e);
    }

    @Override
    public void start() {
        System.out.println("Start Mercedes");
    }

    @Override
    public void stop() {
        System.out.println("Stop Mercedes");
    }
}