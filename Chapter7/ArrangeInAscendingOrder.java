package Chapter7;

import java.util.Arrays;


public class ArrangeInAscendingOrder {

  public static void main(String[] args) {
		
		int[] values = {11, 1, 4, 9, 16, 9, 7, 4, 9};
		int[] others = {1, 4, 9, 16, 9, 7, 4, 9, 11};
		
		
		arrange(values.clone());
		arrange(others.clone());
		
		System.out.println(Arrays.toString(values));
		
		System.out.println(Arrays.toString(others));
  }
  
  
 
  
  private static int[] arrange(int[] values) {
  	int smallestIndex = 0;
  	int swap = 0;
  	
  	for (int i = 0; i < values.length; i++) {
  		smallestIndex = i;
      for (int j = i + 1; j < values.length; j++) {
      	
      	if (values[j] < values[smallestIndex]) {
      		smallestIndex = j;  
      	} 
      }
       
      swap = values[smallestIndex];
      values[smallestIndex] = values[i];
      values[i] = swap;
    }
    
    //System.out.println(Arrays.toString(array));
    return values;
  }
  
  
  
  
}
