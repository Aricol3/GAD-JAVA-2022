package Lab5Generics.Ch2;

public class Main {
    public static void main(String[] args) throws SizesDoNotMatchException {
        try {
            Boot boot1 = new Boot(20, "Red");
            Boot boot2 = new Boot(25, "Red");
            Shoe running1 = new Running(20, "Red");
            Running running2 = new Running(20, "Red");
            Pair<Boot> pair1 = new Pair<Boot>(boot1, boot2);
            Pair<Shoe> pair2 = new Pair<Shoe>(running1, running2);

        } catch (SizesDoNotMatchException | ColorsDoNotMatchException e) {
            e.printStackTrace();
        }
    }
}