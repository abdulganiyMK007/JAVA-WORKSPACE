package Chapter7;


/*
Write a class DataSet that stores a number of values of type double. 

Provide a constructor public DataSet(int maximumNumberOfValues) and a method public void add(double value) that adds a value, provided there is still room. 

Provide methods to compute the sum, average, maximum, and minimum value.
*/
public class DataSet {
	
	private double[] values;
	private int valueCount;

	public DataSet(int maximumNumberOfValues) {
		valueCount = 0;
		values = new double[maximumNumberOfValues];
	}
	
	public double getAverage() {
		double average = getTotal() / valueCount;
		//System.out.println("Average: "+ average);
		return average;
	}
	
	public double getMinimum() {
		double minimum = values[0];
		
		for (int i = 0; i < valueCount; i++) {
			minimum = Math.min(values[i], minimum);
		}  
		
		//System.out.println("Minimum: "+ minimum);
		return minimum;
	}
	
	public double getMaximum() {
		double maximum = values[0];
		
		for (int i = 0; i < valueCount; i++) {
			maximum = Math.max(values[i], maximum);
		}  
		
		//System.out.println("Maximum: "+ maximum);
		return maximum;
	}
	
	public double getTotal() {
		double sum = 0;
		for (int i = 0; i < valueCount; i++) {
			sum += values[i];
		}  
		
		//System.out.println("Total: "+ sum);
		return sum;
	}
	
	
	public void add(double value) {
		if (valueCount != values.length) {
		  values[valueCount] = value;
		  valueCount++;
		}
	}

}
