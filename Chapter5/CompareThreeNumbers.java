package Chapter5;
import java.util.Scanner;
/*
Write a program that reads three numbers and prints “increasing” if they are in increasing order, “decreasing” if they are in decreasing order, and “neither” otherwise. Here, “increasing” means “strictly increasing”, with each value larger than its pre decessor. The sequence 3 4 4 would not be considered increasing.
*/

public class CompareThreeNumbers {

	//private enum Order {}

  public static void main(String[] args) {
  
  	Scanner in = new Scanner(System.in);
  	
  	int firstInt, secondInt, thirdInt;
  	firstInt = secondInt = thirdInt = 0;
  	
  	System.out.print("Enter first integer: ");
  	firstInt = in.nextInt(); 
  	
  	System.out.print("Enter second integer: ");
  	secondInt = in.nextInt(); 
  	
  	System.out.print("Enter third integer: ");
  	thirdInt = in.nextInt(); 


		if (firstInt > secondInt) {
			if (secondInt > thirdInt) {
				System.out.println("Decreasing");
			} else {
				System.out.println("Neither");
			}
		} else {
			if (secondInt < thirdInt) {
				System.out.println("Increasing");
			} else {
				System.out.println("Neither");
			}
		}
		
		in.close();
  }

}
