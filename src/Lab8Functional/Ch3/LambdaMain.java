package Lab8Functional.Ch3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LambdaMain {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList("Adrian", "Valeriu", "Surdu"));

        String result = list
                .stream()
                .map(s -> s.substring(0, 1))
                .collect(Collectors.joining());
        System.out.println(result);

        list.removeIf(n -> n.length() % 2 == 1);
        System.out.println(list);

        list.replaceAll((n) -> n.toUpperCase());
        System.out.println(list);
    }
}