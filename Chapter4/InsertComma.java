package Chapter4;

import java.util.Scanner;


/*
Write a program that reads a number between 1,000 and 999,999 from the user and prints it with a comma separating the thousands;
*/
public class InsertComma {

  public static void main(String[] args) {
  	String num = "";
  	Scanner sc = new Scanner(System.in);
  	
  	System.out.println("Enter a number between 1000 and 999999.");
  	
  	while (true) {
  		System.out.print("Enter a number: ");
  		num = sc.nextLine();
  		
  		if (num.length() < 4 || num.length() > 6)
  			continue;
  		if (num.equals("")) break;
  		
  		num = num.substring(0, num.length() - 3) +","+ num.substring(num.length() - 3);
  		System.out.println("ANSWER: "+ num);
  		
  	}
  	
  	sc.close();

  }

}
