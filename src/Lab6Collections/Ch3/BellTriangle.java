package Lab6Collections.Ch3;

import java.util.*;

public class BellTriangle {
    public static void main(String[] args) {
        int depth = 5;
        int i, j;
        ArrayList<ArrayList<Integer>> triangle = new ArrayList<>();
        for (i = 0; i < depth; i++) {
            ArrayList<Integer> row = new ArrayList<Integer>(i + 1);
            triangle.add(row);
        }
        triangle.get(0).add(1);
        for (i = 1; i < depth; i++) {
            triangle.get(i).add(triangle.get(i - 1).get(i - 1));
            for (j = 1; j <= i; j++) {
                triangle.get(i).add(triangle.get(i - 1).get(j - 1) + triangle.get(i).get(j - 1));
            }
        }

        Iterator<ArrayList<Integer>> i1 = triangle.iterator();
        Iterator<Integer> i2;
        while (i1.hasNext()) {
            i2 = i1.next().iterator();
            while (i2.hasNext()) {
                System.out.print(i2.next() + " ");
            }
            System.out.println();
        }
    }
}
