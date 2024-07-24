package chapter19;

import java.util.stream.Stream;


public class InfiniteStreamTester {

    public static void main(String[] args) {
        squareStreams(50);
        
        regularStream((long) 1000000000);
        parallelStream((long) 1000000000);
        
    }


    private static void squareStreams(int i) {
        Stream.iterate(2, n -> n + 2)
        .filter(w -> isPalindrome(w + ""))
        .limit(5)
        .forEach(w -> System.out.println(w));
    }

    private static boolean isPalindrome(String str) {
        String reverse = "";
        for (int i = 0; i < str.length(); i++) {
            reverse += (str.charAt(i) + reverse);
        }
        return str.equals(reverse);
    }

    private static void regularStream(long n) {
        StopWatch timer = new StopWatch();
        timer.start();
        Stream.generate(() -> 1 + (int) (20 * Math.random()))
            .filter(w -> w % 2 == 0)
            .limit(n);
            // .forEach(w -> System.out.println(w));
        timer.stop();
        System.out.println("Elapsed time with Regular Stream ["+ n +"] : "
                                + timer.getElapsedTime() + " milliseconds");
        timer.reset();
    }

    private static void parallelStream(long n) {
        StopWatch timer = new StopWatch();
        timer.start();
        Stream.generate(() -> 1 + (int) (20 * Math.random()))
            .parallel()
            .filter(w -> w % 2 == 0)
            .limit(n);
            // .forEach(w -> System.out.println(w));
        timer.stop();
        System.out.println("Elapsed time with Parallel Stream ["+ n +"] : "
                                + timer.getElapsedTime() + " milliseconds");
        timer.reset();
    }
    
}
