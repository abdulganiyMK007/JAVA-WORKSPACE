package Chapter4;

import java.util.Scanner;
/*
A video club wants to reward its best members with a discount based on the member’s number of movie rentals and the number of new members referred by the member. The discount is in percent and is equal to the sum of the rentals and the referrals, but it cannot exceed 75 percent. (Hint: Math.min.) Write a program DiscountCalculator to calculate the value of the discount. 

Here is a sample run: 

Enter the number of movie rentals: 56 
Enter the number of members referred to the video club: 3 
The discount is equal to:  59.00 percent.
*/

public class DiscountCalculator {

	private static final int MAX_DISCOUNT = 75;
	
  public static void main(String[] args) {
  	Scanner in = new Scanner(System.in);

		System.out.print("Enter the number of movie rentals: ");
		double nRentals = in.nextDouble();
		
		System.out.print("Enter the number of members referred to the video club: ");
		double nReferrals = in.nextDouble();
		
		int discount = (int) Math.min(MAX_DISCOUNT, nRentals + nReferrals);
		
		System.out.println("The discount is equal to: "+ discount +" percent.");
		
		in.close();

  }

}
