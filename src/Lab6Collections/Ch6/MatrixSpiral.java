package Lab6Collections.Ch6;

import java.util.*;

public class MatrixSpiral {

    public static void main(String[] args) {
        // The matrix is nxn, n is given by the user
        int i, j, n = 5, nr = 0;
        ArrayList<ArrayList<Integer>> matrix = new ArrayList<>();
        for (i = 0; i < n; i++) {
            ArrayList<Integer> row = new ArrayList<>();
            for (j = 0; j < n; j++)
                row.add(++nr);
            matrix.add(row);
        }
        System.out.println("The matrix is: ");
        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++)
                System.out.print(matrix.get(i).get(j) + " ");
            System.out.println();
        }
        System.out.println("Spiral display: ");
        matrixSpiral(matrix, n);
    }

    public static void matrixSpiral(ArrayList<ArrayList<Integer>> matrix, int n) {
        int nr = 0, i, j, var = 0;
        int limit = n * n;
        while (nr < limit) {
            for (j = var; j < n - var && nr < limit; j++) {
                System.out.print(matrix.get(var).get(j) + " ");
                nr++;
            }
            j--;
            for (i = var + 1; i < n - var && nr < limit; i++) {
                System.out.print(matrix.get(i).get(j) + " ");
                nr++;
            }
            i--;
            for (j = n - var - 2; j >= var && nr < limit; j--) {
                System.out.print(matrix.get(i).get(j) + " ");
                nr++;
            }
            j++;
            var++;
            for (i = n - var - 1; i >= var && nr < limit; i--) {
                System.out.print(matrix.get(i).get(j) + " ");
                nr++;
            }
        }
    }
}