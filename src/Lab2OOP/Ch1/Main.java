package Lab2OOP.Ch1;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();

        Fighter fighter1 = new Fighter("Gioni", 100, random.nextInt(0, 50));
        Fighter fighter2 = new Fighter("RupTot", 100, random.nextInt(0, 50));
        BoxingMatch boxingMatch = new BoxingMatch(fighter1, fighter2);
        boxingMatch.fight(fighter1, fighter2);
        System.out.println("Health status " + fighter1.getName() + ": " + fighter1.getHealth());
        System.out.println("Health status " + fighter2.getName() + ": " + fighter2.getHealth());
    }
}
