package chapter19;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class PalindromeNumber {
    public static void main(String[] args) {
        
        palindromeInPerfectSquares(20);
        palindromeInPrime(10);
        
    }

    

    private static void palindromeInPrime(int limit) {
        Stream.iterate(2, n -> n + 1)
            .filter(i -> isPrime(i))
            .filter(w -> isPalindrome(w))
            .limit(limit)
            .forEach(System.out::println);
    }

    private static void palindromeInPerfectSquares(int limit) {
        Stream.iterate(0, n -> n + 1)
            .map(i -> i * i)
            .filter(w -> isPalindrome(w))
            .limit(limit)
            .forEach(System.out::println);
    }


    private static boolean isPalindrome(long num) {
        String reverse = "";
        String str = num + "";

        for (int i = 0; i < str.length(); i++) {
            reverse = (str.charAt(i) + reverse);
        }
        return str.equals(reverse);
    }

    private static boolean isPrime(long num) {
        return IntStream.range(2, (int) (num/2 + 1))
            .noneMatch(w -> num % w == 0);

    }
}
