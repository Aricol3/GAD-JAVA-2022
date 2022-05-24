package Lab6Collections.Example;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class Main {
    public static void ex1(){
        ArrayList<Integer> list = new <Integer> ArrayList();
        list.add(2);
        list.add(4);
        list.add(8);
        list.add(10);

        Iterator<Integer> iterator = list.iterator();
        Integer current;
        System.out.println("size=" + list.size());

        while(iterator.hasNext()) {
            current = iterator.next();
            System.out.println(current);
            if(current.equals(2)) {
                iterator.remove();
                System.out.println(list.toString());
            }

        }
    }
    public static void main(String[] args) {
        ex1();
    }
}