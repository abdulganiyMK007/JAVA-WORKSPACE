package Chapter7;

import java.util.Arrays;


public class RemoveDuplicates {

  public static void main(String[] args) {
		int[] array = {1, 2, 3, 1, 2, 3, 4, 5, 5, 1, 1, 2, 2, 0};
		//int[] array3 = {1, 2, 3, 1, 1, 1, 1, 1, 2};
		
		System.out.println("R: "+ Arrays.toString(array));
		array = removeDuplicates(array);
		System.out.println("R: "+ Arrays.toString(array));	
		
  }
  
  private static int[] removeDuplicates(int[] array) {
  
  	int length = array.length;
  	int i = 0;
  	int j = 0;
  	while (i < length) {
  			j = i + 1;
  			while (j < length) {
  				if (array[i] == array[j]) {
  					array = removeAt(array, j); 
  					length--;
  					j--;
  				} 
  				j++; 
  			}
  		i++;
  		  
  	}
  	
  	return array;
  }
  
  
  public static int[] removeAt(int[] values, int index) {
  	boolean startShift = false;
    int[] newValues = new int[values.length - 1];
    
    for (int i = 0; i < values.length; i++) {
      if (i == index) {
      	startShift = true;
      	continue;
      }
      if (startShift) {
        newValues[i - 1] = values[i];
      } else {
        newValues[i] = values[i];
      }  
    }
   
    return newValues;
  }
  
  
  
  
 
    

}
