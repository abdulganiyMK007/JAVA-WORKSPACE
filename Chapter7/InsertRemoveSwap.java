package Chapter7;

import java.util.Arrays;


public class InsertRemoveSwap {

  public static void main(String[] args) {
  	//int[] array1 = {5, 3, 2, 7, 1, 4, 6};
		//int[] array2 = {5, 3, 6, 1, 4, 2, 7};
		int[] arr = {1, 2, 3, 4, 5, 6};
		
		System.out.println(Arrays.toString(arr));
		arr = insertAt(arr, 15, 5);
		System.out.println(Arrays.toString(arr));

  }
  
  
  
  
  
  
  public static int[] insertAt(int[] values, int aValue, int index) {
  	boolean startShift = false;
    int[] newValues = new int[values.length + 1];
    
    for (int i = 0; i < values.length; i++) {
      if (i == index) {
      	startShift = true;
      	newValues[i] = aValue;
      	newValues[i + 1] = values[i];
      	continue;
      }
      if (startShift) {
        newValues[i + 1] = values[i];
      } else {
        newValues[i] = values[i];
      }  
    }
   
    return newValues;
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
