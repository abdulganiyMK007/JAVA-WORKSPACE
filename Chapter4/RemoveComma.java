package Chapter4;

import java.util.Scanner;



/*
Write a program that reads a number between 1,000 and 999,999 from the user, where the user enters a comma in the input. Then print the number without a comma. Here is a sample dialog; the user input is in color: Please enter an integer between 1,000 and 999,999: 23,456 23456 Hint: Read the input as a string. Measure the length of the string. Suppose it contains n characters. Then extract substrings consisting of the first n – 4 characters and the last three characters.
*/

public class RemoveComma {

  public static void main(String[] args) {
  	String num = "";
  	Scanner sc = new Scanner(System.in);
  	
  	System.out.println("Enter a number between 1,000 and 999,999.");
  	
  	while (true) {
  		System.out.print("Enter a number: ");
  		num = sc.nextLine();
  		
  		if (num.length() < 5 || num.length() > 7)
  			continue;
  		if (num.equals("")) break;
  		
  		num = num.substring(0, num.length() - 4) + num.substring(num.length() - 3);
  		System.out.println("ANSWER: "+ num);
  		
  	}

			sc.close();
  }

}
