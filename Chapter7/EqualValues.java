package Chapter7;

import java.util.Arrays;


public class EqualValues {

  public static void main(String[] args) {
		int[] array1 = {5, 3, 2, 7, 1, 4, 6};
		int[] array2 = {5, 3, 3, 1, 2, 2, 7};
		int[] array3 = {5, 3, 3, 1, 2, 2, 7};
		
		System.out.println(equals(array1, array2));
		System.out.println(equals(array2, array3));
		//System.out.println("R:"+ Arrays.toString(array));
		//System.out.println("C:"+ Arrays.toString(newArray));
		
  }
  
  
    
  private static boolean equals(int[] array1, int[] array2) {
    int[] arr1 = array1.clone();
    int[] arr2 = array2.clone(); 
    arrange(arr1);
    arrange(arr2);
    
    if (arr1.length != arr2.length) return false;
	  	
	  for (int i = 0; i < arr1.length; i++) {
	  	if (arr1[i] != arr2[i]) return false; 
		}
    
    System.out.println("1: "+ Arrays.toString(arr1));
    System.out.println("2: "+ Arrays.toString(arr2));
    
    return true;
  }
  
  
  
  
  private static void arrange(int[] array) {
  	int smallestIndex = 0;
  	int swap = 0;
  	
  	for (int i = 0; i < array.length; i++) {
  		smallestIndex = i;
      for (int j = i + 1; j < array.length; j++) {
      	
      	if (array[j] < array[smallestIndex]) {
      		smallestIndex = j;  
      	} 
      }
       
      swap = array[smallestIndex];
      array[smallestIndex] = array[i];
      array[i] = swap;
    }
  }

}
