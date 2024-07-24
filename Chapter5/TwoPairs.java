package Chapter5;

import java.util.Scanner;
/*
Write a program that reads four integers and prints “two pairs” if the input consists of two matching pairs (in some order) and “not two pairs” otherwise. For example,  
1 2 2 1  two pairs  
1 2 2 3  not two pairs  
2 2 2 2  two pairs
*/
public class TwoPairs {

	private static final String TWO_PAIRS = "Two pairs";
	private static final String NOT_TWO_PAIRS = "Not two pairs";

  public static void main(String[] args) {
  
  	Scanner in = new Scanner(System.in);
  
  	int first, second, third, fourth, swap;
  	first = second = third = fourth = swap = 0;
  	
  	System.out.print("Enter first integer: ");
  	first = in.nextInt(); 
  	
  	System.out.print("Enter second integer: ");
  	second = in.nextInt(); 
  	
  	if (first > second) {
  		swap = first;
  		first = second;
  		second = swap;  
  	} 
  	
  	System.out.print("Enter third integer: ");
  	third = in.nextInt();
  	
  	if (second > third) {
  		swap = second;
  		second = third;
  		third = swap;  
  	} 
  	 
  	if (first > second) {
  		swap = first;
  		first = second;
  		second = swap;  
  	} 
  	
  	System.out.print("Enter fourth integer: ");
  	fourth = in.nextInt(); 
  	
  	if (third > fourth) {
  		swap = third;
  		third = fourth;
  		fourth = swap;  
  	} 
  	
  	if (second > third) {
  		swap = second;
  		second = third;
  		third = swap;  
  	} 
  	 
  	if (first > second) {
  		swap = first;
  		first = second;
  		second = swap;  
  	} 
  	
  	
  	if (first == second && third == fourth) {
  		System.out.println(TWO_PAIRS);
  	} else {
  	  System.out.println(NOT_TWO_PAIRS);
  	}

		in.close();

		
  }

}
