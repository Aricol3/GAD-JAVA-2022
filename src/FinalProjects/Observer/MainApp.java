package FinalProjects.Observer;

public class MainApp {

    public static void main(String[] args) {
        TrafficLight tLight1 = new TrafficLight("red", 5);
        TrafficLight tLight2 = new TrafficLight("yellow", 10);
        TrafficLight tLight3 = new TrafficLight("green", 7);

        Driver driver1 = new Driver("CJ_23_OOP", "Toyota", 80);
        Driver driver2 = new Driver("CJ_26_GAD", "Mercedes", 120);
        Driver driver3 = new Driver("CJ_10_SPD", "BMW", 90);
        Driver driver4 = new Driver("CJ_47_JAV", "Skoda", 70);

        tLight1.addObserver(driver1);
        tLight2.addObserver(driver2);
        tLight2.addObserver(driver3);
        tLight3.addObserver(driver4);

        tLight1.changeColor("green");
        tLight2.changeColor("yellow");
        tLight3.changeColor("red");
    }

}