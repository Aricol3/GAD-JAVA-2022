package Lab3DesignPatterns.Ch3;

public class Main {
    public static void main(String[] args) {
        Apartment app01 = new Apartment("Marasti01", 300);
        Apartment app02 = new Apartment("Manastur01", 600);
        Apartment app03 = new Apartment("BunaZiua01", 350);
        Apartment app04 = new Apartment("Grigorescu01", 400);
        Apartment app05 = new Apartment("Observator01", 200);

        RealEstateAgentProxy proxy = new RealEstateAgentProxy();
        proxy.represent(app01);
        proxy.represent(app02);
        proxy.represent(app03);
        proxy.represent(app04);
        proxy.represent(app05);

        Student student01 = new Student("Adrian", 500);
        Student student02 = new Student("InsertNume", 330);

        Apartment apartmentForStudent01 = proxy.rent(student01);
        System.out.println(student01 + " a inchiriat " + apartmentForStudent01);
        Apartment apartmentForStudent02 = proxy.rent(student02);
        System.out.println(student02 + " a inchiriat " + apartmentForStudent02);
    }
}