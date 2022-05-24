package Lab6Collections.Ch1;

import java.util.*;

public class Leaders {
    public static void findLeaders(ArrayList<Integer> numbers) {
        int max = numbers.get(numbers.size() - 1) - 1;
        for (int i = numbers.size() - 1; i >= 0; i--) {
            if (numbers.get(i) > max) {
                max = numbers.get(i);
                System.out.println(max);
            }
        }
    }

    public static void findLeaders2(ArrayList<Integer> numbers) {
        Collections.reverse(numbers);
        int max = numbers.get(0) - 1;
        for (Integer currentElement : numbers) {
            if (currentElement > max) {
                max = currentElement;
                System.out.println(currentElement);
            }
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> numbersList = new ArrayList<Integer>(Arrays.asList(12, 4, 2, 1, 2));
        //findLeaders(numbersList);
        findLeaders2(numbersList);
    }
}
