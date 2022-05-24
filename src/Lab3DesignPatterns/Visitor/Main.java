package Lab3DesignPatterns.Visitor;

import java.sql.Time;

public class Main {
    public static void main(String[] args) {
        Element elements[] = new Element[3];
        elements[0] = new Book(30, "title");
        elements[1] = new Song(22);
        elements[2] = new Movie(44);

        TimeVisitor v = new TimeVisitor();
        for (Element e : elements) {
            e.accept(v);
        }

        System.out.println(v.getResult());
    }
}