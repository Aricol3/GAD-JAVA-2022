package Lab5Generics.Ch5;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Collections;

public class Array<T> {
    private T[] arr;
    int order;

    public Array(T array) {
        arr = (T[]) array;
    }

    public void sorted() throws ArrayNotSortedException {
        T[] aux1 = (T[]) new Array[arr.length];
        T[] aux2 = (T[]) new Array[arr.length];
        aux1 = Arrays.copyOf(arr, arr.length);
        aux2 = Arrays.copyOf(arr, arr.length);
        Arrays.sort(aux1);
        Arrays.sort(aux2, Collections.reverseOrder());
        if (Arrays.equals(arr, aux1))
            order = 1;
        else if (Arrays.equals(arr, aux2))
            order = 2;
        else
            throw new ArrayNotSortedException("The array is not sorted");
    }

    public int binarySearch(int left, int right, Number key) {
        int mid;
        Number aux;
        while (left <= right) {
            mid = (left + right) / 2;
            if (key.equals(arr[mid]))
                return mid;
            aux = (Number) arr[mid];
            if (this.compare(aux, key) < 0) { //arr[mid]<key
                if (order == 1)
                    left = mid + 1;
                else
                    right = mid - 1;
            } else {
                if (order == 1)
                    right = mid - 1;
                else
                    left = mid + 1;
            }
        }
        return -1;
    }

    private int compare(Number aux, Number key) {
        BigDecimal b1 = new BigDecimal(aux.floatValue());
        BigDecimal b2 = new BigDecimal(key.floatValue());
        return b1.compareTo(b2);

    }
}