package Lab6Collections.Ch2;

import java.util.*;

public class PascalTriangle {
    public static void main(String[] args) {
        int depth = 5;
        int i, j;
        ArrayList<ArrayList<Integer>> rows = new ArrayList<>(); // Pascal Triangle
        for (i = 0; i < depth; i++) {
            ArrayList<Integer> row = new ArrayList<>(i + 1);
            rows.add(row);
        }
        rows.get(0).add(1); // first element
        System.out.println(rows.get(0).get(0));
        for (i = 1; i < depth; i++) {
            for (j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    rows.get(i).add(1);
                    System.out.print(rows.get(i).get(j) + " ");
                } else {
                    rows.get(i).add(rows.get(i - 1).get(j - 1) + rows.get(i - 1).get(j));
                    System.out.print(rows.get(i).get(j) + " ");
                }
            }
            System.out.println();
        }
    }
}
