package Chapter7;

import java.util.Arrays;


public class Test {

  public static void main(String[] args) {
  	final int ROWS = 5;
  	final int COLS = 5;
  
  	int[][] matrix = new int[ROWS][COLS];
  	
  	String result = "";
  	for (int i = 0; i < matrix.length; i++) {
  		
  		result += "[";
  	  for (int j = 0; j < matrix[0].length; j++) {
  	  	
  	  	matrix[i][j] = 1;
  	  	result += matrix[i][j] + ", ";
  	  }
  	  
  	  System.out.println(Arrays.toString(matrix[i]));
  	  result += "]\n";
  	}
		
		System.out.println(result);
		System.out.println(Arrays.toString(matrix));
  }

}
