package Chapter5;
import java.util.Scanner;
/*
Write a program that reads three numbers and prints “increasing” if they are in increasing order, “decreasing” if they are in decreasing order, and “neither” otherwise. Here, “increasing” means “strictly increasing”, with each value larger than its pre decessor. The sequence 3 4 4 would not be considered increasing.
*/

public class CompareThreeIntegers {

	private static final String NEITHER = "Neither";
	private static final String INCREASING = "Increasing";
	private static final String DECREASING = "Decreasing";

  public static void main(String[] args) {
  
  	Scanner in = new Scanner(System.in);
  
  	int first, second, third;
  	first = second = third = 0;
  	boolean isLenient = true;
  	String answer = "";
  
  
  	System.out.print("Enter first integer: ");
  	first = in.nextInt(); 
  	
  	System.out.print("Enter second integer: ");
  	second = in.nextInt(); 
  	
  	System.out.print("Enter third integer: ");
  	third = in.nextInt(); 
  	
  	System.out.print("Strict or Lenient?: ");
  	isLenient = in.next().substring(0, 1).equalsIgnoreCase("l"); 
  	
  	
  	if (first > second) {
  		if (second > third) {
  			answer = DECREASING;
  		} else if (second < third) {
  			answer = NEITHER;
  		} else {
    		if (isLenient) {
    			answer = DECREASING;
    		} else {
    		  answer = NEITHER;
    		}
  		}
  	} else if (first < second) {
    	if (second > third) {
  		  answer = NEITHER;
  		} else if (second < third) {
  		  answer = INCREASING;
  		} else {
    		if (isLenient) {
    			answer = INCREASING;
    		} else {
    		  answer = NEITHER;
    		}
  		}
  	} else {
    	if (second > third) {
  		  if (isLenient) {
    			answer = DECREASING;
    		} else {
    		  answer = NEITHER;
    		}
  		} else if (second < third) {
  		  if (isLenient) {
    			answer = INCREASING;
    		} else {
    		  answer = NEITHER;
    		}
  		} else {
    		answer = NEITHER;
  		}
  	}

		System.out.println(answer);
		
		in.close();
  }

}
