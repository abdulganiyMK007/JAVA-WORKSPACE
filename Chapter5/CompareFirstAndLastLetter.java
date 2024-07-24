package Chapter5;

import java.util.Scanner;

/*
Write a program that reads a string, compares the first and last letter, and and prints “first and last letter same” or “first and last letter different”.
*/

public class CompareFirstAndLastLetter {

  public static void main(String[] args) {
  
  	Scanner in = new Scanner(System.in);
  	String str = "";
  	
		System.out.print("Enter a string: ");
		if (in.hasNextLine()) {
		 	str = in.nextLine();
		 	if (str.charAt(0) == str.charAt(str.length() - 1)) {
		 		System.out.print("First and last letter are same");
				} else {
					System.out.print("First and last letter are different");
				}
		} else {
		 	System.out.print("Not a string");
		}
		
		in.close();
  }

}
