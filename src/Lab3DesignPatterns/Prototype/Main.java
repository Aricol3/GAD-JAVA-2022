package Lab3DesignPatterns.Prototype;

public class Main {
    public static void main(String[] args) {
        Leash leash = new Leash("red", 3);
        Dog dog = new Dog("Rex", leash);
        dog.setAge(7);
        try {
            System.out.println("dog1:" + dog);

            Dog dog2 = dog.clone();
            System.out.println("dog2:" + dog2);
            dog2.getLeash().setColor("Brown");
            dog2.setAge(66);

            System.out.println("dog1:" + dog);
            System.out.println("dog2:" + dog2);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}