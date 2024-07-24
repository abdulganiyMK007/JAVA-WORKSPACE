package Chapter4;

import java.util.Scanner;

/*
The following pseudocode describes how a bookstore computes the price of an order from the total price and the number of the books that were ordered. 

Read the total book price and the number of books. 

Compute the tax (7.5 percent of the total book price). 

Compute the shipping charge ($2 per book). 

The price of the order is the sum of the total book price, the tax, and the shipping charge.

Print the price of the order. 

Translate this pseudocode into a Java program.
*/

public class BookStore {

	private static final double TAX_RATE = 7.5 / 100;
	private static final double SHIPPING_CHARGE_PER_BOOK = 2.0;
	
	public static void main(String[] args) {
	
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter the total book price: ");
		double totalBookPrice = in.nextDouble();
		
		System.out.print("Enter the number of books: ");
		double numberOfBooks = in.nextDouble();
	
		double priceOfOrder = totalBookPrice - totalBookPrice * TAX_RATE - numberOfBooks * SHIPPING_CHARGE_PER_BOOK;
		
		System.out.printf("Price of order: %.2f", priceOfOrder);
		
		in.close();
		
	}




}
