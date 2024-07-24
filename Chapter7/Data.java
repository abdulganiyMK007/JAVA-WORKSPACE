package Chapter7;

import java.util.Arrays;



/*
Sample values from an experiment often need to be smoothed out. One simple approach is to replace each value in an array with the average of the value and its two neighboring values (or one neighboring value if it is at either end of the array). Given a class Data with instance fields

private double[] values; 
private double valuesSize; 

implement a method 

public void smooth() 

that carries out this operation. You should not create another array in your solution.
*/
public class Data {

	private double[] values; 
	private int valuesSize; 

	public Data(int size) {
	  values = new double[size];
	  valuesSize = 0;
	}
	
	
	public void addValue(double aValue) {
		if (valuesSize < values.length) {
	  	values[valuesSize] = aValue;
	  	valuesSize++;
	  }
	}
	
	
	public void smooth() {
	  double preValue = 0;
	  double swapValue = 0;
	  
	  for (int i = 0; i < values.length; i++) {
	  
	  	preValue = values[i];
	  	
	  	
	  	if (i == 0) {
	  	  values[i] = (values[i] + values[i + 1]) / 2;
	  	  
			} else if (i == values.length - 1) {
			  values[i] = (swapValue + values[i]) / 2;
			  
			} else {
			  values[i] = (swapValue + values[i] + values[i + 1]) / 3;
			}  
			
			swapValue = preValue;
		}
	}
	
	
	public String getValues() {
		return Arrays.toString(values);
	}
	
	
	
	
	
	
	
	
	

}
