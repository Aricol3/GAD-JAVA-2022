package Lab5Generics.Ch5;

public class Main {
    public static void main(String[] args) {
        Integer[] arr = {1, 2, 3, 4, 7, 8, 9};
        Array<Integer> array = new Array(arr);
        try {
            array.sorted();
            int found;
            Integer key = new Integer(7);

            found = array.binarySearch(0, arr.length - 1, key);
            if (found != -1)
                System.out.println(key + " is located at position " + found);
            else
                System.out.println(key + " is not in our array");
        } catch (ArrayNotSortedException ex) {
            System.out.println("The array is not sorted");
        }
    }

}