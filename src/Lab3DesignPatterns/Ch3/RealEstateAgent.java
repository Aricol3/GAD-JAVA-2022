package Lab3DesignPatterns.Ch3;

public interface RealEstateAgent {
    void represent(Apartment apartment);

    Apartment rent(Student student);
}