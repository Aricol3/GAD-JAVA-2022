package Lab3DesignPatterns.Builder;

public class Main {
    public static void main(String[] args) {
        Helicopter.Builder builder = new Helicopter.Builder("H123");
        builder.setColor("Red");
        builder.setMaxHeight(22)
                .setMaxSpeed(33)
                .setType(HelicopterTypes.ATTACK)
                .setWeight(34);
        Helicopter helicopter = builder.build();
        System.out.println(helicopter);
        builder.setWeight(88);
        Helicopter helicopter2 = builder.build();
        System.out.println(helicopter2);
    }
}