package FinalProjects.Observer;

import java.util.Observable;

public class TrafficLight extends Observable {
    private String color;
    private int timer;

    public TrafficLight(final String color, final int timer) {
        this.color = color;
        this.timer = timer;
    }

    public String getColor() {
        return color;
    }

    public void setColor(final String color) {
        this.color = color;
    }

    public int getTimer() {
        return timer;
    }

    public void setTimer( final int timer) {
        this.timer = timer;
    }

    public void changeColor(String color) {
        this.setColor(color);
        this.setChanged();
        this.notifyObservers(color);
    }
}