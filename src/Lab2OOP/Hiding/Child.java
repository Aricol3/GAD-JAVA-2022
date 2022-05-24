package Lab2OOP.Hiding;

public class Child extends Parent {
    public String field = "child 11";

    public static void m() {
        Parent.m();
        System.out.println("Child m method");
    }

    public void printFields() {
        System.out.println("Child field " + field + "\n parent field " + super.field);
    }
}