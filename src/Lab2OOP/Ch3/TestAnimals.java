package Lab2OOP.Ch3;

public class TestAnimals {
    public static void main(String[] args) {
        Fish d = new Fish();
        Cat c = new Cat();
        Animal a = new Fish();
        Animal e = new Spider();
        Pet p = new Cat();

        //a.
        d.eat();
        d.walk();
        System.out.println(" ");
        c.eat();
        c.walk();
        System.out.println(" ");
        a.eat();
        a.walk();
        System.out.println(" ");
        e.eat();
        e.walk();
        System.out.println(" ");

        //b.
        (d).walk();
        System.out.println(" ");
        a.eat();
        System.out.println(" ");
        a = (c); // a becomes cat instead of fish

        a.eat();
        System.out.println(" ");

        //c.
        a.walk();
        System.out.println(" ");
        Animal animal = new Fish() {
            @Override
            public void eat() {
                System.out.println("Animal eats vegan with nr of legs:" + legs);
            }

            @Override
            public void walk() {
                super.walk();
            }
        };
        animal.walk();
        System.out.println(" ");
        animal.eat();


    }
}
