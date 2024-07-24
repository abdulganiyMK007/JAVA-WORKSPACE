package Chapter7;

import java.util.Arrays;


public class SumWithoutSmallest {

  public static void main(String[] args) {

		final int LENGTH = 10;

		int[] array = new int[LENGTH];
		
		for (int i = 0; i < array.length; i++) {
		  array[i] = 1;
		}
		
		System.out.println(Arrays.toString(array));
		
		System.out.println(sumWithoutSmallest(array));


  }
  
  private static double sumWithoutSmallest(int[] array) {
  	
  	double sum = 0;
  	double smallest = array[0];
  	for (int i = 0; i < array.length; i++) {
  		sum += array[i];
  		smallest = Math.min(smallest, array[i]);
  	}
  	
  	return sum - smallest;
    
  }

}
