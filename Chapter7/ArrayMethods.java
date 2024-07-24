package Chapter7;

import java.util.Arrays;



/*
a. Swap the first and last elements in the values. 

b. Shift all elements to the right by one and move the last element into the first  position. For example, 1 4 9 16 25 would be transformed into 25 1 4 9 16. 

c. Replace all even elements with 0. 

d. Replace each element except the first and last by the larger of its two neighbors. 

e. Remove the middle element if the values length is odd, or the middle two elements if the length is even. 

f. Move all even elements to the front, otherwise preserving the order of the elements. 

g. Return the second-largest element in the values. 

h. Return true if the values is currently sorted in increasing order. 

i. Return true if the values contains two adjacent duplicate elements. 

j. Return true if the values contains duplicate elements (which need not be adjacent).

*/
public class ArrayMethods {  
	
	private int[] values; 
	 
	public ArrayMethods(int[] initialValues) {
		values = initialValues; 
		System.out.println("INIT: "+ Arrays.toString(values));
	} 
	
	
	public boolean containDuplicate() {
		
		for (int i = 0; i < values.length; i++) {
			for (int j = i + 1; j < values.length; j++) {
				if (values[i] == values[j]) {
					System.out.println("CONTAIN DUPLICATE");
			  	return true;
				}
			}
		}
		
		System.out.println("NO DUPLICATE");
		return false;
	}
	
	
	public boolean containAdjacentDuplicate() {
		
		for (int i = 1; i < values.length; i++) {
			if (values[i - 1] == values[i]) {
				System.out.println("CONTAIN ADJACENT DUPLICATE");
			  return true;
			}
		}
		
		System.out.println("NO ADJACENT DUPLICATE");
		return false;
	}
	
	
	public boolean isSorted() {
		
		for (int i = 1; i < values.length; i++) {
			if (values[i - 1] > values[i]) {
				System.out.println("NOT SORTED");
			  return false;
			}
		}
		
		System.out.println("SORTED");
		return true;
	}
	 
	
	public void swapFirstAndLast() {
	  int swap = values[0];
	  values[0] = values[values.length - 1];
	  values[values.length - 1] = swap;
	  System.out.println("Swap F&L: "+ Arrays.toString(values));
	}  
	
	public void removeMiddleElem() {
	  if (values.length % 2 == 0) {
	    removeAt(values.length / 2);
	    removeAt(values.length / 2);
		} else {
		  removeAt(values.length / 2);
		}
		
		System.out.println("Remove Mid: "+ Arrays.toString(values));
	}
	
	
	public void shiftRight() {
		int swap = values[values.length - 1];
		
		for (int i = values.length - 1; i > 0 ; i--) {
			values[i] = values[i - 1];
		}
		
		values[0] = swap;
	  System.out.println("Shift R: "+ Arrays.toString(values));
	}
	
	
	
	public void shiftLeft() {
		int swap = values[0];
		
		for (int i = 0; i < values.length - 1; i++) {
			values[i] = values[i + 1];
		}
		
		values[values.length - 1] = swap;
	  System.out.println("Shift L: "+ Arrays.toString(values));
	}
	
	public void zeroAllEven() {
		for (int i = 0; i < values.length; i++) {
			if (values[i] % 2 == 0)  values[i] = 0;
		}
	  System.out.println("ZeroEven: "+ Arrays.toString(values));
	}
	
	public void replaceWithLargerBound() {
	  for (int i = 0; i < values.length; i++) {
	  	if (i == 0 || i == values.length - 1)
	  		continue;
	  	values[i] = Math.max(values[i - 1], values[i + 1]);
	  }
	  
	  System.out.println("Maxbound: "+ Arrays.toString(values));
	}
	
	
	
	public void moveEvenToFront() {
	  int evenLastIndex = 0;
	  if (values[0] % 2 == 0) evenLastIndex++;
	  
	  for (int i = 1; i < values.length; i++) {
	    if (values[i] % 2 == 0) {
	      int swap = values[evenLastIndex];
	      values[evenLastIndex] = values[i];
	      values[i] = swap;
	      evenLastIndex++;
			}
		}
		
		System.out.println("EvenToFront: \n   "+ Arrays.toString(values));
	}
	
	public void removeAt(int index) {
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
   
    values = newValues;
    
    //System.out.println("Remove "+ (index) +": "+ Arrays.toString(values));
  }
	
}