package Chapter5;

import java.util.Scanner;



/*
Write a program that reads a word, compares the first and second half of the word, and prints “first and second half same” or “first and second half different”. If the length of the word is odd, ignore the middle letter.
*/
public class CompareHalvedString {

  public static void main(String[] args) {
  	Scanner in = new Scanner(System.in);
  	String str = "";
  	int put = 0;
  	
  	System.out.print("Enter a string: ");
		if (in.hasNextLine()) {
			str = in.nextLine();
  		if (str.length() % 2 != 0) put++;
  		
  		if (str.substring(0, str.length() / 2).equals(str.substring(str.length() / 2 + put))) {
  			System.out.println("first and second half same");
  		} else {
  			System.out.println("first and second half different");
  		}
  	} else {
		 	System.out.print("Not a string");
		}

		in.close();
  }

}
