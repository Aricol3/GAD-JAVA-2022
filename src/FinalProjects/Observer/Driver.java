package FinalProjects.Observer;

import java.util.Observable;
import java.util.Observer;

public class Driver implements Observer {
    private String registrationNumber;
    private String carType;
    private double speed;

    public Driver(String registrationNumber, String carType, double speed) {
        this.registrationNumber = registrationNumber;
        this.carType = carType;
        this.speed = speed;
    }

    @Override
    public void update(Observable o, Object arg) {
        if(arg.equals("red")) {
            this.speed = 0;
            System.out.println("CAR " + registrationNumber + ", STOP!");
        } else if (arg.equals("yellow")) {
            this.speed = 30;
            System.out.println("CAR " + registrationNumber + ", SLOW DOWN!");
        } else if (arg.equals("green")) {
            System.out.println("CAR " + registrationNumber + ", GO!");
        }
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public String getCarType() {
        return carType;
    }

    public void setCarType(String carType) {
        this.carType = carType;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }
}