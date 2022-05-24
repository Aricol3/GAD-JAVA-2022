package Lab3DesignPatterns.Visitor;

public class TimeVisitor implements Visitor {
    private int totalTime;

    @Override
    public void visit(Song song) {
        totalTime += song.getTime();
    }

    @Override
    public void visit(Movie movie) {
        totalTime += movie.getTime();

    }

    @Override
    public void visit(Book book) {
        totalTime += book.getPageNr() * 10;
    }

    public int getResult() {
        return totalTime;
    }
}