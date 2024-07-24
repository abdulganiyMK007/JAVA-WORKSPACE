package chapter14;

// import java.util.Arrays;
import java.util.Random;

/**
 * This class contains utility methods for array manipulation.
 */
public class ArrayUtil {
	private static Random generator = new Random();

	/**
	 * Creates an array filled with random values.
	 * 
	 * @param length the length of the array
	 * @param n      the number of possible random values
	 * @return an array filled with length numbers between 0 and n - 1
	 */
	public static int[] randomIntArray(int length, int n) {
		int[] a = new int[length];
		for (int i = 0; i < a.length; i++) {
			a[i] = generator.nextInt(n);
		}
		return a;
	}

	
	/**
	 * Swaps two entries of an array.
	 * 
	 * @param a the array
	 * @param i the first position to swap
	 * @param j the second position to swap
	 */
	public static void swap(int[] a, int i, int j) {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}

	/**
	 * Print entries of an array.
	 * 
	 * @param a the array
	 */
	public static void print(int[] a) {
		// System.out.println(Arrays.toString(a));
	}
	
	/**
	 * Returns the maximum value in entries of an array'
	 * 
	 * @param a the array
	 * @return maximum value in entries of an array
	 */
	public static int getMax(int[] a) {
		int max = a[0];
		for (int i = 1; i < a.length; i++) {
			if (max < a[i]) max = a[i];
		}
		
		return max;
	}
	
	
	/**
	 * Returns the minimum value in entries of an array'
	 * 
	 * @param a the array
	 * @return minimum value in entries of an array
	 */
	public static int getMin(int[] a) {
		int min = a[0];
		for (int i = 1; i < a.length; i++) {
			if (min > a[i]) min = a[i];
		}
		
		return min;
	}

}