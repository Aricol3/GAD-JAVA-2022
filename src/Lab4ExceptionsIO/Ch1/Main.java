package Lab4ExceptionsIO.Ch1;

public class Main {
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook("C:\\JetBrains\\GAD-JAVA2022\\src\\Lab4ExceptionsIO\\Ch1\\contacts");
        System.out.println("Abbey: " + phoneBook.getContactByName("Abbey").getPhoneNumber());
        System.out.println("Abdul: " + phoneBook.getContactByName(("Abdul")).getPhoneNumber());
    }
}