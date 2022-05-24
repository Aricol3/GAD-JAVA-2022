package Lab6Collections.Example;

import java.util.HashMap;
import java.util.Map;

public class HMExample {
    public static void main(String[] args) {
        Map<Long, String> persons = new HashMap<>();
        persons.put(12342323232L, "Cosmin Ionescu");
        persons.put(29503939393L,"Bianca Popescu");
        persons.put(29503939393L,"Bianca Popescu 2");

        persons.put(28503939393L,"Andreea Popescu");

        System.out.println(persons.get(12342323232L));

        for(Map.Entry person:persons.entrySet()){
            System.out.println(person);
        }
    }
}