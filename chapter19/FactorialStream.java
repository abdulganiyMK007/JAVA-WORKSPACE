package chapter19;

import java.util.stream.Stream;

public class FactorialStream {

    public static void main(String[] args) {
        getFactorialStream(20);
    }


    private static void getFactorialStream(long limit) {
        Stream.iterate(2, n -> n + 1)
                .map(i -> i * i)
                .limit(limit)
                .forEach(System.out::println);
    }
    
}
