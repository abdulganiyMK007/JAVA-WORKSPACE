package Chapter6;


/*
Write a program that reads a set of floating-point data values. Choose an appropriate mechanism for prompting for the end of the data set. When all values have been read, print out the 
- count of the values, 
- the average, 
- and the standard deviation. 

Your program should use a class DataSet. That class should have a method public void add(double value) and methods getAverage and getStandardDeviation.

*/
public class DataSet {

	private int valueCount;
	private double sum;
	private double sumOfSquares;
	
	public DataSet() {
	  valueCount = 0;
	  sum = 0;
	  sumOfSquares = 0;
	}
	
	public void add(double value) {
	  valueCount++;
	  sum += value;
	  sumOfSquares += value * value;
	}
	
	public double getAverage() {
	  return sum / valueCount;
	}
	
	public double getStandardDeviation() {
	  return Math.sqrt((sumOfSquares - sum * sum / valueCount) / (valueCount - 1));
	}
	

}
