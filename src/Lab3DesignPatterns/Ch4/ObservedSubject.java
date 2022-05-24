package Lab3DesignPatterns.Ch4;

public interface ObservedSubject {
    void register(Observer obj);

    void unregister(Observer obj);

    void notifyObservers(String message);
}