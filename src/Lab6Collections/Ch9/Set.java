package Lab6Collections.Ch9;

public class Set {
    public static void main(String[] args) {
        Integer[] set = new Integer[]{1, 3, 4, 8, 12, 15, 16};
        CorrespondingSet<Integer> mySet = new CorrespondingSet<Integer>(set);
        mySet.print();
        mySet.add(8);
        mySet.add(2);
        mySet.add(10);
        mySet.print();
        if (mySet.contains(10))
            System.out.println("The set contains 10");
        System.out.println("The set size: " + mySet.size());
        mySet.set(1, 15);
        mySet.set(1, 7);
        mySet.print();
        mySet.remove(4);
        mySet.print();
    }
}
