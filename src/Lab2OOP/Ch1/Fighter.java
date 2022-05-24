package Lab2OOP.Ch1;

public class Fighter {
    String name;
    int health;
    double damagePerAttack;

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }


    public Fighter(String name, int health, double damagePerAttack) {
        this.name = name;
        this.health = health;
        this.damagePerAttack = damagePerAttack;
    }

    public void attack(Fighter fighter) {
        fighter.health -= damagePerAttack;
    }
}