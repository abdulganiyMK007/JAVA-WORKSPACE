package chapter14;

public class RadixSorter {
	
	/**
	 * Sorts an array, using radix sort.
	 * 
	 * @param a the array to sort
	 */
	public static void sort(int[] a) {
		int maxValue = ArrayUtil.getMax(a);
		
		for (int exp = 1; maxValue / exp > 0; exp *= 10) {
			sortHelper(a, exp);

		}
	}

	
	private static void sortHelper(int[] a, int exp) {
		int fillIndex = 0;
		int[][] bucket = new int[a.length][2];
		
		for (int i = 0; i < a.length; i++) {
			bucket[i][0] = a[i];
			bucket[i][1] = (a[i] / exp) % 10;
		}
		
		
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				if (bucket[j][1] == i) {
					a[fillIndex] = bucket[j][0];
					fillIndex++;
				}
			}
		}
		
		
		
	}

}
