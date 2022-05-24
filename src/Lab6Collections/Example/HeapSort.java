package Lab6Collections.Example;

import java.util.*;

public class HeapSort {

    public static <E> List<E> hSort(Collection<E> c){
        Queue<E> queue = new PriorityQueue<>(c);
        List<E> result = new ArrayList<>();
        System.out.println("c = " + c);
        System.out.println("queue=" + queue);

        while(!queue.isEmpty()){
            result.add(queue.remove());
            System.out.println(queue);
        }
        return result;
    }
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(6,1,5,7,8,3,4));
        list = hSort(list);
        System.out.println(list);
    }
}