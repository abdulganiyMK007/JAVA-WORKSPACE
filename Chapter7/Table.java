package Chapter7;

import java.util.Arrays;


/*
Add a method to the Table class below that computes the average of the neighbors of a table element in the eight directions shown in Figure 15:  However, if the element is located at the boundary of the array, include only the neighbors that are in the table. For example, if row and column are both 0, there are only three neighbors. 


*/
public class Table {

	private int[][] values;  
	
	public Table(int rows, int columns) { 
		values = new int[rows][columns]; 
	}  
	
	public void set(int atRow, int atColumn, int value) { 
		values[atRow][atColumn] = value; 
	}
	
	
	public void print() {
	  for (int i = 0; i < values.length; i++) {
  	  System.out.println(Arrays.toString(values[i]));
  	}
	}
	
	public double neighborAverage(int row, int column) {
	  double sum = 0;
	  int neighbourCount = 0;
	  
	  // top left  - 1
	  if (row > 0 && column > 0) {
	    sum += values[row - 1][column - 1];
	    neighbourCount++;
	  }
	  
	  // top mid - 2
	  if (row > 0) {
	    sum += values[row - 1][column];
	    neighbourCount++;
	  }
	  
	  // top right - 3
		if (row > 0 && column < values[row].length - 1) {
			 sum += values[row - 1][column + 1];
			 neighbourCount++;
		}
	  
	  // left mid - 4
	  if (column > 0) {
	    sum += values[row][column - 1];
	    neighbourCount++;
		}
			
		// mid right - 5
		if (column < values[row].length - 1) {
			sum += values[row][column + 1];
			neighbourCount++;
		}
		
		// bottom left - 6
		if (row < values.length - 1 && column > 0) {
			sum += values[row + 1][column - 1];
			neighbourCount++;
		}
		
	  // bottom mid - 7
		if (row < values.length - 1) {
			sum += values[row + 1][column];
			neighbourCount++;
		}
		
		// bottom right - 8
		if (row < values.length - 1 && column < values[row].length - 1) {
			sum += values[row + 1][column + 1];
			neighbourCount++;
		}
		
	  //System.out.println(sum / neighbourCount);
	  return sum / neighbourCount;
	}
	
	
	public double sum(int n, boolean horizontal) {
		int sum = 0;
		
		if (horizontal) {
		  for (int i = 0; i < values.length; i++) {
		  	sum += values[n][i];
		  }
		} else {
		  for (int i = 0; i < values[n].length; i++) {
		  	sum += values[i][n];
		  }
		}
		
		System.out.println(sum);
	  return sum;
	}

}
