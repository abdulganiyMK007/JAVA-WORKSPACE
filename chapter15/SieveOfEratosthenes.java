package chapter15;

import java.util.HashSet;
import java.util.Set;

public class SieveOfEratosthenes {

    public static void main(String[] args) {
        int num = 20;

        Set<Integer> numbers = new HashSet<>();
        for (int i = 2; i <= num; i++) {
            numbers.add(i);
        }

        // int i = numbers.size();

        sieve(numbers, num);
    }

    private static void sieve(Set<Integer> numbers, int n) {
        
        int max = (int) Math.sqrt(n);
        int divisor = 2;
        while (divisor <= max) {
            for (Integer num : numbers) {
                if (num % divisor == 0) numbers.remove(num);
            }
        }


    }
    
}
