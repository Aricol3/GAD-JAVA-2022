package Lab3DesignPatterns.Visitor;

public interface Visitor {
    void visit(Song song);

    void visit(Movie movie);

    void visit(Book book);
}