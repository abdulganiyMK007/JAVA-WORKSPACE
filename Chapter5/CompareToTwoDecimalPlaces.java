package Chapter5;
import java.util.Scanner;

/*
Write a program that reads in two floating-point numbers and tests whether they are the same up to two decimal places. Here are two sample runs. Enter two floating-point numbers: 2.0 1.99998 They are the same up to two decimal places. 

Enter two floating-point numbers: 2.0 1.98999 
They are different.
*/
public class CompareToTwoDecimalPlaces {

	private static final double DECIMAL_PLACE = 2;

  public static void main(String[] args) {
  
  	Scanner in = new Scanner(System.in);
  	
  
  	System.out.print("Enter two floating-point numbers: ");
  	double d1 = in.nextDouble();
  	double d2 = in.nextDouble();
  	
  	d1 = Math.round(d1 * Math.pow(10, DECIMAL_PLACE));
  	d2 = Math.round(d2 * Math.pow(10, DECIMAL_PLACE));
  	
  	
  	if (d1 == d2) {
  	  System.out.println("They are same.");
  	} else {
    	System.out.println("They are different.");
  	}
  
		in.close();
  }

}
