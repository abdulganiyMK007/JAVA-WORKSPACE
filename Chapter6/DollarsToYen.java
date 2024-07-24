package Chapter6;

import java.util.Scanner;
/*
Currency conversion. Write a program that asks the user to type today’s price for one dollar in Japanese yen, then reads U.S. dollar values and converts each to yen. Use 0 as a sentinel.
*/
public class DollarsToYen {

	private static final double SENTINEL = 0;
	
  public static void main(String[] args) {
  	Scanner in = new Scanner(System.in);
  	
  	System.out.print("Enter price of DOLLAR on YEN? ");
  	double dollarPerYen = in.nextDouble();
  	
  	
  	double amount = SENTINEL;
  	while (true) {
  		System.out.print("Enter amount in dollar: ");
  		amount = in.nextDouble();
  		
  		if (amount == SENTINEL) break;
  		System.out.println("HERE");
  		
  		System.out.printf("$ %f = %.2f yen\n", amount, (amount * dollarPerYen));
  		
  	}


		in.close();
  }

}
