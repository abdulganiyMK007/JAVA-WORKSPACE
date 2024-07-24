package Chapter6;

import java.util.Scanner;
/*
Write a program that reads a number and prints all of its remainder digits: Print the remainder number % 2, then replace the number with number / 2. Keep going until the number is 0. For example, if the user provides the input 13, the output should be 1 0
*/
public class Binary {

  public static void main(String[] args) {
  	Scanner in = new Scanner(System.in);
  	
  
  	System.out.print("Enter an integer: ");
  	int input = in.nextInt();
  	
  	String remainder = "";
  	String binary = "";
  	
  	while (input > 0) {
  		remainder += (input % 2);
  		input /= 2;  
  	}
  
		for (int i = remainder.length(); i > 0; i--) {
  		binary += remainder.charAt(i - 1);
  	}
		
		System.out.println(binary);
		in.close();
		
  }

}
