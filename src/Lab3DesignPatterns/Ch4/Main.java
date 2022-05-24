package Lab3DesignPatterns.Ch4;

public class Main {
    public static void main(String[] args) {
        Teacher teacher = new Teacher();
        Student s01 = new Student("Adrian");
        Student s02 = new Student("Valeriu");
        Student s03 = new Student("Surdu");

        s01.listenTo(teacher);
        s02.listenTo(teacher);
        s03.listenTo(teacher);

        String[] javaTopics = new String[]{
                "basics",
                "oo",
                "design patterns"
        };
        for (int i = 0; i < javaTopics.length; i++) {
            teacher.teach(javaTopics[i]);
        }
    }
}