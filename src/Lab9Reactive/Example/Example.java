package Lab9Reactive.Example;

import java.util.function.BiFunction;
import java.util.function.Function;

public class Example {
    private int c = 5;

    public int calculate(int a, int b) {
        return a + b + c;
    };

    public void calculate2(){
        int e = 5;
        BiFunction<Integer,Integer,Integer> myFunction = (Integer a, Integer b) -> a + b + this.c + e;
//        e = 10;
        System.out.println(myFunction.apply(2,3));
        this.c=6;
        System.out.println(myFunction.apply(2,3));
    }

    public Integer useF( Function<Integer, Integer> f1) {
        return f1.apply(2);
    }

    public static void main(String[] args) {
        Example e = new Example();
//        System.out.println(e.calculate(2,3));
//        c = 10;
//        System.out.println(e.calculate(2,3));
        e.calculate2();

    }
}
// parametru: a,b  , argument: 2, 3, atribut: c, variabila: e
//