package Chapter7;
import java.util.Scanner;

/*
Giving change. Implement a program that directs a cashier how to give change. 

The program has two inputs: the amount due and the amount received from the customer. 

Display the dollars, quarters, dimes, nickels, and pennies that the customer should receive in return. In order to avoid roundoff errors, the program user should supply both amounts in pennies, for example 274 instead of 2.74.
*/
public class GivingChange {

	public static final double DOLLAR_H = 25;
	public static final double QUARTER_H = 25;
	public static final double DIME_H = 10;
	public static final double NICKEL_H = 5;  
	public static final double PENNY_H = 1;

  public static void main(String[] args) {
  	Scanner in = new Scanner(System.in);
  	
  	System.out.print("Enter amount due: ");
  	int due = in.nextInt();
  	
  	System.out.print("Enter amount received: ");
  	int payment = in.nextInt();
  	
  	int change = payment - due;
  	
  	System.out.println(change);
  	
  	
  	
  	in.close();
  }

}
