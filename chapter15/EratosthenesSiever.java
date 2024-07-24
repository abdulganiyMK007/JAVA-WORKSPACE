package chapter15;

import java.util.LinkedList;
import java.util.Scanner;

public class EratosthenesSiever {

    private static final int LEAST_PRIME_NUMBER = 2;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int value = in.nextInt();
        in.close();

        LinkedList<Integer> list = new LinkedList<>();
        
        sieve(list, value);
        System.out.println(list);
    }

    /**
     * Implements the sieve of Eratosthenes: 
     * a method for computing prime numbers, known to the ancient Greeks. 
     * This method will compute all prime numbers up to n. 
     * First insert all numbers from 2 to n into a set. 
     * Then erase all multiples of 2 (except 2); that is, 4, 6, 8, 10, 12, . . . .
     * Erase all multiples of 3 (except 3); that is, 6, 9, 12, 15, . . . . 
     * Go up to square root of n
     * 
     * @param list List of numbers from 2 to n
     * @param n Maximum number in list
     */
    private static void sieve(LinkedList<Integer> list, int n) {
        init(list, n);
        // System.out.println(list);

        int endPoint = (int) Math.sqrt((double) list.getLast());
        endPoint++;
        int nextPrime = list.getFirst();
        int nextPrimeIndex = 0;
        
        while (nextPrime <= endPoint) {
            for (int i = nextPrimeIndex + 1; i < list.size(); i++) {
                if ((list.get(i) % nextPrime == 0)) {
                    list.remove(i);
                }
            }

            nextPrimeIndex++;
            nextPrime = list.get(nextPrimeIndex);
        }
    }

    /**
     * Inserts all numbers from 2 to n into a list
     * 
     * @param list List of numbers from 2 to n
     * @param value Maximum number in list
     */
    private static void init(LinkedList<Integer> list, int value) {
        for (int i = LEAST_PRIME_NUMBER; i <= value; i++) {
            list.add(i);
        }
    }
    
}
