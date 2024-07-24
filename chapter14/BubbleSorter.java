package chapter14;

public class BubbleSorter {
	
		
		/**
		 * Sorts an array, using bubble sort.
		 * 
		 * @param a the array to sort
		 */
		public static void sort(int[] a) {
			boolean isSorted = false;
			int swap = 0;
			
			while (!isSorted) {
				isSorted = true;
				for (int i = 0; i < a.length - 1; i++) {		
					if (a[i] > a[i + 1]) {
						swap = a[i];
						a[i] = a[i + 1];
						a[i + 1] = swap;
						isSorted = false;
					}	
				}
			}
		}

}
