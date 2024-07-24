package Chapter7;

import java.util.Arrays;
import java.util.Random;


public class Reverse {

  public static void main(String[] args) {
  	Random rgen = new Random();
  	final int LENGTH = 10;

		
		int[] array = new int[LENGTH];
		
		for (int i = 0; i < array.length; i++) {
		  array[i] = rgen.nextInt(LENGTH);
		}
		
		System.out.println(Arrays.toString(array));
		reverseArray(array);
		System.out.println(Arrays.toString(array));
		
  }
  
  
  private static void reverseArray(int[] array) {
    
    int swapElem = 0;
    for (int i = 0; i < array.length / 2; i++) {
    	swapElem = array[i];
    	array[i] = array[array.length - 1 - i];
    	array[array.length - 1 - i] = swapElem;
    }
  }
  
  
  

}
