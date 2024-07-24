package Chapter5;
import java.util.Scanner;

/*
When you use an automated teller machine (ATM) with your bank card, you need to use a personal identification number (PIN) to access your account. If a user fails more than three times when entering the PIN, the machine will block the card. Assume that the user’s PIN is “1234” and write a program that asks the user for the PIN no more than three times, and does the following: 

• If the user enters the right number, print a message saying, “Your PIN is correct”, and end the program. 

• If the user enters a wrong number, print a message saying, “Your PIN is incorrect” and, if you have asked for the PIN less than three times, ask for it again. 

• If the user enters a wrong number three times, print a message saying “Your bank card is blocked” and end the program.
*/

public class PinSimulation {

  public static void main(String[] args) {
  	
  	String pin = "1234";
  	Scanner in = new Scanner(System.in);
  	System.out.print("Enter PIN: ");
  	
  	if (!pin.equalsIgnoreCase(in.next())) {
  		System.out.println("Your PIN is incorrect");
  		System.out.print("Enter another PIN: ");
  		
  		
  		if (!pin.equalsIgnoreCase(in.next())) {
  			System.out.println("Your PIN is incorrect");
  		System.out.print("Enter another PIN: ");
  		
  		
  			if (!pin.equalsIgnoreCase(in.next())) {
  			  System.out.println("Your bank card is blocked");
  			} else {
  			  System.out.println("Your PIN is correct");
  			}
  		} else {
  		  System.out.println("Your PIN is correct");
  		}
  	} else {
  	  System.out.println("Your PIN is correct");
  	}

		in.close();
  }
  

}
