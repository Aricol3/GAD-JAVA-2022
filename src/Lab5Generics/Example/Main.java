package Lab5Generics.Example;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main {

    public static Object sum(List<? super String> list) {
        List<?> list1 = new ArrayList<Integer>();
        list1 = new ArrayList<Double>();
        return list1;
    }

    public static String getS(Object o){
        return "";
    }

    public static void main(String[] args) {
        List strings = new ArrayList();
        strings.add("Something");
        strings.add(new Date());

        for(Object o: strings){
            try {
                String s = (String) o;
                System.out.println(s);
            } catch (ClassCastException e) {
                System.out.println("Class Cast Exception");
            }
        }

        List<String> strings2 = new ArrayList<String>();
        strings2.add("sasas");
        for(String s: strings2){
            System.out.println(s.toUpperCase());
        }
        getS("232");
        sum(strings2);
    }
}