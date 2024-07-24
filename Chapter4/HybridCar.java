package Chapter4;

import java.util.Scanner;

/*
Write a program that helps a person decide whether to buy a hybrid car. Your program’s inputs should be: 

• The cost of a new car 
• The estimated miles driven per year 
• The estimated gas price 
• The efficiency in miles per gallon 
• The estimated resale value after 5 years

Compute the total cost of owning the car for five years. (For simplic ity, we will not take the cost of financing into account.) Obtain realistic prices for a new and used hybrid and a comparable car from the Web. 

Run your program twice, using today’s gas price and 15,000 miles per year. 
Include pseudocode and the program runs with your assignment.
*/


public class HybridCar {

	private static final double NUM_OF_YEARS = 5;

  public static void main(String[] args) {
  
  	Scanner in = new Scanner(System.in);
  	
  	double cosOfCar, milesDrivenPerYear, estimatedGasPrice, carEfficiency, costOfResale, totalCostForNumYears;
  	
  	cosOfCar = milesDrivenPerYear = estimatedGasPrice = carEfficiency = costOfResale = totalCostForNumYears = 0;

		System.out.print("Enter the cost of a new car: ");
		cosOfCar = in.nextDouble();
		
		System.out.print("Enter the estimated miles driven per year: ");
		milesDrivenPerYear = in.nextDouble();
		
		System.out.print("Enter the estimated gas price : ");
		estimatedGasPrice = in.nextDouble();
		
		System.out.print("Enter the efficiency in miles per gallon: ");
		carEfficiency = in.nextDouble();
		
		System.out.print("Enter the estimated resale value after "+ NUM_OF_YEARS +" years: ");
		costOfResale = in.nextDouble();
		
		totalCostForNumYears = cosOfCar + (milesDrivenPerYear * NUM_OF_YEARS * estimatedGasPrice / carEfficiency) - costOfResale;
		
		System.out.println("The total cost of owning the car for "+ NUM_OF_YEARS +" years: "+ totalCostForNumYears);
		
		in.close();
		
  }

}
