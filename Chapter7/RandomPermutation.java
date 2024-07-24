package Chapter7;

import java.util.Arrays;
import java.util.Random;

/*
Write a program that produces ten random permutations of the numbers 1 to 10. To generate a random permutation, you need to fill an array with the numbers 1 to 10 so that no two entries of the array have the same contents. You could do it by brute force, generating random values until you have a value that is not yet in the array. But that is inefficient. Instead, follow this algorithm: 

Make a second array and fill it with numbers 1-10. 
Repeat 10 times.
	Pick a random position in the second array. 
	Remove the element at the position from the second array.
	Append the removed element to the permutation array.
*/
public class RandomPermutation {

  public static void main(String[] args) {
  	Random rgen = new Random();
  	
  	final int LENGTH = 20;
  	
  	int[] orderedArray = new int[LENGTH];
  	int[] permuttedArray = new int[LENGTH];
  	
  	init(orderedArray);
  	int index = 0;
  	
  	
  	for (int i = 0; i < permuttedArray.length; i++) {
  	   
  	  index = rgen.nextInt(orderedArray.length);
  	  permuttedArray[i] = orderedArray[index]; 
  	  orderedArray = removeAt(orderedArray, index);
  	}
  	System.out.println(Arrays.toString(permuttedArray));

  }
  
  
  private static int[] removeAt(int[] array, int index) {
  	boolean startShift = false;
    int[] newArray = new int[array.length - 1];
    
    for (int i = 0; i < array.length; i++) {
      if (i == index) {
      	startShift = true;
      	continue;
      }
      if (startShift) {
        newArray[i - 1] = array[i];
      } else {
        newArray[i] = array[i];
      }  
    }
   
    return newArray;
    
  }
  
  
  private static void init(int[] array) {
  
  	for (int i = 1; i <= array.length; i++) {
  		array[i - 1] = i;  
  	}
    
  }

}
