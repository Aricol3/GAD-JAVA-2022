package Lab2OOP.Staticex;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Static example:");

        Bicycle b1 = new Bicycle("B1", 2);
        System.out.println("Number of bicycles= " + b1.getNrOfBicycles());

        Bicycle b2 = new Bicycle("B2", 3);
        System.out.println("Number of bicycles= " + b2.getNrOfBicycles());

        Bicycle b3 = new Bicycle("B3", 4);

        System.out.println("Number of bicycles= " + b3.getNrOfBicycles());

        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
        Integer[] integers = new Integer[]{1, 2, 3, 4};
        for (Integer currentInteger : integers) {
            System.out.println(currentInteger + ", ");
        }
    }
}