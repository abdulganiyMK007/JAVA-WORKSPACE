package Chapter4;

import java.util.Scanner;


public class TwoIntegers {

  public static void main(String[] args) {
  	int sum, difference, product, distance, maximum, minimum;
  	sum = difference = product = distance = maximum = minimum = 0;
  	double average = 0;
  	Scanner sc = new Scanner(System.in);
  	
  	System.out.print("Enter the first integer: ");
  	int int1 = sc.nextInt();
  	
  	System.out.print("Enter the second integer: ");
  	int int2 = sc.nextInt();
  	
  	//int int1 = 20;
  	//int int2 = 25;
  	
  	sum = int1 + int2;
  	difference = int1 - int2;
  	product = int1 * int2;
  	average = (double) sum / 2;
  	distance = Math.abs(difference);
  	maximum = Math.max(int1, int2);
  	minimum = Math.min(int1, int2);
  	
  	
  	String format = "Sum: %13d\nDifference: %6d\nProduct: %9d\nAverage: %12.2f\nDistance: %8d\nMaximum: %9d\nMinimum: %9d\n";
  	
  	System.out.printf(format, sum, difference, product, average, distance, maximum, minimum);
  	
  	sc.close();

  }

}
