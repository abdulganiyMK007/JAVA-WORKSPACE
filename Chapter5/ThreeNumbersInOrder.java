package Chapter5;
import java.util.Scanner;
/*
Write a program that reads in three integers and prints “in order” if they are sorted in ascending or descending order, or “not in order” otherwise. For example,  
1 2 5  in order  
1 5 2  not in order  
5 2 1  in order  
1 2 2  in order
*/

public class ThreeNumbersInOrder {

	private static final String ORDERED = "In order";
	private static final String UNORDERED = "Not in order";
	
  public static void main(String[] args) {
  
  	Scanner in = new Scanner(System.in);
  
  	int first, second, third;
  	first = second = third = 0;
  	String answer = "";
  
  	System.out.print("Enter first integer: ");
  	first = in.nextInt(); 
  	
  	System.out.print("Enter second integer: ");
  	second = in.nextInt(); 
  	
  	System.out.print("Enter third integer: ");
  	third = in.nextInt(); 
  	
  	if (first > second) {
  	  if (second > third || second == third) {
  	    answer = ORDERED;
  		} else {
    		answer = UNORDERED;
  		}
  	} else if (first < second) {
  		if (second < third || second == third ) {
  	    answer = ORDERED;
  		} else {
    		answer = UNORDERED;
  		}
  	} else {
  	  answer = ORDERED;
  	}
  	
		System.out.println(answer);
		in.close();
  }

}
