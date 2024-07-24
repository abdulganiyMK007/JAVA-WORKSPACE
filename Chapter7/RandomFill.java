package Chapter7;
import java.util.Arrays;
import java.util.Random;
/*
Write a program that initializes an array with ten random integers and then prints four lines of output, containing 
• Every element at an even index. 
• Every even element. 
• All elements in reverse order. 
• Only the first and last element.
*/

public class RandomFill {

  public static void main(String[] args) {
  	Random rgen = new Random();
		final int LENGTH = 10;

		
		int[] array = new int[LENGTH];
		
		for (int i = 0; i < array.length; i++) {
		  array[i] = rgen.nextInt(LENGTH);
		}
		
		System.out.println(Arrays.toString(array));
		
		String elemAtEventIndex, elemEven, elemReverse, elemFirstAndLast;
		
		elemAtEventIndex = elemEven = elemReverse = elemFirstAndLast = "";
		
		for (int i = 0; i < array.length; i++) {
			if (i % 2 == 0) elemAtEventIndex += (array[i]  + " ");
			
			if (array[i] % 2 == 0) elemEven += (array[i]  + " ");
			
			elemReverse = (array[i] +" "+ elemReverse);
			
			if (i == 0 || i == array.length - 1) elemFirstAndLast += (array[i] + " ");
		}
		
		
		System.out.println("Element at even index: "+ elemAtEventIndex);
		System.out.println("Even element: "+ elemEven);
		System.out.println("Reverse: "+ elemReverse);
		System.out.println("First and last element: "+ elemFirstAndLast);
		
  }

}
