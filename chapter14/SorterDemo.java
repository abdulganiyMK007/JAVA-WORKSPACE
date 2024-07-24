package chapter14;

import java.util.Arrays;

/**
 * This program demonstrates the selection sort algorithm by sorting an array
 * that is filled with random numbers.
 */
public class SorterDemo {
	
	private static final int LENGTH = 20;
	private static final int MAX_NUMBER = 100;
	
	public static void main(String[] args) {
		int[] a = ArrayUtil.randomIntArray(LENGTH, MAX_NUMBER);
		System.out.println("RadixSorter");
		System.out.println(Arrays.toString(a));
		RadixSorter.sort(a);
		System.out.println(Arrays.toString(a));
	}
}